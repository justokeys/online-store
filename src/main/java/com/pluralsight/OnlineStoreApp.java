package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStoreApp  {
    static Scanner thescanner = new Scanner(System.in);
    static ArrayList<Products>forSale = new ArrayList<>();
    static ArrayList<Products>sold = new ArrayList<>();

    public static void main(String[] args) {

       getInventory();

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

        boolean appRunning = true;


        while (appRunning){
            System.out.println("""
        --- Select an Option ---
        1 - Display Products
        2 - Display CART
        3 - EXIT (Close program)
        
        """);

            int userInput = thescanner.nextInt();

            switch (userInput){

                case 1:
                    displayProducts();
                    break;
                case 2:
                   //displayCart();
                    break;
                case 3:
                    System.out.println("Thank you visiting The MacroCenter");
                    System.out.println(
                            "⣿⣿⠿⠿⠿⠿⣿⣷⣂⠄⠄⠄⠄⠄⠄⠈⢷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
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
               // default:
                    //System.out.println("Invalid option. Please try again.");
                   // break;

            }

        }

    }
    // Retrives data from the csv file, parses and formats that data
    public static void getInventory() {

        try{
            FileReader fileReader = new FileReader("src/main/resources/products (1).csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null){

                String[] productsAll = line.split("\\|");

                String sku = productsAll[0];
                String productName = productsAll[1];
                double price = Double.parseDouble(productsAll[2]);
                String department = productsAll[3];

                Products allProductsFS = new Products(sku,productName,price,department);

                forSale.add(allProductsFS);


            }


            bufferedReader.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    // Displays all items we currently for sale
    public static void displayProducts(){

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





        }
    }



}
