package com.saha.people.repository;

import com.saha.people.model.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository <PeopleEntity,Integer> {
    boolean existsByEmail(String email);
}
