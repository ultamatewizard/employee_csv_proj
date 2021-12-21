package employee_csv_proj.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static final Properties config;

    static {
        config = new Properties();
        try {
            config.load(new BufferedReader(new FileReader("src/main/resources/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String employeeCSVFileLocation(){
        return config.getProperty("employee_csv_file_location");
    }

    public static String dbConnectionUrl() {
        return config.getProperty("db_connection");
    }

    public static String dbUsername(){
        return config.getProperty("username");
    }

    public static String dbPassword(){
        return config.getProperty("password");
    }

    public static String dbName(){
        return config.getProperty("db_name");
    }

}
