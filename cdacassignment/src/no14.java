public class no14 {
    public static void main(String[] args) {
        stringpalindrome("veddev");
    }


    //  Simple way
    static void stringpalindrome(String str){
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 = str1 + str.charAt(i);
        }

        if(str.equals(str1) ){
            System.out.println("Given sting is palindrome");

        }
    }

    static boolean isPalin(String s){
        int size = s.length();
        if(size == 1 || size ==0){
            return true;
        }

        String l = s.substring(0,1); // start inclusive   end exclusive
        String r = s.substring(size-1); //  start inclusive

        if(l.equals(r)){
            return isPalin(s.substring(1,size-1));
        }
        return false;
    }
}
