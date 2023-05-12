package com.rodi.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodi.listgame.dto.GameListDTO;
import com.rodi.listgame.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }
    
}
