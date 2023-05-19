package com.example.dtxeyelogin2.controller;

import com.example.dtxeyelogin2.dto.SessionUser;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
//@Slf4j
public class HomeController {

    private final HttpSession httpSession;
    @RequestMapping("/home")
    public String homePage(Model model,HttpSession httpSession){
        SessionUser user = (SessionUser)httpSession.getAttribute("user");
        if(user != null) {
            model.addAttribute("userName", user.getName());
            model.addAttribute("userEmail", user.getEmail());
            model.addAttribute("userRole", user.getRole());

        }
        return "home";
    }
}
