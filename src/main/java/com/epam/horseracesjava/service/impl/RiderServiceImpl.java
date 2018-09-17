package com.epam.horseracesjava.service.impl;

import com.epam.horseracesjava.dao.RiderDao;
import com.epam.horseracesjava.domain.RiderEntity;
import com.epam.horseracesjava.service.RiderService;

public class RiderServiceImpl implements RiderService {

    private RiderDao riderDao;

    @Override
    public RiderEntity getRandomRider() {
        return riderDao.getRandomRider();
    }

    /**
     * Setter for riderDao.
     *
     * @param riderDao value
     */
    public void setRiderDao(RiderDao riderDao) {
        this.riderDao = riderDao;
    }
}
