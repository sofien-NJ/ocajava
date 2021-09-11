package chapter3.LesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainDateTime {

	public static void main(String[] args) {
		long x =1_333_444_222;
		//Long y = 1;
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		*/
		
		//LocalDate ld = LocalDate.of(2020, Month.JULY, 10);
		//System.out.println(ld);
		/*
		LocalDate ld = LocalDate.of(2020, 7, 10);
		System.out.println(ld);
		*/
		LocalTime lt = LocalTime.of(15,10,20);
		System.out.println(lt);
		
		
		
		LocalDate ld = LocalDate.of(2020, 7, 10);
		System.out.println(ld);
		//System.out.println(ld.plusMonths(2));
		//ld= ld.plusMonths(2);
		//System.out.println(ld);
		
		//Period p =Period.of(2, 3, 1);
		//ld = ld.plus(p);
		//System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		// Formatage
		
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//System.out.println(ld.format(fs));
		System.out.println(ldt.format(fs));
		
		/*DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(ld.format(fm));
		
		DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(ld.format(ff));
		System.out.println(ff.format(ld));*/
		
		String ch ="15.5";
		double moy = Double.parseDouble(ch);
		
		System.out.println(moy + 2);
		
		String dateAnniversaire = "2000 10 03";
		DateTimeFormatter  form = DateTimeFormatter.ofPattern("yyyy MM dd");
		LocalDate anniv = LocalDate.parse(dateAnniversaire,form);
		System.out.println(anniv.plusDays(4));
	}

}
