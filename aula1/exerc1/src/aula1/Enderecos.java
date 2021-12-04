/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author junio
 */
public interface Enderecos {
    public String getStatus(); 
    public String getEndereco(); 
    public void setEndereco(String endereco); 
    public String getCep(); 
    public void setCep(String cep); 
    public String getCidade(); 
    public void setCidade(String cidade); 
    public String getEstado(); 
    public void setEstado(String estado);
}
