/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_24723
extends Class_18480 {
    private Class_7985[] Field_24724 = null;
    private Class_18480[] Field_24725 = null;

    public Class_24723(Class_7985[] arrclass_7985, Class_18480[] arrclass_18480) {
        super("<profile>", "", Class_24723.Method_24730(arrclass_7985, arrclass_18480), Class_24723.Method_24734(arrclass_7985), Class_24723.Method_24731(arrclass_7985, arrclass_18480, (705 & -22497) != 0), null);
        this.Field_24724 = arrclass_7985;
        this.Field_24725 = arrclass_18480;
    }

    public void Method_24726() {
        super.Method_18489();
        if (this.\u0000
        ().equals("<custom>")) {
            super.Method_18489();
        }
        this.Method_24736();
    }

    public String Method_24727(String string) {
        return string.equals("<custom>") ? Class_14688.Method_14698("of.general.custom", "<custom>") : Class_12440.Method_12859("profile." + string, string);
    }

    private Class_7985 Method_24728(String string) {
        for (int i = 16512 & 570; i < this.Field_24724.length; ++i) {
            Class_7985 class_7985 = this.Field_24724[i];
            if (!class_7985.Method_7994().equals(string)) continue;
            return class_7985;
        }
        return null;
    }

    private void Method_24729() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_24730(Class_7985[] arrclass_7985, Class_18480[] arrclass_18480) {
        return Class_24723.Method_24731(arrclass_7985, arrclass_18480, (-19106 & 128) != 0);
    }

    private static String Method_24731(Class_7985[] arrclass_7985, Class_18480[] arrclass_18480, boolean bl) {
        Class_7985 class_7985 = Class_13434.Method_13435(arrclass_7985, arrclass_18480, bl);
        return class_7985 == null ? "<custom>" : class_7985.Method_7994();
    }

    public String Method_24732() {
        return Class_14688.Method_14697("of.shaders.profile");
    }

    private Class_18480 Method_24733(String string) {
        for (int i = 204 & 15649; i < this.Field_24725.length; ++i) {
            Class_18480 class_18480 = this.Field_24725[i];
            if (!class_18480.Method_18504().equals(string)) continue;
            return class_18480;
        }
        return null;
    }

    private static String[] Method_24734(Class_7985[] arrclass_7985) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = -32752 & 4101; i < arrclass_7985.length; ++i) {
            Class_7985 class_7985 = arrclass_7985[i];
            arrayList.add(class_7985.Method_7994());
        }
        arrayList.add("<custom>");
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    public String Method_24735(String string) {
        return string.equals("<custom>") ? "\u00a7c" : "\u00a7a";
    }

    private void Method_24736() {
        Class_7985 class_7985 = this.Method_24728(this.\u0000
        ());
        if (class_7985 != null) {
            String[] arrstring = class_7985.Method_7989();
            for (int i = 9248 & 2255; i < arrstring.length; ++i) {
                String string = arrstring[i];
                Class_18480 class_18480 = this.Method_24733(string);
                if (class_18480 == null) continue;
                String string2 = class_7985.Method_7998(string);
                class_18480.Method_18511(string2);
            }
        }
    }

    public void Method_24737() {
        Class_7985 class_7985 = this.Method_24728(this.\u0000
        ());
        if (class_7985 == null || !Class_13434.Method_13438(class_7985, this.Field_24725, (8192 & 2827) != 0)) {
            String string = Class_24723.Method_24730(this.Field_24724, this.Field_24725);
            this.\u0000
            (string);
        }
    }
}

