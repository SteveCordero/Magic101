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

       
   }
}//end driver
