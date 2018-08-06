package hello;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class CounterService {
 
  @Autowired
  CounterRepository repository;
   
  public List<Counter> selectAll() {
    return repository.findAll(new Sort(Sort.Direction.ASC, "id"));
  }
   
}