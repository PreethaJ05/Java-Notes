import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char sor=sc.next().charAt(0);
		char des=sc.next().charAt(0);
		int person=sc.nextInt();
		int val= person*(des-sor);
		System.out.println("Source place:"+sor+"              Destination place:"+des);
		System.out.println("Number of Persons:"+person);
		if(val<0){
		    System.out.println("Ticket price:"+val*(-10));
		}
		else{
		    System.out.println("Ticket price:"+val*(10));
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int val=0;
		if(a<0){
		    for(int i=a;i<=0;i++){
		    val+=i;
		    }
		    System.out.println(val);
		}  
		else{
		    for(int i=0;i<=a;i++){
		    val+=i;
		    }
		    System.out.println(val);
	    }
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int val=0;

		for(int i=1;i<=a;i+=2){
		    val+=i;
		}
		System.out.println(val);
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int val=1;

		for(int i=1;i<=a;i++){
		    val*=i;
		}
		System.out.println(val);
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int val=1;

		for(int i=2;i<=a;i+=2){
		    val*=i;
		}
		System.out.println(val);
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0,count=0;
		for(int i=1;i<=a;i++){
		    if(a%i==0){
		        System.out.print(i+"  ");
		        sum+=i;
		        count++;
		    }
		}
		System.out.println("Count:"+count+"     "+"Sum:"+sum);
		
		int tem=0;
		for(int i=1;i<=count;i++){
		    if(count%i==0){
		        tem++;
		    }
		}
		if(tem==2){
		    System.out.println("Count is Prime");
		}
		else{
		    System.out.println("Count is not a Prime");
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		for(int i=0;i<=a.length()-1;i++){
		   System.out.print(a.charAt(i)+" ");
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		for(int i=a.length()-1;i>=0;i--){
		   System.out.print(a.charAt(i)+" ");
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		for(int i=0;i<=a.length()-1;i++){
		    char ch=a.charAt(i);
		    if(ch>=97 && ch<=122){
		        System.out.print((char)(ch-32));
		    }
		    else{
		        System.out.print((char)(ch+32));
		    }
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String rev="";
		for(int i=a.length()-1;i>=0;i--){
		   rev+=a.charAt(i);
		}
		System.out.println(rev);
		if(a.equals(rev)) System.out.print("Palindrome");
		else System.out.println("Not a Palindrome");
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		int count =0,count1=0;
		for(int i=a.length()-1;i>=0;i--){
		   char ch=a.charAt(i);
		   if(ch=='a' || ch== 'e' || ch=='i' || ch=='o'|| ch=='u' || ch=='A' || ch== 'E' || ch=='I' || ch=='O'|| ch=='U'){
		       count++;
		   }else{
		       count1++ ;
		   }
		}
		System.out.println("Vowels:"+count);
		System.out.println("Consonent:"+count1);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.length() != b.length()) System.out.println("Not equal");
		else{
		    int flag=0;
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i) != b.charAt(i)){
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		        System.out.println("equal");
		    }
		    else{
		        System.out.print("not equal");
		    }
		}
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.length() != b.length()) System.out.println("Not equal");
		else{
		    System.out.print(a.equalsIgnoreCase(b));
		}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int person=sc.nextInt();
		int child=sc.nextInt();
		System.out.println("Age of Child:");
		int agec=sc.nextInt();
		int men=sc.nextInt();
		System.out.println("Age of Men:");
		int agem=sc.nextInt();
		int women=sc.nextInt();
		System.out.println("Age of Women:");
		int agew=sc.nextInt();
		if(age<=10){
		    System.out.println("Free");
		}else{
		    System.out.print()
		}
		
	}
}
