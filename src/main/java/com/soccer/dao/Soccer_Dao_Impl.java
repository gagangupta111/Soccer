package com.soccer.dao;

import com.soccer.entity.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Qualifier("HibernateData")
public class Soccer_Dao_Impl implements Soccer_Dao{

    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();
    private Match match;

    private static void initialize_STAT_EVENT_TYPE(){

        try {

            factory = new Configuration().configure().buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Failed to create sessionFactory object." + ex);

        }

        Soccer_Dao_Impl SD = new Soccer_Dao_Impl();

        Stat_Event_Type stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.SHOTS));
        Stat_Event_Type.map.put(Stat_Event_Type.SHOTS, stat_event_type);

        stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.SHOTS_ON_TARGET));
        Stat_Event_Type.map.put(Stat_Event_Type.SHOTS_ON_TARGET, stat_event_type);

        stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.POSSESSION));
        Stat_Event_Type.map.put(Stat_Event_Type.POSSESSION, stat_event_type);

        stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.FOULS));
        Stat_Event_Type.map.put(Stat_Event_Type.FOULS, stat_event_type);

        stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.YELLOW_CARDS));
        Stat_Event_Type.map.put(Stat_Event_Type.YELLOW_CARDS, stat_event_type);

        stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.RED_CARDS));
        Stat_Event_Type.map.put(Stat_Event_Type.RED_CARDS, stat_event_type);

        stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.OFF_SIDE));
        Stat_Event_Type.map.put(Stat_Event_Type.OFF_SIDE, stat_event_type);

        stat_event_type = SD.addStat_Event_Type(new Stat_Event_Type(Stat_Event_Type.CORNERS));
        Stat_Event_Type.map.put(Stat_Event_Type.CORNERS, stat_event_type);

    }

    private static void initializeTeamsMatch() {

        try {

            factory = new Configuration().configure().buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Failed to create sessionFactory object." + ex);

        }


        Soccer_Dao_Impl SD = new Soccer_Dao_Impl();
        Set<Player> activePlayers = new HashSet<Player>();

        for (int i = 0; i < 10; i++){

            Player player = new Player("player" + i, new Date(1988, 12, 15), "M");
            player = SD.addPlayer(player);
            activePlayers.add(player);

        }

        Set<Player> substitutes = new HashSet<Player>();
        for (int i = 0; i < 2; i++){

            Player player = new Player("Sub" + i, new Date(1990, 2, 20), "M");
            player = SD.addPlayer(player);
            substitutes.add(player);

        }

        Jersey jersey = new Jersey("Arsenal", "Red", "L");
        jersey = SD.addJersey(jersey);

        Set<Sponsor> sponsors = new HashSet<Sponsor>();
        Sponsor sponsor = new Sponsor("Nike", "Best/5", new Long(10000000));
        sponsor = SD.addSponsor(sponsor);
        sponsors.add(sponsor);

        sponsor = new Sponsor("Adidas", "Best/5", new Long(20000000));
        sponsor = SD.addSponsor(sponsor);
        sponsors.add(sponsor);

        Address address = new Address("wales", "England", 03102, 53.4808, 2.2426);
        address = SD.addAddress(address);

        Stadium stadium = new Stadium("Stadium1", address);
        stadium = SD.addStadium(stadium);

        Player manager = new Player("Manager1", new Date(1925, 2, 25), "M");
        manager = SD.addPlayer(manager);

        Player coach = new Player("Coach1", new Date(1930, 3, 30), "M");
        coach = SD.addPlayer(coach);

        Team team = new Team("Team1", manager, coach, jersey);
        team.setPlayers(activePlayers);
        team.setSubstitutes(substitutes);
        team.setSponsors(sponsors);

        team = SD.addTeam(team);

        // Team 2 starts.

        activePlayers = new HashSet<Player>();

        for (int i = 0; i < 10; i++){

            Player player = new Player("player" + i, new Date(1988, 12, 15), "M");
            player = SD.addPlayer(player);
            activePlayers.add(player);

        }

        substitutes = new HashSet<Player>();
        for (int i = 0; i < 2; i++){

            Player player = new Player("Sub" + i, new Date(1990, 2, 20), "M");
            player = SD.addPlayer(player);
            substitutes.add(player);

        }

        jersey = new Jersey("ManchJ", "Blue", "L");
        jersey = SD.addJersey(jersey);

        manager = new Player("Manager2", new Date(1925, 2, 25), "M");
        manager = SD.addPlayer(manager);

        coach = new Player("Coach2", new Date(1930, 3, 30), "M");
        coach = SD.addPlayer(coach);

        sponsors = new HashSet<Sponsor>();
        sponsor = new Sponsor("Reebok", "Best/4", new Long(5000000));
        sponsor = SD.addSponsor(sponsor);
        sponsors.add(sponsor);

        sponsor = new Sponsor("Pantaloons", "Best/4.5", new Long(8000000));
        sponsor = SD.addSponsor(sponsor);
        sponsors.add(sponsor);

        Team team2 = new Team("Team2", manager, coach, jersey);
        team2.setPlayers(activePlayers);
        team2.setSubstitutes(substitutes);
        team2.setSponsors(sponsors);

        team2 = SD.addTeam(team2);

        SD.match = new Match(new Date(2022, 2, 21 ), team, team2, stadium);
        SD.match = SD.addMatch(SD.match);

        System.out.println(SD.match);

        Event event1 = new Event(team.getPlayers().iterator().next(), Stat_Event_Type.map.get(Stat_Event_Type.SHOTS),
                new Date(), new Date());
        event1 = SD.addEvent(event1);

        Set<Event> events = new HashSet<Event>();
        events.add(event1);
        SD.match.setTimeline(events);

        Stat stat1 = new Stat(Stat_Event_Type.map.get(Stat_Event_Type.SHOTS), 1, 0);
        stat1 = SD.addStat(stat1);
        Set<Stat> stats = new HashSet<Stat>();
        stats.add(stat1);

        SD.match.setStats(stats);
        SD.match.setTimeline(events);
        SD.match = SD.updateMatch(SD.match);

        System.out.println(SD.match);


    }

    public static void main(String[] args) {

        initialize_STAT_EVENT_TYPE();
        initializeTeamsMatch();

    }


    @Override
    public Player addPlayer(Player player) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(player);
            player.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return player;
    }

    @Override
    public Jersey addJersey(Jersey jersey) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(jersey);
            jersey.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return jersey;
    }

    @Override
    public Sponsor addSponsor(Sponsor sponsor) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(sponsor);
            sponsor.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return sponsor;

    }

    @Override
    public Address addAddress(Address address) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(address);
            address.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return address;

    }

    @Override
    public Stadium addStadium(Stadium stadium) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(stadium);
            stadium.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return stadium;

    }

    @Override
    public Team addTeam(Team team) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(team);
            team.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return team;

    }

    @Override
    public Stat_Event_Type addStat_Event_Type(Stat_Event_Type stat_event_type) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(stat_event_type);
            stat_event_type.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return stat_event_type;

    }

    @Override
    public Match addMatch(Match match) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(match);
            match.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return match;

    }

    @Override
    public Event addEvent(Event event) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(event);
            event.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return event;

    }

    @Override
    public Stat addStat(Stat stat) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer id;

        try {

            tx = session.beginTransaction();
            id = (Integer) session.save(stat);
            stat.setId(id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return stat;

    }

    @Override
    public Match updateMatch(Match match) {

        Session session = factory.openSession();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();
            session.update(match);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return match;
    }

    @Override
    public Match getMatch(Integer id) {

        Session session = factory.openSession();
        Transaction tx = null;
        Match match = null;

        try {

            tx = session.beginTransaction();
            match =  (Match) session.get(Match.class, id);
            tx.commit();

        } catch (Exception e) {

            if (tx!=null) tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();

        }

        return match;

    }

}
