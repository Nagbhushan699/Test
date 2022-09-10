
public class stringbuilder_ex1 {
	
	

	public static void main(String[] args) {
	 StringBuffer obj=new StringBuffer("bhushan"); 
	  System.out.println(obj.length());
	  System.out.println(obj.reverse());
	  System.out.println(obj.capacity()); 
	  System.out.println(obj.delete(2,5));             
	  System.out.println(obj.insert(1,"bhale")); 
	  System.out.println(obj.deleteCharAt(2));	  System.out.println(obj.replace(2,5,"geeta"));
	  System.out.println(obj.substring(2));        	  
	  System.out.println(obj.replace(2,5,"bullu"));      
	  
	}

}
