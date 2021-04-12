package com.company;

import java.util.ArrayList;

public class Task2 {
    public static long task2  (ArrayList<Gift> gifts , int money) {
        ArrayList<Integer> SelectedGift = SelectionGiftOfTheRequiredQuality.SelectionGiftOfTheRequiredQuality(gifts, 7, 9);

        long[][] dp = new long [money+1][money+1];
        int i,j;

       for(i=0;i<=money;++i)
            dp[0][i]=0;

        for(i=1; i<=money; ++i)
        {
            for(j=1; j<=SelectedGift.size(); j++)
            {
                dp[i][j]=dp[i][j - 1];

               if (i>=SelectedGift.get(j-1) && (dp[i-SelectedGift.get(j-1)][j - 1]+1 >+ dp[i][j]) )
                    dp[i][j] = dp[i-SelectedGift.get(j-1)][j - 1]+1;
            }
        }

        /*for (i=1;i<=SelectedGift.size();i++){
            for (j=1;j<=money;j++){
               System.out.print(dp[j][i]+ " ");
            }
            System.out.println();
        }*/

        return dp[money][SelectedGift.size()];

    }

}
