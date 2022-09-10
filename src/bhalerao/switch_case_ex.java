package bhalerao;

public class switch_case_ex {

	public static void main(String[] args) {
		// Write a switch case programe on RBAC(Role based access control) for user permission
		String role = "admin"; //superadmin, customer,vendor, partner, seller
		switch (role) {
		case "admin" :System.out.println("admin can access RBAC");
			break;
		case "superadmin" :System.out.println("superadmin can access RBAC");
		break;
		case "customer" :System.out.println("customer can access RBAC");
		break;
		case "vendor" :System.out.println("vendor can access RBAC");
		break;
		case "partner" :System.out.println("partner can access RBAC");
		break;
		default:System.out.println("NO one  can access RBAC");		
		break;
		
		}

	}

}
