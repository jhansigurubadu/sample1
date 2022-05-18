public class JavaLogicalOperators {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        if(num1<num2&&num2<num3) {
            int sum1 = num1 + num2 + num3;
            System.out.println("sum of numbers=" +sum1);
        }else{
            System.out.println("false condition");
        }

    }
}
