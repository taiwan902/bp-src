/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Class_39347
extends Class_36787 {
    private void Method_39348() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_39349(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length > 0 && arrstring.length <= (3595 & 20611)) {
            list = Class_39347.\u0000strictfp((String[])arrstring, (int)(17412 & 851), (Class_4751)class_4751);
        } else if (arrstring.length == (4100 & 1213)) {
            list = Class_39347.\u0000strictfp((String[])arrstring, (Collection)Class_3238.Field_3271.\u0000strictfp());
        } else if (arrstring.length == (4103 & 11622)) {
            String[] arrstring2 = new String[-12093 & 9771];
            arrstring2[88 & 2562] = "replace";
            arrstring2[-8175 & 835] = "destroy";
            arrstring2[519 & -31278] = "keep";
            list = Class_39347.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }

    public void Method_39350(Class_1367 class_1367, String[] arrstring) {
        Class_3436 class_3436;
        Class_283 class_283;
        Object object;
        Class_4879 class_4879;
        if (arrstring.length < (20758 & 516)) {
            throw new Class_34974("commands.setblock.usage", new Object[12289 & -31424]);
        }
        class_1367.Method_1374(Class_26261.Field_26265, 2 & 216);
        Class_4751 class_4751 = Class_39347.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(0 & 1288), (17505 & -28144) != 0);
        Class_3238 class_3238 = Class_36787.Method_36804(class_1367, arrstring[8451 & 1095]);
        int n = 1 & 18432;
        if (arrstring.length >= (1095 & -26099)) {
            n = Class_39347.\u0000strictfp((String)arrstring[8196 & 6157], (int)(1032 & -26336), (int)(527 & 26095));
        }
        if (!(class_283 = class_1367.Method_1375()).Method_368(class_4751)) {
            throw new Class_30034("commands.setblock.outOfWorld", new Object[19266 & 16]);
        }
        Class_1699 class_1699 = new Class_1699();
        int n2 = 1288 & 20546;
        if (arrstring.length >= (1031 & 20743) && class_3238.Method_3339()) {
            object = Class_39347.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(150 & -24529)).Method_1788();
            try {
                class_1699 = Class_10981.Method_10996((String)object);
                n2 = 1029 & -32511;
            }
            catch (Class_34310 class_34310) {
                Object[] arrobject = new Object[8197 & -27853];
                arrobject[5700 & -32462] = class_34310.getMessage();
                throw new Class_30034("commands.setblock.tagError", arrobject);
            }
        }
        if (arrstring.length >= (18774 & 550)) {
            if (arrstring[525 & -28347].equals("destroy")) {
                class_283.Method_541(class_4751, (21521 & -30461) != 0);
                if (class_3238 == Class_9265.Field_9351) {
                    Class_39347.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.setblock.success", (Object[])new Object[-32256 & 10249]);
                    return;
                }
            } else if (arrstring[2749 & 7].equals("keep") && !class_283.Method_507(class_4751)) {
                throw new Class_30034("commands.setblock.noChange", new Object[16441 & 0]);
            }
        }
        if ((object = class_283.Method_429(class_4751)) != null) {
            if (object instanceof Class_4961) {
                ((Class_4961)object).Method_4974();
            }
            class_283.Method_462(class_4751, Class_9265.Field_9351.Method_3293(), class_3238 == Class_9265.Field_9351 ? -32766 & 17158 : 9540 & 16908);
        }
        if (!class_283.Method_462(class_4751, class_3436 = class_3238.Method_3342(n), 2694 & -32742)) {
            throw new Class_30034("commands.setblock.noChange", new Object[-29513 & 12352]);
        }
        if (n2 != 0 && (class_4879 = class_283.Method_429(class_4751)) != null) {
            class_1699.Method_1739("x", class_4751.\u0000= final());
            class_1699.Method_1739("y", class_4751.\u0000, `());
            class_1699.Method_1739("z", class_4751.\u0000strictfp());
            class_4879.Method_4911(class_1699);
        }
        class_283.Method_457(class_4751, class_3436.Method_3442());
        class_1367.Method_1374(Class_26261.Field_26265, 833 & 20537);
        Class_39347.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.setblock.success", (Object[])new Object[2568 & -2784]);
    }

    public int Method_39351() {
        return 11138 & 1042;
    }

    public String Method_39352(Class_1367 class_1367) {
        return "commands.setblock.usage";
    }

    public String Method_39353() {
        return "setblock";
    }
}

