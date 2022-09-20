
import java.util.Random;
import java.util.Scanner;
public class lab0_2 {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Enter the size of the array:");
        n = scan.nextInt();

        int numbers[] = new int [n];
        Random m = new Random();

        for (int i=0;i<numbers.length;i++){
			numbers[i]=m.nextInt(100);
        }
        displayer(numbers);


    }
    public static void displayer(int numbers[]){
        System.out.println("Your array is this: ");
		for (int i=0;i<numbers.length;i++){
			System.out.println( (i+1) +  numbers[i] + " ");
		}
        System.out.println("Sum of the even indexes is : ");
        for(int i=0;i<numbers.length;i=i+2){
            System.out.println((i+1) + numbers[i] + "+" );
        }
        System.out.println("Sum of the odd indexes is : ");
        for(int i=1;i<numbers.length;i=i+2){
            System.out.println((i+1) + numbers[i] + "+" );
        }
	}

    
}