package com.example.marcioj.springReact;

import com.example.marcioj.springReact.model.Group;
import com.example.marcioj.springReact.repository.GroupRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.stream.Stream;

public class Initializer implements CommandLineRunner {

    private final GroupRepository repository;

    public Initializer(GroupRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Denver JUG", "Utah JUG", "Seattle JUG", "Richmond JUG")
                .forEach(name -> repository.save(new Group(name)));
    }
}
