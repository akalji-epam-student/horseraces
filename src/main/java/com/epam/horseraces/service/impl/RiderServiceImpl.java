package com.epam.horseraces.service.impl;

import com.epam.horseraces.dao.RiderDao;
import com.epam.horseraces.domain.RiderEntity;
import com.epam.horseraces.service.RiderService;

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
