package com.epam.horseracesjava.domain;

public class RiderEntity {
    private int id;
    private String name;

    public RiderEntity() {
    }

    public RiderEntity(String name) {
        this.name = name;
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
}
