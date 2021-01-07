package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Train;
import model.BookingClass;

public class Main {
	public static List<Train> totalTrain = new ArrayList<>();
	static Scanner in = new Scanner(System.in);
	static Main m = new Main();
	static BookingClass b = new BookingClass();
	public int cid = 0;
	static int c=0;
	public static void main(String[] args) {
		totalTrain.add(new Train('A', 'B', 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 1));
		totalTrain.add(new Train('B', 'C', 7, 8, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 2, 2, 4, 2));
		totalTrain.add(new Train('A', 'C', 7, 8, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 2, 2, 4, 2));
		totalTrain.add(new Train('C', 'B', 7, 8, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 2, 2, 4, 2));
		totalTrain.add(new Train('B', 'A', 7, 8, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 2, 2, 4, 2));
		totalTrain.add(new Train('C', 'A', 7, 8, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 2, 2, 4, 2));
		m.welcomeDisplay();
	}

	public void welcomeDisplay() {
		System.out.println("1.Booking\n2.Cancel\n3.Print Booked tickets" + "\n4.Print Available Tickets\n5.Exit");

		int in1 = in.nextInt();
		switch (in1) {

		case 1:
			m.Booking();
			break;
		case 2:
			m.Cancel();
			break;
		case 3:
			m.printBooked();
			break;
		case 4:
			m.printAvailable();
			break;
		case 5:
			System.out.println("Thank you");
			break;
		default:
			System.out.println("Wrong Input ...Please Try Again");
			break;
		}
	}

	public void Booking() {
		boolean p = true;
		while (p) {
			System.out.println("Enter name");
			String name = in.next();
			System.out.println("Enter Age");
			int age = in.nextInt();
			System.out.println("Enter Preference");
			String prefer = in.next();
			System.out.println("Enter Starting Point");
			char a = in.next().charAt(0);
			System.out.println("Enter End Point");
			char c = in.next().charAt(0);
			b.Book(name, age, a, c, prefer);
			System.out.println("Do You Want More Ticket to Book ->Enter(Y/N)");
			char chose = in.next().charAt(0);
			if (chose == 'Y' || chose == 'y') {
				Booking();
				p = false;
			} else if (chose == 'N' || chose == 'n') {
				p = false;

				welcomeDisplay();

			} else {
				System.out.println("Wrong Input..try again");
			}
		}

	}

	public void Cancel() {
		System.out.println("Enter Customer Id");
		int cid = in.nextInt();
		b.Cancel(cid);
	}

	public void printBooked() {

		System.out.println("Enter Starting Point");
		char a = in.next().charAt(0);
		System.out.println("Enter End Point");
		char b = in.next().charAt(0);
		for (Train t : totalTrain) {
			if (t.getStart() == a) {
				if (t.getEnd() == b) {
					if (t.getTlower() > 0) {
						System.out.println("Lower Booked-" + t.getTlower());
					}
					if (t.getTupper() > 0) {
						System.out.println("Upper Booked-" + t.getTupper());
					}
					if (t.getTmiddle() > 0) {
						System.out.println("Middle Booked-" + t.getTmiddle());
					}
					if (t.getTsidelower() > 0) {
						System.out.println("SideLower Booked-" + t.getTsidelower());
					}
					if (t.getTsideupper() > 0) {
						System.out.println("SideUpper Booked-" + t.getTsideupper());
					}
					if (t.getTrac() > 0) {
						System.out.println("Rac Booked-" + t.getTrac());
					}
					if (t.getTwait() > 0) {
						System.out.println("Waiting List Booked-" + t.getTwait());
					}

				}
			}
		}
		welcomeDisplay();

		/*
		 * System.out.println(b.passtic); System.out.println(b.ractic);
		 * System.out.println(b.waittic);
		 */
		welcomeDisplay();

	}

	public void printAvailable() {
		System.out.println("Enter Starting Point");
		char a = in.next().charAt(0);
		System.out.println("Enter End Point");
		char b = in.next().charAt(0);
		for (Train t : totalTrain) {
			if (t.getStart() == a) {
				if (t.getEnd() == b) {
					System.out.println(t);
				}
			}
		}

		welcomeDisplay();

	}

}
