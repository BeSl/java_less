package com.company;

public class Main {
   public static void main(String[] args) {
       int CurrentNumber = 0;
        System.out.println("Выберите урок запуска");
        CurrentNumber = 11;
        switch (CurrentNumber){
            case(1):new Lessons1().chapt1(); break;
            case(11): new Lessons1().chapt11(); break;
            default: System.out.println("Команда не реализована");

        }
    }
}
