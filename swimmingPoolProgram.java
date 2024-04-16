package object_oriented_programming;

public class swimmingPoolProgram {
    public static void main(String[] args) {

        // now lets use the pool object here

        pool ymca = new pool("YMCA", 50);

        System.out.println(ymca);

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("the total swam distance is " + totalSwam + " meters");

        // we can create many objects as we want
        // as an example, lets create another objects for different pool


        pool Como = new pool("Como park", 25);
        System.out.println(Como);

        // we can calculate the total distance swam in como park pool if we swam 10 laps
        System.out.println("the total distance is " + Como.distanceForLaps(10) + " meters ");

        pool Edina = new pool("Edina pool", 50);
        // print the edina pool info by calling the toString instant method
        System.out.println(Edina);
        System.out.println("the total distance is " + Edina.distanceForLaps(12) + " meters");

    }
}
