package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Main {




    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        List<Purchase> shop = new ArrayList<>();
        List<Out> Arts;

        shop.add(new Purchase(1, 1.0, 15.0, 0));
        shop.add(new Purchase (2,2.3,13.3, 0));
        shop.add(new Purchase (3,4.0,18.1, 0));
        shop.add(new Purchase (4,0.1,11.0, 0));
        shop.add(new Purchase (5,5.5,67.0, 0));
        shop.add(new Purchase (6,10.0,23.0, 0));
        shop.add(new Purchase (7,213.0,11.1, 0));
        shop.add(new Purchase (8,2.0,18.1, 0));
        shop.add(new Purchase (9,3.4,12.1, 0));
        shop.add(new Purchase (10,0.1,23.3, 0));

        List<Present> Present = new ArrayList<>();
        Present.add(new Present(1,23));
        Present.add(new Present(2,5));
        Present.add(new Present(3,2));
        Present.add(new Present(4,11));
        Present.add(new Present(5,7));

        List<Seller> sellers = new ArrayList<>();
        sellers.add(new Seller("Николай"));
        sellers.add(new Seller("Никита"));
        sellers.add(new Seller("Егор"));

        Arts = new ArrayList<>();
        Arts.addAll(shop);
        Arts.addAll(Present);
        Arts.addAll(sellers);

        for (Out Art : Arts) {
           output.append(Art.out());
        }












//        final double[] bigPrice = {0};
//        final int[] bigPriceId = {0};
//        final double[] smallPrice = {999999};
//        final int[] smallPriceId = {0};
//        final double[] bigNumber = {0};
//        final double[] smallNumber = {1000};
//        final double[] bigSum = {0};
//        final double[] smallSum = {100000};
//        final int[] fullNumber = {0};
//        final int[] fullPrice = {0};
//        final String[] out = {""};
//
//
//        shop.forEach(new Consumer<Purchase>() {
//            @Override
//            public void accept(Purchase purchase) {
//                 purchase.setSum(purchase.getPrice() * purchase.getNumber());
//
//                    if (purchase.getPrice()> bigPrice[0]){
//                       bigPrice[0] = purchase.getPrice();
//                       bigPriceId[0] = purchase.getId();
//                   }
//                   else if (purchase.getPrice()< smallPrice[0]){
//                      smallPrice[0] = purchase.getPrice();
//                      smallPriceId[0] = purchase.getId();
//                  }
//                  if (bigNumber[0] < purchase.getNumber()) {
//                      bigNumber[0] = purchase.getNumber();
//                  }
//                   else if (smallNumber[0] >purchase.getNumber()) {
//                       smallNumber[0] = purchase.getNumber();
//                   }
//                 if (bigSum[0] < purchase.getSum()) {
//                    bigSum[0] = purchase.getSum();
//                  }
//                 else if (smallSum[0] > purchase.getSum() & (purchase.getSum() > 0)) {
//                     smallSum[0] = purchase.getSum();
//                  }
//                  fullNumber[0] += purchase.getNumber();
//                 fullPrice[0] += purchase.getPrice();
//
//
//
//                 out[0] += "Товар: " + purchase.getId() + ", Количество: " + purchase.getNumber() + ", Цена: " + purchase.getPrice() + ", Стоимость: " + purchase.getSum() + "\n\n";
//
//
//
//            }
//        }) ;
//
//        System.out.println(out[0]);
//
//
//
//
//
//        System.out.println("Самый дорогой товар:№" + bigPriceId[0]);
//        System.out.println("Самый дешевый товар:№" + smallPriceId[0]);
//        System.out.println("Наибольшее количество:" + bigNumber[0]);
//        System.out.println("Наименьшее количество:" +smallNumber[0]);
//        System.out.println("Самая дорогая покупка:" + bigSum[0]);
//        System.out.println("Самая дешевая покупка:" + smallSum[0]);
//        System.out.println("Сумма покупок:" + fullNumber[0]);
//       System.out.println("Сумма количества:" + fullPrice[0]);
//        System.out.println();
//
//
//
//
        try {
            Dataprocessor<Purchase> dataprocessor = new Dataprocessor<>(5);
            dataprocessor.sortList(shop);
            dataprocessor.searchList(shop);
        }catch (MyExeption myExeption) {
            System.out.println( myExeption.getErrorMessage());
        }

        System.out.println(output);

    }
}




