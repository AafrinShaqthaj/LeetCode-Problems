package arrays;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * MountainArray.length() returns the length of the array.
 *
 *Example 1:
 * Input: mountainArr = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

 * Example 2:
 * Input: mountainArr = [0,1,2,4,2,1], target = 3
 * Output: -1
 * Explanation: 3 does not exist in the array, so we return -1.
 */

// https://leetcode.com/problems/find-in-mountain-array/description/

class FindInMountainArray {
    public int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = OrderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return OrderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length-1);
    }

    static int peakIndexInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int OrderAgnosticBinarySearch(int[] mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr[start] < mountainArr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == mountainArr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
