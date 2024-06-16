public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        rotate(s);
    }

    static void rotate(String s){
        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        int d =0;
        int count = s.length();
        while(!s.equals(sbr)){
            String z = s.substring(d);
            String x = s.substring(0,d);
            System.out.println(z+x);
            d++;
            if(d==count) return;
        }

        System.out.println(sbr);
    }
}
