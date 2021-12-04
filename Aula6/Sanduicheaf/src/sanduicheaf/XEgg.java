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
public class XEgg extends Sanduiche{
    SanduicheIngredienteFactory ingredientFactory;
    
    public XEgg(SanduicheIngredienteFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    void prepare() {
        System.out.println("Preparing " + name);
        bread = ingredientFactory.createBread();
        sauce = ingredientFactory.createSauce();
        salad = ingredientFactory.createSalad();
        flash = ingredientFactory.createFlash();
    }
}
