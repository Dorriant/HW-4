public class Main {
    public static void main(String[] args) {
// Задача 1
        // Любой возраст
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равено " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        // Обозначим температуру
        int temperature = 17;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапка.");
        }

        // Задача 3
        // Обозначим скорость
        int speedCar = 110;
        if (speedCar > 60) {System.out.println("Если скорость " + speedCar + " км/ч, то придется заплатить штраф.");}
        else {System.out.println("Если скорость " + speedCar + " км/ч, то можно ездить спокойно.");}

        // Задача 4
        // Обозначим возраст
        int manAge = 21;
        if (manAge >= 2 && manAge <= 6) {System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в детский сад.");}
        else if (manAge >= 7 && manAge <= 17) {System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в школу.");}
        else if (manAge >=18 && manAge <= 24) {System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в университет.");}
        else if (manAge > 24) {System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить на работу.");}

        // Задача 5
        // Обозначим возраст
        int childAge = 4;
        if (childAge < 5) {System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");}
        else if (childAge > 5 && childAge < 14) {System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься на аттракционе в споровождении взрослого.");}
        else if (childAge > 14) {System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься.");}

        // Задача 6
        // Обозначим количество пассажиров
        int totalPassengers = 50;

        final int totalCapacity = 102;
        final int sittingCapacity = 60;

        if (totalPassengers < sittingCapacity) {
            System.out.println("Есть сидячие места.");}
        else if (totalPassengers < totalCapacity) {
            System.out.println("Сидячие места заняты, но есть стоячие места.");}
        else {System.out.println("Вагон полностью забит.");}

        // Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        int largest;

        if (one >= two && one >= three) {
            largest = one;
        } else if (two >= one && two >= three) {
            largest = two;
        } else {
            largest = three;
        }

        System.out.println("Наибольшее число: " + largest);
    }
}