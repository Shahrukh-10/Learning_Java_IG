package com.ingenuity.assignment1;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayOperations {
    int[] arr = {1,2,3,4,5,5,7,8,9,10};
    public void printArray(){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public void sumArray(){
        int sum =0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);
    }

    public void maxNo(){
        int max = 0;
        for(int i : arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }

    public void frequency(){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i : arr){
            if(hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }
            else {
                hs.put(i,1);
            }
        }
        System.out.println(hs);
    }


    public void minNumber(){
        int min= Integer.MAX_VALUE;
        for(int i : arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }

    public void primeno(){
        boolean b = true;
        for(int i : arr){
            if(i==0 || i==1){
                b = false;
            }
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    b = false;
                    break;
                }
            }
            if (b){
                System.out.println(i);
            }
        }

    }
    public void evenNo(){
        for(int i : arr){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public void oddNo(){
        for(int i : arr){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public void sortAscending(){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public void sortDescending(){
        sortAscending();
        System.out.print("[");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");

    }
    public void insertNo(int no , int index){
        arr[index] = no;
        printArray();
    }
    public void deleteNo(int index){
        int[] a = new int[arr.length-1];
        int k = 0;
        for(int i =0;i<arr.length;i++){
            if(i!=index){
                a[k]=arr[i];
                k++;
            }else {
                continue;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();
        obj.frequency();
        obj.primeno();
        obj.evenNo();
        obj.oddNo();
        obj.sortAscending();
        System.out.println(Arrays.toString(obj.arr));
        obj.sortDescending();
        System.out.println();
        obj.insertNo(20,0);
        obj.deleteNo(6);
    }
}
