/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonParseException
 *  internal.org.lwjgl.input.Keyboard
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_31239
extends Class_1490 {
    private static final Class_2080 Field_31240;
    private Class_45394 Field_31241;
    private int Field_31242;
    private final Class_23823 Field_31243;
    private int Field_31244 = -30268 & 9416;
    private int Field_31245 = 12736 & 210;
    private final boolean Field_31246;
    private static final Logger Field_31247;
    private int Field_31248 = -1 & -1;
    private boolean Field_31249;
    private String Field_31250 = "";
    private List Field_31251;
    private Class_1758 Field_31252;
    private Class_42376 Field_31253;
    private int Field_31254;
    private Class_42376 Field_31255;
    private final Class_626 Field_31256;
    private Class_42376 Field_31257;
    private boolean Field_31258;
    private Class_45394 Field_31259;
    private int Field_31260 = 145 & 10241;
    private Class_42376 Field_31261;

    protected void Method_31262(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == 0) {
                this.\u0000strictfp.Method_218(null);
                this.Method_31272((-27712 & 8213) != 0);
            } else if (class_42376.Field_42392 == (12435 & -30717) && this.Field_31246) {
                this.Field_31258 = 2593 & 16397;
            } else if (class_42376.Field_42392 == (-14255 & 1029)) {
                if (this.Field_31254 < this.Field_31260 - (22085 & 17)) {
                    this.Field_31254 += 1 & -29367;
                } else if (this.Field_31246) {
                    this.Method_31274();
                    if (this.Field_31254 < this.Field_31260 - (10025 & 16387)) {
                        this.Field_31254 += 16517 & 275;
                    }
                }
            } else if (class_42376.Field_42392 == (5378 & -14330)) {
                if (this.Field_31254 > 0) {
                    this.Field_31254 -= -32765 & 24037;
                }
            } else if (class_42376.Field_42392 == (16645 & 151) && this.Field_31258) {
                this.Method_31272((129 & -31677) != 0);
                this.\u0000strictfp.Method_218(null);
            } else if (class_42376.Field_42392 == (6 & 2068) && this.Field_31258) {
                this.Field_31258 = 1152 & -24315;
            }
            this.Method_31269();
        }
    }

    public void Method_31263() {
        Keyboard.enableRepeatEvents((-16383 & 4126) != 0);
    }

    protected void Method_31264(int n, int n2, int n3) {
        Class_1782 class_1782;
        if (n3 == 0 && this.Method_31273(class_1782 = this.Method_31275(n, n2))) {
            return;
        }
        super.Method_1537(n, n2, n3);
    }

    private void Method_31265(char c, int n) {
        switch (n) {
            case 14: {
                if (!this.Field_31250.isEmpty()) {
                    this.Field_31250 = this.Field_31250.substring(6589 & 16384, this.Field_31250.length() - (-32503 & 8243));
                    this.Method_31269();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!this.Field_31250.isEmpty()) {
                    this.Method_31272((8713 & -9083) != 0);
                    this.\u0000strictfp.Method_218(null);
                }
                return;
            }
        }
        if (this.Field_31250.length() < (19100 & 8241) && Class_12053.Method_12057(c)) {
            this.Field_31250 = this.Field_31250 + Character.toString(c);
            this.Method_31269();
            this.Field_31249 = 1185 & 17155;
        }
    }

    private void Method_31266(String string) {
        String string2 = this.Method_31267();
        String string3 = string2 + string;
        int n = this.\u0000strictfp.Method_28722(string3 + "" + (Object)((Object)Class_5478.Field_5508) + "_", 246 & -32642);
        if (n <= (128 & 158) && string3.length() < (-6840 & 4371)) {
            this.Method_31278(string3);
        }
    }

    private String Method_31267() {
        return this.Field_31252 != null && this.Field_31254 >= 0 && this.Field_31254 < this.Field_31252.Method_1772() ? this.Field_31252.Method_1771(this.Field_31254) : "";
    }

    static Class_2080 Method_31268() {
        return Field_31240;
    }

    private void Method_31269() {
        this.Field_31259.\u0000, ` = !this.Field_31258 && (this.Field_31254 < this.Field_31260 - (93 & -11647) || this.Field_31246) ? 5 & 1769 : 5120 & 96;
        this.Field_31241.\u0000, ` = !this.Field_31258 && this.Field_31254 > 0 ? 7 & 21617 : 7747 & 16656;
        this.Field_31257.Field_42378 = !this.Field_31246 || !this.Field_31258 ? 17425 & -24479 : 18834 & -28152;
        int n = this.Field_31257.Field_42378 ? 1 : 0;
        if (this.Field_31246) {
            this.Field_31255.Field_42378 = !this.Field_31258 ? 3859 & 4261 : -31609 & 32;
            this.Field_31253.Field_42378 = this.Field_31258;
            this.Field_31261.Field_42378 = this.Field_31258;
            this.Field_31261.Field_42388 = this.Field_31250.trim().length() > 0 ? 8229 & -30701 : -30195 & 29952;
        }
    }

    public void Method_31270() {
        super.Method_1517();
        if (Class_18.Field_89.Field_127.Field_2178 > 0) {
            this.Field_31242 += -23163 & 2073;
        }
    }

    public Class_31239(Class_626 class_626, Class_23823 class_23823, boolean bl) {
        this.Field_31256 = class_626;
        this.Field_31243 = class_23823;
        this.Field_31246 = bl;
        if (class_23823.Method_23842()) {
            Class_1699 class_1699 = class_23823.Method_23845();
            this.Field_31252 = class_1699.Method_1735("pages", 17022 & 2184);
            if (this.Field_31252 != null) {
                this.Field_31252 = (Class_1758)this.Field_31252.Method_1762();
                this.Field_31260 = this.Field_31252.Method_1772();
                if (this.Field_31260 < (24667 & 33)) {
                    this.Field_31260 = 24593 & -31775;
                }
            }
        }
        if (this.Field_31252 == null && bl) {
            this.Field_31252 = new Class_1758();
            this.Field_31252.Method_1781(new Class_1746(""));
            this.Field_31260 = 13329 & 5;
        }
    }

    private static String Method_31271(String string) {
        int n = 9744;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31239.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_31272(boolean bl) {
        if (this.Field_31246 && this.Field_31249 && this.Field_31252 != null) {
            Object object;
            while (this.Field_31252.Method_1772() > (24839 & -25055) && ((String)(object = this.Field_31252.Method_1771(this.Field_31252.Method_1772() - (-8155 & 4305)))).length() == 0) {
                this.Field_31252.Method_1767(this.Field_31252.Method_1772() - (569 & 15809));
            }
            if (this.Field_31243.Method_23842()) {
                object = this.Field_31243.Method_23845();
                ((Class_1699)object).Method_1744("pages", this.Field_31252);
            } else {
                this.Field_31243.Method_23879("pages", this.Field_31252);
            }
            object = "MC|BEdit";
            if (bl) {
                object = "MC|BSign";
                this.Field_31243.Method_23879("author", new Class_1746(this.Field_31256.Method_825()));
                this.Field_31243.Method_23879("title", new Class_1746(this.Field_31250.trim()));
                for (int i = 8640 & 1059; i < this.Field_31252.Method_1772(); ++i) {
                    String string = this.Field_31252.Method_1771(i);
                    Class_2840 class_2840 = new Class_2840(string);
                    string = Class_2814.Method_2821(class_2840);
                    this.Field_31252.Method_1780(i, new Class_1746(string));
                }
                this.Field_31243.Method_23882(Class_10527.Field_10671);
            }
            Class_29900 class_29900 = new Class_29900(Class_16620.Method_16633());
            class_29900.Method_29984(this.Field_31243);
            this.\u0000strictfp.Method_271().Method_20245(new Class_28799((String)object, class_29900));
        }
    }

    protected boolean Method_31273(Class_1782 class_1782) {
        Class_21230 class_21230;
        Class_21230 class_212302 = class_21230 = class_1782 == null ? null : class_1782.Method_1789().Method_2913();
        if (class_21230 == null) {
            return (789 & 96) != 0;
        }
        if (class_21230.Method_21236() == Class_17245.Field_17247) {
            String string = class_21230.Method_21237();
            try {
                int n = Integer.parseInt(string) - (4327 & 26625);
                if (n >= 0 && n < this.Field_31260 && n != this.Field_31254) {
                    this.Field_31254 = n;
                    this.Method_31269();
                    return (-23167 & 39) != 0;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return (-32448 & 2082) != 0;
        }
        boolean bl = super.Method_1514(class_1782);
        if (bl && class_21230.Method_21236() == Class_17245.Field_17246) {
            this.\u0000strictfp.Method_218(null);
        }
        return bl;
    }

    private void Method_31274() {
        if (this.Field_31252 != null && this.Field_31252.Method_1772() < (58 & 2610)) {
            this.Field_31252.Method_1781(new Class_1746(""));
            this.Field_31260 += -19039 & 3;
            this.Field_31249 = -32239 & 5221;
        }
    }

    public Class_1782 Method_31275(int n, int n2) {
        if (this.Field_31251 == null) {
            return null;
        }
        int n3 = n - (this.\u0000= final - this.Field_31244) / (-23998 & 16651) - (1140 & 28718);
        int n4 = n2 - (770 & -28514) - (24596 & 4240) - (4376 & -29008);
        if (n3 >= 0 && n4 >= 0) {
            int n5 = Math.min((-8016 & 5768) / (41 & 7439), this.Field_31251.size());
            if (n3 <= (628 & -29571)) {
                if (n4 < (12553 & -13285) * n5 + n5) {
                    int n6 = n4 / (9741 & -14135);
                    if (n6 >= 0 && n6 < this.Field_31251.size()) {
                        Class_1782 class_1782 = (Class_1782)this.Field_31251.get(n6);
                        int n7 = -32632 & 3588;
                        for (Class_1782 class_17822 : class_1782) {
                            if (!(class_17822 instanceof Class_2840) || (n7 += this.\u0000strictfp.Field_27.Method_28715(((Class_2840)class_17822).Method_2848())) <= n3) continue;
                            return class_17822;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private void Method_31276() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_31277(char c, int n) {
        super.Method_1525(c, n);
        if (this.Field_31246) {
            if (this.Field_31258) {
                this.Method_31265(c, n);
            } else {
                this.Method_31281(c, n);
            }
        }
    }

    private void Method_31278(String string) {
        if (this.Field_31252 != null && this.Field_31254 >= 0 && this.Field_31254 < this.Field_31252.Method_1772()) {
            this.Field_31252.Method_1780(this.Field_31254, new Class_1746(string));
            this.Field_31249 = -16123 & 169;
        }
    }

    public void Method_31279(int n, int n2, float f) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_31240);
        int n3 = (this.\u0000= final - this.Field_31244) / (13314 & 2883);
        int n4 = -32746 & 21834;
        this.\u0000strictfp(n3, n4, 4609 & 2134, 32 & 9752, this.Field_31244, this.Field_31245);
        if (this.Field_31258) {
            String string = this.Field_31250;
            if (this.Field_31246) {
                string = this.Field_31242 / (14478 & 18215) % (8962 & 18486) == 0 ? string + "" + (Object)((Object)Class_5478.Field_5508) + "_" : string + "" + (Object)((Object)Class_5478.Field_5480) + "_";
            }
            String string2 = Class_9802.Method_9806("book.editTitle", new Object[-16135 & 9732]);
            int n5 = this.\u0000strictfp.Method_28715(string2);
            this.\u0000strictfp.Method_28692(string2, n3 + (4391 & 44) + ((22773 & 1396) - n5) / (16138 & -32666), n4 + (1810 & 10488) + (24312 & 17), 24664 & 6180);
            int n6 = this.\u0000strictfp.Method_28715(string);
            this.\u0000strictfp.Method_28692(string, n3 + (18724 & -31059) + ((-24460 & 4212) - n6) / (8202 & 6678), n4 + (2101 & 20850), 65 & -8148);
            Object[] arrobject = new Object[21039 & 9553];
            arrobject[8516 & -28015] = this.Field_31256.Method_825();
            String string3 = Class_9802.Method_9806("book.byAuthor", arrobject);
            int n7 = this.\u0000strictfp.Method_28715(string3);
            this.\u0000strictfp.Method_28692((Object)((Object)Class_5478.Field_5488) + string3, n3 + (12341 & 17508) + ((12916 & 16756) - n7) / (2618 & 8455), n4 + (-15310 & 304) + (-9270 & 26), 17216 & -24544);
            String string4 = Class_9802.Method_9806("book.finalizeWarning", new Object[-16383 & 1310]);
            this.\u0000strictfp.Method_28688(string4, n3 + (1060 & 126), n4 + (27217 & -32686), 16500 & 6524, 517 & 72);
        } else {
            Object[] arrobject = new Object[262 & -22486];
            arrobject[17484 & 2864] = this.Field_31254 + (1169 & -7935);
            arrobject[27065 & -31743] = this.Field_31260;
            String string = Class_9802.Method_9806("book.pageIndicator", arrobject);
            String string5 = "";
            if (this.Field_31252 != null && this.Field_31254 >= 0 && this.Field_31254 < this.Field_31252.Method_1772()) {
                string5 = this.Field_31252.Method_1771(this.Field_31254);
            }
            if (this.Field_31246) {
                string5 = this.\u0000strictfp.Method_28707() ? string5 + "_" : (this.Field_31242 / (4391 & 25798) % (9571 & 16402) == 0 ? string5 + "" + (Object)((Object)Class_5478.Field_5508) + "_" : string5 + "" + (Object)((Object)Class_5478.Field_5480) + "_");
            } else if (this.Field_31248 != this.Field_31254) {
                Class_1782 class_1782;
                if (Class_38466.Method_38470(this.Field_31243.Method_23845())) {
                    try {
                        class_1782 = Class_2814.Method_2819(string5);
                        this.Field_31251 = class_1782 != null ? Class_17908.Method_17911(class_1782, 380 & 116, this.\u0000strictfp, (109 & 16403) != 0, (3089 & 4357) != 0) : null;
                    }
                    catch (JsonParseException jsonParseException) {
                        this.Field_31251 = null;
                    }
                } else {
                    class_1782 = new Class_2840(Class_5478.Field_5502.Method_5540() + "* Invalid book tag *");
                    this.Field_31251 = Lists.newArrayList((Iterable)class_1782);
                }
                this.Field_31248 = this.Field_31254;
            }
            int n8 = this.\u0000strictfp.Method_28715(string);
            this.\u0000strictfp.Method_28692(string, n3 - n8 + this.Field_31244 - (8556 & -15186), n4 + (-2536 & 2096), 326 & 5161);
            if (this.Field_31251 == null) {
                this.\u0000strictfp.Method_28688(string5, n3 + (7484 & 742), n4 + (18448 & 336) + (8336 & 21), 8959 & 16500, 13378 & 2453);
            } else {
                int n9 = Math.min((2952 & 1232) / (10537 & 16603), this.Field_31251.size());
                for (int i = 6117 & 10256; i < n9; ++i) {
                    Class_1782 class_1782 = (Class_1782)this.Field_31251.get(i);
                    this.\u0000strictfp.Method_28692(class_1782.Method_1788(), n3 + (17196 & -27531), n4 + (8208 & 3216) + (16 & -26562) + i * (-9703 & 8205), 16419 & 1300);
                }
                Class_1782 class_1782 = this.Method_31275(n, n2);
                if (class_1782 != null) {
                    this.\u0000strictfp(class_1782, n, n2);
                }
            }
        }
        super.Method_1545(n, n2, f);
    }

    public void Method_31280() {
        this.\u0000strictfp.clear();
        Keyboard.enableRepeatEvents((3 & 20629) != 0);
        if (this.Field_31246) {
            this.Field_31255 = new Class_42376(-12285 & 795, this.\u0000= final / (17154 & 4155) - (486 & 17020), (724 & 17444) + this.Field_31245, 24675 & -31134, -28394 & 2645, Class_9802.Method_9806("book.signButton", new Object[3339 & 4224]));
            this.\u0000strictfp.add(this.Field_31255);
            this.Field_31257 = new Class_42376(16961 & -31488, this.\u0000= final / (12395 & 16390) + (2054 & 16514), (17237 & 1028) + this.Field_31245, 3174 & 12402, -30572 & 5143, Class_9802.Method_9806("gui.done", new Object[16418 & 4737]));
            this.\u0000strictfp.add(this.Field_31257);
            this.Field_31261 = new Class_42376(8589 & 22597, this.\u0000= final / (17414 & 2610) - (13412 & 18676), (16900 & 8204) + this.Field_31245, 106 & 243, 116 & 21525, Class_9802.Method_9806("book.finalizeButton", new Object[4881 & -29534]));
            this.\u0000strictfp.add(this.Field_31261);
            this.Field_31253 = new Class_42376(16733 & 4260, this.\u0000= final / (2270 & 16675) + (66 & 10883), (5764 & -30451) + this.Field_31245, -8094 & 7270, 8276 & 5780, Class_9802.Method_9806("gui.cancel", new Object[25612 & 258]));
            this.\u0000strictfp.add(this.Field_31253);
        } else {
            this.Field_31257 = new Class_42376(2048 & -28092, this.\u0000= final / (8879 & 19522) - (-28553 & 876), (9375 & 36) + this.Field_31245, -16422 & 16588, 20052 & -24556, Class_9802.Method_9806("gui.done", new Object[-23552 & 2272]));
            this.\u0000strictfp.add(this.Field_31257);
        }
        int n = (this.\u0000= final - this.Field_31244) / (9226 & 4867);
        int n2 = 29066 & 2130;
        this.Field_31259 = new Class_45394(16391 & 2417, n + (-14084 & 1400), n2 + (4250 & -23334), (3653 & -15965) != 0);
        this.\u0000strictfp.add(this.Field_31259);
        this.Field_31241 = new Class_45394(-16381 & 3010, n + (6006 & -32601), n2 + (2206 & 16794), (14336 & 642) != 0);
        this.\u0000strictfp.add(this.Field_31241);
        this.Method_31269();
    }

    static {
        Field_31247 = LogManager.getLogger();
        Field_31240 = new Class_2080(Class_31239.Method_31271("\u04f0\u04e1\u04f8\u04f1\u04f4\u04f5\u04e4\u04f5\u04a8\u04e1\u04f0\u04e9\u04ac\u04e5\u04ec\u04ed\u04f8\u04b9\u04e0\u04f9\u04f4"));
    }

    private void Method_31281(char c, int n) {
        if (Class_1490.Method_1512(n)) {
            this.Method_31266(Class_1490.Method_1523());
        } else {
            switch (n) {
                case 14: {
                    String string = this.Method_31267();
                    if (string.length() > 0) {
                        this.Method_31278(string.substring(4209 & -16384, string.length() - (-14207 & 7)));
                    }
                    return;
                }
                case 28: 
                case 156: {
                    this.Method_31266("\n");
                    return;
                }
            }
            if (Class_12053.Method_12057(c)) {
                this.Method_31266(Character.toString(c));
            }
        }
    }
}

