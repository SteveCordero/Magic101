import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class MagicDriver
{
   public static void main(String[]args)
   {
       System.out.println("Hello World");

       Goblin kyle = new Goblin("Kyle",true,2,EnemyType.GOBLIN,5);
       Goblin gerome = new Goblin("Gerome",false,3,EnemyType.GOBLIN,-1);

       Dragon drago = new Dragon("Drago",true,10,EnemyType.DRAGON,7,7);
       Dragon geraldo = new Dragon("Geraldo",false,8,EnemyType.DRAGON, 3,10);

       Golem goldy = new Golem("Goldy",false,7,EnemyType.GOLEM, Elements.FIRE);
       Golem faker = new Golem("Faker",false,4,EnemyType.GOLEM, Elements.FAKE);

       Sorcerer waldo = new Sorcerer("Waldo",100,5,10,3);

       System.out.println(kyle.toString());

       kyle.setNumClaws(7);
       System.out.println("Now kyle has " + kyle.getNumClaws() + " claws.");

       Enemies[] myEnemies = {kyle,gerome,drago,geraldo,goldy,faker};

       for(int i = 0; i < myEnemies.length; i++)
       {
           System.out.println(myEnemies[i]);
       }


       System.out.println(drago.toString());
       System.out.println("is it a valid Dragon? " + drago.validate());

       System.out.println(geraldo.toString());
       System.out.println("is it a valid Dragon? " + drago.validate());



       System.out.println(goldy.toString());
       goldy.validate();
       faker.validate();

       waldo.exchangeAttacks(gerome);
       System.out.println(waldo.getHealth());
       waldo.exchangeAttacks(geraldo);
       System.out.println(waldo.getHealth());
       waldo.exchangeAttacks(goldy);
       System.out.println(waldo.getHealth());

       System.out.println(waldo.toString());

   }
}//end driver
