package com.company;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Введите блюдо");
            String food = scanner.nextLine();
            if (food.equals("сыр")) {
                breakfast[i] = new Cheese();
            } else if (food.equals("яблоко/большое")) {
                breakfast[i] = new Apple("большое");
            } else if (food.equals("яблоко/маленькое")) {
                breakfast[i] = new Apple("маленькое");
            } else if (food.equals("чай/черный")) {
                breakfast[i] = new Tea("черный");
            } else if (food.equals("чай/зеленый")) {
                breakfast[i] = new Tea("зеленый");
            }  else break;
        }
        for (int j=0; j<breakfast.length; j++) {
            if (breakfast[j] != null)
                breakfast[j].consume();
            else break;
        }

        int apple_counter=0;
        int cheese_counter=0;
        int tea_counter=0;
        for (int i = 0; i < 20; i++) {
            if(breakfast[i]  instanceof Apple) {
                apple_counter++;
            } else if(breakfast[i]  instanceof Cheese ) {
                cheese_counter++;
            } else if(breakfast[i]  instanceof Tea) {
                tea_counter++;
            }
        }
        System.out.println("CЫР - " +cheese_counter );
        System.out.println("ЯБЛОКО - " +apple_counter );
        System.out.println("ЧАЙ - " + tea_counter);
    }

}
