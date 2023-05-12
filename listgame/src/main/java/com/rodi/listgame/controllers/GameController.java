package com.rodi.listgame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodi.listgame.dto.GameDTO;
import com.rodi.listgame.dto.GameMinDTO;
import com.rodi.listgame.services.GameService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/games/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
    
}
