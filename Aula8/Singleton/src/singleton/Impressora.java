/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author junio
 */
public class Impressora {
    private boolean papel;
    private boolean magenta;
    private boolean ciano;
    private boolean black;
    private boolean yellow;
    
    private static Impressora uniqueInstance;

    private Impressora(){
        papel = true;
        magenta = false;
        ciano = false;
        black = false;
        yellow = false;
    }

    public static Impressora getInstance() {
            if (uniqueInstance == null) {
                    System.out.println("Creating unique instance");
                    uniqueInstance = new Impressora();
            }
            System.out.println("Returning unique instance");
            return uniqueInstance;
    }
    
    public void fill() {
		if (!isYellow() || !isMagenta() || !isBlack() || !isCiano()) {
			yellow = true;
			magenta = true;
			black = true;
			ciano = true;
                        
			// recarrega as tintas
		}
	}
    
    public void empty() {
		if (!isPaper()) {
			papel = true;
                        
			// coloca papel
		}
	}
    
    public boolean isMagenta() {
            return magenta;
    }

    public boolean isYellow() {
            return yellow;
    }
    
    public boolean isBlack() {
            return black;
    }
    
    public boolean isCiano() {
            return ciano;
    }
    
    public boolean isPaper() {
            return papel;
    }
}
