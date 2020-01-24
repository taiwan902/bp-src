/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class_21836
implements Class_12166 {
    private Class_31131 Field_21837;
    private final List Field_21838 = Lists.newArrayList();
    private final Class_3436[] Field_21839 = new Class_3436[321 & 9632];
    private Class_283 Field_21840;
    private final Class_34729 Field_21841;
    private final boolean Field_21842;
    private final boolean Field_21843;
    private Class_31131 Field_21844;
    private Random Field_21845;

    public String Method_21846() {
        return "FlatLevelSource";
    }

    public boolean Method_21847(Class_12166 class_12166, Class_17665 class_17665, int n, int n2) {
        return (16449 & 160) != 0;
    }

    public Class_4751 Method_21848(Class_283 class_283, String string, Class_4751 class_4751) {
        if ("Stronghold".equals(string)) {
            for (Class_31428 class_31428 : this.Field_21838) {
                if (!(class_31428 instanceof Class_34341)) continue;
                return class_31428.Method_31435(class_283, class_4751);
            }
        }
        return null;
    }

    public void Method_21849(Class_17665 class_17665, int n, int n2) {
        for (Class_31428 class_31428 : this.Field_21838) {
            class_31428.\u0000strictfp((Class_12166)this, this.Field_21840, n, n2, (Class_36425)null);
        }
    }

    public Class_21836(Class_283 class_283, long l, boolean bl, String string) {
        this.Field_21840 = class_283;
        this.Field_21845 = new Random(l);
        this.Field_21841 = Class_34729.Method_34742(string);
        if (bl) {
            Map map = this.Field_21841.Method_34734();
            if (map.containsKey("village")) {
                Map map2 = (Map)map.get("village");
                if (!map2.containsKey("size")) {
                    map2.put("size", "1");
                }
                this.Field_21838.add(new Class_34191(map2));
            }
            if (map.containsKey("biome_1")) {
                this.Field_21838.add(new Class_45310((Map)map.get("biome_1")));
            }
            if (map.containsKey("mineshaft")) {
                this.Field_21838.add(new Class_38526((Map)map.get("mineshaft")));
            }
            if (map.containsKey("stronghold")) {
                this.Field_21838.add(new Class_34341((Map)map.get("stronghold")));
            }
            if (map.containsKey("oceanmonument")) {
                this.Field_21838.add(new Class_37049((Map)map.get("oceanmonument")));
            }
        }
        if (this.Field_21841.Method_34734().containsKey("lake")) {
            this.Field_21837 = new Class_31131(Class_9265.Field_9286);
        }
        if (this.Field_21841.Method_34734().containsKey("lava_lake")) {
            this.Field_21844 = new Class_31131(Class_9265.Field_9358);
        }
        this.Field_21842 = this.Field_21841.Method_34734().containsKey("dungeon");
        int n = 20616 & 1333;
        int n2 = 9216 & -28596;
        int n3 = 3379 & -16383;
        for (Class_33007 class_33007 : this.Field_21841.Method_34737()) {
            for (int i = class_33007.Method_33012(); i < class_33007.Method_33012() + class_33007.Method_33015(); ++i) {
                Class_3436 class_3436 = class_33007.Method_33014();
                if (class_3436.Method_3442() == Class_9265.Field_9351) continue;
                n3 = 8578 & 5637;
                this.Field_21839[i] = class_3436;
            }
            if (class_33007.Method_33014().Method_3442() == Class_9265.Field_9351) {
                n2 += class_33007.Method_33015();
                continue;
            }
            n += class_33007.Method_33015() + n2;
            n2 = -31712 & 256;
        }
        class_283.Method_396(n);
        this.Field_21843 = n3 != 0 ? -32767 & 20074 : (int)(this.Field_21841.Method_34734().containsKey("decoration") ? 1 : 0);
    }

    public boolean Method_21850() {
        return (12801 & -30567) != 0;
    }

    public List Method_21851(Class_13693 class_13693, Class_4751 class_4751) {
        Class_17281 class_17281 = this.Field_21840.Method_547(class_4751);
        return class_17281.Method_17371(class_13693);
    }

    private void Method_21852() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_21853(int n, int n2) {
        return (-32503 & 8739) != 0;
    }

    public void Method_21854(Class_12166 class_12166, int n, int n2) {
        int n3 = n * (8372 & 22552);
        int n4 = n2 * (7188 & 433);
        Class_4751 class_4751 = new Class_4751(n3, 16388 & 1792, n4);
        Class_17281 class_17281 = this.Field_21840.Method_547(new Class_4751(n3 + (-31696 & 664), -24304 & 16385, n4 + (1072 & -30064)));
        int n5 = 17528 & 2176;
        this.Field_21845.setSeed(this.Field_21840.Method_392());
        long l = this.Field_21845.nextLong() / (-1733556880730344434L & 25723042L) * (541098011L & 2553267470287782466L) + (1490855533740169291L & 153952257L);
        long l2 = this.Field_21845.nextLong() / (-4270545610785947613L & 50949254L) * (-2221805496128497125L & 603980066L) + (537397323L & 1143210117L);
        this.Field_21845.setSeed((long)n * l + (long)n2 * l2 ^ this.Field_21840.Method_392());
        Class_29480 class_29480 = new Class_29480(n, n2);
        Object object = this.Field_21838.iterator();
        while (object.hasNext()) {
            Class_31428 class_31428 = (Class_31428)object.next();
            int n6 = class_31428.Method_31434(this.Field_21840, this.Field_21845, class_29480);
            if (!(class_31428 instanceof Class_34191)) continue;
            n5 |= n6;
        }
        if (this.Field_21837 != null && n5 == 0 && this.Field_21845.nextInt(18484 & 781) == 0) {
            this.Field_21837.Method_31134(this.Field_21840, this.Field_21845, class_4751.Method_4791(this.Field_21845.nextInt(4117 & -16174) + (216 & 24585), this.Field_21845.nextInt(20739 & 11744), this.Field_21845.nextInt(25040 & 5170) + (1048 & -3508)));
        }
        if (this.Field_21844 != null && n5 == 0 && this.Field_21845.nextInt(424 & 9752) == 0 && ((object = class_4751.Method_4791(this.Field_21845.nextInt(-29541 & 4656) + (-30583 & 5128), this.Field_21845.nextInt(this.Field_21845.nextInt(762 & 4600) + (8 & 13385)), this.Field_21845.nextInt(4117 & 2072) + (2714 & -27635))).\u0000, `() < this.Field_21840.Method_378() || this.Field_21845.nextInt(1162 & 10) == 0)) {
            this.Field_21844.Method_31134(this.Field_21840, this.Field_21845, (Class_4751)object);
        }
        if (this.Field_21842) {
            for (int i = 11844 & 20632; i < (140 & 1851); ++i) {
                new Class_30483().Method_30491(this.Field_21840, this.Field_21845, class_4751.Method_4791(this.Field_21845.nextInt(-26542 & 25360) + (1081 & 8780), this.Field_21845.nextInt(-21244 & 16640), this.Field_21845.nextInt(528 & -32620) + (-16280 & 2056)));
            }
        }
        if (this.Field_21843) {
            class_17281.Method_17368(this.Field_21840, this.Field_21845, class_4751);
        }
    }

    public int Method_21855() {
        return 21194 & -31743;
    }

    public Class_17665 Method_21856(Class_4751 class_4751) {
        return this.Method_21858(class_4751.\u0000= final() >> (1028 & 11140), class_4751.\u0000strictfp() >> (6692 & 398));
    }

    public void Method_21857() {
    }

    public Class_17665 Method_21858(int n, int n2) {
        int n3;
        Object object2;
        Class_36425 class_36425 = new Class_36425();
        for (int i = 112 & -20096; i < this.Field_21839.length; ++i) {
            object2 = this.Field_21839[i];
            if (object2 == null) continue;
            for (int j = -32060 & 20776; j < (4241 & 276); ++j) {
                for (n3 = 8197 & 4704; n3 < (83 & 19216); ++n3) {
                    class_36425.Method_36430(j, i, n3, (Class_3436)object2);
                }
            }
        }
        for (Object object2 : this.Field_21838) {
            object2.Method_11123(this, this.Field_21840, n, n2, class_36425);
        }
        Class_17665 class_17665 = new Class_17665(this.Field_21840, class_36425, n, n2);
        object2 = this.Field_21840.Method_371().Method_31930(null, n * (80 & -20592), n2 * (592 & 2194), 16464 & 4120, 7479 & 592);
        byte[] arrby = class_17665.Method_17743();
        for (n3 = 9472 & -26447; n3 < arrby.length; ++n3) {
            arrby[n3] = (byte)object2[n3].Field_17343;
        }
        class_17665.Method_17734();
        return class_17665;
    }

    public boolean Method_21859(boolean bl, Class_2748 class_2748) {
        return (17413 & -29789) != 0;
    }

    public boolean Method_21860() {
        return (24738 & 3097) != 0;
    }
}

