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
public class SwitchLogoffCommand implements Command{
    
    Switch switchr;
    
    public SwitchLogoffCommand(Switch switchr) {
        this.switchr = switchr;
    }
    
    @Override
    public void execute(){
        switchr.logoff();
    }
    
    @Override
    public void undo(){
        switchr.login();
    }
}
