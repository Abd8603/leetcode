/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndex(1, mountainArr.length() - 2, mountainArr);

        int answer = leftSideCheck(0, target, peak, mountainArr);
        if(answer != -1) return answer;

        answer = rightSideCheck(peak, target, mountainArr.length() - 1, mountainArr);
        if(answer != -1) return answer;

        return -1;
    }
    //To Find Index of Middle element
    public int peakIndex(int low, int high, MountainArray arr){
        int i = -1;
        int save;
        while(low <= high){
            i  = (low + high)/2;
            save = arr.get(i);
            if(save < arr.get(i + 1)) low = i + 1;
            else if(arr.get(i - 1) > save) high = i - 1;
            else break;
        }
        return i;
    }

    //To Find in Left Side for minimum
    public int leftSideCheck(int low, int target, int high, MountainArray arr){
        int i = -1;
        int save;
        while(low <= high){
            i = (low + high)/2;
            save = arr.get(i);
            System.out.println(i);
            if(save == target) return i;
            else if(save < target) low = i+1;
            else high = i-1;
        }
        return -1;
    }

    //To Find in Right Side if not found in left side
    public int rightSideCheck(int low, int target, int high, MountainArray arr){
        int i = -1;
        int save;
        while(low <= high){
            i = (low + high)/2;
            save = arr.get(i);
            System.out.println(i);
            if(save == target) return i;
            else if(save > target) low = i+1;
            else high = i-1;
        }
        return -1;
    }
}