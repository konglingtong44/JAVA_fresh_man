package practise_20170707;

public class multiplication {
	public static void main(String[] args){
		for (int row=1; row<=9; row++){
			for (int col=1; col<=row; col++){
				System.out.print(col + "*" + row + "=" + (row*col) + "\t");
			}
			System.out.println();
		}
	}

}
