public class RotatedArray {
    public static void main(String[] args) {
         int [] arr= {5,6,7,8,9,1,2,3};
        System.out.println(find(arr,1,0,arr.length-1));

    }
    static int find(int[] arr, int target , int s ,int e) {



        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            }

            // rotated array that's why using 2 condition
            if (arr[s] <= arr[m]) {
                if (target >= arr[s] && target <= arr[m]) {
                    return find(arr, target, s, m - 1);
                } else {
                    return find(arr, target, m + 1, e);
                }

            }else {

                if (target >= arr[m] && target <= arr[e]) {
                    return find(arr, target, m + 1, e);
                }
                return find(arr, target, s, m - 1);
            }

        }
            return  arr[s] == target ? s : -1;
    }

    }

