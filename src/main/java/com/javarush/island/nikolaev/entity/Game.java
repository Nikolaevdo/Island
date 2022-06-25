package com.javarush.island.nikolaev.entity;

import com.javarush.island.nikolaev.entity.map.GameMap;
import com.javarush.island.nikolaev.repository.Factory;
import com.javarush.island.nikolaev.view.View;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Game {

    private final GameMap gameMap;
    private final Factory entityFactory;
    private final View view;

}
