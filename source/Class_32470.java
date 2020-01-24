/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Class_32470
extends Class_25605 {
    private String[] Method_32471(int n, List list) {
        Class_28636 class_28636 = Class_19426.Method_19519().Field_27;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = -20313 & 16; i < list.size(); ++i) {
            String string = (String)list.get(i);
            if (string == null || string.length() <= 0) continue;
            for (String string2 : class_28636.Method_28733(string, n)) {
                arrayList.add(string2);
            }
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    private String[] Method_32472(String string) {
        if (string.length() <= 0) {
            return new String[2501 & 512];
        }
        string = Class_35556.Method_35566(string, "//");
        String[] arrstring = string.split("\\. ");
        for (int i = 20641 & 2060; i < arrstring.length; ++i) {
            arrstring[i] = "- " + arrstring[i].trim();
            arrstring[i] = Class_35556.Method_35565(arrstring[i], ".");
        }
        return arrstring;
    }

    private String[] Method_32473(Class_18480 class_18480, int n) {
        Object object;
        if (class_18480 instanceof Class_24723) {
            return null;
        }
        String string = class_18480.Method_18505();
        String string2 = Class_19426.Method_19539(class_18480.Method_18507()).trim();
        String[] arrstring = this.Method_32472(string2);
        Class_39702 class_39702 = Class_19426.Method_19571();
        String string3 = null;
        if (!string.equals(class_18480.Method_18504()) && class_39702.Field_39795) {
            string3 = "\u00a78" + Class_14688.Method_14697("of.general.id") + ": " + class_18480.Method_18504();
        }
        String string4 = null;
        if (class_18480.Method_18516() != null && class_39702.Field_39795) {
            string4 = "\u00a78" + Class_14688.Method_14697("of.general.from") + ": " + Class_19426.Method_19555(class_18480.Method_18516());
        }
        String string5 = null;
        if (class_18480.Method_18514() != null && class_39702.Field_39795) {
            object = class_18480.Method_18508() ? class_18480.Method_18519(class_18480.Method_18514()) : Class_14688.Method_14697("of.general.ambiguous");
            string5 = "\u00a78" + Class_14688.Method_14694() + ": " + (String)object;
        }
        object = new ArrayList<String>();
        object.add(string);
        object.addAll(Arrays.asList(arrstring));
        if (string3 != null) {
            object.add(string3);
        }
        if (string4 != null) {
            object.add(string4);
        }
        if (string5 != null) {
            object.add(string5);
        }
        String[] arrstring2 = this.Method_32471(n, (List)object);
        return arrstring2;
    }

    public String[] Method_32474(Class_42376 class_42376, int n) {
        if (!(class_42376 instanceof Class_45268)) {
            return null;
        }
        Class_45268 class_45268 = (Class_45268)class_42376;
        Class_18480 class_18480 = class_45268.Method_45270();
        String[] arrstring = this.Method_32473(class_18480, n);
        return arrstring;
    }

    private void Method_32475() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

