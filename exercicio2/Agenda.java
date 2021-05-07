public class Agenda {

    private String[] nome  = new String[10];
    private int[] idade = new int [10] ;
    private float[] altura = new float[10];
    private int cont=0;

    public String[] getNome() {
        return nome;
    }
    public int[] getIdade() {
        return idade;
    }
    public float[] getAltura() {
        return altura;
    }
    public int getCont() {
        return cont;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }
    public void setIdade(int[] idade) {
        this.idade = idade;
    }
    public void setAltura(float[] altura) {
        this.altura = altura;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }

    public void armazenaPessoa(String nomeP, int idadeP, float alturaP) {
        nome[cont] = nomeP;
        idade[cont] = idadeP;
        altura[cont] = alturaP;
        cont++;
    }

    public void removePessoa(String nomeP) {

        int aux=0;
        int i=0;

        if(cont==0) {
            System.out.println("\nNenhuma pessoa armazenada");
        }
        else {
            for(i=0; i<cont; i++){
                if(nome[i].compareTo(nomeP) == 0) {
                    aux = i;
                    System.out.print("\nREMOVIDO!!");
                    break;
                }
            }
            if(nome[aux].compareTo(nomeP) != 0) {
                System.out.println("\nPESSOA NÃO ENCONTRADA!!");
            }
            for(i=aux; i<cont; i++){
                nome[i] = nome[i+1];
                idade[i] = idade[i+1];
                altura[i] = altura[i+1]; 
            }
            cont--;
        }
    }

    public int buscaPessoa(String nomeP) {

        int i=0;

        if(cont==0) {
            System.out.println("Nenhuma pessoa armazenada");
        }
        else {
            for(i=0; i<cont; i++){
                if(nome[i].compareTo(nomeP) == 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public void imprimePessoa(int indice) {
        System.out.println("Nome: " + nome[indice]);
        System.out.println("Idade: " + idade[indice]);
        System.out.println("Altura: " + altura[indice]);
    }

    public void imprimeAgenda() {
        for(int j=0; j<cont; j++) {
            System.out.println("---------------------");
            System.out.println("Nome: " + nome[j]);
            System.out.println("Idade: " + idade[j]);
            System.out.println("Altura: " + altura[j]);
        }
    }
}

