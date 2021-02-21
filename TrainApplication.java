package FinalProjectDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TrainApplication {
	
	
	public static LocalDate dataInput(String userInput)
	{
		DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date=LocalDate.parse(userInput,dateFormat);
		return date;
	}

	public static void main(String[] args) {
		
		System.out.println("========TicketApplication======");
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd/MM/yy");
	
		TrainDao traindao=new TrainDao();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Train Number");
		int trainnumber=sc.nextInt();
		
		System.out.println("Enter train name");
		String trainname=sc.next();
		
		System.out.println("enter travel date");
		String traveldate=sc.next();
		LocalDate travelDate=dataInput("dd/MM/yyyy");
		
		System.out.println("Enter number of passengers");
		int noofpassenger=sc.nextInt();
		
		
		//calling the findtrain method and passing the parameter
		
		Train train= new Train(trainnumber,trainname,"Bangalore","Mumbai",2347.67);
	    Ticket ticket=new Ticket(travelDate,train);
	    sc.nextLine();
		
         for(int i=0;i<noofpassenger;i++)
	     {
		System.out.println("Enter passenger name");
         String name2=sc.next();
         sc.nextLine();
		
		System.out.println("Enter Passenger Age");
		int age2=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Gender");
		String gende2r=sc.next(); 
		char g=gende2r.charAt(0);
		
		ticket.addPassenger(name2, age2, g);
	      }
	
	System.out.println("ticket booked : "+ticket.generatePnr());
	}

}
