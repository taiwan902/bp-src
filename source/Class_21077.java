/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21077 {
    public static File Method_21078() {
        File file;
        String string = System.getProperty("user.home", ".");
        switch (Class_10037.Field_10038[Class_21077.Method_21080().ordinal()]) {
            case 1: 
            case 2: {
                file = new File(string, ".blazingpack/");
                break;
            }
            case 3: {
                String string2 = System.getenv("APPDATA");
                String string3 = string2 != null ? string2 : string;
                file = new File(string3, ".blazingpack/");
                break;
            }
            case 4: {
                file = new File(string, "Library/Application Support/blazingpack");
                break;
            }
            default: {
                file = new File(string, "blazingpack/");
            }
        }
        return file;
    }

    private void Method_21079() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_12035 Method_21080() {
        String string = System.getProperty("os.name").toLowerCase();
        if (string.contains("win")) {
            return Class_12035.Field_12038;
        }
        if (string.contains("mac")) {
            return Class_12035.Field_12041;
        }
        if (string.contains("linux")) {
            return Class_12035.Field_12040;
        }
        if (string.contains("unix")) {
            return Class_12035.Field_12040;
        }
        return Class_12035.Field_12036;
    }
}

