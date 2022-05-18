public class SwapNumbers {
    public static void main(String[] args) {
        int i=10;
        byte b=1;
        short s=01;
        long l=12345678;
        float f=4.0f;
        double d=7.6;
        char ch='c';
        boolean a;
        float first=4.0f;
        float second=36.0f;
        System.out.println("before swapping");
        System.out.println("First number = "+first);
        System.out.println("second number="+second);
        float temp = first;
        first = second;
        second = temp;
        System.out.println("after swapping");
        System.out.println("First number = "+first);
        System.out.println("second number="+second);
        int a1=2;
        int b1=3;
        System.out.println("before swapping");
        System.out.println("a1= "+a1);
        System.out.println("b1="+b1);
        int temp1= a1;
        a1 = b1;
        b1 = temp1;

        System.out.println("after swapping");
        System.out.println("a1 = "+a1);
        System.out.println("b1="+b1);
        byte b11=16;
        byte b22=19;
        System.out.println("before swapping");
        System.out.println("b11 = "+b11);
        System.out.println("b22="+b22);
        byte temp2= b11;
        b11 = b22;
        b22 = temp2;
        System.out.println("after swapping");
        System.out.println("b11 = "+b11);
        System.out.println("b22="+b22);
        long l1=1011;
        long l2=1100;
        System.out.println("before swapping");
        System.out.println("l1 = "+l1);
        System.out.println("l2="+l2);
        long temp3= l1;
        l1 = l2;
        l2 = temp3;
        System.out.println("after swapping");
        System.out.println("l1 = "+l1);
        System.out.println("l2="+l2);
    }
}
