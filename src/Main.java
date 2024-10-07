import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner tangentbord = new Scanner(System.in);

        Tamagochi Tamagochi = new Tamagochi();
        Tamagochi.name = "Bob";

        boolean startGame = false;

        System.out.println("Tryck 1 för att starta");

        String input1 = tangentbord.nextLine();
        if(input1.equals("1"))
        {
            startGame = true;

            System.out.println("Vilket ord vill du lära " + Tamagochi.name);
            String wordToTeach = tangentbord.nextLine();

            Tamagochi.teachWord(wordToTeach);
        }


    }
}