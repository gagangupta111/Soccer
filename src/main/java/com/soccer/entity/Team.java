package com.soccer.entity;

import java.util.List;
import java.util.Set;

public class Team {

    private Integer id;
    private String name;

    private Player manager;
    private Player coach;
    private Jersey jersey;

    private Set<Player> players;
    private Set<Player> substitutes;
    private Set<Sponsor> sponsors;

    public Team() {
    }

    public Team(String name, Player manager, Player coach, Jersey jersey) {
        this.name = name;
        this.manager = manager;
        this.coach = coach;
        this.jersey = jersey;
    }

    public Team(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getManager() {
        return manager;
    }

    public void setManager(Player manager) {
        this.manager = manager;
    }

    public Player getCoach() {
        return coach;
    }

    public void setCoach(Player coach) {
        this.coach = coach;
    }

    public Jersey getJersey() {
        return jersey;
    }

    public void setJersey(Jersey jersey) {
        this.jersey = jersey;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Set<Player> getSubstitutes() {
        return substitutes;
    }

    public void setSubstitutes(Set<Player> substitutes) {
        this.substitutes = substitutes;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(Set<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (id != null ? !id.equals(team.id) : team.id != null) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        if (manager != null ? !manager.equals(team.manager) : team.manager != null) return false;
        if (coach != null ? !coach.equals(team.coach) : team.coach != null) return false;
        if (jersey != null ? !jersey.equals(team.jersey) : team.jersey != null) return false;
        if (players != null ? !players.equals(team.players) : team.players != null) return false;
        if (substitutes != null ? !substitutes.equals(team.substitutes) : team.substitutes != null) return false;
        return sponsors != null ? sponsors.equals(team.sponsors) : team.sponsors == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + (coach != null ? coach.hashCode() : 0);
        result = 31 * result + (jersey != null ? jersey.hashCode() : 0);
        result = 31 * result + (players != null ? players.hashCode() : 0);
        result = 31 * result + (substitutes != null ? substitutes.hashCode() : 0);
        result = 31 * result + (sponsors != null ? sponsors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                ", coach=" + coach +
                ", jersey=" + jersey +
                ", players=" + players +
                ", substitutes=" + substitutes +
                ", sponsors=" + sponsors +
                '}';
    }
}
