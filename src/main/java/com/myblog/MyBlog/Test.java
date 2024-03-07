package com.myblog.MyBlog;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Transactions> transactions = Arrays.asList(
                new Transactions(200, "USD"),
                new Transactions(300, "INR"),
                new Transactions(500, "EUR"),
                new Transactions(200, "USD")

        );
        double sum = transactions.stream().filter(x -> x.getCurrency().equals("USD")).mapToDouble(Transactions::getAmount).sum();
        System.out.println(sum);
    }
}
