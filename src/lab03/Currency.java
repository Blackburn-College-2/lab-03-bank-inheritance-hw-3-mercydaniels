/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author mercy.daniels
 */
public class Currency {

    private String name;
    private String symbol;

    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
/**
 * determines if two currency types are the same
 * @param object currency to be compared
 * @return boolean
 */
    public boolean equals(Object object) {
        if (this.name.equals(object)) {
            return true;
        } else {
            return false;
        }
    }
}
