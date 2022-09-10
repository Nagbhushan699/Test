package PractisceExamples;

import java.util.ArrayList;

public class School {
	String name;
	ArrayList rollNos=new ArrayList();
	public void showNos(String name,ArrayList rollNos) {
		this.name=name;
		this.rollNos=rollNos;
		System.out.println("School ClassName : "+name);
		for(int i=0;i<=rollNos.size()-1;i++) {
			System.out.println("RollNos["+i+"] : "+rollNos.get(i));
		}
	}

	public static void main(String[] args) {
		School obj=new School();
		ArrayList rollNos=new ArrayList();
		rollNos.add(20);
		rollNos.add(21);
		rollNos.add(22);
		obj.showNos("Class A : ", rollNos);

	}

}
