/*
Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa. 
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        Pessoa p = new Pessoa();
 
        System.out.println("---------------------"); 
        System.out.println("ENTRADA DE DADOS:"); 
        System.out.print("Nome: ");
        String nomeP = teclado.nextLine();
        System.out.print("Nascimento: ");
        String nascimentoP = teclado.nextLine(); 
        System.out.print("Altura: ");
        double alturaP = teclado.nextDouble();

        p.setNome(nomeP);
        p.setNascimento(nascimentoP);
        p.setAltura(alturaP);

        p.imprimir();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(nascimentoP, formato);
        
        int idade = p.calculoIdade(aniversario);

        System.out.println("---------------------"); 
        System.out.println("Idade = " + idade);
        System.out.println("---------------------"); 

        teclado.close();
    }

}
