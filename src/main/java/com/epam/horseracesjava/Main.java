package com.epam.horseracesjava;

import com.epam.horseracesjava.config.AppConfig;
import com.epam.horseracesjava.dao.BreedDao;
import com.epam.horseracesjava.dao.HorseDao;
import com.epam.horseracesjava.dao.RiderDao;
import com.epam.horseracesjava.domain.HorseEntity;
import com.epam.horseracesjava.domain.RaceEntity;
import com.epam.horseracesjava.service.EmulationService;
import com.epam.horseracesjava.service.RaceService;
import com.epam.horseracesjava.service.impl.EmulationServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();
        RaceService raceService = (RaceService) context.getBean("raceService");
        RaceEntity raceEntity = raceService.getRace();
        List<HorseEntity> participants = raceEntity.getHorses();
        for (int i = 0; i < participants.size(); i++) {
            HorseEntity horse = participants.get(i);
            System.out.println((i+1)+") "+horse.getName()+" is "+horse.getBreed().getName()+" with rider "+horse.getRider().getName());
        }
        System.out.print("Please select horse :");
        HorseEntity choise = participants.get(new Scanner(new InputStreamReader(System.in)).nextInt()-1);
        EmulationService emulationService = new EmulationServiceImpl();
        List<HorseEntity> simulate = emulationService.simulate(raceEntity);
        for (int i = 0; i < simulate.size(); i++) {
            HorseEntity horse = simulate.get(i);
            System.out.println((i+1)+") "+horse.getName()+" is "+horse.getBreed().getName()+" with rider "+horse.getRider().getName());
        }

        if(simulate.get(0)==choise){
            System.out.println("You WIN!");
        }else {
            System.out.println("You LOSE");
        }

    }
}
