package com.novizit.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


public class RestClient<T> {

    private final RestTemplate restTemplate;
    private final HttpHeaders headers;
    private final Class<T> responseType;
    
    public RestClient(RestTemplate restTemplate, HttpHeaders headers, Class<T> responseType) {
        this.restTemplate = restTemplate;
        this.headers = headers;
        this.responseType = responseType;
    }
    
    public T callEndpoint(String url, HttpMethod method, HttpEntity<?> requestEntity) {
        ResponseEntity<T> responseEntity = restTemplate.exchange(url, method, requestEntity, responseType);
        return responseEntity.getBody();
    }
    
}
