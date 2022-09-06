package Model;

import java.util.Arrays;
import java.util.List;

/* ARMAZEM DE VEICULOS - GUARDA OS VEICULOS */
public class Armazem {

    Veiculo[] listaDeVeiculos;

    public Armazem(int capacidadeDoArmazem){
        listaDeVeiculos = new Veiculo[capacidadeDoArmazem];
    }

    public void getListaDeVeiculos() {
        for (int i = 0; i < this.listaDeVeiculos.length; i++) {
            System.out.println(listaDeVeiculos[i]);
        }
    }

    public void setListaDeVeiculos(int posicao, Veiculo veiculo) {
        this.listaDeVeiculos[posicao] = veiculo;
    }

    @Override
    public String toString() {
        this.getListaDeVeiculos();
        return "Lista de veiculos";
    }
}
