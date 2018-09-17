package com.epam.horseracesjava.config;

import com.epam.horseracesjava.dao.BreedDao;
import com.epam.horseracesjava.dao.HorseDao;
import com.epam.horseracesjava.dao.impl.BreedDaoHardcodeImpl;
import com.epam.horseracesjava.dao.impl.HorseDaoHardcodeImpl;
import com.epam.horseracesjava.domain.BreedEntity;
import com.epam.horseracesjava.domain.RiderEntity;
import com.epam.horseracesjava.dao.RiderDao;
import com.epam.horseracesjava.dao.impl.RiderDaoHardcodeImpl;
import com.epam.horseracesjava.domain.HorseEntity;
import com.epam.horseracesjava.service.BreedService;
import com.epam.horseracesjava.service.HorseService;
import com.epam.horseracesjava.service.RaceService;
import com.epam.horseracesjava.service.RiderService;
import com.epam.horseracesjava.service.impl.BreedServiceImpl;
import com.epam.horseracesjava.service.impl.HorseServiceImpl;
import com.epam.horseracesjava.service.impl.RaceServiceImpl;
import com.epam.horseracesjava.service.impl.RiderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("riderEntity")
    public RiderEntity riderEntity(){
        return new RiderEntity();
    }

    @Bean("breedEntity")
    public BreedEntity breedEntity(){
        return new BreedEntity();
    }

    @Bean("horseEntity")
    public HorseEntity horseEntity(){
        return new HorseEntity();
    }

    @Bean("riderDao")
    public RiderDao riderDao(){
        RiderDaoHardcodeImpl riderDao = new RiderDaoHardcodeImpl();
        List<RiderEntity> riderEntities = new ArrayList<>();
        riderEntities.add(new RiderEntity("Jack Daniels"));
        riderEntities.add(new RiderEntity("Harley Davidson"));
        riderEntities.add(new RiderEntity("Virginia Slims"));
        riderEntities.add(new RiderEntity("Jimmy Jiles"));
        riderEntities.add(new RiderEntity("Big Indian"));
        riderEntities.add(new RiderEntity("Jose Cuervo"));
        riderEntities.add(new RiderEntity("Chance Wilder"));
        riderDao.setRiders(riderEntities);
        return riderDao;
    }

    @Bean("breedDao")
    public BreedDao breedDao(){
        List<BreedEntity> breedEntities = new ArrayList<>();
        breedEntities.add(new BreedEntity("Bardigiano"));
        breedEntities.add(new BreedEntity("Banker horse"));
        breedEntities.add(new BreedEntity("Andravida horse"));
        breedEntities.add(new BreedEntity("Danish Warmblood"));
        breedEntities.add(new BreedEntity("Dutch Warmblood"));
        breedEntities.add(new BreedEntity("Freiberger"));
        breedEntities.add(new BreedEntity("Malopolski"));
        breedEntities.add(new BreedEntity("Mangalarga"));
        breedEntities.add(new BreedEntity("Maremmano"));
        BreedDaoHardcodeImpl breedDaoHardcode = new BreedDaoHardcodeImpl();
        breedDaoHardcode.setBreeds(breedEntities);
        return breedDaoHardcode;
    }

    @Bean
    public HorseDao horseDao(){
        List<HorseEntity> horseEntities = new ArrayList<>();
        List<String> names = Arrays.asList(
                        "Ralph","Harrison","Gator","Valentine","Camoren","Tenneche","Yentel","Esteem",
                "Onyx","Paddington","Infatuation"
        );
        for (String name : names) {
            HorseEntity horseEntity = new HorseEntity();
            horseEntity.setName(name);
            horseEntity.setBreedDao(breedDao());
            horseEntity.setRiderDao(riderDao());
            horseEntity.random();
            horseEntities.add(horseEntity);
        }
        HorseDaoHardcodeImpl horseDao = new HorseDaoHardcodeImpl();
        horseDao.setHorses(horseEntities);
        return horseDao;
    }

    @Bean("horseService")
    public HorseService horseService(){
        HorseServiceImpl horseService = new HorseServiceImpl();
        horseService.setHorseDao(horseDao());
        return horseService;
    }

    @Bean("breedService")
    public BreedService breedService(){
        BreedServiceImpl breedService = new BreedServiceImpl();
        breedService.setBreedDao(breedDao());
        return breedService;
    }

    @Bean("riderService")
    public RiderService riderService(){
        RiderServiceImpl riderService = new RiderServiceImpl();
        riderService.setRiderDao(riderDao());
        return riderService;
    }

    @Bean("raceService")
    public RaceService raceService(){
        RaceServiceImpl raceService = new RaceServiceImpl();
        raceService.setHorseService(horseService());
        return raceService;
    }



}
