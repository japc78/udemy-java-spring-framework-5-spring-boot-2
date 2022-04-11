package com.japcdev.springboot.app.springbootweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("title", "Send params to HTTP GET request");
    return "params/index";
  }


  @GetMapping("/one-param")
  public String params(@RequestParam(name = "text", required = false, defaultValue = "Value default" ) String text, Model model) {

    model.addAttribute("title", "Get params to HTTP GET request");
    model.addAttribute("result", "The request params is: " + text);

    return "params/view";
  }


  @GetMapping("/multiple-params")
  public String params(@RequestParam String hello, @RequestParam Integer number, Model model) {

    model.addAttribute("title", "Get params to HTTP GET request");
    model.addAttribute("result", "The request params is: " + hello + ", the number is: " + number);

    return "params/view";
  }


  @GetMapping("/multiple-params-request")
  public String params(HttpServletRequest request, Model model) {

    String hello = request.getParameter("hello");
    Integer number = null;

    try {
      number = Integer.parseInt(request.getParameter("number")) ;
    } catch (NumberFormatException e) {
      number = 0;
    }

    model.addAttribute("title", "Get params to HTTP GET request");
    model.addAttribute("result", "The request params is: " + hello + ", the number is: " + number);

    return "params/view";
  }
}
