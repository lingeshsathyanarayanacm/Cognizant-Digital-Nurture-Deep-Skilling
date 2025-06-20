import java.util.*;
class Order{
    private int orderId;
    private String customerName;
    private double totalPrice;
    public Order(int id,String name,double price ){
            this.orderId = id;
            this.customerName = name;
            this.totalPrice = price;
    }

    public int getorderId(){
        return orderId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public double getPrice(){
        return totalPrice;
    }
    @Override
    public String toString(){
        return "Product{" +
        "productId=" + orderId +
        ", CustomerName='" + customerName + '\'' +
        ", price='" + totalPrice + '\'' +
        '}';
    }
}
class Bubblesort{
    public static void bubblesort(Order[] orders){
            int n = orders.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(orders[j].getPrice() > orders[j+1].getPrice()){
                        Order temp = orders[j];
                        orders[j]=orders[j+1];
                        orders[j+1] = temp;
                    }
                }
            }
        }
}

class QuickSort{
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }
    public static int partition(Order[] orders,int l, int h){
        double pivot = orders[h].getPrice();
        int i = l-1;
        for(int j=l;j<h;j++){
            if(orders[j].getPrice() <= pivot){
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j]= temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[h];
        orders[h] = temp;
        return i+1;
    }
}
public class sortCustomerOrder {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(3, "Avi", 3735.00),
                new Order(1, "Nolan", 2985.50),
                new Order(4, "Angela", 1524.00),
                new Order(2, "Gary", 1487.25),
                
        };

        System.out.println("Original Orders:");
        for(Order o : orders){
            System.out.println(o);
        }

       
        Bubblesort.bubblesort(orders);
        System.out.println("\nSorted Orders (Bubble Sort):");
        System.out.println(Arrays.toString(orders));

        
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nSorted Orders (Quick Sort):");
        System.out.println(Arrays.toString(orders));
    }
}