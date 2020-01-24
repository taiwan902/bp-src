/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;

public class Class_32037 {
    public static InetSocketAddress Method_32038(String string) {
        URI uRI;
        try {
            uRI = new URI("tcp://" + string);
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new IllegalArgumentException("Bad hostline", uRISyntaxException);
        }
        return new InetSocketAddress(uRI.getHost(), uRI.getPort() == (-1 & -1) ? -7171 & 30687 : uRI.getPort());
    }

    private void Method_32039() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_32040(String string) {
        try {
            String string2 = Class_32037.Method_32038(string).getHostString();
            if (string2 != null) {
                return string2;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return string;
    }
}

