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
public class SimpleRemote {
    Command slot;
 
    public SimpleRemote() {}

    public void setCommand(Command command) {
            slot = command;
    }

    public void buttonWasPressed() {
            slot.execute();
    }
}
