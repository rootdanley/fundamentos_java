package pratica08.models;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
   
   private List<Departamento> departamentoList;
   private String nome;
   
   public Universidade(String nome) {
      this.nome = nome;
      this.departamentoList =  new ArrayList<>();
   }
   
   public void adicionarDepartamento(Departamento departamento) {
      departamentoList.add(departamento);
   }
   
   public List<Departamento> getDepartamentos() {
      return departamentoList;
   }
   
   public String getNome() {
      return nome;
   }

   public void imprimirDepartamentosECursos() {
      System.out.println("Universidade: " + nome);
      for (Departamento dept : departamentoList) {
         System.out.println("Departamento: " + dept.getNome());
         List<Curso> cursoList = dept.getCursos();
         if(cursoList.isEmpty()) {
            System.out.println("\tSem cursos cadastrados");
         } else {
            for (Curso curso : cursoList) {
               System.out.println("\tCursos: " + curso.getNome());
            }
         }
         
      }
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Universidade{");
      sb.append("departamentoList=").append(departamentoList);
      sb.append(", nome='").append(nome).append('\'');
      sb.append('}');
      return sb.toString();
   }
}
