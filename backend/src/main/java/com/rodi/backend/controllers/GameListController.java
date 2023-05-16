package com.rodi.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodi.backend.dto.GameListDTO;
import com.rodi.backend.dto.GameMinDTO;
import com.rodi.backend.dto.ReplacementDTO;
import com.rodi.backend.services.GameListService;
import com.rodi.backend.services.GameService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{gameListId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long gameListId){
        return gameService.findByList(gameListId);
    }

    @PostMapping(value = "/{gameListId}/replacement")
    public void move(@PathVariable Long gameListId, @RequestBody ReplacementDTO body){
        gameListService.move(gameListId,body.getSourceIndex(), body.getDestinatIndex());
    }
    
    
}
