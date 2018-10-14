import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);

        String param = in.nextLine();

        System.out.println(compress(param));

    }

    public static String compress(String param) {
        String ans = "";
       int count = 1;

       for(int i=0; i<param.length()-1; i++){


              if(param.charAt(i) == param.charAt(i+1)){
                  count++;
              }else {
                  ans = ans + Character.toString(param.charAt(i)) + count;
                  count = 1;
              }

       }
        ans = ans + Character.toString(param.charAt(param.length()-1)) + count;

       if(param.length() < ans.length()){
           return param;
       }

       return ans;
    }



}
