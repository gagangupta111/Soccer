package com.soccer.dao;

import com.soccer.entity.*;

public interface Soccer_Dao {

    public Player addPlayer(Player player);
    public Jersey addJersey(Jersey jersey);
    public Sponsor addSponsor(Sponsor sponsor);
    public Address addAddress(Address address);
    public Stadium addStadium(Stadium stadium);

    public Team addTeam(Team team);

    public Stat_Event_Type addStat_Event_Type(Stat_Event_Type stat_event_type);
    public Match addMatch(Match match);

    public Event addEvent(Event event);
    public Stat addStat(Stat stat);

    public Match updateMatch(Match match);

    public Match getMatch(Integer id);

}
