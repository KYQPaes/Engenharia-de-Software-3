/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author junio
 */
public class test {
    public static void main(String[] args) {
 
		Quentao quentao = new Quentao();
		VinhoQuente vinhoquente = new VinhoQuente();
 
		System.out.println("\nMaking quentao...");
		quentao.prepareRecipe();
 
		System.out.println("\nMaking Vinho Quente...");
		vinhoquente.prepareRecipe();
	}
}
