import java.util.*;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Qty: %d | Price: ₹%.2f",
                productId, productName, quantity, price);
    }
}

public class Inventorysystem {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n======= Inventory System =======");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Products");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": addProduct(); break;
                case "2": updateProduct(); break;
                case "3": deleteProduct(); break;
                case "4": viewProducts(); break;
                case "5": System.out.println("Exiting system."); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        String id = scanner.nextLine();
        if (findProductIndexById(id) != -1) {
            System.out.println("Product ID already exists.");
            return;
        }
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        productList.add(new Product(id, name, qty, price));
        System.out.println("Product added.");
    }

    private static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        String id = scanner.nextLine();
        int index = findProductIndexById(id);
        if (index == -1) {
            System.out.println("Product not found.");
            return;
        }

        System.out.print("Enter new Quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product p = productList.get(index);
        p.setQuantity(qty);
        p.setPrice(price);
        System.out.println("Product updated.");
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        String id = scanner.nextLine();
        int index = findProductIndexById(id);
        if (index == -1) {
            System.out.println(" Product not found.");
            return;
        }
        productList.remove(index);
        System.out.println("Product deleted.");
    }

    private static void viewProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("Product List:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    private static int findProductIndexById(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
