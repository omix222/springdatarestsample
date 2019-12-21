package com.example.springdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student,String> {

    Iterable<Student> findAll();

    Iterable<Student> findAllByOrderByIdDesc();

    Student findOneByName(String name);
}
