package abstract_;

// POJO형식 (Plain old java object)
public abstract class AbstractTest {
	String name;
	
	public String getName() {
		return name;
	}
	
	public abstract void setName(String name); //추상메소드
}
