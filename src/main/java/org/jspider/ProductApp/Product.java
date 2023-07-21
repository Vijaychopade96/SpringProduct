package org.jspider.ProductApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private  int productId;
    private String productName;
    private double productPrice;

}
