class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        int temp = num;
            while(temp!=0){
                if(temp%2 == 0){
                    int divNum = temp/2;
                    count++;
                    temp = divNum;
                    
                }else{
                    temp =temp-1;
                    count++;
                }
            }
            return count;
        }
    }
