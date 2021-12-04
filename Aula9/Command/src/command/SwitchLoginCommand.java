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
public class SwitchLoginCommand implements Command{
    
    Switch switchr;
    
    public SwitchLoginCommand(Switch switchr) {
        this.switchr = switchr;
    }
    
    @Override
    public void execute(){
        switchr.login();
    }
    
    @Override
    public void undo(){
        switchr.logoff();
    }
}
