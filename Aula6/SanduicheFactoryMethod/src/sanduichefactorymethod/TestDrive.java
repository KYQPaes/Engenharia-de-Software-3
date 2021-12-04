public class TestDrive {
    public static void main(String[] args){
        SanduicheStore salStore = new SaldanhaStore();
        SanduicheStore estStore = new EstrelaStore();

        Sanduiche sanduiche = salStore.createSanduiche("xsalada");
        System.out.println("Ethan pediu um " + sanduiche.getName() + "\n");
        
        sanduiche = estStore.createSanduiche("xsalada");
        System.out.println("Rogério pediu um " + sanduiche.getName() + "\n");

    }
}
/*
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}

*/
