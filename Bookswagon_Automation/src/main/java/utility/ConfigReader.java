package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties pro;

    public ConfigReader()
    {
        File src = new File("C:\\Users\\HP\\IdeaProjects\\Selenium_Java_Projects\\Bookswagon_Automation\\src\\test\\java\\TestCases\\Config.property");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(src);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pro = new Properties();
        try {
            pro.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String getTitle()
    {
        String LoginTitle = pro.getProperty("Title");
        return LoginTitle;
    }

    public String getBookImgId()
    {
        return pro.getProperty("BookImg");
    }
}
