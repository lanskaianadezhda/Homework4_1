public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше " + age + ", то надо подождать");
        }

        // task 2
        System.out.println("Задача 2");

        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // task 3
        System.out.println("Задача 3");

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то придется заплатить можно ездить спокойно");
        }

        // task 4
        System.out.println("Зачача 4");

        age = 23;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить  на работу");
        }

        // task 5
        System.out.println("Задача 5");

        age = 8;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age <14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе  в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе  без сопр0овождения взрослого");
        }

        // task 6
        System.out.println("Зачача 6");

        int places = 102;
        int sitPlaces = 60;
        int people = 48;
        if (people < sitPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people >= sitPlaces && people < places) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= places) {
            System.out.println("В вагоне нет мест");
        }

        // task 7
        System.out.println("Зачача 7");

        int one = 11;
        int two = 7;
        int three = 52;
        if (one  >= two && one >= three) {
            System.out.println("Максимальное число в переменной one равно " + one);
        } else {
            if (two >= three) {
                System.out.println("Максимальное число в переменной two равно " + two);
            } else {
                System.out.println("Максимальное число ы=в переменной three равно " + three);
            }
        }
    }
}