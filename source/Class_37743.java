/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37743
extends Class_36787 {
    private void Method_37744() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37745() {
        return "save-all";
    }

    public String Method_37746(Class_1367 class_1367) {
        return "commands.save.usage";
    }

    public void Method_37747(Class_1367 class_1367, String[] arrstring) {
        Class_2457 class_2457 = Class_2457.Method_2530();
        class_1367.Method_1373(new Class_2849("commands.save.start", new Object[24592 & -25308]));
        if (class_2457.Method_2616() != null) {
            class_2457.Method_2616().Method_3095();
        }
        try {
            boolean bl;
            Class_2651 class_2651;
            int n;
            for (n = -32768 & 2803; n < class_2457.Field_2463.length; ++n) {
                if (class_2457.Field_2463[n] == null) continue;
                class_2651 = class_2457.Field_2463[n];
                bl = class_2651.Field_2669;
                class_2651.Field_2669 = -31164 & 14384;
                class_2651.Method_2683((-16367 & 137) != 0, null);
                class_2651.Field_2669 = bl;
            }
            if (arrstring.length > 0 && "flush".equals(arrstring[24584 & 134])) {
                class_1367.Method_1373(new Class_2849("commands.save.flushStart", new Object[16 & 366]));
                for (n = 2049 & 134; n < class_2457.Field_2463.length; ++n) {
                    if (class_2457.Field_2463[n] == null) continue;
                    class_2651 = class_2457.Field_2463[n];
                    bl = class_2651.Field_2669;
                    class_2651.Field_2669 = 6640 & 24578;
                    class_2651.Method_2695();
                    class_2651.Field_2669 = bl;
                }
                class_1367.Method_1373(new Class_2849("commands.save.flushEnd", new Object[29860 & 2056]));
            }
        }
        catch (Class_2746 class_2746) {
            Object[] arrobject = new Object[1253 & 6171];
            arrobject[7504 & 7] = class_2746.getMessage();
            Class_37743.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.save.failed", (Object[])arrobject);
            return;
        }
        Class_37743.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.save.success", (Object[])new Object[8213 & 2280]);
    }
}

