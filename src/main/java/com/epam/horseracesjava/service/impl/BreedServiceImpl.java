package com.epam.horseracesjava.service.impl;

import com.epam.horseracesjava.dao.BreedDao;
import com.epam.horseracesjava.domain.BreedEntity;
import com.epam.horseracesjava.service.BreedService;

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
