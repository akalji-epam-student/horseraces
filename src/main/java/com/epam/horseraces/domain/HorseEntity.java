package com.epam.horseraces.domain;

public class HorseEntity {
    private int id;
    private String name;
    private BreedEntity breed;

    public HorseEntity(int id, String name, BreedEntity breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
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
}
