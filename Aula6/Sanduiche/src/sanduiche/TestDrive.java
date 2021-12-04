public class TestDrive {
    public static void main(String[] args){
        SimpleSanduicheFactory factory = new SimpleSanduicheFactory();
        SanduicheStore store = new SanduicheStore(factory);
        
        Sanduiche sanduiche = store.orderSanduiche("xsalada");
        System.out.println("We ordered a " + sanduiche.getName() + "\n");
        
        sanduiche = store.orderSanduiche("natural");
        System.out.println("We ordered a " + sanduiche.getName() + "\n");
    }
}
/*
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}

*/
