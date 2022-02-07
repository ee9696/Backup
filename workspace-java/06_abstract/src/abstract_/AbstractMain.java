package abstract_;

public class AbstractMain extends AbstractTest {
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();
		AbstractMain at = new AbstractMain();
		at.setName("ȫ�浿");
		System.out.println(at.getName());
	}
}
