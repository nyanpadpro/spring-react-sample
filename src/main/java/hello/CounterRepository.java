package hello;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface CounterRepository extends JpaRepository<Counter, Integer> {
}