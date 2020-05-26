/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author minh
 */
public interface IDvhandler<T, Tkey>{
    List<T> getAll();
    List<T> where(Predicate<T> predicate);
    T getEmail(Tkey id);
    void insert(T entity);
    void update(T entity);
    void delete(Tkey id);
}
