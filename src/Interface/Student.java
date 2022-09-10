package Interface;

public class Student implements University,College {

	@Override
	public void giveAdmisson() {
	    System.out.println("Giveadmisson----college");
		
	}

	@Override
	public void Teaching() {
		System.out.println("Teaching----college");
		
	}

	@Override
	public void TakeExams() {
		System.out.println("TakeExams----college");
		
	}

	@Override
	public void displayResult() {
		System.out.println("displayResult----university");
		
	}

	@Override
	public void provideMemo() {
		System.out.println(" provideMemo----university");
		
	}

	@Override
	public void provideQuestionPapers() {
		System.out.println(" provideQuestionPapers----university");
		
	}
	void giveExam() {
		System.out.println("Give exam ---student");
	}
	@Override
	  public  void prepareResult() {
		   System.out.println("prepareResult---student");
	   }
}
