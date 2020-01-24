/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;

public class Class_41212
extends Class_36787 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Method_41213(Class_1367 class_1367, String[] arrstring) {
        int n;
        if (arrstring.length < (-16126 & 4322)) {
            throw new Class_34974("commands.effect.usage", new Object[8258 & -29424]);
        }
        Class_859 class_859 = (Class_859)Class_41212.\u0000strictfp((Class_1367)class_1367, (String)arrstring[27904 & -32255], Class_859.class);
        if (arrstring[-11537 & 257].equals("clear")) {
            if (class_859.Method_948().isEmpty()) {
                Object[] arrobject = new Object[6311 & 833];
                arrobject[4130 & -29104] = class_859.\u0000, `();
                throw new Class_30034("commands.effect.failure.notActive.all", arrobject);
            }
            class_859.Method_946();
            Object[] arrobject = new Object[331 & 8721];
            arrobject[9284 & -26622] = class_859.\u0000, `();
            Class_41212.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.effect.success.removed.all", (Object[])arrobject);
            return;
        }
        try {
            n = Class_41212.\u0000strictfp((String)arrstring[-32191 & 9231], (int)(12319 & 161));
        }
        catch (Class_30032 class_30032) {
            Class_8338 class_8338 = Class_8338.Method_8442(arrstring[-4795 & 545]);
            if (class_8338 == null) {
                throw class_30032;
            }
            n = class_8338.Field_8364;
        }
        int n2 = 5080 & 600;
        int n3 = -32194 & 2079;
        int n4 = 8981 & -14176;
        if (n >= 0 && n < Class_8338.Field_8341.length && Class_8338.Field_8341[n] != null) {
            Class_8338 class_8338 = Class_8338.Field_8341[n];
            if (arrstring.length >= (17699 & 2051)) {
                n3 = Class_41212.\u0000strictfp((String)arrstring[2610 & -28286], (int)(9328 & -16384), (int)(1478480448 & 1002080));
                n2 = class_8338.Method_8420() ? n3 : n3 * (2134 & -32076);
            } else if (class_8338.Method_8420()) {
                n2 = -32767 & 16717;
            }
            if (arrstring.length >= (9254 & 21)) {
                n4 = Class_41212.\u0000strictfp((String)arrstring[1635 & 4115], (int)(-15352 & 2129), (int)(-30465 & 4351));
            }
            boolean bl = 10497 & 177;
            if (arrstring.length >= (-20171 & 197) && "true".equalsIgnoreCase(arrstring[2204 & 25605])) {
                bl = 2576 & -32660;
            }
            if (n3 > 0) {
                Class_25240 class_25240 = new Class_25240(n, n2, n4, (8516 & 20483) != 0, bl);
                class_859.Method_995(class_25240);
                Object[] arrobject = new Object[533 & 4111];
                arrobject[5282 & 18501] = new Class_2849(class_25240.Method_25264(), new Object[369 & 22538]);
                arrobject[521 & 8259] = n;
                arrobject[5194 & 2582] = n4;
                arrobject[-20477 & 1699] = class_859.\u0000, `();
                arrobject[26628 & 1061] = n3;
                Class_41212.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.effect.success", (Object[])arrobject);
                return;
            }
            if (class_859.Method_969(n)) {
                class_859.Method_1031(n);
                Object[] arrobject = new Object[4099 & 390];
                arrobject[-15824 & 2185] = new Class_2849(class_8338.Method_8411(), new Object[3780 & 16]);
                arrobject[24833 & 11] = class_859.\u0000, `();
                Class_41212.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.effect.success.removed", (Object[])arrobject);
                return;
            }
            Object[] arrobject = new Object[66 & 26938];
            arrobject[3222 & 21032] = new Class_2849(class_8338.Method_8411(), new Object[10 & 8224]);
            arrobject[18753 & 661] = class_859.\u0000, `();
            throw new Class_30034("commands.effect.failure.notActive", arrobject);
        }
        Object[] arrobject = new Object[425 & 533];
        arrobject[-31232 & 16538] = n;
        throw new Class_30032("commands.effect.notFound", arrobject);
    }

    public String Method_41214() {
        return "effect";
    }

    public String Method_41215(Class_1367 class_1367) {
        return "commands.effect.usage";
    }

    protected String[] Method_41216() {
        return Class_2457.Method_2530().Method_2554();
    }

    public boolean Method_41217(String[] arrstring, int n) {
        return (n == 0 ? 2337 & -12207 : 528 & -16352) != 0;
    }

    public int Method_41218() {
        return -31213 & 12710;
    }

    public List Method_41219(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (529 & -16311)) {
            list = Class_41212.\u0000strictfp((String[])arrstring, (String[])this.Method_41216());
        } else if (arrstring.length == (8194 & -30718)) {
            list = Class_41212.\u0000strictfp((String[])arrstring, (Collection)Class_8338.Method_8404());
        } else if (arrstring.length == (10271 & -28347)) {
            String[] arrstring2 = new String[3467 & 4610];
            arrstring2[-12096 & 9] = "true";
            arrstring2[-24445 & 16449] = "false";
            list = Class_41212.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }

    private void Method_41220() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

