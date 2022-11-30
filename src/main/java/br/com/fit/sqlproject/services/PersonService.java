package br.com.fit.sqlproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fit.sqlproject.models.Person;
import br.com.fit.sqlproject.repositories.PersonRepository;
import br.com.fit.sqlproject.services.types.PersonServiceTemplate;

@Service
public class PersonService implements PersonServiceTemplate {
    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> all() {
        return repository.findAll();
    }

    @Override
    public Person retrieve(Long personId) {
        var p = repository.findById(personId);
        if (p != null) return p.get();
        
        return null;
    }

    @Override
    public Person create(Person person) {
        return repository.save(person);
    }

    @Override
    public Person update(Person person) {
        return repository.save(person);
    }

    @Override
    public Person destroy(Person person) {
        repository.delete(person);
        return person;
    }
    
}