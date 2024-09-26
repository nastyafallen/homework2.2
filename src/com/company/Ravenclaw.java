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

    public void comparingRavenclaw(Ravenclaw ravenclaw) {
        if (this == ravenclaw) {
            System.out.println("Это один и тот же ученик");
        } else {
            if (getPowerOfStudent() == ravenclaw.getPowerOfStudent()) {
                System.out.println("Силы этих учеников равны");
            } else {
                if (getPowerOfStudent() > ravenclaw.getPowerOfStudent()) {
                    System.out.println(getName() + " сильнее, чем " + ravenclaw.getName());
                }
                if (getPowerOfStudent() < ravenclaw.getPowerOfStudent()) {
                    System.out.println(getName() + " слабее, чем " + ravenclaw.getName());
                }
            }
        }
    }

    public int getPowerOfStudent() {
        int powerOfStudent = wisdom + wit + creativity;
        return powerOfStudent;
    }

    @Override
    public String toString() {
        return super.toString() + "," + System.lineSeparator() + "мудрость - " + wisdom + ", остроумие - " + wit + ", способность к творчеству - " + creativity + ".";
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
