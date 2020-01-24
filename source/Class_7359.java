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

public class Class_7359 {
    private static final Logger Field_7360 = LogManager.getLogger();
    private static Class_7359 Field_7361;

    private void Method_7362() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_7359 Method_7363() {
        return Field_7361;
    }

    public int Method_7364() {
        int n = Class_32876.Method_32933();
        if (n <= 0) {
            throw new Class_8254("Could not create shader program (returned program ID " + n + ")");
        }
        return n;
    }

    public void Method_7365(Class_17924 class_17924) {
        class_17924.Method_17949().Method_11268(class_17924);
        class_17924.Method_17947().Method_11268(class_17924);
        Class_32876.Method_32976(class_17924.Method_17948());
    }

    public void Method_7366(Class_17924 class_17924) {
        class_17924.Method_17949().Method_11265(class_17924);
        class_17924.Method_17947().Method_11265(class_17924);
        Class_32876.Method_32969(class_17924.Method_17948());
        int n = Class_32876.Method_32938(class_17924.Method_17948(), Class_32876.Field_32909);
        if (n == 0) {
            Field_7360.warn("Error encountered when linking program containing VS " + class_17924.Method_17947().Method_11267() + " and FS " + class_17924.Method_17949().Method_11267() + ". Log output:");
            Field_7360.warn(Class_32876.Method_32953(class_17924.Method_17948(), -2071952767 & 1080802386));
        }
    }

    public static void Method_7367() {
        Field_7361 = new Class_7359();
    }
}

