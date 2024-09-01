public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        {
            int age = 9;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
            } else
                System.out.println("Ечли возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        {
            int temperature = 10;
            if (temperature < -5) {
                System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
            } else {
                if (temperature > 5) {
                    System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
                }
            }
        }

        {
            int speed = 55;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            }
        }

        {
            int age = 25;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            }
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            }
            if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в учиверситет.");
            }
            if (age > 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
            }
        }
        {
            int age = 21;
            if (age > 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
            } else {
                if (age < 5) {
                    System.out.println("Если возраст ребенка равен " + age + ", то нельзя кататься на аттракционе");
                }

                if (age > 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
                }
            }
        }
        {
            int people = 100;
            int capacity = 120;
            int seating = 60;
            int standing = capacity - seating;
            int availableSeats = capacity - people;
            if (people >= capacity) {
                System.out.println("Свободных мест нету");
            } else {
                System.out.println("Осталось " + availableSeats + " мест");
            }
            if (availableSeats > 60) {
                System.out.println(standing + " стоячих и " + (availableSeats - standing) + " сидячих мест");
            } else {
                System.out.println(availableSeats + " стоячих мест");
            }
        }
        {
            int one = 3;
            int two = 19;
            int three = 1;
            if (one > two && one > three) {
                System.out.println("one " + one);
            }
            if (two > one && two > three) {
                System.out.println("two " + two);
            }
            if (three > one && three > two) {
                System.out.println("three " + three);
            }
        }
    }
}
