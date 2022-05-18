package javastrings;

public class StringBufferCh {
    public static void main(String[] args) {
        StringBuffer hs = new StringBuffer("jhansidevi");
        int p=hs.length();
        int q=hs.capacity();
        System.out.println("length of the string:"+p);
        System.out.println("capacity of the string:"+q);
        hs.append(" kiran");
        System.out.println(hs);
        hs.append(1);
        System.out.println(hs);
        hs.insert(0," string ");
        System.out.println(hs);
        hs.insert(0," false ");
        System.out.println(hs);
        hs.insert(0," toys ");
        System.out.println(hs);
        hs.insert(0," sony ");
        System.out.println(hs);
        char jhan_arr[]={'p','r','i','y','a','n','k','a'};
        hs.insert(0," jhan +");
        System.out.println(hs);
        hs.reverse();
        System.out.println(hs);
        hs.delete(0,5);
        System.out.println(hs);
        hs.charAt(7);
        System.out.println(hs);
        hs.replace(0,5,"devi");
        System.out.println(hs);
    }
}
