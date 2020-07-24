package main.java.com.task.family;

import java.util.Objects;

public class Family implements Comparable<Family> {

    private String name;
    private int quantityMember;
    private String title;
    private String nameOfEmblem;

    @Override
    public int compareTo(Family member) {
        return name.compareTo(member.getName());
    }

    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(int quantityMember) {
        this.quantityMember = quantityMember;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public void setNameOfEmblem(String nameOfEmblem) {
        this.nameOfEmblem = nameOfEmblem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return quantityMember == family.quantityMember &&
                Objects.equals(name, family.name) &&
                Objects.equals(title, family.title) &&
                Objects.equals(nameOfEmblem, family.nameOfEmblem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantityMember, title, nameOfEmblem);
    }

    public String toString() {
        return "Family: " + "name= " + name +
                " quantityMember= " + quantityMember +
                " title= " + title +
                " nameOfEmblem= " + nameOfEmblem;
    }
}