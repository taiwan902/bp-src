/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_39512
extends Class_36787 {
    public String Method_39513() {
        return "setworldspawn";
    }

    public int Method_39514() {
        return 563 & 12486;
    }

    public List Method_39515(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length > 0 && arrstring.length <= (26159 & -32509) ? Class_39512.\u0000strictfp((String[])arrstring, (int)(21040 & 3264), (Class_4751)class_4751) : null;
    }

    private void Method_39516() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_39517(Class_1367 class_1367) {
        return "commands.setworldspawn.usage";
    }

    public void Method_39518(Class_1367 class_1367, String[] arrstring) {
        Class_4751 class_4751;
        if (arrstring.length == 0) {
            class_4751 = Class_39512.\u0000strictfp((Class_1367)class_1367).\u0000strictfp();
        } else {
            if (arrstring.length != (22563 & 79) || class_1367.Method_1375() == null) {
                throw new Class_34974("commands.setworldspawn.usage", new Object[28822 & 2344]);
            }
            class_4751 = Class_39512.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(4099 & 25648), (839 & 16513) != 0);
        }
        class_1367.Method_1375().Method_517(class_4751);
        Class_2457.Method_2530().Method_2616().Method_3091(new Class_33398(class_4751));
        Object[] arrobject = new Object[-16341 & 12695];
        arrobject[-15502 & 13321] = class_4751.\u0000= final();
        arrobject[273 & 17601] = class_4751.\u0000, `();
        arrobject[138 & 12642] = class_4751.\u0000strictfp();
        Class_39512.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.setworldspawn.success", (Object[])arrobject);
    }
}

