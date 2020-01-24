/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Class_37627
extends Class_36787 {
    public boolean Method_37628(String[] arrstring, int n) {
        return (n == (2179 & -24554) ? 65 & -31947 : -30464 & 25294) != 0;
    }

    public int Method_37629() {
        return 10306 & -16374;
    }

    public void Method_37630(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (1035 & 642)) {
            throw new Class_34974("commands.achievement.usage", new Object[-23296 & 20528]);
        }
        Class_13017 class_13017 = Class_19863.Method_20025(arrstring[10251 & 21185]);
        if (class_13017 == null && !arrstring[-11007 & 61].equals("*")) {
            Object[] arrobject = new Object[771 & 10437];
            arrobject[8424 & 18432] = arrstring[16577 & 3083];
            throw new Class_30034("commands.achievement.unknownAchievement", arrobject);
        }
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = arrstring.length >= (2647 & 4395) ? Class_37627.\u0000strictfp((Class_1367)class_1367, (String)arrstring[-32682 & 5163]) : Class_37627.\u0000strictfp((Class_1367)class_1367);
        boolean bl = arrstring[-31684 & 641].equalsIgnoreCase("give");
        boolean bl2 = arrstring[19144 & 291].equalsIgnoreCase("take");
        if (bl || bl2) {
            if (class_13017 == null) {
                if (bl) {
                    for (Class_14225 class_14225 : Class_21905.Field_21929) {
                        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp((Class_13017)class_14225);
                    }
                    Object[] arrobject = new Object[9249 & 16409];
                    arrobject[2177 & 1302] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
                    Class_37627.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.achievement.give.success.all", (Object[])arrobject);
                } else if (bl2) {
                    for (Class_14225 class_14225 : Lists.reverse((List)Class_21905.Field_21929)) {
                        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `((Class_13017)class_14225);
                    }
                    Object[] arrobject = new Object[8617 & -32701];
                    arrobject[1666 & -30716] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
                    Class_37627.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.achievement.take.success.all", (Object[])arrobject);
                }
            } else {
                if (class_13017 instanceof Class_14225) {
                    Class_14225 class_14225 = (Class_14225)class_13017;
                    if (bl) {
                        if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp().\u0000strictfp(class_14225)) {
                            Object[] arrobject = new Object[7234 & 2];
                            arrobject[131 & -6144] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
                            arrobject[2083 & -28647] = class_13017.Method_13044();
                            throw new Class_30034("commands.achievement.alreadyHave", arrobject);
                        }
                        ArrayList arrayList = Lists.newArrayList();
                        while (class_14225.Field_14231 != null && !\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp().\u0000strictfp(class_14225.Field_14231)) {
                            arrayList.add(class_14225.Field_14231);
                            class_14225 = class_14225.Field_14231;
                        }
                        for (Class_14225 class_142252 : Lists.reverse((List)arrayList)) {
                            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp((Class_13017)class_142252);
                        }
                    } else if (bl2) {
                        if (!\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp().\u0000strictfp(class_14225)) {
                            Object[] arrobject = new Object[1315 & -26554];
                            arrobject[-28352 & 1568] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
                            arrobject[4241 & 1089] = class_13017.Method_13044();
                            throw new Class_30034("commands.achievement.dontHave", arrobject);
                        }
                        ArrayList arrayList = Lists.newArrayList((Iterator)Iterators.filter(Class_21905.Field_21929.iterator(), (Predicate)new Class_18187(this, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2, class_13017)));
                        ArrayList arrayList2 = Lists.newArrayList((Iterable)arrayList);
                        Iterator iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            Class_14225 class_142253;
                            Class_14225 class_142254 = class_142253 = (Class_14225)iterator.next();
                            int n = 73 & 2070;
                            while (class_142254 != null) {
                                if (class_142254 == class_13017) {
                                    n = 291 & -16303;
                                }
                                class_142254 = class_142254.Field_14231;
                            }
                            if (n != 0) continue;
                            class_142254 = class_142253;
                            while (class_142254 != null) {
                                arrayList2.remove(class_142253);
                                class_142254 = class_142254.Field_14231;
                            }
                        }
                        for (Class_14225 class_142253 : arrayList2) {
                            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `((Class_13017)class_142253);
                        }
                    }
                }
                if (bl) {
                    \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp(class_13017);
                    Object[] arrobject = new Object[20546 & 259];
                    arrobject[192 & 4100] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
                    arrobject[10291 & 1089] = class_13017.Method_13044();
                    Class_37627.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.achievement.give.success.one", (Object[])arrobject);
                } else if (bl2) {
                    \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `(class_13017);
                    Object[] arrobject = new Object[-32505 & 3730];
                    arrobject[-23488 & 544] = class_13017.Method_13044();
                    arrobject[-32767 & 4137] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
                    Class_37627.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.achievement.take.success.one", (Object[])arrobject);
                }
            }
        }
    }

    private void Method_37631() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37632(Class_1367 class_1367) {
        return "commands.achievement.usage";
    }

    public String Method_37633() {
        return "achievement";
    }

    public List Method_37634(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        if (arrstring.length == (513 & -13933)) {
            String[] arrstring2 = new String[-16126 & 9234];
            arrstring2[552 & 2369] = "give";
            arrstring2[16385 & 1955] = "take";
            return Class_37627.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        }
        if (arrstring.length != (14474 & -31210)) {
            return arrstring.length == (18199 & -20477) ? Class_37627.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : null;
        }
        ArrayList arrayList = Lists.newArrayList();
        for (Class_13017 class_13017 : Class_19863.Field_19886) {
            arrayList.add(class_13017.Field_13024);
        }
        return Class_37627.\u0000strictfp((String[])arrstring, (Collection)arrayList);
    }
}

