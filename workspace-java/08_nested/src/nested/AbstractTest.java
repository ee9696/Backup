package nested;

//POJO
public abstract class AbstractTest {
   String name;

   public String getName() {
      return name;
   }

   public abstract void setName(String name);
}
	
	// 반드시 추상메소드를 Override 