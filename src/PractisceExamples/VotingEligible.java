package PractisceExamples;

public class VotingEligible {
    public void checkEligible(int age) {
    	if(age>=18 && age<100) { 
    	System.out.println("Voter is elgible to vote");
    	}
    	else {
    		System.out.println("YOUR AGE is not elegible");
    	}
    	
    	
    }
	public static void main(String[] args) {
		VotingEligible obj=new VotingEligible();
		obj.checkEligible(20);

	}

}
