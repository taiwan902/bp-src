/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;

public class Class_42702
extends Class_36787 {
    public String Method_42703() {
        return "enchant";
    }

    public String Method_42704(Class_1367 class_1367) {
        return "commands.enchant.usage";
    }

    public int Method_42705() {
        return 17418 & -20298;
    }

    protected String[] Method_42706() {
        return Class_2457.Method_2530().Method_2554();
    }

    public void Method_42707(Class_1367 class_1367, String[] arrstring) {
        Class_1758 class_1758;
        Object object;
        int n;
        if (arrstring.length < (3402 & 19)) {
            throw new Class_34974("commands.enchant.usage", new Object[29200 & 2345]);
        }
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_42702.\u0000strictfp((Class_1367)class_1367, (String)arrstring[-12030 & 169]);
        class_1367.Method_1374(Class_26261.Field_26264, -23658 & 17416);
        try {
            n = Class_42702.\u0000strictfp((String)arrstring[20485 & -32159], (int)(-24320 & 5776));
        }
        catch (Class_30032 class_30032) {
            object = Class_30635.Method_30668(arrstring[12867 & 1029]);
            if (object == null) {
                throw class_30032;
            }
            n = ((Class_30635)object).Field_30638;
        }
        int n2 = 2659 & -32751;
        object = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.Method_792();
        if (object == null) {
            throw new Class_30034("commands.enchant.noItem", new Object[-27520 & 271]);
        }
        Class_30635 class_30635 = Class_30635.Method_30685(n);
        if (class_30635 == null) {
            Object[] arrobject = new Object[24589 & 6241];
            arrobject[336 & 2] = n;
            throw new Class_30032("commands.enchant.notFound", arrobject);
        }
        if (!class_30635.Method_30697((Class_23823)object)) {
            throw new Class_30034("commands.enchant.cantEnchant", new Object[17177 & -27422]);
        }
        if (arrstring.length >= (2059 & 5763)) {
            n2 = Class_42702.\u0000strictfp((String)arrstring[6922 & 24647], (int)class_30635.Method_30696(), (int)class_30635.Method_30672());
        }
        if (((Class_23823)object).Method_23842() && (class_1758 = ((Class_23823)object).Method_23863()) != null) {
            for (int i = 768 & 23681; i < class_1758.Method_1772(); ++i) {
                Class_30635 class_306352;
                short s = class_1758.Method_1768(i).Method_1726("id");
                if (Class_30635.Method_30685(s) == null || (class_306352 = Class_30635.Method_30685(s)).Method_30690(class_30635)) continue;
                Object[] arrobject = new Object[9130 & -31721];
                arrobject[6164 & 16802] = class_30635.Method_30706(n2);
                arrobject[-30719 & 21853] = class_306352.Method_30706(class_1758.Method_1768(i).Method_1726("lvl"));
                throw new Class_30034("commands.enchant.cantCombine", arrobject);
            }
        }
        ((Class_23823)object).Method_23835(class_30635, n2);
        Class_42702.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.enchant.success", (Object[])new Object[4544 & 1076]);
        class_1367.Method_1374(Class_26261.Field_26264, -31999 & 3073);
    }

    public boolean Method_42708(String[] arrstring, int n) {
        return (n == 0 ? 45 & -32383 : -31677 & 2464) != 0;
    }

    public List Method_42709(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (133 & -14271) ? Class_42702.\u0000strictfp((String[])arrstring, (String[])this.Method_42706()) : (arrstring.length == (-26014 & 9223) ? Class_42702.\u0000strictfp((String[])arrstring, (Collection)Class_30635.Method_30682()) : null);
    }

    private void Method_42710() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

