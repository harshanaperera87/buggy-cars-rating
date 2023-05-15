package buggyCarsAutomation.data;

import static buggyCarsAutomation.util.ExcelUtil.getCellData;
import static buggyCarsAutomation.util.ExcelUtil.setExcelFile;
import static buggyCarsAutomation.util.ExcelUtil.TEST_DATA_FILE;

public class LoginData {
    public static String userName;
    public static String password;

    static  {
        try {
            //Data Sheet Connection
            setExcelFile(TEST_DATA_FILE,"Login");
            //Get the data from the data sheet
            userName = getCellData(1);
            password = getCellData(2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
