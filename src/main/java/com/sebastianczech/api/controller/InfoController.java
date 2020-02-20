package com.sebastianczech.api.controller;

import com.sebastianczech.api.model.InfoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class InfoController {

    private static final String template = "info %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/info")
    public InfoModel greeting(@RequestParam(value = "name", defaultValue = "unknown") String name) {
        return new InfoModel(counter.incrementAndGet(), String.format(template, name));
    }

}
