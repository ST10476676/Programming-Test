package org.yourcompany.console;

public class RunApplication {

    public static void main(String[] args) {


        ConsoleSales console = new ConsoleSales(
                "PS5",
                "Number 1 Electronics",
                5000
        );

        console.printReport();
    }
}
