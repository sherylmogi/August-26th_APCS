import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Test {
   public static void main (String [] args) throws InterruptedException {
   String lineseparator = System.getProperty ("line.separator");
   
          Scanner input = new Scanner(System.in);
          String name;
  

          System.out.print(" Hello! What is your name? " +lineseparator);
            name = input.nextLine();  
       
           System.out.println( name +". Open the pod bay doors, please, Hal...Open the pod bay doors, please, Hal... Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?...Do you read me, Hal?...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?... Do you read me, Hal?"+lineseparator) ;
            TimeUnit.SECONDS.sleep(2);
           System.out.println("Hal. Affirmative," + name+ ", I read you." +lineseparator);
          TimeUnit.SECONDS.sleep(2);
           System.out.println ( name + ". Open the pod bay doors, Hal." +lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ("Hal. I'm sorry, " +name +", I'm afraid I can't do that"+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ( name + ". What's the problem?" + lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ("Hal. I think you know what the problem is just as well as I do." + lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println (name + ". What're you talking about, Hal?"  +lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ("Hal. This mission is too important for me to allow you to jeopardise it." +lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println (name + ". I don't know what you're talking about, Hal."+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ("Hal. I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen."+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println (name + ". Where the hell'd you get that idea, Hal?"+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ("Hal. "+ name +", although you took very thorough precautions in the pod against my hearing you, I could see your lips move."+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println (name + ". Alright, Hal. I'll go in through the emergency airlock."+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ("Hal. Without your space- helmet, "+ name + ", you're going to find that rather difficult."+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println (name + ". Hal, I won't argue with you any more. Open the doors."+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println ("Hal. " + name + ", this conversation can serve no purpose any more. Goodbye."+lineseparator);
             TimeUnit.SECONDS.sleep(2);
           System.out.println (name + ". Hal? Hal. Hal. Hal! Hal!"+lineseparator);
           



           


           







          
         }
 }