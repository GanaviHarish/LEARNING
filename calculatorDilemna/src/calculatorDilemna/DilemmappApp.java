package calculatorDilemna;

public class DilemmappApp {

	public  void calculator(int n , int m, String operation) {
	   switch(operation) {
	   case "add":
	     int result = n+m;
	     System.out.println("result");
	     break;
	   case "sub" :
		   int result1 = m -n;
		   System.out.println("result1");
		   break;
	   case "multi" :
		   int result2 =m*n;
		   System.out.println("result2");
		   break;
	   case "dev" :
		   int result3 =m*n;
		   System.out.println("result3");
		   break;
		   default:
			   System.out.println("invaild operation");
		   
	   }
	}

}
