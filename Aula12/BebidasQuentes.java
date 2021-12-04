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
public abstract class BebidasQuentes{
  
	final void prepareRecipe() {
		adicionaBebidaAlcoolica();
                ferveBebidaAlcolica();
                adicionaCondimentos();
                porNoCopo();
                promocaoHook();
	}
 
	abstract void adicionaCondimentos();
  
	abstract void adicionaBebidaAlcoolica();
 
	void ferveBebidaAlcolica() {
		System.out.println("FervendoBebida");
	}
  
	void porNoCopo() {
		System.out.println("Colocando no Copo");
	}
        
        void promocaoHook(){
            System.out.println("Colocando no Copo");
        }
}
