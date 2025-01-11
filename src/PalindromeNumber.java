class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int length = 0;
        int y = x;
        while(y > 0){ 
            y = y / 10;
            length++;
        }
        System.out.println("length = " + length);
        for(int iter = 0; iter < length/2; iter++){
            int left = x / (int)(Math.pow(10,(length - (iter + 1))));
            int right = (x / (int)(Math.pow(10,iter)) % 10);
            System.out.println("left:  " + left + " right:  " + right);
            if (left != right){
                return false;
            }
        }
        return true;
    } 
}
