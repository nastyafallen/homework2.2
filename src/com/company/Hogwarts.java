package com.company;

public class Hogwarts {
    private String name;
    private String surname;
    private String house;
    private int powerOfMagic;
    private int teleportation;

    public Hogwarts(String name, String surname, String house, int powerOfMagic, int teleportation) {
        this.name = name;
        this.surname = surname;
        this.house = house;
        this.powerOfMagic = powerOfMagic;
        this.teleportation = teleportation;
    }

    @Override
    public String toString() {
        return "Имя - " + name + ", фамилия - " + surname + ", факультет - " + house + ", сила магии = " + powerOfMagic + ", расстояние трансгресии = " + teleportation;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTeleportation() {
        return teleportation;
    }

    public void setTeleportation(int teleportation) {
        this.teleportation = teleportation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
