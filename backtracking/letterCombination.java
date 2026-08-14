import java.util.*;
public class letterCombination {
    static String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static ArrayList<String> getKPC(String str){
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> ans = new ArrayList<>();

        String codeForCh = codes[ch-'0'];
        for(int i=0;i<codeForCh.length();i++){
            char chcode = codeForCh.charAt(i);
            for(String s : rres){
                ans.add(chcode+s);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
}
