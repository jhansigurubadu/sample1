package Helloworld;

public class Addition {
     int age=22;


    public static void main(String[] args){
        int num1 = 5, num2 = 15, sum;
        sum = num1 + num2;
        System.out.println("sum of these numbers:"+ sum);

        Addition object=new  Addition();
        System.out.println("sum of these numbers:"+ object.age);


    }
}
