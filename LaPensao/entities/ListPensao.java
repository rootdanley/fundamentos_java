package LaPensao.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPensao {
    private Pensao[] pensao;

    public ListPensao(){
        this.pensao = new Pensao[10];
    }

    public void adicionarEstudante(String nome, String email, Integer quarto){
        if(pensao[quarto] != null){
            System.out.println("quarto ocupado");
        }
        else {
            pensao[quarto] = new Pensao(nome, email);
        }
    }

    @Override
    public String toString() {
        return
                Arrays.toString(pensao);
    }
}
