package object_oriented_programming;

public class pool {

    private String name; // a field or variable. variables in a class called field
    private double length; // another field or variable

    // the next thing we add is constructor and it will have the name as a class and it is a special method
    // it doesn't have a return

    pool(String name, double length){
       this.name = name;
       this.length = length;
    }
    // let's make another method and it is going to be public
    // methods belongs to classes is called instant method
    public double distanceForLaps(int laps){
        // calculating the distance how far they swim

        double total = laps * this.length;
        return total;

    }
    // let's add another instant method that give us a length description about the swimming pool

    public String toString(){
        String description = this.name + " pool is " + length + " meters long";
        return description;
    }

}
