package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int sum = 0;
        int i = 0;
        int color = 0 ;
        int vertices = 0;
        double n = 1;
        double curr_series = 0;
        int fact;

        for(int c : a){
            sum += c;
        }

        System.out.println(sum);
        sum = 0;
        while( i < a.length){
            sum += a[i];
            i++;
        }

        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum += a[i];
            i++;
        }while(i < a.length);
        System.out.println(sum);

        while(n < 11){
            curr_series += 1 / n;
            System.out.println(curr_series);
            curr_series = 0;
            n++;
        }

        fact = (int)(Math.random() * 10);
        Fact.my_factorial(fact);



        i = 0 ;
        Scanner in = new Scanner(System.in);

        System.out.println("Create a Shape.");
        System.out.println("Enter color of shape(in int): ");
        color = in.nextInt();
        System.out.println("Enter how much vertices has your shape: ");
        vertices = in.nextInt();

        Params[] vert_num = new Params[vertices];
        while(i < vertices){
            vert_num[i] = new Params();
            i++;
        }
        Shape your_shape = new Shape(color, vert_num);
        System.out.println(vert_num[2]);
        System.out.println(color);

    }
}
