package com.example.padron.repositories;

import com.example.padron.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Integer>, PagingAndSortingRepository<Person, Integer> {
    List<Person> findByActiveTrue();
    List<Person> findByCuitAndActiveTrue(Long cuit);
}
