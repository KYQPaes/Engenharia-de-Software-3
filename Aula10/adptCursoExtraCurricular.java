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
public class adptCursoExtraCurricular extends CursoExtraCurricular implements IDados{
    
    @Override
    public String getDados(){
        return this.getCurso();
    }
    
    public adptCursoExtraCurricular(String curso, String sala){
        super(curso, sala);
    }
}

