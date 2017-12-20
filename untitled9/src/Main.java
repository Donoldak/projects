import com.sun.deploy.util.SessionState;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(10000));
        serverSocketChannel.configureBlocking(false);

        List<Client> clients = new ArrayList<>();
        while (true){
            tryAccept
        }
    }


    class Client{

    }
}
