package org.example.controller;

import org.example.model.Player;
import org.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @GetMapping("")
    public String showList( ){
        return "/list";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id,Model model){
        Player player = playerService.findById(id);
        if(player==null){
            return "redirect:/player";
        }
        model.addAttribute("player",player);
        return "/detail";

    }

}


