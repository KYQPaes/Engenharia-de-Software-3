public class SanduicheStore {
    SimpleSanduicheFactory factory;
    
    public SanduicheStore(SimpleSanduicheFactory factory){
        this.factory = factory;
    }
    
    public Sanduiche orderSanduiche(String type) {
		Sanduiche sanduiche;
 
		sanduiche = factory.createSanduiche(type);
 
		return sanduiche;
	}
}
/*
public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}

*/