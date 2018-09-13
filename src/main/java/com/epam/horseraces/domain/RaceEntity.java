package com.epam.horseraces.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RaceEntity {
    private int id;
    private String name;
    private int distance = 100;
    private List<Participant> participants;

    public RaceEntity() {
        participants = new ArrayList<>();
    }

    public void addHorse(HorseEntity horse) {
        participants.add(new Participant(horse));
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
     * Getter for horses.
     *
     * @return java.util.Map<com.epam.horseraces.domain.HorseEntity                                                               ,                                                               java.lang.Integer>
     */
    public List<HorseEntity> getHorses() {
        return participants.stream()
                .map(Participant::getHorse)
                .collect(Collectors.toList());
    }

    public List<Participant> getParticipants() {
        return participants;
    }


    /**
     * Getter for distance.
     *
     * @return int
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Setter for distance.
     *
     * @param distance value
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public class Participant implements Comparable<Participant>, Comparator<Participant> {
        private HorseEntity horse;
        private int distance;

        Participant(HorseEntity horse) {
            this.horse = horse;
            this.distance = 0;
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

        /**
         * Getter for distance.
         *
         * @return int
         */
        public int getDistance() {
            return distance;
        }

        /**
         * Setter for distance.
         *
         * @param distance value
         */
        public void setDistance(int distance) {
            this.distance = distance;
        }

        @Override
        public int compareTo(Participant o) {
            return o.distance-distance;
        }

        @Override
        public int compare(Participant o1, Participant o2) {
            return o2.distance-o1.distance;
        }
    }
}
