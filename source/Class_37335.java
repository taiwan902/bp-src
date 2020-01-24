/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import net.minecraft.util.Vec3;

public class Class_37335
extends Class_36787 {
    public int Method_37336() {
        return 9218 & -16238;
    }

    private void Method_37337() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_37338(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (-32751 & 9219) ? Class_37335.\u0000strictfp((String[])arrstring, (Collection)Class_15516.Method_15551()) : (arrstring.length > (-24223 & 17429) && arrstring.length <= (18182 & 165) ? Class_37335.\u0000strictfp((String[])arrstring, (int)(4185 & 8705), (Class_4751)class_4751) : null);
    }

    public String Method_37339(Class_1367 class_1367) {
        return "commands.summon.usage";
    }

    public String Method_37340() {
        return "summon";
    }

    public void Method_37341(Class_1367 class_1367, String[] arrstring) {
        Class_283 class_283;
        if (arrstring.length < (6081 & 10257)) {
            throw new Class_34974("commands.summon.usage", new Object[33 & -16252]);
        }
        String string = arrstring[256 & -15743];
        Class_4751 class_4751 = class_1367.Method_1372();
        Vec3 vec3 = class_1367.Method_1371();
        double d = vec3.\u0000= final;
        double d2 = vec3.\u0000strictfp;
        double d3 = vec3.\u0000, `;
        if (arrstring.length >= (4613 & -29628)) {
            d = Class_37335.\u0000strictfp((double)d, (String)arrstring[-32253 & 8345], (449 & 8709) != 0);
            d2 = Class_37335.\u0000strictfp((double)d2, (String)arrstring[4158 & 24835], (11907 & 64) != 0);
            d3 = Class_37335.\u0000strictfp((double)d3, (String)arrstring[12659 & 1027], (19081 & -31695) != 0);
            class_4751 = new Class_4751(d, d2, d3);
        }
        if (!(class_283 = class_1367.Method_1375()).Method_368(class_4751)) {
            throw new Class_30034("commands.summon.outOfWorld", new Object[1100 & 2304]);
        }
        if ("LightningBolt".equals(string)) {
            class_283.Method_359(new Class_27363(class_283, d, d2, d3));
            Class_37335.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.summon.success", (Object[])new Object[-31599 & 4110]);
        } else {
            Object object;
            Class_1699 class_1699 = new Class_1699();
            int n = 23044 & -32758;
            if (arrstring.length >= (19077 & -20441)) {
                object = Class_37335.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(1420 & 2677));
                try {
                    class_1699 = Class_10981.Method_10996(object.Method_1788());
                    n = -8187 & 6657;
                }
                catch (Class_34310 class_34310) {
                    Object[] arrobject = new Object[1841 & 8195];
                    arrobject[-24128 & 1024] = class_34310.getMessage();
                    throw new Class_30034("commands.summon.tagError", arrobject);
                }
            }
            class_1699.Method_1702("id", string);
            try {
                object = Class_15516.Method_15578(class_1699, class_283);
            }
            catch (RuntimeException runtimeException) {
                throw new Class_30034("commands.summon.failed", new Object[2081 & 5828]);
            }
            if (object == null) {
                throw new Class_30034("commands.summon.failed", new Object[8579 & 4180]);
            }
            ((Class_1061)object).Method_1239(d, d2, d3, ((Class_1061)object).Field_1079, ((Class_1061)object).Field_1093);
            if (n == 0 && object instanceof Class_34093) {
                ((Class_34093)object).Method_34169(class_283.Method_364(new Class_4751((Class_1061)object)), null);
            }
            class_283.Method_350((Class_1061)object);
            Object object2 = object;
            Class_1699 class_16992 = class_1699;
            while (object2 != null && class_16992.Method_1715("Riding", -31733 & 2154)) {
                Class_1061 class_1061 = Class_15516.Method_15578(class_16992.Method_1703("Riding"), class_283);
                if (class_1061 != null) {
                    class_1061.Method_1239(d, d2, d3, class_1061.Field_1079, class_1061.Field_1093);
                    class_283.Method_350(class_1061);
                    ((Class_1061)object2).Method_1163(class_1061);
                }
                object2 = class_1061;
                class_16992 = class_16992.Method_1703("Riding");
            }
            Class_37335.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.summon.success", (Object[])new Object[-20188 & 0]);
        }
    }
}

