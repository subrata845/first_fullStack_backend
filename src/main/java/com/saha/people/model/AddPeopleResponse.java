package com.saha.people.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddPeopleResponse {
    private StatusEnum status;
    private String message;
}
