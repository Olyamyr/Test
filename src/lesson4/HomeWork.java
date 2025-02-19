package lesson4;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        //1) Создать массив 6 на 6 сразу с числами

        int[][] array = {
                {1, 6, 4, 6, 7, 5},
                {43, 36, 654, 1, 23, 44},
                {5, 98, 54, 23, 98, 98},
                {7, 70, 57, 98, 79, 300},
                {12, 20, 92, 55, 87, 123},
                {6, 66, 45, 876, 91, 56},
        };

        //2) Перезаписать во все ячейки нули (0)

        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                array[verticalIndex][horizontalIndex] = 0;
            }
        }

        //3) Вывести диагональ сверху вниз

        System.out.println("Вывести диагональ сверху вниз");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex + horizontalIndex == 5) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        //4) Вывести в шахматном порядке
        System.out.println("Вывести в шахматном порядке");
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if ((verticalIndex + horizontalIndex) % 2 == 0) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number);
                } else {
                    System.out.print(" ");
                }
            }
        }
            System.out.println();
        }
    }
