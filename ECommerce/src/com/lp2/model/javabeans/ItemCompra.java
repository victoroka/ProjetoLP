/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.model.javabeans;

import java.io.Serializable;

/**
 *
 * @author VictorOka
 */
public class ItemCompra extends Produto implements Serializable {
    
    private double totalItem;

    public ItemCompra(double totalItem, int productCode, String productName, double price, int quantity) {
        super();
        this.totalItem = calculateTotalItem(price, quantity);
    }

    public double calculateTotalItem (double price, int quantity) {
        double totalItem = price * quantity;
        return totalItem;
    }

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }

    @Override
    public String toString() {
        return "ItemCompra{" + "totalItem=" + totalItem + '}';
    }
    
}
