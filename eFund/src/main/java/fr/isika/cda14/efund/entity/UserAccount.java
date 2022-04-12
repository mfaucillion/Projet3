package fr.isika.cda14.efund.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "user_account")
public class UserAccount extends Account{
	
	@OneToOne
	@JoinColumn(name = "user_info_id")
	private UserInfo userInfo;
	
	@OneToMany(mappedBy = "userAccount")
	private List<PaymentMethod> paymentMethods;
	
}
