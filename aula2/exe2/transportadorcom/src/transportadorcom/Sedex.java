/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadorcom;

/**
 *
 * @author junio
 */
public class Sedex implements Frete{

    @Override
    public double calcularPreco(int distancia) {
        return distancia * 1.45 + 12;
    }
    
}
