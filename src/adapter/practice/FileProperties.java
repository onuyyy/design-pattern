package adapter.practice;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {

    Properties prop = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        Reader reader = new FileReader(filename);

        prop.load(reader);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Writer writer = new FileWriter(filename);
        prop.store(writer, "file write!");
    }

    @Override
    public void setValue(String key, String value) {
        prop.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return prop.getProperty(key);
    }
}
