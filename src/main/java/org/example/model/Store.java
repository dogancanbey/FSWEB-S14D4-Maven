package org.example.model;

public class Store {

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];

        products[0] = new Chocolate("sweet", 15, "cklt");
        products[1] = new Bread("firin",5,"br","einkorn","brown");
        products[2] = new Coke("drinks",15,"asd",2.5,false);

    listProduct(products);
    }


    public static void listProduct(ProductForSale[] products){
        for(ProductForSale product: products){
            if(product != null){
                product.showDetails();
            }
        }
    }
}
