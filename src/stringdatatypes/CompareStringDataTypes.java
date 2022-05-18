package stringdatatypes;

public class CompareStringDataTypes {
    public static void main(String[] args) {
        String str="india";
        char arr[]=str.toCharArray();
        System.out.println(arr);
        int count=0;
        for (char a:arr) {
            count++;
        }
            System.out.println(count);
            System.out.println(("number of vowels"+ count ));


    }
}
