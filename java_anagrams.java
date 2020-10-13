import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int[] c=new int[26];
        int[] d=new int[26];
        for(int i=0;i<26;i++){
            c[i]=0;
            d[i]=0;
        }
        for(int i=0;i<a.length();i++){
            c[(int)Character.toLowerCase(a.charAt(i))-97]++;
        }
        for(int i=0;i<b.length();i++){
            d[(int)Character.toLowerCase(b.charAt(i))-97]++;
        }
        for(int i=0;i<26;i++){
            if(c[i]!=d[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
