package com.japcdev.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String redirectHome(){

    // Redirección al metodo index
    return "redirect:/app/index";
  }

  @GetMapping("/forward")
  public String ForwardHome(){

    //
    return "forward:/app/index";
  }


  @GetMapping("/external-url")
  public String redirectExternalUrl(){

    // Redirección al metodo index
    return "redirect:https://www.google.com";
  }
}
