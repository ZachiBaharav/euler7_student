
/*
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 * 
 * Answer: 104743
 */


public class Euler7 {  
        
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        
        int p = euler7( 6 );        
        System.out.println("The 6th prime = " + p + " (<== should be 13)");

        
        p = euler7( 10001 );        
        System.out.println("the 10,001st prime = " + p);
                
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Time: " + (elapsedTime / 1000000)  + "[msec]");
        
    }        
    
    /**
     * 
     * @param n input number n
     * @return The n'th prime
     * 
     */
    public static int euler7(int n) {
    
        int cnt = 0;
        int p = 1;
        while (cnt != n) {
            if (isPrime(++p))
                cnt++;
        }
        return p;
    }
    
    /**
     * 
     * @param n input number
     * @return True if prime, false otherwise
     */
    public static boolean isPrime(long n) {
        for (int ii=2; ii<=Math.sqrt(n) ; ++ii)
            if (n%ii==0) return false;
        return true;
    }

    
    
}
