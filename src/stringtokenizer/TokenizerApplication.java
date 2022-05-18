package stringtokenizer;
import java.util.StringTokenizer;
public class TokenizerApplication {
    public static  void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my name is jhansi"," ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());

        }


    }
}
