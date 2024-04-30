public class no5 {
    public static void main(String[] args) {
        mess("Azcn22@#&^*176JB,MSA.LJSA");
    }

    static void mess(String s){
        int uppercase = 0;  // 65 to 90
        int lowercase = 0;  // 97 to 122
        int numbers=0;      // 48 to 57
        int other_characters =0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i)  < 91){
                uppercase = uppercase+1;
            }else if(s.charAt(i) >= 97 && s.charAt(i)  < 123){
                lowercase = lowercase+1;
            }else if(s.charAt(i) >= 48 && s.charAt(i)  < 57){
                numbers = numbers+1;
            }else{
                other_characters = other_characters+1;
            }

        }
            System.out.println("Count of Upper case is : " + uppercase);
            System.out.println("Count of Upper case is : " + lowercase);
            System.out.println("Count of number is : " + numbers);
            System.out.println("Count of other_character is : " + other_characters);
    }
}
