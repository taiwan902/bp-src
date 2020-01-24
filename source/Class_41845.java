/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_41845
extends Class_36787 {
    public String Method_41846(Class_1367 class_1367) {
        return "commands.worldborder.usage";
    }

    public int Method_41847() {
        return 18 & 10414;
    }

    public List Method_41848(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (-28667 & 2273)) {
            String[] arrstring2 = new String[16391 & 8230];
            arrstring2[6400 & 16496] = "set";
            arrstring2[101 & 8329] = "center";
            arrstring2[4106 & -13994] = "damage";
            arrstring2[19079 & 51] = "warning";
            arrstring2[17766 & 2565] = "add";
            arrstring2[-28571 & 8709] = "get";
            list = Class_41845.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else if (arrstring.length == (4263 & -24574) && arrstring[17417 & 16].equals("damage")) {
            String[] arrstring3 = new String[4294 & 8219];
            arrstring3[576 & -32355] = "buffer";
            arrstring3[16931 & 397] = "amount";
            list = Class_41845.\u0000strictfp((String[])arrstring, (String[])arrstring3);
        } else if (arrstring.length >= (-12250 & 10258) && arrstring.length <= (2403 & -3965) && arrstring[-15104 & 12465].equals("center")) {
            list = Class_41845.\u0000, `((String[])arrstring, (int)(1379 & -28667), (Class_4751)class_4751);
        } else if (arrstring.length == (17410 & 13006) && arrstring[2336 & 8220].equals("warning")) {
            String[] arrstring4 = new String[66 & 8195];
            arrstring4[-32216 & 16514] = "time";
            arrstring4[25611 & 549] = "distance";
            list = Class_41845.\u0000strictfp((String[])arrstring, (String[])arrstring4);
        } else {
            list = null;
        }
        return list;
    }

    protected Class_31457 Method_41849() {
        return Class_2457.Method_2530().Field_2463[4288 & 8193].\u0000strictfp();
    }

    public String Method_41850() {
        return "worldborder";
    }

    public void Method_41851(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (-32751 & 26307)) {
            throw new Class_34974("commands.worldborder.usage", new Object[-32454 & 6273]);
        }
        Class_31457 class_31457 = this.Method_41849();
        if (arrstring[21530 & 2784].equals("set")) {
            long l;
            if (arrstring.length != (-32590 & 1282) && arrstring.length != (4167 & -30445)) {
                throw new Class_34974("commands.worldborder.set.usage", new Object[9221 & 20546]);
            }
            double d = class_31457.Method_31497();
            double d2 = Class_41845.\u0000strictfp((String)arrstring[7033 & 1], (double)1.0, (double)(2.64E9 * 0.022727272727272728));
            long l2 = l = arrstring.length > (774 & -26526) ? Class_41845.\u0000strictfp((String)arrstring[455 & 16938], (long)(1149239552L & 1704061L), (long)(7900421777738920959L & 9223372037673975L)) * (4552033248813384681L & -4552033249292868632L) : 33832997L & 1946227530L;
            if (l > (941515556396223315L & -941515557847170044L)) {
                class_31457.Method_31481(d, d2, l);
                if (d > d2) {
                    Object[] arrobject = new Object[3 & 7691];
                    Object[] arrobject2 = new Object[107 & 8705];
                    arrobject2[9254 & 18432] = d2;
                    arrobject[13313 & 16820] = String.format("%.1f", arrobject2);
                    Object[] arrobject3 = new Object[-31677 & 4229];
                    arrobject3[16465 & 2946] = d;
                    arrobject[2695 & -28671] = String.format("%.1f", arrobject3);
                    arrobject[1047 & 10434] = Long.toString(l / (-3859426867667006484L & 3859426866716887016L));
                    Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.setSlowly.shrink.success", (Object[])arrobject);
                } else {
                    Object[] arrobject = new Object[5459 & -30717];
                    Object[] arrobject4 = new Object[4169 & 145];
                    arrobject4[1156 & 6168] = d2;
                    arrobject[1034 & 4612] = String.format("%.1f", arrobject4);
                    Object[] arrobject5 = new Object[12435 & 18441];
                    arrobject5[789 & -20344] = d;
                    arrobject[517 & 16395] = String.format("%.1f", arrobject5);
                    arrobject[-4702 & 4106] = Long.toString(l / (1097342954L & 6952015265924269033L));
                    Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.setSlowly.grow.success", (Object[])arrobject);
                }
            } else {
                class_31457.Method_31501(d2);
                Object[] arrobject = new Object[3714 & 4163];
                Object[] arrobject6 = new Object[-28543 & 19577];
                arrobject6[144 & 13356] = d2;
                arrobject[4480 & 11288] = String.format("%.1f", arrobject6);
                Object[] arrobject7 = new Object[9089 & -32703];
                arrobject7[2504 & -24064] = d;
                arrobject[-32219 & 16723] = String.format("%.1f", arrobject7);
                Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.set.success", (Object[])arrobject);
            }
        } else if (arrstring[1160 & 15185].equals("add")) {
            if (arrstring.length != (2050 & -20458) && arrstring.length != (21891 & 8291)) {
                throw new Class_34974("commands.worldborder.add.usage", new Object[24840 & -25584]);
            }
            double d = class_31457.Method_31475();
            double d3 = d + Class_41845.\u0000strictfp((String)arrstring[-14799 & 12481], (double)(-d), (double)(1.411764705882353E7 * 4.25 - d));
            long l = class_31457.Method_31480() + (arrstring.length > (-32398 & 7691) ? Class_41845.\u0000strictfp((String)arrstring[18626 & -23782], (long)(1877191582306828548L & 537079827L), (long)(9223372037651447L & -6238939451034971137L)) * (-5943025138976816135L & 5943025137722599404L) : -7012043006341676924L & 7012043005326530057L);
            if (l > (-3640332906384063232L & 19005505L)) {
                class_31457.Method_31481(d, d3, l);
                if (d > d3) {
                    Object[] arrobject = new Object[4107 & -14137];
                    Object[] arrobject8 = new Object[7729 & 24839];
                    arrobject8[-28028 & 3130] = d3;
                    arrobject[644 & 18] = String.format("%.1f", arrobject8);
                    Object[] arrobject9 = new Object[527 & 18657];
                    arrobject9[834 & 23556] = d;
                    arrobject[1169 & -11511] = String.format("%.1f", arrobject9);
                    arrobject[25666 & 5046] = Long.toString(l / (71402472L & 1094194172L));
                    Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.setSlowly.shrink.success", (Object[])arrobject);
                } else {
                    Object[] arrobject = new Object[2059 & 13331];
                    Object[] arrobject10 = new Object[261 & -30695];
                    arrobject10[2568 & 417] = d3;
                    arrobject[8192 & -32606] = String.format("%.1f", arrobject10);
                    Object[] arrobject11 = new Object[2205 & 17697];
                    arrobject11[-29428 & 224] = d;
                    arrobject[13601 & 2715] = String.format("%.1f", arrobject11);
                    arrobject[-32762 & 2050] = Long.toString(l / (84417528L & 2595309470813873128L));
                    Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.setSlowly.grow.success", (Object[])arrobject);
                }
            } else {
                class_31457.Method_31501(d3);
                Object[] arrobject = new Object[4610 & 10403];
                Object[] arrobject12 = new Object[2087 & 641];
                arrobject12[1552 & 16556] = d3;
                arrobject[-31728 & 8962] = String.format("%.1f", arrobject12);
                Object[] arrobject13 = new Object[3137 & -24575];
                arrobject13[-24524 & 2433] = d;
                arrobject[16389 & 7235] = String.format("%.1f", arrobject13);
                Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.set.success", (Object[])arrobject);
            }
        } else if (arrstring[8240 & -16123].equals("center")) {
            if (arrstring.length != (20523 & 1555)) {
                throw new Class_34974("commands.worldborder.center.usage", new Object[3280 & 4104]);
            }
            Class_4751 class_4751 = class_1367.Method_1372();
            double d = Class_41845.\u0000strictfp((double)((double)class_4751.\u0000= final() + 0.4230769230769231 * 1.1818181818181819), (String)arrstring[4097 & -15223], (-18811 & 16435) != 0);
            double d4 = Class_41845.\u0000strictfp((double)((double)class_4751.\u0000strictfp() + 1.7777777777777777 * 0.28125), (String)arrstring[1542 & 2434], (10411 & -28411) != 0);
            class_31457.Method_31478(d, d4);
            Object[] arrobject = new Object[5858 & -32742];
            arrobject[10624 & -14800] = d;
            arrobject[481 & -24575] = d4;
            Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.center.success", (Object[])arrobject);
        } else if (arrstring[128 & -17661].equals("damage")) {
            if (arrstring.length < (8451 & -32762)) {
                throw new Class_34974("commands.worldborder.damage.usage", new Object[8514 & -31728]);
            }
            if (arrstring[-14075 & 553].equals("buffer")) {
                if (arrstring.length != (6951 & -31549)) {
                    throw new Class_34974("commands.worldborder.damage.buffer.usage", new Object[16650 & 10804]);
                }
                double d = Class_41845.\u0000strictfp((String)arrstring[2131 & 20614], (double)0.0);
                double d5 = class_31457.Method_31470();
                class_31457.Method_31471(d);
                Object[] arrobject = new Object[35 & 1298];
                Object[] arrobject14 = new Object[2597 & -32767];
                arrobject14[-32692 & 8208] = d;
                arrobject[22848 & 9883] = String.format("%.1f", arrobject14);
                Object[] arrobject15 = new Object[8707 & -29439];
                arrobject15[1282 & 16489] = d5;
                arrobject[321 & 8229] = String.format("%.1f", arrobject15);
                Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.damage.buffer.success", (Object[])arrobject);
            } else if (arrstring[969 & 2053].equals("amount")) {
                if (arrstring.length != (20755 & 163)) {
                    throw new Class_34974("commands.worldborder.damage.amount.usage", new Object[-32608 & 9549]);
                }
                double d = Class_41845.\u0000strictfp((String)arrstring[3634 & 8322], (double)0.0);
                double d6 = class_31457.Method_31488();
                class_31457.Method_31483(d);
                Object[] arrobject = new Object[391 & 10298];
                Object[] arrobject16 = new Object[17297 & -31709];
                arrobject16[5304 & -32506] = d;
                arrobject[24577 & -31356] = String.format("%.2f", arrobject16);
                Object[] arrobject17 = new Object[1 & 3521];
                arrobject17[-32096 & 25611] = d6;
                arrobject[16515 & -24563] = String.format("%.2f", arrobject17);
                Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.damage.amount.success", (Object[])arrobject);
            }
        } else if (arrstring[913 & 10244].equals("warning")) {
            if (arrstring.length < (26946 & -32730)) {
                throw new Class_34974("commands.worldborder.warning.usage", new Object[20 & 4224]);
            }
            int n = Class_41845.\u0000strictfp((String)arrstring[6883 & 9478], (int)(3584 & -32320));
            if (arrstring[-21341 & 65].equals("time")) {
                if (arrstring.length != (7523 & -32765)) {
                    throw new Class_34974("commands.worldborder.warning.time.usage", new Object[9378 & 17220]);
                }
                int n2 = class_31457.Method_31482();
                class_31457.Method_31472(n);
                Object[] arrobject = new Object[22546 & -31478];
                arrobject[8208 & 21440] = n;
                arrobject[1025 & -23733] = n2;
                Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.warning.time.success", (Object[])arrobject);
            } else if (arrstring[-32767 & 1865].equals("distance")) {
                if (arrstring.length != (67 & 8723)) {
                    throw new Class_34974("commands.worldborder.warning.distance.usage", new Object[8960 & -30717]);
                }
                int n3 = class_31457.Method_31486();
                class_31457.Method_31487(n);
                Object[] arrobject = new Object[1034 & -31774];
                arrobject[-29952 & 8398] = n;
                arrobject[97 & -12283] = n3;
                Class_41845.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.worldborder.warning.distance.success", (Object[])arrobject);
            }
        } else {
            if (!arrstring[2406 & 16401].equals("get")) {
                throw new Class_34974("commands.worldborder.usage", new Object[21505 & 768]);
            }
            double d = class_31457.Method_31475();
            class_1367.Method_1374(Class_26261.Field_26263, Class_13337.Method_13371(d + 0.16111111111111112 * 3.103448275862069));
            Object[] arrobject = new Object[16451 & -32751];
            Object[] arrobject18 = new Object[193 & -12263];
            arrobject18[20480 & 335] = d;
            arrobject[-27630 & 2757] = String.format("%.0f", arrobject18);
            class_1367.Method_1373(new Class_2849("commands.worldborder.get.success", arrobject));
        }
    }

    private void Method_41852() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

