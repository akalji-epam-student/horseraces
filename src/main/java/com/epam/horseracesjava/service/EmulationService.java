package com.epam.horseracesjava.service;

import com.epam.horseracesjava.domain.HorseEntity;
import com.epam.horseracesjava.domain.RaceEntity;

import java.util.List;

public interface EmulationService {
    List<HorseEntity> simulate(RaceEntity race) throws InterruptedException;
}
