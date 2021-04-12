package com.company;

import java.util.ArrayList;

public class TheMinimumNumberOfBanknotes {

   public static Integer getNumberOfBanknotes(Integer sum){
       int [] Banknotes ={500,200,100,50,20,10,5,2,1};
       int NumberOfBanknotes=0;
       int i=0;
      while (sum>0){
          NumberOfBanknotes+=sum/Banknotes[i];
          sum%=Banknotes[i];
          i++;
      }
      return NumberOfBanknotes;
   }


}
