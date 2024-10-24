package com.diallodev.observabilityspringgrafana.post;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.Collection;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final RestClient restClient;

    public PostController(RestClient.Builder restClient) {
        this.restClient = restClient
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    @GetMapping
    public Collection<Post> getPosts() {
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<Collection<Post>>() {
                });

    }
}
