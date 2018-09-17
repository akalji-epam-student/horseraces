package com.epam.horseracesjava.service.impl;

import com.epam.horseracesjava.domain.HorseEntity;
import com.epam.horseracesjava.domain.RaceEntity;
import com.epam.horseracesjava.service.HorseService;
import com.epam.horseracesjava.service.RaceService;

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
