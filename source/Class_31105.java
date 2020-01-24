/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public class Class_31105
extends Thread {
    private final Class_19711 Field_31106;
    private final InetAddress Field_31107;
    private final MulticastSocket Field_31108;

    public Class_31105(Class_19711 class_19711) {
        super("LanServerDetector #" + Class_17219.Method_17222().incrementAndGet());
        this.Field_31106 = class_19711;
        this.setDaemon((-30331 & 9281) != 0);
        this.Field_31108 = new MulticastSocket(6493 & 20989);
        this.Field_31107 = InetAddress.getByName("224.0.2.60");
        this.Field_31108.setSoTimeout(5096 & 5001);
        this.Field_31108.joinGroup(this.Field_31107);
    }

    public void Method_31109() {
        byte[] arrby = new byte[-31158 & 17840];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length);
            try {
                this.Field_31108.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                Class_17219.Method_17224().error("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            Class_17219.Method_17224().debug(datagramPacket.getAddress() + ": " + string);
            this.Field_31106.Method_19718(string, datagramPacket.getAddress());
        }
        try {
            this.Field_31108.leaveGroup(this.Field_31107);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.Field_31108.close();
    }

    private void Method_31110() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

