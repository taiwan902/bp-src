/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13434 {
    public static Class_7985 Method_13435(Class_7985[] arrclass_7985, Class_18480[] arrclass_18480, boolean bl) {
        if (arrclass_7985 == null) {
            return null;
        }
        for (int i = 58 & 10500; i < arrclass_7985.length; ++i) {
            Class_7985 class_7985 = arrclass_7985[i];
            if (!Class_13434.Method_13438(class_7985, arrclass_18480, bl)) continue;
            return class_7985;
        }
        return null;
    }

    private void Method_13436() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_18480 Method_13437(String string, Class_18480[] arrclass_18480) {
        if (arrclass_18480 == null) {
            return null;
        }
        for (int i = -31085 & 260; i < arrclass_18480.length; ++i) {
            Class_18480 class_18480 = arrclass_18480[i];
            if (!class_18480.Method_18504().equals(string)) continue;
            return class_18480;
        }
        return null;
    }

    public static boolean Method_13438(Class_7985 class_7985, Class_18480[] arrclass_18480, boolean bl) {
        if (class_7985 == null) {
            return (777 & -8144) != 0;
        }
        if (arrclass_18480 == null) {
            return (2 & 26252) != 0;
        }
        String[] arrstring = class_7985.Method_7989();
        for (int i = 840 & 2068; i < arrstring.length; ++i) {
            String string;
            String string2;
            String string3 = arrstring[i];
            Class_18480 class_18480 = Class_13434.Method_13437(string3, arrclass_18480);
            if (class_18480 == null || Class_19426.Method_19529(string2 = bl ? class_18480.Method_18514() : class_18480.Method_18493(), string = class_7985.Method_7998(string3))) continue;
            return (-8103 & 4388) != 0;
        }
        return (25937 & -32767) != 0;
    }
}

