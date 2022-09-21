import java.util.Scanner;
public class lab0_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array:");
        n = scan.nextInt();
        int numbers[] = generateRandomArray( n );
        displayer(numbers);
    }
    public static int[] generateRandomArray( int lengthOfArray )
    {
	int[] randomArray = new int[lengthOfArray];
	double randomValue;
	for ( int i = 0; i < lengthOfArray - 1; i++ )
	{
		randomArray[i] = (int) ( 101 * Math.random( ) );
	}
	return randomArray;
    }	
	
    public static void displayer(int numbers[]){
        int sumofOdd = 0;
        int sumofEven = 0;
        System.out.print("Your array is this: ");
		for (int i=0;i<numbers.length;i++){
			System.out.print( (i+1) +  numbers[i] + " ");
		}
        
        System.out.print("Sum of the even indexes is : ");
        
        for(int i=0;i<numbers.length;i=i+2){
            sumofEven = sumofEven + ((i+1) + numbers[i]);
        }
        System.out.println(sumofEven);
        
        System.out.print("Sum of the odd indexes is : ");
        
        for(int i=1;i<numbers.length;i=i+2){
            sumofOdd = sumofOdd + ((i+1) + numbers[i]);

        }
        System.out.println(sumofOdd);
	
    }
    
        public int[] averageMinus(int arr[])
        {
            int sum = 0;
            for (int i = 0; i < arr.length; i++)
                sum += arr[i];
            int average = (int)sum / arr.length;
            
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = newArr[i] - average;
            }
    
            return newArr;
        }
    
    }