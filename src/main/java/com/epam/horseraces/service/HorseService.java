package com.epam.horseraces.service;

import com.epam.horseraces.domain.HorseEntity;

import java.util.Collection;

public interface HorseService {
    Collection<HorseEntity> findOneByName(String name);
    Collection<HorseEntity> findAllByRiderName(String name);
    Collection<HorseEntity> findAllByBreedName(String name);
    Collection<HorseEntity> getAllHorses();
    HorseEntity getRandomHorse();
}
