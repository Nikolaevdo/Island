package com.javarush.island.nikolaev.entity.organizms.animals.herbivores;

import com.javarush.island.nikolaev.abstraction.annotations.Setting;
import com.javarush.island.nikolaev.entity.organizms.Limit;
import com.javarush.island.nikolaev.entity.organizms.animals.herbivores.Herbivore;

@Setting(name = "Deer", icon = "\uD83D\uDC03", maxWeight = 300, maxCount = 20, maxSpeed = 4, maxFood = 50)

public class Duck  extends Herbivore {

    public Duck(String name, String icon, double weight, Limit limit) {super(name, icon, weight, limit);}
}
