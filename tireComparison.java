package object_oriented_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class tireComparison {
    public static void main(String[] args) {
        //tire example = new tire("Bridgistone",50, 10000);
        //System.out.println("$" + example.pricePer1000Miles());
        //System.out.println(example);
        List<tire> tireList = new ArrayList<>();

        do{
           tire tire = getTireInfo();
           tireList.add(tire);
        }while (yesNoInput("More tire to add to compare:"));
        Collections.sort(tireList);
        printReportTable(tireList);
        
    }

    private static void printReportTable(List<tire> tireList) {
        for(tire tire: tireList){
            System.out.println(tire);
            System.out.println(tire.costForSet());
        }
    }

    private static tire getTireInfo() {
        String name = stringInput("Enter the name of the tire:");
        double price = positiveDoubleInput("Enter price of " + name + " ?");
        int mileWarranty = positiveIntInput("Enter number of miles warranty?");

        tire tire = new tire(name, price, mileWarranty);
        return tire;


    }
}
