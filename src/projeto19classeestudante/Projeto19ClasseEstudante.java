/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto19classeestudante;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Projeto19ClasseEstudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Estudante objEst01 = new Estudante ();
      objEst01.setNome( "Pedro");
      objEst01.setRA( "4545454545");
      objEst01.setCelular("1212-1212");
      System.out.println( "Nome" +objEst01.getNome());
      System.out.println( "RA"  +objEst01.getRA());
      System.out.println( "Celular" +objEst01.getCelular());
      
    ArrayList<Estudante> listaDisciplina = new ArrayList<Estudante>();
    
    listaDisciplina.add(objEst01);
    
    ArrayList<Estudante> listaNotas = new ArrayList<Estudante>();
    
    listaNotas.add(objEst01);
    
    
    for (int d = 5; d <= 5; d++){
            Estudante objEst = new Estudante();
            objEst01.setDisciplina("Poo,EngSoftware,SO,SE,Estatistica");
            listaDisciplina.add(objEst01);
    }
    
    
    for (int n = 0; n <= 10; n++){
            Estudante objEst = new Estudante();
            objEst01.setNota(n);
            listaNotas.add(objEst01);
        }
    
    }
    
}
      
  
      
      
     
      
      
