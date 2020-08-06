package TesTing;

import java.util.Scanner;

public class ProjectileTrajectory {
    public static final double ACCELERATION=-9.81;
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("velocity(meters/second)?");
        double velocity=console.nextDouble();
        System.out.println("angle (degrees)? ");
        double angle=Math.toRadians(console.nextDouble());
        System.out.println("number of steps to display? ");
        int steps = console.nextInt();
        double xVelocity = velocity * Math.cos(angle);
        double yVelocity = velocity * Math.sin(angle);
        double totalTime = -2.0 * yVelocity / ACCELERATION;
        double timeIncrement = totalTime / steps;
        double xIncrement = xVelocity * timeIncrement;
        double x=0.0;
        double y=0.0;
        double t=0.0;
        System.out.println("step\tx\ty\ttime");
        System.out.println("0\t0.0\t0.0\t0.0");
        for(int i=1;i<=steps;i++){
            t +=timeIncrement;
            x +=xIncrement;
            y =yVelocity *t+0.5*ACCELERATION*t*t;
            System.out.println(i +"\t"+ round2(x)+"\t"+ round2(y)+"\t"+round2(t));
        }


    }
    public static double round2(double n){
        return Math.round(n*100)/100;
    }
}
