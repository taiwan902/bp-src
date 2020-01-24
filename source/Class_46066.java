/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Class_46066
extends Class_36787 {
    public List Method_46067(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (8449 & 4097) ? Class_46066.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : (arrstring.length > (-31639 & 145) && arrstring.length <= (21636 & 2110) ? Class_46066.\u0000strictfp((String[])arrstring, (int)(-32503 & 1057), (Class_4751)class_4751) : (arrstring.length > (-30683 & 199) && arrstring.length <= (-11877 & 8200) && "detect".equals(arrstring[4180 & -23772]) ? Class_46066.\u0000strictfp((String[])arrstring, (int)(4653 & 2135), (Class_4751)class_4751) : (arrstring.length == (26779 & 5673) && "detect".equals(arrstring[92 & 21668]) ? Class_46066.\u0000strictfp((String[])arrstring, (Collection)Class_3238.Field_3271.\u0000strictfp()) : null)));
    }

    public int Method_46068() {
        return -32534 & 16658;
    }

    public String Method_46069(Class_1367 class_1367) {
        return "commands.execute.usage";
    }

    public boolean Method_46070(String[] arrstring, int n) {
        return (n == 0 ? 1153 & 2067 : 16441 & -32126) != 0;
    }

    public void Method_46071(Class_1367 class_1367, String[] arrstring) {
        Object object;
        if (arrstring.length < (24869 & 3205)) {
            throw new Class_34974("commands.execute.usage", new Object[23968 & 8786]);
        }
        Class_1061 class_1061 = Class_46066.\u0000strictfp((Class_1367)class_1367, (String)arrstring[4706 & -32635], Class_1061.class);
        double d = Class_46066.\u0000strictfp((double)class_1061.Field_1130, (String)arrstring[-10167 & 1187], (128 & 1580) != 0);
        double d2 = Class_46066.\u0000strictfp((double)class_1061.Method_1324(), (String)arrstring[-32122 & 24875], (9614 & 20561) != 0);
        double d3 = Class_46066.\u0000strictfp((double)class_1061.Field_1106, (String)arrstring[-22965 & 135], (22672 & 520) != 0);
        Class_4751 class_4751 = new Class_4751(d, d2, d3);
        int n = 10276 & -32755;
        if ("detect".equals(arrstring[4100 & 11526]) && arrstring.length > (5198 & 10)) {
            object = class_1061.Method_1178();
            double d4 = Class_46066.\u0000strictfp((double)d, (String)arrstring[7989 & -32691], (4224 & -24288) != 0);
            double d5 = Class_46066.\u0000strictfp((double)d2, (String)arrstring[86 & -31066], (674 & -14060) != 0);
            double d6 = Class_46066.\u0000strictfp((double)d3, (String)arrstring[-32761 & 12559], (8212 & 16456) != 0);
            Class_3238 class_3238 = Class_46066.\u0000strictfp((Class_1367)class_1367, (String)arrstring[-32552 & 16425]);
            int n2 = Class_46066.\u0000strictfp((String)arrstring[1033 & 12303], (int)(-1 & -1), (int)(1839 & 2063));
            Class_4751 class_47512 = new Class_4751(d4, d5, d6);
            Class_3436 class_3436 = ((Class_283)object).Method_375(class_47512);
            if (class_3436.Method_3442() != class_3238 || n2 >= 0 && class_3436.Method_3442().Method_3434(class_3436) != n2) {
                Object[] arrobject = new Object[-24477 & 18822];
                arrobject[13398 & -32760] = "detect";
                arrobject[9125 & 16385] = class_1061.Method_1202();
                throw new Class_30034("commands.execute.failed", arrobject);
            }
            n = 4970 & -32626;
        }
        object = Class_46066.\u0000strictfp((String[])arrstring, (int)n);
        Class_37091 class_37091 = new Class_37091(this, class_1061, class_1367, class_4751, d, d2, d3);
        Class_2754 class_2754 = Class_2457.Method_2530().Method_2553();
        try {
            int n3 = class_2754.Method_2756(class_37091, (String)object);
            if (n3 < (161 & 20997)) {
                Object[] arrobject = new Object[-11699 & 11665];
                arrobject[-20412 & 416] = object;
                throw new Class_30034("commands.execute.allInvocationsFailed", arrobject);
            }
        }
        catch (Throwable throwable) {
            Object[] arrobject = new Object[2882 & 1027];
            arrobject[-24384 & 1] = object;
            arrobject[-13759 & 389] = class_1061.Method_1202();
            throw new Class_30034("commands.execute.failed", arrobject);
        }
    }

    public String Method_46072() {
        return "execute";
    }

    private void Method_46073() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

