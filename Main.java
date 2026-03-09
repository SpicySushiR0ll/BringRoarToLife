import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int N,Nr,l; // Gear ratio, Num of rollers, num of lobes
        double D,d,E,rr,S,dl;

        /*
        D = rollers circle diameter
        d = Cycloidal disk base circle diamters
        E = Eccentricity
        rr = roller diameter
        S = rolling circle diameter
        dl = lobe diameter
         */

        // INTAKING PARAMETERS
        Scanner input = new Scanner(System.in);
        System.out.println("Cyclodial Disk Calulator\n"
        + "Enter Disired Gear ratio");

        N = input.nextInt();
//        System.out.println("Gear raito: " + N);

        System.out.println("Enter diameter of roller's circle");
        D = input.nextDouble();
        System.out.println("Enter roller's radius");
        rr = input.nextDouble();

//        System.out.println("Diameter of roller's circle: " + D);
//        System.out.println("Diameter of roller's diameter: " + rr);

        // Calculating other variables
        l = N;
        Nr = l;
        S = D/Nr;
        d = N*S;
        E = S/2; // Eccentricity is going to be start as most extreme
        dl = rr + (2*E);
        double quotient = D/(E*N);

        // disk equations
        System.out.println(String.format(("X = (%.2f * cos(t)) - (%.2f * cos(t + arctan((sin(" + (1-N)+ " * t))/((%.2f - cos(" + (1-N) + " * t)))))) - (%.2f * cos(" + N + " * t))"), D,rr, quotient, E));
        System.out.println(String.format(("Y = (-%.2f * sin(t)) + (%.2f * sin(t + arctan((sin(" + (1-N)+ " * t))/((%.2f - cos(" + (1-N) + " * t)))))) + (%.2f * sin(" + N + " * t))"), D,rr,quotient, E));

        // disk data
        System.out.println(String.format(("Diameter of cycloidal disk: %.2f "),d + (2 * 2 * rr)));
        System.out.println(String.format(("Eccentricity: %.2f "),E));
        System.out.println(String.format(("Num of rollers: %d "),Nr));
        System.out.println(String.format(("Diameter of lobes: %.2f "), dl));





    }
}