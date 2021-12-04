public class EstrelaStore extends SanduicheStore{
    
    Sanduiche createSanduiche(String item){
        if(item.equals("xsalada")){
            return new XSaladaEstrela();
        }else if(item.equals("xegg")){
            return new XEggEstrela();
        }else if(item.equals("natural")){
            return new NaturalEstrela();
        }else if(item.equals("xtudo")){
            return new XTudoEstrela();
        } else return null;
    }
}

/*

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}

*/