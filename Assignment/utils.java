package Assignment;

import com.pega.uiframework.utils.Xls_Reader;

import java.util.ArrayList;

public class utils {

        static Xls_Reader reader;

        public static ArrayList<Object[]> getDataExcel(){

            ArrayList<Object[]> myData = new ArrayList<Object[]>();


            String path = System.getProperty("user.dir")+"/TestDataa/GunveerFile.xlsx";
            System.out.println(path);
            try{
                reader = new Xls_Reader(path);

            }catch(Exception e){
                e.printStackTrace();
            }

            for(int rowNum=1;rowNum<= reader.getRowCount("Sheet1");rowNum++){
                String username = reader.getCellData("Sheet1", "Username",rowNum);
                String password = reader.getCellData("Sheet1", "Password", rowNum);
                Object ob[] = {username,password};
                myData.add(ob);

            }
            return myData;

        }
    }



