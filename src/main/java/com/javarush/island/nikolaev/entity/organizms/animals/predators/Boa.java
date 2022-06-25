package com.javarush.island.nikolaev.entity.organizms.animals.predators;

import com.javarush.island.nikolaev.abstraction.annotations.Setting;
import com.javarush.island.nikolaev.entity.organizms.Limit;


@Setting(name = "Boa", icon = "\uD83D\uDC0D", maxWeight = 50, maxCount = 30, maxSpeed = 3, maxFood = 8)

public class Boa extends Predator {

    public Boa (String name, String icon, double weight, Limit limit) {super(name, icon, weight, limit);
    }
}
