/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GLContext
 *  internal.org.lwjgl.util.glu.Project
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GLContext;
import internal.org.lwjgl.util.glu.Project;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_1578
extends Class_1490
implements Class_1549 {
    private int Field_1579;
    private static final Class_2080[] Field_1580;
    private static final AtomicInteger Field_1581;
    public static final Class_2080 Field_1582;
    private String Field_1583;
    private static final Random Field_1584;
    private float Field_1585;
    private int Field_1586;
    private String Field_1587 = Field_1597;
    public static Class_2080 Field_1588;
    private int Field_1589;
    private static final Logger Field_1590;
    private String Field_1591;
    private String Field_1592 = "missingno";
    private float Field_1593;
    private Class_42376 Field_1594;
    private int Field_1595;
    private int Field_1596;
    public static final String Field_1597;
    private final Object Field_1598 = new Object();
    private Class_47630 Field_1599;
    private boolean Field_1600 = 10337 & 129;
    private static final Class_2080 Field_1601;
    private static final Class_2080 Field_1602;
    private int Field_1603;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void Method_1604(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        Object object = this.Field_1598;
        synchronized (object) {
            if (this.Field_1591.length() > 0 && n >= this.Field_1595 && n <= this.Field_1579 && n2 >= this.Field_1603 && n2 <= this.Field_1589) {
                Class_26170 class_26170 = new Class_26170(this, this.Field_1583, 13629 & 13, (97 & -30711) != 0);
                class_26170.Method_26177();
                this.\u0000strictfp.Method_218(class_26170);
            }
        }
    }

    private void Method_1605(int n, int n2, float f) {
        this.\u0000strictfp.Method_164().Method_19155();
        Class_16867.Method_16910(-32256 & 24576, 170 & 13312, 320 & 1410, 18308 & -22205);
        this.Method_1611(n, n2, f);
        this.Method_1621(f);
        this.Method_1621(f);
        this.Method_1621(f);
        this.Method_1621(f);
        this.Method_1621(f);
        this.Method_1621(f);
        this.Method_1621(f);
        this.\u0000strictfp.Method_164().Method_19152((5133 & -16365) != 0);
        Class_16867.Method_16910(1 & 25142, 5184 & 8464, this.\u0000strictfp.Field_80, this.\u0000strictfp.Field_44);
        float f2 = this.\u0000= final > this.\u0000, ` ? 1.011236f * 118.666664f / (float)this.\u0000= final : 0.6969697f * 172.17392f / (float)this.\u0000, `;
        float f3 = (float)this.\u0000, ` * f2 / (296.15686f * 0.86440676f);
        float f4 = (float)this.\u0000= final * f2 / (7.857143f * 32.581818f);
        int n3 = this.\u0000= final;
        int n4 = this.\u0000, `;
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(-28665 & 10311, Class_29585.Field_29586);
        class_22385.Method_22443(0.0, n4, this.\u0000strictfp).Method_22433(4.6666665f * 0.10714286f - f3, 1.5111111f * 0.33088234f + f4).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_22385.Method_22443(n3, n4, this.\u0000strictfp).Method_22433(0.071428575f * 7.0f - f3, 0.71052635f * 0.7037037f - f4).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_22385.Method_22443(n3, 0.0, this.\u0000strictfp).Method_22433(29.0f * 0.01724138f + f3, 2.047619f * 0.24418604f - f4).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_22385.Method_22443(0.0, 0.0, this.\u0000strictfp).Method_22433(0.48924732f * 1.021978f + f3, 0.02173913f * 23.0f + f4).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_7644.Method_7647();
    }

    private void Method_1606() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_1607(String string) {
        int n = 18396;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_1578() {
        BufferedReader bufferedReader = null;
        try {
            String string;
            ArrayList arrayList = Lists.newArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(Class_18.Field_89.Method_208().Method_282(Field_1602).Method_9958(), Charsets.UTF_8));
            while ((string = bufferedReader.readLine()) != null) {
                if ((string = string.trim()).isEmpty()) continue;
                arrayList.add(string);
            }
            if (!arrayList.isEmpty()) {
                do {
                    this.Field_1592 = (String)arrayList.get(Field_1584.nextInt(arrayList.size()));
                } while (this.Field_1592.hashCode() == (-2013281489 & 662660911));
            }
        }
        catch (IOException iOException) {
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
            }
        }
        this.Field_1585 = Field_1584.nextFloat();
        this.Field_1591 = "";
        if (!GLContext.getCapabilities().OpenGL20 && !Class_32876.Method_32965()) {
            this.Field_1591 = Class_9802.Method_9806("title.oldgl1", new Object[6540 & 563]);
            this.Field_1587 = Class_9802.Method_9806("title.oldgl2", new Object[5120 & 2183]);
            this.Field_1583 = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
        }
    }

    private static String Method_1608(String string) {
        int n = 11573;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_1609(char c, int n) {
    }

    private static String Method_1610(String string) {
        int n = 28964;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_1611(int n, int n2, float f) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16934(-8365 & 5921);
        Class_16867.Method_16961();
        Class_16867.Method_16962();
        Project.gluPerspective((float)(1.0416666f * 115.200005f), (float)1.0f, (float)(15.666667f * 0.0031914893f), (float)(1.0476191f * 9.545454f));
        Class_16867.Method_16934(6043 & -2268);
        Class_16867.Method_16961();
        Class_16867.Method_16962();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16940(0.05376344f * 3348.0f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(213.75f * 0.42105263f, 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16947();
        Class_16867.Method_16985();
        Class_16867.Method_16969();
        Class_16867.Method_16930((1812 & 6147) != 0);
        Class_16867.Method_16984(17302 & 10026, 17183 & 1795, 145 & 333, 17537 & 2566);
        int n3 = 4104 & 18460;
        for (int i = 25524 & 1091; i < n3 * n3; ++i) {
            Class_16867.Method_16961();
            float f2 = ((float)(i % n3) / (float)n3 - 2.8235295f * 0.17708333f) / (97.18518f * 0.6585366f);
            float f3 = ((float)(i / n3) / (float)n3 - 0.1764706f * 2.8333333f) / (0.81333333f * 78.68852f);
            float f4 = 0.0f;
            Class_16867.Method_16943(f2, f3, f4);
            Class_16867.Method_16940(Class_13337.Method_13370(this.Field_1593 / (584.61536f * 0.68421054f)) * (0.3253012f * 76.85185f) + 0.43010753f * 46.5f, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16940(-this.Field_1593 * (0.022222223f * 4.5f), 0.0f, 1.0f, 0.0f);
            for (int j = 3201 & -32492; j < (6678 & -31730); ++j) {
                Class_16867.Method_16961();
                if (j == (2139 & 20741)) {
                    Class_16867.Method_16940(1278.0f * 0.07042254f, 0.0f, 1.0f, 0.0f);
                }
                if (j == (19467 & -24378)) {
                    Class_16867.Method_16940(0.5510204f * 326.6667f, 0.0f, 1.0f, 0.0f);
                }
                if (j == (9223 & -9581)) {
                    Class_16867.Method_16940(-226.15385f * 0.39795917f, 0.0f, 1.0f, 0.0f);
                }
                if (j == (18182 & -30651)) {
                    Class_16867.Method_16940(0.53535354f * 168.1132f, 1.0f, 0.0f, 0.0f);
                }
                if (j == (8677 & 6149)) {
                    Class_16867.Method_16940(-76.7647f * 1.1724138f, 1.0f, 0.0f, 0.0f);
                }
                this.\u0000strictfp.Method_253().Method_34707(Field_1580[j]);
                class_22385.Method_22417(-29361 & 4103, Class_29585.Field_29586);
                int n4 = (6399 & -23297) / (i + (-28251 & 2131));
                float f5 = 0.0f;
                class_22385.Method_22443(-0.5217391304347826 * 1.9166666666666667, 5.75 * -0.17391304347826086, 1.0).Method_22433(0.0, 0.0).Method_22424(-30465 & 9471, -31745 & 2303, -32513 & 255, n4).Method_22451();
                class_22385.Method_22443(1.0, -46.0 * 0.021739130434782608, 1.0).Method_22433(1.0, 0.0).Method_22424(1535 & 4351, 9471 & 4351, 11519 & 255, n4).Method_22451();
                class_22385.Method_22443(1.0, 1.0, 1.0).Method_22433(1.0, 1.0).Method_22424(17919 & -32513, 4351 & 9215, 1791 & 255, n4).Method_22451();
                class_22385.Method_22443(1.305084745762712 * -0.7662337662337662, 1.0, 1.0).Method_22433(0.0, 1.0).Method_22424(8703 & 3839, 14335 & 2303, 255 & 25855, n4).Method_22451();
                class_7644.Method_7647();
                Class_16867.Method_16945();
            }
            Class_16867.Method_16945();
            Class_16867.Method_16923((-24251 & 4657) != 0, (20241 & -32735) != 0, (-11711 & 131) != 0, (2056 & 4) != 0);
        }
        class_22385.Method_22444(0.0, 0.0, 0.0);
        Class_16867.Method_16923((19009 & 4099) != 0, (165 & 2371) != 0, (-14333 & 9545) != 0, (-6975 & 549) != 0);
        Class_16867.Method_16934(8009 & 6019);
        Class_16867.Method_16945();
        Class_16867.Method_16934(30468 & 5888);
        Class_16867.Method_16945();
        Class_16867.Method_16930((-31647 & 25217) != 0);
        Class_16867.Method_16979();
        Class_16867.Method_16927();
    }

    static {
        Field_1581 = new AtomicInteger(3456 & 4099);
        Field_1590 = LogManager.getLogger();
        Field_1584 = new Random();
        Field_1602 = new Class_2080(Class_1578.Method_1610("\u6004\u6005\u6000\u6005\u6004\u6001\u6004\u6005\u6004\u6001\u6000\u6001\u6000\u6005\u6000\u6001\u6010\u6015"));
        Field_1601 = new Class_2080(Class_1578.Method_1608("\u08e4\u08f5\u08e2\u08e6\u08e1\u08e6\u08f3\u08e5\u08b7\u08f7\u08e7\u08f3\u08b3\u08e0\u08f7\u08e2\u08f4\u08f5\u08b5\u08f7\u08f5\u08f2\u08f3\u08f5\u08e2\u08f1\u08f4\u08e6\u08b2\u08e4\u08f0\u08f1"));
        Field_1582 = new Class_2080(Class_1578.Method_1622("\ud163\ud162\ud16b\ud163\ud166\ud165\ud166\ud164\ud120\ud169\ud163\ud16a\ud165\ud166\ud165\ud16c\ud173\ud172\ud170\ud178\ud13c\ud175\ud176\ud174\ud170\ud178\ud179\ud170\ud17e\ud175\ud17f\ud135\ud163\ud169\ud160"));
        Class_2080[] arrclass_2080 = new Class_2080[1559 & 16462];
        arrclass_2080[10 & -28128] = new Class_2080(Class_1578.Method_1607("\u84c2\u84d3\u84c6\u84c3\u84c6\u84c1\u84d6\u84c1\u8498\u84d9\u84ca\u84df\u849c\u84cf\u84da\u84cf\u84d2\u84d3\u8490\u84d5\u84d2\u84d1\u84d0\u84d5\u84cc\u84d9\u84ca\u84d9\u84de\u849d\u84ca\u84db\u84f0\u84f1\u84e4\u84f7\u84f6\u84f3\u84c4\u84a3\u84b8\u84ef\u84f8\u84f9"));
        arrclass_2080[-32511 & 8235] = new Class_2080(Class_1578.Method_1624("\u03a4\u03b5\u03a0\u03a4\u03a5\u03a2\u03b5\u03a3\u03bf\u03bf\u03ad\u03b9\u03bf\u03ac\u03b9\u03ac\u03a4\u03a5\u03a7\u03a2\u03a1\u03a3\u03a3\u03a7\u03ba\u03af\u03bd\u03ae\u03ac\u03af\u03b8\u03a9\u0396\u0397\u0382\u0391\u0395\u0391\u03a7\u0381\u039e\u0388\u039e\u039f"));
        arrclass_2080[2306 & 8338] = new Class_2080(Class_1578.Method_1627("\ue04e\ue04e\ue042\ue04f\ue04b\ue04d\ue04b\ue04c\ue00d\ue044\ue047\ue04a\ue009\ue043\ue04f\ue043\ue046\ue04e\ue005\ue049\ue04f\ue04c\ue045\ue048\ue040\ue04c\ue047\ue04d\ue042\ue008\ue046\ue046\ue044\ue044\ue048\ue04a\ue043\ue04e\ue041\ue00d\ue00c\ue043\ue04c\ue044"));
        arrclass_2080[25283 & -30717] = new Class_2080(Class_1578.Method_1615("\u0210\u0200\u021a\u0212\u0214\u0214\u0206\u0216\u0240\u0208\u021a\u0202\u0244\u021c\u0206\u021e\u0218\u0210\u025a\u0212\u0214\u0214\u021e\u0216\u0208\u0210\u020a\u0212\u021c\u0254\u020e\u021e\u0208\u0208\u0212\u0202\u020c\u0204\u021e\u0256\u0240\u0218\u0202\u020a"));
        arrclass_2080[-32700 & 390] = new Class_2080(Class_1578.Method_1614("\u8e08\u8e08\u8e00\u8e08\u8e0c\u8e0c\u8e0c\u8e0c\u8e40\u8e08\u8e08\u8e00\u8e44\u8e0c\u8e04\u8e0c\u8e10\u8e18\u8e50\u8e18\u8e1c\u8e1c\u8e14\u8e1c\u8e18\u8e10\u8e18\u8e10\u8e1c\u8e54\u8e1c\u8e1c\u8e20\u8e20\u8e28\u8e28\u8e24\u8e2c\u8e24\u8e6c\u8e60\u8e28\u8e20\u8e28"));
        arrclass_2080[-23611 & 4135] = new Class_2080(Class_1578.Method_1619("\u8000\u8010\u8008\u8000\u8000\u8000\u8010\u8000\u8050\u8018\u8008\u8010\u8050\u8008\u8010\u8008\u8018\u8010\u8058\u8010\u8010\u8010\u8018\u8010\u8008\u8010\u8008\u8010\u8018\u8050\u8008\u8018\u8038\u8038\u8020\u8030\u8038\u8030\u8028\u8060\u8070\u8028\u8030\u8038"));
        Field_1580 = arrclass_2080;
        Field_1597 = Class_1578.Method_1625("\u0801\u0818\u0812\u0813\u0802\u0811\u0813\u0811\u0811\u0811\u0818\u0811\u0819") + (Object)((Object)Class_5478.Field_5506) + Class_1578.Method_1612("\uc282\uc283\uc292\uc281") + (Object)((Object)Class_5478.Field_5507) + Class_1578.Method_1620("\u6940\u6903\u690b\u6903\u6940\u6908\u690b\u6903\u6909\u6949\u6901\u6903\u690a\u6902\u690a\u6900\u6911\u6911\u6919\u691a\u691a\u695b");
    }

    private static String Method_1612(String string) {
        int n = 24794;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_1613(int n, int n2, float f) {
        Class_16867.Method_16985();
        this.Method_1605(n, n2, f);
        Class_16867.Method_16913();
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        int n3 = 15131 & 16658;
        int n4 = this.\u0000= final / (66 & -5885) - n3 / (-31214 & 30735);
        int n5 = 8862 & 30;
        this.\u0000, `(12418 & 18000, 31320 & 6, this.\u0000= final, this.\u0000, `, -2130706433 & -1442840577, 452984831 & 553648127);
        this.\u0000, `(817 & 1162, 19216 & 8264, this.\u0000= final, this.\u0000, `, -11863 & 3072, -2130427644 & -2102293504);
        this.\u0000strictfp.Method_253().Method_34707(Field_1601);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        if ((double)this.Field_1585 < 1.962962962962963 * 5.09433962264151E-5) {
            this.\u0000strictfp(n4 + (1036 & 8368), n5 + (514 & 1), -32603 & 18200, 9355 & 17184, 8551 & 16483, 2093 & -28628);
            this.\u0000strictfp(n4 + (4723 & 2403), n5 + (1606 & -7903), 22657 & 1921, -27198 & 2053, 91 & 27807, 4142 & 17645);
            this.\u0000strictfp(n4 + (-32669 & 23283) + (12474 & 18526), n5 + (82 & 26660), 382 & -1922, -24650 & 9, 10275 & 16523, 28012 & -32594);
            this.\u0000strictfp(n4 + (7011 & 8427) + (11326 & 16410) + (2691 & 24699), n5 + (9796 & -32736), 231 & -17053, 13448 & 19248, 7355 & 862, 16556 & 7212);
            this.\u0000strictfp(n4 + (5275 & 191), n5 + (-27995 & 8194), 4610 & -24535, 11965 & 45, 5023 & 8347, 2157 & 20524);
        } else {
            this.\u0000strictfp(n4 + (16456 & -28528), n5 + (-24568 & 4482), 5258 & 8272, 1170 & 2337, 16571 & 3227, 5180 & -29969);
            this.\u0000strictfp(n4 + (-9573 & 1179), n5 + (-32152 & 4354), 2324 & 682, 1069 & -32083, 18079 & 4251, -2132 & 2093);
        }
        Class_16867.Method_16961();
        Class_16867.Method_16943(this.\u0000= final / (27 & -12794) + (16507 & 346), 717.5f * 0.09756097f, 0.0f);
        Class_16867.Method_16940(-10.333334f * 1.9354838f, 0.0f, 0.0f, 1.0f);
        float f2 = 0.5142857f * 3.5f - Class_13337.Method_13369(Class_13337.Method_13370((float)(Class_18.Method_207() % (171000828L & 20980712L)) / (0.08571429f * 11666.666f) * (4.3333335f * 0.7249829f) * 2.0f) * (0.09411765f * 1.0625f));
        f2 = f2 * (211.53847f * 0.47272727f) / (float)(this.\u0000strictfp.Method_28715(this.Field_1592) + (2104 & 8609));
        Class_16867.Method_16973(f2, f2, f2);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_1592, -31480 & 4113, -8 & -4, -120 & -254);
        Class_16867.Method_16945();
        String string = "Minecraft 1.8.8";
        if (this.\u0000strictfp.Method_183()) {
            string = string + " Demo";
        }
        String string2 = "BlazingPack is not affiliated with Mojang AB";
        this.\u0000, `(this.\u0000strictfp, string2, this.\u0000= final - this.\u0000strictfp.Method_28715(string2) - (306 & -17406), this.\u0000, ` - (24630 & 2583), -1 & -1);
        this.\u0000, `(this.\u0000strictfp, string, -31862 & 9222, this.\u0000, ` - (24906 & 523), -1 & -1);
        String string3 = "Copyright Mojang AB. Do not distribute!";
        this.\u0000, `(this.\u0000strictfp, string3, this.\u0000= final - this.\u0000strictfp.Method_28715(string3) - (-28138 & 10242), this.\u0000, ` - (2314 & 25290), -1 & -1);
        if (this.Field_1591 != null && this.Field_1591.length() > 0) {
            Class_1578.\u0000, `((int)(this.Field_1595 - (-26094 & 8230)), (int)(this.Field_1603 - (8195 & 16578)), (int)(this.Field_1579 + (-31998 & 3203)), (int)(this.Field_1589 - (-26103 & 1)), (int)(1428167808 & 2006974504));
            this.\u0000, `(this.\u0000strictfp, this.Field_1591, this.Field_1595, this.Field_1603, -1 & -1);
            this.\u0000, `(this.\u0000strictfp, this.Field_1587, (this.\u0000= final - this.Field_1586) / (2986 & -32746), ((Class_42376)this.\u0000strictfp.get((int)(1857 & 16422))).Field_42390 - (6861 & 28), -1 & -1);
        }
        super.Method_1545(n, n2, f);
    }

    private static String Method_1614(String string) {
        int n = 9036;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_1615(String string) {
        int n = 1881;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_1616() {
        this.Field_1599 = new Class_47630(9603 & -28364, 16720 & 6409);
        Field_1588 = this.\u0000strictfp.Method_253().Method_34708("background", this.Field_1599);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (calendar.get(-26602 & 778) + (16401 & 257) == (-11156 & 8734) && calendar.get(13 & 821) == (8477 & 568)) {
            this.Field_1592 = "Merry X-mas!";
        } else if (calendar.get(3 & 19922) + (1073 & 2695) == (131 & 19309) && calendar.get(19269 & 135) == (6149 & 25603)) {
            this.Field_1592 = "Happy new year!";
        } else if (calendar.get(2 & 3131) + (1417 & -24511) == (-28550 & 1291) && calendar.get(12381 & -31449) == (11839 & 351)) {
            this.Field_1592 = "OOoooOOOoooo! Spooky!";
        }
        int n = -13288 & 120;
        int n2 = this.\u0000, ` / (27676 & -32539) + (1328 & 51);
        if (this.\u0000strictfp.Method_183()) {
            this.Method_1628(n2, 24 & 21595);
        } else {
            this.Method_1623(n2, 1560 & 26);
        }
        this.\u0000strictfp.add(new Class_42376(25618 & 772, this.\u0000= final / (18690 & 10) - (615 & 4212), n2 + (-27576 & 456) + (16700 & 5133), 12386 & -31133, 10708 & -10731, Class_9802.Method_9806("menu.options", new Object[4096 & -6583])));
        this.\u0000strictfp.add(new Class_42376(9316 & -32498, this.\u0000= final / (138 & 6662) + (3106 & 12299), n2 + (4171 & -30388) + (-16372 & 7836), 98 & -30606, 23892 & 21, Class_9802.Method_9806("menu.quit", new Object[800 & 19536])));
        this.\u0000strictfp.add(new Class_44012(-23803 & 133, this.\u0000= final / (1315 & 2630) - (126 & 124), n2 + (856 & 72) + (812 & -31731)));
        Object object = this.Field_1598;
        synchronized (object) {
            this.Field_1596 = this.\u0000strictfp.Method_28715(this.Field_1591);
            this.Field_1586 = this.\u0000strictfp.Method_28715(this.Field_1587);
            int n3 = Math.max(this.Field_1596, this.Field_1586);
            this.Field_1595 = (this.\u0000= final - n3) / (12690 & -31229);
            this.Field_1603 = ((Class_42376)this.\u0000strictfp.get((int)(4896 & 9229))).Field_42390 - (8312 & 17434);
            this.Field_1579 = this.Field_1595 + n3;
            this.Field_1589 = this.Field_1603 + (4184 & -32200);
        }
        this.\u0000strictfp.Method_174((13604 & 2112) != 0);
    }

    public void Method_1617() {
        this.Field_1593 = (float)((double)this.Field_1593 + 3.761904761904762 * 5.3164556962025316 * Class_18.Field_89.Field_127.Field_2180);
    }

    public boolean Method_1618() {
        return (8273 & -28540) != 0;
    }

    private static String Method_1619(String string) {
        int n = 10250;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_1620(String string) {
        int n = 6353;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_1621(float f) {
        this.\u0000strictfp.Method_253().Method_34707(Field_1588);
        GL11.glTexParameteri((int)(8161 & 3557), (int)(10829 & 11393), (int)(-22987 & 13891));
        GL11.glTexParameteri((int)(12261 & 24033), (int)(12064 & 10241), (int)(26257 & 9729));
        GL11.glCopyTexSubImage2D((int)(19937 & 12273), (int)(3074 & 20624), (int)(-32703 & 148), (int)(2070 & -16352), (int)(20564 & 8193), (int)(-32768 & 15433), (int)(1504 & -32506), (int)(13576 & 263));
        Class_16867.Method_16947();
        Class_16867.Method_16984(770 & -15598, 4867 & 867, 15145 & -31599, 17344 & 2056);
        Class_16867.Method_16923((-28603 & 2977) != 0, (2057 & -7167) != 0, (6539 & -23519) != 0, (1976 & -30720) != 0);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(7 & 16447, Class_29585.Field_29586);
        Class_16867.Method_16985();
        int n = 5123 & -32445;
        for (int i = 4104 & 2161; i < n; ++i) {
            float f2 = 1.0f / (float)(i + (-20479 & 18049));
            int n2 = this.\u0000= final;
            int n3 = this.\u0000, `;
            float f3 = (float)(i - n / (579 & -28654)) / (3.7727273f * 67.85542f);
            class_22385.Method_22443(n2, n3, this.\u0000strictfp).Method_22433(0.0f + f3, 1.0).Method_22427(1.0f, 1.0f, 1.0f, f2).Method_22451();
            class_22385.Method_22443(n2, 0.0, this.\u0000strictfp).Method_22433(1.0f + f3, 1.0).Method_22427(1.0f, 1.0f, 1.0f, f2).Method_22451();
            class_22385.Method_22443(0.0, 0.0, this.\u0000strictfp).Method_22433(1.0f + f3, 0.0).Method_22427(1.0f, 1.0f, 1.0f, f2).Method_22451();
            class_22385.Method_22443(0.0, n3, this.\u0000strictfp).Method_22433(0.0f + f3, 0.0).Method_22427(1.0f, 1.0f, 1.0f, f2).Method_22451();
        }
        class_7644.Method_7647();
        Class_16867.Method_16913();
        Class_16867.Method_16923((3393 & 16931) != 0, (20487 & 8209) != 0, (-19643 & 16531) != 0, (8227 & 20993) != 0);
    }

    private static String Method_1622(String string) {
        int n = 23706;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_1623(int n, int n2) {
        this.\u0000strictfp.add(new Class_42376(17 & -3933, this.\u0000= final / (50 & 2115) - (-28572 & 2535), n, Class_9802.Method_9806("menu.singleplayer", new Object[641 & 70])));
        this.\u0000strictfp.add(new Class_42376(834 & -30590, this.\u0000= final / (-28654 & 27171) - (740 & 8548), n + n2 * (14497 & 593), Class_9802.Method_9806("menu.multiplayer", new Object[1699 & -26340])));
        this.\u0000strictfp.add(new Class_42376(142 & -6866, this.\u0000= final / (8198 & 21555) - (9196 & -9114), n + n2 * (3842 & 16506), "BlazingPack YouTube"));
    }

    private static String Method_1624(String string) {
        int n = 26640;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_1625(String string) {
        int n = 12822;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_1626(Class_42376 class_42376) {
        Class_31717 class_31717;
        Class_2047 class_2047;
        if (class_42376.Field_42392 == 0) {
            this.\u0000strictfp.Method_218(new Class_21162(this, this.\u0000strictfp.Field_84));
        }
        if (class_42376.Field_42392 == (9293 & 18725)) {
            this.\u0000strictfp.Method_218(new Class_25504(this, this.\u0000strictfp.Field_84, this.\u0000strictfp.Method_262()));
        }
        if (class_42376.Field_42392 == (2049 & 1029)) {
            this.\u0000strictfp.Method_218(new Class_28810(this));
        }
        if (class_42376.Field_42392 == (-16318 & 8706)) {
            this.\u0000strictfp.Method_218(new Class_27772(this));
        }
        if (class_42376.Field_42392 == (4269 & 17476)) {
            this.\u0000strictfp.Method_177();
        }
        if (class_42376.Field_42392 == (10283 & 20555)) {
            this.\u0000strictfp.Method_186("Demo_World", "Demo_World", Class_29849.Field_29850);
        }
        if (class_42376.Field_42392 == (15 & -27124) && (class_31717 = (class_2047 = this.\u0000strictfp.Method_172()).Method_2054("Demo_World")) != null) {
            Class_1792 class_1792 = Class_28810.Method_28836(this, class_31717.Method_31831(), 271 & 4236);
            this.\u0000strictfp.Method_218(class_1792);
        }
        if (class_42376.Field_42392 == (-31185 & 24590)) {
            try {
                this.\u0000strictfp(new URI("https://www.youtube.com/channel/UC7Hd0-ZvzjpD-OaVL7wi76Q"));
            }
            catch (URISyntaxException uRISyntaxException) {
                // empty catch block
            }
        }
    }

    private static String Method_1627(String string) {
        int n = 16950;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1578.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_1628(int n, int n2) {
        this.\u0000strictfp.add(new Class_42376(4955 & 3087, this.\u0000= final / (-32541 & 1538) - (-13721 & 116), n, Class_9802.Method_9806("menu.playdemo", new Object[4394 & 4])));
        this.Field_1594 = new Class_42376(1037 & 908, this.\u0000= final / (170 & 11027) - (13548 & 101), n + n2 * (16911 & 6305), Class_9802.Method_9806("menu.resetdemo", new Object[13824 & -16313]));
        this.\u0000strictfp.add(this.Field_1594);
        Class_2047 class_2047 = this.\u0000strictfp.Method_172();
        Class_31717 class_31717 = class_2047.Method_2054("Demo_World");
        if (class_31717 == null) {
            this.Field_1594.Field_42388 = 6805 & 16448;
        }
    }

    public void Method_1629(boolean bl, int n) {
        if (bl && n == (13 & -28388)) {
            Class_2047 class_2047 = this.\u0000strictfp.Method_172();
            class_2047.Method_2053();
            class_2047.Method_2055("Demo_World");
            this.\u0000strictfp.Method_218(this);
        } else if (n == (9245 & -32467)) {
            if (bl) {
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[-16384 & 1092]).invoke(null, new Object[16412 & -21376]);
                    Class[] arrclass = new Class[-28655 & 141];
                    arrclass[16 & 7045] = URI.class;
                    Object[] arrobject = new Object[4209 & 1];
                    arrobject[140 & -32494] = new URI(this.Field_1583);
                    class_.getMethod("browse", arrclass).invoke(object, arrobject);
                }
                catch (Throwable throwable) {
                    Field_1590.error("Couldn't open link", throwable);
                }
            }
            this.\u0000strictfp.Method_218(this);
        }
    }
}

