class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

//  here what a problem i have do this in wrongs ways because  i run while loop twice but here 1st sum denotes at num so it make easy for me 