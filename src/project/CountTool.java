package project;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the count tool");
        int count = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            count++;
                if (count == 5) {
                    break;
                }
             StringTokenizer stk = new StringTokenizer(str);
                System.out.println(stk.countTokens());


            }
        }

    }


