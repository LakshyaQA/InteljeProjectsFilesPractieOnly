
import java.util.ArrayList;
import java.util.List;


public class string2 {
    static String remove_e(String str, char C) {
        List<Character> s = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
        }
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i) == C) {
                s.remove(i);
                break;
            }
        }
        for (int i = s.size() - 1; i >= 0; i--) {
            if (s.get(i) == C) {
                s.remove(i);
                break;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char Ch : s) {
            sb.append(Ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "codedecode";
        char C = 'e';
        System.out.println(remove_e(str, C));
    }
}


