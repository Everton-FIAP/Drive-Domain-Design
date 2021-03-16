package Aula_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hipotenusa {
    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#.##");
        int resp=0;
        double a=0,b=0,c = 0;

        do {
            System.out.println("1 - Calcular valor da Hipotenusa \n0 - Sair");
            resp = ler.nextInt();

            switch (resp)
            {
                case 1:
                    System.out.println("Entre com o valor de a [CATETO OPOSTO]: ");
                    a = ler.nextDouble();

                    System.out.println("Entre com o valor de b [CATETO ADJASCENTE]: ");
                    b = ler.nextDouble();

                    c = Math.pow(a,2.0) + Math.pow(b,2.0);
                    c = Math.sqrt(c);

                    System.out.println("O valor da [HIPOTENUSA] é: "+f.format(c)+"\n");
                    break;
            }
        }while (resp!=0);
        System.out.println("Obrigado!");
    }

}
