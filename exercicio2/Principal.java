/*
Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
-void armazenaPessoa(String nome, int idade, float altura);
-void removePessoa(String nome);
-int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
-void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
-void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
*/ 

import java.util.Scanner;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Agenda p = new Agenda();
        Scanner teclado = new Scanner(System.in); 

        int op = 1;

        while(op != 0) {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            System.out.println("O que deseja fazer: ");
            System.out.println("1 - Armazenar Pessoa");
            System.out.println("2 - Remover Pessoa");
            System.out.println("3 - Buscar Pessoa");
            System.out.println("4 - Imprimir Pessoa");
            System.out.println("5 - Imprimir Agenda");
            System.out.println("0 - Sair");
            System.out.print(">>> ");
            op = teclado.nextInt(); 
    
            if(op==1) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                if(p.getCont()==10){
                    System.out.println("Não é possível armazenar mais pessoas.");
                }
                else {
                    System.out.print("Nome: ");
                    String nomeP = teclado.next();
                    System.out.print("Idade: ");
                    int idadeP = teclado.nextInt(); 
                    System.out.print("Altura: ");
                    float alturaP = teclado.nextFloat();

                    p.armazenaPessoa(nomeP, idadeP, alturaP);
                }
                System.out.print("\n\nAperte enter para continuar...");
                System.in.read();
            }

            else if(op==2) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                System.out.print("Nome: ");
                String nomeP = teclado.next();
                p.removePessoa(nomeP);

                System.out.print("\n\nAperte enter para continuar...");
                System.in.read();
            }
        
            else if(op==3) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                if(p.getCont()==0) {
                    System.out.println("Nenhuma pessoa armazenada.");
                }
                else {
                    System.out.print("Nome: ");
                    String nomeP = teclado.next();
    
                    p.buscaPessoa(nomeP);
    
                    if(p.buscaPessoa(nomeP)==1) {
                        System.out.println("\nPESSOA ENCONTRADA!!");
                    }
                    else {
                        System.out.println("\nPESSOA NÃO ENCONTRADA!!");
                    }
                }
                System.out.print("\n\nAperte enter para continuar...");
                System.in.read();
            }

            else if(op==4) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                if(p.getCont()==0) {
                    System.out.println("Nenhuma pessoa armazenada.");
                }
                else {
                    System.out.print("Índice: ");
                    int indice = teclado.nextInt();

                    if(p.getCont()<indice) {
                        System.out.println("Nenhuma pessoa nesse índice.");
                    }
                    else {
                        p.imprimePessoa(indice);
                    }
                }
                System.out.print("\n\nAperte enter para continuar...");
                System.in.read();
            }

            else if(op==5) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                if(p.getCont()==0) {
                    System.out.println("Nenhuma pessoa armazenada");
                }
                else {
                    p.imprimeAgenda();
                }
                System.out.print("\n\nAperte enter para continuar...");
                System.in.read();
            }

            else if(op==0) {
                break;
            }

            else {
                System.out.println("\nDigite um valor válido!");
                System.out.print("\n\nAperte enter para continuar...");
                System.in.read();
            }
        }
        teclado.close();
    }
}
