package SearchingSorting;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class NthRoot {

    public static double getFormatted(double v) {
        DecimalFormat df=new DecimalFormat("0.00");
        String formate = df.format(v);
        double finalValue = Double.parseDouble(formate) ;
        return finalValue;
    }

    public static double nthRoot(double n,int d)  {
        double left=0.00;
        double right=n;

        while (right-left>(1.0/Math.pow(10,d))){
            double mid=(left+right)/2.0;
            if(Math.pow(mid,3)>n){
                right=mid;
            }else {
                left=mid;
            }
        }
        return getFormatted(left);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Value:");
        double n=sc.nextDouble();
        System.out.println(nthRoot(n,2));

    }
}
