package javabuilder;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringBuilderCh {
    public static void main(String[] args) {
        StringBuilder Ch=new StringBuilder("kurnool city");
        int k= Ch.length();
        int j= Ch.capacity();
        System.out.println("length of the string:"+k);
        System.out.println("capacity of the string:"+j);
        Ch.append(" sam ");
        System.out.println(Ch);
        Ch.append(" joy ");
        System.out.println(Ch);
        Ch.insert(0," mom ");
        System.out.println(Ch);
        Ch.reverse();
        System.out.println(Ch);
        Ch.delete(0,9);
        System.out.println(Ch);
        Ch.replace(0,5,"city");
        System.out.println(Ch);
    }
}
