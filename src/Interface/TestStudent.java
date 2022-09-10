package Interface;

public class TestStudent {

	public static void main(String[] args) {
    Student obj=new Student();
    System.out.println(University.name);
    obj.displayResult();
    obj.provideMemo();
    obj.provideQuestionPapers();
    obj.giveAdmisson();
    obj.Teaching();
    obj.TakeExams();
    obj.giveExam();
   obj.prepareResult();
	}

}
