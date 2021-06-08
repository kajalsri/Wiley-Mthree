package bankimpl;


public class MyAccount {
	public static void main(String args[]) {
		SavingAccount sa=new SavingAccount();
		FDAccount fda=new FDAccount();
		PersonalLoanAccount psl=new PersonalLoanAccount();
		HousingLoanAccount hsl=new HousingLoanAccount();
		sa.createAcc();
		sa.calcInt();
		sa.addMonthlyInt();
		sa.addHalfYrlyInt();
		sa.addAnnualInt();
		sa.withdraw();
		sa.wdeposit();
		sa.wgetBalance();
		fda.createAcc();
		fda.calcInt();
		fda.addMonthlyInt();
		fda.addHalfYrlyInt();
		fda.addAnnualInt();
		fda.withdraw();
		fda.wdeposit();
		fda.wgetBalance();
		psl.createAcc();
		psl.calcInt();
		psl.deductMonthlyInt();
		psl.deductHalfYrlyInt();
		psl.deductAnnualInt();
		psl.repayPrincipal();
		psl.payInterest();
		psl.payPartialPrincipal();
		hsl.createAcc();
		hsl.calcInt();
		hsl.deductMonthlyInt();
		hsl.deductHalfYrlyInt();
		hsl.deductAnnualInt();
		hsl.repayPrincipal();
		hsl.payInterest();
		hsl.payPartialPrincipal();
		
	}
}
