import java.io.*;
import java.net.*;
class Client {
public static final int DEFAULT_PORT = 6061;
public static void usage(){
System.out.println("Usage…Client <hostname> [<port>]");
System.exit(0);
}
public static void main (String[] args){
int port = DEFAULT_PORT;
Socket s = null;
if ((args.length != 1) && (args.length != 2)) usage();
if (args.length == 1) port =DEFAULT_PORT;
else{
try { port = Integer.parseInt(args[1]);}
catch (NumberFormatException e) {usage();}
}
try {
s=new Socket(args[0], port);
DataInputStream sin = new DataInputStream(s.getInputStream());
PrintStream sout = new PrintStream(s.getOutputStream());
DataInputStream in = new DataInputStream(System.in);
System.out.println("connected to " + s.getInetAddress() +
":" + s.getPort());
String line;
while(true) {
System.out.println(">");
System.out.flush();
line = in.readLine();
if(line == null) break;
sout.println(line);
line=sin.readLine();
if (line == null) {
System.out.println("Connection closed by server.");
break;
}
System.out.println(line);
}
}
catch(IOException e) {System.err.println(e);}
finally { try {if (s != null) s.close();}
catch
(IOException e){}
}
}
}