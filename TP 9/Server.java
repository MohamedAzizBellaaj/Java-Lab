import java.io.*;
import java.net.*;
class Server extends Thread{
protected int port;
protected ServerSocket listen_socket;
public static final int DEFAULT_PORT = 6061;
// Termine le programme si une exception est levée.
public static void fail(Exception e, String msg) {
System.err.println(msg + ": " + e);
System.exit(1);
}
// Crée un objet ServerSocket pour surveiller… et
// active la tâche du serveur (Elle s'auto-active).
public Server(int port){
if (port == 0) port = DEFAULT_PORT;
this.port = port;
try { listen_socket = new ServerSocket(port);}
catch (IOException e)
{fail(e, "Exception creating server socket");}
System.out.println("Server : listening… " + port);
this.start();
}
public void run(){
try{
while (true) {
Socket client_socket = listen_socket.accept();
Connection c = new Connection(client_socket);
}
}catch (IOException e)
{ fail(e, "Exception while listening for… ");}
}
public static void main(String[] args) {
int port = 0;
if (args.length == 1){
try { port = Integer.parseInt(args[0]);}
catch (NumberFormatException e) {port = 0;}
}
new Server(port);
}
}
// fin de la classe Server
// La classe ci-dessous Connection est une tâche gérant toutes les
// communications avec un client
class Connection extends Thread{
protected Socket client;
protected DataInputStream in;
protected PrintStream out;
// Initialise le flot et s'auto-active
public Connection(Socket client_socket){
client = client_socket;
try { in = new
DataInputStream(client.getInputStream());
out = new
PrintStream(client.getOutputStream());
}
catch (IOException e){
try {client.close();} catch (IOException e2) {}
System.err.println("Exception while.…stream : " +
e);
return;
}
this.start();
}
// Fournit les services du serveur
// Lit une ligne, l'inverse et la renvoie au client
public void run(){
String line;
StringBuffer revline;
int len;
try {
for(;;) {
line = in.readLine(); // Lit une line
if (line == null) break;
// L'inverse
len = line.length();
revline = new StringBuffer(len);
for (int i = len - 1; i>= 0; i--)
revline.insert(len - 1 - i, line.charAt(i));
// Renvoie la ligne inversée
out.println(revline);
}
}catch (IOException e) {}
finally {
try {client.close(); }
catch (IOException e2) {}
}
}
}