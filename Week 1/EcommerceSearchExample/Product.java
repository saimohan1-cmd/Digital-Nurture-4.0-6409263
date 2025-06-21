package EcommerceSearchExample;
import java.util.*;
public class Product {
    int productId;
    String productName;
    String category;
    public Product(int productId,String productName,String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public static Product linearSearch(Product[] products,String nameOfTarget){
        for (int i = 0; i < products.length; i++) {
            if(products[i].productName.equalsIgnoreCase(nameOfTarget)){
                return products[i];
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products,String nameOfTarget){
        int st = 0;
        int en = products.length -1;
        nameOfTarget = nameOfTarget.toLowerCase();
        while (st<=en) {
            int mid = st+(en-st)/2;
            String midProduct = products[mid].productName.toLowerCase();
            int comp = midProduct.compareTo(nameOfTarget);
            if(comp ==0 ){
                return products[mid];
            }
            else if(comp<0){
                st = mid +1;
            }
            else{
                en = mid -1;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product [] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103,"Smart Phone","Electronics"),
            new Product(104, "Sofa", "Home Appliances"),
            new Product(105, "Bed", "Home Appliances"),
        };
        System.out.print("Enter the name of the product you want to search: ");
        String productName = scan.nextLine();
        System.out.println("Linear Search by using product name");
        Product linearResult = linearSearch(products, productName);
        if (linearResult==null) {
            System.out.println( productName+" not found");
        }
        else{
            System.out.println(productName+" found ");
        }
        Arrays.sort(products,Comparator.comparing(p->p.productName.toLowerCase()));
        Product binaryResult = binarySearch(products, productName);
        System.out.println("Binary Search by using product name");
        if(binaryResult==null){
            System.out.println(productName+" not found ");
        }
        else{
            System.out.println(productName+" found ");
        }
        scan.close();
        
    }

}
