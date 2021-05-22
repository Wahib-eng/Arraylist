package com.withWahib;

import java.util.*;
import java.util.Scanner;

public class ArraylistFunctions {
    Scanner input = new Scanner(System.in);
    int n ;
    ArrayList<Double> weights=new ArrayList<Double>();
    ArrayList<Double> sublistofWeights=new ArrayList<Double>();

    void getvalue(){

        System.out.println("\n Enter 'n' value :");
        n = Integer.parseInt(input.nextLine());
        System.out.println("Enter the elements of the array list : ");
        for(int i=0; i<n; i++) {
            weights.add(input.nextDouble());
        }
        System.out.println("\n The ArrayList");

        if(weights.isEmpty()) {
            System.out.println("ArrayList is Empty.");
        }
        else {
            System.out.print(weights );
        }

    }
    void insertVlaue(){
        System.out.println("\n Enter the index :");
        int r = input.nextInt();
        System.out.println("Enter the date :");
        Double item = input.nextDouble();
        weights.add(r-1,item);
        System.out.println("New array list : "+weights);

    }

    void deleteVlaue(){
        System.out.println("\n Enter the index :");
        int r = input.nextInt();
        weights.remove(r-1);
        System.out.println("New array list : "+weights);
    }
    void display() {

        System.out.println("\nThe ArrayList");

        if(weights.isEmpty()) {

            System.out.println("ArrayList is Empty..");
        }
        else {

            for(int i=0; i<weights.size(); i++) {

                System.out.println(weights.get(i));
            }
        }
    }

}