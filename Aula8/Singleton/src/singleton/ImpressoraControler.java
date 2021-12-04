/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

public class ImpressoraControler {
    public static void main(String args[]) {
        Impressora impressao = Impressora.getInstance();
        impressao.fill();
        impressao.empty();
    }
}
