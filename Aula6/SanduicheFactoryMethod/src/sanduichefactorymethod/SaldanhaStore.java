/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author junio
 */
public class SaldanhaStore extends SanduicheStore{
    Sanduiche createSanduiche(String item){
        if(item.equals("xsalada")){
            return new XSaladaSaldanha();
        }else if(item.equals("xegg")){
            return new XEggSaldanha();
        }else if(item.equals("natural")){
            return new NaturalSaldanha();
        }else if(item.equals("xtudo")){
            return new XTudoSaldanha();
        } return null;
    }
}
