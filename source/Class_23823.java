/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public final class Class_23823 {
    public int Field_23824;
    private int Field_23825;
    public int Field_23826;
    private boolean Field_23827;
    private Class_3238 Field_23828;
    private boolean Field_23829;
    private Class_3238 Field_23830 = null;
    private Class_1956 Field_23831;
    private Class_1699 Field_23832;
    public static final DecimalFormat Field_23833 = new DecimalFormat(Class_23823.Method_23852("\u0ea8\u0ea1\u0ea8\u0ea8\u0eac"));
    private Class_36512 Field_23834;

    public void Method_23835(Class_30635 class_30635, int n) {
        if (this.Field_23832 == null) {
            this.Method_23869(new Class_1699());
        }
        if (!this.Field_23832.Method_1715("ench", 2077 & 28873)) {
            this.Field_23832.Method_1744("ench", new Class_1758());
        }
        Class_1758 class_1758 = this.Field_23832.Method_1735("ench", 2062 & 4363);
        Class_1699 class_1699 = new Class_1699();
        class_1699.Method_1731("id", (short)class_30635.Field_30638);
        class_1699.Method_1731("lvl", (byte)n);
        class_1758.Method_1781(class_1699);
    }

    private boolean Method_23836(Class_23823 class_23823) {
        return (this.Field_23826 != class_23823.Field_23826 ? 5284 & -16103 : (this.Field_23831 != class_23823.Field_23831 ? -10741 & 2080 : (this.Field_23825 != class_23823.Field_23825 ? 3738 & -32508 : (this.Field_23832 == null && class_23823.Field_23832 != null ? 27264 & -32743 : (this.Field_23832 == null || this.Field_23832.Method_1734(class_23823.Field_23832) ? 2307 & 73 : 4616 & 9350))))) != 0;
    }

    public int Method_23837() {
        return this.Method_23844().Method_1976();
    }

    public Class_23823 Method_23838(Class_283 class_283, Class_626 class_626) {
        return this.Method_23844().Method_2027(this, class_283, class_626);
    }

    public Class_23823 Method_23839(Class_283 class_283, Class_626 class_626) {
        return this.Method_23844().Method_1979(this, class_283, class_626);
    }

    public Class_23823(Class_3238 class_3238, int n) {
        this(class_3238, n, 8489 & -14202);
    }

    public static Class_23823 Method_23840(Class_1699 class_1699) {
        Class_23823 class_23823 = new Class_23823();
        class_23823.Method_23890(class_1699);
        return class_23823.Method_23844() != null ? class_23823 : null;
    }

    public Class_1699 Method_23841(Class_1699 class_1699) {
        Class_2080 class_2080 = (Class_2080)Class_1956.Field_1961.Method_3648(this.Field_23831);
        class_1699.Method_1702("id", class_2080 == null ? "minecraft:air" : class_2080.Method_2086());
        class_1699.Method_1724("Count", (byte)this.Field_23826);
        class_1699.Method_1731("Damage", (short)this.Field_23825);
        if (this.Field_23832 != null) {
            class_1699.Method_1744("tag", this.Field_23832);
        }
        return class_1699;
    }

    public boolean Method_23842() {
        return (this.Field_23832 != null ? 7489 & 157 : 20616 & 3077) != 0;
    }

    public int Method_23843() {
        return this.Field_23825;
    }

    public Class_1956 Method_23844() {
        return this.Field_23831;
    }

    public Class_1699 Method_23845() {
        return this.Field_23832;
    }

    public boolean Method_23846() {
        if (this.Field_23831 == null) {
            return (5760 & 8465) != 0;
        }
        if (this.Field_23831.Method_2010() <= 0) {
            return (13320 & 789) != 0;
        }
        return (!this.Method_23842() || !this.Method_23845().Method_1733("Unbreakable") ? -28655 & 8581 : 4128 & 2818) != 0;
    }

    private Class_23823() {
        this.Field_23827 = 15395 & -31988;
        this.Field_23828 = null;
        this.Field_23829 = 7044 & 1056;
    }

    public boolean Method_23847(int n, Random random) {
        if (!this.Method_23846()) {
            return (-24554 & 18752) != 0;
        }
        if (n > 0) {
            int n2 = Class_29642.Method_29662(Class_30635.Field_30653.Field_30638, this);
            int n3 = 4164 & 2211;
            for (int i = 1540 & 20672; n2 > 0 && i < n; ++i) {
                if (!Class_34458.Method_34459(this, n2, random)) continue;
                ++n3;
            }
            if ((n -= n3) <= 0) {
                return (11352 & 0) != 0;
            }
        }
        this.Field_23825 += n;
        return (this.Field_23825 > this.Method_23859() ? 1157 & -15807 : 260 & -7040) != 0;
    }

    public void Method_23848(Class_283 class_283, Class_626 class_626, int n) {
        class_626.Method_817(Class_19863.Field_19885[Class_1956.Method_1986(this.Field_23831)], n);
        this.Field_23831.Method_1987(this, class_283, class_626);
    }

    public void Method_23849(int n) {
        this.Field_23825 = n;
        if (this.Field_23825 < 0) {
            this.Field_23825 = 770 & -16344;
        }
    }

    public Class_23823 Method_23850() {
        Class_23823 class_23823 = new Class_23823(this.Field_23831, this.Field_23826, this.Field_23825);
        if (this.Field_23832 != null) {
            class_23823.Field_23832 = (Class_1699)this.Field_23832.Method_1732();
        }
        return class_23823;
    }

    public boolean Method_23851() {
        return (this.Field_23832 == null ? -28543 & 10252 : (!this.Field_23832.Method_1715("display", -14193 & 8202) ? -5568 & 4533 : (int)(this.Field_23832.Method_1703("display").Method_1715("Name", 200 & -19442) ? 1 : 0))) != 0;
    }

    private static String Method_23852(String string) {
        int n = 20095;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23823.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_23853() {
        return this.Field_23825;
    }

    public Class_1699 Method_23854(String string, boolean bl) {
        if (this.Field_23832 != null && this.Field_23832.Method_1715(string, -30678 & 78)) {
            return this.Field_23832.Method_1703(string);
        }
        if (bl) {
            Class_1699 class_1699 = new Class_1699();
            this.Method_23879(string, class_1699);
            return class_1699;
        }
        return null;
    }

    public static Class_23823 Method_23855(Class_23823 class_23823) {
        return class_23823 == null ? null : class_23823.Method_23850();
    }

    public Class_23823(Class_1956 class_1956, int n, int n2) {
        this.Field_23827 = -12155 & 2;
        this.Field_23828 = null;
        this.Field_23829 = 4178 & -23252;
        this.Field_23831 = class_1956;
        this.Field_23826 = n;
        this.Field_23825 = n2;
        if (this.Field_23825 < 0) {
            this.Field_23825 = 20608 & 35;
        }
    }

    public boolean Method_23856(Class_3238 class_3238) {
        return this.Field_23831.Method_1982(class_3238);
    }

    public Class_23823 Method_23857(int n) {
        Class_23823 class_23823 = new Class_23823(this.Field_23831, n, this.Field_23825);
        if (this.Field_23832 != null) {
            class_23823.Field_23832 = (Class_1699)this.Field_23832.Method_1732();
        }
        this.Field_23826 -= n;
        return class_23823;
    }

    public Multimap Method_23858() {
        Multimap multimap;
        if (this.Method_23842() && this.Field_23832.Method_1715("AttributeModifiers", 6927 & 24601)) {
            multimap = HashMultimap.create();
            Class_1758 class_1758 = this.Field_23832.Method_1735("AttributeModifiers", 12490 & 10);
            for (int i = 256 & -6964; i < class_1758.Method_1772(); ++i) {
                Class_1699 class_1699 = class_1758.Method_1768(i);
                Class_10375 class_10375 = Class_21716.Method_21729(class_1699);
                if (class_10375 == null || class_10375.Method_10381().getLeastSignificantBits() == (-7605039704439618228L & 7605039703872786593L) || class_10375.Method_10381().getMostSignificantBits() == (5133784305667412999L & -5133784305855535104L)) continue;
                multimap.put((Object)class_1699.Method_1708("AttributeName"), (Object)class_10375);
            }
        } else {
            multimap = this.Method_23844().Method_2012();
        }
        return multimap;
    }

    public int Method_23859() {
        return this.Field_23831.Method_2010();
    }

    public float Method_23860(Class_3238 class_3238) {
        return this.Method_23844().Method_1971(this, class_3238);
    }

    public int Method_23861() {
        return this.Method_23844().Method_2007(this);
    }

    public List Method_23862(Class_626 class_626, boolean bl) {
        Class_1758 class_1758;
        Class_1758 class_17582;
        Multimap multimap;
        int n;
        ArrayList arrayList = Lists.newArrayList();
        String string = this.Method_23899();
        if (this.Method_23851()) {
            string = (Object)((Object)Class_5478.Field_5495) + string;
        }
        string = string + (Object)((Object)Class_5478.Field_5507);
        if (bl) {
            String string2 = "";
            if (string.length() > 0) {
                string = string + " (";
                string2 = ")";
            }
            int n2 = Class_1956.Method_1986(this.Field_23831);
            if (this.Method_23877()) {
                Object[] arrobject = new Object[16467 & -30673];
                arrobject[17616 & 10241] = n2;
                arrobject[30721 & -31987] = this.Field_23825;
                arrobject[4162 & 683] = string2;
                string = string + String.format("#%04d/%d%s", arrobject);
            } else {
                Object[] arrobject = new Object[-27262 & 16390];
                arrobject[4628 & 3169] = n2;
                arrobject[1 & -17407] = string2;
                string = string + String.format("#%04d%s", arrobject);
            }
        } else if (!this.Method_23851() && this.Field_23831 == Class_10527.Field_10701) {
            string = string + " #" + this.Field_23825;
        }
        arrayList.add(string);
        int n3 = -9728 & 9344;
        if (this.Method_23842() && this.Field_23832.Method_1715("HideFlags", -31377 & 6259)) {
            n3 = this.Field_23832.Method_1738("HideFlags");
        }
        if ((n3 & (545 & 20592)) == 0) {
            this.Field_23831.Method_2003(this, class_626, arrayList, bl);
        }
        if (this.Method_23842()) {
            Class_1758 class_17583;
            if ((n3 & (3129 & 16641)) == 0 && (class_17583 = this.Method_23863()) != null) {
                for (int i = -15360 & 640; i < class_17583.Method_1772(); ++i) {
                    n = class_17583.Method_1768(i).Method_1726("id");
                    short s = class_17583.Method_1768(i).Method_1726("lvl");
                    if (Class_30635.Method_30685(n) == null) continue;
                    arrayList.add(Class_30635.Method_30685(n).Method_30706(s));
                }
            }
            if (this.Field_23832.Method_1715("display", 330 & 24714)) {
                Class_1758 class_17584;
                Class_1699 class_1699 = this.Field_23832.Method_1703("display");
                if (class_1699.Method_1715("color", 1063 & 17227)) {
                    if (bl) {
                        arrayList.add("Color: #" + Integer.toHexString(class_1699.Method_1738("color")).toUpperCase());
                    } else {
                        arrayList.add((Object)((Object)Class_5478.Field_5495) + Class_7594.Method_7602("item.dyed"));
                    }
                }
                if (class_1699.Method_1711("Lore") == (-29911 & 8267) && (class_17584 = class_1699.Method_1735("Lore", 2829 & 4216)).Method_1772() > 0) {
                    for (n = 16407 & -32704; n < class_17584.Method_1772(); ++n) {
                        arrayList.add((Object)((Object)Class_5478.Field_5484) + "" + (Object)((Object)Class_5478.Field_5495) + class_17584.Method_1771(n));
                    }
                }
            }
        }
        if (!(multimap = this.Method_23858()).isEmpty() && (n3 & (6150 & -31462)) == 0) {
            arrayList.add("");
            for (Map.Entry entry : multimap.entries()) {
                Class_10375 class_10375 = (Class_10375)entry.getValue();
                double d = class_10375.Method_10382();
                if (class_10375.Method_10381() == Class_1956.Field_1967) {
                    d += (double)Class_29642.Method_29654(this, Class_40173.Field_40174);
                }
                double d2 = class_10375.Method_10389() != (26663 & 4497) && class_10375.Method_10389() != (16587 & 34) ? d : d * (900.0 * 0.1111111111111111);
                if (d > 0.0) {
                    Object[] arrobject = new Object[-32766 & 306];
                    arrobject[3106 & 64] = Field_23833.format(d2);
                    arrobject[25699 & 6277] = Class_7594.Method_7602("attribute.name." + (String)entry.getKey());
                    arrayList.add((Object)((Object)Class_5478.Field_5498) + Class_7594.Method_7597("attribute.modifier.plus." + class_10375.Method_10389(), arrobject));
                    continue;
                }
                if (!(d < 0.0)) continue;
                Object[] arrobject = new Object[9139 & 2058];
                arrobject[8260 & -26960] = Field_23833.format(d2 *= -3.0 * 0.3333333333333333);
                arrobject[7169 & -32635] = Class_7594.Method_7602("attribute.name." + (String)entry.getKey());
                arrayList.add((Object)((Object)Class_5478.Field_5505) + Class_7594.Method_7597("attribute.modifier.take." + class_10375.Method_10389(), arrobject));
            }
        }
        if (this.Method_23842() && this.Method_23845().Method_1733("Unbreakable") && (n3 & (17684 & 2117)) == 0) {
            arrayList.add((Object)((Object)Class_5478.Field_5498) + Class_7594.Method_7602("item.unbreakable"));
        }
        if (this.Method_23842() && this.Field_23832.Method_1715("CanDestroy", -24481 & 937) && (n3 & (18952 & 88)) == 0 && (class_1758 = this.Field_23832.Method_1735("CanDestroy", 18700 & -32054)).Method_1772() > 0) {
            arrayList.add("");
            arrayList.add((Object)((Object)Class_5478.Field_5480) + Class_7594.Method_7602("item.canBreak"));
            for (n = 1155 & 52; n < class_1758.Method_1772(); ++n) {
                Class_3238 class_3238 = Class_3238.Method_3341(class_1758.Method_1771(n));
                if (class_3238 != null) {
                    arrayList.add((Object)((Object)Class_5478.Field_5488) + class_3238.Method_3380());
                    continue;
                }
                arrayList.add((Object)((Object)Class_5478.Field_5488) + "missingno");
            }
        }
        if (this.Method_23842() && this.Field_23832.Method_1715("CanPlaceOn", 16457 & 8857) && (n3 & (9488 & 16497)) == 0 && (class_17582 = this.Field_23832.Method_1735("CanPlaceOn", 15400 & 526)).Method_1772() > 0) {
            arrayList.add("");
            arrayList.add((Object)((Object)Class_5478.Field_5480) + Class_7594.Method_7602("item.canPlace"));
            for (n = 6192 & 8576; n < class_17582.Method_1772(); ++n) {
                Class_3238 class_3238 = Class_3238.Method_3341(class_17582.Method_1771(n));
                if (class_3238 != null) {
                    arrayList.add((Object)((Object)Class_5478.Field_5488) + class_3238.Method_3380());
                    continue;
                }
                arrayList.add((Object)((Object)Class_5478.Field_5488) + "missingno");
            }
        }
        if (bl) {
            if (this.Method_23878()) {
                arrayList.add("Durability: " + (this.Method_23859() - this.Method_23853()) + " / " + this.Method_23859());
            }
            arrayList.add((Object)((Object)Class_5478.Field_5488) + ((Class_2080)Class_1956.Field_1961.Method_3648(this.Field_23831)).Method_2086());
            if (this.Method_23842()) {
                arrayList.add((Object)((Object)Class_5478.Field_5488) + "NBT: " + this.Method_23845().Method_1710().size() + " tag(s)");
            }
        }
        return arrayList;
    }

    public Class_1758 Method_23863() {
        return this.Field_23832 == null ? null : this.Field_23832.Method_1735("ench", 2106 & 522);
    }

    public boolean Method_23864(Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        boolean bl = this.Method_23844().Method_2008(this, class_626, class_283, class_4751, class_4595, f, f2, f3);
        if (bl) {
            class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this.Field_23831)]);
        }
        return bl;
    }

    public boolean Method_23865(Class_23823 class_23823) {
        return (class_23823 != null && this.Field_23831 == class_23823.Field_23831 && this.Field_23825 == class_23823.Field_23825 ? 4869 & 18545 : -30188 & 386) != 0;
    }

    public boolean Method_23866() {
        return (!this.Method_23844().Method_2023(this) ? 10288 & 21893 : (!this.Method_23885() ? -32747 & 17867 : 708 & 25640)) != 0;
    }

    public int Method_23867() {
        return this.Method_23842() && this.Field_23832.Method_1715("RepairCost", 67 & 20483) ? this.Field_23832.Method_1738("RepairCost") : 320 & 8192;
    }

    public void Method_23868(Class_283 class_283, Class_626 class_626, int n) {
        this.Method_23844().Method_1985(this, class_283, class_626, n);
    }

    public void Method_23869(Class_1699 class_1699) {
        this.Field_23832 = class_1699;
    }

    public Class_23823 Method_23870(String string) {
        if (this.Field_23832 == null) {
            this.Field_23832 = new Class_1699();
        }
        if (!this.Field_23832.Method_1715("display", 4363 & 9310)) {
            this.Field_23832.Method_1744("display", new Class_1699());
        }
        this.Field_23832.Method_1703("display").Method_1702("Name", string);
        return this;
    }

    private void Method_23871() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_25567 Method_23872() {
        return this.Method_23844().Method_2019(this);
    }

    public void Method_23873(Class_283 class_283, Class_3238 class_3238, Class_4751 class_4751, Class_626 class_626) {
        boolean bl = this.Field_23831.Method_1994(this, class_283, class_3238, class_4751, class_626);
        if (bl) {
            class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this.Field_23831)]);
        }
    }

    public boolean Method_23874() {
        return this.Method_23844().Method_1974(this);
    }

    public String Method_23875() {
        return this.Field_23826 + "x" + this.Field_23831.Method_2026() + "@" + this.Field_23825;
    }

    public Class_23823(Class_3238 class_3238, int n, int n2) {
        this(Class_1956.Method_1981(class_3238), n, n2);
    }

    public boolean Method_23876(Class_3238 class_3238) {
        if (class_3238 == this.Field_23830) {
            return this.Field_23827;
        }
        this.Field_23830 = class_3238;
        if (this.Method_23842() && this.Field_23832.Method_1715("CanDestroy", 9289 & 6169)) {
            Class_1758 class_1758 = this.Field_23832.Method_1735("CanDestroy", 8505 & -30198);
            for (int i = 16572 & 14659; i < class_1758.Method_1772(); ++i) {
                Class_3238 class_32382 = Class_3238.Method_3341(class_1758.Method_1771(i));
                if (class_32382 != class_3238) continue;
                this.Field_23827 = 12551 & 705;
                return (-17807 & 1025) != 0;
            }
        }
        this.Field_23827 = -32650 & 4224;
        return (-32764 & 9216) != 0;
    }

    public boolean Method_23877() {
        return this.Field_23831.Method_2001();
    }

    public boolean Method_23878() {
        return (this.Field_23825 > 0 && this.Method_23846() ? 11833 & 16387 : 19552 & -32639) != 0;
    }

    public void Method_23879(String string, Class_1674 class_1674) {
        if (this.Field_23832 == null) {
            this.Method_23869(new Class_1699());
        }
        this.Field_23832.Method_1744(string, class_1674);
    }

    public static boolean Method_23880(Class_23823 class_23823, Class_23823 class_238232) {
        return (class_23823 == null && class_238232 == null ? -32751 & 7203 : (class_23823 != null && class_238232 != null ? class_23823.Method_23836(class_238232) : 1072 & 18436)) != 0;
    }

    public boolean Method_23881(Class_626 class_626, Class_859 class_859) {
        return this.Field_23831.Method_1980(this, class_626, class_859);
    }

    public void Method_23882(Class_1956 class_1956) {
        this.Field_23831 = class_1956;
    }

    public void Method_23883(int n, Class_859 class_859) {
        if ((!(class_859 instanceof Class_626) || !((Class_626)class_859).Field_694.Method_18094()) && this.Method_23846() && this.Method_23847(n, class_859.Method_986())) {
            class_859.Method_936(this);
            this.Field_23826 -= -27003 & 16473;
            if (class_859 instanceof Class_626) {
                Class_626 class_626 = (Class_626)class_859;
                class_626.Method_750(Class_19863.Field_19900[Class_1956.Method_1986(this.Field_23831)]);
                if (this.Field_23826 == 0 && this.Method_23844() instanceof Class_31111) {
                    class_626.Method_744();
                }
            }
            if (this.Field_23826 < 0) {
                this.Field_23826 = 1099 & 12292;
            }
            this.Field_23825 = -14078 & 61;
        }
    }

    public Class_41140 Method_23884() {
        return this.Method_23844().Method_2022(this);
    }

    public boolean Method_23885() {
        return (this.Field_23832 != null && this.Field_23832.Method_1715("ench", 2059 & 28873) ? 4201 & 16405 : 4256 & 10253) != 0;
    }

    public static boolean Method_23886(Class_23823 class_23823, Class_23823 class_238232) {
        return (class_23823 == null && class_238232 == null ? -26039 & 16817 : (class_23823 != null && class_238232 != null ? class_23823.Method_23865(class_238232) : 1024 & 20624)) != 0;
    }

    public void Method_23887(int n) {
        if (!this.Method_23842()) {
            this.Field_23832 = new Class_1699();
        }
        this.Field_23832.Method_1739("RepairCost", n);
    }

    public boolean Method_23888() {
        return (this.Field_23834 != null ? 1189 & 513 : 18 & -30912) != 0;
    }

    public boolean Method_23889(Class_3238 class_3238) {
        if (class_3238 == this.Field_23828) {
            return this.Field_23829;
        }
        this.Field_23828 = class_3238;
        if (this.Method_23842() && this.Field_23832.Method_1715("CanPlaceOn", 20495 & 3449)) {
            Class_1758 class_1758 = this.Field_23832.Method_1735("CanPlaceOn", 13852 & 2185);
            for (int i = 1170 & 10784; i < class_1758.Method_1772(); ++i) {
                Class_3238 class_32382 = Class_3238.Method_3341(class_1758.Method_1771(i));
                if (class_32382 != class_3238) continue;
                this.Field_23829 = 275 & 18025;
                return (21601 & 147) != 0;
            }
        }
        this.Field_23829 = -21947 & 20488;
        return (8490 & -31615) != 0;
    }

    public Class_23823(Class_1956 class_1956) {
        this(class_1956, -20439 & 18759);
    }

    public void Method_23890(Class_1699 class_1699) {
        this.Field_23831 = class_1699.Method_1715("id", 29720 & 942) ? Class_1956.Method_2015(class_1699.Method_1708("id")) : Class_1956.Method_1978(class_1699.Method_1726("id"));
        this.Field_23826 = class_1699.Method_1716("Count");
        this.Field_23825 = class_1699.Method_1726("Damage");
        if (this.Field_23825 < 0) {
            this.Field_23825 = 1220 & 26914;
        }
        if (class_1699.Method_1715("tag", 1102 & -32726)) {
            this.Field_23832 = class_1699.Method_1703("tag");
            if (this.Field_23831 != null) {
                this.Field_23831.Method_1977(this.Field_23832);
            }
        }
    }

    public Class_23823(Class_1956 class_1956, int n) {
        this(class_1956, n, -32543 & 286);
    }

    public Class_23823(Class_3238 class_3238) {
        this(class_3238, 4177 & -30685);
    }

    public void Method_23891() {
        if (this.Field_23832 != null && this.Field_23832.Method_1715("display", 8731 & 1162)) {
            Class_1699 class_1699 = this.Field_23832.Method_1703("display");
            class_1699.Method_1740("Name");
            if (class_1699.Method_1736()) {
                this.Field_23832.Method_1740("display");
                if (this.Field_23832.Method_1736()) {
                    this.Method_23869(null);
                }
            }
        }
    }

    public Class_36512 Method_23892() {
        return this.Field_23834;
    }

    public String Method_23893() {
        return this.Field_23831.Method_2028(this);
    }

    public boolean Method_23894() {
        return this.Method_23844().Method_2017();
    }

    public static boolean Method_23895(Class_23823 class_23823, Class_23823 class_238232) {
        return (class_23823 == null && class_238232 == null ? 1601 & 8195 : (class_23823 != null && class_238232 != null ? (class_23823.Field_23832 == null && class_238232.Field_23832 != null ? -28604 & 32 : (class_23823.Field_23832 == null || class_23823.Field_23832.Method_1734(class_238232.Field_23832) ? 18625 & 17 : 13573 & 18648)) : 24 & -26624)) != 0;
    }

    public void Method_23896(Class_859 class_859, Class_626 class_626) {
        boolean bl = this.Field_23831.Method_1990(this, class_859, class_626);
        if (bl) {
            class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this.Field_23831)]);
        }
    }

    public void Method_23897(Class_283 class_283, Class_1061 class_1061, int n, boolean bl) {
        if (this.Field_23824 > 0) {
            this.Field_23824 -= -31715 & 161;
        }
        this.Field_23831.Method_1995(this, class_283, class_1061, n, bl);
    }

    public boolean Method_23898() {
        return (this.Method_23837() > (469 & 3073) && (!this.Method_23846() || !this.Method_23878()) ? 12801 & 2081 : 800 & 1032) != 0;
    }

    public String Method_23899() {
        Class_1699 class_1699;
        String string = this.Method_23844().Method_2030(this);
        if (this.Field_23832 != null && this.Field_23832.Method_1715("display", 8586 & 16398) && (class_1699 = this.Field_23832.Method_1703("display")).Method_1715("Name", -28663 & 8716)) {
            string = class_1699.Method_1708("Name");
        }
        return string;
    }

    public Class_1782 Method_23900() {
        Class_2840 class_2840 = new Class_2840(this.Method_23899());
        if (this.Method_23851()) {
            class_2840.\u0000strictfp().Method_2928((8195 & 4777) != 0);
        }
        Class_1782 class_1782 = new Class_2840("[").\u0000strictfp((Class_1782)class_2840).Method_1785("]");
        if (this.Field_23831 != null) {
            Class_1699 class_1699 = new Class_1699();
            this.Method_23841(class_1699);
            class_1782.Method_1789().Method_2936(new Class_44868(Class_14202.Field_14206, new Class_2840(class_1699.Method_1729())));
            class_1782.Method_1789().Method_2917(this.Method_23884().Field_41144);
        }
        return class_1782;
    }

    public void Method_23901(Class_36512 class_36512) {
        this.Field_23834 = class_36512;
    }
}

