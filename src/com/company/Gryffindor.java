package com.company;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, String house, int powerOfMagic, int teleportation, int nobility, int honor, int courage) {
        super(name, surname, house, powerOfMagic, teleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void comparingGryffindor(Gryffindor gryffindor) {
        if (this == gryffindor) {
            System.out.println("Это один и тот же ученик");
        } else {
            if (getPowerOfStudent() == gryffindor.getPowerOfStudent()) {
                System.out.println("Силы этих учеников равны");
            } else {
                if (getPowerOfStudent() > gryffindor.getPowerOfStudent()) {
                    System.out.println(getName() + " сильнее, чем " + gryffindor.getName());
                }
                if (getPowerOfStudent() < gryffindor.getPowerOfStudent()) {
                    System.out.println(getName() + " слабее, чем " + gryffindor.getName());
                }
            }
        }
    }

    public int getPowerOfStudent() {
        int powerOfStudent = nobility + honor + courage;
        return powerOfStudent;
    }

    @Override
    public String toString() {
        return super.toString() + "," + System.lineSeparator() + "благородство - " + nobility + ", честь - " + honor + ", храбрость - " + courage + ".";
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}
