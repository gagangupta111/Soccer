package com.soccer.service;

import com.soccer.dao.Soccer_Dao;
import com.soccer.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Soccer_Service {

    @Autowired
    @Qualifier("HibernateData")
    private Soccer_Dao soccer_dao;

    public Player addPlayer(Player player){
        return soccer_dao.addPlayer(player);
    }

    public Jersey addJersey(Jersey jersey){
        return soccer_dao.addJersey(jersey);
    }

    public Sponsor addSponsor(Sponsor sponsor){
        return soccer_dao.addSponsor(sponsor);
    }

    public Address addAddress(Address address){
        return soccer_dao.addAddress(address);
    }

    public Stadium addStadium(Stadium stadium){
        return soccer_dao.addStadium(stadium);
    }

    public Team addTeam(Team team){
        return soccer_dao.addTeam(team);
    }

    public Stat_Event_Type addStat_Event_Type(Stat_Event_Type stat_event_type){
        return soccer_dao.addStat_Event_Type(stat_event_type);
    }

    public Match addMatch(Match match){
        return soccer_dao.addMatch(match);
    }

    public Event addEvent(Event event){
        return soccer_dao.addEvent(event);
    }

    public Stat addStat(Stat stat){
        return soccer_dao.addStat(stat);
    }

    public Match updateMatch(Match match){
        return soccer_dao.updateMatch(match);
    }

    public Match getMatch(Integer id){
        return soccer_dao.getMatch(id);
    }

}
