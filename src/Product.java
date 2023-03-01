import java.util.Collection;

public class Product {
    private long id;
    private String productName;
    private String supplierName;

    public Product(long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {

        return this.id+" : "+this.productName+" : "+this.supplierName;
    }
}


