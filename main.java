import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main (String ... args){
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      int weapon = 0, enemyWeapon = 0;
      while(true){
        while(true){
          System.out.println("1) Rock 2) Paper 3) Scissors");
          System.out.print("Pick your weapon: ");
          if(input.hasNextInt()){
            weapon = input.nextInt();
            if (weapon > 0 && weapon < 4){
              input.nextLine();
              break;
            }
            else{
              System.out.println("Invalid option!");
            }
          }
          else{
            System.out.println("Invalid option!");
            input.nextLine();
          }
        }

        enemyWeapon = rand.nextInt(3);
        
        switch (weapon) {
          case 1:
            if(enemyWeapon == 0) {
              System.out.println("Draw!");;
            }
            else if (enemyWeapon == 1)
              System.out.println("Lost, Paper beats Rock");
            else
              System.out.println("Won! Rock beats Scissors");
            break;
          case 2:
            if(enemyWeapon == 0)
              System.out.println("Won! Paper beats Rock");
            else if (enemyWeapon == 1)
              System.out.println("Draw!");
            else 
              System.out.println("Lost, Scissors beats Paper");
            break;
          case 3:
            if(enemyWeapon == 0)
              System.out.println("Lost, Rock beats Scissors");
            else if (enemyWeapon == 1)
              System.out.println("Won! Scissors beats Paper");
            else
              System.out.println("Draw!");
            break;

          default:
            break;
        }
       
        String replay = "";
        System.out.print("Play again? Y/N ");
        replay = input.nextLine();
        if(!replay.equalsIgnoreCase("y"))
          break;
      }
      
  }
}
