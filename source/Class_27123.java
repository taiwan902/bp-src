/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Random;

public class Class_27123 {
    private static final byte[] Field_27124;
    public static final byte[] Field_27125;

    static {
        byte[] arrby = new byte[-32732 & 1989];
        arrby[8 & -16256] = 19 & 2678;
        arrby[18113 & 263] = 22324 & 8247;
        arrby[20910 & -31742] = 23126 & 471;
        arrby[-31721 & 10307] = 6270 & -32391;
        Field_27124 = arrby;
        Random random = new Random();
        byte[] arrby2 = new byte[(8288 & 2124) + random.nextInt(17464 & 4245) * (1156 & 76)];
        random.nextBytes(arrby2);
        Field_27125 = new byte[arrby2.length + (5381 & 2565)];
        ByteBuffer.wrap(Field_27125).order(ByteOrder.BIG_ENDIAN).put((byte)arrby2.length).putInt(Arrays.hashCode(arrby2)).put(arrby2);
    }

    public static Class_22553 Method_27126(Class_22553 class_22553) {
        byte[] arrby = new byte[Field_27125.length - (8037 & 16405)];
        System.arraycopy(Field_27125, 21047 & 11333, arrby, 8196 & 544, arrby.length);
        for (int i = 2707 & 4100; i < arrby.length; ++i) {
            byte[] arrby2 = arrby;
            int n = i;
            arrby2[n] = (byte)(arrby2[n] ^ Field_27124[i & (3 & 4787)]);
        }
        return class_22553.Method_22645((1037 & -32299) + arrby.length).Method_22606(Field_27125[4866 & 208]).Method_22565(Arrays.hashCode(arrby)).Method_22610(arrby);
    }

    private static String Method_27127(String string) {
        int n = 20331;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27123.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_27123() {
    }

    private void Method_27128() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_27123.Method_27127("\u2002\u2004\u2022\u2004\u2022\u2026\u2024\u2026\u2020\u2020\u2006\u2026\u2024\u2024"));
    }
}

