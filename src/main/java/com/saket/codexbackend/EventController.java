package com.saket.codexbackend;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public ResponseEntity<List<Event>> getEvents(){
        return new ResponseEntity<List<Event>>(eventService.getEvents(), HttpStatus.OK);
    }

    @GetMapping("/a")
    public String hello(){
        return "<h1>Hiiii</h1>";
    }
}
