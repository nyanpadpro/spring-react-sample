package hello;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="counter1")
public class Counter {
   
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
   
  @Column(name="title")
  private String title;
 
  @Column(name="count")
  private int count;
   
  // getter, setter
  public Integer getID() {return id;}
  public void setId(Integer no) {this.id = no;}
  public String getTitle() {return title;}
  public void setTitle(String title) {this.title = title;}
  public int getCount() {return count;}
  public void setCount(int count) {this.count = count;}
   
}