package pratica08.models;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
   private String nome;
   private List<Curso> cursoList;
   
   public Departamento(String nome) {
      this.nome = nome;
      this.cursoList = new ArrayList<>();
   }
   
   
   public void adicionarCurso(Curso curso) {
      cursoList.add(curso);
   }
   
   public List<Curso> getCursos() {
      return cursoList;
   }
   
   public String getCurNome() {
      for(Curso c : cursoList) {
         return c.getNome();
      }
      return null;
   }
   
   public String getNome() {
      return nome;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Departamento{");
      sb.append("nome='").append(nome).append('\'');
      sb.append(", cursoList=").append(cursoList);
      sb.append('}');
      return sb.toString();
   }
}
