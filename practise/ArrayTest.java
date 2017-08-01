package practise_20170710;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest {
	public static final void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double[] score = new double[5];
		for (int i=0; i<score.length; i++){
			score[i] = input.nextDouble();
		}
		
		System.out.println(Arrays.toString(score));
		
		double sum = 0;
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		
		System.out.println(score.length+"個學生的平均成績為" + sum/score.length);
	}
}
