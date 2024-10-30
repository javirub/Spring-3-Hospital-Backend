package com.laberit.sina.bootcamp.extra.awesomefinalproject.authenticatortest;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class SinaService {

    private final WebClient sinaWebClient;

    public SinaService(Map<String, WebClient> webClients) {
        this.sinaWebClient = webClients.get("sina");
    }

    public Mono<String> getPatientData() {
        return sinaWebClient.get()
                .uri("https://sinades.laberit.com/sina-suite/ext/pap/api/v1/patients/1")
                .retrieve()
                .bodyToMono(String.class);
    }
}