public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (3 % number == 0 && 5 % number == 0){
            System.out.println("FizzBuzz");
        }
        else if( 3 % number == 0){
            return "Fizz";
        }
        else if( 5 % number == 0){
            return "Buzz";
        }
        return Integer.toString(number);
    }
}