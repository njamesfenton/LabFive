import java.util.*;
public class LabFive {

	public static void main(String[] args) {
		System.out.println("How many sides do you want on your die?");
		Scanner scan1 = new Scanner(System.in);
		double x;
		x = scan1.nextDouble();
		
		
		
	}


public static  int rollDice(int number, int nSides)
{ 
    int num = 0;
    int roll = 0;
    Random  r = new Random(); 
    if(nSides >=3) 
    { 
        for(int i = 0; i < number; i++)
        { 
            roll = r.nextInt(nSides)+1;
            System.out.println("Roll is:  "+roll);
            num = num + roll; 
        } 
    } 
    else
    { 
        System.out.println("Error num needs to be from 3"); 
    } 
    return num;  }
}