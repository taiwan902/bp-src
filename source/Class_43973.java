/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_43973
extends Class_36787 {
    public List Method_43974(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return Class_43973.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554());
    }

    public String Method_43975() {
        return "me";
    }

    public int Method_43976() {
        return -26331 & 8200;
    }

    private void Method_43977() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43978(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new Class_34974("commands.me.usage", new Object[-32167 & 256]);
        }
        Class_1782 class_1782 = Class_43973.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(1088 & 16406), (!(class_1367 instanceof Class_626) ? 7309 & 8961 : 512 & 9344) != 0);
        Object[] arrobject = new Object[4102 & 2962];
        arrobject[-32184 & 2176] = class_1367.Method_1370();
        arrobject[8457 & 6707] = class_1782;
        Class_2457.Method_2530().Method_2616().Method_3157(new Class_2849("chat.type.emote", arrobject));
    }

    public String Method_43979(Class_1367 class_1367) {
        return "commands.me.usage";
    }
}

