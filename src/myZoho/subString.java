package myZoho;

public class subString {

	public static void main(String[] args) {
		int i=0;String str="hixxhi";
		 String end = str.substring(str.length()-2);
		 System.out.println("--"+end);
		 int cnt = 0;  
		for (i=0; i<str.length()-2; i++) {
			String sub = str.substring(i, i+2);
			System.out.println(sub+"-"+end);
		     if (sub.equals(end)) {
		    	 cnt++;}   
		     }
		int  nums[]= {1, 2, 7, 1};
		System.out.println(cnt);
		for (i = 0; i < nums.length - 1; i++) {			
			    if (i+2 <= nums.length - 1){		
			      int j = Math.abs(nums[i] - 1); 
			      int k = Math.abs(j - nums[i+2]); 
			      System.out.println(j+"--"+k+"res"+nums[i]+5 );
			    
			      if(nums[i+1] == nums[i]+5 && k <= 2) {
			    	  System.out.print("true");
			      }
		
			           
		
			    }  
		}}}
	


