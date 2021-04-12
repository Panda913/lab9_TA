package com.company;

import java.util.ArrayList;

public class Task3 {
    public static int task3  (ArrayList<Gift> gifts , int P) {
        ArrayList<Integer> SelectedGift = SelectionGiftOfTheRequiredQuality.SelectionGiftOfTheRequiredQuality(gifts, 9, 11);
        SelectedGift.sort(Integer::compareTo);
        int answer = 0;
        for (int i = 0; i < P; i++)
            answer = answer + SelectedGift.get(i);
        return answer;
    }
    }
