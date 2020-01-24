/*
 * Decompiled with CFR 0.145.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Properties;

public class Class_18011 {
    private static Class_16761[][] Field_18012 = null;

    public static void Method_18013() {
        Field_18012 = null;
    }

    public static boolean Method_18014(Class_283 class_283) {
        if (Field_18012 == null) {
            return (24592 & 4169) != 0;
        }
        int n = class_283.Field_284.Method_18379();
        if (n >= 0 && n < Field_18012.length) {
            Class_16761[] arrclass_16761 = Field_18012[n];
            return (arrclass_16761 == null ? 24596 & 136 : (arrclass_16761.length > 0 ? -32639 & 12853 : -12222 & 10005)) != 0;
        }
        return (-31487 & 21122) != 0;
    }

    private void Method_18015() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Class_16761[][] Method_18016() {
        Class_16761[][] arrclass_16761;
        int n;
        Class_16761[][] arrclass_167612 = new Class_16761[267 & -2978][8216 & 2436];
        String string = "mcpatcher/sky/world";
        int n2 = -1 & -1;
        for (n = 8544 & 2055; n < arrclass_167612.length; ++n) {
            arrclass_16761 = string + n + "/sky";
            ArrayList<Class_16761> arrayList = new ArrayList<Class_16761>();
            for (int i = 16405 & 8257; i < (-31767 & 15336); ++i) {
                String string2 = (String)arrclass_16761 + i + ".properties";
                try {
                    Class_2080 class_2080 = new Class_2080(string2);
                    InputStream inputStream = Class_19426.Method_19493(class_2080);
                    if (inputStream == null) break;
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    inputStream.close();
                    Class_19426.Method_19526("CustomSky properties: " + string2);
                    String string3 = (String)arrclass_16761 + i + ".png";
                    Class_16761 class_16761 = new Class_16761(properties, string3);
                    if (!class_16761.Method_16784(string2)) continue;
                    Class_2080 class_20802 = new Class_2080(class_16761.Field_16767);
                    Class_2062 class_2062 = Class_21583.Method_21614(class_20802);
                    if (class_2062 == null) {
                        Class_19426.Method_19497("CustomSky: Texture not found: " + class_20802);
                        continue;
                    }
                    class_16761.Field_16776 = class_2062.Method_2063();
                    arrayList.add(class_16761);
                    inputStream.close();
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    break;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            if (arrayList.size() <= 0) continue;
            Class_16761[] arrclass_167613 = arrayList.toArray(new Class_16761[arrayList.size()]);
            arrclass_167612[n] = arrclass_167613;
            n2 = n;
        }
        if (n2 < 0) {
            return null;
        }
        n = n2 + (1045 & 24577);
        arrclass_16761 = new Class_16761[n][17425 & -21568];
        for (int i = 554 & -32752; i < arrclass_16761.length; ++i) {
            arrclass_16761[i] = arrclass_167612[i];
        }
        return arrclass_16761;
    }

    public static void Method_18017() {
        Class_18011.Method_18013();
        if (Class_19426.Method_19503()) {
            Field_18012 = Class_18011.Method_18016();
        }
    }

    public static void Method_18018(Class_283 class_283, Class_34695 class_34695, float f) {
        int n;
        Class_16761[] arrclass_16761;
        if (Field_18012 != null && (n = class_283.Field_284.Method_18379()) >= 0 && n < Field_18012.length && (arrclass_16761 = Field_18012[n]) != null) {
            long l = class_283.Method_511();
            int n2 = (int)(l % (34266562L & -5395783794959229504L));
            float f2 = class_283.Method_447(f);
            float f3 = class_283.Method_332(f);
            float f4 = class_283.Method_349(f);
            if (f3 > 0.0f) {
                f4 /= f3;
            }
            for (int i = 17433 & -32352; i < arrclass_16761.length; ++i) {
                Class_16761 class_16761 = arrclass_16761[i];
                if (!class_16761.Method_16796(class_283, n2)) continue;
                class_16761.Method_16785(class_283, n2, f2, f3, f4);
            }
            float f5 = 1.0f - f3;
            Class_7229.Method_7231(f5);
        }
    }
}

