/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_34325
extends Thread {
    private boolean Field_34326 = 515 & 6241;
    private static final Logger Field_34327;
    private final String Field_34328;
    private final String Field_34329;
    private final DatagramSocket Field_34330;
    private static final AtomicInteger Field_34331;

    private void Method_34332() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_34333(String string) {
        int n = string.indexOf("[/MOTD]");
        if (n < 0) {
            return null;
        }
        int n2 = string.indexOf("[/MOTD]", n + "[/MOTD]".length());
        if (n2 >= 0) {
            return null;
        }
        int n3 = string.indexOf("[AD]", n + "[/MOTD]".length());
        if (n3 < 0) {
            return null;
        }
        int n4 = string.indexOf("[/AD]", n3 + "[AD]".length());
        return n4 < n3 ? null : string.substring(n3 + "[AD]".length(), n4);
    }

    public void Method_34334() {
        String string = Class_34325.Method_34335(this.Field_34328, this.Field_34329);
        byte[] arrby = string.getBytes();
        while (!this.isInterrupted() && this.Field_34326) {
            try {
                InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
                DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length, inetAddress, -11427 & 13693);
                this.Field_34330.send(datagramPacket);
            }
            catch (IOException iOException) {
                Field_34327.warn("LanServerPinger: " + iOException.getMessage());
                break;
            }
            try {
                Class_34325.sleep(637916636L & 288886750L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    static {
        Field_34331 = new AtomicInteger(-24568 & 5920);
        Field_34327 = LogManager.getLogger();
    }

    public static String Method_34335(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    public Class_34325(String string, String string2) {
        super("LanServerPinger #" + Field_34331.incrementAndGet());
        this.Field_34328 = string;
        this.Field_34329 = string2;
        this.setDaemon((89 & -19161) != 0);
        this.Field_34330 = new DatagramSocket();
    }

    public static String Method_34336(String string) {
        int n = string.indexOf("[MOTD]");
        if (n < 0) {
            return "missing no";
        }
        int n2 = string.indexOf("[/MOTD]", n + "[MOTD]".length());
        return n2 < n ? "missing no" : string.substring(n + "[MOTD]".length(), n2);
    }

    public void Method_34337() {
        super.interrupt();
        this.Field_34326 = 1792 & 8256;
    }
}

