package com.ejemplo.cliente;

import com.ejemplo.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiClient {

    private final WebClient webClient;

    public ApiClient() {
        this.webClient = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public Mono<Post> getPost() {
        return webClient.get()
                .uri("/posts/1")
                .retrieve()
                .bodyToMono(Post.class);
    }
}
