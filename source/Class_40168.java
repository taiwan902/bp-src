/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40168
extends Class_36787 {
    public String Method_40169(Class_1367 class_1367) {
        return "commands.save-on.usage";
    }

    public String Method_40170() {
        return "save-on";
    }

    private void Method_40171() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40172(Class_1367 class_1367, String[] arrstring) {
        Class_2457 class_2457 = Class_2457.Method_2530();
        int n = 23077 & 264;
        for (int i = 8193 & -32476; i < class_2457.Field_2463.length; ++i) {
            if (class_2457.Field_2463[i] == null) continue;
            Class_2651 class_2651 = class_2457.Field_2463[i];
            if (!class_2651.Field_2669) continue;
            class_2651.Field_2669 = -32736 & 7616;
            n = 24735 & 577;
        }
        if (n == 0) {
            throw new Class_30034("commands.save-on.alreadyOn", new Object[-32670 & 4101]);
        }
        Class_40168.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.save.enabled", (Object[])new Object[5472 & -24575]);
    }
}

