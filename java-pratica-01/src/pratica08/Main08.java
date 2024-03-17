package pratica08;

import pratica08.models.Curso;
import pratica08.models.Departamento;
import pratica08.models.Universidade;

public class Main08 {
   public static void main(String[] args) {
      
      Universidade universidade = new Universidade("Universidade Exemplar");
      
      Departamento deptCiencias = new Departamento("Ciências Exatas");
      deptCiencias.adicionarCurso(new Curso("Matemática"));
      deptCiencias.adicionarCurso(new Curso("Física"));
      
      Departamento deptHumanas = new Departamento("Humanas");
      deptHumanas.adicionarCurso(new Curso("História"));
      deptHumanas.adicionarCurso(new Curso("Geografia"));
      
      universidade.adicionarDepartamento(deptCiencias);
      universidade.adicionarDepartamento(deptHumanas);
      
//      System.out.println(universidade);
   
      universidade.imprimirDepartamentosECursos();
   }
}
