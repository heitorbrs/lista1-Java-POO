public class Elevador {
    
    private int andar_atual; //a partir do terreo = 0
    private int total_de_andares; //sem contar o terreo
    private double capacidade_do_elevador;
    private int qtd_de_pessoas_no_elevador;

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }
    public void setTotal_de_andares(int total_de_andares) {
        this.total_de_andares = total_de_andares;
    }
    public void setCapacidade_do_elevador(double capacidade_do_elevador) {
        this.capacidade_do_elevador = capacidade_do_elevador;
    }
    public void setQtd_de_pessoas_no_elevador(int qtd_de_pessoas_no_elevador) {
        this.qtd_de_pessoas_no_elevador = qtd_de_pessoas_no_elevador;
    }

    public int getAndar_atual() {
        return andar_atual;
    }
    public int getTotal_de_andares() {
        return total_de_andares;
    }
    public double getCapacidade_do_elevador() {
        return capacidade_do_elevador;
    }
    public int getQtd_de_pessoas_no_elevador() {
        return qtd_de_pessoas_no_elevador;
    }

    public void inicializa(double c, int t) {
        capacidade_do_elevador = c;
        total_de_andares = t;
        qtd_de_pessoas_no_elevador = 0;
        andar_atual = 0;
    }

    public int entra() {
        if(qtd_de_pessoas_no_elevador < capacidade_do_elevador) {
            qtd_de_pessoas_no_elevador++;
            return 1;
        }
        else {
            return 0;
        }  
    }

    public int sai() {
        if(qtd_de_pessoas_no_elevador > 0) {
            qtd_de_pessoas_no_elevador--;
            return 1;
        }
        else {
            return 0;
        }
    }

    public int sobe() {
        if(andar_atual < total_de_andares) {
            andar_atual++;
            return 1;
        }
        else {
            return 0;
        }
    }

    public int desce(){
        if(andar_atual > 0) {
            andar_atual--;
            return 1;
        }
        else {
            return 0;
        }
    }
}
