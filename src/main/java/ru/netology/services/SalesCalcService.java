package ru.netology.services;

public class SalesCalcService {

    public int salesSum(int[] SalesArr) {
        int sum = 0;
        for (int i = 0; i < SalesArr.length; i++) {
            sum += SalesArr[i];
        }
        return sum;
    }

    public int salesMid(int[] SalesArr) {
        int sum = 0;
        for (int i = 0; i < SalesArr.length; i++) {
            sum += SalesArr[i];
        }
        int mid = sum / SalesArr.length;


        return mid;
    }

    public int salesMax(int[] SalesArr) {
        int max = 0;

        for (int i = 0; i < SalesArr.length; i++) {
            if (SalesArr[i] >= SalesArr[max]) {
                max = i;
            }
        }

        return max + 1;
    }

    public int salesMin(int[] SalesArr) {
        int min = 0;

        for (int i = 0; i < SalesArr.length; i++) {
            if (SalesArr[i] <= SalesArr[min]) {
                min = i;
            }
        }

        return min + 1;
    }

    public int salesLowMid(int[] SalesArr) {
        int lowMid = 0;
        int sum = 0;
        for (int i = 0; i < SalesArr.length; i++) {
            sum += SalesArr[i];
        }
        int mid = sum / SalesArr.length;
        for (int i = 0; i < SalesArr.length; i++) {
            if (SalesArr[i] < mid) {
                lowMid++;
            }
        }


        return lowMid;
    }

    public int salesUpMid(int[] SalesArr) {
        int upMid = 0;
        int sum = 0;
        for (int i = 0; i < SalesArr.length; i++) {
            sum += SalesArr[i];
        }
        int mid = sum / SalesArr.length;
        for (int i = 0; i < SalesArr.length; i++) {
            if (SalesArr[i] > mid) {
                upMid++;
            }
        }


        return upMid;
    }
}
