package com.ejemplo.controlador;

import com.ejemplo.client.ApiClient;
import com.ejemplo.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class PostController {

    private final ApiClient apiClient;

    public PostController(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    // Permitimos solicitudes CORS desde cualquier origen
    @CrossOrigin(origins = "*")  // Configuración CORS
    @GetMapping("/post")
    public Mono<Post> getPost() {
        return apiClient.getPost();
    }
}
