package com.vedant;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        System.out.println(Arrays.toString(binarySearch(matrix, 1, 0, matrix.length-1 , 5)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + ((cend - cstart) / 2);
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
//    static int[] search(int[] matrix ,int target){
//        int rows = matrix.length;
//        int col = matrix[0].length;
//        if(rows==1){
//            return binarySearch(matrix,0,0,col-1,target);
//        }
//        int rstart = 0;
//        int rend =rows -1;
//        int cMid = col /2;
//        while(rstart < (rend-1)){
//            int mid = rstart +((rend - rstart)/2);
//            if(matrix[mid][cMid] == target){
//                return new int[] {mid,cMid};
//            }
//            if(matrix[mid][cMid] < target){
//                rstart = mid;
//            }else{
//                rend = mid;
//            }
//        }
//        if(matrix[rstart][cMid] == target){
//            return  new int[]{rstart,cMid};
//
//        }
//        if(matrix[rstart][cMid] == target) {
//            return new int[]{rstart +1, cMid};
//        }
//
//        if(target <= matrix[rstart][cMid-1]){
//            return binarySearch(matrix,rstart,0,cMid-1,target);
//        }
//        if(target >= matrix[rstart][cMid+1] && target <= matrix[rstart][col+1]){
//            return binarySearch(matrix,rstart,cMid+1,col-1,target);
//        }
//        if(target <= matrix[rstart+1][cMid-1]){
//            return  binarySearch(matrix,rstart+1, 0 , cMid-1,target);
//
//        }else{
//            return binarySearch(matrix,rstart+1,cMid+1,col-1,target);
//
//        }
//
//
//
//
//
//
//    }
//
//}
