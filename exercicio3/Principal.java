/*
Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos:

-Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
-Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
-Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
-Sobe: para subir um andar (não deve subir se já estiver no último andar);
-Desce: para descer um andar (não deve descer se já estiver no térreo);

Encapsular todos os atributos da classe (criar os métodos set e get).
*/

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Elevador e = new Elevador();

        System.out.print("Total de andares: ");
        int total = teclado.nextInt(); // total de andar

        System.out.print("Capacidade do Elevador: ");
        double capacidade = teclado.nextDouble(); //capacidade do elevador

        e.inicializa(capacidade, total);

        int op=1;

        while(op!=0) {

            System.out.println("\n-------------------------");
            System.out.println("O que deseja fazer: ");
            System.out.println("1 - Entrar");
            System.out.println("2 - Sair");
            System.out.println("3 - Subir");
            System.out.println("4 - Descer");
            System.out.println("0 - Parar");
            System.out.print(">>> ");
            op = teclado.nextInt(); 

            if(op==1) {

                if(e.entra()==1) {
                    System.out.println("\nEntrou");
                }
                else if(e.entra()==0) {
                    System.out.println("Elevador está cheio");
                }
                System.out.println("Andar: " + e.getAndar_atual() + "°");
                System.out.println("Quantidade de pessoas: " + e.getQtd_de_pessoas_no_elevador());
            }

            else if(op==2) {
                if(e.sai()==1) {
                    System.out.println("\nSaiu");
                }
                else if(e.sai()==0) {
                    System.out.println("Elevador está vazio");
                }
                System.out.println("Andar: " + e.getAndar_atual() + "°");
                System.out.println("Quantidade de pessoas: " + e.getQtd_de_pessoas_no_elevador());
            }
            
            else if(op==3) {
                if(e.sobe()==1) {
                    System.out.println("\nSubiu");
                }
                else if(e.sobe()==0) {
                    System.out.println("Elevador está no último andar");
                }
                System.out.println("Andar: " + e.getAndar_atual() + "°");
                System.out.println("Quantidade de pessoas: " + e.getQtd_de_pessoas_no_elevador());
            }
            
            else if(op==4) {
                if(e.desce()==1) {
                    System.out.println("\nDesceu");
                }
                else if(e.desce()==0) {
                    System.out.println("Elevador está no térrio");
                }
                System.out.println("Andar: " + e.getAndar_atual() + "°");
                System.out.println("Quantidade de pessoas: " + e.getQtd_de_pessoas_no_elevador());
            }
            
            else if(op==0) {
                break;
            }

            else {
                System.out.println("\nDigite um valor válido!");
            }
        }
        teclado.close();
    }
}
