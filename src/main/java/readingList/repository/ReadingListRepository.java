package readingList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import readingList.model.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long>{
	
	List<Book> findByReader(String reader);

}
