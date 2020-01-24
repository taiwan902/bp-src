/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class_26062 {
    private static final Logger Field_26063 = LogManager.getLogger();

    public static void Method_26064(String string, Object ... arrobject) {
        String string2 = String.format(string, arrobject);
        Field_26063.warn("[Shaders] " + string2);
    }

    public static void Method_26065(String string, Object ... arrobject) {
        String string2 = String.format(string, arrobject);
        Field_26063.info("[Shaders] " + string2);
    }

    public static void Method_26066(String string) {
        Field_26063.warn("[Shaders] " + string);
    }

    public static void Method_26067(String string) {
        Field_26063.info("[Shaders] " + string);
    }

    private void Method_26068() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_26069(String string) {
        Field_26063.error("[Shaders] " + string);
    }
}

