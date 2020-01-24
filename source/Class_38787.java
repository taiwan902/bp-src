/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import net.minecraft.world.NextTickListEntry;

public class Class_38787
extends Class_36787 {
    public List Method_38788(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length > 0 && arrstring.length <= (-32569 & 779)) {
            list = Class_38787.\u0000strictfp((String[])arrstring, (int)(552 & 4288), (Class_4751)class_4751);
        } else if (arrstring.length > (13955 & 75) && arrstring.length <= (12935 & 17510)) {
            list = Class_38787.\u0000strictfp((String[])arrstring, (int)(-31589 & 7), (Class_4751)class_4751);
        } else if (arrstring.length > (23631 & 22) && arrstring.length <= (41 & -12775)) {
            list = Class_38787.\u0000strictfp((String[])arrstring, (int)(518 & 20726), (Class_4751)class_4751);
        } else if (arrstring.length == (17418 & 10922)) {
            String[] arrstring2 = new String[-24445 & 4171];
            arrstring2[8264 & -27644] = "replace";
            arrstring2[7849 & 259] = "masked";
            arrstring2[4135 & 1026] = "filtered";
            list = Class_38787.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else if (arrstring.length == (12683 & 3115)) {
            String[] arrstring3 = new String[-32741 & 19335];
            arrstring3[18756 & 25] = "normal";
            arrstring3[16409 & -26107] = "force";
            arrstring3[18971 & 8454] = "move";
            list = Class_38787.\u0000strictfp((String[])arrstring, (String[])arrstring3);
        } else {
            list = arrstring.length == (8270 & 20765) && "filtered".equals(arrstring[22041 & 11]) ? Class_38787.\u0000strictfp((String[])arrstring, (Collection)Class_3238.Field_3271.\u0000strictfp()) : null;
        }
        return list;
    }

    public String Method_38789() {
        return "clone";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Method_38790(Class_1367 class_1367, String[] arrstring) {
        Iterator iterator2;
        Object object;
        Object object2;
        Object object3;
        if (arrstring.length < (5273 & 2573)) {
            throw new Class_34974("commands.clone.usage", new Object[8488 & 23056]);
        }
        class_1367.Method_1374(Class_26261.Field_26265, 6400 & -24488);
        Class_4751 class_4751 = Class_38787.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(8196 & -30405), (20758 & 552) != 0);
        Class_4751 class_47512 = Class_38787.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(18003 & -24445), (264 & 17536) != 0);
        Class_4751 class_47513 = Class_38787.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(21174 & 9230), (20328 & 8196) != 0);
        Class_42666 class_42666 = new Class_42666(class_4751, class_47512);
        Class_42666 class_426662 = new Class_42666(class_47513, class_47513.Method_4790(class_42666.Method_42675()));
        int n = class_42666.Method_42687() * class_42666.Method_42686() * class_42666.Method_42676();
        if (n > (-980384928 & 273330186)) {
            Object[] arrobject = new Object[566 & 8451];
            arrobject[2169 & -11132] = n;
            arrobject[1105 & 8227] = 1763803238 & 34917504;
            throw new Class_30034("commands.clone.tooManyBlocks", arrobject);
        }
        int n2 = 16770 & 4104;
        Class_3238 class_3238 = null;
        int n3 = -1 & -1;
        if ((arrstring.length < (9183 & -10229) || !arrstring[27035 & 5194].equals("force") && !arrstring[-22438 & 21258].equals("move")) && class_42666.Method_42680(class_426662)) {
            throw new Class_30034("commands.clone.noOverlap", new Object[70 & 16]);
        }
        if (arrstring.length >= (4171 & 523) && arrstring[-28037 & 26634].equals("move")) {
            n2 = 18671 & 769;
        }
        if (class_42666.Field_42672 < 0 || class_42666.Field_42671 >= (3888 & -32436) || class_426662.Field_42672 < 0 || class_426662.Field_42671 >= (1419 & -9376)) throw new Class_30034("commands.clone.outOfWorld", new Object[4144 & 968]);
        Class_283 class_283 = class_1367.Method_1375();
        if (!class_283.Method_430(class_42666) || !class_283.Method_430(class_426662)) throw new Class_30034("commands.clone.outOfWorld", new Object[104 & 25748]);
        int n4 = 14976 & -15291;
        if (arrstring.length >= (12298 & 683)) {
            if (arrstring[137 & 9279].equals("masked")) {
                n4 = -31997 & 11333;
            } else if (arrstring[-20583 & 20489].equals("filtered")) {
                if (arrstring.length < (9500 & 4620)) {
                    throw new Class_34974("commands.clone.usage", new Object[-24576 & 6502]);
                }
                class_3238 = Class_38787.\u0000strictfp((Class_1367)class_1367, (String)arrstring[331 & 9919]);
                if (arrstring.length >= (17037 & 9503)) {
                    n3 = Class_38787.\u0000strictfp((String)arrstring[8493 & 156], (int)(9024 & 23568), (int)(-32753 & 8287));
                }
            }
        }
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        LinkedList linkedList = Lists.newLinkedList();
        Class_4751 class_47514 = new Class_4751(class_426662.Field_42668 - class_42666.Field_42668, class_426662.Field_42672 - class_42666.Field_42672, class_426662.Field_42669 - class_42666.Field_42669);
        for (int i = class_42666.Field_42669; i <= class_42666.Field_42667; ++i) {
            for (int j = class_42666.Field_42672; j <= class_42666.Field_42671; ++j) {
                for (int k = class_42666.Field_42668; k <= class_42666.Field_42670; ++k) {
                    iterator2 = new Class_4751(k, j, i);
                    object = ((Class_4751)((Object)iterator2)).Method_4790(class_47514);
                    object2 = class_283.Method_375((Class_4751)((Object)iterator2));
                    if (n4 != 0 && object2.Method_3442() == Class_9265.Field_9351 || class_3238 != null && (object2.Method_3442() != class_3238 || n3 >= 0 && object2.Method_3442().Method_3434((Class_3436)object2) != n3)) continue;
                    Class_4879 class_4879 = class_283.Method_429((Class_4751)((Object)iterator2));
                    if (class_4879 != null) {
                        Class_1699 class_1699 = new Class_1699();
                        class_4879.Method_4929(class_1699);
                        arrayList2.add(new Class_22548((Class_4751)object, (Class_3436)object2, class_1699));
                        linkedList.addLast(iterator2);
                        continue;
                    }
                    if (!object2.Method_3442().Method_3381() && !object2.Method_3442().Method_3401()) {
                        arrayList3.add(new Class_22548((Class_4751)object, (Class_3436)object2, null));
                        linkedList.addFirst(iterator2);
                        continue;
                    }
                    arrayList.add(new Class_22548((Class_4751)object, (Class_3436)object2, null));
                    linkedList.addLast(iterator2);
                }
            }
        }
        if (n2 != 0) {
            for (Class_4751 class_47515 : linkedList) {
                object3 = class_283.Method_429(class_47515);
                if (object3 instanceof Class_4961) {
                    ((Class_4961)object3).Method_4974();
                }
                class_283.Method_462(class_47515, Class_9265.Field_9412.Method_3293(), -32762 & 6202);
            }
            for (Class_4751 class_47516 : linkedList) {
                class_283.Method_462(class_47516, Class_9265.Field_9351.Method_3293(), 16523 & -27117);
            }
        }
        ArrayList arrayList4 = Lists.newArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        List list = Lists.reverse((List)arrayList4);
        for (Iterator iterator2 : list) {
            object = class_283.Method_429(((Class_22548)iterator2).Field_22550);
            if (object instanceof Class_4961) {
                ((Class_4961)object).Method_4974();
            }
            class_283.Method_462(((Class_22548)iterator2).Field_22550, Class_9265.Field_9412.Method_3293(), 8226 & 5123);
        }
        n = 4192 & -23024;
        for (Iterator iterator2 : arrayList4) {
            if (!class_283.Method_462(((Class_22548)iterator2).Field_22550, ((Class_22548)iterator2).Field_22549, -19702 & 2051)) continue;
            ++n;
        }
        for (Iterator iterator2 : arrayList2) {
            object = class_283.Method_429(((Class_22548)iterator2).Field_22550);
            if (((Class_22548)iterator2).Field_22551 != null && object != null) {
                ((Class_22548)iterator2).Field_22551.Method_1739("x", ((Class_22548)iterator2).Field_22550.\u0000= final());
                ((Class_22548)iterator2).Field_22551.Method_1739("y", ((Class_22548)iterator2).Field_22550.\u0000, `());
                ((Class_22548)iterator2).Field_22551.Method_1739("z", ((Class_22548)iterator2).Field_22550.\u0000strictfp());
                ((Class_4879)object).Method_4911(((Class_22548)iterator2).Field_22551);
                ((Class_4879)object).Method_4922();
            }
            class_283.Method_462(((Class_22548)iterator2).Field_22550, ((Class_22548)iterator2).Field_22549, 4226 & -15350);
        }
        for (Iterator iterator2 : list) {
            class_283.Method_457(((Class_22548)iterator2).Field_22550, ((Class_22548)iterator2).Field_22549.Method_3442());
        }
        object3 = class_283.Method_486(class_42666, (-31615 & 2676) != 0);
        if (object3 != null) {
            iterator2 = object3.iterator();
            while (iterator2.hasNext()) {
                object = (NextTickListEntry)iterator2.next();
                if (!class_42666.Method_42683(((NextTickListEntry)object).position)) continue;
                object2 = ((NextTickListEntry)object).position.Method_4790(class_47514);
                class_283.Method_342((Class_4751)object2, ((NextTickListEntry)object).getBlock(), (int)(((NextTickListEntry)object).scheduledTime - class_283.Method_386().Method_31812()), ((NextTickListEntry)object).priority);
            }
        }
        if (n <= 0) {
            throw new Class_30034("commands.clone.failed", new Object[-32765 & 23864]);
        }
        class_1367.Method_1374(Class_26261.Field_26265, n);
        Object[] arrobject = new Object[12449 & 19203];
        arrobject[522 & 20480] = n;
        Class_38787.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.clone.success", (Object[])arrobject);
    }

    public String Method_38791(Class_1367 class_1367) {
        return "commands.clone.usage";
    }

    public int Method_38792() {
        return 9226 & -15769;
    }

    private void Method_38793() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

