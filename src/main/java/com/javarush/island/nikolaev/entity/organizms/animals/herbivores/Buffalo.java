package com.javarush.island.nikolaev.entity.organizms.animals.herbivores;

import com.javarush.island.nikolaev.abstraction.annotations.Setting;
import com.javarush.island.nikolaev.entity.map.Cell;

import com.javarush.island.nikolaev.entity.organizms.Limit;

@Setting(name = "Buffalo", icon = "\uD83D\uDC03", maxWeight = 500, maxCount = 5, maxSpeed = 2, maxFood = 80)

public class Buffalo extends Herbivore{

    public  Buffalo (String name, String icon, double weight, Limit limit) {super(name, icon, weight, limit);}



}
