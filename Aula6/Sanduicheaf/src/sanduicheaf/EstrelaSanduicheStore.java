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
public class EstrelaSanduicheStore extends SanduicheStore{
    protected Sanduiche createSanduiche(String item) {
        Sanduiche sanduiche = null;
        SanduicheIngredienteFactory ingredienteFactory = new EstrelaSanduicheFactory();

        if (item.equals("xsalada")) {

                sanduiche = new XSalada(ingredienteFactory);
                sanduiche.setName("XSalada estilo Estrela");

        } else if (item.equals("xbacon")) {

                sanduiche = new XBacon(ingredienteFactory);
                sanduiche.setName("XBacon estilo Estrela");

        } else if (item.equals("xegg")) {

                sanduiche = new XEgg(ingredienteFactory);
                sanduiche.setName("XEgg estilo Estrela");

        } else if (item.equals("xtudo")) {

                sanduiche = new XTudo(ingredienteFactory);
                sanduiche.setName("XTudo estilo Estrela");

        } else if (item.equals("natural")) {

                sanduiche = new Natural(ingredienteFactory);
                sanduiche.setName("Natural estilo Estrela");

        }
        return sanduiche;
    }
}
