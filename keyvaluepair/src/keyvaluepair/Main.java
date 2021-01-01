package keyvaluepair;

import java.util.Scanner;

import org.json.simple.parser.ParseException;


public class Main {

	public static void main(String[] args) throws ParseException, InterruptedException {
		CREATE c= new CREATE();
		//c.JSONCreate();
		READ r= new READ();
		//r.ReadJSON();
		DELETE d= new DELETE();
		//d.DeleteJSON();
		
		System.out.println("select one of the operations ");
		System.out.println("1.Create a keyvalue pair ");
		System.out.println("2.read data from json file");
		System.out.println("3.delete data from json file");
		//System.out.println("3.delete data from json file");
		Scanner s= new Scanner(System.in);
		int value= s.nextInt();
		
		switch(value) 
		{
		case 1:c.JSONCreate();break;
		case 2:r.ReadJSON();break;
		case 3:d.deleteJSON();break;
		default: System.out.println("you have entered wrong number, please try again");
		Thread.sleep(1000);
		}

	
		
	
		
		
		}


		
				
		
		
		
		}
		
		
		
		
		

	


