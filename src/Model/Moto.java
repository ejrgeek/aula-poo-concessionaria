package Model;

/* TIPO DE VEICULO */
public class Moto extends Veiculo {

    boolean temGuidon;

    public Moto(
            boolean temGuidon,
            int quantidadeDeRodas, String codigoChaci, String codigoPlaca, String cor
    ) {
        super(quantidadeDeRodas, codigoChaci, codigoPlaca, cor);
        this.temGuidon = temGuidon;
    }

    public boolean isTemGuidon() {
        return temGuidon;
    }

    public void setTemGuidon(boolean temGuidon) {
        this.temGuidon = temGuidon;
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
        return "\nMoto{" +
                "temGuidon=" + temGuidon +
                '}' + super.toString();
    }
}
