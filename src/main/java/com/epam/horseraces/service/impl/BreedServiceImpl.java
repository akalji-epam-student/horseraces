package com.epam.horseraces.service.impl;

import com.epam.horseraces.dao.BreedDao;
import com.epam.horseraces.domain.BreedEntity;
import com.epam.horseraces.service.BreedService;

import java.util.Collection;

public class BreedServiceImpl implements BreedService {

    private BreedDao breedDao;

    @Override
    public Collection<BreedEntity> getAllBreeds() {
        return breedDao.getAllBreeds();
    }

    @Override
    public BreedEntity getRandomBreed() {
        return breedDao.getRandomBreed();
    }

    /**
     * Setter for breedDao.
     *
     * @param breedDao value
     */
    public void setBreedDao(BreedDao breedDao) {
        this.breedDao = breedDao;
    }
}
