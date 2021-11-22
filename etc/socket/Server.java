import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        Socket socket = null;
        ServerSocket serverSocket = null;
        BufferedReader in = null;

        PrintWriter out = null;

        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.out.println("해당 포트가 열려있습니다.");
        }

        try {
            System.out.println("서버가 열렸습니다.");
            socket = serverSocket.accept(); // 서버 생성, Client 접속 대기

            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 입력스트림 생성

            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))); // 출력스트림 생성

            String str = null;
            str = in.readLine();

            System.out.println("클라이언트로부터 온 메세지 : " + str);

            out.write(str);
            out.flush(); // 버퍼링으로 인해 기록되지 않은 데이터를 출력 스트림에 모두 출력
            socket.close(); // 출력되지 ㅇ낳ㅇ느 스트림은 모두 출력하고 스트림을 닫는다.
        } catch (IOException e) {

        }
    }
}