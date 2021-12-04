/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author junio
 */
public class RoteadorLogoffCommand implements Command{
    
    Roteador roteador;
    
    public RoteadorLogoffCommand(Roteador roteador) {
        this.roteador = roteador;
    }
    
    @Override
    public void execute(){
        roteador.logoff();
    }
    
    @Override
    public void undo(){
        roteador.login();
    }
}
