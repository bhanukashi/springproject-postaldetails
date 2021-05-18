package com.example.postaldetail.models.postaldetail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostalDetailResponse {

    @JsonProperty("Message")
    String message;

    @JsonProperty("Status")
    String status;

    @JsonProperty("PostOffice")
    List<PostOffice> postOffice = new ArrayList<>();
}
