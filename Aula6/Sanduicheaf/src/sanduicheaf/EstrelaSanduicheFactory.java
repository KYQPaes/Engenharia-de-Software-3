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
public class EstrelaSanduicheFactory implements SanduicheIngredienteFactory {
    public Sauce createSauce() {
		return new Vinagrete();
	}

	public Bread createBread() {
		return new FrancesBread();
	}

	public Flash createFlash() {
		return new Meat();
	}
        
        public Salad[] createSalad() {
		Salad salad[] = { new Tomato(), new Letuce(), new Onion()};
		return salad;
	}
}
