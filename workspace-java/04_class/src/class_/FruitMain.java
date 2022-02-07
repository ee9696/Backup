package class_;

public class FruitMain {
	
	public static void main(String[] args) {
		//FruitTest aa = new FruitTest("사과",100,80,75);
		//FruitTest bb = new FruitTest("포도",30.25.10);
		//FruitTest cc = new FruitTest("딸기",25,30,90);
		//---------------------------------------------
		//FruitTest[] ar = new FruitTest[3];
		//ar[0] = new FruitTest("사과",100,80,75);
		//ar[1] = new FruitTest("포도",30.25.10);
		//ar[2] = new FruitTest("딸기",25,30,90);	
		//---------------------------------------------
		//FruitTest[] ar = new FruitTest[] {new FruitTest("사과",100,80,75),
		//								  new FruitTest("포도",30,25,10),
		//								  new FruitTest("딸기",25,30,90)};
		
		FruitTest[] ar = {new FruitTest("사과",100,80,75),
						  new FruitTest("포도",30,25,10),
						  new FruitTest("딸기",25,30,90)};
		
		System.out.println("------------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("------------------------------------------");
		
		/*for(int i=0; i<ar.length; i++) {
			
		}*/
		
		for(FruitTest data : ar) {
			data.calcTot();
			data.display();
			
		}
		
		System.out.println("------------------------------------------");
		FruitTest.output();
		
		/*
		ar[0].calcTot();
		ar[1].calcTot();
		ar[2].calcTot();	
		

		ar[0].display();
		ar[1].display();
		ar[2].display();
		*/

	}
}

