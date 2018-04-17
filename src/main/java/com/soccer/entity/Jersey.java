package com.soccer.entity;

public class Jersey {

    private Integer id;
    private String name;
    private String color;
    private String size;

    public Jersey() {
    }

    public Jersey(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jersey jersey = (Jersey) o;

        if (id != null ? !id.equals(jersey.id) : jersey.id != null) return false;
        if (name != null ? !name.equals(jersey.name) : jersey.name != null) return false;
        if (color != null ? !color.equals(jersey.color) : jersey.color != null) return false;
        return size != null ? size.equals(jersey.size) : jersey.size == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Jersey{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
