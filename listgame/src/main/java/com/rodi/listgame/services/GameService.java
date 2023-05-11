package com.rodi.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodi.listgame.dto.GameMinDTO;
import com.rodi.listgame.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    GameRepository gameRepository;


    public List<GameMinDTO> findAll(){
        //transforming into a stream, creating an instance of GameMinDTO, transforming into a list
        //gameRepository.findAll().stream().map( x -> new GameMinDTO(x)).toList(); --> Another way to do it using lambda function without simplification
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }
}
