package com.company;
import com.company.TheMinimumNumberOfBanknotes.*;
import com.company.Task1.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Gift> test = new ArrayList<>();
       test.add(new Gift(5,1));
        test.add(new Gift(5,3));
        test.add(new Gift(6,7));
        test.add(new Gift(7,11));
        test.add(new Gift(9,14));
        test.add(new Gift(10,31));
        test.add(new Gift(9,7));
        test.add(new Gift(6,12));
        test.add(new Gift(6,13));
        test.add(new Gift(7,31));
        test.add(new Gift(8,17));
        test.add(new Gift(9,21));
        test.add(new Gift(10,44));
        test.add(new Gift(5,31));
        test.add(new Gift(9,7));
        test.add(new Gift(8,12));
        test.add(new Gift(5,1));
        test.add(new Gift(5,3));
        test.add(new Gift(6,7));
        test.add(new Gift(7,11));
        test.add(new Gift(9,14));
        test.add(new Gift(10,31));
        test.add(new Gift(9,7));
        test.add(new Gift(10,12));
        test.add(new Gift(6,13));
        test.add(new Gift(7,31));
        test.add(new Gift(8,17));
        test.add(new Gift(9,21));
        test.add(new Gift(10,44));
        test.add(new Gift(5,31));
        test.add(new Gift(9,7));
        test.add(new Gift(8,12));
        test.add(new Gift(8,12));
        test.add(new Gift(7,1));

        try {
            System.out.println("Task1 ");
            //122 =3 купюри
            System.out.println(Task1.task1(test,11));
            System.out.println("Task2 (dp)");
            System.out.println(Task2.task2(test,132));
            System.out.println("Task2 (greedy) ");
            System.out.println(Task2_greedy.task2_greedy(test,132));
            System.out.println("Task3 ");
            System.out.println(Task3.task3(test,13));
        } catch (Exception e){
            System.out.println("oops....");
            System.out.println(e.fillInStackTrace());
        }









    }
}
