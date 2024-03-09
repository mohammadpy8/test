package template;

import java.io.*;
import java.util.*;

public class IOClass {
    public static void main(String[] args) throws IOException {
        FileReader inf = new FileReader("");
        int chCode;
        while (-1 != (chCode = inf.read()))
            System.out.println("Next:" + (char) chCode);
        inf.close();
    }
}

class Stream extends InputStream {
    public static void main(String[] args) throws IOException {
        List<Byte> list = new ArrayList<>();
        FileInputStream inf = null;
        try {
            inf = new FileInputStream("file");
            int bcode;
            while (-1 != (bcode = inf.read()))
                list.add((byte) bcode);
        } finally {
            if (inf != null) {
                inf.close();
            }
        }
    }
    @Override
    public int read() throws IOException {
        return 0;
    }
}