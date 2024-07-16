package org.example.repository;

import org.example.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepo implements IPlayerRepo {
    private static final List<Player> list;
    static {
        list=new ArrayList<>();
        list.add(new Player(1,"Messi","2000/10/10","10 năm"," Tiền đạo"));
        list.add(new Player(2,"Ronaldo","2000/10/10","10 năm"," Tiền đạo"));
        list.add(new Player(3,"Neymar","2000/10/10","10 năm"," Tiền đạo"));
        list.add(new Player(4,"Beckam","2000/10/10","10 năm"," Tiền đạo"));
    }

    @Override
    public List<Player> findAll() {
        return list;
    }

    @Override
    public Player findById(Long id) {
        for (Player item: list){
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }

}
