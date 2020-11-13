public class FizzBuzz {

    public static String fizzBuzz(Integer number){
        String result = "";
        if (number % 3 == 0 ) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (result == "") {
            result = String.valueOf(number);
        }
        return result;
    }

    public static void main(String[ ] args) {
        System.out.println(fizzBuzz(3));
    }

}