package com.array.binarySort;

/**
 * @author WJ
 * @date 2018/9/15
 * 给定一个有序的数组，查找最接近value且大于value的数的下标（如果该数存在多个，返回第一个下标），不存在返回-1。
 */
public class BinarySearch_3 {

    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            if (array[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return (right + 1) < array.length && array[right + 1] > target  ? right + 1 : -1;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,5,7,8,9,9};
        System.out.println(binarySearch(array, 9));
    }
}
