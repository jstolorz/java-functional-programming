package com.bluesoft.javvainaction.chap06;

import com.bluesoft.javvainaction.chap04.Dish;

import java.util.*;

import static java.util.stream.Collectors.*;

class Main {
    public static void main(String[] args) {

         List<Transaction> transactions = Arrays.asList(
                new Transaction(Currency.EUR, 1500.0),
                new Transaction(Currency.USD, 2300.0),
                new Transaction(Currency.GBP, 9900.0),
                new Transaction(Currency.EUR, 1100.0),
                new Transaction(Currency.JPY, 7800.0),
                new Transaction(Currency.CHF, 6700.0),
                new Transaction(Currency.EUR, 5600.0),
                new Transaction(Currency.USD, 4500.0),
                new Transaction(Currency.CHF, 3400.0),
                new Transaction(Currency.GBP, 3200.0),
                new Transaction(Currency.USD, 4600.0),
                new Transaction(Currency.JPY, 5700.0),
                new Transaction(Currency.EUR, 6800.0)
        );

        Map<Currency, List<Transaction>> transactionByCurrency = new HashMap<>();

        for(Transaction transaction : transactions){
           Currency currency = transaction.getCurrency();

           List<Transaction> transactionForCurrency = transactionByCurrency.get(currency);

           if(transactionForCurrency == null){
               transactionForCurrency = new ArrayList<>();
               transactionByCurrency.put(currency, transactionForCurrency);
           }

           transactionForCurrency.add(transaction);

        }

        printTransactionsByCurrency(transactionByCurrency);

        System.out.println("--------------------------------------");

        Map<Currency, List<Transaction>> transactionByCurrencyStream = transactions.stream()
                .collect(groupingBy(Transaction::getCurrency));

        printTransactionsByCurrency(transactionByCurrencyStream);

        Comparator<Dish> dishCalloriesComparator = Comparator.comparingInt(Dish::getCalories);

        Optional<Dish> mostCaloriesDish = Dish.menu.stream()
                .collect(maxBy(dishCalloriesComparator));

        System.out.println(mostCaloriesDish.get());

        int totalCalories = Dish.menu.stream().collect(summingInt(Dish::getCalories));
        double avarageCalories = Dish.menu.stream().collect(averagingDouble(Dish::getCalories));

        IntSummaryStatistics statistics = Dish.menu.stream()
                .collect(summarizingInt(Dish::getCalories));

        System.out.println(statistics.getMax() + ", " + statistics.getAverage());

        String shortMenu = Dish.menu.stream().map(Dish::getName).collect(joining(", "));

        System.out.println(shortMenu);

        int totalCaloriesR = Dish.menu.stream()
                .collect(reducing(0,Dish::getCalories, Integer::sum));


        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = Dish.menu.stream()
                .collect(groupingBy(dish -> {
                    if(dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if(dish.getCalories() <=700) return CaloricLevel.NORMAL;
                    else
                        return CaloricLevel.FAT;
                }));

    }

    public enum CaloricLevel {DIET, NORMAL, FAT}


    private static void printTransactionsByCurrency(final Map<Currency, List<Transaction>> transactionByCurrency) {
        for(Map.Entry<Currency,List<Transaction>> entry : transactionByCurrency.entrySet()){
            System.out.println("Key = " + entry.getKey());
            for(Transaction transaction : entry.getValue()){
                System.out.println("Transaction : " + transaction.getValue());
            }
        }
    }

    public static class Transaction {

        private final Currency currency;
        private final double value;

        public Transaction(Currency currency, double value) {
            this.currency = currency;
            this.value = value;
        }

        public Currency getCurrency() {
            return currency;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return currency + " " + value;
        }

    }

    public enum Currency {
        EUR, USD, JPY, GBP, CHF
    }
}
