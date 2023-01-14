package Models;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author zhunIOS
 */
public class Client {

    public static void main(String[] args) {

        int PORT = 4160;

        try {
            DatagramSocket client = new DatagramSocket();
            InetAddress HOST = InetAddress.getByName("localhost");
            System.out.println("**********     Conexion establecida     **********\n\n");

            //  texto enviado al servidor e impreso desde all[i
            String texto = "Saludo server desde el cliente!";
            byte[] buffer = texto.getBytes();

            DatagramPacket pakete = new DatagramPacket(buffer, buffer.length, HOST, PORT);
            client.send(pakete);
            client.close();
            System.out.println("**********     Conexion finalizada     **********\n\n");

        } catch (Exception e) {
        }

    }

}
