package Interface;

public interface University {
   String name="Nagbhushan";
   void displayResult();
   void provideMemo();
   void provideQuestionPapers();
  default  void prepareResult() {
	   System.out.println("prepareResult---university");
   }
}
