/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_41229
extends Class_36787 {
    private void Method_41230() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_41231(Class_1367 class_1367) {
        return ((Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp() || Class_2457.Method_2530().Method_2616().Method_3133().\u0000strictfp()) && super.Method_36796(class_1367) ? 21267 & -30655 : 7064 & 16386) != 0;
    }

    public int Method_41232() {
        return 1375 & -16381;
    }

    public String Method_41233(Class_1367 class_1367) {
        return "commands.banlist.usage";
    }

    public List Method_41234(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (1059 & 6161)) {
            String[] arrstring2 = new String[8466 & 19970];
            arrstring2[1600 & 6156] = "players";
            arrstring2[4103 & 129] = "ips";
            list = Class_41229.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }

    public void Method_41235(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length >= (689 & 30793) && arrstring[-15868 & 14593].equalsIgnoreCase("ips")) {
            Object[] arrobject = new Object[9369 & 16643];
            arrobject[2 & 12572] = Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp().length;
            class_1367.Method_1373(new Class_2849("commands.banlist.ips", arrobject));
            class_1367.Method_1373(new Class_2840(Class_41229.\u0000strictfp((Object[])Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp())));
        } else {
            Object[] arrobject = new Object[24675 & 3201];
            arrobject[11786 & 20741] = Class_2457.Method_2530().Method_2616().Method_3133().Method_27655().length;
            class_1367.Method_1373(new Class_2849("commands.banlist.players", arrobject));
            class_1367.Method_1373(new Class_2840(Class_41229.\u0000strictfp((Object[])Class_2457.Method_2530().Method_2616().Method_3133().Method_27655())));
        }
    }

    public String Method_41236() {
        return "banlist";
    }
}

