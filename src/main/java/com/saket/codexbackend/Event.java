package com.saket.codexbackend;

import java.util.List;

import org.bson.types.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    private ObjectId id;
    private String name;
    private String link;
    private String description;
    private List<String> images;
    private List<String> organizers;
    private String status;
    // @DocumentReference
}
