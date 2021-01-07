package model;

public class Passenger {
	private Train train;
	private Ticket ticket;

	public Passenger(Train train, Ticket ticket) {
		super();
		this.train = train;
		this.ticket = ticket;
	}

	public Train getTrain() {
		return train;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Passenger [train=" + train + ", ticket=" + ticket + "]";
	}
}
