package com.javarush.island.nikolaev.entity.organizms.animals.herbivores;

import com.javarush.island.nikolaev.abstraction.annotations.Setting;
import com.javarush.island.nikolaev.entity.organizms.Limit;
import com.javarush.island.nikolaev.entity.organizms.animals.herbivores.Herbivore;

@Setting(name = "Goat", icon = "\uD83D\uDC10", maxWeight = 60, maxCount = 140, maxSpeed = 3, maxFood = 10)

public class Goat extends Herbivore {

    public Goat (String name, String icon, double weight, Limit limit) {super(name, icon, weight, limit);}

}
