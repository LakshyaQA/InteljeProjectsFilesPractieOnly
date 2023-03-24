package Prefix;

public class string3 {
        static String remove_e(String str, char C)
        { for (int i = 0; i < str.length(); i++)
            { if (str.charAt(i) == C)
                { str = str.substring(0, i) + str.substring(i + 1);
                    break; }
            }
            for (int i = str.length() - 1; i > -1; i--)
            { if (str.charAt(i) == C)
                { str = str.substring(0, i) + str.substring(i + 1);
                    break;}
            } return str; }
        public static void main(String[] args)
        {   String str = "codedecode";
            char C = 'e';
            System.out.println(remove_e(str, C));
        }
    }