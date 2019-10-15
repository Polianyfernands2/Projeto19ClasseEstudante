/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto19classeestudante;

/**
 *
 * @author aluno
 */
public class Estudante {
    protected String nome;
    protected String RA;
    protected String celular;
    protected String disciplina;
    protected int nota;
    
     
    
    //CONSTRUTORES
    public Estudante(){
        
    }

    public Estudante(String nome, String RA, String celular, String disciplina, int nota) {
        this.nome = nome;
        this.RA = RA;
        this.celular = celular;
        this.disciplina = disciplina;
        this.nota = nota;
    }
    //GETTER E SETTER

    Estudante(int n, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Estudante(int n, int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    
    }
    
    
}
