import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

public class Transfer_of_order {

    private String Older_owner_name;
    private String New_owner_name;
    private String Older_Owner_CNIC;
    private String New_Owner_CNIC;
    private String Vehicle_Number;

    public void Set_older_owner_name(String word) {

        Older_owner_name = word;
    }

    public void Set_new_owner_name(String word) {

        New_owner_name = word;
    }

    public void Set__new_CNIC_owner(String word) {

        New_Owner_CNIC = word;
    }

    public void Set_Older_CNIC_owner(String word) {
        Older_Owner_CNIC = word;
    }

    public void Set_vehcile_number(String word) {
        Vehicle_Number = word;
    }

    public String Get_older_owner_name() {

        return Older_owner_name;

    }

    public String Get_new_owner_name() {

        return New_owner_name;
    }

    public String Get__new_CNIC_owner() {

        return New_Owner_CNIC;
    }

    public String Get_Older_CNIC_owner() {
        return Older_Owner_CNIC;
    }

    public String Get_vehcile_number() {
        return Vehicle_Number;
    }


    public int check(Transfer_of_order ob) throws FileNotFoundException {
        ///check if its registered or not

        Scanner read = new Scanner(new FileInputStream("/home/iffishells/Desktop/CarRegistrationProject/Codes/Database.txt"));
        String words =  ob.Get_vehcile_number();                          //ob.Get_vehcile_number();
            
            while(read.hasNextLine())
            {
                String line = read.nextLine();
                System.out.println(line);
                
                    if(line.indexOf(words)!=-1) {
                        return 1;   //1 is True
                        
                    }
                
           }    
    
        return 0;  // o is false
        
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Oky");
        Transfer_of_order ob =  new Transfer_of_order();
        System.out.println("The value of return is    "+ ob.check(ob));
    }
    


}