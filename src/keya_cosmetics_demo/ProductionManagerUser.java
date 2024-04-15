/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keya_cosmetics_demo;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ProductionManagerUser implements Serializable {
    private int productName;
    private String productId;
    private String productionCost;
    private String productionDate;

    public int getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductionCost() {
        return productionCost;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductName(int productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductionCost(String productionCost) {
        this.productionCost = productionCost;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "ProductionManagerUser{" + "productName=" + productName + ", productId=" + productId + ", productionCost=" + productionCost + ", productionDate=" + productionDate + '}';
    }

    public ProductionManagerUser(int productName, String productId, String productionCost, String productionDate) {
        this.productName = productName;
        this.productId = productId;
        this.productionCost = productionCost;
        this.productionDate = productionDate;
    }
    private static final Logger LOG = Logger.getLogger(ProductionManagerUser.class.getName());
    
    
}
