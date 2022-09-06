package Model;

/* CLASSE MODELO PARA CONSTRUIR NOVOS VEICULOS */
public class Veiculo {
    int quantidadeDeRodas;
    String codigoChaci;
    String codigoPlaca;
    String cor;

    public Veiculo(int quantidadeDeRodas, String codigoChaci, String codigoPlaca, String cor) {
        this.quantidadeDeRodas = quantidadeDeRodas;
        this.codigoChaci = codigoChaci;
        this.codigoPlaca = codigoPlaca;
        this.cor = cor;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public String getCodigoChaci() {
        return codigoChaci;
    }

    public void setCodigoChaci(String codigoChaci) {
        this.codigoChaci = codigoChaci;
    }

    public String getCodigoPlaca() {
        return codigoPlaca;
    }

    public void setCodigoPlaca(String codigoPlaca) {
        this.codigoPlaca = codigoPlaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nVeiculo{" +
                "quantidadeDeRodas=" + quantidadeDeRodas +
                ", codigoChaci='" + codigoChaci + '\'' +
                ", codigoPlaca='" + codigoPlaca + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
