package NumberTheory;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveAlgorithm {

    static boolean[] SAPrimeGenerator(int n){
        //Create Prime Marking Array and fill it with true value
        boolean[] primeMarker=new boolean[n+1];
        Arrays.fill(primeMarker,true);
        primeMarker[0]=false;
        primeMarker[1]=false;
        for(int i=2;i<=n;i++){
            if(primeMarker[i]){
                // we start from 2*i because i*1 must be prime
               for(int j=2*i;j<=n;j+=i){
                   primeMarker[j]=false;
               }
            }
        }
        return primeMarker;
    }



    public static void main(String[] args) {
        int n=10000000;
        boolean[] prime=SAPrimeGenerator(n);
        for(int i=0;i<=n;i++){
            if(prime[i])
                System.out.print(i+", ");
        }
    }
}
