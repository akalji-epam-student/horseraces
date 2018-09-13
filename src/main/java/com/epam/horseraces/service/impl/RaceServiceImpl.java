package com.epam.horseraces.service.impl;

import com.epam.horseraces.domain.HorseEntity;
import com.epam.horseraces.domain.RaceEntity;
import com.epam.horseraces.service.HorseService;
import com.epam.horseraces.service.RaceService;

public class RaceServiceImpl implements RaceService {
    private HorseService horseService;

    @Override
    public RaceEntity getRace(){
        RaceEntity race = new RaceEntity();
        race.setName("Interesting race");
        for (int i = 0; i < 4; i++) {
            HorseEntity randomHorse = horseService.getRandomHorse();
            race.addHorse(randomHorse);
        }

        return race;
    }

    /**
     * Setter for horseService.
     *
     * @param horseService value
     */
    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }
}
