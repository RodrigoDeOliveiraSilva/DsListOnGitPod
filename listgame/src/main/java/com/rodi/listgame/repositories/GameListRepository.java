package com.rodi.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodi.listgame.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
