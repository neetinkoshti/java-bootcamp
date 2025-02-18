package ntn.com.designpattern.creationaldesignpattern;

public class BuilderDesignPatternImpl {

    public static void main(String[] args) {

     Product product =  new Product.ProductBuilder()
                .setProductId(101)
                .setProductName("Computer")
                .setProductPrice(1232.15)
                .build();

        System.out.println(product);
    }
}

/**
 *  Steps to create Builder pattern
 *   1. Create a class which has multiple attributes like Product
 *   2. Create a static inner class as Builder for product class ,which has setter method to set attributes of product class
 *   3. Create a build class , which returns actual Product class object
 */

class Product{

    int productId ;
    String productName;
    double productPrice;
    String productCategory;
    String productDesc;


    private Product(int productId, String productName, double productPrice, String productCategory, String productDesc) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }

    public static class ProductBuilder{

        int productId ;
        String productName;
        double productPrice;
        String productCategory;
        String productDesc;

        public ProductBuilder setProductId(int productId){
            this.productId = productId;
            return this;
        }

        public ProductBuilder setProductName(String productName){
            this.productName = productName;
            return this;
        }

        public ProductBuilder setProductPrice(double productPrice){
            this.productPrice = productPrice;
            return this;
        }

        public ProductBuilder setProductCategory(String productCategory){
            this.productCategory = productCategory;
            return this;
        }

        public ProductBuilder setProductDesc(String productDesc){
            this.productDesc = productDesc;
            return this;
        }

        public Product build(){
            return new Product(productId,productName,productPrice,productCategory,productDesc);
        }
    }
}
