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
public abstract class Sanduiche{
    String name;

    Flash flash;
    Sauce sauce;
    Salad salad[];
    Bread bread;
    
    abstract void prepare();
    
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (flash != null) {
                result.append(flash);
                result.append("\n");
        }
        if (sauce != null) {
                result.append(sauce);
                result.append("\n");
        }
        if (bread != null) {
                result.append(bread);
                result.append("\n");
        }
        if (salad != null) {
                for (int i = 0; i < salad.length; i++) {
                        result.append(salad[i]);
                        if (i < salad.length-1) {
                                result.append(", ");
                        }
                }
                result.append("\n");
        }
        return result.toString();
    }
}
