package fr.isika.cda14.efund.entity.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_like")
public class UserLike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;

}