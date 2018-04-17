package com.soccer.entity;

public class Stat {

    private Integer id;
    private Stat_Event_Type stat_event_type;
    private Integer score_team1;
    private Integer score_team2;

    public Stat() {
    }

    public Stat(Stat_Event_Type stat_event_type, Integer score_team1, Integer score_team2) {
        this.stat_event_type = stat_event_type;
        this.score_team1 = score_team1;
        this.score_team2 = score_team2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Stat_Event_Type getStat_event_type() {
        return stat_event_type;
    }

    public void setStat_event_type(Stat_Event_Type stat_event_type) {
        this.stat_event_type = stat_event_type;
    }

    public Integer getScore_team1() {
        return score_team1;
    }

    public void setScore_team1(Integer score_team1) {
        this.score_team1 = score_team1;
    }

    public Integer getScore_team2() {
        return score_team2;
    }

    public void setScore_team2(Integer score_team2) {
        this.score_team2 = score_team2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stat stat = (Stat) o;

        if (id != null ? !id.equals(stat.id) : stat.id != null) return false;
        if (stat_event_type != null ? !stat_event_type.equals(stat.stat_event_type) : stat.stat_event_type != null)
            return false;
        if (score_team1 != null ? !score_team1.equals(stat.score_team1) : stat.score_team1 != null) return false;
        return score_team2 != null ? score_team2.equals(stat.score_team2) : stat.score_team2 == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stat_event_type != null ? stat_event_type.hashCode() : 0);
        result = 31 * result + (score_team1 != null ? score_team1.hashCode() : 0);
        result = 31 * result + (score_team2 != null ? score_team2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "id=" + id +
                ", stat_event_type=" + stat_event_type +
                ", score_team1=" + score_team1 +
                ", score_team2=" + score_team2 +
                '}';
    }
}
