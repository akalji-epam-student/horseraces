package com.epam.horseracesjava.service;

import com.epam.horseracesjava.domain.HorseEntity;

import java.util.Collection;

public interface HorseService {
    Collection<HorseEntity> findOneByName(String name);
    Collection<HorseEntity> findAllByRiderName(String name);
    Collection<HorseEntity> findAllByBreedName(String name);
    Collection<HorseEntity> getAllHorses();
    HorseEntity getRandomHorse();
}
