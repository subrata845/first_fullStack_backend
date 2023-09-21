package com.saha.people.service;

import com.saha.people.model.AddPeopleResponse;
import com.saha.people.model.PeopleEntity;
import com.saha.people.model.StatusEnum;
import com.saha.people.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PeopleServiceImpl implements PeopleService {

    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public AddPeopleResponse savePeople(PeopleEntity people) {
        AddPeopleResponse addPeopleResponse = new AddPeopleResponse();
        if (peopleRepository.existsByEmail(people.getEmail())) {
            addPeopleResponse.setStatus(StatusEnum.FAILED);
            addPeopleResponse.setMessage("Email already exist");
        } else {
//            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//            people.setPassword(passwordEncoder.encode(people.getPassword()));
            peopleRepository.save(people);
            addPeopleResponse.setStatus(StatusEnum.SUCCESS);
            addPeopleResponse.setMessage("People added successfully");
        }
        return addPeopleResponse;
    }

    @Override
    public List<PeopleEntity> getAllPeople() {
        return peopleRepository.findAll();
    }
}
