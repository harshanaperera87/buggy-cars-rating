package buggyCarsAutomation.data;

import static buggyCarsAutomation.util.ExcelUtil.*;
import static buggyCarsAutomation.util.ExcelUtil.getCellData;

public class ProfileData {
    public static String gender;
    public static String age;
    public static String address;
    public static String phone;
    public static String newPassword;
    public static String confirmPassword;

    static  {
        try {
            //Data Sheet Connection
            setExcelFile(TEST_DATA_FILE,"Profile");
            //Get the data from the data sheet
            gender = getCellData(1);
            age = getCellData(2);
            address = getCellData(3);
            phone = getCellData(4);
            newPassword = getCellData(5);
            confirmPassword = getCellData(6);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
