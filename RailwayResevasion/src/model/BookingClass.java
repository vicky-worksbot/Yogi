package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.Main;

public class BookingClass {
	static int ticketCount = 0;
	static Main m = new Main();
	int cid = 0;
	public List<Ticket> ractic = new ArrayList<>();
	public List<Ticket> waittic = new ArrayList<>();
	public Map<Integer, Ticket> passtic = new HashMap<>();
	List<Train> Booked = new ArrayList<>();
	public void Book(String name, int age, char start, char end, String preference) {
		Train t = isAvail(start, end);
		if (t == null) {
			System.out.println("Train Not Available From " + start + " To " + end);
		} else {
			if (preference.equalsIgnoreCase("upper")) {
				ticketCount = t.getUpper();
			} else if (preference.equalsIgnoreCase("middle")) {
				ticketCount = t.getMidle();
			} else if (preference.equalsIgnoreCase("lower")) {
				ticketCount = t.getLower();
			} else if (preference.equalsIgnoreCase("sideUpper")) {
				ticketCount = t.getSideupper();
			} else
				System.out.println("Wrong preference input");
			int availConfirm = t.getLower() + t.getMidle() + t.getUpper() + t.getSideupper();
			t.setTotalTickets(t.getTotalTickets()+availConfirm+t.getRacTicket()+t.getWaitTicket());
			if (t.getTotalTickets() > 0){
				if (availConfirm > 0) {
					if (ticketCount == 0) {
						System.out.println("Ticket Not Available for Your " 
					+ "Preference..please try other");
						m.Booking();
					} else {
						if (age > 5) {
							if (preference.equalsIgnoreCase("lower")) {
								if (age > 60) {
									t.setLower(t.getLower() - 1);
									t.setTotalTickets(t.getTotalTickets() - 1);
									t.setTlower((t.getTlower() + 1));
									passtic.put(++cid, (new Ticket(name, age, preference, start, end, t, cid)));

									System.out.println("Lower Berth Ticket Booked..Customer id-" + cid);
								} else if (age <= 5) {
									System.out.println(
											"No Ticket For Infants\n" + "Lower berth is Allocated for parent ");
									t.setLower(t.getLower() - 1);
									t.setTotalTickets(t.getTotalTickets() - 1);
									t.setTlower(t.getTlower() + 1);
									passtic.put(++cid, (new Ticket(name, age, preference, start, end, t, cid)));
									System.out.println("Lower Berth Ticket Booked..Customer id-" + cid);
								} else {
									System.out.println(
											"Lower Berth is Only for" + "parent with infans and age greater than 60");
									System.out.println("Please give other preference");
									m.Booking();
								}
							} else if (preference.equalsIgnoreCase("middle")) {
								t.setMidle(t.getMidle() - 1);
								t.setTotalTickets(t.getTotalTickets() - 1);
								t.setTmiddle(t.getTmiddle() + 1);
								passtic.put(++cid, (new Ticket(name, age, preference, start, end, t, cid)));
								System.out.println("Middle Berth Ticket Booked..CustomerId-" + cid);
							} else if (preference.equalsIgnoreCase("upper")) {
								t.setUpper(t.getUpper() - 1);
								t.setTotalTickets(t.getTotalTickets() - 1);
								t.setTupper(t.getTupper() + 1);
								passtic.put(++cid, (new Ticket(name, age, preference, start, end, t, cid)));
								System.out.println("Upper Berth Ticket Booked..Customer id-" + cid);
							} else if (preference.equalsIgnoreCase("sideUpper")) {
								t.setSideupper(t.getSideupper() - 1);
								t.setTotalTickets(t.getTotalTickets() - 1);
								t.setTsideupper(t.getTsideupper() + 1);
								passtic.put(++cid, (new Ticket(name, age, preference, start, end, t, cid)));
								System.out.println("Side Upper Ticket Booked..CustomerId-" + cid);
							}
						}

						else {
							System.out.println("No Ticket For Infants");
							m.Booking();
						}

					}
				} else {
					if(age>5) {
					if (t.getRacTicket() > 0) {
						System.out.println("No Confirmed Tickets Available ..." + " RAC Booking Only");
						if (t.getSideLower() > 0) {
							t.setSideLower(t.getSideLower() - 1);
							t.setTotalTickets(t.getTotalTickets() - 1);
							t.setRacTicket(t.getRacTicket() - 1);
							t.setTsidelower(t.getTsidelower() + 1);
							t.setTrac(t.getTrac() + 1);
							passtic.put(++cid, (new Ticket(name, age, preference, start, end, t, cid)));
							System.out.println("Rac Side Lower is Booked-" + cid);
						} else {
							t.setTotalTickets(t.getTotalTickets() - 1);
							t.setRacTicket(t.getRacTicket() - 1);
							t.setTrac(t.getTrac() + 1);
							ractic.add((new Ticket(name, age, preference, start, end, t, ++cid)));
							passtic.put(cid, (new Ticket(name, age, preference, start, end, t, cid)));
							System.out.println("Rac is Booked Seating Details will send Later-" + cid);
						}
					} else {
						if(age>5) {
						if (t.getWaitTicket() > 0) {
							t.setTotalTickets(t.getTotalTickets() - 1);
							t.setWaitTicket(t.getWaitTicket() - 1);
							t.setTwait(t.getTwait() + 1);
							System.out.println("Only Waiting List is Available");
							waittic.add((new Ticket(name, age, preference, start, end, t, ++cid)));
							passtic.put(cid, (new Ticket(name, age, preference, start, end, t, cid)));
							System.out.println("Waiting List is Booked Seating Details will send Later-" + cid);
						} else {
							System.out.println("No Tickets Available in this Train");
						}
					}
						else {
							System.out.println("No Ticket For Infants");
							m.Booking();
						}
					}

				}
					else {
						System.out.println("No Ticket For Infants");
						m.Booking();
					}

			}
			}
			
			else {
				System.out.println("No Tickets Available in this Train");
			}
		}
	}

