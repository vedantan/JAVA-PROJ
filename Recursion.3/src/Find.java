import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,3, 5, 7, 3, 9};
        System.out.println(find(arr, 3, 0));
        System.out.println(findIndex(arr, 3, 0));
        System.out.println(findIndexLast(arr, 3, arr.length - 1));
        findAllIndex(arr,3,0);
        System.out.println(list);
        System.out.println(findAllIndex(arr,3,0,new ArrayList<>()));

    }

    //for boolean type
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    //for the value of index
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    //for the value from last
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    //find all index
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    //similar question to find all index
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}
