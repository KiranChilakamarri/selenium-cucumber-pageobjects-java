package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelper {
	
	/**
	 * Method to fetch URL from input.properties file file.
	 * 
	 * @param none
	 * @return URL
	 * 
	 */
	public String getURL() {
		try {
			Properties properties = loadProperties();
			return properties.getProperty("url");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    private Properties loadProperties()
            throws FileNotFoundException, IOException {
        File file = new File("Properties\\input.properties");
        FileInputStream fileStream;
        fileStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileStream);
        return properties;
    }

	/**
	 * Method to fetch browser from input.properties file file.
	 * 
	 * @param none
	 * @return browser
	 * 
	 */
	public String getBrowser() {
		try {
			Properties properties = loadProperties();
			return properties.getProperty("browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
