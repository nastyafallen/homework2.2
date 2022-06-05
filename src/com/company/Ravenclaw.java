package com.company;

public class Ravenclaw extends Hogwarts{
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, String house, int powerOfMagic, int teleportation, int wisdom, int wit, int creativity) {
        super(name, surname, house, powerOfMagic, teleportation);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Имя - " + getName() + ", фамилия - " + getSurname() + ", факультет - " + getHouse() + ", сила магии = " + getPowerOfMagic() + ", расстояние трансгресии = " + getTeleportation() + "," + System.lineSeparator() + "мудрость - " + wisdom + ", остроумие - " + wit + ", способность к творчеству - " + creativity + ".";
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
