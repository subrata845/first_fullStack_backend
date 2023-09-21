package com.saha.people.controller;

import com.saha.people.model.AddPeopleResponse;
import com.saha.people.model.PeopleEntity;
import com.saha.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
@CrossOrigin(origins = "*")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @PostMapping("/add")
    public AddPeopleResponse add(@RequestBody PeopleEntity people) {
        return peopleService.savePeople(people);
    }

    @GetMapping("/getAll")
    public List<PeopleEntity> getAllPeople() {
        return peopleService.getAllPeople();
    }

}
