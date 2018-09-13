package com.epam.horseraces.service;

import com.epam.horseraces.domain.BreedEntity;

import java.util.Collection;

public interface BreedService {
    Collection<BreedEntity> getAllBreeds();
    BreedEntity getRandomBreed();
}
