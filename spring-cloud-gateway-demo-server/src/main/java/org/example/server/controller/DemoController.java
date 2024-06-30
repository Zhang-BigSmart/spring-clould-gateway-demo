package org.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zzh
 * create at:  2024/2/26
 */
@RestController
public class DemoController {

    @GetMapping("/test/{id}")
    public String get(@PathVariable String id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id;
    }
}
