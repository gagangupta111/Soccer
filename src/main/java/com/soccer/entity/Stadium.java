package com.soccer.entity;

public class Stadium {

    private Integer id;
    private String name;
    private Address address;

    public Stadium() {
    }

    public Stadium(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stadium stadium = (Stadium) o;

        if (id != null ? !id.equals(stadium.id) : stadium.id != null) return false;
        if (name != null ? !name.equals(stadium.name) : stadium.name != null) return false;
        return address != null ? address.equals(stadium.address) : stadium.address == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
