public class SumEvenOdd2DArray {
    public static void main(String[] args) {

        int [][] numbers={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int evenSum=0;
        int oddSum=0;
        for (int i=0; i < numbers.length; i++){
            for (int j=0; j< numbers[i].length;j++){
                if (numbers[i][j]% 2==0){
                    evenSum+=numbers[i][j];
                }else {
                    oddSum+=numbers[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

}
