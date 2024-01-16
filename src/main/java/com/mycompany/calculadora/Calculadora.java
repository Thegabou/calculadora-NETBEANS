/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author matiw
 */
public class Calculadora {

    static Operation op = new Operation();
    static int menuSelection = 0;
    static boolean continueProgram = true;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(continueProgram)
        {
            menuSelection = selectMenuOption();
            clearScreen();
            switch(menuSelection)
            {
                case 0:
                    continueProgram = false;
                    break;
                case 1:
                    op.Add();
                    break;
                case 2:
                    op.Substract();
                    break;
                case 3:
                    op.Multiply();
                    break;
                case 4:
                    op.Divide();
                    break;
            }
            
        }
    }
    
    public static int selectMenuOption()
    {
        Print("====================================================\n"
                + "Menu \n"
                + "====================================================\n"
                + "Ingrese el numero de lo que desee hacer ahora:\n"
                + " 1.- Suma\n"
                + " 2.- Resta\n"
                + " 3.- Multiplicacion\n"
                + " 4.- Divicion\n"
                + " 0.- Salir\n"
                + "====================================================");
        return sc.nextInt();
    }
    
    public static void Print(String Text)
    {
        System.out.println(Text);   
    }
    
    public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
    
    
}
