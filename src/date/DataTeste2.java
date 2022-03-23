package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTeste2 {

    public static void main(String[] args) {

        Date data = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(data);
        System.out.println(dataFormatada);

        /*
        y Year
        M Month in year
        D Day in year
        d Day in month
        H Hour in day
        h Hour in am/pm
        m Minute in hour
        s Second in minute
        S Millesecond Number
         */
    }
}
