package myZoho;

public class twentyOne {

	public static void main(String[] args) {
		String a="xxcaazz";String b="xxbaaz";
		int minlength=(a.length()>b.length())?b.length():a.length();
		  int count=0;int start=0;
		  for(int  end=2;end<minlength;end++){
		   String amatch=a.substring(start,end); String bmatch=b.substring(start,end);
		   System.out.println("a-"+amatch+"----"+"b--"+bmatch);
		    if(amatch.compareTo(bmatch)==0){
		      count++;
		    }
		   start++;
		  }
		  System.out.print("count"+count);	
		  String str="kitten";
		  int st=0;int i=0	;
		  String res="";
		  while(i<str.length()){
		    res=res+str.substring(st,i+1);
		    i*=2;
			st=i;i+=1;
		  }
		 // res+=str.charAt(str.length()-1);
		 System.out.print("count=="+res);	
		 i=0;str="hixxhi";
		 String end = str.substring(str.length()-2);
		 System.out.println(end);
		 int cnt = 0;  
		for (i=0; i<str.length()-2; i++) {
			String sub = str.substring(i, i+2);
			System.out.println(sub+"-"+end);
		     if (sub.equals(end)) {
		
		       cnt++;}      }
		System.out.println(cnt);
		}
		  
		 
}
