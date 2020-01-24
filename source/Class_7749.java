/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;

public class Class_7749 {
    private static MessageDigest Field_7750;
    private static MessageDigest Field_7751;

    static {
        try {
            Field_7750 = MessageDigest.getInstance(Class_7749.Method_7752("\u1680\u1689\u1682\u168f\u1680"));
            Field_7751 = MessageDigest.getInstance(Class_7749.Method_7755("\u422c\u4225\u4244"));
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static String Method_7752(String string) {
        int n = 7884;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7749.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static synchronized String Method_7753(Path path) {
        Field_7751.reset();
        OpenOption[] arropenOption = new OpenOption[601 & 3329];
        arropenOption[3408 & 4096] = StandardOpenOption.READ;
        FileChannel fileChannel = FileChannel.open(path, arropenOption);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(24954 & -17408);
        while (fileChannel.read(byteBuffer) != (-1 & -1)) {
            byteBuffer.flip();
            Field_7751.update(byteBuffer);
            byteBuffer.clear();
        }
        return Class_32118.Method_32122(Field_7751.digest());
    }

    public static synchronized String Method_7754(Path path) {
        Field_7750.reset();
        OpenOption[] arropenOption = new OpenOption[21249 & 10475];
        arropenOption[-30552 & 8197] = StandardOpenOption.READ;
        FileChannel fileChannel = FileChannel.open(path, arropenOption);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(12640 & 8849);
        while (fileChannel.read(byteBuffer) != (-1 & -1)) {
            byteBuffer.flip();
            Field_7750.update(byteBuffer);
            byteBuffer.clear();
        }
        return Class_32118.Method_32122(Field_7750.digest());
    }

    private static String Method_7755(String string) {
        int n = 12709;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7749.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_7756() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

