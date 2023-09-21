package com.saha.people.service;

import com.saha.people.model.AddPeopleResponse;
import com.saha.people.model.PeopleEntity;

import java.util.List;

public interface PeopleService {
    AddPeopleResponse savePeople(PeopleEntity people);

    List<PeopleEntity> getAllPeople();

}


