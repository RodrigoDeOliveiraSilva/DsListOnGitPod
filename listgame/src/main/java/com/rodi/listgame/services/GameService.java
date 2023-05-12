package com.rodi.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodi.listgame.dto.GameDTO;
import com.rodi.listgame.dto.GameMinDTO;
import com.rodi.listgame.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        //gameRepository.findAll().stream().map( x -> new GameMinDTO(x)).toList(); --> Another way to do it using lambda function without simplification
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList(); //transforming into a stream, creating an instance of GameMinDTO, transforming into a list
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        return new GameDTO(gameRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listGameId){
        return gameRepository.searchByList(listGameId).stream().map(GameMinDTO::new).toList();
    }
}
