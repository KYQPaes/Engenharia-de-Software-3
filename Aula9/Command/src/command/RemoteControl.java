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
public class RemoteControl {
    public static void main(String[] args) {
        ControlRemote controlremote = new ControlRemote();
        
        Roteador roteador = new Roteador();
        Switch switchr = new Switch();
        
        RoteadorLoginCommand roteadorlogin = new RoteadorLoginCommand(roteador);
        RoteadorBgpCommand roteadorbgp = new RoteadorBgpCommand(roteador);
        SwitchLoginCommand switchlogin = new SwitchLoginCommand(switchr);
        SwitchOnCommand switchon = new SwitchOnCommand(switchr);
        
        RoteadorLogoffCommand roteadorlogoff = new RoteadorLogoffCommand(roteador);
        RoteadorOspfCommand roteadorospf = new RoteadorOspfCommand(roteador);
        SwitchLogoffCommand switchlogoff = new SwitchLogoffCommand(switchr);
        SwitchOffCommand switchoff = new SwitchOffCommand(switchr);

        Command[] On = { roteadorlogin, roteadorbgp, switchlogin, switchon};
        Command[] Off = { roteadorlogoff, roteadorospf, switchlogoff, switchoff};
        
        MacroCommand OnMacro = new MacroCommand(On);
        MacroCommand OffMacro = new MacroCommand(Off);
        
        controlremote.setCommand(0, OnMacro, OffMacro);
        
        System.out.println(controlremote);
        System.out.println("--- Pushing Macro On---");
        controlremote.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        controlremote.offButtonWasPushed(0);
    }
}
