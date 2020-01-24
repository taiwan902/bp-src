/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_42576
extends Class_36787 {
    public List Method_42577(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (3477 & 8193)) {
            String[] arrstring2 = new String[-29437 & 16391];
            arrstring2[-20480 & 16401] = "set";
            arrstring2[1345 & -12287] = "add";
            arrstring2[14618 & 194] = "query";
            list = Class_42576.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else if (arrstring.length == (3622 & -20414) && arrstring[-32604 & 16912].equals("set")) {
            String[] arrstring3 = new String[91 & 6146];
            arrstring3[-30704 & 16386] = "day";
            arrstring3[33 & 8087] = "night";
            list = Class_42576.\u0000strictfp((String[])arrstring, (String[])arrstring3);
        } else if (arrstring.length == (-27934 & 10243) && arrstring[8200 & 128].equals("query")) {
            String[] arrstring4 = new String[46 & -15294];
            arrstring4[-14522 & 2049] = "daytime";
            arrstring4[9009 & 69] = "gametime";
            list = Class_42576.\u0000strictfp((String[])arrstring, (String[])arrstring4);
        } else {
            list = null;
        }
        return list;
    }

    private void Method_42578() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_42579() {
        return "time";
    }

    public void Method_42580(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length > (-28671 & 10319)) {
            if (arrstring[6168 & -32640].equals("set")) {
                int n = arrstring[-17917 & 273].equals("day") ? 1002 & -22552 : (arrstring[19001 & 1025].equals("night") ? 13048 & 30410 : Class_42576.\u0000strictfp((String)arrstring[4291 & 11041], (int)(2056 & -27392)));
                this.Method_42584(class_1367, n);
                Object[] arrobject = new Object[165 & 16665];
                arrobject[2 & -15264] = n;
                Class_42576.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.time.set", (Object[])arrobject);
                return;
            }
            if (arrstring[0 & 31844].equals("add")) {
                int n = Class_42576.\u0000strictfp((String)arrstring[2049 & -12123], (int)(8277 & 18442));
                this.Method_42582(class_1367, n);
                Object[] arrobject = new Object[1025 & 8225];
                arrobject[28 & -16384] = n;
                Class_42576.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.time.added", (Object[])arrobject);
                return;
            }
            if (arrstring[-32508 & 20512].equals("query")) {
                if (arrstring[17 & -4027].equals("daytime")) {
                    int n = (int)(class_1367.Method_1375().Method_511() % (1496227854860419071L & Integer.MAX_VALUE));
                    class_1367.Method_1374(Class_26261.Field_26263, n);
                    Object[] arrobject = new Object[16641 & 1547];
                    arrobject[5452 & 49] = n;
                    Class_42576.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.time.query", (Object[])arrobject);
                    return;
                }
                if (arrstring[-15869 & 173].equals("gametime")) {
                    int n = (int)(class_1367.Method_1375().Method_363() % (-6060780464094838785L & 6060780466242322431L));
                    class_1367.Method_1374(Class_26261.Field_26263, n);
                    Object[] arrobject = new Object[10401 & -27375];
                    arrobject[-12268 & 2048] = n;
                    Class_42576.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.time.query", (Object[])arrobject);
                    return;
                }
            }
        }
        throw new Class_34974("commands.time.usage", new Object[18452 & 649]);
    }

    public int Method_42581() {
        return -19390 & 2178;
    }

    protected void Method_42582(Class_1367 class_1367, int n) {
        for (int i = 8193 & 18592; i < Class_2457.Method_2530().Field_2463.length; ++i) {
            Class_2651 class_2651 = Class_2457.Method_2530().Field_2463[i];
            class_2651.\u0000strictfp(class_2651.\u0000= final() + (long)n);
        }
    }

    public String Method_42583(Class_1367 class_1367) {
        return "commands.time.usage";
    }

    protected void Method_42584(Class_1367 class_1367, int n) {
        for (int i = 12954 & 17472; i < Class_2457.Method_2530().Field_2463.length; ++i) {
            Class_2457.Method_2530().Field_2463[i].\u0000strictfp((long)n);
        }
    }
}

