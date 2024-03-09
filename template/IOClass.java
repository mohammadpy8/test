package template;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
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

class SocketStream {
    public static void main(String[] args) throws Exception {
        try {
            Socket socket = new Socket("google.com", 80);
            OutputStream out = socket.getOutputStream();
            InputStream input = socket.getInputStream();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

    }
}

class User implements Serializable {
    private String username;
    private transient String password;
}

class Students implements Serializable {
    private String name;
    private double[] grades;
    private transient double average = 19.55;
}