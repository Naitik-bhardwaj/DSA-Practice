public class removeDuplicates {
    public static void remove(String str, int idx, StringBuilder newStr, boolean[] map){
        if(idx == str.length()){
            System.out.print(newStr);
            return ;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            remove(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            remove(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean[] map = new boolean[26];
        remove(str, 0, new StringBuilder(), map);
    }
}