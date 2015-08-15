package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.model.Question;

public interface QuestionRepository  extends CrudRepository<Question, Long>{
	
	public Question findByTitle(String title);
	public Question findById(long id);
	
}
