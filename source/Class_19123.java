/*
 * Decompiled with CFR 0.145.
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class Class_19123 {
    private final byte[] Field_19124;
    private String Field_19125;
    public final File Field_19126;

    private void Method_19127() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_19123.Method_19132("\u8210\u821d\u8201\u821c\u8211\u821d\u8205\u8215\u8219\u8211\u8205\u8215\u8214\u821d"));
    }

    private static String Method_19128(String string) {
        int n = 16017;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19123.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19129(String string) {
        int n = 12177;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19123.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_19130(OutputStream outputStream, Class_31554 class_31554) {
        Class_36353 class_36353 = new Class_36353();
        InputStream inputStream = this.Method_19131(class_31554);
        byte[] arrby = new byte[17221 & -32763];
        arrby[1288 & 6193] = 605 & -28417;
        arrby[16385 & 3373] = 13327 & 18816;
        arrby[19490 & 834] = -28601 & 25104;
        arrby[6199 & 16387] = 8305 & 5326;
        arrby[5668 & 18574] = 256 & 6801;
        if (!class_36353.Method_36372(arrby)) {
            throw new IOException(Class_19123.Method_19129("\u10a0\u1083\u1080\u1081\u1092\u1093\u1082\u1081\u1090\u10c1\u1090\u1093\u1092\u1081\u1082\u1083\u10d0\u1081\u1080\u1091\u1080\u1091\u1080\u1083\u1090\u1091\u1080"));
        }
        class_36353.Method_36374(inputStream, new Class_27756(outputStream), -1L & -1L);
        try {
            outputStream.close();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private InputStream Method_19131(Class_31554 class_31554) {
        SeekableByteChannel seekableByteChannel = Files.newByteChannel(this.Field_19126.toPath(), new OpenOption[1882 & 16389]);
        return new Class_17505(seekableByteChannel, this.Field_19124, class_31554);
    }

    private static String Method_19132(String string) {
        int n = 28166;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19123.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public byte[] Method_19133() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.Method_19130(byteArrayOutputStream, null);
        return byteArrayOutputStream.toByteArray();
    }

    public String Method_19134() {
        if (this.Field_19125 != null) {
            return this.Field_19125;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Class_36353 class_36353 = new Class_36353();
        InputStream inputStream = this.Method_19131(null);
        byte[] arrby = new byte[-9947 & 8397];
        arrby[2176 & 4149] = -24227 & 127;
        arrby[5377 & -7987] = -19440 & 2308;
        arrby[1126 & 17170] = 5760 & 16392;
        arrby[13899 & -30461] = -24476 & 2642;
        arrby[8196 & 17414] = 34 & -7675;
        if (!class_36353.Method_36372(arrby)) {
            throw new IOException(Class_19123.Method_19128("\t-!,01% 4a150$!,p! < 4 %94!"));
        }
        class_36353.Method_36374(inputStream, byteArrayOutputStream, 739558209L & 40437040L);
        byte[] arrby2 = byteArrayOutputStream.toByteArray();
        this.Field_19125 = new String(arrby2, -24543 & 139, arrby2[5152 & 19408] & (255 & 17919));
        return this.Field_19125;
    }

    public Class_19123(File file, byte[] arrby) {
        this.Field_19126 = file;
        this.Field_19124 = arrby;
    }
}

