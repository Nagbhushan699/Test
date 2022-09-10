package Practise12;

public class TestBankAcc {
	public static void accInfo(long accNo,String bankName,String IFSC) {
		System.out.println("My accNumber is : "+accNo);
		System.out.println("My BankName is : "+bankName);
		System.out.println("My IFSC Code is : "+IFSC);
	}

	public static void main(String[] args) {
		AccHolder acc1=new AccHolder();
		acc1.setAccNo(205666);
		SBI.setBankName("SBI");
		acc1.setIFSC("SBIN20054");
		acc1.getAccHolderInfo("Bhushan",'M');
		TestBankAcc.accInfo(acc1.getAccNo(),acc1.getBankName(),acc1.getIFSC());
        acc1.sendMoney();
        acc1.checkBalance();
        acc1.sendMoney("G Pay");
        
	}

}
