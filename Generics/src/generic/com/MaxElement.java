package generic.com;

public class MaxElement {
	public static String maxInteger(Integer a, Integer b, Integer c) {
		// TODO Auto-generated method stub
		 String a1=Integer.toString(a);
		 String a2=Integer.toString(b);
		 String a3=Integer.toString(c);
		 String max=a1;
			if(a2.compareTo(max)>0) {
	    		max=a2;
	    	}
	    	if(a3.compareTo(max)>0) {
	    		max=a3;
	    	}
	    	return max;
		}
    public static String maxString(String s1,String s2,String s3) {
    	String max=s1;
    	
    	if(s2.compareTo(max)>0) {
    		max=s2;
    	}
    	if(s3.compareTo(max)>0) {
    		max=s3;
    	}
    	return max;
      }
    
  public static String maxFloat(Float f1,Float f2,Float f3) {
    	String f1s=Float.toString(f1);
		 String f2s=Float.toString(f2);
		 String f3s=Float.toString(f3);
    	String max=f1s;
    	
    	if(f2s.compareTo(max)>0) {
    		max=f2s;
    	}
    	if(f3s.compareTo(max)>0) {
    		max=f3s;
    	}
    	return max;
      }
	public static void main(String[] args) {
		Integer a=10,b=20,c=30;
		Float f1=12.3f,f2=23.5f,f3=34.5f;
		String s1="abc",s2="efg",s3="hij";
		 
		System.out.println(maxInteger(a,b,c));
		System.out.println(maxFloat(f1,f2,f3));
		System.out.println(maxString(s1,s2,s3));
	}
}
