package com.epam.horseraces.domain;

import com.epam.horseraces.dao.BreedDao;
import com.epam.horseraces.dao.RiderDao;

import java.util.Random;

public class HorseEntity {
    private int id;
    private String name;
    private BreedEntity breed;
    private RiderEntity rider;
    private int strength;

    private RiderDao riderDao;
    private BreedDao breedDao;

    public void random() {
        this.rider = riderDao.getRandomRider();
        this.breed = breedDao.getRandomBreed();
        this.strength = new Random().nextInt(15)+1;
    }

    public HorseEntity(int id, String name, BreedEntity breed, RiderEntity rider) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.rider = rider;
    }

    public HorseEntity() {
    }

    /**
     * Getter for id.
     *
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id.
     *
     * @param id value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for name.
     *
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     *
     * @param name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for breed.
     *
     * @return com.epam.horseraces.domain.BreedEntity
     */
    public BreedEntity getBreed() {
        return breed;
    }

    /**
     * Setter for breed.
     *
     * @param breed value
     */
    public void setBreed(BreedEntity breed) {
        this.breed = breed;
    }

    /**
     * Getter for rider.
     *
     * @return com.epam.horseraces.domain.RiderEntity
     */
    public RiderEntity getRider() {
        return rider;
    }

    /**
     * Setter for rider.
     *
     * @param rider value
     */
    public void setRider(RiderEntity rider) {
        this.rider = rider;
    }

    /**
     * Setter for riderDao.
     *
     * @param riderDao value
     */
    public void setRiderDao(RiderDao riderDao) {
        this.riderDao = riderDao;
    }

    /**
     * Setter for breedDao.
     *
     * @param breedDao value
     */
    public void setBreedDao(BreedDao breedDao) {
        this.breedDao = breedDao;
    }

    /**
     * Getter for strength.
     *
     * @return int
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Setter for strength.
     *
     * @param strength value
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "HorseEntity{" +
                "name='" + name + '\'' +
                ", breed=" + breed.getName() +
                ", rider=" + rider.getName() +
                '}';
    }
}
