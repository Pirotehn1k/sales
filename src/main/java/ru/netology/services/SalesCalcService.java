package ru.netology.services;

public class SalesCalcService {

    public int salesSum(int[] salesArr) {
        int sum = 0;
        for (int i = 0; i < salesArr.length; i++) {
            sum += salesArr[i];
        }
        return sum;
    }

    public int salesMid(int[] salesArr) {
        int sum = salesSum(salesArr) ;
        int mid = sum / salesArr.length;


        return mid;
    }

    public int salesMax(int[] salesArr) {
        int max = 0;

        for (int i = 0; i < salesArr.length; i++) {
            if (salesArr[i] >= salesArr[max]) {
                max = i;
            }
        }

        return max + 1;
    }

    public int salesMin(int[] salesArr) {
        int min = 0;

        for (int i = 0; i < salesArr.length; i++) {
            if (salesArr[i] <= salesArr[min]) {
                min = i;
            }
        }

        return min + 1;
    }

    public int salesLowMid(int[] salesArr) {
        int lowMid = 0;
        int mid = salesMid(salesArr);
        for (int i = 0; i < salesArr.length; i++) {
            if (salesArr[i] < mid) {
                lowMid++;
            }
        }


        return lowMid;
    }

    public int salesUpMid(int[] salesArr) {
        int upMid = 0;
        int mid = salesMid(salesArr);
        for (int i = 0; i < salesArr.length; i++) {
            if (salesArr[i] > mid) {
                upMid++;
            }
        }


        return upMid;
    }
}
