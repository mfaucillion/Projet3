package fr.isika.cda14.efund.entity.project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "content_tab")
public class ContentTab {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	
	@OneToMany
	@JoinColumn(name = "content_tab_id")
	private List<ContentBlock> contentBlocks;
	
	private String name;
	
}
