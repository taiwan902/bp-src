/*
 * Decompiled with CFR 0.145.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Class_5940
extends InputStream {
    private Random Field_5941;
    private byte[] Field_5942 = new byte[-31694 & 28945];
    private InputStream Field_5943;
    private final HashSet Field_5944 = new HashSet();
    private Class_5958 Field_5945;
    private int Field_5946 = 22225 & -24526;
    static ArrayList Field_5947 = new ArrayList();

    public int Method_5948(byte[] arrby, int n, int n2) {
        if (arrby == null) {
            throw new NullPointerException();
        }
        if (n < 0 || n2 < 0 || n2 > arrby.length - n) {
            throw new IndexOutOfBoundsException();
        }
        if (this.Method_5954()) {
            return -1 & -1;
        }
        if (n2 < 0) {
            return 2306 & -32764;
        }
        int n3 = n2;
        while (this.Field_5946 < (20819 & 156) && n2 > 0) {
            int n4 = n++;
            int n5 = this.Field_5946;
            this.Field_5946 = n5 + (97 & 6153);
            arrby[n4] = this.Field_5942[n5];
            --n2;
        }
        while (n2 >= (21074 & 3097) && !this.Method_5954()) {
            System.arraycopy(this.Field_5942, -32507 & 64, arrby, n, 152 & 22839);
            n += 16;
            n2 -= 16;
            this.Field_5946 = -14306 & 5072;
        }
        if (n2 < (2740 & 1042) && n2 > 0 && !this.Method_5954()) {
            System.arraycopy(this.Field_5942, 16 & 22688, arrby, n, n2);
            this.Field_5946 = n2;
            n2 = -32366 & 4204;
        }
        return n3 - n2;
    }

    public int Method_5949() {
        if (this.Method_5954()) {
            return -1 & -1;
        }
        int n = this.Field_5946;
        this.Field_5946 = n + (11137 & 4101);
        return this.Field_5942[n] & (-32513 & 511);
    }

    private static String Method_5950(String string) {
        int n = 29611;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5940.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_5951(byte[] arrby, int n, int n2) {
        if (this.Field_5943 == null) {
            return -1 & -1;
        }
        int n3 = this.Field_5943.read(arrby, n, n2);
        while (n3 == (-1 & -1)) {
            this.Field_5943 = this.Method_5956();
            if (this.Field_5943 == null) {
                return -1 & -1;
            }
            n3 = this.Field_5943.read(arrby, n, n2);
        }
        return n3;
    }

    private static String Method_5952(String string) {
        int n = 28587;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5940.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_5953() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_5940.Method_5955("\u8251\u8251\u8260\u8250\u8274\u8275\u8264\u8275\u8270\u8271\u8240\u8271\u8275\u8275"));
    }

    public Class_5940(int n, Class_5958 class_5958) {
        this.Field_5941 = new Random(n);
        this.Field_5943 = this.Method_5956();
        this.Field_5945 = class_5958;
    }

    private boolean Method_5954() {
        int n;
        if (this.Field_5946 != (26710 & 528)) {
            return (2048 & 42) != 0;
        }
        for (int i = 11073 & -12288; i < (4247 & 3608); i += n) {
            n = this.Method_5951(this.Field_5942, i, (17048 & 273) - i);
            if (n >= 0) continue;
            return (10249 & 1143) != 0;
        }
        this.Field_5945.Method_5976(this.Field_5942, -28575 & 8320, this.Field_5942, 4100 & 1536);
        this.Field_5946 = 108 & 12306;
        return (2213 & 1026) != 0;
    }

    private static String Method_5955(String string) {
        int n = 25995;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5940.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private InputStream Method_5956() {
        String string = Field_5947.get(this.Field_5941.nextInt(Field_5947.size())) + "";
        while (this.Field_5944.contains(string)) {
            string = string + Field_5947.get(this.Field_5941.nextInt(Field_5947.size()));
        }
        this.Field_5944.add(string);
        string = string + Class_5940.Method_5957("\u2009\u2005\u2009\u2005\u2004\u2005");
        ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            return classLoader.getResourceAsStream(Class_5940.Method_5950("\u4e80\u4e89\u4e82\u4e93\u4e84\u4e8d\u4e86\u4e8f\u4e88\u4e81\u4e82\u4e8b\u4e84\u4e85\u4e8e\u4e87\u4e98\u4e89\u4e82\u4e93\u4e9c\u4e85\u4e96\u4e87\u4e88\u4e81\u4e92\u4e83\u4e84\u4e9d\u4e8e\u4e8f\u4e80\u4e91\u4e8a\u4e83\u4e84\u4e85\u4e86\u4e8f\u4e80\u4e91\u4e92\u4e83\u4e94\u4e9d\u4e96\u4e8f\u4e80\u4e91\u4e9a\u4e9b\u4e84\u4e95\u4e8e\u4e8f\u4e80\u4e81\u4e82\u4e8b\u4e84\u4e9d\u4e8e\u4e87\u4e98\u4e81\u4e8a\u4e83\u4e84\u4e85\u4e96\u4e8f\u4e80\u4e81\u4e82\u4e9b\u4e9c\u4e8d\u4e96\u4e87\u4e88\u4e81\u4e92\u4e93\u4e9c\u4e9d\u4e8e\u4e87\u4e88\u4e91\u4e8a\u4e83\u4e94\u4e95\u4e9e\u4e87\u4e80\u4e99\u4e9a\u4e93\u4e84\u4e8d\u4e8e\u4e87\u4e88\u4e81\u4e92\u4e83\u4e8c\u4e85\u4e86\u4e97\u4e80\u4e81\u4e82\u4e93\u4e94\u4e9d\u4e86\u4e8f\u4e80\u4e99\u4e82\u4e83\u4e9c\u4e95\u4e96\u4e8f\u4e80\u4e81\u4e82\u4e8b\u4e84\u4e8d\u4e86\u4e97\u4e80\u4e89\u4e82\u4e8b\u4e8c\u4e8d\u4e8e\u4e8f\u4e90\u4e91\u4e8a\u4e83\u4e84\u4e8d\u4e8e\u4e87\u4e98\u4e99\u4e9a\u4e8b\u4e8c\u4e85\u4e8e\u4e8f\u4e88\u4e81\u4e82\u4e83\u4e94\u4e9d\u4e86\u4e8f\u4e80\u4e91\u4e92\u4e83\u4e94\u4e85\u4e8e\u4e87\u4e88\u4e81\u4e9a\u4e83\u4e94\u4e8d\u4e96\u4e8f\u4e80\u4e89\u4e8a\u4e83\u4e84\u4e85\u4e8e\u4e87\u4e80\u4e91\u4e92\u4e9b\u4e84\u4e85\u4e86\u4e87\u4e80\u4e81\u4e8a\u4e8b\u4e84\u4e85\u4e96\u4e87\u4e88\u4e81\u4e92\u4e9b\u4e8c\u4e8d\u4e8e\u4e87\u4e90\u4e89\u4e82\u4e83\u4e84\u4e8d\u4e96\u4e8f\u4e80\u4e89\u4e92\u4e8b\u4e84\u4e85\u4e8e\u4e87\u4e80\u4e91\u4e92\u4e93\u4e84\u4e85\u4e8e\u4e8f\u4e88\u4e81\u4e82\u4e9b\u4e8c\u4e95\u4e86\u4e97\u4e88\u4e81\u4e8a\u4e8b\u4e8c\u4e95\u4e86\u4e87\u4e90\u4e91\u4e82\u4e83\u4e94\u4e85\u4e86\u4e87\u4e88\u4e81\u4e8a\u4e83\u4e8c\u4e9d\u4e86\u4e8f\u4e80\u4e89\u4e82\u4e93\u4e8c\u4e85\u4e9e\u4e87\u4e80\u4e89\u4e82\u4e8b\u4e94\u4e8d\u4e96\u4e97\u4e88\u4e81\u4e82\u4e83\u4e8c\u4e85\u4e96\u4e87\u4e90\u4e89\u4e8a\u4e8b\u4e84\u4e85\u4e96\u4e8f\u4e80\u4e91\u4e8a\u4e83\u4e8c\u4e85\u4e8e\u4e97\u4e80\u4e89\u4e8a\u4e8b\u4e84\u4e95\u4e96\u4e8f\u4e80\u4e91\u4e82\u4e83\u4e84\u4e8d\u4e86\u4e8f\u4e80\u4e91\u4e8a\u4e83\u4e8c\u4e85\u4e86\u4e97\u4e88\u4e89\u4e8a\u4e93\u4e9c\u4e85\u4e86\u4e9f\u4e80\u4e91\u4e92\u4e8b\u4e84\u4e8d\u4e8e\u4e97\u4e98\u4e89\u4e82\u4e93\u4e84\u4e8d\u4e96\u4e97\u4e90\u4e81\u4e8a\u4e83\u4e94\u4e95\u4e8e\u4e87\u4e80\u4e89\u4e92\u4e9b\u4e84\u4e85\u4e96\u4e87\u4e88\u4e89\u4e82\u4e83\u4e84\u4e95\u4e9e\u4e87\u4e80\u4e89\u4e82\u4e83\u4e94\u4e8d\u4e86\u4e87\u4e98\u4e81\u4e8a\u4e8b\u4e8c\u4e95\u4e9e\u4e8f\u4e88\u4e91\u4e8a\u4e83\u4e94\u4e8d\u4e86\u4e9f\u4e88\u4e89\u4e82\u4e8b\u4e84\u4e8d\u4e96\u4e87\u4e88\u4e89\u4e82\u4e93\u4e9c\u4e85\u4e9e\u4e87\u4e88\u4e81\u4e82\u4e8b\u4e84\u4e95\u4e8e\u4e87\u4e90\u4e89\u4e9a\u4e8b\u4e84\u4e8d\u4e96\u4e87\u4e80\u4e89\u4e82\u4e8b\u4e84\u4e8d\u4e86\u4e8f\u4e88\u4e89\u4e82\u4e83\u4e84\u4e9d\u4e8e\u4e87\u4e80\u4e89\u4e8a\u4e83\u4e84\u4e8d\u4e86\u4e9f\u4e80\u4e91\u4e8a\u4e93\u4e8c\u4e85\u4e86\u4e97\u4e88\u4e91\u4e92\u4e8b\u4e84\u4e8d\u4e8e\u4e87\u4e90\u4e81\u4e82\u4e93\u4e84\u4e85\u4e8e\u4e8f\u4e80\u4e81\u4e9a\u4e83\u4e8c\u4e85\u4e86\u4e97\u4e88\u4e81\u4e82\u4e9b\u4e84\u4e85\u4e86\u4e8f\u4e80\u4e89\u4e82\u4e93\u4e8c\u4e8d\u4e86\u4e97\u4e88\u4e81\u4e82\u4e93\u4e94\u4e8d\u4e8e\u4e87\u4e80\u4e89\u4e92\u4e8b\u4e84\u4e8d\u4e86\u4e8f\u4e80\u4e89\u4e82\u4e93\u4e8c\u4e95\u4e86\u4e8f\u4e98\u4e81\u4e8a\u4e83\u4e94\u4e95\u4e96\u4e87\u4e80\u4e91\u4e8a\u4e83\u4e8c\u4e8d\u4e8e\u4e97\u4e88\u4e81\u4e8a\u4e83\u4e94\u4e8d\u4e96\u4e8f\u4e80\u4e89\u4e82\u4e8b\u4e84\u4e9d\u4e86\u4e97\u4e80\u4e99\u4e82\u4e8b\u4e8c\u4e85\u4e8e\u4e87\u4e88\u4e81\u4e92\u4e8b\u4e84\u4e95\u4e9e\u4e8f\u4e80\u4e81\u4e8a\u4e83\u4e94\u4e95\u4e9e\u4e87\u4e88\u4e81\u4e92\u4e93\u4e8c\u4e85\u4e96\u4e9f\u4f80\u4e81\u4e92\u4e93\u4e8c\u4e85\u4e96\u4e8f\u4e90\u4e81\u4e82\u4e9b\u4e84\u4e85\u4e96\u4e97\u4e88\u4e81\u4e8a\u4e8b\u4e84\u4e85\u4f9e\u4e9f\u4e80\u4e89\u4e82\u4e83\u4e94\u4e8d\u4e86\u4e9f\u4e88\u4e81\u4e8a\u4e8b\u4e94\u4e85\u4e86\u4e87\u4e80\u4e89\u4e82\u4e93\u4e94\u4e85\u4e8e\u4e87\u4e88\u4e81\u4e92\u4e83\u4e94\u4e8d\u4e96\u4e97\u4e88\u4e81\u4e8a\u4e93\u4e9c\u4e85\u4e86\u4e97\u4e80\u4e81\u4e8a\u4e83\u4e8c\u4e85\u4e86\u4e8f\u4e88\u4e81\u4e9a\u4e9b\u4e9c\u4e8d\u4e9e\u4e87\u4e88\u4e89\u4e8a\u4e8b\u4e8c\u4e95\u4e9e\u4e8f\u4e80\u4e99\u4e82\u4e93\u4e84\u4e8d\u4e86\u4e97\u4e90\u4e99\u4e82\u4e8b\u4e8c\u4e95\u4e86\u4e8f\u4e88\u4e89\u4e82\u4e83\u4e84\u4e95\u4e96\u4e9f\u4e80\u4e81\u4e92\u4e93\u4e84\u4e95\u4e8e\u4e8f\u4e88\u4e89\u4e8a\u4e83\u4e84\u4e8d\u4e86\u4e97\u4e98\u4e81\u4e8a\u4e83\u4e94\u4e85\u4e86\u4e8f\u4e90\u4e89\u4e8a\u4e93\u4e84\u4e8d\u4e86\u4e97\u4e88\u4e99\u4e82\u4e8b\u4e84\u4e85\u4e8e\u4e87\u4e90\u4e99\u4e82\u4e8b\u4e84\u4e8d\u4e86\u4e8f\u4e80\u4e99\u4e8a\u4e83\u4e8c\u4e8d\u4e8e\u4e9f\u4e80\u4e89\u4e92\u4e9b\u4e84\u4e95\u4e8e\u4e8f\u4e88\u4e81\u4e8a\u4e83\u4e84\u4e85\u4e86\u4e8f\u4e80\u4e89\u4e8a\u4e93\u4e8c\u4e9d\u4e8e\u4e87\u4e88\u4e89\u4e82\u4e8b\u4e8c\u4e85\u4e8e\u4e87\u4e90\u4e89\u4e92\u4e83\u4e8c\u4e85\u4e86\u4e8f\u4e88\u4e89\u4e8a\u4e9b\u4e84\u4e8d\u4e86\u4e8f\u4e80\u4e91\u4e9a\u4e83\u4e8c\u4e85\u4e96\u4e8f\u4e88\u4e81\u4e8a\u4e83\u4e8c\u4e8d\u4e96\u4e87\u4e88\u4e99\u4e82\u4e8b\u4e84\u4e9d\u4e86\u4e8f\u4f98\u4e81\u4e8a\u4e83\u4e94\u4e8d\u4e9e\u4e8f\u4e80\u4e89\u4e92\u4e83\u4e8c\u4e95\u4e9e\u4e9f\u4e88\u4e81\u4e82\u4e83\u4e8c\u4e9d\u4e86\u4e8f\u4e80\u4e91\u4e92\u4e9b\u4e84\u4e8d\u4e8e\u4e87\u4e80\u4e81\u4e92\u4e8b\u4e94\u4e95\u4e86\u4e87\u4e90\u4e99\u4e82\u4e8b\u4e9c\u4e85\u4e8e\u4e87\u4f98\u4e99\u4e92\u4e83\u4e8c\u4e85\u4e86\u4e9f\u4e88\u4e81\u4e82\u4e83\u4e94\u4e95\u4e96\u4e9f\u4e90\u4e99\u4e8a\u4e8b\u4e94\u4e9d\u4e86\u4e97\u4e90\u4e89\u4e82\u4e93\u4e9c\u4e8d\u4e96\u4e87\u4e80\u4e91\u4e9a\u4e8b\u4e84\u4e85\u4e8e\u4e87\u4e88\u4e81\u4e92\u4e8b\u4e8c\u4e85\u4e86\u4e87\u4e80\u4e89\u4e82\u4e8b\u4e84\u4e85\u4e86\u4e9f\u4e88\u4e81\u4e82\u4e93\u4e84\u4e8d\u4e8e\u4e87\u4f80\u4e91\u4e8a\u4e8b\u4e8c\u4e85\u4e96\u4e97\u4e88\u4e89\u4e82\u4f83\u4e84\u4e85\u4e8e\u4e87\u4e80\u4e99\u4e8a\u4e83\u4e84\u4e8d\u4e86\u4e8f\u4e88\u4e89\u4e82\u4e83\u4e94\u4e85\u4e8e\u4e87\u4e80\u4e81\u4e92\u4e93\u4e9c\u4e9d\u4e96\u4e97\u4e88\u4e89\u4e82\u4e93\u4e94\u4e9d\u4e86\u4e97\u4e80\u4e91\u4e82\u4e8b\u4e84\u4e85\u4e8e\u4e87\u4e88\u4e81\u4e9a\u4e83\u4e94\u4e95\u4e96\u4e87\u4e80\u4e81\u4e82\u4e8b\u4e8c\u4e85\u4e86\u4e9f\u4e80\u4e99\u4e8a\u4e83\u4e8c\u4e8d\u4e8e\u4e87\u4e80\u4e89\u4e82\u4e83\u4e8c\u4e8d\u4e86\u4e8f\u4e80\u4e99\u4e92\u4e9b\u4e84\u4e85\u4e8e\u4e87\u4e80\u4e81\u4e8a\u4e83\u4e8c\u4e85\u4e86\u4e87\u4e90\u4e91\u4e92\u4e9b\u4e84\u4e85\u4e96\u4e8f\u4e80\u4e81\u4e9a\u4e83\u4e8c\u4e85") + string);
        }
        catch (Exception exception) {
            return new ByteArrayInputStream(Class_5940.Method_5952("\u0496\u04b3\u04b0\u04b7\u04b0\u04b7\u04b6\u04b7\u04bc\u04bf\u04b8\u04bb\u04be\u04bd\u04ba\u04bf\u04a4\u04a5\u04a4\u04b3\u04a2\u04a5\u04a4\u04b5\u04bc\u04b9\u04ae\u04ab\u04ac\u04b9\u04aa\u04a9\u0494\u0481\u0484\u0497\u0496\u0495").getBytes());
        }
    }

    static {
        char c = 8417 & -28571;
        while (c <= (24699 & -32390)) {
            Field_5947.add(Character.valueOf(c));
            c = (char)(c + (22533 & 1457));
        }
        c = -32703 & 2165;
        while (c <= (-32518 & 3674)) {
            Field_5947.add(Character.valueOf(c));
            c = (char)(c + (8197 & 4105));
        }
    }

    private static String Method_5957(String string) {
        int n = 20326;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5940.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

