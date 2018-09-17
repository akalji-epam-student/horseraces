package com.epam.horseracesjava.service.impl;

import com.epam.horseracesjava.domain.HorseEntity;
import com.epam.horseracesjava.domain.RaceEntity;
import com.epam.horseracesjava.service.EmulationService;

import java.util.List;
import java.util.stream.Collectors;


public class EmulationServiceImpl implements EmulationService {
    @Override
    public List<HorseEntity> simulate(RaceEntity race) throws InterruptedException {
        List<RaceEntity.Participant> participants = race.getParticipants();
        while (true) {
            for (RaceEntity.Participant participant : participants) {
                participant.setDistance(participant.getDistance() + participant.getHorse().getStrength());

            }
            int count = (int) participants.stream()
                    .filter(p -> p.getDistance() >= race.getDistance())
                    .count();
            if (count == participants.size()) break;
            System.out.println("Round: ");
            participants
                    .forEach(p -> {
                        System.out.println(p.getHorse() + "   " + p.getDistance());
                    });
            System.out.println(System.lineSeparator());

        }

        return participants.stream()
                .sorted()
                .map(RaceEntity.Participant::getHorse)
                .collect(Collectors.toList());
    }
}
