/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Class_36913
extends Class_36787 {
    public String Method_36914() {
        return "fill";
    }

    private void Method_36915() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36916(Class_1367 class_1367, String[] arrstring) {
        int n;
        block24 : {
            block19 : {
                Object object;
                int n2;
                if (arrstring.length < (287 & -23417)) {
                    throw new Class_34974("commands.fill.usage", new Object[1153 & -11932]);
                }
                class_1367.Method_1374(Class_26261.Field_26265, 1080 & -32448);
                Class_4751 class_4751 = Class_36913.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(-24046 & 2084), (22 & 18440) != 0);
                Class_4751 class_47512 = Class_36913.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(4227 & -14069), (17568 & -32176) != 0);
                Class_3238 class_3238 = Class_36787.Method_36804(class_1367, arrstring[-23546 & 4902]);
                int n3 = 680 & 17408;
                if (arrstring.length >= (8505 & 20616)) {
                    n3 = Class_36913.\u0000strictfp((String)arrstring[-32553 & 5127], (int)(2050 & 20672), (int)(3087 & 16399));
                }
                Class_4751 class_47513 = new Class_4751(Math.min(class_4751.\u0000= final(), class_47512.\u0000= final()), Math.min(class_4751.\u0000, `(), class_47512.\u0000, `()), Math.min(class_4751.\u0000strictfp(), class_47512.\u0000strictfp()));
                Class_4751 class_47514 = new Class_4751(Math.max(class_4751.\u0000= final(), class_47512.\u0000= final()), Math.max(class_4751.\u0000, `(), class_47512.\u0000, `()), Math.max(class_4751.\u0000strictfp(), class_47512.\u0000strictfp()));
                n = (class_47514.\u0000= final() - class_47513.\u0000= final() + (513 & 26761)) * (class_47514.\u0000, `() - class_47513.\u0000, `() + (12425 & -31693)) * (class_47514.\u0000strictfp() - class_47513.\u0000strictfp() + (4195 & -6527));
                if (n > (271417864 & 205688982)) {
                    Object[] arrobject = new Object[22411 & -22490];
                    arrobject[10269 & -27616] = n;
                    arrobject[1161 & 17] = 1343783814 & 48271384;
                    throw new Class_30034("commands.fill.tooManyBlocks", arrobject);
                }
                if (class_47513.\u0000, `() < 0 || class_47514.\u0000, `() >= (320 & 19202)) break block19;
                Class_283 class_283 = class_1367.Method_1375();
                for (int i = class_47513.\u0000strictfp(); i < class_47514.\u0000strictfp() + (9016 & 17488); i += 16) {
                    for (n2 = class_47513.\u0000= final(); n2 < class_47514.\u0000= final() + (1681 & 6164); n2 += 16) {
                        if (class_283.Method_368(new Class_4751(n2, class_47514.\u0000, `() - class_47513.\u0000, `(), i))) continue;
                        throw new Class_30034("commands.fill.outOfWorld", new Object[448 & 12289]);
                    }
                }
                Class_1699 class_1699 = new Class_1699();
                n2 = 17440 & 2952;
                if (arrstring.length >= (8234 & -31206) && class_3238.Method_3339()) {
                    object = Class_36913.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(24875 & 9)).Method_1788();
                    try {
                        class_1699 = Class_10981.Method_10996((String)object);
                        n2 = -31487 & 2193;
                    }
                    catch (Class_34310 class_34310) {
                        Object[] arrobject = new Object[20769 & 129];
                        arrobject[16684 & 2576] = class_34310.getMessage();
                        throw new Class_30034("commands.fill.tagError", arrobject);
                    }
                }
                object = Lists.newArrayList();
                n = 16385 & 2584;
                for (int i = class_47513.\u0000strictfp(); i <= class_47514.\u0000strictfp(); ++i) {
                    for (int j = class_47513.\u0000, `(); j <= class_47514.\u0000, `(); ++j) {
                        for (int k = class_47513.\u0000= final(); k <= class_47514.\u0000= final(); ++k) {
                            Class_4751 class_47515;
                            Class_3436 class_3436;
                            Object object2;
                            Class_4879 class_4879;
                            block20 : {
                                block21 : {
                                    block23 : {
                                        block22 : {
                                            class_47515 = new Class_4751(k, j, i);
                                            if (arrstring.length < (8397 & 553)) break block20;
                                            if (arrstring[24 & 3464].equals("outline") || arrstring[24072 & 58].equals("hollow")) break block21;
                                            if (!arrstring[16396 & -23880].equals("destroy")) break block22;
                                            class_283.Method_541(class_47515, (20763 & 1157) != 0);
                                            break block20;
                                        }
                                        if (!arrstring[1662 & 28680].equals("keep")) break block23;
                                        if (!class_283.Method_507(class_47515)) {
                                            continue;
                                        }
                                        break block20;
                                    }
                                    if (!arrstring[18520 & 649].equals("replace") || class_3238.Method_3339()) break block20;
                                    if (arrstring.length > (4233 & 2841)) {
                                        object2 = Class_36787.Method_36804(class_1367, arrstring[-29685 & 24777]);
                                        if (class_283.Method_375(class_47515).Method_3442() != object2) continue;
                                    }
                                    if (arrstring.length <= (3642 & 4106)) break block20;
                                    int n4 = Class_36787.Method_36789(arrstring[10314 & -27874]);
                                    class_3436 = class_283.Method_375(class_47515);
                                    if (class_3436.Method_3442().Method_3434(class_3436) != n4) {
                                        continue;
                                    }
                                    break block20;
                                }
                                if (k != class_47513.\u0000= final() && k != class_47514.\u0000= final() && j != class_47513.\u0000, `() && j != class_47514.\u0000, `() && i != class_47513.\u0000strictfp() && i != class_47514.\u0000strictfp()) {
                                    if (!arrstring[2696 & 1292].equals("hollow")) continue;
                                    class_283.Method_462(class_47515, Class_9265.Field_9351.Method_3293(), -7929 & 586);
                                    object.add(class_47515);
                                    continue;
                                }
                            }
                            if ((object2 = class_283.Method_429(class_47515)) != null) {
                                if (object2 instanceof Class_4961) {
                                    ((Class_4961)object2).Method_4974();
                                }
                                class_283.Method_462(class_47515, Class_9265.Field_9412.Method_3293(), class_3238 == Class_9265.Field_9412 ? 34 & -21734 : 8221 & 4708);
                            }
                            if (!class_283.Method_462(class_47515, class_3436 = class_3238.Method_3342(n3), 8806 & -28533)) continue;
                            object.add(class_47515);
                            ++n;
                            if (n2 == 0 || (class_4879 = class_283.Method_429(class_47515)) == null) continue;
                            class_1699.Method_1739("x", class_47515.\u0000= final());
                            class_1699.Method_1739("y", class_47515.\u0000, `());
                            class_1699.Method_1739("z", class_47515.\u0000strictfp());
                            class_4879.Method_4911(class_1699);
                        }
                    }
                }
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    Class_4751 class_47516 = (Class_4751)iterator.next();
                    Class_3238 class_32382 = class_283.Method_375(class_47516).Method_3442();
                    class_283.Method_457(class_47516, class_32382);
                }
                if (n <= 0) {
                    throw new Class_30034("commands.fill.failed", new Object[120 & 31361]);
                }
                break block24;
            }
            throw new Class_30034("commands.fill.outOfWorld", new Object[140 & 5378]);
        }
        class_1367.Method_1374(Class_26261.Field_26265, n);
        Object[] arrobject = new Object[2217 & -32687];
        arrobject[-32382 & 30209] = n;
        Class_36913.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.fill.success", (Object[])arrobject);
    }

    public List Method_36917(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length > 0 && arrstring.length <= (67 & -32509)) {
            list = Class_36913.\u0000strictfp((String[])arrstring, (int)(-32554 & 21280), (Class_4751)class_4751);
        } else if (arrstring.length > (5187 & 291) && arrstring.length <= (14375 & 6)) {
            list = Class_36913.\u0000strictfp((String[])arrstring, (int)(11287 & -28285), (Class_4751)class_4751);
        } else if (arrstring.length == (7175 & 24591)) {
            list = Class_36913.\u0000strictfp((String[])arrstring, (Collection)Class_3238.Field_3271.\u0000strictfp());
        } else if (arrstring.length == (26713 & 781)) {
            String[] arrstring2 = new String[3077 & 16405];
            arrstring2[31744 & 131] = "replace";
            arrstring2[193 & 7737] = "destroy";
            arrstring2[28674 & 150] = "keep";
            arrstring2[-23789 & 75] = "hollow";
            arrstring2[8197 & 1054] = "outline";
            list = Class_36913.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = arrstring.length == (6250 & -31990) && "replace".equals(arrstring[264 & 12]) ? Class_36913.\u0000strictfp((String[])arrstring, (Collection)Class_3238.Field_3271.\u0000strictfp()) : null;
        }
        return list;
    }

    public int Method_36918() {
        return 3859 & 8202;
    }

    public String Method_36919(Class_1367 class_1367) {
        return "commands.fill.usage";
    }
}

