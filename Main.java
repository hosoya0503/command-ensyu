import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̏d(kg):");
		double weight = scanner.nextDouble();
		System.out.print("�g��(cm):");
		double height = scanner.nextDouble();
		height = height/100;
		height = height*height;
		double bmi = weight/height;
		System.out.println("BMI:"+bmi);
	}
}
