package com.rodi.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodi.backend.dto.GameDTO;
import com.rodi.backend.dto.GameMinDTO;
import com.rodi.backend.services.GameService;


@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
    
}
