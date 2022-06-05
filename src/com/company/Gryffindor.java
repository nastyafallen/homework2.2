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

    @Override
    public String toString() {
        return "Имя - " + getName() + ", фамилия - " + getSurname() + ", факультет - " + getHouse() + ", сила магии = " + getPowerOfMagic() + ", расстояние трансгресии = " + getTeleportation() + "," + System.lineSeparator() + "благородство - " + nobility + ", честь - " + honor + ", храбрость - " + courage + ".";
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
