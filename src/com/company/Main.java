package com.company;

public class Main {

    public static void main(String[] args) {
        Gryffindor student1 = new Gryffindor("Harry", "Potter", "Gryffindor", 90, 71, 90, 96, 92);
        Gryffindor student2 = new Gryffindor("Hermione", "Granger", "Gryffindor", 82, 77, 88, 94, 82);
        Gryffindor student3 = new Gryffindor("Ron", "Weasley", "Gryffindor", 68, 73, 82, 94, 85);
        Slytherin student4 = new Slytherin("Draco", "Malfoy", "Slytherin", 82, 79, 88, 90, 90);
        Slytherin student5 = new Slytherin("Graham", "Montagu", "Slytherin", 62, 68, 82, 70, 74);
        Slytherin student6 = new Slytherin("Gregory", "Goyle", "Slytherin", 63, 66, 76, 73, 67);
        Hufflepuff student7 = new Hufflepuff("Zacharias", "Smith", "Hufflepuff", 77, 70, 85, 81, 82);
        Hufflepuff student8 = new Hufflepuff("Cedric", "Diggory", "Hufflepuff", 75, 71, 82, 85, 78);
        Hufflepuff student9 = new Hufflepuff("Justin", "Finch-Fletchley", "Hufflepuff", 66, 70, 77, 81, 77);
        Ravenclaw student10 = new Ravenclaw("Zhou", "Chang", "Ravenclaw", 76, 67, 85, 87, 81);
        Ravenclaw student11 = new Ravenclaw("Padma", "Patil", "Ravenclaw", 70, 67, 82, 81, 85);
        Ravenclaw student12 = new Ravenclaw("Marcus", "Belby", "Ravenclaw", 68, 68, 73, 79, 80);

        student6.comparingStudents(student1); // Проверка
        student11.comparingRavenclaw(student12); // Проверка
        System.out.println(student4); // Проверка
    }
}
