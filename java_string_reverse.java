import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        StringBuilder B=new StringBuilder();
        B.append(A);
        B=B.reverse();
        if(A.equals(B.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
