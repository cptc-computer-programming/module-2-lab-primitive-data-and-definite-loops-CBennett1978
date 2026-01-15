package day2.part01_receipt_totals;

public class ReceiptTotals {

    public static void main(String[] args) {
        printReceiptSummary();
        printClosingCountdown();
    }

    // Scenario:
    // A store sold items numbered 100 through 105.
    // Each item costs $5.
    // Every 3rd item starting at 100 is on sale for $3 instead.
    //
    // TODO:
    // - Calculate and print the total cost.
    // - Do NOT hard-code the total.
    public static void printReceiptSummary() {
        int totalCost = 0;
    } {
        //loop through items 100 to 105
        for (int item=100; item ++) {
            if (item = 100)
        } {
            //take a running total
            //where every item is $5
            totalCost += 5;
            //except every 3rd item is $3
            if (item % 3 == 0) {
                totalCost -= 2; //reduce $2 from $5 to make it $3
            }

        
        })
    }

    // TODO:
    // Print a countdown from 5 down to 0 on one line.
    public static void printClosingCountdown() {
    printClosingCountdown();
    for (int i=5; i>=0; i --) {
        System.out.print(i + "");   
    }
    }
    
}

