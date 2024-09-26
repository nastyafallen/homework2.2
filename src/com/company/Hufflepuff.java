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

    public void comparingHufflepuff(Hufflepuff hufflepuff) {
        if (this == hufflepuff) {
            System.out.println("Это один и тот же ученик");
        } else {
            if (getPowerOfStudent() == hufflepuff.getPowerOfStudent()) {
                System.out.println("Силы этих учеников равны");
            } else {
                if (getPowerOfStudent() > hufflepuff.getPowerOfStudent()) {
                    System.out.println(getName() + " сильнее, чем " + hufflepuff.getName());
                }
                if (getPowerOfStudent() < hufflepuff.getPowerOfStudent()) {
                    System.out.println(getName() + " слабее, чем " + hufflepuff.getName());
                }
            }
        }
    }

    public int getPowerOfStudent() {
        int powerOfStudent = honesty + loyalty + hardWork;
        return powerOfStudent;
    }

    @Override
    public String toString() {
        return super.toString() + "," + System.lineSeparator() + "честность - " + honesty + ", верность - " + loyalty + ", трудолюбие - " + hardWork + ".";
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
