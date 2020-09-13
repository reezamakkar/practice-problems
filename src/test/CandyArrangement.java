package test;

//package com.practise.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//public class CandyArrangement {


//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int count = Integer.parseInt(s.nextLine());
//
//        List<List<Integer>> integerList = new ArrayList<>(count);
//        for(int i=1; i<=count; i++){
//            String input = s.nextLine();
//            String[] split = input.split(" ");
//            List<Integer> values = Arrays.stream(split).map(a -> Integer.parseInt(a)).collect(Collectors.toList());
//            integerList.add(values);
//        }
//
//        integerList.stream().map(value -> {
//            int totalCandy = value.get(0) + value.get(1);
//            Integer k = value.get(2);
//            if (k == 1) {
//                return IntStream.rangeClosed(1, totalCandy).reduce(1, (a, b) -> a * b);
//            } else {
//                int kPermutation = IntStream.rangeClosed(1, k).reduce(1, (a, b) -> a * b);
//                int countOfCandyArrangement = IntStream.rangeClosed(1, totalCandy).reduce(1, (a, b) -> a * b);
//                System.out.println(countOfCandyArrangement);
//                System.out.println(kPermutation);
//                return kPermutation * countOfCandyArrangement;
//            }
//        }).forEach(System.out::println);
//
//    }

//    public static void main(String[] args) {
//        String candy = "RRB";
//        int r=2;
//        int b=1;
//        int k =1;
//        candyArrangement(new char[candy.length()], 0, r, b, k, 0, 0,0,0);
//    }
//
//    public static void candyArrangement(char[] candy, int pos, int rCount, int bCount, int k, int r, int b, int rk,
//                                        int bk) {
//        if (pos == candy.length) {
//            for (int i = 0; i < candy.length; i++) {
//                System.out.print(candy[i]);
//            }
//            System.out.println();
//            candy = new char[candy.length];
//        }
//
//        if (rk < k && r < rCount) {
//            candy[pos] = 'R';
//            candyArrangement(candy, pos + 1, rCount, bCount, k, r + 1, b, rk + 1, 0);
//        }
//        if (bk < k && b < bCount) {
//            candy[pos] = 'B';
//            candyArrangement(candy, pos + 1, rCount, bCount, k, r, b + 1, 0, bk + 1);
//        }
//    }


//}
public class CandyArrangement {
    public static void main(String[] args) {
        String candy = "RRB";
        int r=2;
        int b=1;
        int k =1;
        candyArrangement(new char[candy.length()], 0, r, b, k, 0, 0,0,0);
    }

    public static void candyArrangement(char[] candy, int pos, int rCount, int bCount, int k, int r, int b, int rk,
                                        int bk) {
        if (pos == candy.length) {
//            for (int i = 0; i < candy.length; i++) {
//                System.out.print(candy[i]);
//            }
            System.out.println(candy.length);
            candy = new char[candy.length];
        }

        if (rk < k && r < rCount) {
            candy[pos] = 'R';
            candyArrangement(candy, pos + 1, rCount, bCount, k, r + 1, b, rk + 1, 0);
        }
        if (bk < k && b < bCount) {
            candy[pos] = 'B';
            candyArrangement(candy, pos + 1, rCount, bCount, k, r, b + 1, 0, bk + 1);
        }
    }


}
