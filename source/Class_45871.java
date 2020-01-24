/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Class_45871
extends Class_36787 {
    private void Method_45872() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_45873(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length > 0 && arrstring.length <= (419 & 22535) ? Class_45871.\u0000strictfp((String[])arrstring, (int)(328 & -18939), (Class_4751)class_4751) : (arrstring.length == (4156 & 900) ? Class_45871.\u0000strictfp((String[])arrstring, (Collection)Class_3238.Field_3271.\u0000strictfp()) : null);
    }

    public String Method_45874(Class_1367 class_1367) {
        return "commands.testforblock.usage";
    }

    public String Method_45875() {
        return "testforblock";
    }

    public int Method_45876() {
        return 16674 & 514;
    }

    public void Method_45877(Class_1367 class_1367, String[] arrstring) {
        Class_3238 class_3238;
        int n;
        Class_283 class_283;
        Object object;
        if (arrstring.length < (18436 & 13412)) {
            throw new Class_34974("commands.testforblock.usage", new Object[12856 & 256]);
        }
        class_1367.Method_1374(Class_26261.Field_26265, 15506 & 876);
        Class_4751 class_4751 = Class_45871.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(5154 & 449), (-11192 & 160) != 0);
        Class_3238 class_32382 = Class_3238.Method_3341(arrstring[1411 & -18409]);
        if (class_32382 == null) {
            Object[] arrobject = new Object[6405 & 65];
            arrobject[17408 & -24384] = arrstring[2231 & -19453];
            throw new Class_30032("commands.setblock.notFound", arrobject);
        }
        int n2 = -1 & -1;
        if (arrstring.length >= (-15195 & 6485)) {
            n2 = Class_45871.\u0000strictfp((String)arrstring[8524 & -31180], (int)(-1 & -1), (int)(1071 & 10831));
        }
        if (!(class_283 = class_1367.Method_1375()).Method_368(class_4751)) {
            throw new Class_30034("commands.testforblock.outOfWorld", new Object[4 & -28272]);
        }
        Class_1699 class_1699 = new Class_1699();
        int n3 = 5393 & 576;
        if (arrstring.length >= (2326 & -32761) && class_32382.Method_3339()) {
            object = Class_45871.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(2341 & 1031)).Method_1788();
            try {
                class_1699 = Class_10981.Method_10996((String)object);
                n3 = 393 & 629;
            }
            catch (Class_34310 class_34310) {
                Object[] arrobject = new Object[16825 & -23039];
                arrobject[783 & 10384] = class_34310.getMessage();
                throw new Class_30034("commands.setblock.tagError", arrobject);
            }
        }
        if ((class_3238 = (object = class_283.Method_375(class_4751)).Method_3442()) != class_32382) {
            Object[] arrobject = new Object[117 & -17019];
            arrobject[1089 & -11904] = class_4751.\u0000= final();
            arrobject[19221 & 1035] = class_4751.\u0000, `();
            arrobject[21506 & 7] = class_4751.\u0000strictfp();
            arrobject[17299 & 3171] = class_3238.Method_3380();
            arrobject[9092 & 17444] = class_32382.Method_3380();
            throw new Class_30034("commands.testforblock.failed.tile", arrobject);
        }
        if (n2 > (-1 & -1) && (n = object.Method_3442().Method_3434((Class_3436)object)) != n2) {
            Object[] arrobject = new Object[8333 & 3111];
            arrobject[1 & 17036] = class_4751.\u0000= final();
            arrobject[16385 & -18431] = class_4751.\u0000, `();
            arrobject[9483 & 518] = class_4751.\u0000strictfp();
            arrobject[239 & 8707] = n;
            arrobject[1060 & -30204] = n2;
            throw new Class_30034("commands.testforblock.failed.data", arrobject);
        }
        if (n3 != 0) {
            Class_4879 class_4879 = class_283.Method_429(class_4751);
            if (class_4879 == null) {
                Object[] arrobject = new Object[3143 & 16659];
                arrobject[10242 & -31156] = class_4751.\u0000= final();
                arrobject[641 & -32735] = class_4751.\u0000, `();
                arrobject[319 & 1026] = class_4751.\u0000strictfp();
                throw new Class_30034("commands.testforblock.failed.tileEntity", arrobject);
            }
            Class_1699 class_16992 = new Class_1699();
            class_4879.Method_4929(class_16992);
            if (!Class_25852.Method_25854(class_1699, class_16992, (1063 & -18279) != 0)) {
                Object[] arrobject = new Object[-28153 & 17539];
                arrobject[-32511 & 2154] = class_4751.\u0000= final();
                arrobject[-32767 & 27025] = class_4751.\u0000, `();
                arrobject[10275 & -12206] = class_4751.\u0000strictfp();
                throw new Class_30034("commands.testforblock.failed.nbt", arrobject);
            }
        }
        class_1367.Method_1374(Class_26261.Field_26265, 20491 & -31871);
        Object[] arrobject = new Object[2051 & -24053];
        arrobject[536 & 10369] = class_4751.\u0000= final();
        arrobject[4617 & 1281] = class_4751.\u0000, `();
        arrobject[-30706 & 17411] = class_4751.\u0000strictfp();
        Class_45871.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.testforblock.success", (Object[])arrobject);
    }
}

