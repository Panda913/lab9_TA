package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Task1  {


    public static int task1  (ArrayList<Gift> gifts , int P){
        ArrayList<Integer>   SelectedGift = SelectionGiftOfTheRequiredQuality.SelectionGiftOfTheRequiredQuality(gifts,5,7);
        SelectedGift.sort(Integer::compareTo);
        int answer=0;
        for (int i=0;i<P;i++) {
            answer=answer + SelectedGift.get(i);
        }
        return TheMinimumNumberOfBanknotes.getNumberOfBanknotes(answer);

    }



}
