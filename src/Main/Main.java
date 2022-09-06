package Main;

import Model.Armazem;
import Model.Carro;
import Model.Concessionaria;
import Model.Moto;

public class Main {
    public static void main(String[] args) {
        /* CONCESSIONÁRIA */

        Armazem armazem = new Armazem(5);

        Carro carro1 = new Carro(
                4,
                true,
                6,
                4,
                "D6A5S4D",
                "DASD54",
                "Vermelho"
        );

        Carro carro2 = new Carro(
                4,
                false,
                6,
                4,
                "454545",
                "8978798",
                "Branco"
        );

        Moto moto1 = new Moto(
                true,
                2,
                "DASDA56",
                "da6s54d",
                "Preta"
        );

        armazem.setListaDeVeiculos(0, carro1);
        armazem.setListaDeVeiculos(1, carro2);
        armazem.setListaDeVeiculos(2, moto1);

        Concessionaria nossaConcessionaria = new Concessionaria(
                "Concessionaria Gadelhão",
                armazem
        );

        System.out.println(nossaConcessionaria.getArmazem());




    }
}
