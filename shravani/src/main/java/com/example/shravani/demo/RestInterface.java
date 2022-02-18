package com.example.shravani.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestInterface extends CrudRepository<Student, Integer> {
@Query(value="select * from public.student s WHERE s.id=?1 ", nativeQuery = true)
public Student findById(int id);
@Query(value="select id from public.student s WHERE s.id=?1 ", nativeQuery = true)
public List<Integer> findByUniqueId(int id);

}
