package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.model.Comment;

public interface CommentRepository  extends CrudRepository<Comment, Long>{
	
	public Comment findById(long id);
	
}
