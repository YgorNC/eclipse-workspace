package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Product> list = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            
            if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'u') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(name, price));
            }
            sc.nextLine();
        }
        
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod);
        }
        
        sc.close();
    }
}
