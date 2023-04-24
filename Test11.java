package com.Edubridge;
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]x= {1,2,3,4,5,6,7,8};
		
		int []y=x;
		//for(variable:object)
		x[5]=100;//change the index value
		for(int i:y)
		{
			System.out.print(i+" ");
				
		}
	}

}