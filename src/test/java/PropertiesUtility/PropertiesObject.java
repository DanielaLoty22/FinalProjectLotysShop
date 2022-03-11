package PropertiesUtility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesObject {
    public Properties properties;
    public FileInputStream file;

    public PropertiesObject(String path) {
        loadPropertiesFile(path);
    }

    public void loadPropertiesFile(String path) {
        properties = new Properties();
        try {
            file = new FileInputStream("src/test/resources/" + path + ".properties");
            properties.load(file);
        } catch (Exception exception) {
            System.out.println("Skipping loading of properties for parth: [" + path + "].");
        }
    }

    public String getValueByKey(String key) {
        return properties.getProperty(key);
    }

    public HashMap<String, String> getAllKeyValues() {
        HashMap<String, String> keyValue = new HashMap<>();
        for (Object key : properties.keySet()) {
            keyValue.put(key.toString(), properties.getProperty(key.toString()));
        }
        return keyValue;
    }
}
