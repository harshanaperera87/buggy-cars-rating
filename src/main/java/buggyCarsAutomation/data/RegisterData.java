package buggyCarsAutomation.data;

import static buggyCarsAutomation.util.ExcelUtil.*;
import static buggyCarsAutomation.util.ExcelUtil.getCellData;

public class RegisterData {

    public static String login;
    public static String firstName;
    public static String lastName;
    public static String password;
    public static String confirmPassword;

    static  {
        try {
            //Data Sheet Connection
            setExcelFile(TEST_DATA_FILE,"Register");
            //Get the data from the data sheet
            login = getCellData(1);
            firstName = getCellData(2);
            lastName = getCellData(3);
            password = getCellData(4);
            confirmPassword = getCellData(4);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
