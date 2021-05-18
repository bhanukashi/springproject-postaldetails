package com.example.postaldetail.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Logger;

@Service
public class RestClientService {

    private final RestTemplate restTemplate;

    @Autowired
    public RestClientService(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    public String getRequest(
            String url, MultiValueMap<String, String> requestMap) throws URISyntaxException {

        URI uri = new URI(url);

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUri(uri);
        requestMap.forEach(uriComponentsBuilder::queryParam);

        Logger logger = Logger.getLogger("RestClientService.Logger");
        logger.info("URI : " + uriComponentsBuilder.toUriString());

        return restTemplate.getForObject(uriComponentsBuilder.toUriString(), String.class);
    }
}
