package NumberTheory;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveAlgorithm {

    static boolean[] SAPrimeGenerator(int n){
        //Create Prime Marking Array and fill it with true value
        boolean[] primeMarker=new boolean[n+1];
        int[] hp=new int[n+1];//Highest Prime Factor of i
        int[] lp=new int[n+1];
        Arrays.fill(hp,0);
        Arrays.fill(lp,0);
        Arrays.fill(primeMarker,true);
        primeMarker[0]=false;
        primeMarker[1]=false;
        for(int i=2;i<=n;i++){
            if(primeMarker[i]){
                lp[i]=hp[i]=i;
                // we start from 2*i because i*1 must be prime
               for(int j=2*i;j<=n;j+=i){
                   primeMarker[j]=false;
                   hp[j]=i;
                   if(lp[j]==0){
                       lp[j]=i;
                   }
               }
            }
        }
        for(int i=0;i<=n;i++){
            System.out.println("H prime:"+i+"  :  "+hp[i]);
            System.out.println("L prime:"+i+"  :  "+lp[i]);
        }
        return primeMarker;
    }



    public static void main(String[] args) {
        int n=30;
        boolean[] prime=SAPrimeGenerator(n);
        for(int i=0;i<=n;i++){
            if(prime[i])
                System.out.print(i+", ");
        }
    }
}
