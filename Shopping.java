import java.util.Scanner;

public class Shopping{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Customer Name:");
        String name = input.nextLine();
        System.out.println("--------------------");
        System.out.print("Enter product 1:");
        String product1 = input.nextLine();
        System.out.print("Enter product 2:");
        String product2 = input.nextLine();
        System.out.print("Enter product 3:");
        String product3 = input.nextLine();
        System.out.println("--------------------");


        
        System.out.println("   PRICES   ");
        System.out.println("--------------------\n");

        System.out.print("Enter product1 price:");
        int price1 = input.nextInt();
        input.nextLine();
        System.out.print("Enter product2 price:");
        int price2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter product3 price:");
        int price3 = input.nextInt();
        input.nextLine();
        System.out.println("--------------------");
        System.out.println("\n");
        System.out.println("-------------------------------");
        System.out.println("Customer Name::" + name);
        System.out.println("-------------------------------");
        System.out.println("Product 1::" + product1);
        System.out.println("Product 2::" + product2);
        System.out.println("Product 3::" + product3);
        System.out.println("-------------------\n");
        System.out.println("  Product Prices  ");
        System.out.println("-----------------------");
        System.out.println("price of " + product1 + " is ::" + price1);
        System.out.println("price of " + product2 + " is ::" +  price2);
        System.out.println("price of " + product3 + " is ::" + price3);

        System.out.println("------------------------");
        
        System.out.println("-----------------------------------");
        System.out.println("Total Bill::" + (price1+price2+price3));
        int charge = 30;
        int total = price1+price2+price3+charge;
        System.out.println("Packaging Charge::" + charge);
        int finalbill = total;
        System.out.println("Final Bill::" + finalbill);

        int finalBill = total;
        boolean member = true;
        boolean eligible = finalBill >= 1000 && member;
        System.out.println("Eligible for Discount: " + eligible);

        String delivery = (finalBill>=1000)? "Free Delivery" : "Delivery Charges Apply";
        System.out.println("Delivery: " + delivery);
        System.out.println("-------------------------------------");
        System.out.println("           -----------------------         ");
        System.out.println("           THANK YOU FOR SHOPPING          ");
        System.out.println("           -----------------------         ");

        input.close();



    }
}