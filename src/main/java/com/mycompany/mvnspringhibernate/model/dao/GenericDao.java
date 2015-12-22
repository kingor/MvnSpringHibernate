/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnspringhibernate.model.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author asup
 */
public interface GenericDao<T, PK extends Serializable> {
    /** Сохранить объект newInstance в базе данных */
    PK create(T newInstance);

    /** Извлечь объект, предварительно сохраненный в базе данных, используя
     *   указанный id в качестве первичного ключа
     */
    T read(Class<T> type,PK id);

    /** Сохранить изменения, сделанные в объекте.  */
    void update(T transientObject);

    /** Удалить объект из базы данных */
    void delete(T persistentObject);
    
    public List<T> getAll( Class<T> type);

}
