package com.soccer.entity;

import java.util.HashMap;
import java.util.Map;

public class Stat_Event_Type {

    public static final String SHOTS = "SHOTS";
    public static final String SHOTS_ON_TARGET = "SHOTS_ON_TARGET";
    public static final String POSSESSION = "POSSESSION";
    public static final String FOULS = "FOULS";
    public static final String YELLOW_CARDS = "YELLOW_CARDS";
    public static final String RED_CARDS = "RED_CARDS";
    public static final String OFF_SIDE = "OFF_SIDE";
    public static final String CORNERS = "CORNERS";

    public static Map<String, Stat_Event_Type> map = new HashMap<String, Stat_Event_Type>();

    private Integer id;
    private String name;

    public Stat_Event_Type(String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stat_Event_Type that = (Stat_Event_Type) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stat_Event_Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
