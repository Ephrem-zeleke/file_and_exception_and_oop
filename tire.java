package object_oriented_programming;

public class tire implements Comparable<tire>{
    // create a variable or field that the program will have

    private String name;
    private double price;
    private int warrantyMiles;

    public tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000Miles(){
        double pricePer1000 = (this.price /warrantyMiles) * 1000;
        return pricePer1000;

    }
    public double costForSet(){
        return this.price * 4;
    }
    @Override
    public String toString(){
        double pricePer1000 = pricePer1000Miles();
        return String.format("%s costs $%.2f per tire. cost per 1000 miles is $%.2f.",this.name, this.price, pricePer1000);

    }

    @Override
    public int compareTo(tire anotherTire){
        // we use the price per 1000 miles to compare the tires
        return Double.compare(pricePer1000Miles(), anotherTire.pricePer1000Miles());

    }


}
