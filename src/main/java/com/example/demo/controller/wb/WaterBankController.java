package com.example.demo.controller.wb;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
@RequestMapping(value = "/waterBank")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class WaterBankController {

    @GetMapping("/")
    public String getHome() {
        log.info("getHome()");

        return "waterBank/home";
    }
}
