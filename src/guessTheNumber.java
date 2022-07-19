import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner myNameObj = new Scanner(System.in);
        Scanner myGuessObj = new Scanner(System.in);
        Scanner userPick = new Scanner(System.in);
        int max = 20;
        int min = 1;
        int guessCounter = 0;
        int randomInt = (int) Math.floor(Math.random() * (max - min + min) + min); // create a random num between 1 - 20;
        System.out.println("this is the random int: //" + randomInt);
        System.out.println("Hello! welcome to guess the number. What is your name?");
        String userInPut = myNameObj.nextLine();
        // Boolean loopAgain = false;
        // if(guessObj!= null && guessObjIntValue !=0){
        System.out.println("Great " + userInPut + " we are about to have some fun. \nWell, " + userInPut + ", " +
                "I am thinking of a number between 1 and 20 \nTake a guess.");
        String guessObj = myGuessObj.nextLine();
        guessCounter++;

        while (true) {
            int guessObjIntValue = Integer.parseInt(String.valueOf(guessObj)); // store userObj as int
            if (guessObjIntValue == randomInt) {
                System.out.println("Good job, " + userInPut + "! you guessed my number in " + guessCounter +
                        " guesses. \n" +
                        "Would you like to play again?(Y/N)");
                String userPickValue = userPick.nextLine();
                if (userPickValue.equals("Y") || userPickValue.equals("y")) {
                    randomInt = (int) Math.floor(Math.random() * (max - min + min) + min);
                    System.out.println("new random int: " + randomInt);
                    System.out.println("Make a guess");
                    guessObj = myGuessObj.nextLine();
                    guessCounter++;
                } else if (userPickValue.equals("N") || userPickValue.equals("n")) { // if userPickValue equal N or n end game
                    break;
                }

            } else if (guessObjIntValue > randomInt) {
                System.out.println("Your guess is too high \nmake a guess");
                guessObj = myGuessObj.nextLine();
                guessCounter++;
            } else {
                System.out.println("Your guess is too low \nmake a guess");
                guessObj = myGuessObj.nextLine();
                guessCounter++;
            }
        }
    }
}
