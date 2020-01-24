/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_37278
extends Class_36787 {
    public List Method_37279(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length >= (8199 & 297) ? Class_37278.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : null;
    }

    public String Method_37280(Class_1367 class_1367) {
        return "commands.say.usage";
    }

    private void Method_37281() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37282() {
        return "say";
    }

    public int Method_37283() {
        return -32751 & 7151;
    }

    public void Method_37284(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length <= 0 || arrstring[656 & -27542].length() <= 0) {
            throw new Class_34974("commands.say.usage", new Object[29218 & 1088]);
        }
        Class_1782 class_1782 = Class_37278.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(365 & 656), (12613 & 19489) != 0);
        Object[] arrobject = new Object[-32622 & 4386];
        arrobject[11652 & -32767] = class_1367.Method_1370();
        arrobject[-27487 & 25105] = class_1782;
        Class_2457.Method_2530().Method_2616().Method_3157(new Class_2849("chat.type.announcement", arrobject));
    }
}

