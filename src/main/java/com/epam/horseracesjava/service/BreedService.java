package com.epam.horseracesjava.service;

import com.epam.horseracesjava.domain.BreedEntity;

import java.util.Collection;

public interface BreedService {
    Collection<BreedEntity> getAllBreeds();
    BreedEntity getRandomBreed();
}
