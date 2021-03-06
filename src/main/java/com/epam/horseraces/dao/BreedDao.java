package com.epam.horseraces.dao;

import com.epam.horseraces.domain.BreedEntity;

import java.util.Collection;

public interface BreedDao {
    Collection<BreedEntity> getAllBreeds();
    BreedEntity getRandomBreed();
}
