package com.company;

import java.util.ArrayList;

public class Task2_greedy {
    public static int task2_greedy  (ArrayList<Gift> gifts , int money) {
        ArrayList<Integer> SelectedGift = SelectionGiftOfTheRequiredQuality.SelectionGiftOfTheRequiredQuality(gifts, 7, 9);
        SelectedGift.sort(Integer::compareTo);
        int answer = 0;
        int count=0;
        for (int i :SelectedGift) {
            if(answer + i<=money) {
                answer = answer + i;
                count+=1;
            } else break;

        }
        return count;
    }
}
