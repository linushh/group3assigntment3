package com.example.group3assignment3.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.group3assignment3.Respons;

@RestController
public class WebController {

    /* I denna metod tas ett namn in som en PathVariable och metoden returnerar
    då en hälsning och det namn som användaren angett
    */

    @GetMapping("/hello/{name}")
    public Respons helloName(@PathVariable String name) {
        return new Respons(name);
    }
}
