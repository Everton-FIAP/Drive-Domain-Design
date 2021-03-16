package Aula_03;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Fahrenheit_Celsius {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#.##");
        double celsius=0, fahrenheit=0;
        int resp = 0;

        do {
            System.out.println("1- Converter Fahrenheit -> Celsius \n2- Converter Celsius -> Fahrenheit \n0- Sair");
            resp = ler.nextInt();
            switch (resp)
            {
                case 1:
                System.out.println("Entre com o valor de Fahrenheit(F°):");
                fahrenheit = ler.nextDouble();

                celsius = (fahrenheit - 32) / 1.8;

                System.out.println("O valor convertido para Celsius é: "+f.format(celsius)+" C° \n");
                break;

                case 2:
                    System.out.println("Entre com o valor de Celsius(C°):");
                    celsius = ler.nextDouble();

                    fahrenheit = (celsius * 1.8) + 32;

                    System.out.println("O valor convertido para Fahrenheit é: "+f.format(fahrenheit)+" F° \n");
                    break;

                default:
            }

        }while(resp!=0);

        System.out.println("Obrigado!");
    }
}
