/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Class_40096
extends Class_36787 {
    public void Method_40097(Class_1367 class_1367, String[] arrstring) {
        Object object;
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2;
        if (arrstring.length < (4295 & 259)) {
            throw new Class_34974("commands.trigger.usage", new Object[704 & 2359]);
        }
        if (class_1367 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_1367;
        } else {
            object = class_1367.Method_1377();
            if (!(object instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)) {
                throw new Class_30034("commands.trigger.invalidPlayer", new Object[10776 & -32509]);
            }
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)object;
        }
        object = Class_2457.Method_2530().Method_2550(36 & 12432).\u0000strictfp();
        Class_7873 class_7873 = ((Class_20976)object).Method_21003(arrstring[12305 & 1828]);
        if (class_7873 != null && class_7873.Method_7883() == Class_27930.Field_27939) {
            int n = Class_40096.\u0000strictfp((String)arrstring[16450 & 5258]);
            if (!((Class_20976)object).Method_21011(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `(), class_7873)) {
                Object[] arrobject = new Object[28769 & 2205];
                arrobject[1667 & 26636] = arrstring[3157 & 4360];
                throw new Class_30034("commands.trigger.invalidObjective", arrobject);
            }
            Class_21696 class_21696 = ((Class_20976)object).Method_20993(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `(), class_7873);
            if (class_21696.Method_21714()) {
                Object[] arrobject = new Object[1 & 2065];
                arrobject[16402 & 2177] = arrstring[2051 & 544];
                throw new Class_30034("commands.trigger.disabled", arrobject);
            }
            if ("set".equals(arrstring[-4071 & 39])) {
                class_21696.Method_21709(n);
            } else {
                if (!"add".equals(arrstring[-17631 & 65])) {
                    Object[] arrobject = new Object[1 & -11751];
                    arrobject[80 & 24716] = arrstring[1033 & 17299];
                    throw new Class_30034("commands.trigger.invalidMode", arrobject);
                }
                class_21696.Method_21707(n);
            }
            class_21696.Method_21705((28741 & 643) != 0);
            if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_38768()) {
                Object[] arrobject = new Object[4115 & -12725];
                arrobject[-32480 & 30210] = arrstring[16416 & 4227];
                arrobject[9337 & 769] = arrstring[8205 & 17025];
                arrobject[-24061 & 1042] = arrstring[16387 & -20982];
                Class_40096.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.trigger.success", (Object[])arrobject);
            }
        } else {
            Object[] arrobject = new Object[4227 & 16929];
            arrobject[7169 & 172] = arrstring[-29376 & 8249];
            throw new Class_30034("commands.trigger.invalidObjective", arrobject);
        }
    }

    public String Method_40098() {
        return "trigger";
    }

    private void Method_40099() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_40100(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (4385 & 3603)) {
            Class_20976 class_20976 = Class_2457.Method_2530().Method_2550(2120 & 1542).\u0000strictfp();
            ArrayList arrayList = Lists.newArrayList();
            for (Class_7873 class_7873 : class_20976.Method_20996()) {
                if (class_7873.Method_7883() != Class_27930.Field_27939) continue;
                arrayList.add(class_7873.Method_7881());
            }
            return Class_40096.\u0000strictfp((String[])arrstring, (String[])arrayList.toArray(new String[arrayList.size()]));
        }
        if (arrstring.length == (4642 & -29305)) {
            String[] arrstring2 = new String[4750 & -30718];
            arrstring2[491 & 6656] = "add";
            arrstring2[-23493 & 16517] = "set";
            list = Class_40096.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }

    public String Method_40101(Class_1367 class_1367) {
        return "commands.trigger.usage";
    }

    public int Method_40102() {
        return 5514 & 16480;
    }
}

