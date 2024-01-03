import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        //task2
        System.out.println("task2");

        if (age > 6 && age < 18) {
            System.out.println("Вы ходите в школу");

        } else if (age > 17 && age < 25) {
            System.out.println("Можете отправляться в университет");

        } else if (age > 23) {
            System.out.println("Пора искать первую работу");
        }

        //task3
        System.out.println("task3");

        int allCapacity = 102;
        int seatCapacity = 60;
        int stayCapacity = allCapacity - seatCapacity;
        int people = 61;
        if (people < 102) {
            if (people > 60) {
                System.out.println("Есть стоячие места");
            } else {
                System.out.println("Есть сидячие места");
            }
        } else {
            System.out.println("Вагон забит.");
        }

        //task3.1
        System.out.println("task3.1");

        int newAge = 5;
        if (newAge > 1 && newAge < 7) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в детский сад");
        } else if (newAge > 7 || newAge < 19) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в школу");
        } else if (newAge > 18 || newAge < 24) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить университет");

        } else if (newAge > 24) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить на работу");
        }

        //task3.2
        System.out.println("task3.2");

        int ageNew = 12;

        if (ageNew < 5) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно нельзя кататься на аттракционе");
        } else if (ageNew > 5 && ageNew < 14) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему можно кататься только в сопровождении взрослого");
        } else if (ageNew > 14) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему можно кататься без сопровождения взрослого");

        }


        //task3.3
        System.out.println("task3.3");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three && two > one) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}