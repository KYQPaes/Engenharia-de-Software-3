/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author junio
 */
public abstract class SanduicheStore {
    abstract Sanduiche createSanduiche(String item);
    
    public Sanduiche orderSanduiche(String type){
        Sanduiche sanduiche = createSanduiche(type);
        System.out.println("--- Criando um " + sanduiche.getName() + "----");
        return sanduiche;
    }
}
/*
public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
*/