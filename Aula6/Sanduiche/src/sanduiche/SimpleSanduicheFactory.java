public class SimpleSanduicheFactory {
    public Sanduiche createSanduiche(String type){
        Sanduiche sanduiche = null;
        
        if(type.equals("xsalada")){
            sanduiche = new XSalada();
        }else if(type.equals("xegg")){
            sanduiche = new XEgg();
        }else if(type.equals("xbacon")){
            sanduiche = new XBacon();
        }else if(type.equals("natural")){
            sanduiche = new Natural();
        }else if(type.equals("xtudo")){
            sanduiche = new XTudo();
        }
        
        return sanduiche;
    }
}
/*
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}

*/