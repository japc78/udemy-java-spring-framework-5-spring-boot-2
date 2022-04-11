package com.japcdev.springboot.app.springbootweb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.japcdev.springboot.app.springbootweb.models.User;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
  @Value("${homeController.home.title}")
  private String textHome;

  @Value("${homeController.profile.title}")
  private String textProfile;

  @Value("${homeController.list.title}")
  private String textList;


  // @RequestMapping(value="/home",  method = RequestMethod.GET)
  // @GetMapping(value="/home")
  @GetMapping({"/", "/index", "/home"})
  public String home(Model model) {
    // model.addAttribute("title", "Hello Spring!");
    model.addAttribute("title", textHome);
    return "index";
  }

  @GetMapping("/profile")
  public String profile(Model model) {
    User user = new User();
    user.setName("Juan Antonio");
    user.setSurname("Pavon Carmona");
    user.setEmail("japc.dev@gmail.com");

    model.addAttribute("user", user);
    // model.addAttribute("title", "User Profile: ".concat(user.getName()));
    model.addAttribute("title", textProfile.concat(user.getName()));

    return "profile";
  }


  @RequestMapping("/list")
  public String list (Model model) {
    List<User> userList = new ArrayList<>();

    userList.add(new User("User1", "User1Surname", "user1@test.com"));
    userList.add(new User("User2", "User2Surname", "user2@test.com"));
    userList.add(new User("User3", "User3Surname", "user3@test.com"));

    // model.addAttribute("title", "User List");
    model.addAttribute("title", textList);
    model.addAttribute("userList", userList);

    return "list";
  }


  @ModelAttribute("userList2")
  public List<User> list2() {
    List<User> userList = Arrays.asList(
      new User("User1", "User1Surname", "user1@test.com"),
      new User("User2", "User2Surname", "user2@test.com"),
      new User("User3", "User3Surname", "user3@test.com")
    );

    return userList;
  }
}
