package com.epam.horseracesjava.dao;

import com.epam.horseracesjava.domain.BreedEntity;

import java.util.Collection;

public interface BreedDao {
    Collection<BreedEntity> getAllBreeds();
    BreedEntity getRandomBreed();
}
