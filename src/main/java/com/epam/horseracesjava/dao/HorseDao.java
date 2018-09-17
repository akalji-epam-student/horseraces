package com.epam.horseracesjava.dao;

import com.epam.horseracesjava.domain.HorseEntity;

import java.util.Collection;

public interface HorseDao {
    Collection<HorseEntity> findOneByName(String name);
    Collection<HorseEntity> findAllByRiderName(String name);
    Collection<HorseEntity> findAllByBreedName(String name);
    Collection<HorseEntity> getAllHorses();
    HorseEntity getRandomHorse();
}
