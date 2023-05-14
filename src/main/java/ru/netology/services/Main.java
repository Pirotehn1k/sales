package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        int[] SalesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesCalcService service = new SalesCalcService();
        int sum = service.salesSum(SalesArr);
        int mid = service.salesMid(SalesArr);
        int max = service.salesMax(SalesArr);
        int min = service.salesMin(SalesArr);
        int lowMid = service.salesLowMid(SalesArr);
        int upMid = service.salesUpMid(SalesArr);


        System.out.println("сумма продаж =" + sum);
        System.out.println(", средняя сумма продаж в месяц =" + mid);
        System.out.println(", номер месяца с максимальными продажами =" + max);
        System.out.println(", номер месяца с минимальными продажами =" + min);
        System.out.println(", количество месяцев с продажами ниже  среднего =" + lowMid);
        System.out.println(", количество месяцев с продажами выше  среднего =" + upMid);
    }
}
