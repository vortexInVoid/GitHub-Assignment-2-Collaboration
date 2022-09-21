import java.util.Scanner;
    public class lab0_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n=1;
            int a=9;
            while(n!=0){
                System.out.println("Menu:");
                System.out.print("Enter the size of the numbersay:(If you want to exit enter 0, If not enter a positive number other than 0)");
                n = scan.nextInt();
                int numbers[] = generateRandomnumbersay( n );
                while(a!=5){
                System.out.println("for array element's (enter 1)");
                System.out.println("the sum of elements with odd- and even-numbered indexes (enter 2)");
                System.out.println("number's differences from the average (enter 3)");
                System.out.println("find the min and max (enter 4) ");
                System.out.println("go back to the Menu(enter 5)");
                System.out.print("Enter:");
                a=scan.nextInt();
                if(a==1){
                displayer1(numbers);
                }
                if(a==2){
                displayer2(numbers);
                }
                if(a==3){
                    System.out.print("Dİfference is = ");
                    printer(numbers);
                    System.out.println();
                }
                if(a==4){
                System.out.println("Maximum is = " + (max(numbers)));
                System.out.println("Minimum is = " + (min(numbers)));
            }}
        System.out.println();}
        }
 public static int max(int[] numbers)
{
    int lenOfnumbersay = numbers.length;
    int i = 1;
    int maximum = numbers[0];

    while (i < lenOfnumbersay)
    {
        if (numbers[i] > maximum)
        {
            maximum = numbers[i];
        }
        i++;
    }
    return maximum;

}

public static int min(int[] numbers)
{
    int lenOfnumbersay = numbers.length;
    int i = 1;
    int min = numbers[0];

    while (i < lenOfnumbersay)
    {
        if (numbers[i] < min)
        {
            min = numbers[i];
        }
        i++;
    }
   return min;
}

        public static int[] generateRandomnumbersay( int lengthOfnumbersay )
        {
        int[] randomnumbersay = new int[lengthOfnumbersay];
        double randomValue;
        for ( int i = 0; i < lengthOfnumbersay - 1; i++ )
        {
            randomnumbersay[i] = (int) ( 100 * Math.random( ) );
        }
        return randomnumbersay;
        }	
        
        public static void displayer1(int numbers[]){
            System.out.print("");
            System.out.print("Your numbersay is this: ");
            for (int i=0;i<numbers.length;i++){
            System.out.print( (i+1) +  numbers[i] + " ");
            }
        System.out.println();
        }
            public static void displayer2(int numbers[]){
            int sumofEven = 0;
            System.out.print("Sum of the even indexes is : ");
            
            for(int i=0;i<numbers.length;i=i+2){
                sumofEven = sumofEven + ((i+1) + numbers[i]);
            }
            System.out.println(sumofEven);
            
            int sumofOdd = 0;
            System.out.print("Sum of the odd indexes is : ");
            
            for(int i=1;i<numbers.length;i=i+2){
                sumofOdd = sumofOdd + ((i+1) + numbers[i]);
    
            }
            System.out.println(sumofOdd);
        
        }
        
            public static int[] averageMinus(int numbers[])
            {
                int sum = 0;
                for (int i = 0; i < numbers.length; i++)
                    sum += numbers[i];
                int average = (int)sum / numbers.length;
                
                int[] newnumbers = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    newnumbers[i] = newnumbers[i] - average;
                }
        
                return newnumbers;
            }
            public static void printer( int[] numbers )
            {
              System.out.print( "{");
              for( int i = 0; i < numbers.length; i++ )
              {
                
                System.out.print ( numbers[i] + " " );
              }
              System.out.print("}");
            }
        }
