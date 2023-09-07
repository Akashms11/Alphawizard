package com.subs.alphawizard.Algos;

public class MooresVotingAlgos {

    static int frequency(int a[], int item){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if(item==a[i]){
                count++;
            }
        }
        return count;
    }

    static void maxFrequencyElement(int a[]){
        int count = 1;
        int ansIndex = 0;
        for(int i=1;i<a.length;i++){
            if(a[ansIndex]==a[i]){
                count++;
            }
            else {
                count--;
            }
            if(count == 0){
                ansIndex=i;
                count=1;
            }
        }
        int freq = frequency(a,a[ansIndex]);
        if (freq>(a.length/2)){
            System.out.println("Max element "+a[ansIndex]+" exists "+freq+" times");
        }
    }

    public static void main(String g[]){
        int a[] = {1,1,1,1,1,1,1,1,5,3,1,5,3,5,5,6,5,5,1,5,1};
        System.out.println("Array Length "+a.length);
        maxFrequencyElement(a);
    }
}
