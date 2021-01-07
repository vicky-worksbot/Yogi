package model;


public class Train{
	private char Start;
	private char end;
	private int time;
	private int totalTickets;
	private int tupper;
	private int tmiddle;
	private int tlower;
	private int tsideupper;
	private int tsidelower;
	private int trac;
	private int twait;
	private int upper;
	private int middle;
	private int lower;
	private int sideupper;
	private int sideLower;
	private int racTicket;
	private int waitTicket;
	
	
	
	public Train(char start, char end, int time, int totalTickets
			, int tupper, int tmiddle, int tlower, int tsideupper,
			int tsidelower, int trac, int twait, int upper, int middle
			, int lower, int sideupper, int sideLower,
			int racTicket, int waitTicket) {
		super();
		Start = start;
		this.end = end;
		this.time = time;
		this.totalTickets = totalTickets;
		this.tupper = tupper;
		this.tmiddle = tmiddle;
		this.tlower = tlower;
		this.tsideupper = tsideupper;
		this.tsidelower = tsidelower;
		this.trac = trac;
		this.twait = twait;
		this.upper = upper;
		this.middle = middle;
		this.lower = lower;
		this.sideupper = sideupper;
		this.sideLower = sideLower;
		this.racTicket = racTicket;
		this.waitTicket = waitTicket;
	}
	public int getTrac() {
		return trac;
	}
	public int getTwait() {
		return twait;
	}
	public void setTrac(int trac) {
		this.trac = trac;
	}
	public void setTwait(int twait) {
		this.twait = twait;
	}
	public char getStart() {
		return Start;
	}
	public char getEnd() {
		return end;
	}
	public int getTime() {
		return time;
	}
	public int getTotalTickets() {
		return totalTickets;
	}
	public int getTupper() {
		return tupper;
	}
	public int getTmiddle() {
		return tmiddle;
	}
	public int getTlower() {
		return tlower;
	}
	public int getTsideupper() {
		return tsideupper;
	}
	public int getTsidelower() {
		return tsidelower;
	}
	public int getUpper() {
		return upper;
	}
	public int getMidle() {
		return middle;
	}
	public int getLower() {
		return lower;
	}
	public int getSideupper() {
		return sideupper;
	}
	public int getSideLower() {
		return sideLower;
	}
	public int getRacTicket() {
		return racTicket;
	}
	public int getWaitTicket() {
		return waitTicket;
	}
	public void setStart(char start) {
		Start = start;
	}
	public void setEnd(char end) {
		this.end = end;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}
	public void setTupper(int tupper) {
		this.tupper = tupper;
	}
	public void setTmiddle(int tmiddle) {
		this.tmiddle = tmiddle;
	}
	public void setTlower(int tlower) {
		this.tlower = tlower;
	}
	public void setTsideupper(int tsideupper) {
		this.tsideupper = tsideupper;
	}
	public void setTsidelower(int tsidelower) {
		this.tsidelower = tsidelower;
	}
	public void setUpper(int upper) {
		this.upper = upper;
	}
	public void setMidle(int midle) {
		this.middle = midle;
	}
	public void setLower(int lower) {
		this.lower = lower;
	}
	public void setSideupper(int sideupper) {
		this.sideupper = sideupper;
	}
	public void setSideLower(int sideLower) {
		this.sideLower = sideLower;
	}
	public void setRacTicket(int racTicket) {
		this.racTicket = racTicket;
	}
	public void setWaitTicket(int waitTicket) {
		this.waitTicket = waitTicket;
	}
	@Override
	public String toString() {
		return "Train [Start=" + Start + ", end=" + end + ", time=" + time + ", totalTickets=" + totalTickets
				+ ", upper=" + upper + ", middle=" + middle + ", lower=" + lower + ", sideupper=" + sideupper
				+ ", sideLower=" + sideLower + ", racTicket=" + racTicket + ", waitTicket=" + waitTicket + "]";
	}
	

	


}