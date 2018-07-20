package com.duorourou.reactive.practices.router;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRouterTest {

    @Autowired
    WebTestClient webClient;

    @Test
    public void shouldFindAUserByName() {
        webClient.get()
                .uri("/users/{name}", "James")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .acceptCharset(Charset.forName("utf-8"))
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
                .expectBody()
                .jsonPath("$.name")
                .isEqualTo("James")
                .jsonPath("$.address").isNotEmpty();
    }

}