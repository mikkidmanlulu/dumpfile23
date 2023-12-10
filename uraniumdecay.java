import java.util.Scanner;
import java.lang.Math;
class MouseDecay
{
    public static void main(String[] args)
    {
        double lambda = 9.72E-10;
        double safeMass = 0.5;
        System.out.print("Enter the initial mass of Uranium-235 in grams: ");
        Scanner scanner = new Scanner (System.in);
        double startingMass = scanner.nextdouble();
        double timeInYears = (-1 / lambda) * Math.log(safeMass / startingMass);
        System.out.println("Time taken in years to decay to 0.5g: " + timeInYears);
    }
}