package com.japcdev.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class ExampleRouteVariablesController {

  @GetMapping("/")
  public String Index(Model model) {
    model.addAttribute("title", "Request params of the route (@PathVariable)");
    return "variables/index";
  }


  @GetMapping("/string/{text}")
  public String variables(@PathVariable String text, Model model) {
    model.addAttribute("title", "Request params of the route (@PathVariable)");

    model.addAttribute("result", "The text sending in the route is: " + text);

    return "variables/view";
  }


  @GetMapping("/string/{text}/{number}")
  public String variables(@PathVariable String text, @PathVariable Integer number, Model model) {
    model.addAttribute("title", "Request params of the route (@PathVariable)");

    model.addAttribute("result", "The text sending in the route is: "
      + text
      + ", and number: "
      + number);

    return "variables/view";
  }
}
