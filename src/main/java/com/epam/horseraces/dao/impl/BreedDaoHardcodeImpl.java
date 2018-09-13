package com.epam.horseraces.dao.impl;

import com.epam.horseraces.dao.BreedDao;
import com.epam.horseraces.domain.BreedEntity;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BreedDaoHardcodeImpl implements BreedDao {
    private List<BreedEntity> breeds;

    @Override
    public Collection<BreedEntity> getAllBreeds() {
        return breeds;
    }

    @Override
    public BreedEntity getRandomBreed() {
        return breeds.get(new Random().nextInt(breeds.size()));
    }

    public Collection<BreedEntity> getBreedByName(String name) {
        return breeds.stream()
                .filter(breedEntity -> breedEntity.getName().equals(name))
                .collect(Collectors.toList());
    }

    /**
     * Setter for breeds.
     *
     * @param breeds value
     */
    public void setBreeds(List<BreedEntity> breeds) {
        this.breeds = breeds;
    }
}
