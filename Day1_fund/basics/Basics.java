import java.util.*;

public class Basics {

    public void print255(){
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }
    public void printOdd(){
        for(int i = 1; i<= 255; i=i+2){
            System.out.println(i);
        }
    }
    public void printSum(){
        int sum = 0;
        for (int i=1; i<=255; i++){
            sum += i;
            System.out.println("New Number:"+i+","+" Sum:"+sum);
        }
    }
    public void iterateArray(){
        int[] myArray = {1,3,5,7,9,13};
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
    public void findMax(){
        int max = 0;
        int[] myArray = {1,3,-5,7,0,9,13,-2};
        for(int i=0; i < myArray.length; i++){
            if(max < myArray[i]){
                max = myArray[i];
            }
        }
        System.out.println(max);
    }
    public void findAvg(){
        int sumtotal = 0;
        int[] myArray = {2, 10, 3};
        for(int i=0; i < myArray.length; i++){
            sumtotal += myArray[i];
        }
        int avg = sumtotal / myArray.length;
        System.out.println(avg);
    }
    public void arrayOddNumbers(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=1; i<= 255; i=i+2){
            myArray.add(i);
        }
        System.out.println(myArray);
    }
    public void greaterThanY(){
        int[] myArray = {1,3,5,7};
        int y = 3;
        int count = 0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] > y ){
                count++;
            }
        }
        System.out.println(count);
    }
    public void squareValues(){
        int[] x = {1,5,10,-2};
        for(int i = 0; i < x.length; i++){
            x[i] = x[i]*x[i];
        }
        System.out.println(Arrays.toString(x));
    }
    public void removeNegatives(){
        int[] x = {1,5,10,-2,-4};
        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }
    public void maxMinAvg(){
        int[] x = {1,5,10,-2};
        int sum = 0;
        int min = x[0];
        int max = x[0];
        for(int i = 0; i < x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
            if(x[i] < min){
                min = x[i];
            }
            sum = sum + x[i];
        }
        int avg = sum / x.length;
        ArrayList<String> newArr = new ArrayList<String>();
        newArr.add("The max is: " + max);
        newArr.add("The min is: " + min);
        newArr.add("The avg is: " + avg);
        System.out.println(newArr);
    }
    public void shiftingValues(){
        int[] x = {1,5,10, 7, -2};
        for(int i = 0; i < x.length; i++){
            if( i == x.length - 1){
                x[i] = 0;
            }
            else {
                x[i] = x[i + 1];
            }
        }
        System.out.println(Arrays.toString(x));
    }
}