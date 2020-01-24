/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35162 {
    public static Class_2080 Method_35163(Class_2080 class_2080) {
        if (!Class_19426.Method_19494()) {
            return class_2080;
        }
        if (class_2080 == null) {
            return class_2080;
        }
        if (!Class_19426.Method_19542()) {
            return class_2080;
        }
        String string = class_2080.Method_2084();
        String string2 = "textures/";
        String string3 = "mcpatcher/";
        if (!string.startsWith(string2)) {
            return class_2080;
        }
        string = string.substring(string2.length());
        string = string3 + string;
        Class_2080 class_20802 = new Class_2080(class_2080.Method_2085(), string);
        return Class_19426.Method_19533(Class_19426.Method_19564(), class_20802) ? class_20802 : class_2080;
    }

    private void Method_35164() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

