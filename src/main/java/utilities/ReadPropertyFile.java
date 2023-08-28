package utilities;

import com.google.common.collect.Maps;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import static constants.Paths.CONFIG_PATH;

public class ReadPropertyFile {


    public Map<String, String> getProperties(String propertyFileName) throws IOException {

        FileReader reader=new FileReader(CONFIG_PATH+"/"+propertyFileName+".properties");
        Properties p=new Properties();
        p.load(reader);
        return Maps.newHashMap(Maps.fromProperties(p));

    }
}
