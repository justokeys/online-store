package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStoreApp {
    static Scanner thescanner = new Scanner(System.in);
    static ArrayList<Products> forSale = new ArrayList<>();
    static ArrayList<Products> sold = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        getInventory();
        boolean appRunning = true;


        while (appRunning) {
        System.out.println("                ----- MacroCenter -----");
        System.out.println("" +
                "      ___           ___           ___           ___     \n" +
                "     ╱╲  ╲         ╱╲  ╲         ╱╲  ╲         ╱╲__╲    \n" +
                "     ╲:╲  ╲       ╱::╲  ╲       │::╲  ╲       ╱:╱ _╱_   \n" +
                "      ╲:╲  ╲     ╱:╱╲:╲  ╲      │:│:╲  ╲     ╱:╱ ╱╲__╲  \n" +
                "      ╱::╲  ╲   ╱:╱  ╲:╲  ╲   __│:│╲:╲  ╲   ╱:╱ ╱:╱ _╱_ \n" +
                " ╱╲  ╱:╱╲:╲__╲ ╱:╱__╱ ╲:╲__╲ ╱::::│_╲:╲__╲ ╱:╱_╱:╱ ╱╲__╲\n" +
                " ╲:╲╱:╱  ╲╱__╱ ╲:╲  ╲ ╱:╱  ╱ ╲:╲~~╲  ╲╱__╱ ╲:╲╱:╱ ╱:╱  ╱\n" +
                "  ╲::╱__╱       ╲:╲  ╱:╱  ╱   ╲:╲  ╲        ╲::╱_╱:╱  ╱ \n" +
                "   ╲:╲  ╲        ╲:╲╱:╱  ╱     ╲:╲  ╲        ╲:╲╱:╱  ╱  \n" +
                "    ╲:╲__╲        ╲::╱  ╱       ╲:╲__╲        ╲::╱  ╱   \n" +
                "     ╲╱__╱         ╲╱__╱         ╲╱__╱         ╲╱__╱    ");


            System.out.println("""
                    --- Select an Option ---
                    1 - Display Products
                    2 - Display CART
                    3 - EXIT (Close program)
                    
                    """);

            int userInput = thescanner.nextInt();

            switch (userInput) {

                case 1:
                    displayProducts();
                    break;
                case 2:
                    //displayCart();
                    break;
                case 3:
                    System.out.println("Thank you visiting The MacroCenter");
                    System.out.println(
                                    "⣿⣿⠿⠿⠿⠿⣿⣷⣂⠄⠄⠄⠄⠄⠄⠈⢷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + "" +
                                    "⣷⡾⠯⠉⠉⠉⠉⠚⠑⠄⡀⠄⠄⠄⠄⠄⠈⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                    "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣿⣿⣿⣿⣿\n" +
                                    "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⠎⠄⠄⣀⡀⠄⠄⠄⠄⠄⠄⠄⠘⠋⠉⠉⠉⠉⠭\n" +
                                    "⡀⠄⠄⠄⠄⠄⠄⠄⠄⡇⠄⣠⣾⣳⠁⠄⠄⢺⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                    "⣿⣷⡦⠄⠄⠄⠄⠄⢠⠃⢰⣿⣯⣿⡁⢔⡒⣶⣯⡄⢀⢄⡄⠄⠄⠄⠄⠄⣀\n" +
                                    "⠓⠄⠄⠄⠄⠄⠸⠄⢀⣤⢘⣿⣿⣷⣷⣿⠛⣾⣿⣿⣆⠾⣷⠄⠄⠄⠄⢀⣀\n" +
                                    "⠄⠄⠄⠄⠄⠄⠄⠑⢘⣿⢰⡟⣿⣿⣷⣫⣭⣿⣾⣿⣿⣴⠏⠄⠄⢀⣺⣿⣿\n" +
                                    "⣿⣿⣿⣿⣷⠶⠄⠄⠄⠹⣮⣹⡘⠛⠿⣫⣾⣿⣿⣿⡇⠑⢤⣶⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣯⣤⣤⣤⣤⣀⣀⡹⣿⣿⣷⣯⣽⣿⣿⡿⣋⣴⡀⠈⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣝⡻⢿⣿⡿⠋⡒⣾⣿⣧⢰⢿⣿⣿⣿⣿⣿");
                    appRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;

            }

        }

    }

    // Retrives data from the csv file, parses and formats that data
    public static void getInventory() {

        try {
            FileReader fileReader = new FileReader("src/main/resources/products (1).csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] productsAll = line.split("\\|");

                String sku = productsAll[0];
                String productName = productsAll[1];
                double price = Double.parseDouble(productsAll[2]);
                String department = productsAll[3];

                Products allProductsFS = new Products(sku, productName, price, department);

                forSale.add(allProductsFS);


            }


            bufferedReader.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    // Displays all items we currently for sale
    public static void displayProducts() throws InterruptedException {

        boolean appRunning = true;

        while (appRunning) {


            System.out.print(
                    """
                            ======================================================================
                               *                    MACROCENTER INVENTORY                   *
                            ======================================================================
                             Price      | Product Name                   | Department     | SKU
                            ----------------------------------------------------------------------
                            """
            );

            for (Products product : forSale) {
                System.out.printf("SKU: %s | %s | %s | %.2f\n", product.getsKU(), product.getProductName(), product.getDepartment(), product.getPrice());

            }
            System.out.println(
                    """
                            ----------------------------------------------------------------------                   
                            ======================================================================
                            """
            );
            System.out.println("""
                    
                    =========================================
                             PRODUCT INVENTORY MENU
                    =========================================
                    What would you like to do next?
                    
                    1 - Search or Filter Products
                    2 - Add a Product to Cart
                    3 - Go Back to Main Menu
                    =========================================
                    Enter command:\s""");
            int userInput = thescanner.nextInt();

            switch (userInput) {

                case 1:
                    searchAndFilter();
                    break;
                case 2:
                    addToCart();
                    break;

                case 3:
                    appRunning = false;
                    break;


            }


        }

    }

    public static void searchAndFilter() {
        boolean appRunning = true;

        while (appRunning) {
            System.out.println("1 - Search by SKU");
            System.out.println("2 - Search by Price range");
            System.out.println("3 - Search by Department");
            System.out.println("4 - Search by Product Name");
            System.out.println("5 - Exit back to main menu");
            int userInput = thescanner.nextInt();
            thescanner.nextLine();
            switch (userInput) {

                case 1:
                    System.out.print("Enter SKU: ");
                    String sku = thescanner.nextLine();
                    for (Products currentProduct : forSale) {

                        if (sku.equalsIgnoreCase(currentProduct.getsKU())) {

                            System.out.printf("SKU: %s | %s | %s | %.2f\n", currentProduct.getsKU(), currentProduct.getProductName(), currentProduct.getDepartment(), currentProduct.getPrice());

                        }
                    }
                    break;
                case 2:
                    sortbyPrice();
                    break;
                case 3:
                    System.out.print("Enter Department: ");
                    String department = thescanner.nextLine();
                    for (Products currentProduct : forSale) {

                        if (department.equalsIgnoreCase(currentProduct.getDepartment())) {

                            System.out.printf("SKU: %s | %s | %s | %.2f\n", currentProduct.getsKU(), currentProduct.getProductName(), currentProduct.getDepartment(), currentProduct.getPrice());

                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter Product Name: ");
                    String nameP = thescanner.nextLine();
                    for (Products currentProduct : forSale) {

                        if (nameP.equalsIgnoreCase(currentProduct.getProductName())) {

                            System.out.printf("SKU: %s | %s | %s | %.2f\n", currentProduct.getsKU(), currentProduct.getProductName(), currentProduct.getDepartment(), currentProduct.getPrice());

                        }
                    }
                    break;
                case 5:
                    appRunning = false;
                    break;


            }
        }


    }

    public static void sortbyPrice() {
        boolean appRunning = true;

        while (appRunning)


            System.out.println("Enter price range minimum");
        double min = thescanner.nextDouble();
        System.out.println("Enter price range maximum");
        double max = thescanner.nextDouble();
        thescanner.nextLine();

        for (Products product : forSale) {

            if (product.getPrice() >= min && product.getPrice() <= max) {
                System.out.printf("SKU: %s | %s | %s | %.2f\n", product.getsKU(), product.getProductName(), product.getDepartment(), product.getPrice());

            }
        }


    }

    public static void addToCart() throws InterruptedException {

        boolean appRunning = true;
        while(appRunning) {

            Thread.sleep(1500);


            System.out.print(
                    """
                            ======================================================================
                               *                                                       *
                            ======================================================================
                             Price      | Product Name                   | Department     | SKU
                            ----------------------------------------------------------------------
                            """
            );

            for (Products product : forSale) {
                System.out.printf("SKU: %s | %s | %s | %.2f\n", product.getsKU(), product.getProductName(), product.getDepartment(), product.getPrice());

            }
            System.out.println(
                    """
                            ----------------------------------------------------------------------                   
                            ======================================================================
                            """
            );
            System.out.println("""
                    
                    =========================================
                                ADD TO CART
                    =========================================
                    TO ADD an Item enter SKU number 
                    
                    Return to menu Press ( X ) 
                    =========================================
                    Enter SKU:\s""");
            String userInput = thescanner.nextLine();

            if(userInput.equalsIgnoreCase("x")){

                appRunning = false;
            }

            for(Products itemPicked : forSale){

                if(userInput.equalsIgnoreCase(itemPicked.getsKU())){

                    sold.add(itemPicked);



                    System.out.println(itemPicked.getProductName() + " added to cart");


                }






            }


        }


    }


}




