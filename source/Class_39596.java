/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_39596
extends Class_36787 {
    private void Method_39597() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_39598(String[] arrstring, int n) {
        return (n == 0 ? 8455 & 513 : 832 & 17) != 0;
    }

    public void Method_39599(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (24923 & 1)) {
            throw new Class_34974("commands.testfor.usage", new Object[787 & 5124]);
        }
        Class_1061 class_1061 = Class_39596.\u0000strictfp((Class_1367)class_1367, (String)arrstring[8804 & 3080]);
        Class_1699 class_1699 = null;
        if (arrstring.length >= (5122 & 8518)) {
            try {
                class_1699 = Class_10981.Method_10996(Class_39596.\u0000strictfp((String[])arrstring, (int)(273 & 4677)));
            }
            catch (Class_34310 class_34310) {
                Object[] arrobject = new Object[-30507 & 17929];
                arrobject[-3548 & 1042] = class_34310.getMessage();
                throw new Class_30034("commands.testfor.tagError", arrobject);
            }
        }
        if (class_1699 != null) {
            Class_1699 class_16992 = new Class_1699();
            class_1061.Method_1263(class_16992);
            if (!Class_25852.Method_25854(class_1699, class_16992, (19529 & 12321) != 0)) {
                Object[] arrobject = new Object[4225 & 16481];
                arrobject[4114 & 2048] = class_1061.Method_1202();
                throw new Class_30034("commands.testfor.failure", arrobject);
            }
        }
        Object[] arrobject = new Object[12439 & -15103];
        arrobject[8452 & 4784] = class_1061.Method_1202();
        Class_39596.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.testfor.success", (Object[])arrobject);
    }

    public String Method_39600() {
        return "testfor";
    }

    public String Method_39601(Class_1367 class_1367) {
        return "commands.testfor.usage";
    }

    public int Method_39602() {
        return 4294 & -15613;
    }

    public List Method_39603(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (1169 & 10305) ? Class_39596.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : null;
    }
}

