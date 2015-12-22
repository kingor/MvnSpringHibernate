/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnspringhibernate.model.dao;

import com.mycompany.mvnspringhibernate.model.util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author asup
 * @param <K>
 * @param <PK>
 */
public class GenericDaoImpl<T,PK> implements GenericDao<T, Serializable>{

    private SessionFactory sessionFactory;
    
     @Override
    public Serializable create(T newInstance) {
      // return (Serializable) sessionFactory.getCurrentSession().save(newInstance);
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T read(Class<T> type, Serializable id) {
       return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    @Override
    public void update(T transientObject) {
        sessionFactory.getCurrentSession().saveOrUpdate(transientObject);
    }

    @Override
    public void delete(T persistentObject) {
       sessionFactory.getCurrentSession().delete(persistentObject);
    }

    @Override
    public List<T> getAll(Class<T> type) {  
        Session session = null;
        List<T> all = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            all = session.createCriteria(type).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return all;
    }

    
}
