import java.util.ArrayList;

public class SubSeqAsciiRet {
    public static void main(String[] args) {
        System.out.println(sebseq("","abc"));


    }
    static ArrayList<String> sebseq(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first =  sebseq(p,up.substring(1));
        ArrayList<String> second = sebseq(p + ch,up.substring(1));
        ArrayList<String> third = sebseq(p + (ch + 0),up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;




    }
}