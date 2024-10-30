package com.laberit.sina.bootcamp.extra.awesomefinalproject.authenticatortest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/sina")
public class SinaController {

    private final SinaService sinaService;

    public SinaController(SinaService sinaService) {
        this.sinaService = sinaService;
    }

    @RequestMapping("/patient/1")
    public Mono<String> getPatientData() {
        return sinaService.getPatientData();
    }

}
