package com.example.perfect.controller;

import com.example.perfect.model.User;
import com.example.perfect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Возвращает шаблон login.html
    }

    @GetMapping("/")
    public String welcomePage() {
        return "welcome"; // Путь к файлу welcome.html
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Путь к файлу dashboard.html
    }
    @GetMapping("/error")
    public String handleError() {
        return "error"; // Путь к файлу error.html
    }
}
