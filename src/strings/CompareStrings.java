package strings;

 class CompareStrings {
    public static void main(String[] args) {
        String s1="kurnool";
        String s2="kammam";
        String s3=new String ("kurnool");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(!(s1 ==s2));
        System.out.println("replace s1 to other name:" +s1.replace("kurnool","kakinada"));
    }
}