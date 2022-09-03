import java.lang.*;
import java.net.*;
import java.io.*;

class Client
{
    public static void main(String arg[])throws Exception
    {
        System.out.println("Client application is running....");
        String s1,s2;


        Socket s=new Socket("localhost",1100);


        BufferedReader brK=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps=new PrintStream(s.getOutputStream());
        while(!(s1=brK.readLine()).equals("gn"))
        {
            ps.println(s1);
            s2=br.readLine();
            System.out.println("Server says:"+s2);
            System.out.println("enter message for server:");
        }
        s.close();
        
        br.close();
        brK.close();
        ps.close();

    }
}

/*
C:\Users\PC\Desktop\ChatApplication>java Client.java
Client application is running....

C:\Users\PC>cd Desktop\ChatApplication

C:\Users\PC\Desktop\ChatApplication>javac Server.java

C:\Users\PC\Desktop\ChatApplication>java Server.java
Server application is running....
connection successufully
Client Says:hi
enter message for client:
hello
Client Says:how are you
enter message for client:
fine
Client Says:jevn kel ka?
enter message for client:
hmm
Client Says:udyA KY KRTIY
enter message for client:
class ppa

C:\Users\PC\Desktop\ChatApplication>

*/
