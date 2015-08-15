package demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String question;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return question;
	}
	public void setText(String text) {
		this.question = text;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + "]";
	}
	
	@OneToMany(mappedBy="question", cascade=CascadeType.REMOVE)
	private List<Answer> answers;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.REMOVE)
	private List<Comment> comments;

}
