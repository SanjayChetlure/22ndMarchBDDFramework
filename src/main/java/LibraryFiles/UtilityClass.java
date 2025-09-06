package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Use to create selenium related common reusable methods
//eg-getPFData(), getExcelData(), captureSS()
public class UtilityClass {

    //This method is use get data from Property file, need to pass String keyName as a input
//    @AuthorName- Sanjay
    public static String getPFData(String key) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\sanja\\IdeaProjects\\22ndMarBDDCucumberFramewor\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");

        Properties p=new Properties();
        p.load(file);

        String value = p.getProperty(key);
        return value;
    }
}
