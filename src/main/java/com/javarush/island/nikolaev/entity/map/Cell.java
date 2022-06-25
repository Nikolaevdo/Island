package com.javarush.island.nikolaev.entity.map;

import com.javarush.island.nikolaev.entity.organizms.Organism;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

@Getter
@Setter
@RequiredArgsConstructor
public class Cell {

    private final Map<Type, Set<Organism>> residents;
    private final List<Cell> nextCell = new ArrayList<>();
    private final Lock lock = new ReentrantLock(true);

    @Override
    public String toString() {
        return getResidents().values().stream()
                .filter((list) -> list.size() > 0)
                .sorted((o1, o2) -> o2.size() - o1.size())
                .map(set -> set.stream().findAny().get().getClass().getSimpleName().substring(0, 1))
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}

