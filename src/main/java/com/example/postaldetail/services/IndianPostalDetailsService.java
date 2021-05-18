package com.example.postaldetail.services;

import com.example.postaldetail.models.postaldetail.PostalDetailResponse;
import com.example.postaldetail.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class IndianPostalDetailsService {

    @Value("${url.pin}")
    private String pincodeUrl;
    @Value("${url.po}")
    private String poUrl;

    private final RestClientService clientService;

    @Autowired
    public IndianPostalDetailsService() {
        clientService = new RestClientService(new RestTemplateBuilder());
    }

    public PostalDetailResponse[] getPONamesFromPin(String pinCode) throws URISyntaxException, JsonProcessingException {
        return JsonUtils.fromJsonArray(clientService.getRequest(pincodeUrl.concat(pinCode), new LinkedMultiValueMap<>()), PostalDetailResponse[].class);
    }

    public PostalDetailResponse[] getPinFromPOName(String poName) throws URISyntaxException, JsonProcessingException {
        return JsonUtils.fromJsonArray(clientService.getRequest(poUrl.concat(poName), new LinkedMultiValueMap<>()), PostalDetailResponse[].class);
    }

    public static List<String> collectInfo(PostalDetailResponse[] postalDetailResponses) {
        List<String> collect = new ArrayList<>();
        Arrays.stream(postalDetailResponses).findFirst().flatMap(postalDetailResponse ->
                Optional.ofNullable(postalDetailResponse.getPostOffice())).ifPresent(postOffices ->
                postOffices.forEach(postOffice ->
                        collect.add(postOffice.getPincode() + ", " +
                                postOffice.getName() + ", " +
                                postOffice.getDistrict() + ", " +
                                postOffice.getState())));
        if (collect.isEmpty()) {
            collect.add("No record found !!!");
        }
        return collect;
    }

    public static List<String> collectInfo(PostalDetailResponse[] postalDetailResponses, String district) {
        List<String> collect = new ArrayList<>();
        Arrays.stream(postalDetailResponses).findFirst().flatMap(postalDetailResponse ->
                Optional.ofNullable(postalDetailResponse.getPostOffice())).ifPresent(postOffices ->
                postOffices.forEach(postOffice -> {
                    if (district.equalsIgnoreCase(postOffice.getDistrict()))
                        collect.add(postOffice.getPincode() + ", " +
                                postOffice.getName() + ", " +
                                postOffice.getDistrict() + ", " +
                                postOffice.getState());
                }));
        if (collect.isEmpty()) {
            collect.add("No record found !!!");
        }
        return collect;
    }
}
