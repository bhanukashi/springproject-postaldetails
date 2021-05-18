package com.example.postaldetail.controllers;

import com.example.postaldetail.services.IndianPostalDetailsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class PostalDetail {

    @Autowired
    private IndianPostalDetailsService postalDetailsService;

    @GetMapping(path = "/getPostOfficeNames")
    public List<String> gePostOfficeNames(String pinCode) throws URISyntaxException, JsonProcessingException {
        return IndianPostalDetailsService.collectInfo(postalDetailsService.getPONamesFromPin(pinCode));
    }

    @GetMapping(path = "/getPinCode")
    public List<String> gePinCode(String area, @RequestParam(required = false) String district) throws URISyntaxException, JsonProcessingException {
        Logger logger = Logger.getLogger("PostalDetail.Logger");
        if (!StringUtils.isEmpty(district)) {
            logger.info("Filtering through District: " + district);
            return IndianPostalDetailsService.collectInfo(postalDetailsService.getPinFromPOName(area), district);
        }
        logger.info("District field is not present");
        return IndianPostalDetailsService.collectInfo(postalDetailsService.getPinFromPOName(area));
    }
}
