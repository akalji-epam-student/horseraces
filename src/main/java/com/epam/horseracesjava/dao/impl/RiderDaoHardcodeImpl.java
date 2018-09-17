package com.epam.horseracesjava.dao.impl;

import com.epam.horseracesjava.dao.RiderDao;
import com.epam.horseracesjava.domain.RiderEntity;

import java.util.List;
import java.util.Random;

public class RiderDaoHardcodeImpl implements RiderDao {
    private List<RiderEntity> riders;

    /**
     * Setter for riders.
     *
     * @param riders value
     */
    public void setRiders(List<RiderEntity> riders) {
        this.riders = riders;
    }

    @Override
    public RiderEntity getRandomRider() {
        return riders.get(new Random().nextInt(riders.size()));
    }
}
