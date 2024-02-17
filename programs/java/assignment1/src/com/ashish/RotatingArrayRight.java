package com.ashish;

public class RotatingArrayRight {
	public static void main(String[] args) {
		String nums="[1,2,3,4,5]";
		String k="3";
		
		int kk=Integer.parseInt(k);
		for(int i=0;i<kk;i++){
			int j;
			String last="";
			last=nums.substring(nums.length()-1);
			for(j=nums.length()-1;j>0;j--){
				//nums[j]=nums[j-1];
			}
			//nums[0]=last;
			
		}
		for(int i=0;i<5;i++){
			//System.out.print(nums[i]+" ");
		}
	}

}
