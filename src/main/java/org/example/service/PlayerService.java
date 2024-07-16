package org.example.service;

import org.example.model.Player;
import org.example.repository.IPlayerRepo;
import org.example.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IPlayerService{
@Autowired
private PlayerRepo playerRepo;
    @Override
    public List<Player> findAll() {
        return playerRepo.findAll();
    }

    @Override
    public Player findById(Long id) {
        Player player = playerRepo.findById(id);
        if(player==null){
            return null;
        }
        return playerRepo.findById(id);
    }
}
