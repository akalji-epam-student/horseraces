package com.epam.horseraces.dao.impl;

import com.epam.horseraces.dao.HorseDao;
import com.epam.horseraces.domain.HorseEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HorseDaoHardcodeImpl implements HorseDao {

    private List<HorseEntity> horses;

    @Override
    public Collection<HorseEntity> findOneByName(String name) {
        return horses.stream()
                .filter(horse -> name.equals(horse.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<HorseEntity> findAllByRiderName(String name) {
        return horses.stream()
                .filter(horse -> name.equals(horse.getRider().getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<HorseEntity> findAllByBreedName(String name) {
        return horses.stream()
                .filter(horse -> name.equals(horse.getBreed().getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<HorseEntity> getAllHorses() {
        return horses;
    }

    @Override
    public HorseEntity getRandomHorse() {
        return horses.get(new Random().nextInt(horses.size()));
    }

    /**
     * Setter for horses.
     *
     * @param horses value
     */
    public void setHorses(List<HorseEntity> horses) {
        this.horses = horses;
    }
}
