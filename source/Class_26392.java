/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_26392
extends Class_1956 {
    public int Method_26393(Class_23823 class_23823, int n) {
        if (n != (3209 & 12561)) {
            return super.Method_1993(class_23823, n);
        }
        Class_1674 class_1674 = Class_26392.Method_26394(class_23823, "Colors");
        if (!(class_1674 instanceof Class_37367)) {
            return -1853190518 & 1082833658;
        }
        Class_37367 class_37367 = (Class_37367)class_1674;
        int[] arrn = class_37367.Method_37376();
        if (arrn.length == (8633 & -31739)) {
            return arrn[20512 & 1736];
        }
        int n2 = 546 & 13448;
        int n3 = -1984 & 1920;
        int n4 = -12028 & 8712;
        int[] arrn2 = arrn;
        int n5 = arrn2.length;
        for (int i = 612 & 16530; i < n5; ++i) {
            int n6 = arrn2[i];
            n2 += (n6 & (1090461954 & 1023363233)) >> (-26311 & 9298);
            n3 += (n6 & (991362825 & -991821946)) >> (72 & 5273);
            n4 += (n6 & (13823 & -32513)) >> (-10112 & 810);
        }
        return (n2 /= arrn.length) << (2072 & -8144) | (n3 /= arrn.length) << (-23223 & 24) | (n4 /= arrn.length);
    }

    public static Class_1674 Method_26394(Class_23823 class_23823, String string) {
        Class_1699 class_1699;
        if (class_23823.Method_23842() && (class_1699 = class_23823.Method_23845().Method_1703("Explosion")) != null) {
            return class_1699.Method_1720(string);
        }
        return null;
    }

    private void Method_26395() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26396(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        Class_1699 class_1699;
        if (class_23823.Method_23842() && (class_1699 = class_23823.Method_23845().Method_1703("Explosion")) != null) {
            Class_26392.Method_26397(class_1699, list);
        }
    }

    public static void Method_26397(Class_1699 class_1699, List list) {
        boolean bl;
        int[] arrn;
        int n;
        Object object;
        boolean bl2;
        int n2;
        int n3;
        int n4;
        byte by = class_1699.Method_1716("Type");
        if (by >= 0 && by <= (165 & -27108)) {
            list.add(Class_7594.Method_7602("item.fireworksCharge.type." + by).trim());
        } else {
            list.add(Class_7594.Method_7602("item.fireworksCharge.type").trim());
        }
        int[] arrn2 = class_1699.Method_1701("Colors");
        if (arrn2.length > 0) {
            int n5 = 17001 & 405;
            String string = "";
            object = arrn2;
            int n6 = ((int[])object).length;
            for (n = -15808 & 14342; n < n6; ++n) {
                n3 = object[n];
                if (n5 == 0) {
                    string = string + ", ";
                }
                n5 = 10260 & 5163;
                n2 = 1076 & -28352;
                for (n4 = 1852 & 16384; n4 < Class_24451.Field_24452.length; ++n4) {
                    if (n3 != Class_24451.Field_24452[n4]) continue;
                    n2 = 3137 & 24633;
                    string = string + Class_7594.Method_7602("item.fireworksCharge." + Class_5393.Method_5448(n4).Method_5462());
                    break;
                }
                if (n2 != 0) continue;
                string = string + Class_7594.Method_7602("item.fireworksCharge.customColor");
            }
            list.add(string);
        }
        if ((arrn = class_1699.Method_1701("FadeColors")).length > 0) {
            int n7 = 2049 & 155;
            object = Class_7594.Method_7602("item.fireworksCharge.fadeTo") + " ";
            int[] arrn3 = arrn;
            n = arrn3.length;
            for (n3 = -31610 & 11016; n3 < n; ++n3) {
                n2 = arrn3[n3];
                if (n7 == 0) {
                    object = (String)object + ", ";
                }
                n7 = 23816 & -32766;
                n4 = 1572 & -26599;
                for (int i = 544 & 16391; i < (18838 & -31695); ++i) {
                    if (n2 != Class_24451.Field_24452[i]) continue;
                    n4 = 289 & 2569;
                    object = (String)object + Class_7594.Method_7602("item.fireworksCharge." + Class_5393.Method_5448(i).Method_5462());
                    break;
                }
                if (n4 != 0) continue;
                object = (String)object + Class_7594.Method_7602("item.fireworksCharge.customColor");
            }
            list.add(object);
        }
        if (bl = class_1699.Method_1733("Trail")) {
            list.add(Class_7594.Method_7602("item.fireworksCharge.trail"));
        }
        if (bl2 = class_1699.Method_1733("Flicker")) {
            list.add(Class_7594.Method_7602("item.fireworksCharge.flicker"));
        }
    }
}

