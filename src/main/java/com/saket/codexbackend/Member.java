package com.saket.codexbackend;

import org.bson.types.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "members")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    private ObjectId id;
    private String name;
    private String role;
    private String skill;
    private String twitter;
    private String linkedin;
    private String github;
    private String githubDP;
}
