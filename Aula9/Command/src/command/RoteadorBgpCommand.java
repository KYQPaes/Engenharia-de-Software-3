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
public class RoteadorBgpCommand implements Command{
    
    Roteador roteador;
    
    public RoteadorBgpCommand(Roteador roteador) {
        this.roteador = roteador;
    }
    
    @Override
    public void execute(){
        roteador.bgp();
    }
    
    @Override
    public void undo(){
        roteador.ospf();
    }
}
