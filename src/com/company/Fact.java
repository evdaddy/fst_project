package com.company;

public class Fact{

    public static void my_factorial(int num){
        int res = 1;
        if (num < 0 ){
            System.out.println("Я не умею в отрицательные числа:/");
        }
        else {
            System.out.println("Факториал " + num + ": ");
            while(num > 1 )
            {
                res *= num;
                num--;
            }
            System.out.println(res);
        }

    }
}
