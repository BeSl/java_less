package com.company;
/*
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class Chapt1 {
    public void setArrayDimension(int arrayDimension) {
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




}
