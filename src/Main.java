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
            int temperature = 4;
            if (temperature < 5) {
                System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
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
            } else if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в учиверситет.");
            } else if (age > 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
            }
        }

        {
            int age = 21;
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то нельзя кататься на аттракционе");
            }
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
            }
            if (age >= 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
            }
        }

        {
            int people = 103;
            int capacity = 102;
            int seating = 60;
            if (people < seating) {
                System.out.println("В вагоне " + (seating - people) + " сидячих мест");
            } else if (people >= seating && people < capacity) {
                System.out.println("В вагоне " + (capacity - people) + " стоячих мест");
            } else if (people >= capacity) {
                System.out.println("В вагоне нет мест");
            }
        }

        {
            int one = 1;
            int two = 1;
            int three = 1;
            if (one > two && one > three) {
                System.out.println("самое большое число one " + one);
            } else if (two > three) {
                System.out.println("Самое большое число two " + two);
            } else {
                System.out.println("Самое большое число three " + three);
            }
        }
    }
}
