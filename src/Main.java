import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int anno = data.getYear();
        String mese = String.valueOf(data.getMonth());
        int giorno = data.getDayOfMonth();
        String  giornoDellaSettimana = String.valueOf(data.getDayOfWeek());

        System.out.println("year = " + anno);
        System.out.println("month = " + mese);
        System.out.println("dayOfMonth = " + giorno);
        System.out.println("dayOfWeek = " + giornoDellaSettimana);
    }
}