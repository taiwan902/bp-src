/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43561
extends Class_36787 {
    public void Method_43562(Class_1367 class_1367, String[] arrstring) {
        Class_2457 class_2457 = Class_2457.Method_2530();
        int n = 14592 & 225;
        for (int i = 26152 & -30447; i < class_2457.Field_2463.length; ++i) {
            if (class_2457.Field_2463[i] == null) continue;
            Class_2651 class_2651 = class_2457.Field_2463[i];
            if (class_2651.Field_2669) continue;
            class_2651.Field_2669 = 12455 & 257;
            n = 16899 & -30711;
        }
        if (n == 0) {
            throw new Class_30034("commands.save-off.alreadyOff", new Object[17872 & -26620]);
        }
        Class_43561.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.save.disabled", (Object[])new Object[16384 & 9670]);
    }

    private void Method_43563() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_43564(Class_1367 class_1367) {
        return "commands.save-off.usage";
    }

    public String Method_43565() {
        return "save-off";
    }
}

