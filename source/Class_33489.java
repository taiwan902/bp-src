/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Class_33489 {
    private static Class_26412[][] Field_33490 = null;
    private static boolean Field_33491;

    public static void Method_33492() {
        Field_33490 = null;
    }

    public static void Method_33493() {
        if (Field_33491) {
            Field_33491 = 10416 & -31487;
            Class_33489.Method_33496(Class_12440.Field_12651);
        }
    }

    public static int Method_33494(int n, int n2) {
        if (Field_33490 == null) {
            return n;
        }
        if (n >= 0 && n < Field_33490.length) {
            Class_26412[] arrclass_26412 = Field_33490[n];
            if (arrclass_26412 == null) {
                return n;
            }
            for (int i = 12680 & -32160; i < arrclass_26412.length; ++i) {
                Class_26412 class_26412 = arrclass_26412[i];
                if (!class_26412.Method_26417(n, n2)) continue;
                return class_26412.Method_26419();
            }
            return n;
        }
        return n;
    }

    private static void Method_33495(InputStream inputStream, String string, List list) {
        if (inputStream != null) {
            try {
                Class_34319 class_34319 = new Class_34319();
                class_34319.load(inputStream);
                inputStream.close();
                Class_19426.Method_19526("[Shaders] Parsing block mappings: " + string);
                Class_25611 class_25611 = new Class_25611("Shaders");
                Set<Object> set = class_34319.keySet();
                for (String string2 : set) {
                    String string3 = class_34319.getProperty(string2);
                    String string4 = "block.";
                    if (!string2.startsWith(string4)) {
                        Class_19426.Method_19610("[Shaders] Invalid block ID: " + string2);
                        continue;
                    }
                    String string5 = Class_35556.Method_35566(string2, string4);
                    int n = Class_19426.Method_19502(string5, -1 & -1);
                    if (n < 0) {
                        Class_19426.Method_19610("[Shaders] Invalid block ID: " + string2);
                        continue;
                    }
                    Class_30305[] arrclass_30305 = class_25611.Method_25618(string3);
                    if (arrclass_30305 != null && arrclass_30305.length >= (20101 & 369)) {
                        Class_26412 class_26412 = new Class_26412(n, arrclass_30305);
                        Class_33489.Method_33498(list, class_26412);
                        continue;
                    }
                    Class_19426.Method_19610("[Shaders] Invalid block ID mapping: " + string2 + "=" + string3);
                }
            }
            catch (IOException iOException) {
                Class_19426.Method_19610("[Shaders] Error reading: " + string);
            }
        }
    }

    public static void Method_33496(Class_19214 class_19214) {
        Class_33489.Method_33492();
        if (class_19214 != null) {
            ArrayList arrayList = new ArrayList();
            String string = "/shaders/block.properties";
            InputStream inputStream = class_19214.Method_19218(string);
            if (inputStream != null) {
                Class_33489.Method_33495(inputStream, string, arrayList);
            }
            Class_33489.Method_33497(arrayList);
            if (arrayList.size() > 0) {
                Field_33490 = Class_33489.Method_33499(arrayList);
            }
        }
    }

    private static void Method_33497(List list) {
    }

    private static void Method_33498(List list, Class_26412 class_26412) {
        int[] arrn = class_26412.Method_26415();
        for (int i = 16384 & 3857; i < arrn.length; ++i) {
            int n = arrn[i];
            while (n >= list.size()) {
                list.add(null);
            }
            ArrayList<Class_26412> arrayList = (ArrayList<Class_26412>)list.get(n);
            if (arrayList == null) {
                arrayList = new ArrayList<Class_26412>();
                list.set(n, arrayList);
            }
            Class_26412 class_264122 = new Class_26412(class_26412.Method_26419(), class_26412.Method_26420(n));
            arrayList.add(class_264122);
        }
    }

    private static Class_26412[][] Method_33499(List list) {
        Class_26412[][] arrclass_26412 = new Class_26412[list.size()][];
        for (int i = 528 & -24570; i < arrclass_26412.length; ++i) {
            List list2 = (List)list.get(i);
            if (list2 == null) continue;
            arrclass_26412[i] = list2.toArray(new Class_26412[list2.size()]);
        }
        return arrclass_26412;
    }

    private void Method_33500() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

