//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tomas
//Date - 01/29/2021

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
  //Create an int variable called sum, set equal to 0
  int sum = 0;

  //Using a for loop, iterate through all of the numbers in the ArrayList, using int counter = 0 as initializer and count++ as the update
  for(int counter = 0; counter < ray.size(); counter++)
  {
    //In the loop body, set sum equal to sum plus the number in position counter of the ArrayList
    sum = sum + ray.get(counter);

    //Enclose the for-loop and return sum
  }
  return sum;
  //Enclose the method
 }
}