import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter alphabet:");
        char ch=sc.next().charAt(0);
        VowelConsonant obj = new VowelConsonant();
        obj.consonant(ch);
        obj.vowel(ch);

    }
    public void consonant(char a)
    {
        if (!(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'))
        {
            System.out.println(a+"is a consonent");
        }
        System.out.println(a+"is not a consonent");
    }

    public void vowel(char a)
    {
       switch (a){
           case 'a':
               System.out.println(a+"is a vowel");
               break;
           case 'e':
               System.out.println(a+"is a vowel");
               break;
           case 'i':
               System.out.println(a+"is a vowel");
               break;
           case 'o':
               System.out.println(a+"is a vowel");
               break;
           case 'u':
               System.out.println(a+"is a vowel");
               break;
           default:
               System.out.println(a+" is a consonent");
       }

    }
}
