/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import static com.mycompany.calculadora.Calculadora.Print;
import java.util.Scanner;

/**
 *
 * @author matiw
 */
public class Operation {
    static float num1;
    static float num2;
    static float result;
    public Scanner sc = new Scanner(System.in);
    
    public Operation()
    {
    }
    
    public void GetNumber1()
    {
        System.out.println("Ingrese el primer numero");   
        num1 = sc.nextFloat();
    };
    
    public void GetNumber2()
    {
        System.out.println("Ingrese el segundo numero");   
        num2 = sc.nextFloat();
    };
    
    public void PrintResult()
    {
        Print("====================================================");
        System.out.println("Resultado = " + result);   
        Print("====================================================");
        int a = sc.nextInt();
    }
    
    public void Add()
    {
        Print("====================================================");
        System.out.println("Operacion de Suma");   
        GetNumber1();
        GetNumber2();
        result = num1 + num2; 
        PrintResult();
    }
    
    public void Substract()
    {
        Print("====================================================");
        System.out.println("Operacion de Resta");   
        GetNumber1();
        GetNumber2();
        result = num1 - num2; 
        PrintResult();
    }
    
    public void Multiply()
    {
        Print("====================================================");
        System.out.println("Operacion de Multiplicacion");   
        GetNumber1();
        GetNumber2();
        result = num1 * num2; 
        PrintResult();
    }
    
    public void Divide()
    {
        Print("====================================================");
        System.out.println("Operacion de Division");   
        GetNumber1();
        GetNumber2();
        result = num1 / num2; 
        PrintResult();
    }
    
    
}
