/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.opengl.Display
 *  internal.org.lwjgl.opengl.GL11
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import internal.org.lwjgl.opengl.Display;
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.ClientBrandRetriever;

public class Class_45297
extends Class_1551 {
    private final Class_18 Field_45298;
    private final Class_28636 Field_45299;

    protected void Method_45300(Class_31566 class_31566) {
        List list = this.Method_45308();
        for (int i = -32507 & 514; i < list.size(); ++i) {
            String string = (String)list.get(i);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n = 5227 & 8841;
            int n2 = this.Field_45299.Method_28715(string);
            int n3 = class_31566.Method_31574() - (8226 & 1298) - n2;
            int n4 = (-18382 & 838) + n * i;
            this.Field_45299.Method_28708(string, n3, n4, 972546788 & 14743777);
        }
    }

    public Class_45297(Class_18 class_18) {
        this.Field_45298 = class_18;
        this.Field_45299 = class_18.Field_27;
    }

    private static long Method_45301(long l) {
        return l / (-9141073470926109183L & 9141073469314708742L) / (136459792L & 2239705196823874573L);
    }

    private void Method_45302() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_45303(Class_31566 class_31566) {
        List list = this.Method_45308();
        for (int i = 8945 & -26622; i < list.size(); ++i) {
            String string = (String)list.get(i);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n = 23849 & -32101;
            int n2 = this.Field_45299.Method_28715(string);
            int n3 = class_31566.Method_31574() - (-5870 & 4199) - n2;
            int n4 = (306 & 134) + n * i;
            Class_45297.\u0000strictfp((int)(n3 - (9473 & 22657)), (int)(n4 - (20509 & -30943)), (int)(n3 + n2 + (18453 & 5993)), (int)(n4 + n - (9233 & 2657)), (int)(-1840228784 & -235777926));
        }
    }

    private boolean Method_45304() {
        return (this.Field_45298.Field_48.\u0000= instanceof() || this.Field_45298.Field_84.Field_39879 ? 21001 & 51 : 12359 & 18816) != 0;
    }

    protected void Method_45305() {
        List list = this.Method_45307();
        for (int i = -24277 & 2052; i < list.size(); ++i) {
            String string = (String)list.get(i);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n = -21845 & 16397;
            int n2 = this.Field_45299.Method_28715(string);
            int n3 = (27822 & 4098) + n * i;
            Class_45297.\u0000strictfp((int)(2319 & 13313), (int)(n3 - (-21045 & 16385)), (int)((10275 & 5254) + n2 + (8267 & 18225)), (int)(n3 + n - (-23803 & 16409)), (int)(-657166244 & -1789175312));
        }
    }

    protected void Method_45306() {
        List list = this.Method_45307();
        for (int i = 3249 & 16386; i < list.size(); ++i) {
            String string = (String)list.get(i);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n = 1293 & -10055;
            int n2 = this.Field_45299.Method_28715(string);
            int n3 = (1478 & -12286) + n * i;
            this.Field_45299.Method_28708(string, 18 & -21246, n3, 15786209 & 165733856);
        }
    }

    protected List Method_45307() {
        Object object;
        Class_1061 class_1061 = this.Field_45298.Method_246();
        Class_4595 class_4595 = class_1061.Method_1192();
        Class_4751 class_4751 = new Class_4751(this.Field_45298.Method_246().Field_1130, this.Field_45298.Method_246().Method_1315().Field_11000, this.Field_45298.Method_246().Field_1106);
        if (((Boolean)this.Field_45298.Field_84.Field_39732.Field_8888.\u0000strictfp()).booleanValue()) {
            Object[] arrobject = new String[18836 & -32729];
            arrobject[1569 & -14306] = "BP_1.8";
            arrobject[4113 & 2785] = "FPS: " + Class_18.Method_163();
            arrobject[17314 & 6154] = "XYZ: " + class_4751.\u0000= final() + " / " + class_4751.\u0000, `() + " / " + class_4751.\u0000strictfp();
            arrobject[971 & -11261] = "f: " + class_4595.Method_4619() + " " + class_4595.Method_4639();
            return Lists.newArrayList((Object[])arrobject);
        }
        if (this.Method_45304()) {
            Object[] arrobject = new String[-16376 & 3096];
            arrobject[-16218 & 9985] = "BP 1.8 (" + this.Field_45298.Method_168() + "/" + ClientBrandRetriever.\u0000strictfp() + ")";
            arrobject[7361 & 523] = this.Field_45298.Field_83;
            arrobject[678 & 22531] = this.Field_45298.Field_33.Method_25092();
            arrobject[-27901 & 25711] = this.Field_45298.Field_33.Method_25151();
            arrobject[16644 & -30162] = "P: " + this.Field_45298.Field_129.Method_27580() + ". T: " + this.Field_45298.Field_72.\u0000strictfp();
            arrobject[4229 & 1095] = this.Field_45298.Field_72.\u0000, `();
            arrobject[19990 & 206] = "";
            Object[] arrobject2 = new Object[8199 & 3083];
            arrobject2[-30042 & 265] = class_4751.\u0000= final() & (3599 & 4511);
            arrobject2[4109 & 19009] = class_4751.\u0000, `() & (319 & 5327);
            arrobject2[-7146 & 546] = class_4751.\u0000strictfp() & (271 & 17951);
            arrobject[19719 & 655] = String.format("Chunk-relative: %d %d %d", arrobject2);
            return Lists.newArrayList((Object[])arrobject);
        }
        String string = "Invalid";
        switch (Class_13046.Field_13047[class_4595.ordinal()]) {
            case 1: {
                string = "Towards negative Z";
                break;
            }
            case 2: {
                string = "Towards positive Z";
                break;
            }
            case 3: {
                string = "Towards negative X";
                break;
            }
            case 4: {
                string = "Towards positive X";
            }
        }
        Object[] arrobject = new String[20623 & 11627];
        arrobject[17056 & -24503] = "Minecraft 1.8 (" + this.Field_45298.Method_168() + "/blazingpack)";
        arrobject[19281 & -32767] = this.Field_45298.Field_83;
        arrobject[3846 & -24574] = this.Field_45298.Field_33.Method_25092();
        arrobject[3371 & -32765] = this.Field_45298.Field_33.Method_25151();
        arrobject[-28412 & 1028] = "P: " + this.Field_45298.Field_129.Method_27580() + ". T: " + this.Field_45298.Field_72.\u0000strictfp();
        arrobject[39 & 27149] = this.Field_45298.Field_72.\u0000, `();
        arrobject[16814 & 5126] = "";
        Object[] arrobject3 = new Object[-27517 & 8711];
        arrobject3[12558 & 128] = this.Field_45298.Method_246().Field_1130;
        arrobject3[17159 & -20415] = this.Field_45298.Method_246().Method_1315().Field_11000;
        arrobject3[21834 & 8199] = this.Field_45298.Method_246().Field_1106;
        arrobject[2847 & 21639] = String.format("XYZ: %.3f / %.5f / %.3f", arrobject3);
        Object[] arrobject4 = new Object[19087 & 1107];
        arrobject4[18752 & 4621] = class_4751.\u0000= final();
        arrobject4[16529 & -25337] = class_4751.\u0000, `();
        arrobject4[-32702 & 8214] = class_4751.\u0000strictfp();
        arrobject[-32740 & 9353] = String.format("Block: %d %d %d", arrobject4);
        Object[] arrobject5 = new Object[1614 & 10406];
        arrobject5[6656 & 1393] = class_4751.\u0000= final() & (-31889 & 4111);
        arrobject5[4193 & 651] = class_4751.\u0000, `() & (23247 & 31);
        arrobject5[17922 & 6182] = class_4751.\u0000strictfp() & (-32241 & 15);
        arrobject5[1103 & 6195] = class_4751.\u0000= final() >> (-12284 & 10500);
        arrobject5[25093 & 4228] = class_4751.\u0000, `() >> (25900 & 6663);
        arrobject5[8455 & 13] = class_4751.\u0000strictfp() >> (5188 & 2183);
        arrobject[27227 & 393] = String.format("Chunk: %d %d %d in %d %d %d", arrobject5);
        Object[] arrobject6 = new Object[3140 & -24556];
        arrobject6[1665 & 2080] = class_4595;
        arrobject6[25441 & -25583] = string;
        arrobject6[459 & -30698] = Float.valueOf(Class_13337.Method_13354(class_1061.Field_1079));
        arrobject6[1031 & 17099] = Float.valueOf(Class_13337.Method_13354(class_1061.Field_1093));
        arrobject[-14882 & 8202] = String.format("Facing: %s (%s) (%.1f / %.1f)", arrobject6);
        ArrayList arrayList = Lists.newArrayList((Object[])arrobject);
        if (this.Field_45298.Field_72 != null && this.Field_45298.Field_72.\u0000
        (class_4751)) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2;
            object = this.Field_45298.Field_72.Method_582(class_4751);
            arrayList.add("Biome: " + object.Method_17771((Class_4751)class_4751, (Class_31916)this.Field_45298.Field_72.\u0000strictfp()).Field_17355);
            arrayList.add("Light: " + ((Class_17665)object).Method_17741(class_4751, 4096 & -29373) + " (" + ((Class_17665)object).Method_17705(Class_6778.Field_6781, class_4751) + " sky, " + ((Class_17665)object).Method_17705(Class_6778.Field_6780, class_4751) + " block)");
            Class_33888 class_33888 = this.Field_45298.Field_72.\u0000strictfp(class_4751);
            if (this.Field_45298.Method_251() && this.Field_45298.Method_180() != null && (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = this.Field_45298.Method_180().\u0000strictfp().Method_3112(this.Field_45298.Field_48.\u0000strictfp())) != null) {
                class_33888 = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_364(new Class_4751((Class_1061)\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2));
            }
            Object[] arrobject7 = new Object[20567 & 299];
            arrobject7[16518 & -19912] = Float.valueOf(class_33888.Method_33894());
            arrobject7[65 & 4753] = this.Field_45298.Field_72.\u0000= final() / (406904784L & 580935116L);
            arrobject7[1114 & -30430] = this.Field_45298.Field_72.\u0000= final();
            arrayList.add(String.format("LocalDiff: %.2f (Day %d/%d) ", arrobject7));
        }
        if (this.Field_45298.Field_58 != null && this.Field_45298.Field_58.Method_22985()) {
            arrayList.add("Shader: " + this.Field_45298.Field_58.Method_22928().Method_26362());
        }
        if (this.Field_45298.Field_57 != null && this.Field_45298.Field_57.Field_37112 == Class_7192.Field_7193 && this.Field_45298.Field_57.Method_37118() != null) {
            object = this.Field_45298.Field_57.Method_37118();
            Object[] arrobject8 = new Object[18435 & -31369];
            arrobject8[8200 & 2400] = object.\u0000= final();
            arrobject8[16971 & 9233] = object.\u0000, `();
            arrobject8[1054 & 2082] = object.\u0000strictfp();
            arrayList.add(String.format("Looking at: %d %d %d", arrobject8));
        }
        return arrayList;
    }

    protected List Method_45308() {
        long l = Runtime.getRuntime().maxMemory();
        long l2 = Runtime.getRuntime().totalMemory();
        long l3 = Runtime.getRuntime().freeMemory();
        long l4 = l2 - l3;
        if (((Boolean)this.Field_45298.Field_84.Field_39732.Field_8888.\u0000strictfp()).booleanValue()) {
            Object[] arrobject = new String[3719 & -32686];
            Object[] arrobject2 = new Object[-30077 & 17723];
            arrobject2[2824 & 1136] = l4 * (75571812L & -1213906729457677827L) / l;
            arrobject2[21635 & -32647] = Class_45297.Method_45301(l4);
            arrobject2[13442 & 258] = Class_45297.Method_45301(l);
            arrobject[-21120 & 4609] = String.format("%2d%% %03d/%03dMB", arrobject2);
            Object[] arrobject3 = new Object[9506 & -30646];
            arrobject3[257 & -6086] = l2 * (11277028L & 201343358L) / l;
            arrobject3[8235 & 21] = Class_45297.Method_45301(l2);
            arrobject[-28415 & 53] = String.format("%2d%% %03dMB", arrobject3);
            ArrayList arrayList = Lists.newArrayList((Object[])arrobject);
            return arrayList;
        }
        Object[] arrobject = new String[4173 & 3337];
        Object[] arrobject4 = new Object[514 & 10307];
        arrobject4[16408 & 10470] = System.getProperty("java.version");
        arrobject4[1 & 3021] = this.Field_45298.Method_178() ? 24641 & -28338 : 26664 & 738;
        arrobject[2128 & -28537] = String.format("Java: %s %dbit", arrobject4);
        Object[] arrobject5 = new Object[2055 & -28669];
        arrobject5[10244 & -32168] = l4 * (8540639950176526822L & -8540639950948777868L) / l;
        arrobject5[16513 & 1025] = Class_45297.Method_45301(l4);
        arrobject5[1106 & 20642] = Class_45297.Method_45301(l);
        arrobject[45 & -32495] = String.format("Mem: % 2d%% %03d/%03dMB", arrobject5);
        Object[] arrobject6 = new Object[17470 & 258];
        arrobject6[-24186 & 18497] = l2 * (6292324L & 25989228L) / l;
        arrobject6[-3071 & 539] = Class_45297.Method_45301(l2);
        arrobject[626 & 138] = String.format("Allocated: % 2d%% %03dMB", arrobject6);
        arrobject[16531 & 75] = "";
        Object[] arrobject7 = new Object[2947 & 17];
        arrobject7[-11776 & 2528] = Class_32876.Method_32942();
        arrobject[21637 & 38] = String.format("CPU: %s", arrobject7);
        arrobject[-24243 & 20519] = "";
        Object[] arrobject8 = new Object[75 & 17031];
        arrobject8[4288 & 3602] = Display.getWidth();
        arrobject8[165 & -6895] = Display.getHeight();
        arrobject8[514 & 14791] = GL11.glGetString((int)(8112 & -24831));
        arrobject[29703 & -32194] = String.format("Display: %dx%d (%s)", arrobject8);
        arrobject[9351 & -26553] = GL11.glGetString((int)(7987 & -24831));
        arrobject[-20887 & 16414] = GL11.glGetString((int)(-24830 & 16195));
        ArrayList arrayList = Lists.newArrayList((Object[])arrobject);
        if (this.Method_45304()) {
            return arrayList;
        }
        if (this.Field_45298.Field_57 != null && this.Field_45298.Field_57.Field_37112 == Class_7192.Field_7193 && this.Field_45298.Field_57.Method_37118() != null) {
            Class_4751 class_4751 = this.Field_45298.Field_57.Method_37118();
            Class_3436 class_3436 = this.Field_45298.Field_72.\u0000strictfp(class_4751);
            if (this.Field_45298.Field_72.\u0000strictfp() != Class_43755.Field_43756) {
                class_3436 = class_3436.Method_3442().Method_3333(class_3436, this.Field_45298.Field_72, class_4751);
            }
            if (this.Field_45298.Field_33 != null) {
                Class_6176 object = this.Field_45298.Field_33.Field_25038.Method_13188(class_4751);
                if (object != null) {
                    long l5 = System.nanoTime() - object.Field_6184;
                    if (l5 > (86401610629889L & 7571763286468666440L) || l5 < (8519686L & 1612782048L)) {
                        arrayList.add("NaN");
                    } else if (l5 > (3064373934070150416L & -3064373932217476091L)) {
                        arrayList.add(l5 / (2142951965L & 6844421338721675808L) + "s");
                    } else {
                        arrayList.add(l5 / (-1559876675928373696L & 940530240L) + "ms");
                    }
                } else {
                    arrayList.add("null");
                }
            }
            arrayList.add("");
            arrayList.add(String.valueOf(Class_3238.Field_3271.\u0000, `((Object)class_3436.Method_3442())));
            for (Map.Entry entry : class_3436.Method_3439().entrySet()) {
                String string = ((Comparable)entry.getValue()).toString();
                if (entry.getValue() == Boolean.TRUE) {
                    string = (Object)((Object)Class_5478.Field_5497) + string;
                } else if (entry.getValue() == Boolean.FALSE) {
                    string = (Object)((Object)Class_5478.Field_5505) + string;
                }
                arrayList.add(((Class_3538)entry.getKey()).Method_3541() + ": " + string);
            }
        }
        return arrayList;
    }

    public void Method_45309(Class_31566 class_31566) {
        this.Field_45298.Field_25.Method_2789("debug");
        Class_16867.Method_16961();
        Class_45297.\u0000, `();
        this.Method_45305();
        this.Method_45303(class_31566);
        Class_45297.\u0000= final();
        this.Field_45299.Method_28712();
        this.Method_45306();
        this.Method_45300(class_31566);
        this.Field_45299.Method_28728();
        Class_16867.Method_16945();
        this.Field_45298.Field_25.Method_2790();
    }
}

