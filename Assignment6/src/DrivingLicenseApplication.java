import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) {

            int age = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the date of birth in YYYY.MM.DD format:");
        try {
            Date date = new SimpleDateFormat("yyyy.MM.dd").parse(scanner.next("[0-9]{4}.[0-9]{2}.[0-9]{2}"));
            Date dateNow = new Date();
            age = (int) ChronoUnit.DAYS.between(date.toInstant(), dateNow.toInstant())/365;
            int difference = (int) ChronoUnit.DAYS.between(date.toInstant(), dateNow.toInstant());
            if(16*365 > difference){
                throw new Exception("age issue");
            }
        } catch (Exception e) {
            System.out.println("The age of the applicant is " + age + " which is too early to apply for a driving license");
            }
    }
}
