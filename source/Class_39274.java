/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.util.Vec3;

public class Class_39274
extends Class_36787 {
    public String Method_39275() {
        return "particle";
    }

    private void Method_39276() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_39277(Class_1367 class_1367, String[] arrstring) {
        Class_283 class_283;
        if (arrstring.length < (23710 & 8)) {
            throw new Class_34974("commands.particle.usage", new Object[8449 & -27514]);
        }
        int n = -29176 & 8321;
        Class_40274 class_40274 = null;
        Object object = Class_40274.Method_40367();
        int n2 = ((Class_40274[])object).length;
        for (int i = 3648 & 4104; i < n2; ++i) {
            Class_40274 class_402742 = object[i];
            if (class_402742.Method_40387()) {
                if (!arrstring[1024 & -19684].startsWith(class_402742.Method_40377())) continue;
                n = 16577 & -32711;
                class_40274 = class_402742;
                break;
            }
            if (!arrstring[-32528 & 9728].equals(class_402742.Method_40377())) continue;
            n = 8193 & 3201;
            class_40274 = class_402742;
            break;
        }
        if (n == 0) {
            Object[] arrobject = new Object[137 & 113];
            arrobject[26628 & 72] = arrstring[36 & 25603];
            throw new Class_30034("commands.particle.notFound", arrobject);
        }
        object = arrstring[16450 & -21372];
        Vec3 vec3 = class_1367.Method_1371();
        double d = (float)Class_39274.\u0000strictfp((double)vec3.\u0000= final, (String)arrstring[14977 & 1291], (-23391 & 16719) != 0);
        double d2 = (float)Class_39274.\u0000strictfp((double)vec3.\u0000strictfp, (String)arrstring[-30854 & 4098], (-4799 & 33) != 0);
        double d3 = (float)Class_39274.\u0000strictfp((double)vec3.\u0000, `, (String)arrstring[3371 & 16403], (1665 & 28683) != 0);
        double d4 = (float)Class_39274.\u0000strictfp((String)arrstring[8244 & 2310]);
        double d5 = (float)Class_39274.\u0000strictfp((String)arrstring[-29563 & 8709]);
        double d6 = (float)Class_39274.\u0000strictfp((String)arrstring[16454 & 2086]);
        double d7 = (float)Class_39274.\u0000strictfp((String)arrstring[-15321 & 223]);
        int n3 = 24625 & 2434;
        if (arrstring.length > (16520 & 8541)) {
            n3 = Class_39274.\u0000strictfp((String)arrstring[9 & -32694], (int)(19532 & 4498));
        }
        boolean bl = 2568 & -32635;
        if (arrstring.length > (-30517 & 8985) && "force".equals(arrstring[-32499 & 16937])) {
            bl = 1347 & 2577;
        }
        if ((class_283 = class_1367.Method_1375()) instanceof Class_2651) {
            Class_2651 class_2651 = (Class_2651)class_283;
            int[] arrn = new int[class_40274.Method_40329()];
            if (class_40274.Method_40387()) {
                String[] arrstring2 = arrstring[2277 & 21250].split("_", -15741 & 35);
                for (int i = 2307 & -24047; i < arrstring2.length; ++i) {
                    try {
                        arrn[i - (1665 & 30789)] = Integer.parseInt(arrstring2[i]);
                        continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        Object[] arrobject = new Object[-32401 & 22017];
                        arrobject[1024 & -12066] = arrstring[2569 & 342];
                        throw new Class_30034("commands.particle.notFound", arrobject);
                    }
                }
            }
            class_2651.Method_2689(class_40274, bl, d, d2, d3, n3, d4, d5, d6, d7, arrn);
            Object[] arrobject = new Object[4130 & 20106];
            arrobject[20484 & -30029] = object;
            arrobject[429 & 17475] = Math.max(n3, 18467 & 9745);
            Class_39274.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.particle.success", (Object[])arrobject);
        }
    }

    public int Method_39278() {
        return -28606 & 2059;
    }

    public String Method_39279(Class_1367 class_1367) {
        return "commands.particle.usage";
    }

    public List Method_39280(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (19969 & 15)) {
            list = Class_39274.\u0000strictfp((String[])arrstring, (String[])Class_40274.Method_40402());
        } else if (arrstring.length > (901 & 20499) && arrstring.length <= (-15356 & 8423)) {
            list = Class_39274.\u0000strictfp((String[])arrstring, (int)(-14047 & 1029), (Class_4751)class_4751);
        } else if (arrstring.length == (20490 & -22498)) {
            String[] arrstring2 = new String[-32570 & 10242];
            arrstring2[3101 & 64] = "normal";
            arrstring2[8269 & -15085] = "force";
            list = Class_39274.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }
}

