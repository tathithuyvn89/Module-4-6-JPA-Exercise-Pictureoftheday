package myapp.repository;

import java.util.List;

public interface Repository <T>{
    List<T> findAll();
    T findOne(Long id);
    void save(T model);
    void delete(Long id);
}
