package com.example.ms2.Service;

import com.example.ms2.Entity.Players;
import com.example.ms2.Repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayersService {

    @Autowired
    PlayersRepository playersRepository;


    public Players getPlayersById(int id) {
        return playersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Player bulunamadı"));
    }

    public List<Players> getAllPlayers(){
        return playersRepository.findAll();
    }

    public Players addPlayers(Players player){
       return playersRepository.save(player);
    }

    public void deletePlayers(int id){
            playersRepository.deleteById(id);
    }

}





