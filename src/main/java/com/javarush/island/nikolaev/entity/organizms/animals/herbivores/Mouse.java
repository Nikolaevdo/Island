package com.javarush.island.nikolaev.entity.organizms.animals.herbivores;


import com.javarush.island.nikolaev.abstraction.annotations.Setting;
import com.javarush.island.nikolaev.entity.organizms.Limit;

@Setting(name = "Mouse", icon = "\uD83D\uDC0E", maxWeight = 0.05, maxCount = 500, maxSpeed = 1, maxFood = 0.01)

public class Mouse extends Herbivore{

    public Mouse (String name, String icon, double weight, Limit limit) {
        super(name, icon, weight, limit);
    }
}
