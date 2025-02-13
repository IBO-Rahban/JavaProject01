import java.util.Scanner;

public class TemperaturesAnalysis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] temperatures = new double [7];

        System.out.println("Enter temperatures for the week:");
        for (int i=0; i<7; i++){
            System.out.println("Day " + (i+1)+": ");
            temperatures[i]= scanner.nextDouble();
        }
        double highest=temperatures[0];
        double lowest =temperatures[0];

        for(int i=1; i< temperatures.length; i++){
            if (temperatures[i]>highest){
                highest=temperatures[i];
            }
        }
        System.out.println("\nHighest temperatures of the week:"+ highest+ "°C");
        System.out.println("Lowest temperatures of the week: "+ lowest + "°c");

        scanner.close();

    }
}


