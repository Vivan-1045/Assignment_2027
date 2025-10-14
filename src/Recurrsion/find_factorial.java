package Recurrsion;

public class find_factorial {
    int factorial(int n) {
        // code here
        //Base case if n==1 or n==0 just return 1
        if(n==0 || n==1){
            return 1;
        }

        //Otherwise just multiply n recurrsively and return
        return n*factorial(n-1);
    }
}
