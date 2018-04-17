package com.soccer.entity;

import java.util.Date;

public class Player {

    private Integer id;
    private String name;
    private Date dob;
    private String sex;

    public Player() {
    }

    public Player(String name, Date dob, String sex) {
        this.name = name;
        this.dob = dob;
        this.sex = sex;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (id != null ? !id.equals(player.id) : player.id != null) return false;
        if (name != null ? !name.equals(player.name) : player.name != null) return false;
        if (dob != null ? !dob.equals(player.dob) : player.dob != null) return false;
        return sex != null ? sex.equals(player.sex) : player.sex == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", sex='" + sex + '\'' +
                '}';
    }
}
