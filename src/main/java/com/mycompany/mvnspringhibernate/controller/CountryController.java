/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnspringhibernate.controller;

import com.mycompany.mvnspringhibernate.model.dao.DaoFactory;
import com.mycompany.mvnspringhibernate.model.pojo.Country;
import com.mycompany.mvnspringhibernate.model.util.HibernateUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author asup
 */
public class CountryController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, 
                                HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("country");
        try {
            List<Country> lst = DaoFactory.getCountryDao().getAll(Country.class);
            System.out.println(lst.get(0));
            mv.addObject("listCountry",lst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
