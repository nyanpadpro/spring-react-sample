package hello;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/counter")
public class CounterController {
   
  @Autowired
  CounterService service;
   
  // 一覧表示
  @RequestMapping(value="/selectall", method=RequestMethod.GET)
  public List<Counter> counterSelectAll() {
    return service.selectAll(); 
  }
 
}