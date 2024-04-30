import java.util.ArrayList;

public class Find2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6,7,4};
        System.out.println(findAll(arr,4,0));
    }
    static ArrayList<Integer> findAll(int[] arr ,int target , int index ){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans = findAll(arr,target,index+1);
        list.addAll(ans);

        return list;

    }
}
