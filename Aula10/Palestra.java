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
public class Palestra {
    private String assunto;
    private String palestrante;
    private String data;
    
    public String getAssunto(){
        return assunto;
    }
    
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }
    
    public String getData(){
        return data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public String getPalestrante(){
        return palestrante;
    }
    
    public void setPalestrante(String palestrante){
        this.palestrante = palestrante;
    }
    
    public Palestra(String assunto, String palestrante, String data){
        this.assunto = assunto;
        this.data = data;
        this.palestrante = palestrante;
    }
    
    public Palestra(){}
}
