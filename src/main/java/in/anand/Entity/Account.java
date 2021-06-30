package in.anand.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="BANK_ACCT")
public class Account {
	@Column(name="BRANCH_NAME")
	private String branchName;
	@Column(name="MIN_BAL")
	private float minBal;
	
	@EmbeddedId
	private AccountPk accpk;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public float getMinBal() {
		return minBal;
	}

	public void setMinBal(float minBal) {
		this.minBal = minBal;
	}

	public AccountPk getAccpk() {
		return accpk;
	}

	public void setAccpk(AccountPk accpk) {
		this.accpk = accpk;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accpk=" + accpk + "]";
	}
	
	
	
	
	
}
