package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.model.Answer;

public interface AnswerRepository  extends CrudRepository<Answer, Long>{
	
	public Answer findById(long id);
	
}
