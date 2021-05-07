/*
Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
trocar os canais da televisão. O controle de volume permite:
- aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
- aumentar e diminuir o número do canal em uma unidade
- trocar para um canal indicado;
- consultar o valor do volume de som e o canal selecionado.
*/

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ControleRemoto controle = new ControleRemoto();

        int op=1;

        while(op!=0) {

            System.out.println("\n-------------------------");
            System.out.println("O que deseja fazer: ");
            System.out.println("1 - Aumentar Volume");
            System.out.println("2 - Diminuir Volume");
            System.out.println("3 - Aumentar Canal");
            System.out.println("4 - Diminuir Canal");
            System.out.println("5 - Trocar Canal");
            System.out.println("6 - Consultar Volume");
            System.out.println("7 - Consultar Canal");
            System.out.println("0 - Sair");
            System.out.print(">>> ");
            op = input.nextInt(); 

            if(op==1) {
                if(controle.tv.getVolume()<50) {
                    controle.aumentarVolume();
                    System.out.println("\nVolume: " + controle.tv.getVolume());
                }
                else {
                    System.out.println("\nVolume no máximo");
                }
            }

            else if(op==2) {
                if(controle.tv.getVolume()>0) {
                    controle.diminuirVolume();
                    System.out.println("\nVolume: " + controle.tv.getVolume());
                }
                else {
                    System.out.println("\nVolume no mínimo");
                }
            }

            else if(op==3) {
                if(controle.tv.getCanal()<50) {
                    controle.aumentarCanal();
                    System.out.println("\nCanal: " + controle.tv.getCanal());
                }
                else {
                    System.out.println("\nCanal inválido");
                } 
            }

            else if(op==4) {
                if(controle.tv.getCanal()>1) {
                    controle.diminuirCanal();
                    System.out.println("\nCanal: " + controle.tv.getCanal());
                }
                else {
                    System.out.println("\nCanal inválido");
                } 
            }

            else if(op==5) {
                System.out.print("\nDigite o canal: ");
                int canal = input.nextInt();
                if(canal>0 && canal<50) {
                    controle.trocarCanal(canal);
                    System.out.println("\nCanal: " + controle.tv.getCanal());
                }
                else {
                    System.out.println("\nCanal inválido");
                }
            }

            else if(op==6) {
                int v = controle.consultarVolume();
                System.out.println("\nVolume: " + v);
            }

            else if(op==7) {
                int c = controle.consultarCanal();
                System.out.println("\nCanal: " + c);
            }

            else if(op==0) {
                break;
            }

            else {
                System.out.println("\nDigite um valor válido!");
            }
        } 
        input.close();
    }
}
