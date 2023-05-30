package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        int[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesCalcService service = new SalesCalcService();
        int sum = service.salesSum(salesArr);
        int mid = service.salesMid(salesArr);
        int max = service.salesMax(salesArr);
        int min = service.salesMin(salesArr);
        int lowMid = service.salesLowMid(salesArr);
        int upMid = service.salesUpMid(salesArr);


        System.out.println("сумма продаж =" + sum);
        System.out.println(", средняя сумма продаж в месяц =" + mid);
        System.out.println(", номер месяца с максимальными продажами =" + max);
        System.out.println(", номер месяца с минимальными продажами =" + min);
        System.out.println(", количество месяцев с продажами ниже  среднего =" + lowMid);
        System.out.println(", количество месяцев с продажами выше  среднего =" + upMid);
    }
}
