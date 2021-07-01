package com.xj.bs;

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/24 0:10
 * @Description:
 */
public class OrderDemo {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,6};

        for(int i=0;i<arr.length;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}
