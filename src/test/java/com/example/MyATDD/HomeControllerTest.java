package com.example.MyATDD;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class HomeControllerTest {
    public static final Logger log =  LoggerFactory.getLogger(HomeControllerTest.class);
    @Autowired
    private TestRestTemplate template;

    @Test
    public void home() {
        ResponseEntity<String> response = template.getForEntity("", String.class);
        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        log.debug("body : {} ", response.getBody());
    }
}
