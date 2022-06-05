package com.company;

public class Hufflepuff extends Hogwarts{
    private int honesty;
    private int loyalty;
    private int hardWork;

    public Hufflepuff(String name, String surname, String house, int powerOfMagic, int teleportation, int honesty, int loyalty, int hardWork) {
        super(name, surname, house, powerOfMagic, teleportation);
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.hardWork = hardWork;
    }

    @Override
    public String toString() {
        return "Имя - " + getName() + ", фамилия - " + getSurname() + ", факультет - " + getHouse() + ", сила магии = " + getPowerOfMagic() + ", расстояние трансгресии = " + getTeleportation() + "," + System.lineSeparator() + "честность - " + honesty + ", верность - " + loyalty + ", трудолюбие - " + hardWork + ".";
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }
}
