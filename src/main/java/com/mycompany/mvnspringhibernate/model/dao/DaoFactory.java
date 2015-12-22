/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnspringhibernate.model.dao;

/**
 *
 * @author asup
 */
public class DaoFactory {
    private static DaoFactory instance = null;
    private static CountryDao countryDao = null;
    
    public static synchronized CountryDao getCountryDao() {
        if (countryDao == null) {
            countryDao = new CountryDaoImpl();
        }
        return countryDao;
    }
}
