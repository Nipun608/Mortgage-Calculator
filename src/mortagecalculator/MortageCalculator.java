
package mortagecalculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortageCalculator {

    
    public static void main(String[] args) {
        final byte Months_In_Year  = 12;
        final byte Percentage = 100;
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Principal: ");
        
        int principal = scanner.nextInt();
        
        
        
        System.out.println("Annual Intrest rate : ");
        float anualIntrest = scanner.nextFloat();
        float monthlyIntrest =  anualIntrest / Percentage / Months_In_Year;
        
        System.out.println("Periods (Years) :");
        byte years = scanner.nextByte();
        int numberOfPayments = years * Months_In_Year;
        
        double Mortage = principal * (monthlyIntrest * Math.pow(1 + monthlyIntrest, numberOfPayments)/ (Math.pow(1 + monthlyIntrest, numberOfPayments) -1));
        
        DecimalFormat currencyFormatter = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
        
        
        String mortageFormatted = currencyFormatter.format(Mortage);
        System.out.println("Mortage : " + mortageFormatted);
        
        
        
    }
    
}
