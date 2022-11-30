package br.com.fit.sqlproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fit.sqlproject.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
