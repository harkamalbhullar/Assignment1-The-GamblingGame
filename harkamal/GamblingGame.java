//Name:Harkamalpreet singh
//Student ID:201905122
//Date Submitted: March 20,2021
//Class IN2203 Gruop:2
//Name of work:Assignment1:The Gambling Game
import java.util.*;
import java.lang.Math;

public class GamblingGame{
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);
        public void OrganizeNewGame(){
            System.out.println("Welcome to our Casino: Would you like to play the gambling game? (yes and no)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("yes")){
            System.out.println("let's Started");
                    g1.PlayGame();
                    p1.PlayerInput();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random rand= new Random();
    int ComputerGuess= rand.nextInt(100) ;

    public void PlayGame(){
        System.out.println("Guess a number from 1 to 100");
        System.out.println("I'll guess a game ");
        System.out.println("If your guess is within 10 of my guess: then you win . Else i will win  ");
        ComputerGuess= ComputerGuess();


    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = rand.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
    Game h2= new Game();

    public void PlayerInput()
    {
        Scanner sc= new Scanner(System.in);

        int itr= 2;// number of iterations for the player
        int guess;// number to be guessed by the player 

        for(int a=1; a<= itr;a++)// loop to iterate the game for final result
        {
            System.out.println("Enter a number");
            guess= sc.nextInt();//read user input

            if(Math.abs(guess - h2.ComputerGuess)< 40 )
            {System.out.println("Congratulations !wow you are won");
        
                System.out.println("The Number was " + h2.ComputerGuess );
            break;}// closing the loop if user wins 

            else 
            {
                System.out.println(" Try again, you are very close ");
            }
            if(a==itr)// in case all the iterations have been used 
            {
                System.out.println("Oops, You have exhausted all the tries");
                System.out.println("The number was "+ ComputerGuess);
            }

        }


    }
}