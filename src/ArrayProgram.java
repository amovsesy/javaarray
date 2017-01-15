/*Aleksandr Movsesyan
 *ArrayProgram.java
 *CS 111B Programming Lab 5
 *
 *This program never crashes. It stores numbers into an array and then displays them.
 */

import javax.swing.JOptionPane;

class ArrayProgram
{
  public static void main(String[] args)
  {
    int[] nums;
    int numEntries, index;
    String inputLine;
    String[] numbers = null;
    
    do
    {
      try
      {
        inputLine = JOptionPane.showInputDialog("How many numbers do you want to enter?");
        numEntries = Integer.parseInt(inputLine);
        if (numEntries <= 0)
          throw new RuntimeException();
        break;
      }
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null, "Please enter a integer thats greater than 0" +
                                            " and then press ok.");
      }
    }while(true);

    nums = new int[numEntries];

    do
    {
      try
      {
        inputLine = JOptionPane.showInputDialog("Enter your numbers, separated by spaces:");
        numbers = inputLine.split(" ");
        for (int i=0; i < numEntries && i < numbers.length; i++)
          nums[i] = Integer.parseInt(numbers[i]);
        break;
      }
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null, "Please enter at least one integer, with just one " +
                    "space separating each integer, and no spaces at the end.  Then click ok.");  
      }
    }while(true);
    
    do
    {
      try
      {
        inputLine = JOptionPane.showInputDialog("Enter the index of the number you want to see," +
                                                " or click Cancel to end the program.");
        index = Integer.parseInt(inputLine);
        JOptionPane.showMessageDialog(null, "Element number" + index + "=" + nums[index - 1]);
      }
      catch (NumberFormatException e)
      {
        System.exit(1);
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(null, "Please enter a number greater 0 and less than " 
                                       + (numEntries + 1) + " then click Ok.");
      }
    }while(true);
  }
}