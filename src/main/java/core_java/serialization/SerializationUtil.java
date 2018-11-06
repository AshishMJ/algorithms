package core_java.serialization;

import java.io.*;

/**
 * Created by ashishm on 21/5/18.
 */
public class SerializationUtil {

    public static final String filePath = System.getProperty("user.home") + File.separator;

    public static void serialize(Serializable obj, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath + fileName));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(new File(filePath + fileName));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        final Object o = objectInputStream.readObject();
        return o;
    }
}