	private Train isAvail(char start, char end) {
		for (Train s : Main.totalTrain) {
			if (s.getStart()==start) {
				if (s.getEnd() == end) {
					return s;
				}
			}
		}
		return null;
	}

	public void Cancel(int cid2) {
		for (Ticket t : ractic) {
			if(cid2==t.getCid()) {
				Train t3 = t.getT() ;
				
				if (!waittic.isEmpty()) {
					ractic.add(waittic.get(0));
					waittic.remove(0);
					t3.setRacTicket(t3.getRacTicket()+1);//waiting list 0th index removed
					t3.setTrac(t3.getTrac()+1);
					t3.setRacTicket(t3.getRacTicket()-1);
					t3.setWaitTicket(t3.getWaitTicket() + 1);
					t3.setTwait(t3.getTwait()-1);
					//t3.setTotalTickets(t3.getTotalTickets()-1);//new line
					System.out.println("Waiting List to Rac Moved");
				}
				t3.setTrac(t3.getTrac()-1);
				t3.setRacTicket(t3.getRacTicket()+1);
				passtic.remove(cid2);
				ractic.remove(t);
				System.out.println("Rac cid -"+t.getCid()+"Removed");
				m.welcomeDisplay();
				return;
			}
		}
			for (Ticket t : waittic) {
				if (cid2==t.getCid()) {
					Train t3=t.getT();
					t3.setWaitTicket(t3.getWaitTicket()+1);
					t3.setTwait(t3.getTwait()-1);
					t3.setTotalTickets(t3.getTotalTickets()+1);//new line
					passtic.remove(cid2);
					waittic.remove(t);
					System.out.println("Waiting list cid -"+t.getCid()+"Removed");
					m.welcomeDisplay();
					return;
				}
				
				
			}
		for (Map.Entry<Integer, Ticket> map : passtic.entrySet()){
			if (cid2 == map.getKey()) {
				if(passtic.containsKey(cid2)) {
				Ticket m1 = passtic.get(cid2);
				String s = m1.getPreference();
				Train m2 = m1.getT();

				if (s.equalsIgnoreCase("upper")) {
					m2.setUpper(m2.getUpper() + 1);
					m2.setTupper(m2.getTupper() - 1);
				} else if (s.equalsIgnoreCase("middle")) {
					m2.setMidle(m2.getMidle() + 1);
					m2.setTmiddle(m2.getTmiddle() - 1);
				} else if (s.equalsIgnoreCase("lower")) {
					m2.setLower(m2.getLower() + 1);
					m2.setTlower(m2.getTlower() - 1);
				} else if (s.equalsIgnoreCase("sideupper")) {
					m2.setSideupper(m2.getSideupper() + 1);
					m2.setTsideupper(m2.getTsideupper() - 1);
				} else if (s.equalsIgnoreCase("sidelower")) {
					m2.setSideLower(m2.getSideLower() + 1);
					m2.setTsidelower(m2.getTsidelower() - 1);
				}
				m2.setTotalTickets(m2.getTotalTickets() - 1);
				passtic.remove(cid2);
				System.out.println("Ticket " + cid2 + " Removed");
				if (!ractic.isEmpty()) {
					Rac(m1, m2);
				}
			}
			}
			break;
		}
			m.welcomeDisplay();
	}
	



	private void Rac(Ticket m1, Train m2) {
		Ticket rac = ractic.get(0);//rac to conform ticket
		if (m2.getLower() > 0) {
			rac.setPreference("lower");
			m2.setLower(m2.getLower() - 1);
			System.out.println("Rac to Confirm Lower Berth Ticket Cid-");
		} else if (m2.getMidle() > 0) {
			rac.setPreference("middle");
			m2.setMidle((m2.getMidle() - 1));
			System.out.println("Rac to Confirm Middle Berth Ticket Cid-");
		} else if (m2.getUpper() > 0) {
			rac.setPreference("upper");
			m2.setUpper((m2.getUpper() - 1));
			System.out.println("Rac to Confirm Upper Berth Ticket Cid-");
		} else if (m2.getSideLower() > 0) {
			rac.setPreference("sidelower");
			m2.setSideLower(m2.getSideLower() - 1);
			System.out.println("Rac to Confirm Side Lower Berth Ticket Cid-");
		} else if (m2.getSideLower() > 0) {
			rac.setPreference("sideupper");
			m2.setSideupper(m2.getSideupper() - 1);
			System.out.println("Rac to Confirm Side Upper Berth Ticket Cid-");
		}

		int c = rac.getCid();
		passtic.put(c, rac);
		ractic.remove(0);
		System.out.println(c);
		if (!waittic.isEmpty()) {
			ractic.add(waittic.get(0));
			waittic.remove(0);
			m2.setWaitTicket(m2.getWaitTicket() + 1);
			m2.setTwait(m2.getTwait()-1);
			System.out.println("Waiting List to Rac Moved");
		}
		System.out.println(m2);
	}
public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		result = prime * result + ((passtic == null) ? 0 : passtic.hashCode());
		result = prime * result + ((ractic == null) ? 0 : ractic.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingClass other = (BookingClass) obj;
		if (cid != other.cid)
			return false;
		if (passtic != other.passtic) {
			if (other.passtic != null)
				return false;
		} else if (!passtic.equals(other.passtic))
			return false;
		if (ractic == null) {
			if (other.ractic != null)
				return false;
		} else if (!ractic.equals(other.ractic))
			return false;
		return true;
	}
	
	

	
}
