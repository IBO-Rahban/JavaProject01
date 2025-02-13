import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");

        int size = scanner.nextInt();

        int [] numbers = new int[size];

        System.out.println("Enter" + size + "integer value");
        for(int i=0; i<size; i++){
            System.out.println("Element" + (i + 1)+": ");
            numbers[i]=scanner.nextInt();
        }

        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println("\nThe sum of all elements in the array is: "+ sum);
        scanner.close();

    }
}
