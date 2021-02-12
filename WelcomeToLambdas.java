import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WelcomeToLambdas {
    public static void main(String[] args) {
       int[]values={3,10,6,1,4,8,2,5,9,7};
       String[]strings={"Red","orange","Yellow","green","Blue","indigo","Violet"};


        System.out.println("Original values:");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ",value));
        System.out.println();
        System.out.printf("%nCount:%d%n",IntStream.of(values).count());
        System.out.printf("Min %d%n",IntStream.of(values).min().getAsInt());
        System.out.printf("Max %d%n",IntStream.of(values).max().getAsInt());
        System.out.printf("sum %d%n",IntStream.of(values).sum());
        System.out.printf("average %.2f%n",IntStream.of(values).average().getAsDouble());
        System.out.printf("sum via reduce %d%n",IntStream.of(values).reduce(0,(x,y)->x+y));
        System.out.printf("sum of squares via reduce %d%n",IntStream.of(values).reduce(0,(x,y)->x+y*y));
        System.out.printf("product via reduce %d%n",IntStream.of(values).reduce(1,(x,y)->x*y));
        System.out.printf("%nsum via reduce");IntStream.of(values).
                filter(value -> value%2==0).sorted().forEach(value -> System.out.printf("%d ",value));
        System.out.printf("%n odd numbers");
        IntStream.of(values).
                filter(value -> value%2!=0).sorted().forEach(value -> System.out.printf(" %d ",value));


        System.out.printf("%n sum of integers from 1 to 9 %d%n",
        IntStream.range(1,10).sum());
        System.out.printf("sum of integers from 1 to 9 %d%n",
                IntStream.rangeClosed(1,10).sum());
     System.out.printf("original strings:%s%n", Arrays.asList(strings));
     System.out.printf("Strings in upperCase :%s%n",Arrays.stream(strings)
             .map(String::toUpperCase).collect(Collectors.toList()));
     System.out.printf("Strings greater than m sorted ascending:%s%n",Arrays.stream(strings)
             .filter(s -> s.compareToIgnoreCase("n")<0).sorted(String.CASE_INSENSITIVE_ORDER).
             collect(Collectors.toList()));
     System.out.printf("Strings greater than m sorted descending:%s%n",Arrays.stream(strings)
             .filter(s -> s.compareToIgnoreCase("n")>0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).
                     collect(Collectors.toList()));
     System.out.printf("Strings in upperCase :%s%n",Arrays.stream(strings)
             .map(String::toUpperCase).collect(Collectors.toList()));





     }
    }

