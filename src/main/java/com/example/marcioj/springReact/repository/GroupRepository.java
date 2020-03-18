package com.example.marcioj.springReact.repository;

import com.example.marcioj.springReact.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {

    Group findByName(String name);
}
