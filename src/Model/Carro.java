package Model;

/* TIPO DE VEICULO */
public class Carro extends Veiculo {

    int totalDePortas;
    boolean possuiAr;
    int quantidadeDeAssentos;

    public Carro(
            int totalDePortas, boolean possuiAr, int quantidadeDeAssentos,
            int quantidadeDeRodas, String codigoChaci, String codigoPlaca, String cor
    ) {
        super(quantidadeDeRodas, codigoChaci, codigoPlaca, cor);
        this.totalDePortas = totalDePortas;
        this.possuiAr = possuiAr;
        this.quantidadeDeAssentos = quantidadeDeAssentos;
    }

    public int getTotalDePortas() {
        return totalDePortas;
    }

    public void setTotalDePortas(int totalDePortas) {
        this.totalDePortas = totalDePortas;
    }

    public boolean isPossuiAr() {
        return possuiAr;
    }

    public void setPossuiAr(boolean possuiAr) {
        this.possuiAr = possuiAr;
    }

    public int getQuantidadeDeAssentos() {
        return quantidadeDeAssentos;
    }

    public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
        this.quantidadeDeAssentos = quantidadeDeAssentos;
    }

    @Override
    public int getQuantidadeDeRodas() {
        return super.getQuantidadeDeRodas();
    }

    @Override
    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        super.setQuantidadeDeRodas(quantidadeDeRodas);
    }

    @Override
    public String getCodigoChaci() {
        return super.getCodigoChaci();
    }

    @Override
    public void setCodigoChaci(String codigoChaci) {
        super.setCodigoChaci(codigoChaci);
    }

    @Override
    public String getCodigoPlaca() {
        return super.getCodigoPlaca();
    }

    @Override
    public void setCodigoPlaca(String codigoPlaca) {
        super.setCodigoPlaca(codigoPlaca);
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "totalDePortas=" + totalDePortas +
                ", possuiAr=" + possuiAr +
                ", quantidadeDeAssentos=" + quantidadeDeAssentos +
                '}'+ super.toString();
    }
}
