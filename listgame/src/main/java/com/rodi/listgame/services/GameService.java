package com.rodi.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodi.listgame.entities.Game;
import com.rodi.listgame.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    GameRepository gameRepository;


    public List<Game> findAll(){
        return gameRepository.findAll();
    }
}
