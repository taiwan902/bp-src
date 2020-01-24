/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45553
extends Class_36787 {
    private void Method_45554() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_45555() {
        return "publish";
    }

    public String Method_45556(Class_1367 class_1367) {
        return "commands.publish.usage";
    }

    public void Method_45557(Class_1367 class_1367, String[] arrstring) {
        String string = Class_2457.Method_2530().Method_2548(Class_35650.Field_35653, (2097 & 4104) != 0);
        if (string != null) {
            Object[] arrobject = new Object[-17407 & 551];
            arrobject[8746 & 4228] = string;
            Class_45553.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.publish.started", (Object[])arrobject);
        } else {
            Class_45553.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.publish.failed", (Object[])new Object[-32726 & 4116]);
        }
    }
}

