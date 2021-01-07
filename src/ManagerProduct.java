import java.util.ArrayList;
import java.util.List;

public class ManagerProduct {
    List<Product> listProduct;

    public ManagerProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public static final String FILE_NAME = "product.obj";
    public void addNew(Product product){
        listProduct.add(product);
        ProductReadAndWrite.writeFile(listProduct,FILE_NAME);
    }
    public void showAll(){
        for (Product product: listProduct) {
            System.out.println(product);
        }
    }
    public void readFile(){
       listProduct = (List<Product>) ProductReadAndWrite.readFile(FILE_NAME);
        showAll();
    }
}
