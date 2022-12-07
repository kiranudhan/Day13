package generic.com;

public class MaxUsingGenericMethod {
	public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
    	
    	if(y.compareTo(max)>0) {
    		max=y;
    	}
    	if(z.compareTo(max)>0) {
    		max=z;
    	}
    	return max;
	}

	public static void main(String[] args) {
		Integer a=10,b=20,c=30;
		Float f1=12.3f,f2=23.5f,f3=34.5f;
		String s1="abc",s2="efg",s3="hij";
		System.out.println("Maximum int value :" +maximum(a,b,c));
        System.out.println("Maximum float value : "+maximum(f1,f2,f3));
        System.out.println("Maximum String value : "+maximum(s1,s2,s3));
	}

}
