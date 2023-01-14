package Models;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author zhunIOS
 */
public class Server {

    public static void main(String[] args) {
        int PORT = 4160;
        byte[] buffer = new byte[50];

        try {
            //  Generamos un datagrama para el servidor
            DatagramSocket server = new DatagramSocket(PORT);

            //  Generamos un buffer de bytes para almacenar los datos
            //  Generamos un datagrama para almacenar recibir los datos del cliente
            DatagramPacket pakete = new DatagramPacket(buffer, buffer.length);
            server.receive(pakete);
            System.out.println(new String(pakete.getData()));
            server.close();
        } catch (Exception e) {
        }
    }

}
