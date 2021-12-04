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
public class TestDrive {
    public static void main(String[] args) {
		SanduicheStore salStore = new SaldanhaSanduicheStore();
		SanduicheStore estStore = new EstrelaSanduicheStore();
 
		Sanduiche sanduiche = salStore.orderSanduiche("xsalada");
		System.out.println("Ethan ordered a " + sanduiche + "\n");
 
		sanduiche = estStore.orderSanduiche("xegg");
		System.out.println("Joel ordered a " + sanduiche + "\n");

	}
}
