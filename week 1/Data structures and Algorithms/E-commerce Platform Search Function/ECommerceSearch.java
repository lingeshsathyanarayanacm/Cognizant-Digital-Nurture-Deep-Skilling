import java.util.*;
class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "[" + productId + " - " + productName + " - " + category + "]";
    }
}

public class ECommerceSearch {

    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.productId == productId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int productId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == productId) {
                return products[mid];
            } else if (products[mid].productId < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear newline
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }
        Arrays.sort(products);

        System.out.print("\nEnter Product ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        System.out.print("Choose Search Method (1 for Linear, 2 for Binary): ");
        int method = sc.nextInt();

        Product result = null;

        if (method == 1) {
            result = linearSearch(products, searchId);
        } else if (method == 2) {
            result = binarySearch(products, searchId);
        } else {
            System.out.println("Invalid method selected.");
            return;
        }

        System.out.println("\n Search Result:");
        if (result != null)
            System.out.println(" Product Found: " + result);
        else
            System.out.println(" Product Not Found.");
    }
}
