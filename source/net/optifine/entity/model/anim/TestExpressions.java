/*
 * Decompiled with CFR 0.145.
 */
package net.optifine.entity.model.anim;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TestExpressions {
    private void \u0000boolean 9 \u000a 0 do 6 ^ instanceof double package & 5 ~ long short % transient interface null & boolean new ! switch ^ const catch super & { void int default | null # ~ short 8 false const case public strictfp 2 * void case finally \u000a 2 \u000a this # ? ^ if true class() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void main(String[] arrstring) {
        Class_20660 class_20660 = new Class_20660(null);
        do {
            try {
                do {
                    BufferedReader bufferedReader;
                    String string;
                    Class_13745 class_13745;
                    InputStreamReader inputStreamReader;
                    if ((string = (bufferedReader = new BufferedReader(inputStreamReader = new InputStreamReader(System.in))).readLine()).length() <= 0) {
                        return;
                    }
                    Class_13745 class_137452 = class_20660.Method_20669(string);
                    if (class_137452 instanceof Class_36667) {
                        class_13745 = (Class_36667)class_137452;
                        float f = class_13745.Method_36668();
                        System.out.println("" + f);
                    }
                    if (!(class_137452 instanceof Class_22092)) continue;
                    class_13745 = (Class_22092)class_137452;
                    boolean bl = class_13745.Method_22093();
                    System.out.println("" + bl);
                } while (true);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                continue;
            }
            break;
        } while (true);
    }
}

