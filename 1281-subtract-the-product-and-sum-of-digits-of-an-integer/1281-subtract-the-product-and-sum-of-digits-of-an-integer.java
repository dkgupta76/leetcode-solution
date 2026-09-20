class Solution {
    public int subtractProductAndSum(int n) {

        int productOfDigits = 1;
        int sumOfDigits = 0;

        while (n != 0) {
            int digit = n % 10;

            productOfDigits = productOfDigits * digit;
            sumOfDigits = sumOfDigits + digit;

            n = n / 10;
        }

        return productOfDigits - sumOfDigits;
        
    }
}

//  first time do wrons take productOfDigits = 0, instead of 1