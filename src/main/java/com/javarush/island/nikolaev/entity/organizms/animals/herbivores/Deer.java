package com.javarush.island.nikolaev.entity.organizms.animals.herbivores;

import com.javarush.island.nikolaev.abstraction.annotations.Setting;
import com.javarush.island.nikolaev.entity.organizms.Limit;
import com.javarush.island.nikolaev.entity.organizms.animals.herbivores.Herbivore;

@Setting(name = "Deer", icon = "\uD83D\uDC03", maxWeight = 500, maxCount = 5, maxSpeed = 2, maxFood = 80)

public class Deer extends Herbivore {

    public Deer (String name, String icon, double weight, Limit limit) {super(name, icon, weight, limit);}
}
