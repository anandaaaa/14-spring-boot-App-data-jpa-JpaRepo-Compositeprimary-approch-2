package in.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.Entity.Account;
import in.anand.Entity.AccountPk;
import in.anand.Repo.AccountRepo;

@Service
public class AccountService {
	
	private AccountRepo accrepo;

	@Autowired
	public AccountService(AccountRepo accrepo) {
		super();
		this.accrepo = accrepo;
	}
	
	public void saveData()
	{
		
	AccountPk accpk=	new AccountPk();
	
	accpk.setAccount_ID(1);
	accpk.setAccount_Type("saving");
	accpk.setHolder_Name("IBM2");
	
		
		Account acc=new Account();
		acc.setBranchName("machilipatnam");
		acc.setMinBal(500);
		acc.setAccpk(accpk);
	
		accrepo.save(acc);
		
	}
	
	
}
