import javax.naming.PartialResultException;

public class MaximumNumberArray {
    public static void main(String[] args) {
        int arr[]={5,165,27,34,59,66};
        int max=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("maximum value array:"+max);
        }
    }

