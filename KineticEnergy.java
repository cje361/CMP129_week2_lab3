import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is object's mass (in kilograms): ");
        int mass = input.nextInt();

        System.out.println("What is object's velocity (in meters per second): ");
        int velocity = input.nextInt();


        double KineticEnergy= 0.5* mass * Math.pow(velocity,2);

        System.out.println("The amount of kinetic energy it has is: " + KineticEnergy);

    }
}
