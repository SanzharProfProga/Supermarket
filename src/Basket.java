import java.math.BigDecimal;

public class Basket {
    private Product [] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public int GetPriceProduct (){
        BigDecimal decimal = new BigDecimal(0);
        for (Product c:getProducts()) {
            decimal.add(c.getPrice());
        }
        int decimalInt = decimal.intValue();
        return  decimalInt;  }
}
