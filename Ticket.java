package FinalProjectDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
//import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author Lenovo
 *
 */
class Ticket {

	private int counter;
	private String pnr;
	private LocalDate Date;
	private Train train;
	private TreeMap<Passenger,Integer>Passengers;
	
	
	   public Ticket(LocalDate traveldate, Train train) {
		super();
		Date = traveldate;
		this.train = train;
	}

	
	   
	  public int getCounter1() {
			return counter;
		}


    public void setCounter(int counter) {
			this.counter = counter;
		}



      public String getPnr() {
			return pnr;
		}


public void setPnr(String pnr) {
			this.pnr = pnr;
		}


public LocalDate getDate() {
			return Date;
		}

public void setDate(LocalDate date) {
			Date = date;
		}


public Train getTrain() {
			return train;
		}

public void setTrain(Train train) {
			this.train = train;
		}

public TreeMap<Passenger, Integer> getPassengers() {
			return Passengers;
		}


     public void setPassengers(TreeMap<Passenger, Integer> passengers) {
			this.Passengers = passengers;
		} 
	   
	   
     public String generatePnr()
     {
    String source=String.valueOf(train.getSource().charAt(0));
    String destination=String.valueOf(train.getDestination().charAt(0));
    String date=Date.format(DateTimeFormatter.ofPattern("YYYYMMdd"));
    String pnr=source+destination+"_"+date+"_"+counter++;
     
     
     if(Date.isAfter(LocalDate.now()))
    	 return pnr;
     else
     
    	 return "Enter valid date";
     
     }
     
    double calPassengerFare(Passenger Passenger)
	 {
		 if(Passenger.getAge()<=12)
			 
			 return train.getTicketprice()*0.5;
		 else if(Passenger.getAge()>=54)
			 
			 return train.getTicketprice()*0.6;
		 
		 else if(Passenger.getGender()=='f')
			 
			 return train.getTicketprice()*0.25;
		 else
			 return train.getTicketprice();
	 }
	 
	 public void addPassenger(String name,int age,char gender)
	 {
	Integer fare=(int)calPassengerFare(new Passenger(name,age,gender));
	 Passengers.put(new Passenger(name,age,gender), fare);
	 
	 }
		 
	 double calculateTotalTicketPrice()
	 {
		 double totalPrice=0;
		 Collection<Integer>price=Passengers.values();
		 for(Integer values:price)
		 {
			 totalPrice=totalPrice+values;
		 }
		 return totalPrice;
	 }
	 
	 
	 StringBuilder generateTicket()
	 {
		 return null;
	 }
	 
	 public void writeTicket()
	 {
		System.out.println("===write the ticket===");
	 }
	 
     }
	 
	 
	 
	 


















	