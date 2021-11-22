import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;
        BufferedReader in2 = null;
        PrintWriter out = null;
        InetAddress ia = null;

        try {
            ia = InetAddress.getLocalHost(); // 서버로 접속하기 위한 서버 주소 입력(현재는 localhost)

            socket = new Socket(ia, 4444);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            in2 = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

            System.out.println(socket.toString());
        } catch (IOException e) {

        }

        try {
            System.out.println("서버로 보낼 메세지 : ");
            String data = in2.readLine(); // 키보드 입력
            out.println(data);
            out.flush();

            String str2 = in.readLine(); // 서버로부터 되돌아오는 데이터를 읽음
            System.out.println("서버로부터 되돌아온 메세지 : " + str2);
            socket.close();
        } catch (IOException e) {

        }
    }
}