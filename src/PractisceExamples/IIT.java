package PractisceExamples;

public class IIT {

	public static void main(String[] args) {
		String []cou= {"Btech","Bcom","Bsc"};
		Univeristy obj=new Univeristy("SRTM","India","20/2/2000",cou);
        obj.getUniverSityInfo(obj.getName(),obj.getcountry(),obj.getestablishedDate(),obj.getCourses());
	}

}
