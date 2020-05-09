package org.deluyi.io;

import java.io.InputStream;

public class Resources {


    public static InputStream getResourcesAsStream(String path) {
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(path);
        return resourceAsStream;
    }


}
