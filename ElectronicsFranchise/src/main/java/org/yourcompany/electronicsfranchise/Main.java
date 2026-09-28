package org.yourcompany.electronicsfranchise;

public class Main {

    public static void main(String[] args) {


        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };
        int[][] sales = {
            {1000, 2000, 3000},  
            {2000, 3000, 4000},  
            {1500, 1100, 1200}   
        };

        System.out.println("---------------------------------------------");
        System.out.println("           GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");

        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "CITY", "PS5", "XBOX", "SWITCH");

        System.out.println("---------------------------------------------");

        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("---------------------------------------------");

        int[] cityTotals = new int[cities.length];

        for (int i = 0; i < sales.length; i++) {
            cityTotals[i] = sales[i][0]
                          + sales[i][1]
                          + sales[i][2];
        }

        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n",
                    cities[i], cityTotals[i]);
        }

        System.out.println("---------------------------------------------");

        int highestSales = cityTotals[0];
        String cityWithMostSales = cities[0];

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                cityWithMostSales = cities[i];
            }
        }

        System.out.println("CITY WITH THE MOST SALES: "
                + cityWithMostSales);

        System.out.println("---------------------------------------------");
    }
}