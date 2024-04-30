class CountNums{
    public static void main(String[] args) {
        int a = 1232422;
        int count = 0;

        while(a>0){
            int rem = a%10;
            if(rem==2){
                count++;
            }
            a = a/10;
        }
        System.out.println(count);
    }
}

