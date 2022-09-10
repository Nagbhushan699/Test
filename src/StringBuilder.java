
public class StringBuilder {

	public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  StringBuffer obj=new StringBuffer("bhushan");
           obj.append("bhalerao");
           StringBuffer ob=new StringBuffer("nagbhushan");
           System.out.println(obj);
           System.out.println(obj.capacity());
           System.out.println(obj.delete(2,4));
           System.out.println(obj.deleteCharAt(2));
           System.out.println(ob.indexOf("u"));
           System.out.println(ob.lastIndexOf("a"));
           System.out.println(ob.reverse());
           System.out.println(ob.replace(2,5,"ou"));
           System.out.println(ob.insert(3,"otu"));
           
	}

	public char[] append(String obj1) {
		// TODO Auto-generated method stub
		return null;
	}

}
