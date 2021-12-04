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
public interface SanduicheIngredienteFactory {
    public Sauce createSauce();
    public Salad[] createSalad();
    public Bread createBread();
    public Flash createFlash();
    
}
