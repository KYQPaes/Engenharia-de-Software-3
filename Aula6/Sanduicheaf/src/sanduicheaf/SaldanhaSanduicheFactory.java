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
public class SaldanhaSanduicheFactory implements SanduicheIngredienteFactory {
    public Sauce createSauce() {
		return new Ketchup();
	}

	public Bread createBread() {
		return new HamburguerBread();
	}

	public Flash createFlash() {
		return new Soya();
	}
        
        public Salad[] createSalad() {
		Salad salad[] = { new Tomato(), new RedPeppers()};
		return salad;
	}
}
