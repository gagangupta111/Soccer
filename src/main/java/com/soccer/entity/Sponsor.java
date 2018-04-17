package com.soccer.entity;

public class Sponsor {

    private Integer id;
    private String name;
    private String reputation;
    private Long max_spent;

    public Sponsor() {
    }

    public Sponsor(String name, String reputation, Long max_spent) {
        this.name = name;
        this.reputation = reputation;
        this.max_spent = max_spent;
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

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public Long getMax_spent() {
        return max_spent;
    }

    public void setMax_spent(Long max_spent) {
        this.max_spent = max_spent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sponsor sponsor = (Sponsor) o;

        if (id != null ? !id.equals(sponsor.id) : sponsor.id != null) return false;
        if (name != null ? !name.equals(sponsor.name) : sponsor.name != null) return false;
        if (reputation != null ? !reputation.equals(sponsor.reputation) : sponsor.reputation != null) return false;
        return max_spent != null ? max_spent.equals(sponsor.max_spent) : sponsor.max_spent == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (reputation != null ? reputation.hashCode() : 0);
        result = 31 * result + (max_spent != null ? max_spent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reputation='" + reputation + '\'' +
                ", max_spent=" + max_spent +
                '}';
    }

}
