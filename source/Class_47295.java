/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.util.Vec3;

public class Class_47295
extends Class_36787 {
    public int Method_47296() {
        return 3219 & 10;
    }

    public String Method_47297() {
        return "playsound";
    }

    public boolean Method_47298(String[] arrstring, int n) {
        return (n == (2119 & -15999) ? 4225 & -32495 : -9650 & 8192) != 0;
    }

    public List Method_47299(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (-23530 & 290) ? Class_47295.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : (arrstring.length > (17634 & 538) && arrstring.length <= (2085 & 8911) ? Class_47295.\u0000strictfp((String[])arrstring, (int)(662 & 24579), (Class_4751)class_4751) : null);
    }

    public void Method_47300(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (22506 & 8195)) {
            throw new Class_34974(this.Method_47301(class_1367), new Object[-32764 & 29721]);
        }
        int n = -32760 & 66;
        String string = arrstring[n++];
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_47295.\u0000strictfp((Class_1367)class_1367, (String)arrstring[n++]);
        Vec3 vec3 = class_1367.Method_1371();
        double d = vec3.\u0000= final;
        if (arrstring.length > n) {
            d = Class_47295.\u0000strictfp((double)d, (String)arrstring[n++], (23809 & 45) != 0);
        }
        double d2 = vec3.\u0000strictfp;
        if (arrstring.length > n) {
            d2 = Class_47295.\u0000strictfp((double)d2, (String)arrstring[n++], (int)(-19664 & 16514), (int)(16584 & -31979), (1024 & -24558) != 0);
        }
        double d3 = vec3.\u0000, `;
        if (arrstring.length > n) {
            d3 = Class_47295.\u0000strictfp((double)d3, (String)arrstring[n++], (10241 & 4193) != 0);
        }
        double d4 = 1.0;
        if (arrstring.length > n) {
            d4 = Class_47295.\u0000strictfp((String)arrstring[n++], (double)0.0, (double)(2.37406288352462E37 * 14.333333333333334));
        }
        double d5 = 1.0;
        if (arrstring.length > n) {
            d5 = Class_47295.\u0000strictfp((String)arrstring[n++], (double)0.0, (double)(12.533333333333333 * 0.1595744680851064));
        }
        double d6 = 0.0;
        if (arrstring.length > n) {
            d6 = Class_47295.\u0000strictfp((String)arrstring[n], (double)0.0, (double)1.0);
        }
        double d7 = d4 > 1.0 ? d4 * (0.23529411764705882 * 68.0) : 0.7083333333333334 * 22.588235294117645;
        double d8 = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `(d, d2, d3);
        if (d8 > d7) {
            double d9;
            if (d6 <= 0.0) {
                Object[] arrobject = new Object[-32191 & 57];
                arrobject[1280 & -10236] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
                throw new Class_30034("commands.playsound.playerTooFar", arrobject);
            }
            double d10 = d - \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000= package;
            double d11 = d2 - \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, for();
            double d12 = Math.sqrt(d10 * d10 + d11 * d11 + (d9 = d3 - \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000= switch) * d9);
            if (d12 > 0.0) {
                d = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000= package + d10 / d12 * (0.15053763440860216 * 13.285714285714286);
                d2 = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, for() + d11 / d12 * (0.8705882352941177 * 2.2972972972972974);
                d3 = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000= switch + d9 / d12 * (13.2 * 0.15151515151515152);
            }
            d4 = d6;
        }
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(new Class_32014(string, d, d2, d3, (float)d4, (float)d5));
        Object[] arrobject = new Object[7978 & 2];
        arrobject[814 & 0] = string;
        arrobject[-24565 & 17921] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
        Class_47295.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.playsound.success", (Object[])arrobject);
    }

    public String Method_47301(Class_1367 class_1367) {
        return "commands.playsound.usage";
    }

    private void Method_47302() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

