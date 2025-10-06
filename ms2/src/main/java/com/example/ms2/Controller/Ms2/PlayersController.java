package com.example.ms2.Controller.Ms2;

import com.example.ms2.Entity.Players;
import com.example.ms2.Service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayersController {

    @Autowired
    PlayersService playersService;

    @GetMapping
    public List<Players> getAllPlayers() {
        return playersService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Players playersById(@PathVariable int id) {
        return playersService.getPlayersById(id);
    }

    @PostMapping
    public Players addPlayers(@RequestBody Players players) {
        return playersService.addPlayers(players);
    }

    @DeleteMapping("/{id}")
    public void deletePlayers(@PathVariable int id) {
        playersService.deletePlayers(id);
    }
}