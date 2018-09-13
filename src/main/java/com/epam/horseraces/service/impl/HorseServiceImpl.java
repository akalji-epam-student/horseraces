package com.epam.horseraces.service.impl;

import com.epam.horseraces.dao.HorseDao;
import com.epam.horseraces.domain.HorseEntity;
import com.epam.horseraces.service.HorseService;

import java.util.Collection;

public class HorseServiceImpl implements HorseService {

    private HorseDao horseDao;

    @Override
    public Collection<HorseEntity> findOneByName(String name) {
        return horseDao.findOneByName(name);
    }

    @Override
    public Collection<HorseEntity> findAllByRiderName(String name) {
        return horseDao.findAllByRiderName(name);
    }

    @Override
    public Collection<HorseEntity> findAllByBreedName(String name) {
        return horseDao.findAllByBreedName(name);
    }

    @Override
    public Collection<HorseEntity> getAllHorses() {
        return horseDao.getAllHorses();
    }

    @Override
    public HorseEntity getRandomHorse(){
        return horseDao.getRandomHorse();
    }

    /**
     * Setter for horseDao.
     *
     * @param horseDao value
     */
    public void setHorseDao(HorseDao horseDao) {
        this.horseDao = horseDao;
    }
}
