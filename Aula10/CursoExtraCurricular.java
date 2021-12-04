/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc;

/**
 *
 * @author junio
 */
public class CursoExtraCurricular {
    private String curso;
    private String sala;
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getSala(){
        return sala;
    }
    
    public void setSala(String sala){
        this.sala = sala;
    }
    
    public CursoExtraCurricular(String curso, String sala){
        this.curso = curso;
        this.curso = sala;
    }
    
    public CursoExtraCurricular(){}
}
