package com.handson;
//cardPoints = [1,2,3,4,5,6,1], k = 3
//Output: 12
//Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
//Example 2:
//
//Input: cardPoints = [2,2,2], k = 2
//Output: 4
//Explanation: Regardless of which two cards you take, your score will always be 4.
//Example 3:
//
//Input: cardPoints = [9,7,7,9,7,7,9], k = 7
//Output: 55
//Explanation: You have to take all the cards. Your score is the sum of points of all cards.


public class MaximumCards {
    public int maxScore(int[] card, int k) {
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k-1;i++){
            lsum+=card[i];
        }
        maxsum=lsum;
        int right=card.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=card[i];
            rsum+=card[right];
            right--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}