package TT;

public class StringUtil {
    public static String rPad(String s,char c,int n){
        if(s.length() < n){
            int cantCifrasFaltantes = n - s.length();
            String cifrasFaltantes = Character.toString(c);
            for (int j = 1; j < cantCifrasFaltantes; j++) {
                cifrasFaltantes += Character.toString(c);
            }
            s = cifrasFaltantes.concat(s);
        }
        return s;
    }

    public static String lPad(String s,char c,int n){
        if(s.length() < n){
            int cantCifrasFaltantes = n - s.length();
            String cifrasFaltantes = Character.toString(c);
            for (int j = 1; j < cantCifrasFaltantes; j++) {
                cifrasFaltantes += Character.toString(c);
            }
            s = s.concat(cifrasFaltantes);
        }
        return s;
    }

    public static String lTrim(String s){
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))){
            i++;
        }
        return s.substring(i);
    }


    public static String rTrim(String s){
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))){
            i--;
        }

        return s.substring(0,i+1);
    }

    public static String trim(String s){
        s = StringUtil.lTrim(s);
        s = StringUtil.rTrim(s);
        return s;
    }

    public static int indexOfN(String s,char c,int n){

        int i = 0;

        while (i <= s.length()-1 && n > 0){
            if(s.charAt(i) == c){
                n--;
            }
            i++;
        }
        return n <= 0 ? --i: -1;

    }
}
