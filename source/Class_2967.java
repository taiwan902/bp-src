/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;

public class Class_2967
implements Class_2035 {
    public static final Set Field_2968 = ImmutableSet.of((Object)Class_2967.Method_2976("\u4100\u4101\u4102\u4101\u4102\u4103\u4100\u4103\u4100"), (Object)Class_2967.Method_2972("\u08c0\u08d7\u08d0\u08d5\u08d2\u08c5"));
    private final Map Field_2969;

    public InputStream Method_2970(Class_2080 class_2080) {
        InputStream inputStream = this.Method_2977(class_2080);
        if (inputStream != null) {
            return inputStream;
        }
        InputStream inputStream2 = this.Method_2979(class_2080);
        if (inputStream2 != null) {
            return inputStream2;
        }
        throw new FileNotFoundException(class_2080.Method_2084());
    }

    public Set Method_2971() {
        return Field_2968;
    }

    private static String Method_2972(String string) {
        int n = 1767;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2967.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_2973(Class_2080 class_2080) {
        return (this.Method_2977(class_2080) != null || this.Field_2969.containsKey(class_2080.Method_2086()) ? 4631 & 73 : 14400 & 14) != 0;
    }

    private void Method_2974() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_2975() {
        return "Default";
    }

    private static String Method_2976(String string) {
        int n = 20926;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2967.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private InputStream Method_2977(Class_2080 class_2080) {
        return Class_2967.class.getResourceAsStream("/assets/" + class_2080.Method_2085() + "/" + class_2080.Method_2084());
    }

    public BufferedImage Method_2978() {
        return Class_18695.Method_18726(Class_2967.class.getResourceAsStream("/" + new Class_2080("pack.png").Method_2084()));
    }

    public InputStream Method_2979(Class_2080 class_2080) {
        File file = (File)this.Field_2969.get(class_2080.Method_2086());
        return file != null && file.isFile() ? new FileInputStream(file) : null;
    }

    public Class_25993 Method_2980(Class_2793 class_2793, String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream((File)this.Field_2969.get("pack.mcmeta"));
            return Class_23171.Method_23181(class_2793, fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    public Class_2967(Map map) {
        this.Field_2969 = map;
    }
}

