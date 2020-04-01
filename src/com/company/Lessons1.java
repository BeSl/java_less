package com.company;

public class Lessons1 {

    public void chapt1() {
        /*
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
        int arrayDimension = 10;
        double[] randArray = new double[arrayDimension];
        double avgVal = 0d;

        for(int i = 0; i<arrayDimension; i++){
            randArray[i] = Math.random()*10+1;
        }

        double minVal = randArray[0];
        double maxVal = randArray[0];

        System.out.println(" This array:");
        for(int i = 0; i<arrayDimension; i++){
            if (minVal > randArray[i]) minVal = randArray[i];
            if (maxVal < randArray[i]) maxVal = randArray[i];
            avgVal +=randArray[i];
            System.out.println(randArray[i]);
        }

        System.out.println("Min value = "+ String.valueOf(minVal));
        System.out.println("Max value = "+ String.valueOf(maxVal));
        System.out.println("AVG value = "+ String.valueOf(avgVal/arrayDimension));
    }

    public void chapt11(){
        System.out.println("1.1");
        System.out.println("Реализуйте алгоритм сортировки пузырьком для сортировки массива");
        System.out.println("*************************");

        int ArrayDimension = 15;
        int[] sortArray = new int[ArrayDimension];
        System.out.println("Исходный массив:");
        for(int i = 0; i<sortArray.length; i++){
            sortArray[i] = (int) (Math.random()*100) + 1;
            System.out.print(sortArray[i] + " ");
        }

        for (int i =0; i<sortArray.length; i++){
            boolean mSort = false;
            for (int j = 0; j<sortArray.length - i -1; j++){
                if (sortArray[j] > sortArray[j+1]){
                    int tempVal = sortArray[j];
                    sortArray[j] = sortArray[j+1];
                    sortArray[j+1] = tempVal;
                    mSort = true;
                }
            }

            if (mSort = false)
                break;
        }
        System.out.println("");
        System.out.println("Результат сортировки массива:");
        for(int i = 0; i<sortArray.length; i++){
            System.out.print(sortArray[i] + " ");
        }
    }



}
