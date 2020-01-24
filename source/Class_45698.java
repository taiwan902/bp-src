/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_45698
extends Class_36787 {
    public int Method_45699() {
        return 11407 & 16387;
    }

    public String Method_45700() {
        return "pardon-ip";
    }

    public boolean Method_45701(Class_1367 class_1367) {
        return (Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp() && super.Method_36796(class_1367) ? 3081 & 421 : -32508 & 18560) != 0;
    }

    public void Method_45702(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length == (-5463 & 4101) && arrstring[1157 & 19232].length() > (16965 & 6403)) {
            Matcher matcher = Class_38589.Field_38590.matcher(arrstring[4096 & 8223]);
            if (!matcher.matches()) {
                throw new Class_32994("commands.unbanip.invalid", new Object[4140 & -22446]);
            }
        } else {
            throw new Class_34974("commands.unbanip.usage", new Object[16516 & 34]);
        }
        Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp((Object)arrstring[-24282 & 21512]);
        Object[] arrobject = new Object[-14319 & 1281];
        arrobject[16 & -10079] = arrstring[-14071 & 1664];
        Class_45698.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.unbanip.success", (Object[])arrobject);
    }

    private void Method_45703() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_45704(Class_1367 class_1367) {
        return "commands.unbanip.usage";
    }

    public List Method_45705(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (24577 & 385) ? Class_45698.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp()) : null;
    }
}

