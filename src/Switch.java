import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter days of month");
		int days=sc.nextInt();
        String monthName = "";
        switch (days) {
            case 29:  monthName += "Feburary";
                     break;
            case 30:  monthName += "April";
            monthName += " June";
            monthName += " September";
            monthName += " November";
                     break;
            case 31:  monthName += "Janurary";
            monthName += " March"; 
            monthName += " May";
            monthName += " July";
            monthName += " August";
            monthName += " October";
            monthName += " December";
                     break;
            default: monthName = "No month has exactly "+days+" days in year of 2016";
                     break;
        }
        System.out.println(monthName);
        sc.close();

	}

}
