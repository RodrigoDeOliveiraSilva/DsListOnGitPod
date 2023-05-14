package com.rodi.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodi.listgame.dto.GameListDTO;
import com.rodi.listgame.dto.GameMinDTO;
import com.rodi.listgame.projections.GameMinProjection;
import com.rodi.listgame.repositories.GameListRepository;
import com.rodi.listgame.repositories.GameRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }

    public void move(Long listGameId, int sourceIndex, int destinatIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listGameId);
        GameMinProjection objGame = list.remove(sourceIndex); // Remove and save to a variable
        list.add(destinatIndex, objGame); // Adding the object in the variable in the new position of the list
    }
    
}
