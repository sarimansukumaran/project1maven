package pkg;

public class Stringoperationpgm {

	public static void main(String[] args) {
		
	//Concat
		
		String s1="Hello my name is Sarima";
		String s2="hello";
		String s3="      Hello";
		
		System.out.println(s2.concat(s3));
		System.out.println(1+2+s3+4+5);
		
	//Equals
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
	//tolower   toupper
		System.out.println(s3.toLowerCase());
		System.out.println(s2.toUpperCase());
		
	//contains
		System.out.println(s1.contains("Sarima"));
		
	//length
		System.out.println(s2.length());
		
	//startswith
		System.out.println(s1.startsWith("Hello"));
		
	//endswith
		System.out.println(s1.endsWith("Sarima"));
		
	//substring
		System.out.println(s2.substring(0,3));
		
	//trim
		System.out.println(s3.trim());
		
	//split
		String[] sar=s1.split(" ");
		
		for(String v:sar)
		{
			System.out.println(v);
		}
		
	//replace
		System.out.println(s1.replace("Hello", "Hai"));
		
	//charAt
		System.out.println(s1.charAt(1));

	}

}
