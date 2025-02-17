import java.util.Scanner;

public class EvenNumbersArray2D {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows= scanner.nextInt();
        System.out.println("Enter the number of the columns: ");
        int cols=scanner.nextInt();

        int[][] numbers=new int[rows][cols];
        System.out.println("\nEnter the elements of the 2D array: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.println("Element [" + i +"]["+ j +"]: ");
                numbers[i][j]=scanner.nextInt();

                System.out.println("\nEven numbers in the 2D array:");
                for (int x = 0; x <rows; x++){
                    for (int y=0; y <cols; y++){
                        if (numbers[x][y] % 2 == 0){
                            System.out.print(numbers[x][y] + " ");
                        }
                    }
                }
                System.out.println();

            }
        }
    }
}
