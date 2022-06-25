package com.javarush.island.nikolaev.abstraction.entity;

import com.javarush.island.nikolaev.entity.map.Cell;

@FunctionalInterface
public interface Movable {

    @FunctionalInterface
    interface Finder {
        int getRating(Cell nextCell);
    }

    Cell move(Cell startCell);

}
