/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43103
extends Class_36787 {
    public int Method_43104() {
        return 9217 & 2168;
    }

    public String Method_43105(Class_1367 class_1367) {
        return "commands.players.usage";
    }

    private void Method_43106() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_43107() {
        return "list";
    }

    public void Method_43108(Class_1367 class_1367, String[] arrstring) {
        int n = Class_2457.Method_2530().Method_2608();
        Object[] arrobject = new Object[2050 & 322];
        arrobject[1377 & 12438] = n;
        arrobject[1029 & -30655] = Class_2457.Method_2530().Method_2539();
        class_1367.Method_1373(new Class_2849("commands.players.list", arrobject));
        class_1367.Method_1373(new Class_2840(Class_2457.Method_2530().Method_2616().Method_3156((arrstring.length > 0 && "uuids".equalsIgnoreCase(arrstring[-19016 & 4]) ? 657 & 21547 : 16656 & 10432) != 0)));
        class_1367.Method_1374(Class_26261.Field_26263, n);
    }
}

