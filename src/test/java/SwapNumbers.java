public class SwapNumbers {
    public static void main(String[] args) {
        int a=7, b=12;
        System.out.println("Before swapping:a="+a+ ",b="+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+",b="+b);
    }
}
