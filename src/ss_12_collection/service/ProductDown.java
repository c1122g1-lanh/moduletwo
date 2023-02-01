package ss_12_collection.service;

import ss_12_collection.controller.Product;
import ss_12_collection.model.ProductModel;

import java.util.Comparator;

public class ProductDown implements Comparator<ProductModel> {

    @Override
    public int compare(ProductModel o1, ProductModel o2) {
        return (o2.getPrice() - o1.getPrice());
    }
}
