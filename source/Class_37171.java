/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Class_37171
extends Class_36787 {
    public void Method_37172(Class_1367 class_1367, String[] arrstring) {
        Class_1061 class_1061;
        if (arrstring.length < (9283 & 17025)) {
            throw new Class_34974("commands.tp.usage", new Object[-32767 & 4102]);
        }
        int n = -23999 & 2356;
        if (arrstring.length != (322 & 28807) && arrstring.length != (70 & 20493) && arrstring.length != (25622 & 6374)) {
            class_1061 = Class_37171.\u0000strictfp((Class_1367)class_1367);
        } else {
            class_1061 = Class_37171.\u0000strictfp((Class_1367)class_1367, (String)arrstring[24576 & 4640]);
            n = -32767 & 2059;
        }
        if (arrstring.length != (513 & 5385) && arrstring.length != (1026 & 25107)) {
            if (arrstring.length < n + (91 & -15613)) {
                throw new Class_34974("commands.tp.usage", new Object[-15104 & 648]);
            }
            if (class_1061.Field_1089 != null) {
                int n2 = n + (2065 & -20383);
                Class_24921 class_24921 = Class_37171.\u0000strictfp((double)class_1061.Field_1130, (String)arrstring[n], (2085 & 73) != 0);
                Class_24921 class_249212 = Class_37171.\u0000strictfp((double)class_1061.Method_1324(), (String)arrstring[n2++], (int)(22528 & 520), (int)(3859 & 136), (22529 & 1024) != 0);
                Class_24921 class_249213 = Class_37171.\u0000strictfp((double)class_1061.Field_1106, (String)arrstring[n2++], (2071 & 1601) != 0);
                Class_24921 class_249214 = Class_37171.\u0000strictfp((double)class_1061.Field_1079, (String)(arrstring.length > n2 ? arrstring[n2++] : "~"), (10497 & -31548) != 0);
                Class_24921 class_249215 = Class_37171.\u0000strictfp((double)class_1061.Field_1093, (String)(arrstring.length > n2 ? arrstring[n2] : "~"), (-20075 & 18952) != 0);
                if (class_1061 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
                    EnumSet<Class_33501> enumSet = EnumSet.noneOf(Class_33501.class);
                    if (class_24921.Method_24926()) {
                        enumSet.add(Class_33501.Field_33503);
                    }
                    if (class_249212.Method_24926()) {
                        enumSet.add(Class_33501.Field_33508);
                    }
                    if (class_249213.Method_24926()) {
                        enumSet.add(Class_33501.Field_33505);
                    }
                    if (class_249215.Method_24926()) {
                        enumSet.add(Class_33501.Field_33504);
                    }
                    if (class_249214.Method_24926()) {
                        enumSet.add(Class_33501.Field_33507);
                    }
                    float f = (float)class_249214.Method_24928();
                    if (!class_249214.Method_24926()) {
                        f = Class_13337.Method_13354(f);
                    }
                    float f2 = (float)class_249215.Method_24928();
                    if (!class_249215.Method_24926()) {
                        f2 = Class_13337.Method_13354(f2);
                    }
                    if (f2 > 2.6666667f * 33.75f || f2 < 2.5757575f * -34.941177f) {
                        f2 = Class_13337.Method_13354(254.11766f * 0.7083333f - f2);
                        f = Class_13337.Method_13354(f + 2.5f * 72.0f);
                    }
                    class_1061.Method_1163(null);
                    ((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_1061).\u0000strictfp.Method_20797(class_24921.Method_24928(), class_249212.Method_24928(), class_249213.Method_24928(), f, f2, enumSet);
                    class_1061.Method_1200(f);
                } else {
                    float f = (float)Class_13337.Method_13368(class_249214.Method_24925());
                    float f3 = (float)Class_13337.Method_13368(class_249215.Method_24925());
                    if (f3 > 4.9473686f * 18.191488f || f3 < -67.21519f * 1.338983f) {
                        f3 = Class_13337.Method_13354(1.4615384f * 123.1579f - f3);
                        f = Class_13337.Method_13354(f + 42.954544f * 4.1904764f);
                    }
                    class_1061.Method_1239(class_24921.Method_24925(), class_249212.Method_24925(), class_249213.Method_24925(), f, f3);
                    class_1061.Method_1200(f);
                }
                Object[] arrobject = new Object[11012 & -32633];
                arrobject[536 & -12288] = class_1061.Method_1202();
                arrobject[4257 & 1025] = class_24921.Method_24925();
                arrobject[-11486 & 9234] = class_249212.Method_24925();
                arrobject[-7917 & 6667] = class_249213.Method_24925();
                Class_37171.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.tp.success.coordinates", (Object[])arrobject);
            }
        } else {
            Class_1061 class_10612 = Class_37171.\u0000strictfp((Class_1367)class_1367, (String)arrstring[arrstring.length - (177 & -11263)]);
            if (class_10612.Field_1089 != class_1061.Field_1089) {
                throw new Class_30034("commands.tp.notSameDimension", new Object[1161 & -18330]);
            }
            class_1061.Method_1163(null);
            if (class_1061 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
                ((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_1061).\u0000strictfp.Method_20802(class_10612.Field_1130, class_10612.Method_1324(), class_10612.Field_1106, class_10612.Field_1079, class_10612.Field_1093);
            } else {
                class_1061.Method_1239(class_10612.Field_1130, class_10612.Method_1324(), class_10612.Field_1106, class_10612.Field_1079, class_10612.Field_1093);
            }
            Object[] arrobject = new Object[27938 & 4103];
            arrobject[353 & 9744] = class_1061.Method_1202();
            arrobject[8343 & 2593] = class_10612.Method_1202();
            Class_37171.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.tp.success", (Object[])arrobject);
        }
    }

    private void Method_37173() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37174() {
        return "tp";
    }

    public List Method_37175(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length != (-24429 & 20557) && arrstring.length != (4874 & 16386) ? null : Class_37171.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554());
    }

    public String Method_37176(Class_1367 class_1367) {
        return "commands.tp.usage";
    }

    public int Method_37177() {
        return -32254 & 17618;
    }

    public boolean Method_37178(String[] arrstring, int n) {
        return (n == 0 ? 4099 & -28927 : -6142 & 1537) != 0;
    }
}

