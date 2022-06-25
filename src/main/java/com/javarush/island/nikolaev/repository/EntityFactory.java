package com.javarush.island.nikolaev.repository;

import com.javarush.island.nikolaev.entity.map.Cell;
import com.javarush.island.nikolaev.entity.organizms.Organism;
import com.javarush.island.nikolaev.entity.organizms.animals.herbivores.Horse;
import com.javarush.island.nikolaev.entity.organizms.animals.predators.Wolf;
import com.javarush.island.nikolaev.entity.organizms.plants.Grass;
import com.javarush.island.nikolaev.util.EntityFactoryData;
import com.javarush.island.nikolaev.util.Probably;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class EntityFactory implements Factory {

    //TODO It is required that TYPES are automatically generated based on classes (not abstract) that are located in
    // entity/organizations/predators/;
    // entity/organizations/plants/
    // entity/organizations/herbivores/
    private static final Class<?>[] TYPES = {Grass.class, Wolf.class, Horse.class};


    private static final Organism[] PROTOTYPES = EntityFactoryData.createPrototypes(TYPES);

    public EntityFactory() {

    }

    @Override
    public Cell createRandomCell() {
        Map<Type, Set<Organism>> residents = new ConcurrentHashMap<>();
        boolean fill = Probably.get(50); //TODO need config
        if (fill) {
            for (Organism prototype : PROTOTYPES) {
                Type type = prototype.getClass();
                boolean born = Probably.get(50); //TODO need config
                if (born) {
                    residents.putIfAbsent(type, new HashSet<>());
                    Set<Organism> organisms = residents.get(prototype.getClass());
                    int currentCount = organisms.size();
                    int max = prototype.getLimit().getMaxCount() - currentCount;
                    int count = Probably.random(0, max);
                    for (int i = 0; i < count; i++) {
                        organisms.add(Organism.clone(prototype));
                    }

                }
            }
        }
        return new Cell(residents);
    }
    private void getAllClassesOrganizm (String packageName){

    }
    @Override
    public List<Organism> getAllPrototypes() {
        return Arrays.asList(PROTOTYPES);
    }

    @Override
    public String toString() {
        return "EntityFactory{" +
                "prototypes=" + Arrays.toString(PROTOTYPES) +
                '}';
    }
}
