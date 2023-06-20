package dev.grafity.charstreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

public class SerializationDemo2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,1);
        Date ced = new Date(calendar.getTimeInMillis());
        ContractEmployee ce =
                new ContractEmployee(1,"Kumar",250000.0,ced,"APAR");

       try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Vamsi/temp/cemployees.ser"))){
            oos.writeObject(ce);
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


    }
}
