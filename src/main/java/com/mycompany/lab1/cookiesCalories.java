/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author adaba
 */
public class cookiesCalories {
 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter how many cookies Consumed: ");
        int cookiesCount = scn.nextInt();
        int servingSize  =40/10;
        int caloriesPerCookie = 300/servingSize;
        int noOfServing =  ( cookiesCount/40 ) * 10 ;
        int totalCalories = cookiesCount * caloriesPerCookie;
 
    System.out.println("Total Serving: " + noOfServing);
    System.out.println("Total calories consumed: " + totalCalories);
    }
    
}
