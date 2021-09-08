


public class population {

	public static void main(String[] args) {
	
		int time = 3600 * 24 * 1825;
		int newbirth = time/7;
		int death = time/13;
		int immigrant = time/45;
		
		int presentpopulation = 312032486;
		int population = newbirth + immigrant - death;
		
		for (int i=1;i<5;i++);
		
		{
			
			int current_population = presentpopulation + population;
			System.out.println(current_population);
		}
		
		
		

	}	       

}


