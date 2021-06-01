package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        // Создайте метод printColor() в теле которого задайте int переменную value
        // и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), 
        // то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах 
        // от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 
        // (100 исключительно) - “Зеленый”;

        printColor();
    }

    private static void printColor() {
        int value;
        value = 0;
        final int i = 0;
        if (value == 0) {
            ;
        } else {

            System.out.println("Красный");

            if (value > 0 && value <= 100) ;
            System.out.println("Желтый");
        }
        System.out.println("Зеленый");
    }
}


