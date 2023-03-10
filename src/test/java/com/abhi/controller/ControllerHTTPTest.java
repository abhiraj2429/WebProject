package com.abhi.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
 class ControllerHTTPTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
     void getHello() throws Exception{
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/", String.class);
        assertThat(responseEntity.getBody()).isEqualTo("Greetings from Abhi !!!");
    }
}
