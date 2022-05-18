public class CalculatorSwitchStatement {
    public static void main(String[] args) {
        int num1,num2,result;
        char operator;
        CalculatorSwitchStatement obj=new CalculatorSwitchStatement();
        System.out.println("choose operators:"+"+,-,*,/");
        operator='+';
        System.out.println("enter 1st number");
        num1= 2;
        System.out.println("enter 2nd number");
        num2=3;
        switch (operator){
            case '+':
                result=num1+num2;
                System.out.println(num1+"+"+num2+"="+result);
            case '-':
                result=num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
            case '*':
                result=num1*num2;
                System.out.println(num1+"*"+num2+"*"+result);
            case '/':
                result=num1/num2;
                System.out.println(num1+"/"+num2+"/"+result);
                break;
        }
}
}
