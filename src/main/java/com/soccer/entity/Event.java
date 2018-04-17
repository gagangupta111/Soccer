package com.soccer.entity;

import java.util.Date;

public class Event {

    private Integer id;

    private Player player;
    private Stat_Event_Type stat_event_type;

    private Date start_time;
    private Date end_time;

    public Event() {
    }

    public Event(Player player, Stat_Event_Type stat_event_type) {

        this.player = player;
        this.stat_event_type = stat_event_type;
    }

    public Event(Player player, Stat_Event_Type stat_event_type, Date start_time, Date end_time) {

        this.player = player;
        this.stat_event_type = stat_event_type;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Stat_Event_Type getStat_event_type() {
        return stat_event_type;
    }

    public void setStat_event_type(Stat_Event_Type stat_event_type) {
        this.stat_event_type = stat_event_type;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (id != null ? !id.equals(event.id) : event.id != null) return false;
        if (player != null ? !player.equals(event.player) : event.player != null) return false;
        if (stat_event_type != null ? !stat_event_type.equals(event.stat_event_type) : event.stat_event_type != null)
            return false;
        if (start_time != null ? !start_time.equals(event.start_time) : event.start_time != null) return false;
        return end_time != null ? end_time.equals(event.end_time) : event.end_time == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (player != null ? player.hashCode() : 0);
        result = 31 * result + (stat_event_type != null ? stat_event_type.hashCode() : 0);
        result = 31 * result + (start_time != null ? start_time.hashCode() : 0);
        result = 31 * result + (end_time != null ? end_time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", player=" + player +
                ", stat_event_type=" + stat_event_type +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                '}';
    }
}
