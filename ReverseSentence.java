package Ten;

public class ReverseSentence {
	public static void main(String[] args) {
		String s = "This is a bird !";
		
		  String st[] = s.split(" "); 
		  int n=st.length;
		  
		  for (int i = n - 2; i >= 0; i--) {
			  if(i==n-2) {
				 String c = st[i].substring(0, 1).toUpperCase();
				String c1 = st[i].substring(1,st[i].length());
				// String c1 = st[i].substring(1,4);  //only for if we know the length of words 
				  System.out.print(c+c1+" "); 
				  continue;

			  }
		     System.out.print(st[i] + " "); 
		  }
		  System.out.print(st[n-1]);
		
	}
}
