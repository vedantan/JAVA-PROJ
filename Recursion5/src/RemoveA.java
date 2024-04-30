public class RemoveA {
    public static void main(String[] args) {
        System.out.println(skipA("" , "baccada"));
    }
    static String skipA(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return " " ;
        }

       char ch = up.charAt(0);

       if(ch == 'a'){
           // substring method (1) removes first ch in string
           return skipA(p,up.substring(1));
       }else{

           return ch + skipA(p,up.substring(1));
       }

    }
}
