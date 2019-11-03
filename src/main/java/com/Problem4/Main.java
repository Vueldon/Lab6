/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Problem4;

import java.util.Scanner;

/**
 *
 * @author vueld
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        LandTract land1 = new LandTract();
        LandTract land2 = new LandTract();
        
        System.out.println("Please enter the length of the first tract of land");
        float length1 = keyboard.nextFloat();
        land1.setLength(length1);
        
        System.out.println("And now the width");
        float width1 = keyboard.nextFloat();
        land1.setWidth(width1);
        
        
        System.out.println("Please enter the length of the second tract of land");
        float length2 = keyboard.nextFloat();
        land2.setLength(length2);
        
        System.out.println("And now the width");
        float width2 = keyboard.nextFloat();
        land2.setWidth(width2);
        
        
        System.out.println("First tract area: " + land1.getArea(length1, width1));
        System.out.println("Second tract area: " + land2.getArea(length2, width2));
        
        if (land1.equals(land2) == true)
        {
            System.out.println("The tracts of land are equal in size");
        }
        else
        {
            System.out.println("The tracts of land are not equal in size");
        }
    }
}
