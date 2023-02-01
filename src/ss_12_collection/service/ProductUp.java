package ss_12_collection.service;

import ss_12_collection.controller.Product;
import ss_12_collection.model.ProductModel;

import java.util.Comparator;

public class ProductUp implements Comparator<ProductModel> {
    @Override
    public int compare(ProductModel o1, ProductModel o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
