/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;

public class Class_8264
implements Comparable {
    private boolean Field_8265;
    private static final Set Field_8266;
    private final int Field_8267;
    private final String Field_8268;
    public static final List Field_8269;
    private final String Field_8270;
    private int Field_8271;
    public int Field_8272;
    private static final Class_29437 Field_8273;

    public int Method_8274() {
        return this.Field_8271;
    }

    public int Method_8275(Class_8264 class_8264) {
        int n = Class_9802.Method_9806(this.Field_8270, new Object[-29234 & 16]).compareTo(Class_9802.Method_9806(class_8264.Field_8270, new Object[17154 & 4097]));
        if (n == 0) {
            n = Class_9802.Method_9806(this.Field_8268, new Object[-11120 & 8800]).compareTo(Class_9802.Method_9806(class_8264.Field_8268, new Object[1106 & 4236]));
        }
        return n;
    }

    static {
        Field_8269 = Lists.newArrayList();
        Field_8273 = new Class_29437();
        Field_8266 = Sets.newHashSet();
    }

    private void Method_8276() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_8277() {
        this.Field_8272 = -32480 & 3088;
        this.Field_8265 = 0 & 7937;
    }

    public static Set Method_8278() {
        return Field_8266;
    }

    public Class_8264(String string, int n, String string2) {
        this.Field_8268 = string;
        this.Field_8271 = n;
        this.Field_8267 = n;
        this.Field_8270 = string2;
        Field_8269.add(this);
        Field_8273.Method_29453(n, this);
        if (string2 != null) {
            Field_8266.add(string2);
        }
    }

    public boolean Method_8279() {
        return this.Field_8265;
    }

    public static void Method_8280(int n, boolean bl) {
        Class_8264 class_8264;
        if (n != 0 && (class_8264 = (Class_8264)Field_8273.Method_29447(n)) != null) {
            class_8264.Field_8265 = bl;
        }
    }

    public static void Method_8281() {
        Field_8273.Method_29442();
        for (Class_8264 class_8264 : Field_8269) {
            Field_8273.Method_29453(class_8264.Field_8271, class_8264);
        }
    }

    public int Method_8282(Object object) {
        return this.Method_8275((Class_8264)object);
    }

    public static void Method_8283() {
        for (Class_8264 class_8264 : Field_8269) {
            class_8264.Method_8277();
        }
    }

    public void Method_8284(int n) {
        this.Field_8271 = n;
    }

    public String Method_8285() {
        return this.Field_8270;
    }

    public String Method_8286() {
        return this.Field_8268;
    }

    public static void Method_8287(int n) {
        Class_8264 class_8264;
        if (n != 0 && (class_8264 = (Class_8264)Field_8273.Method_29447(n)) != null) {
            class_8264.Field_8272 += 16899 & -23375;
        }
    }

    public boolean Method_8288() {
        if (this.Field_8272 == 0) {
            return (-32442 & 2065) != 0;
        }
        this.Field_8272 -= -32765 & 161;
        return (23041 & 8381) != 0;
    }

    public int Method_8289() {
        return this.Field_8267;
    }
}

