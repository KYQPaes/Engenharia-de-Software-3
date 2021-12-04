/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanduicheaf;

/**
 *
 * @author junio
 */
public abstract class SanduicheStore {
    protected abstract Sanduiche createSanduiche(String item);
 
	public Sanduiche orderSanduiche(String type) {
		Sanduiche sanduiche = createSanduiche(type);
		System.out.println("--- Making a " + sanduiche.getName() + " ---");
		sanduiche.prepare();
		return sanduiche;
	}
}
