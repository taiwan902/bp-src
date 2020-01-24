/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemLogger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import paulscode.sound.SoundSystemLogger;

public class Class_15002
extends SoundSystemLogger {
    final Class_11145 Field_15003;

    Class_15002(Class_11145 class_11145) {
        this.Field_15003 = class_11145;
    }

    private void Method_15004() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15005(String string, int n) {
        if (!string.isEmpty()) {
            Class_20521.Method_20547().warn(string);
        }
    }

    public void Method_15006(String string, int n) {
        if (!string.isEmpty()) {
            Class_20521.Method_20547().info(string);
        }
    }

    public void Method_15007(String string, String string2, int n) {
        if (!string2.isEmpty()) {
            Class_20521.Method_20547().error("Error in class '" + string + "'");
            Class_20521.Method_20547().error(string2);
        }
    }
}

