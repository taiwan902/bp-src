/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Class_43527
extends Class_36787 {
    private int Method_43528(Class_17022 class_17022, double d, Class_283 class_283, Random random, double d2, double d3, double d4, double d5, Class_17022[] arrclass_17022, boolean bl) {
        int n;
        int n2 = 8969 & 2049;
        double d6 = 5.24601951067732E38 * 0.6486486486486487;
        for (n = -16233 & 5704; n < (10096 & 14232) && n2 != 0; ++n) {
            Object object;
            Class_17022 class_170222;
            int n3;
            n2 = 9 & -13328;
            d6 = 0.7142857142857143 * 4.763952852939404E38;
            for (int i = -31232 & 8203; i < arrclass_17022.length; ++i) {
                object = arrclass_17022[i];
                n3 = 520 & 2370;
                class_170222 = new Class_17022();
                for (int j = 10512 & 5284; j < arrclass_17022.length; ++j) {
                    if (i == j) continue;
                    Class_17022 class_170223 = arrclass_17022[j];
                    double d7 = ((Class_17022)object).Method_17029(class_170223);
                    d6 = Math.min(d7, d6);
                    if (!(d7 < d)) continue;
                    ++n3;
                    class_170222.Field_17023 += class_170223.Field_17023 - ((Class_17022)object).Field_17023;
                    class_170222.Field_17024 += class_170223.Field_17024 - ((Class_17022)object).Field_17024;
                }
                if (n3 > 0) {
                    class_170222.Field_17023 /= (double)n3;
                    class_170222.Field_17024 /= (double)n3;
                    double d8 = class_170222.Method_17025();
                    if (d8 > 0.0) {
                        class_170222.Method_17032();
                        ((Class_17022)object).Method_17030(class_170222);
                    } else {
                        ((Class_17022)object).Method_17027(random, d2, d3, d4, d5);
                    }
                    n2 = 16415 & 257;
                }
                if (!((Class_17022)object).Method_17028(d2, d3, d4, d5)) continue;
                n2 = -32475 & 10251;
            }
            if (n2 != 0) continue;
            Class_17022[] arrclass_170222 = arrclass_17022;
            object = arrclass_170222.length;
            for (n3 = 23047 & -31680; n3 < object; ++n3) {
                class_170222 = arrclass_170222[n3];
                if (class_170222.Method_17033(class_283)) continue;
                class_170222.Method_17027(random, d2, d3, d4, d5);
                n2 = 1 & 1861;
            }
        }
        if (n >= (10000 & 14193)) {
            Object[] arrobject = new Object[28 & -5980];
            arrobject[261 & -20440] = arrclass_17022.length;
            arrobject[1281 & -28659] = class_17022.Field_17023;
            arrobject[-29694 & 903] = class_17022.Field_17024;
            Object[] arrobject2 = new Object[4865 & -8175];
            arrobject2[328 & 2564] = d6;
            arrobject[11203 & 1055] = String.format("%.2f", arrobject2);
            throw new Class_30034("commands.spreadplayers.failure." + (bl ? "teams" : "players"), arrobject);
        }
        return n;
    }

    private void Method_43529() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private double Method_43530(List list, Class_283 class_283, Class_17022[] arrclass_17022, boolean bl) {
        double d = 0.0;
        int n = -31742 & 6156;
        HashMap hashMap = Maps.newHashMap();
        for (int i = 549 & -26174; i < list.size(); ++i) {
            Class_17022 class_17022;
            Class_1061 class_1061 = (Class_1061)list.get(i);
            if (bl) {
                Class_9665 class_9665;
                Class_9665 class_96652 = class_9665 = class_1061 instanceof Class_626 ? ((Class_626)class_1061).Method_840() : null;
                if (!hashMap.containsKey(class_9665)) {
                    hashMap.put(class_9665, arrclass_17022[n++]);
                }
                class_17022 = (Class_17022)hashMap.get(class_9665);
            } else {
                class_17022 = arrclass_17022[n++];
            }
            class_1061.Method_1184((float)Class_13337.Method_13371(class_17022.Field_17023) + 0.68333334f * 0.73170733f, class_17022.Method_17031(class_283), (double)Class_13337.Method_13371(class_17022.Field_17024) + 1.2 * 0.4166666666666667);
            double d2 = 33.5 * 5.3662481637681065E306;
            for (int j = 261 & 9216; j < arrclass_17022.length; ++j) {
                if (class_17022 == arrclass_17022[j]) continue;
                double d3 = class_17022.Method_17029(arrclass_17022[j]);
                d2 = Math.min(d3, d2);
            }
            d += d2;
        }
        return d /= (double)list.size();
    }

    public void Method_43531(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (17414 & 4102)) {
            throw new Class_34974("commands.spreadplayers.usage", new Object[-16112 & 5636]);
        }
        int n = -14224 & 4481;
        Class_4751 class_4751 = class_1367.Method_1372();
        double d = Class_43527.\u0000strictfp((double)class_4751.\u0000= final(), (String)arrstring[n++], (2195 & 321) != 0);
        double d2 = Class_43527.\u0000strictfp((double)class_4751.\u0000strictfp(), (String)arrstring[n++], (16409 & 14625) != 0);
        double d3 = Class_43527.\u0000strictfp((String)arrstring[n++], (double)0.0);
        double d4 = Class_43527.\u0000strictfp((String)arrstring[n++], (double)(d3 + 1.0));
        boolean bl = Class_43527.\u0000strictfp((String)arrstring[n++]);
        ArrayList arrayList = Lists.newArrayList();
        while (n < arrstring.length) {
            String string;
            List list;
            if (Class_16350.Method_16388(string = arrstring[n++])) {
                list = Class_16350.Method_16386(class_1367, string, Class_1061.class);
                if (list.size() == 0) {
                    throw new \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized();
                }
                arrayList.addAll(list);
                continue;
            }
            list = Class_2457.Method_2530().Method_2616().Method_3155(string);
            if (list == null) {
                throw new Class_31939();
            }
            arrayList.add(list);
        }
        class_1367.Method_1374(Class_26261.Field_26268, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized();
        }
        Object[] arrobject = new Object[8205 & 18695];
        arrobject[9472 & -28640] = arrayList.size();
        arrobject[1665 & -28567] = d4;
        arrobject[2051 & 4106] = d;
        arrobject[16643 & -28457] = d2;
        arrobject[262 & 140] = d3;
        class_1367.Method_1373(new Class_2849("commands.spreadplayers.spreading." + (bl ? "teams" : "players"), arrobject));
        this.Method_43536(class_1367, arrayList, new Class_17022(d, d2), d3, d4, ((Class_1061)arrayList.get((int)(6274 & -31720))).Field_1089, bl);
    }

    private int Method_43532(List list) {
        HashSet hashSet = Sets.newHashSet();
        for (Class_1061 class_1061 : list) {
            if (class_1061 instanceof Class_626) {
                hashSet.add(((Class_626)class_1061).Method_840());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    public String Method_43533(Class_1367 class_1367) {
        return "commands.spreadplayers.usage";
    }

    private Class_17022[] Method_43534(Random random, int n, double d, double d2, double d3, double d4) {
        Class_17022[] arrclass_17022 = new Class_17022[n];
        for (int i = 10082 & -32768; i < arrclass_17022.length; ++i) {
            Class_17022 class_17022 = new Class_17022();
            class_17022.Method_17027(random, d, d2, d3, d4);
            arrclass_17022[i] = class_17022;
        }
        return arrclass_17022;
    }

    public String Method_43535() {
        return "spreadplayers";
    }

    private void Method_43536(Class_1367 class_1367, List list, Class_17022 class_17022, double d, double d2, Class_283 class_283, boolean bl) {
        Random random = new Random();
        double d3 = class_17022.Field_17023 - d2;
        double d4 = class_17022.Field_17024 - d2;
        double d5 = class_17022.Field_17023 + d2;
        double d6 = class_17022.Field_17024 + d2;
        Class_17022[] arrclass_17022 = this.Method_43534(random, bl ? this.Method_43532(list) : list.size(), d3, d4, d5, d6);
        int n = this.Method_43528(class_17022, d, class_283, random, d3, d4, d5, d6, arrclass_17022, bl);
        double d7 = this.Method_43530(list, class_283, arrclass_17022, bl);
        Object[] arrobject = new Object[21619 & 8455];
        arrobject[-16356 & 14368] = arrclass_17022.length;
        arrobject[13057 & -14139] = class_17022.Field_17023;
        arrobject[9914 & -16318] = class_17022.Field_17024;
        Class_43527.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)("commands.spreadplayers.success." + (bl ? "teams" : "players")), (Object[])arrobject);
        if (arrclass_17022.length > (20489 & -30415)) {
            Object[] arrobject2 = new Object[3859 & -32762];
            Object[] arrobject3 = new Object[651 & 2049];
            arrobject3[17681 & 2178] = d7;
            arrobject2[4608 & 8240] = String.format("%.2f", arrobject3);
            arrobject2[1 & 5643] = n;
            class_1367.Method_1373(new Class_2849("commands.spreadplayers.info." + (bl ? "teams" : "players"), arrobject2));
        }
    }

    public int Method_43537() {
        return 326 & 130;
    }

    public List Method_43538(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length >= (-32759 & 8853) && arrstring.length <= (-25361 & 514) ? Class_43527.\u0000, `((String[])arrstring, (int)(24902 & 168), (Class_4751)class_4751) : null;
    }
}

