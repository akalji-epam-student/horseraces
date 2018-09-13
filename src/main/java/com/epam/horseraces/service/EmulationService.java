package com.epam.horseraces.service;

import com.epam.horseraces.domain.HorseEntity;
import com.epam.horseraces.domain.RaceEntity;

import java.util.List;

public interface EmulationService {
    List<HorseEntity> simulate(RaceEntity race) throws InterruptedException;
}
