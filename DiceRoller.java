import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args){
//        JAVA DICE ROLLER

//        STEP 1):INITIALIZE VARIABLES
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int noOfRoll;
        System.out.print("ENTER THE NUMBER TO DICE ROLL: ");
        noOfRoll=scanner.nextInt();
        int total=0;

//        STEP 2):CHECK IF # OF DICE > 0    (IF STATEMENT)
        if(noOfRoll>0){
//            STEP 3): ROLL ALL THE DICES   (LOOP)
            for(int i=0;i<noOfRoll;i++){
                int roll=random.nextInt(1,7);
                dices(roll);
                System.out.println("YOU ROLLED: "+roll);
                total +=roll;
            }
            System.out.println("TOTAL: "+total);
        }
        else{
            System.out.println("NUMBER CANNOT BE LESS THAN 0");
        }

    }
    static void dices(int roll){
        String Dice1= """
                       ---------
                      |         |
                      |    ●    |
                      |         |
                       ---------

                """;

        String Dice2= """
                       ---------
                      | ●       |
                      |         |
                      |       ● |
                       ---------

                """;

        String Dice3= """
                       ---------
                      | ●       |
                      |    ●    |
                      |       ● |
                       ---------

                """;

        String Dice4= """
                       ---------
                      | ●     ● |
                      |         |
                      | ●     ● |
                       ---------

                """;

        String Dice5= """
                       ---------
                      | ●     ● |
                      |    ●    |
                      | ●     ● |
                       ---------

                """;

        String Dice6= """
                       ---------
                      | ●     ● |
                      | ●     ● |
                      | ●     ● |
                       ---------

                """;
        switch(roll){
            case 1-> System.out.println(Dice1);
            case 2-> System.out.println(Dice2);
            case 3-> System.out.println(Dice3);
            case 4-> System.out.println(Dice4);
            case 5-> System.out.println(Dice5);
            case 6-> System.out.println(Dice6);
        }
    }
}
