package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SelectionGiftOfTheRequiredQuality {
    public   static @NotNull
    ArrayList<Integer> SelectionGiftOfTheRequiredQuality(ArrayList<Gift> gifts,int from,int to ){
        ArrayList<Integer>   SelectedGift = new ArrayList<>();
        for (Gift i :gifts){
            if (i.quality>=from && i.quality<to)
                SelectedGift.add(i.price);
        }
        return SelectedGift;

    }
}
