/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

public abstract class Conexao {
    public String status;
	
    public void conectar() {}
    public void desconectar(){}

    public abstract void alterar();
    public abstract void excluir();
    public abstract void incluir();
}
