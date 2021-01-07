import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    static List<Product> productList = new ArrayList<>();
    static ManagerProduct managerProduct = new ManagerProduct(productList);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new");
            System.out.println("2. show all");
            System.out.println("3. read file");
            System.out.println("0. exit");
            System.out.println("Enter choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    managerProduct.showAll();
                    break;
                case 3:
                    managerProduct.readFile();
                    break;
                case 0:
                    break;
            }

        } while (choice != 0);
    }
    public static void addNew(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc1.nextLine();
        System.out.println("Enter codeProduct");
        String codeProduct = sc.nextLine();
        System.out.println("Enter price");
        double price = sc1.nextDouble();
        Product product = new Product(name,codeProduct,price);
        managerProduct.addNew(product);
    }
}
