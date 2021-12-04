/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author junio
 */
public class Quentao extends BebidasQuentes {
    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando Condimentos");
    }

    @Override
    void adicionaBebidaAlcoolica() {
        System.out.println("Adicionando Bebidas Alcóolicas");
    }
}