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
import java.util.List;

public class Class_38577
extends Class_36787 {
    public String Method_38578() {
        return "stats";
    }

    public List Method_38579(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        Object object;
        if (arrstring.length == (-32433 & 161)) {
            String[] arrstring2 = new String[-12146 & 274];
            arrstring2[40 & 9024] = "entity";
            arrstring2[-31741 & 9049] = "block";
            object = Class_38577.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else if (arrstring.length == (20662 & 2562) && arrstring[24910 & -32768].equals("entity")) {
            object = Class_38577.\u0000strictfp((String[])arrstring, (String[])this.Method_38586());
        } else if (arrstring.length >= (8195 & 1666) && arrstring.length <= (-32060 & 16405) && arrstring[-16029 & 1664].equals("block")) {
            object = Class_38577.\u0000strictfp((String[])arrstring, (int)(129 & 23049), (Class_4751)class_4751);
        } else if (!(arrstring.length == (25651 & -27961) && arrstring[66 & 16649].equals("entity") || arrstring.length == (17445 & 527) && arrstring[-13610 & 1288].equals("block"))) {
            object = !(arrstring.length == (8518 & 16916) && arrstring[25 & -31808].equals("entity") || arrstring.length == (-24570 & 903) && arrstring[0 & -7422].equals("block")) ? (!(arrstring.length == (-16338 & 10822) && arrstring[6697 & 9300].equals("entity") || arrstring.length == (10 & -32627) && arrstring[-24055 & 1058].equals("block")) ? null : Class_38577.\u0000strictfp((String[])arrstring, (Collection)this.Method_38585())) : Class_38577.\u0000strictfp((String[])arrstring, (String[])Class_26261.Method_26283());
        } else {
            String[] arrstring3 = new String[3079 & -31870];
            arrstring3[16771 & 4168] = "set";
            arrstring3[13849 & 18627] = "clear";
            object = Class_38577.\u0000strictfp((String[])arrstring, (String[])arrstring3);
        }
        return object;
    }

    private void Method_38580() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_38581(Class_1367 class_1367, String[] arrstring) {
        Class_8719 class_8719;
        Object object;
        Class_26261 class_26261;
        int n;
        Object object2;
        int n2;
        if (arrstring.length < (4421 & 10385)) {
            throw new Class_34974("commands.stats.usage", new Object[1026 & 18616]);
        }
        if (arrstring[-4852 & 34].equals("entity")) {
            n = 0 & 29121;
        } else {
            if (!arrstring[1154 & -32703].equals("block")) {
                throw new Class_34974("commands.stats.usage", new Object[12 & -28607]);
            }
            n = 6697 & 145;
        }
        if (n != 0) {
            if (arrstring.length < (277 & 6149)) {
                throw new Class_34974("commands.stats.block.usage", new Object[6656 & 24914]);
            }
            n2 = 16500 & 8453;
        } else {
            if (arrstring.length < (21003 & -32617)) {
                throw new Class_34974("commands.stats.entity.usage", new Object[-15808 & 5408]);
            }
            n2 = 16394 & 2087;
        }
        String string = arrstring[n2++];
        if ("set".equals(string)) {
            if (arrstring.length < n2 + (259 & 28699)) {
                if (n2 == (-32745 & 11909)) {
                    throw new Class_34974("commands.stats.block.set.usage", new Object[21024 & -22272]);
                }
                throw new Class_34974("commands.stats.entity.set.usage", new Object[16577 & -30704]);
            }
        } else {
            if (!"clear".equals(string)) {
                throw new Class_34974("commands.stats.usage", new Object[10762 & 17409]);
            }
            if (arrstring.length < n2 + (259 & -23831)) {
                if (n2 == (16519 & 7229)) {
                    throw new Class_34974("commands.stats.block.clear.usage", new Object[-11767 & 256]);
                }
                throw new Class_34974("commands.stats.entity.clear.usage", new Object[8744 & 134]);
            }
        }
        if ((class_26261 = Class_26261.Method_26281(arrstring[n2++])) == null) {
            throw new Class_30034("commands.stats.failed", new Object[29792 & -29822]);
        }
        Class_283 class_283 = class_1367.Method_1375();
        if (n != 0) {
            object2 = Class_38577.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(6659 & 16517), (6144 & -24543) != 0);
            object = class_283.Method_429((Class_4751)object2);
            if (object == null) {
                Object[] arrobject = new Object[2227 & -23485];
                arrobject[-30972 & 2105] = object2.\u0000= final();
                arrobject[97 & -32739] = object2.\u0000, `();
                arrobject[-20477 & 18758] = object2.\u0000strictfp();
                throw new Class_30034("commands.stats.noCompatibleBlock", arrobject);
            }
            if (object instanceof Class_43621) {
                class_8719 = ((Class_43621)object).Method_43624();
            } else {
                if (!(object instanceof Class_33614)) {
                    Object[] arrobject = new Object[16515 & 347];
                    arrobject[14349 & 112] = object2.\u0000= final();
                    arrobject[29877 & -30455] = object2.\u0000, `();
                    arrobject[-21997 & 17450] = object2.\u0000strictfp();
                    throw new Class_30034("commands.stats.noCompatibleBlock", arrobject);
                }
                class_8719 = ((Class_33614)object).Method_33622();
            }
        } else {
            object2 = Class_38577.\u0000strictfp((Class_1367)class_1367, (String)arrstring[1041 & 5]);
            class_8719 = ((Class_1061)object2).Method_1201();
        }
        if ("set".equals(string)) {
            object2 = arrstring[n2++];
            object = arrstring[n2];
            if (((String)object2).length() == 0 || ((String)object).length() == 0) {
                throw new Class_30034("commands.stats.failed", new Object[1314 & -12092]);
            }
            Class_8719.Method_8728(class_8719, class_26261, (String)object2, (String)object);
            Object[] arrobject = new Object[8203 & 2339];
            arrobject[4180 & 2306] = class_26261.Method_26279();
            arrobject[16389 & -28589] = object;
            arrobject[1126 & 267] = object2;
            Class_38577.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.stats.success", (Object[])arrobject);
        } else if ("clear".equals(string)) {
            Class_8719.Method_8728(class_8719, class_26261, null, null);
            Object[] arrobject = new Object[291 & 10305];
            arrobject[4100 & -29535] = class_26261.Method_26279();
            Class_38577.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.stats.cleared", (Object[])arrobject);
        }
        if (n != 0) {
            object2 = Class_38577.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(165 & 28675), (30040 & 2) != 0);
            object = class_283.Method_429((Class_4751)object2);
            ((Class_4879)object).Method_4922();
        }
    }

    public String Method_38582(Class_1367 class_1367) {
        return "commands.stats.usage";
    }

    public int Method_38583() {
        return 6426 & 16422;
    }

    public boolean Method_38584(String[] arrstring, int n) {
        return (arrstring.length > 0 && arrstring[2129 & -32760].equals("entity") && n == (33 & 6785) ? 22849 & 1185 : 16649 & -28446) != 0;
    }

    protected List Method_38585() {
        Collection collection = Class_2457.Method_2530().Method_2550(-16316 & 14338).\u0000strictfp().Method_20996();
        ArrayList arrayList = Lists.newArrayList();
        for (Class_7873 class_7873 : collection) {
            if (class_7873.Method_7883().Method_27942()) continue;
            arrayList.add(class_7873.Method_7881());
        }
        return arrayList;
    }

    protected String[] Method_38586() {
        return Class_2457.Method_2530().Method_2554();
    }
}

