package com.cic.basketball.cic_league_api.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController
{
    @GetMapping("/api/test")
    public String getString()
    {
        return "This is a test... Working!";
    }

    @GetMapping("/api/test/{resourceId}")
    public String getString(@PathVariable String resourceId)
    {
        return "Hello " + resourceId.toUpperCase();
    }

    @PostMapping("/api/setProfile")
    public void receiveData(@RequestBody Profile profile)
    {
        System.out.println("Here is the received profile: " + profile);
    }
}

@Getter
@Setter
class Profile
{
    String name;
    String position;
    int jerseyNumber;

    public Profile( String name, String position, int jerseyNumber)
    {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "Profile={Name="
                + name + " Position="
                + position + " JerseyNumber="
                + jerseyNumber + "}";
    }
}
