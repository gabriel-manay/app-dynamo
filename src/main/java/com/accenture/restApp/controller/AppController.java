package com.accenture.restApp.controller;

import com.accenture.restApp.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class AppController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @PostMapping("/validate")
    public Card getBoolean(@RequestBody Card card){
        if(Objects.equals(card.getCardNumber(), "1234567890000000") && Objects.equals(card.getBank(), "Galicia")){
            card.setValid("true");
        } else {
            card.setValid("false");
        }
        return card;
    }
}
