import java.util.*;

public class Puzzle{

    public ArrayList<Integer> printSum(int[] numbers){
        ArrayList<Integer> overTen = new ArrayList<Integer>();
        int sum = 0;
        for (int index = 0; index < numbers.length; index++){
            int value = numbers[index];
            sum += value;
            System.out.println("value is: " + value + ", Sum is: " + sum);

            if (value > 10){
                overTen.add(value);
            }
        }

        System.out.println("our final sum is: " + sum);
        return overTen;
    }

    public ArrayList<String> shuffleNames(ArrayList<String> names) {
        ArrayList<String> greaterThanFive = new ArrayList<String>();

        Collections.shuffle(names);
        System.out.println(names);

        for (int index = 0; index < names.size(); index++){
            String name = names.get(index);
            System.out.println(name);
            if (name.length() > 5) {
                greaterThanFive.add(name);
            }
        }

        // alternative collections loop
        // for (String name : names) {
        //     System.out.println("Collection loop" + name);
        //     if (name.length() > 5) {
        //         greaterThanFive.add(name);
        //     }
        // }    

        return greaterThanFive;
    }

    public void alpha(){
        String[] characters = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] vowels = {"a", "e", "i", "o", "u"};
        Collections.shuffle(Arrays.asList(characters));

        String firstChar = characters[0];
        System.out.println("The first character is: " + firstChar);

        System.out.println(Arrays.asList(characters));
        System.out.println("the last character is: " + characters[characters.length - 1]);

        boolean isVowel = false;
        for (int index = 0; index < vowels.length; index++){
            String current = vowels[index];
            System.out.println("current value is: " + current);
            if(current.equals(firstChar)){
                isVowel = true;
                break;
            }
        }

        if (isVowel == true){
            System.out.println("The first char was a vowel: " + firstChar);
        }
        
    }

    // TODO  Create a random string that is 5 characters long.
    public String randomString(){
        String[] characters = "abcdefghijklmnopqrstuvwxyz".split("");
        Collections.shuffle(Arrays.asList(characters));
        // ArrayList<String> ran5 = new ArrayList<String>();
        String random5 = "";
        for(int i=0; i<5; i++){
            random5 += (characters[i]);
        }
        // char[] charStr = ran5;
        
        // random5 = random5.copyValueOf(charStr,0, 5);

        System.out.println(random5);
        return random5;
    }

    //TODO Generate an array with 10 random strings that are each 5 characters long
    public void ranArrayList(){
        ArrayList<String> ran10 = new ArrayList<String>();
        for(int i=0; i<10; i++){
            ran10.add(randomString());
        }
        System.out.println(ran10);
    }

    public int[] tenRandom(){
        int[] tenRand = new int[10];

        final int min = 55;
        final int max = 100;

        for (int index = 0; index < tenRand.length; index++){
            int randNumber = rand(min, max);

            System.out.println("random value generated: " + randNumber);
            tenRand[index] = randNumber;
        }


        return tenRand;
    }

    public ArrayList<Integer> sortedTen(){
        int[] ten = tenRandom();
        ArrayList<Integer> list = new ArrayList<Integer>(ten.length);
        for(int number : ten) {
            list.add(number);
        }
        Collections.sort(list);
        return list;
    }

    private int rand(int min, int max) {
        Random rand = new Random();

        return rand.nextInt(max - min) + min;
    }
}