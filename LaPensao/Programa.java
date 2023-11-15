package LaPensao;

import LaPensao.entities.ListPensao;

public class Programa {
    public static void main(String[] args) {

        ListPensao pensao = new ListPensao();

        pensao.adicionarEstudante("dan","dan@gm",4);
        System.out.println(pensao);
        pensao.adicionarEstudante("dan","dan@gm",4);
    }
}
