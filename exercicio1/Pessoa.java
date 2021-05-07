import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private String nascimento;
    private double altura;

    public String getNome() {
        return nome;
    }
    public String getNascimento() {
        return nascimento;
    }
    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimir() {   
        System.out.println("---------------------"); 
        System.out.println("SAIDA DE DADOS:");
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("Altura: " + altura);
    }

    public int calculoIdade(final LocalDate aniversario) {
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(aniversario, dataAtual);
        return periodo.getYears();
    }
}
