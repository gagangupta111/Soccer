package com.soccer.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Match {

    private Integer id;
    private Date when;
    private Team team1;
    private Team team2;
    private Stadium stadium;

    private Set<Stat> stats;
    private Set<Event> timeline;

    public Match() {
    }

    public Match(Date when, Team team1, Team team2, Stadium stadium) {
        this.when = when;
        this.team1 = team1;
        this.team2 = team2;
        this.stadium = stadium;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Set<Stat> getStats() {
        return stats;
    }

    public void setStats(Set<Stat> stats) {
        this.stats = stats;
    }

    public Set<Event> getTimeline() {
        return timeline;
    }

    public void setTimeline(Set<Event> timeline) {
        this.timeline = timeline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Match match = (Match) o;

        if (id != null ? !id.equals(match.id) : match.id != null) return false;
        if (when != null ? !when.equals(match.when) : match.when != null) return false;
        if (team1 != null ? !team1.equals(match.team1) : match.team1 != null) return false;
        if (team2 != null ? !team2.equals(match.team2) : match.team2 != null) return false;
        if (stadium != null ? !stadium.equals(match.stadium) : match.stadium != null) return false;
        if (stats != null ? !stats.equals(match.stats) : match.stats != null) return false;
        return timeline != null ? timeline.equals(match.timeline) : match.timeline == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (when != null ? when.hashCode() : 0);
        result = 31 * result + (team1 != null ? team1.hashCode() : 0);
        result = 31 * result + (team2 != null ? team2.hashCode() : 0);
        result = 31 * result + (stadium != null ? stadium.hashCode() : 0);
        result = 31 * result + (stats != null ? stats.hashCode() : 0);
        result = 31 * result + (timeline != null ? timeline.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", when=" + when +
                ", team1=" + team1 +
                ", team2=" + team2 +
                ", stadium=" + stadium +
                ", stats=" + stats +
                ", timeline=" + timeline +
                '}';
    }
}
