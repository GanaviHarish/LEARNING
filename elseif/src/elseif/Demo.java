package elseif;

public class Demo {
	public void giveGrade(int Score) {
		   if(Score>=90) 
		   {
			   System.out.println("A+ Grade");
		   }
		   else if(Score>=80 && Score <90) 
		   {
			   System.out.println("B Grade");
		   }
		   else if(Score>=70 && Score<80)
		   {
			   System.out.println("c Grade");
		   }
		   else if (Score>=60 && Score <50)
		   {
			  System.out.println("D Grade");
		   }
		   else
		   {
			   System.out.println("fail");
		   }
	   }
	}

