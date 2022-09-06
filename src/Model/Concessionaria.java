package Model;


/* POSSUI VARIOS ARMAZENS */
public class Concessionaria {

    String nome;
    Armazem armazem;

    public Concessionaria(String nome, Armazem armazem) {
        this.nome = nome;
        this.armazem = armazem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    @Override
    public String toString() {
        return "Concessionaria{" +
                "nome='" + nome + '\'' +
                ", armazem=" + armazem +
                '}';
    }
}
