/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_37179
extends Class_36787 {
    private void Method_37180() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_37181(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        if (arrstring.length == (561 & 9217)) {
            Set set = this.Method_37186().keySet();
            return Class_37179.\u0000strictfp((String[])arrstring, (String[])set.toArray(new String[set.size()]));
        }
        return null;
    }

    public List Method_37182() {
        String[] arrstring = new String[8457 & 2179];
        arrstring[2092 & 5328] = "?";
        return Arrays.asList(arrstring);
    }

    public String Method_37183(Class_1367 class_1367) {
        return "commands.help.usage";
    }

    public int Method_37184() {
        return 2274 & -11260;
    }

    public String Method_37185() {
        return "help";
    }

    protected Map Method_37186() {
        return Class_2457.Method_2530().Method_2553().Method_2758();
    }

    protected List Method_37187(Class_1367 class_1367) {
        List list = Class_2457.Method_2530().Method_2553().Method_2757(class_1367);
        Collections.sort(list);
        return list;
    }

    public void Method_37188(Class_1367 class_1367, String[] arrstring) {
        List list = this.Method_37187(class_1367);
        int n = 16487 & -25329;
        int n2 = (list.size() - (-23543 & 19)) / (-26073 & 399);
        int n3 = 9228 & 464;
        try {
            n3 = arrstring.length == 0 ? -30560 & 5136 : Class_37179.\u0000strictfp((String)arrstring[8513 & 6192], (int)(25345 & 2059), (int)(n2 + (809 & 28871))) - (14617 & 163);
        }
        catch (Class_30032 class_30032) {
            Map map = this.Method_37186();
            Class_26550 class_26550 = (Class_26550)map.get(arrstring[1089 & 30982]);
            if (class_26550 != null) {
                throw new Class_34974(class_26550.Method_26555(class_1367), new Object[-24575 & 6216]);
            }
            if (Class_13337.Method_13372(arrstring[3348 & 20608], -1 & -1) != (-1 & -1)) {
                throw class_30032;
            }
            throw new Class_34429();
        }
        int n4 = Math.min((n3 + (-19263 & 55)) * (29863 & -32505), list.size());
        Object[] arrobject = new Object[8706 & -32365];
        arrobject[2829 & 4272] = n3 + (18597 & 9297);
        arrobject[555 & 12357] = n2 + (-21495 & 16513);
        Class_2849 class_2849 = new Class_2849("commands.help.header", arrobject);
        class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5482);
        class_1367.Method_1373(class_2849);
        for (int i = n3 * (-31601 & 7); i < n4; ++i) {
            Class_26550 class_26550 = (Class_26550)list.get(i);
            Class_2849 class_28492 = new Class_2849(class_26550.Method_26555(class_1367), new Object[-28624 & 9472]);
            class_28492.\u0000strictfp().Method_2915(new Class_21230(Class_17245.Field_17253, "/" + class_26550.Method_26556() + " "));
            class_1367.Method_1373(class_28492);
        }
        if (n3 == 0 && class_1367 instanceof Class_626) {
            Class_2849 class_28493 = new Class_2849("commands.help.footer", new Object[-32432 & 8713]);
            class_28493.\u0000strictfp().Method_2917(Class_5478.Field_5497);
            class_1367.Method_1373(class_28493);
        }
    }
}

