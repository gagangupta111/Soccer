package com.soccer.controller;

import com.soccer.entity.*;
import com.soccer.service.Soccer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Soccer")
public class Soccer_Controller {

    @Autowired
    private Soccer_Service soccer_service;

    @RequestMapping(value = "/addPlayer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Player addPlayer(@RequestBody Player player){
        return soccer_service.addPlayer(player);
    }

    @RequestMapping(value = "/addJersey", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Jersey addJersey(@RequestBody Jersey jersey){
        return soccer_service.addJersey(jersey);
    }

    @RequestMapping(value = "/addSponsor", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Sponsor addSponsor(@RequestBody Sponsor sponsor){
        return soccer_service.addSponsor(sponsor);
    }

    @RequestMapping(value = "/addAddress", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Address addAddress(@RequestBody Address address){
        return soccer_service.addAddress(address);
    }

    @RequestMapping(value = "/addStadium", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Stadium addStadium(@RequestBody Stadium stadium){
        return soccer_service.addStadium(stadium);
    }

    @RequestMapping(value = "/addTeam", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Team addTeam(@RequestBody Team team){
        return soccer_service.addTeam(team);
    }

    @RequestMapping(value = "/addStat_Event_Type", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Stat_Event_Type addStat_Event_Type(@RequestBody Stat_Event_Type stat_event_type){
        return soccer_service.addStat_Event_Type(stat_event_type);
    }

    @RequestMapping(value = "/addMatch", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Match addMatch(@RequestBody Match match){
        return soccer_service.addMatch(match);
    }

    @RequestMapping(value = "/addEvent", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Event addEvent(@RequestBody Event event){
        return soccer_service.addEvent(event);
    }

    @RequestMapping(value = "/addStat", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Stat addStat(@RequestBody Stat stat){
        return soccer_service.addStat(stat);
    }

    @RequestMapping(value = "/updateMatch", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Match updateMatch(@RequestBody Match match){
        return soccer_service.updateMatch(match);
    }

    @RequestMapping(value = "/getMatch/{id}", method = RequestMethod.GET)
    public Match getMatch(@PathVariable("id") int id){
        return soccer_service.getMatch(id);
    }

}
