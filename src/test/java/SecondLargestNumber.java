public class SecondLargestNumber {
    public static void main(String[] args) {

        int [] numbers={12, 45, 55, 78, 23, 47, 45};
        if (numbers.length <2){
            System.out.println("Array should have at least two elements. ");
            return;
        }
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:numbers){
            if(num >firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }else if(num >secondLargest && num !=firstLargest){
                secondLargest=num;
            }
        }
        if (secondLargest==Integer.MIN_VALUE){
            System.out.println("No second largest number found. ");
        }else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
