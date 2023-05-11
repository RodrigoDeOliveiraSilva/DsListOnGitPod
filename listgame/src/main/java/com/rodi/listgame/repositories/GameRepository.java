package com.rodi.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodi.listgame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
