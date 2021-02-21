package FinalProjectDemo;

public class Train
{
	private int trainno;
	private String trainName;
	private String source;
	private String destination;
	private double ticketprice;


public Train(int trainno, String trainName, String source, String destination, double ticketprice) {
		super();
		this.trainno = trainno;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.ticketprice = ticketprice;
}



public int getTrainno() {
	return trainno;
}


public void setTrainno(int trainno) {
	this.trainno = trainno;
}


public String getTrainName() {
	return trainName;
}


public void setTrainName(String trainName) {
	this.trainName = trainName;
}


public String getSource() {
	return source;
}


public void setSource(String source) {
	this.source = source;
}


public String getDestination() {
	return destination;
}


public void setDestination(String destination) {
	this.destination = destination;
}


public double getTicketprice() {
	return ticketprice;
}


public void setTicketprice(double ticketprice) {
	this.ticketprice = ticketprice;
}



@Override
public String toString() {
	return "train [trainno=" + trainno + ", trainName=" + trainName + ", source=" + source + ", destination="
			+ destination + ", ticketprice=" + ticketprice + "]";
}
}