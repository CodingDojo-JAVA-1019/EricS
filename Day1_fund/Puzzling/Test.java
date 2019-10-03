import java.util.*;

public class Test{
    public static void main(String[] args){
        Puzzle puzzle = new Puzzle();

        int[] numbers = {3,5,1,2,7,9,8,13,25,32};

        ArrayList<Integer> overTen = puzzle.printSum(numbers);

        System.out.println("values over 10");
        System.out.println(overTen);

        
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        names.add("Eric");

        ArrayList<String> namesOverFiveChars = puzzle.shuffleNames(names);

        System.out.println("Names greater than 5:");
        System.out.println(namesOverFiveChars);

        puzzle.alpha();

        puzzle.tenRandom();

        int[] rands = puzzle.tenRandom();

        ArrayList<Integer> numberList = puzzle.sortedTen();
        System.out.println("Sorted 10: ");
        System.out.println(numberList);
    }
}