package com.epam.horseraces.domain;

public class RaceEntity {
    private int id;
    private String name;
    private RiderEntity rider;
    private HorseEntity horse;

    public RaceEntity() {
    }

    public RaceEntity(int id, String name, RiderEntity rider, HorseEntity horse) {
        this.id = id;
        this.name = name;
        this.rider = rider;
        this.horse = horse;
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
     * Getter for horse.
     *
     * @return com.epam.horseraces.domain.HorseEntity
     */
    public HorseEntity getHorse() {
        return horse;
    }

    /**
     * Setter for horse.
     *
     * @param horse value
     */
    public void setHorse(HorseEntity horse) {
        this.horse = horse;
    }
}
