package leetCode;
import java.util.Scanner;
import java.util.ArrayList;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter target number: ");
		int target = sc.nextInt();
		System.out.print("Enter the size: ");
		int size = sc.nextInt(); sc.nextLine();
		int[] nums = new int[size];
		System.out.print("Enter numbers: ");
		for (int i=0; i < size ; i++) {
			nums[i] = sc.nextInt();
		}
		
		ArrayList<Integer> output = new ArrayList<>();
		
		for (int j=0; j<size; j++) {
			for (int k=j+1; k<size; k++) {
				int sum = nums[j] + nums[k];
				if (sum == target) {
					output.add(j);
					output.add(k);
				}
			}
		}
		System.out.print("Output" + output);

	}

}
