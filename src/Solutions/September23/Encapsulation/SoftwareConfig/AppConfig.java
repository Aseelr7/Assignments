package Solutions.September23.Encapsulation.SoftwareConfig;

public class AppConfig {

    private String serverIP;
    private int port;
    private String databaseName;

    public AppConfig(String serverIP, int port, String databaseName){
        setServerIP(serverIP);
        setPort(port);
        setDatabaseName(databaseName);
    }

    public void setServerIP(String serverIp){
        this.serverIP = serverIp;
    }
    public String getServerIP(){
        return this.serverIP;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        if (port < 0 || port >= 65535){
            System.out.println("Invalid Range for port");
        }else {this.port = port;}
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}

class AppRunner{
    public static void main(String[] args) {

        AppConfig app1 = new AppConfig("192.168.1.1", 2233332, "Apple");
        app1.setPort(1200003);

        System.out.println(app1.getDatabaseName());
        System.out.println(app1.getServerIP());
        System.out.println(app1.getPort());
    }
}
