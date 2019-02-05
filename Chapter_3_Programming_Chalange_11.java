///////////////////////////////////////////
//This program is a Running the Race/
///////////////////////////////////////////
import javax.swing.JOptionPane;

public class Chapter_3_Programming_Chalange_11
{
   public static void main(String[] args)
   {
      
      //Variables declaration
      String input, name1, name2, name3,  firstName = "g", secondName = "c" , tihirdName = "d" ;
      double time1, time2, time3, firstPlace = 0, secondPlace = 0, thirdPlace = 0;
      
      //String input
      input=
         JOptionPane.showInputDialog ("Enter the first runner name");
      name1 = input;
      input=
         JOptionPane.showInputDialog ("Enter the first runner time");
      time1 = Double.parseDouble (input);
      input=
         JOptionPane.showInputDialog ("Enter the first runner name");
      name2 = input;
      input=
         JOptionPane.showInputDialog ("Enter the first runner time");
      time2 = Double.parseDouble (input);
      input=
         JOptionPane.showInputDialog ("Enter the first runner name");
      name3 = input;
      input=
         JOptionPane.showInputDialog ("Enter the first runner time");
      time3 = Double.parseDouble (input);
      
      
      
      // Desission structure 
  
      if (time1 > time2 && time1 > time3)
         if (time2 > time3)
         {
         firstPlace = time3;
         secondPlace = time2;
         thirdPlace = time1;
         firstName = name3;
         secondName = name2;
         tihirdName = name1;
         }
         else
         {
         firstPlace = time3;
         secondPlace = time1;
         thirdPlace = time2;
         firstName = name3;
         secondName = name1;
         tihirdName = name2;

         }
         
      else if (time2 > time1 && time2 > time3
      )
         if (time1 > time3)
         {
         firstPlace = time3;
         secondPlace = time1;
         thirdPlace = time2;
         firstName = name3;
         secondName = name1;
         tihirdName = name2;
         }
         else
         {
         firstPlace = time1;
         secondPlace = time3;
         thirdPlace = time2;
         firstName = name1;
         secondName = name3;
         tihirdName = name2;
         }
         
      else if (time3 > time1 && time3 > time2)
         if (time1 > time2)
         {
         firstPlace = time2;
         secondPlace = time1;
         thirdPlace = time3;
         firstName = name2;
         secondName = name1;
         tihirdName = name3;
         }
       else 
         {
         firstPlace = time1;
         secondPlace = time2;
         thirdPlace = time3;
         firstName = name1;
         secondName = name2;
         tihirdName = name3;
         }
      else
      JOptionPane.showMessageDialog (null, "Results should be differant"); 
   
      // Printing results
      
      JOptionPane.showMessageDialog (null, ("The first place got " + firstName + " with the result of " +  firstPlace + " seconds\n" +
                                           "The second place got " + secondName + " with the result of " +  secondPlace + " seconds\n" +
                                           "The third place got " + tihirdName + " with the result of " +  thirdPlace + " seconds\n"));
      
        
   }
}
