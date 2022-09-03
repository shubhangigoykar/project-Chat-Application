import java.lang.*;
import java.net.*;
import java.io.*;


class Server
{
    public static void main(String arg[])throws Exception
    {
        System.out.println("Server application is running....");
        String s1,s2;
        ServerSocket ss=new ServerSocket(1100);
        Socket s=ss.accept();

        System.out.println("connection successufully");
        BufferedReader brK=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps=new PrintStream(s.getOutputStream());
        while((s1=br.readLine())!=null)
        {
            System.out.println("Client Says:"+s1);
            System.out.println("enter message for client:");
            s2=brK.readLine();
            ps.println(s2);
        }
        s.close();
        ss.close();
        br.close();
        brK.close();
        ps.close();
    }
}
/*
C:\Users\PC\Desktop\ChatApplication>java Server.java
Server application is running....
connection successufully




C:\Users\PC>cd Desktop\ChatApplication

C:\Users\PC\Desktop\ChatApplication>javac Client.java

C:\Users\PC\Desktop\ChatApplication>java Client.java
Client application is running....
hi
Server says:hello
enter message for server:
how are you
Server says:fine
enter message for server:
jevn kel ka?
Server says:hmm
enter message for server:
udyA KY KRTIY
Server says:class ppa
enter message for server:
gn

C:\Users\PC\Desktop\ChatApplication>
*/