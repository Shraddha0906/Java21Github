package collectionframework;

import java.util.*;

public class ProductDemo {

    int id;
    String productName;
    Integer quantity;
    Double price;

    public ProductDemo(int id, String productName, Integer quantity, Double price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;

    }

    public static void main(String[] args) {
        ProductDemo obj1=new ProductDemo(1,"Fan",10,900.5);
        ProductDemo obj2=new ProductDemo(1,"Tv",10,900.5);
        ProductDemo obj3=new ProductDemo(1,"Adapter",10,900.5);
        List<ProductDemo>list= Arrays.asList(obj1,obj2,obj3);
        int qty;
        String prName;
        char choice=0;
        Scanner scan=new Scanner(System.in);
         do {
             System.out.println("Enter the product name and quantity");
             prName= scan.next();
             qty= scan.nextInt();
             System.out.println("Do you want to continue");
             choice=scan.next().charAt(0);
             String finalPrName=prName;
             Integer q=qty;
             list.forEach(s->{
                 if (finalPrName.equals(s.productName)){
                     s.quantity=s.quantity-q;

                 }
             });
         }while (choice=='Y' || choice=='y');
             list.forEach(s->{
                 System.out.println(s.productName+ ""+s.quantity);
             });
        }
    }





