package com.company;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int ambition;
    private int lustForPower;


    public Slytherin(String name, String surname, String house, int powerOfMagic, int teleportation, int cunning, int ambition, int lustForPower) {
        super(name, surname, house, powerOfMagic, teleportation);
        this.cunning = cunning;
        this.ambition = ambition;
        this.lustForPower = lustForPower;
    }

    public void comparingSlytherin(Slytherin slytherin) {
        if (this == slytherin) {
            System.out.println("Это один и тот же ученик");
        } else {
            if (getPowerOfStudent() == slytherin.getPowerOfStudent()) {
                System.out.println("Силы этих учеников равны");
            } else {
                if (getPowerOfStudent() > slytherin.getPowerOfStudent()) {
                    System.out.println(getName() + " сильнее, чем " + slytherin.getName());
                }
                if (getPowerOfStudent() < slytherin.getPowerOfStudent()) {
                    System.out.println(getName() + " слабее, чем " + slytherin.getName());
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "," + System.lineSeparator() + "хитрость - " + cunning + ", амбициозность - " + ambition + ", жажда власти - " + lustForPower + ".";
    }

    public int getPowerOfStudent() {
        int powerOfStudent = cunning + ambition + lustForPower;
        return powerOfStudent;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
