package com.abhi.controller;

import org.springframework.http.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


public class ConsumerControllerClient {

    public void getEmployee() throws RestClientException{

        String baseUrl = "http://localhost:8091/employee";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = null;
        try{
            responseEntity = restTemplate.exchange(baseUrl, HttpMethod.GET,getHeaders(), String.class);

        }
        catch (Exception exception){
            System.out.println(exception);
        }

        System.out.println(responseEntity.getBody());

    }

    private static HttpEntity<?> getHeaders()  {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(httpHeaders);
    }
}
