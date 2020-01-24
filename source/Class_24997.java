/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonSyntaxException
 *  internal.org.lwjgl.input.Keyboard
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.util.vector.Matrix
 *  internal.org.lwjgl.util.vector.Matrix4f
 *  internal.org.lwjgl.util.vector.Vector3f
 *  internal.org.lwjgl.util.vector.Vector4f
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import internal.org.lwjgl.input.Keyboard;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.util.vector.Matrix;
import internal.org.lwjgl.util.vector.Matrix4f;
import internal.org.lwjgl.util.vector.Vector3f;
import internal.org.lwjgl.util.vector.Vector4f;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.util.Vec3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_24997
implements Class_2638,
Class_2045 {
    private int Field_24998 = 10272 & 138;
    public LinkedHashSet Field_24999 = new LinkedHashSet();
    private int Field_25000;
    private int Field_25001;
    private boolean Field_25002 = 2884 & 8354;
    private Class_13574 Field_25003;
    private Class_14415 Field_25004 = new Class_14415();
    private boolean Field_25005;
    private double Field_25006;
    private double Field_25007 = Double.MIN_VALUE * 1.021978021978022;
    private int Field_25008;
    private Class_19400 Field_25009;
    private int Field_25010 = -1308524288 & -2079584702;
    private double Field_25011;
    private double Field_25012 = 2.0E-323 * 0.25;
    private Class_19135 Field_25013;
    private Class_26345 Field_25014;
    private int Field_25015 = -1 & -1;
    private boolean Field_25016;
    private static final Class_2080 Field_25017;
    Random Field_25018 = new Random();
    public final Map Field_25019 = new HashMap();
    private final Map Field_25020 = new HashMap();
    private int Field_25021 = 16635 & -24574;
    private double Field_25022 = 0.078125 * 6.4E-323;
    private double Field_25023;
    private int Field_25024;
    private static final Class_2080 Field_25025;
    private ArrayList Field_25026 = new ArrayList(1032 & 6084);
    private ArrayList Field_25027 = new ArrayList();
    private final Vector4f[] Field_25028 = new Vector4f[24812 & -32759];
    Class_10288 Field_25029;
    private Class_11885 Field_25030;
    private ArrayList Field_25031 = new ArrayList(-27136 & 1226);
    private final Class_8491 Field_25032;
    private ArrayList Field_25033 = new ArrayList(-29648 & 22400);
    private static final Set Field_25034;
    private final Class_34695 Field_25035;
    private final Class_31173 Field_25036 = new Class_31173();
    private ArrayList Field_25037 = new ArrayList();
    public Class_13180 Field_25038;
    private Class_13574 Field_25039;
    private ArrayList Field_25040 = new ArrayList(-31740 & 5648);
    private int Field_25041 = 20800 & -29052;
    private Class_13574 Field_25042;
    private int Field_25043;
    private double Field_25044 = 1.2452830188679245 * Double.MIN_VALUE;
    private double Field_25045;
    private int Field_25046 = -662470636 & -2143284608;
    private boolean Field_25047;
    private ArrayList Field_25048 = new ArrayList(1792 & 1258);
    private double Field_25049 = Double.MIN_VALUE * 1.4912280701754386;
    private int Field_25050 = 22064 & -32310;
    private static final Class_2080 Field_25051;
    public Class_570 Field_25052;
    private Class_13481 Field_25053;
    private Class_15030 Field_25054;
    public static boolean Field_25055;
    private ArrayList Field_25056 = Lists.newArrayListWithCapacity((int)(241742 & 609293408));
    private int Field_25057 = -1 & -1;
    private int Field_25058 = -1 & -1;
    private double Field_25059 = 1.0E-323 * 0.5063291139240507;
    private int Field_25060;
    private ArrayList Field_25061 = new ArrayList(11536 & -11232);
    private double Field_25062;
    private int Field_25063 = -31736 & 10244;
    private static final Class_2080 Field_25064;
    private static final Class_2080 Field_25065;
    public long Field_25066;
    public final Class_18 Field_25067;
    private int Field_25068;
    private int Field_25069 = -1 & -1;
    private final Class_22205 Field_25070 = new Class_22205();
    private final HashSet Field_25071 = Sets.newHashSet();
    private boolean Field_25072 = 258 & -31104;
    private static final Logger Field_25073;
    private ArrayList Field_25074 = new ArrayList(-31744 & 5632);
    private int Field_25075 = -2080092008 & -1467380735;
    private double Field_25076;
    private LinkedHashSet Field_25077 = Sets.newLinkedHashSet();
    public boolean Field_25078 = 1047 & 329;
    private double Field_25079 = 0.5 * 1.0E-323;
    private int Field_25080;
    private ArrayList Field_25081 = new ArrayList(21517 & 9392);
    public LinkedHashSet Field_25082 = new LinkedHashSet();
    private double Field_25083 = 1.4782608695652173 * Double.MIN_VALUE;
    public Class_1061 Field_25084;
    private final Class_11372[] Field_25085 = new Class_11372[16906 & 2062];

    private void Method_25086(Class_22385 class_22385, float f, boolean bl) {
        int n = 12495 & 1;
        int n2 = 13985 & 16411;
        class_22385.Method_22417(23 & 591, Class_29585.Field_29602);
        for (int i = -365 & -376; i <= (17836 & 9104); i += 64) {
            for (int j = -108 & -384; j <= (392 & 1440); j += 64) {
                float f2 = i;
                float f3 = i + (-30391 & 12402);
                if (bl) {
                    f3 = i;
                    f2 = i + (9040 & 224);
                }
                class_22385.Method_22443(f2, f, j).Method_22451();
                class_22385.Method_22443(f3, f, j).Method_22451();
                class_22385.Method_22443(f3, f, j + (338 & -27575)).Method_22451();
                class_22385.Method_22443(f2, f, j + (12610 & 1760)).Method_22451();
            }
        }
    }

    private void Method_25087(Class_17531 class_17531) {
        this.Field_25067.Field_58.Method_22976();
        if (Class_32876.Method_32939()) {
            GL11.glEnableClientState((int)(1073914356 & 134319223));
            Class_32876.Method_32970(Class_32876.Field_32931);
            GL11.glEnableClientState((int)(604085240 & 1073906812));
            Class_32876.Method_32970(Class_32876.Field_32911);
            GL11.glEnableClientState((int)(1220717692 & 807764345));
            Class_32876.Method_32970(Class_32876.Field_32931);
            GL11.glEnableClientState((int)(284610806 & 1241556598));
        }
        if (Class_19426.Method_19570()) {
            Class_25377.Method_25389(class_17531);
        }
        this.Field_25054.Method_15040(class_17531);
        if (Class_19426.Method_19570()) {
            Class_25377.Method_25390(class_17531);
        }
        if (Class_32876.Method_32939()) {
            for (Class_12423 class_12423 : Class_29585.Field_29597.Method_11911()) {
                Class_8005 class_8005 = class_12423.Method_12434();
                int n = class_12423.Method_12438();
                switch (Class_26978.Field_26979[class_8005.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState((int)(-2071030411 & 18989172));
                        break;
                    }
                    case 2: {
                        Class_32876.Method_32970(Class_32876.Field_32931 + n);
                        GL11.glDisableClientState((int)(546932856 & 1178902648));
                        Class_32876.Method_32970(Class_32876.Field_32931);
                        break;
                    }
                    case 3: {
                        GL11.glDisableClientState((int)(1547993206 & -1558145673));
                        Class_16867.Method_16932();
                    }
                }
            }
        }
        this.Field_25067.Field_58.Method_22979();
    }

    public void Method_25088(Class_1061 class_1061, float f) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_31457 class_31457 = this.Field_25052.\u0000strictfp();
        double d = this.Field_25067.Field_84.Field_39801 * (9369 & 784);
        if (class_1061.Field_1130 >= class_31457.Method_31489() - d || class_1061.Field_1130 <= class_31457.Method_31473() + d || class_1061.Field_1106 >= class_31457.Method_31491() - d || class_1061.Field_1106 <= class_31457.Method_31474() + d) {
            float f2;
            float f3;
            double d2;
            double d3;
            double d4 = 1.0 - class_31457.Method_31476(class_1061) / d;
            d4 = Math.pow(d4, 1.7714285714285714 * 2.2580645161290325);
            double d5 = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
            double d6 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
            double d7 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
            Class_16867.Method_16947();
            Class_16867.Method_16984(798 & -23774, 1137 & 8199, 65 & 29981, 5328 & -22528);
            this.Field_25035.Method_34707(Field_25017);
            Class_16867.Method_16930((-32766 & 4640) != 0);
            Class_16867.Method_16961();
            int n = class_31457.Method_31492().Method_39049();
            float f4 = (float)(n >> (1297 & -26544) & (511 & 21759)) / (0.25714287f * 991.6666f);
            float f5 = (float)(n >> (-32756 & 1352) & (-31745 & 1279)) / (0.14606741f * 1745.7693f);
            float f6 = (float)(n & (10495 & -32001)) / (2.1724138f * 117.38095f);
            Class_16867.Method_16924(f4, f5, f6, (float)d4);
            Class_16867.Method_16939(0.25f * -12.0f, 2.764706f * -1.0851064f);
            Class_16867.Method_16970();
            Class_16867.Method_16967(12806 & 2821, 0.025396826f * 3.9375f);
            Class_16867.Method_16913();
            Class_16867.Method_16969();
            float f7 = (float)(Class_18.Method_207() % (70308809018461112L & 538455032L)) / (515.625f * 5.818182f);
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 74.181816f * 1.7254902f;
            class_22385.Method_22417(4295 & 19495, Class_29585.Field_29598);
            class_22385.Method_22444(-d5, -d6, -d7);
            double d8 = Math.max((double)Class_13337.Method_13371(d7 - d), class_31457.Method_31474());
            double d9 = Math.min((double)Class_13337.Method_13357(d7 + d), class_31457.Method_31491());
            if (d5 > class_31457.Method_31489() - d) {
                f2 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f3 = (float)d2 * (0.77272725f * 0.64705884f);
                    class_22385.Method_22443(class_31457.Method_31489(), 306.19607843137254 * 0.8360655737704918, d3).Method_22433(f7 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(class_31457.Method_31489(), 252.49315068493152 * 1.0138888888888888, d3 + d2).Method_22433(f7 + f3 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(class_31457.Method_31489(), 0.0, d3 + d2).Method_22433(f7 + f3 + f2, f7 + 4.714286f * 27.151514f).Method_22451();
                    class_22385.Method_22443(class_31457.Method_31489(), 0.0, d3).Method_22433(f7 + f2, f7 + 0.94736844f * 135.11111f).Method_22451();
                    d3 += 1.0;
                    f2 += 0.27192983f * 1.8387097f;
                }
            }
            if (d5 < class_31457.Method_31473() + d) {
                f2 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f3 = (float)d2 * (2.818182f * 0.17741935f);
                    class_22385.Method_22443(class_31457.Method_31473(), 8.827586206896552 * 29.0, d3).Method_22433(f7 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(class_31457.Method_31473(), 0.7931034482758621 * 322.7826086956522, d3 + d2).Method_22433(f7 + f3 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(class_31457.Method_31473(), 0.0, d3 + d2).Method_22433(f7 + f3 + f2, f7 + 0.21052632f * 608.0f).Method_22451();
                    class_22385.Method_22443(class_31457.Method_31473(), 0.0, d3).Method_22433(f7 + f2, f7 + 576.0f * 0.22222222f).Method_22451();
                    d3 += 1.0;
                    f2 += 2.6363637f * 0.18965517f;
                }
            }
            d8 = Math.max((double)Class_13337.Method_13371(d5 - d), class_31457.Method_31473());
            d9 = Math.min((double)Class_13337.Method_13357(d5 + d), class_31457.Method_31489());
            if (d7 > class_31457.Method_31491() - d) {
                f2 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f3 = (float)d2 * (0.4047619f * 1.2352941f);
                    class_22385.Method_22443(d3, 1.2678571428571428 * 201.9154929577465, class_31457.Method_31491()).Method_22433(f7 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(d3 + d2, 0.875 * 292.57142857142856, class_31457.Method_31491()).Method_22433(f7 + f3 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(d3 + d2, 0.0, class_31457.Method_31491()).Method_22433(f7 + f3 + f2, f7 + 5.8235292f * 21.9798f).Method_22451();
                    class_22385.Method_22443(d3, 0.0, class_31457.Method_31491()).Method_22433(f7 + f2, f7 + 0.95348835f * 134.24391f).Method_22451();
                    d3 += 1.0;
                    f2 += 1.9705882f * 0.25373134f;
                }
            }
            if (d7 < class_31457.Method_31474() + d) {
                f2 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f3 = (float)d2 * (0.033333335f * 15.0f);
                    class_22385.Method_22443(d3, 0.8863636363636364 * 288.8205128205128, class_31457.Method_31474()).Method_22433(f7 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(d3 + d2, 91.02222222222223 * 2.8125, class_31457.Method_31474()).Method_22433(f7 + f3 + f2, f7 + 0.0f).Method_22451();
                    class_22385.Method_22443(d3 + d2, 0.0, class_31457.Method_31474()).Method_22433(f7 + f3 + f2, f7 + 31.64045f * 4.0454545f).Method_22451();
                    class_22385.Method_22443(d3, 0.0, class_31457.Method_31474()).Method_22433(f7 + f2, f7 + 0.76086956f * 168.22858f).Method_22451();
                    d3 += 1.0;
                    f2 += 0.24210526f * 2.0652175f;
                }
            }
            class_7644.Method_7647();
            class_22385.Method_22444(0.0, 0.0, 0.0);
            Class_16867.Method_16979();
            Class_16867.Method_16985();
            Class_16867.Method_16939(0.0f, 0.0f);
            Class_16867.Method_16971();
            Class_16867.Method_16913();
            Class_16867.Method_16952();
            Class_16867.Method_16945();
            Class_16867.Method_16930((1601 & 273) != 0);
        }
    }

    private void Method_25089(Class_40274 class_40274, double d, double d2, double d3, double d4, double d5, double d6, int ... arrn) {
        this.Method_25127(class_40274.Method_40336(), class_40274.Method_40339(), d, d2, d3, d4, d5, d6, arrn);
    }

    public void Method_25090(int n, Class_4751 class_4751, int n2) {
        if (n2 >= 0 && n2 < (2090 & -32678)) {
            Class_7862 class_7862 = (Class_7862)this.Field_25019.get(n);
            if (class_7862 == null || class_7862.Method_7867().\u0000= final() != class_4751.\u0000= final() || class_7862.Method_7867().\u0000, `() != class_4751.\u0000, `() || class_7862.Method_7867().\u0000strictfp() != class_4751.\u0000strictfp()) {
                class_7862 = new Class_7862(n, class_4751);
                this.Field_25019.put(n, class_7862);
            }
            class_7862.Method_7869(n2);
            class_7862.Method_7868(this.Field_25068);
        } else {
            this.Field_25019.remove(n);
        }
    }

    public void Method_25091() {
        this.Field_25078 = 1289 & 2049;
    }

    public String Method_25092() {
        int n = this.Field_25038.Field_13185.length;
        int n2 = 4225 & 2128;
        for (Object e : this.Field_25056) {
            Class_16635 class_16635 = (Class_16635)e;
            Class_26579 class_26579 = class_16635.Field_16639.Field_6209;
            if (class_26579 == Class_26579.Field_26582 || class_26579.Method_26587()) continue;
            ++n2;
        }
        Object[] arrobject = new Object[46 & -24298];
        arrobject[590 & -31487] = n2;
        arrobject[27659 & 289] = n;
        arrobject[-32478 & 5203] = Class_6996.Method_7007();
        arrobject[-32749 & 4675] = Class_6996.Field_6998 / (-468098942 & 282368033);
        arrobject[44 & 261] = this.Field_25058;
        arrobject[8711 & 1109] = this.Field_25070.Method_22221();
        return String.format("C: %d/%d VBOs: %d/%dMB D: %d, %s", arrobject);
    }

    public void Method_25093(Class_1061 class_1061, double d, Class_23708 class_23708, int n, boolean bl) {
        if (this.Field_25067.Field_84.Field_39801 != this.Field_25058) {
            this.Method_25110();
        }
        Class_2767 class_2767 = this.Field_25052.\u0000strictfp;
        class_2767.Method_2789("camera");
        double d2 = class_1061.Field_1130 - this.Field_25007;
        double d3 = class_1061.Method_1324() - this.Field_25022;
        double d4 = class_1061.Field_1106 - this.Field_25012;
        if (this.Field_25046 != class_1061.Field_1147 || this.Field_25075 != class_1061.Field_1088 || this.Field_25010 != class_1061.Field_1090 || d2 * d2 + d3 * d3 + d4 * d4 > 11.10204081632653 * 1.4411764705882353) {
            this.Field_25007 = class_1061.Field_1130;
            this.Field_25022 = class_1061.Method_1324();
            this.Field_25012 = class_1061.Field_1106;
            this.Field_25046 = class_1061.Field_1147;
            this.Field_25075 = class_1061.Field_1088;
            this.Field_25010 = class_1061.Field_1090;
            this.Field_25038.Method_13193(class_1061.Field_1130, class_1061.Field_1106);
        }
        class_2767.Method_2783("renderlistcamera");
        double d5 = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * d;
        double d6 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * d;
        double d7 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * d;
        this.Field_25054.Method_15038(d5, d6, d7);
        class_2767.Method_2783("cull");
        if (this.Field_25053 != null) {
            Class_34375 class_34375 = new Class_34375(this.Field_25053);
            class_34375.Method_34387(this.Field_25036.Field_31174, this.Field_25036.Field_31176, this.Field_25036.Field_31175);
            class_23708 = class_34375;
        }
        class_2767.Method_2783("culling");
        this.Method_25117(class_1061, d, (Class_34375)class_23708, n, bl, d5, d6, d7);
        if (this.Field_25002) {
            this.Method_25124(d5, d6, d7);
            this.Field_25002 = 272 & 7176;
        }
        if (Class_12440.Field_12441) {
            Class_12440.Method_12818();
        } else {
            this.Method_25094(class_1061, d, class_23708, n, bl, d5, d6, d7);
            class_2767.Method_2790();
        }
    }

    public void Method_25094(Class_1061 class_1061, double d, Class_23708 class_23708, int n, boolean bl, double d2, double d3, double d4) {
        Class_9967.Field_9990.Method_35684();
        this.Field_25067.Field_25.Method_2789("build near");
        Class_4751 class_4751 = new Class_4751(Class_13337.Method_13371(d2 / (7.595959595959597 * 2.106382978723404)) * (-32577 & 336), Class_13337.Method_13371(d3 / (16.542372881355934 * 0.9672131147540983)) * (-32238 & 4120), Class_13337.Method_13371(d4 / (0.7222222222222222 * 22.153846153846153)) * (2128 & 282));
        this.Field_25070.Method_22222();
        this.Field_25037.clear();
        ArrayList arrayList = this.Field_25056;
        int n2 = arrayList.size();
        for (int i = -32735 & 7808; i < n2; ++i) {
            Class_16635 class_16635 = (Class_16635)arrayList.get(i);
            Class_6176 class_6176 = class_16635.Field_16639;
            if (!class_6176.Method_6215() && !class_6176.Field_6198) continue;
            this.Field_25078 = 581 & -30557;
            if (this.Method_25153(class_4751, class_16635.Field_16639)) {
                if (!Class_19426.Method_19572()) {
                    this.Field_25082.add(class_6176);
                    continue;
                }
                this.Field_25070.Method_22216(class_6176);
                class_6176.Method_6221((16394 & -30816) != 0);
                continue;
            }
            this.Field_25037.add(class_6176);
            class_6176.Field_6198 = 17797 & -32207;
        }
        this.Field_25067.Field_25.Method_2790();
        Class_9967.Field_9990.Method_35682();
    }

    public void Method_25095(int n, int n2) {
        if (Class_32876.Field_32906 && this.Field_25014 != null) {
            this.Field_25014.Method_26368(n, n2);
        }
    }

    private void Method_25096() {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        if (this.Field_25003 != null) {
            this.Field_25003.Method_13579();
        }
        if (this.Field_25057 >= 0) {
            Class_11552.Method_11557(this.Field_25057);
            this.Field_25057 = -1 & -1;
        }
        if (this.Field_25072) {
            this.Field_25003 = new Class_13574(this.Field_25030);
            this.Method_25086(class_22385, 1.4285715f * 11.2f, (-30576 & 20577) != 0);
            class_22385.Method_22419();
            class_22385.Method_22434();
            this.Field_25003.Method_13583(class_22385.Method_22420());
        } else {
            this.Field_25057 = Class_11552.Method_11554(12427 & 19573);
            GL11.glNewList((int)this.Field_25057, (int)(6052 & -17590));
            this.Method_25086(class_22385, 29.090908f * 0.55f, (24968 & 5730) != 0);
            class_7644.Method_7647();
            GL11.glEndList();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_25097(Collection collection, Collection collection2) {
        HashSet hashSet = this.Field_25071;
        HashSet hashSet2 = this.Field_25071;
        synchronized (hashSet2) {
            this.Field_25071.removeAll(collection);
            this.Field_25071.addAll(collection2);
        }
    }

    protected void Method_25098() {
        if (this.Field_25038 != null) {
            Class_6176[] arrclass_6176 = this.Field_25038.Field_13185;
            int n = arrclass_6176.length;
            for (int i = 196 & -12280; i < n; ++i) {
                Class_6176 class_6176 = arrclass_6176[i];
                class_6176.Field_6198 = 8324 & 290;
            }
        }
        this.Field_25037.clear();
        this.Field_25070.Method_22231();
    }

    static {
        Field_25073 = LogManager.getLogger();
        Field_25025 = new Class_2080(Class_24997.Method_25150("\u10a9\u10b8\u10a3\u10ab\u10ac\u10af\u10be\u10ac\u10b2\u10b8\u10b1\u10a9\u10b4\u10af\u10b4\u10b5\u10a0\u10a8\u10a1\u10bb\u10a6\u10a4\u10a4\u10a4\u10a3\u1092\u10bb\u10a3\u10ac\u10be\u10ae\u10bc\u10b3\u10a9\u10b1\u10b8"));
        Field_25064 = new Class_2080(Class_24997.Method_25159("\ua09a\ua08b\ua092\ua09b\ua09a\ua099\ua08a\ua099\ua0c8\ua083\ua088\ua091\ua08a\ua091\ua088\ua089\ua082\ua08b\ua080\ua09b\ua0c0\ua099\ua09a\ua081\ua0c8\ua093\ua088\ua081"));
        Field_25065 = new Class_2080(Class_24997.Method_25130("\u8084\u8085\u8088\u8085\u8084\u8081\u8084\u8081\u8084\u808d\u8084\u808d\u8080\u8089\u8084\u8085\u809c\u8095\u809c\u8095\u809c\u8091\u809c\u809d\u809c\u809d\u8098\u8095\u8098\u8095\u809c"));
        Field_25051 = new Class_2080(Class_24997.Method_25146("\u41c0\u41c1\u41ca\u41c2\u41c1\u41c0\u41c3\u41c3\u4189\u41c1\u41ca\u41c2\u41c9\u41c0\u41cb\u41ca\u41c9\u41c1\u41ca\u41c2\u4189\u41c1\u41ca\u41c2\u41e9\u41c1\u41cb\u41cb\u4188\u41c0\u41ca\u41c3"));
        Field_25017 = new Class_2080(Class_24997.Method_25132("\u81b0\u81a1\u81ba\u81b3\u81b0\u81b1\u81a2\u81b3\u81e0\u81a1\u81a2\u81bb\u81a8\u81e1\u81aa\u81a3\u81b0\u81a1\u81a2\u81a3\u81a8\u81a1\u81aa\u81a3\u81e0\u81b9\u81a2\u81ab"));
        Field_25034 = Collections.unmodifiableSet(new HashSet<Class_4595>(Arrays.asList(Class_4595.Field_4600)));
    }

    public int Method_25099(Class_17531 class_17531, double d, int n, Class_1061 class_1061) {
        Object object;
        int n2;
        Class_39477.Method_39484();
        if (class_17531 == Class_17531.Field_17537) {
            this.Field_25067.Field_25.Method_2789("translucent_sort");
            double d2 = class_1061.Field_1130 - this.Field_25045;
            double d3 = class_1061.Method_1324() - this.Field_25023;
            double d4 = class_1061.Field_1106 - this.Field_25062;
            if (d2 * d2 + d3 * d3 + d4 * d4 > 1.0) {
                this.Field_25045 = class_1061.Field_1130;
                this.Field_25023 = class_1061.Method_1324();
                this.Field_25062 = class_1061.Field_1106;
                int n3 = 10240 & 1116;
                this.Field_24999.clear();
                n2 = this.Field_25056.size();
                object = this.Field_24999;
                ArrayList arrayList = this.Field_25056;
                for (int i = 8192 & 20568; i < n2; ++i) {
                    Class_16635 class_16635 = (Class_16635)arrayList.get(i);
                    if (!class_16635.Field_16639.Field_6209.Method_26598(class_17531) || n3++ >= (4159 & -21489)) continue;
                    ((HashSet)object).add(class_16635.Field_16639);
                }
            }
            this.Field_25067.Field_25.Method_2790();
        }
        this.Field_25067.Field_25.Method_2789("filterempty");
        int n4 = 2140 & -15231;
        int n5 = class_17531 == Class_17531.Field_17537 ? 2305 & 1169 : 459 & 15892;
        int n6 = n5 != 0 ? this.Field_25056.size() - (22629 & 1) : 21665 & 2;
        int n7 = n5 != 0 ? -1 & -1 : this.Field_25056.size();
        int n8 = n5 != 0 ? -1 & -1 : -10079 & 265;
        ArrayList arrayList = this.Field_25056;
        Class_15030 class_15030 = this.Field_25054;
        for (n2 = n6; n2 != n7; n2 += n8) {
            object = ((Class_16635)arrayList.get((int)n2)).Field_16639;
            if (((Class_6176)object).Method_6233().Method_26597(class_17531)) continue;
            ++n4;
            class_15030.Method_15037((Class_6176)object, class_17531);
        }
        if (n4 == 0) {
            this.Field_25067.Field_25.Method_2790();
            return n4;
        }
        if (Class_19426.Method_19486() && this.Field_25067.Field_58.Field_22871) {
            Class_16867.Method_16954();
        }
        this.Field_25067.Field_25.Method_2783("render_" + (Object)((Object)class_17531));
        this.Method_25087(class_17531);
        this.Field_25067.Field_25.Method_2790();
        return n4;
    }

    void Method_25100(Class_1061 class_1061, Class_23708 class_23708, float f, List list) {
        Class_16867.Method_16936(5639 & 27375);
        Class_16867.Method_16954();
        this.Field_25013.Method_19150();
        this.Field_25013.Method_19152((1040 & -18400) != 0);
        this.Field_25052.\u0000strictfp.Method_2783("entityOutlines");
        Class_39477.Method_39484();
        this.Field_25032.Method_8527((273 & -32255) != 0);
        for (int i = 2064 & 5420; i < list.size(); ++i) {
            int n;
            Class_1061 class_10612 = (Class_1061)list.get(i);
            if (this.Field_25005) {
                Object[] arrobject = new Object[4353 & 16451];
                arrobject[4098 & 2497] = this.Field_25043;
                if (!Class_14610.Method_14674(class_10612, Class_14610.Field_14634, arrobject)) continue;
            }
            int n2 = n = class_10612.Method_1209(this.Field_25011, this.Field_25006, this.Field_25076) && (class_10612.Field_1104 || class_23708.Method_23709(class_10612.Method_1315()) || class_10612.Field_1099 == this.Field_25067.Field_48) && class_10612 instanceof Class_626 ? -28349 & 24717 : 4130 & -29632;
            if (class_10612 == this.Field_25067.Method_246() && this.Field_25067.Field_84.Field_39802 == 0 && !this.Field_25067.Field_58.Field_22854 && !this.Field_25047 || n == 0) continue;
            this.Field_25032.Method_8528(class_10612, f);
        }
        this.Field_25032.Method_8527((6160 & 33) != 0);
        Class_39477.Method_39482();
        Class_16867.Method_16930((-32734 & 664) != 0);
        this.Field_25014.Method_26367(f);
        Class_16867.Method_16918();
        Class_16867.Method_16930((8705 & 16395) != 0);
        this.Field_25067.Method_164().Method_19152((10304 & 17044) != 0);
        Class_16867.Method_16978();
        Class_16867.Method_16947();
        Class_16867.Method_16950();
        Class_16867.Method_16936(-30969 & 29187);
        Class_16867.Method_16927();
        Class_16867.Method_16913();
    }

    public Class_24997(Class_18 class_18) {
        this.Field_25009 = new Class_19400(class_18);
        this.Field_25067 = class_18;
        this.Field_25032 = class_18.Method_266();
        this.Field_25035 = class_18.Method_253();
        this.Field_25035.Method_34707(Field_25017);
        GL11.glTexParameteri((int)(3557 & 3555), (int)(10267 & 11842), (int)(10517 & 11139));
        GL11.glTexParameteri((int)(3557 & 8161), (int)(-22501 & 15683), (int)(-21247 & 14593));
        Class_16867.Method_16963(-14844 & 6514);
        this.Method_25161();
        this.Field_25072 = Class_32876.Method_32939();
        if (this.Field_25072) {
            this.Field_25054 = new Class_18043();
            this.Field_25029 = new Class_23714();
        } else {
            this.Field_25054 = new Class_15400();
            this.Field_25029 = new Class_25883();
        }
        this.Field_25030 = new Class_11885();
        this.Field_25030.Method_11897(new Class_12423(16709 & -25070, Class_8548.Field_8555, Class_8005.Field_8011, 8203 & 17443));
        this.Method_25141();
        this.Method_25096();
        this.Method_25148();
    }

    private void Method_25101(float f, int n) {
        float f2;
        int n2;
        float f3;
        float f4;
        this.Field_25009.Method_19413((737 & 9) != 0, this.Field_25068, f);
        f = 0.0f;
        Class_16867.Method_16969();
        float f5 = (float)(this.Field_25067.Method_246().Field_1102 + (this.Field_25067.Method_246().Method_1324() - this.Field_25067.Method_246().Field_1102) * (double)f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        float f6 = 3.521739f * 3.4074075f;
        float f7 = 0.14285715f * 27.999998f;
        double d = (float)this.Field_25068 + f;
        double d2 = (this.Field_25067.Method_246().Method_1255() + (this.Field_25067.Method_246().Field_1130 - this.Field_25067.Method_246().Method_1255()) * (double)f + d * (0.35714285714285715 * 0.08399999812245369)) / (15.891891891891893 * 0.7551020408163265);
        double d3 = (this.Field_25067.Method_246().Method_1271() + (this.Field_25067.Method_246().Field_1106 - this.Field_25067.Method_246().Method_1271()) * (double)f) / (13.666666666666666 * 0.8780487804878049) + 0.7959183673469388 * 0.41461540109071976;
        float f8 = this.Field_25052.\u0000strictfp.Method_18367() - f5 + 1.0f * 0.33f;
        f8 += this.Field_25067.Field_84.Field_39730 * (349.0909f * 0.36666667f);
        int n3 = Class_13337.Method_13371(d2 / (0.03508771929824561 * 58368.0));
        int n4 = Class_13337.Method_13371(d3 / (2137.0434782608695 * 0.9583333333333334));
        d2 -= (double)(n3 * (2080 & 10500));
        d3 -= (double)(n4 * (2702 & 6176));
        this.Field_25035.Method_34707(Field_25065);
        Class_16867.Method_16947();
        Class_16867.Method_16984(774 & -22718, -9457 & 1811, 8195 & 21077, 2774 & 4104);
        Vec3 vec3 = this.Field_25052.\u0000, `(f);
        float f9 = (float)vec3.\u0000= final;
        float f10 = (float)vec3.\u0000strictfp;
        float f11 = (float)vec3.\u0000, `;
        if (n != (11282 & 4643)) {
            f2 = (f9 * (0.42857143f * 70.0f) + f10 * (11.8f * 5.0f) + f11 * (1.3333334f * 8.25f)) / (3.030303f * 33.0f);
            f3 = (f9 * (4.214286f * 7.1186438f) + f10 * (382.66666f * 0.18292683f)) / (62.5f * 1.6f);
            f4 = (f9 * (0.74444443f * 40.298508f) + f11 * (0.32978722f * 212.25807f)) / (34.285713f * 2.9166667f);
            f9 = f2;
            f10 = f3;
            f11 = f4;
        }
        f2 = f9 * (0.3857143f * 2.3333333f);
        f3 = f10 * (1.1585366f * 0.7768421f);
        f4 = f11 * (2.8181818f * 0.31935483f);
        float f12 = f9 * (1.4146341f * 0.4948276f);
        float f13 = f10 * (2.5199997f * 0.2777778f);
        float f14 = f11 * (0.39701492f * 1.7631578f);
        float f15 = f9 * (0.09600001f * 8.333333f);
        float f16 = f10 * (1.15f * 0.6956522f);
        float f17 = f11 * (0.5714286f * 1.4f);
        float f18 = 0.004014757f * 0.972973f;
        float f19 = (float)Class_13337.Method_13371(d2) * (0.87096775f * 0.004484954f);
        float f20 = (float)Class_13337.Method_13371(d3) * (0.0038479478f * 1.0151515f);
        float f21 = (float)(d2 - (double)Class_13337.Method_13371(d2));
        float f22 = (float)(d3 - (double)Class_13337.Method_13371(d3));
        int n5 = -32723 & 25105;
        int n6 = 833 & 18451;
        float f23 = 0.0039911685f * 0.24468085f;
        Class_16867.Method_16973(0.7222222f * 16.615385f, 1.0f, 2.264706f * 5.2987013f);
        for (n2 = 4360 & -22015; n2 < (1610 & 6274); ++n2) {
            if (n2 == 0) {
                Class_16867.Method_16923((10056 & -16378) != 0, (-16128 & 4128) != 0, (-23866 & 1280) != 0, (11464 & 4613) != 0);
            } else {
                switch (n) {
                    case 0: {
                        Class_16867.Method_16923((4168 & -29680) != 0, (17473 & 14737) != 0, (8289 & 265) != 0, (-24191 & 19969) != 0);
                        break;
                    }
                    case 1: {
                        Class_16867.Method_16923((2049 & 8841) != 0, (-7872 & 137) != 0, (25668 & 4096) != 0, (16657 & 2659) != 0);
                        break;
                    }
                    case 2: {
                        Class_16867.Method_16923((25185 & -31485) != 0, (16577 & -28923) != 0, (26453 & 11) != 0, (-32671 & 5527) != 0);
                    }
                }
            }
            this.Field_25009.Method_19416();
        }
        if (this.Field_25009.Method_19417()) {
            this.Field_25009.Method_19415();
            for (n2 = -3 & -1; n2 <= (60 & 16903); ++n2) {
                for (int i = -3 & -3; i <= (5188 & -24011); ++i) {
                    int n7;
                    class_22385.Method_22417(23 & -11129, Class_29585.Field_29593);
                    float f24 = n2 * (269 & 18074);
                    float f25 = i * (42 & -32548);
                    float f26 = f24 - f21;
                    float f27 = f25 - f22;
                    if (f8 > 1.7272727f * -2.8947368f) {
                        class_22385.Method_22443(f26 + 0.0f, f8 + 0.0f, f27 + 1.3f * 6.1538463f).Method_22433((f24 + 0.0f) * (0.003670934f * 1.0641025f) + f19, (f25 + 9.777778f * 0.8181818f) * (2.6285715f * 0.0014860734f) + f20).Method_22427(f12, f13, f14, 0.7590361f * 1.0539683f).Method_22446(0.0f, 3.6923077f * -0.27083334f, 0.0f).Method_22451();
                        class_22385.Method_22443(f26 + 3.857143f * 2.074074f, f8 + 0.0f, f27 + 80.0f * 0.1f).Method_22433((f24 + 0.21052632f * 38.0f) * (0.0011224856f * 3.48f) + f19, (f25 + 17.142857f * 0.46666667f) * (0.0052266726f * 0.7473684f) + f20).Method_22427(f12, f13, f14, 1.3076923f * 0.6117647f).Method_22446(0.0f, 0.5f * -2.0f, 0.0f).Method_22451();
                        class_22385.Method_22443(f26 + 124.0f * 0.06451613f, f8 + 0.0f, f27 + 0.0f).Method_22433((f24 + 4.5333333f * 1.7647059f) * (1.2727273f * 0.0030691966f) + f19, (f25 + 0.0f) * (5.2352943f * 7.4613764E-4f) + f20).Method_22427(f12, f13, f14, 0.8f * 1.0f).Method_22446(0.0f, 0.042857144f * -23.333332f, 0.0f).Method_22451();
                        class_22385.Method_22443(f26 + 0.0f, f8 + 0.0f, f27 + 0.0f).Method_22433((f24 + 0.0f) * (0.071875006f * 0.054347824f) + f19, (f25 + 0.0f) * (0.28515625f * 0.01369863f) + f20).Method_22427(f12, f13, f14, 0.7523809f * 1.0632912f).Method_22446(0.0f, -1.2467533f * 0.8020833f, 0.0f).Method_22451();
                    }
                    if (f8 <= 1.0804597f * 4.62766f) {
                        class_22385.Method_22443(f26 + 0.0f, f8 + 5.735849f * 0.69736844f - 7.07166E-4f * 1.3809524f, f27 + 0.5507246f * 14.526316f).Method_22433((f24 + 0.0f) * (0.004181338f * 0.93421054f) + f19, (f25 + 3.1340206f * 2.5526316f) * (0.00390625f * 1.0f) + f20).Method_22427(f9, f10, f11, 0.28125f * 2.8444445f).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
                        class_22385.Method_22443(f26 + 0.6666667f * 12.0f, f8 + 2.1136363f * 1.8924732f - 1.3623189f * 7.168384E-4f, f27 + 0.2638889f * 30.315788f).Method_22433((f24 + 10.440679f * 0.76623374f) * (0.016644021f * 0.23469388f) + f19, (f25 + 4.0f * 2.0f) * (3.1851852f * 0.0012263808f) + f20).Method_22427(f9, f10, f11, 0.43789473f * 1.8269231f).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
                        class_22385.Method_22443(f26 + 11.478261f * 0.6969697f, f8 + 2.75f * 1.4545455f - 0.21428572f * 0.0045572915f, f27 + 0.0f).Method_22433((f24 + 12.133333f * 0.6593407f) * (0.8518519f * 0.0045855977f) + f19, (f25 + 0.0f) * (0.0030048077f * 1.3f) + f20).Method_22427(f9, f10, f11, 0.5466667f * 1.4634147f).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
                        class_22385.Method_22443(f26 + 0.0f, f8 + 4.9620256f * 0.8061224f - 0.3968254f * 0.0024609375f, f27 + 0.0f).Method_22433((f24 + 0.0f) * (1.4385965f * 0.00271532f) + f19, (f25 + 0.0f) * (0.011259191f * 0.3469388f) + f20).Method_22427(f9, f10, f11, 0.38333336f * 2.0869565f).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
                    }
                    if (n2 > (-1 & -1)) {
                        for (n7 = 836 & -16367; n7 < (8201 & -29474); ++n7) {
                            class_22385.Method_22443(f26 + (float)n7 + 0.0f, f8 + 0.0f, f27 + 18.0f * 0.44444445f).Method_22433((f24 + (float)n7 + 0.26506025f * 1.8863636f) * (1.0f * 0.00390625f) + f19, (f25 + 4.111111f * 1.945946f) * (0.005985383f * 0.6526316f) + f20).Method_22427(f2, f3, f4, 0.084337346f * 9.485715f).Method_22446(0.43037975f * -2.3235295f, 0.0f, 0.0f).Method_22451();
                            class_22385.Method_22443(f26 + (float)n7 + 0.0f, f8 + 1.6666666f * 2.4f, f27 + 264.0f * 0.030303031f).Method_22433((f24 + (float)n7 + 0.0625f * 8.0f) * (0.0023958334f * 1.6304348f) + f19, (f25 + 5.8850574f * 1.359375f) * (0.3131313f * 0.012474799f) + f20).Method_22427(f2, f3, f4, 1.9294119f * 0.41463414f).Method_22446(0.044444446f * -22.5f, 0.0f, 0.0f).Method_22451();
                            class_22385.Method_22443(f26 + (float)n7 + 0.0f, f8 + 0.8333333f * 4.8f, f27 + 0.0f).Method_22433((f24 + (float)n7 + 0.54285717f * 0.9210526f) * (1.4648438E-4f * 26.666666f) + f19, (f25 + 0.0f) * (0.6527778f * 0.0059840423f) + f20).Method_22427(f2, f3, f4, 52.0f * 0.015384615f).Method_22446(-2.1111112f * 0.47368422f, 0.0f, 0.0f).Method_22451();
                            class_22385.Method_22443(f26 + (float)n7 + 0.0f, f8 + 0.0f, f27 + 0.0f).Method_22433((f24 + (float)n7 + 1.5517242f * 0.3222222f) * (0.91803277f * 0.0042550224f) + f19, (f25 + 0.0f) * (1.0f * 0.00390625f) + f20).Method_22427(f2, f3, f4, 0.56842107f * 1.4074074f).Method_22446(0.8607595f * -1.1617647f, 0.0f, 0.0f).Method_22451();
                        }
                    }
                    if (n2 <= (24611 & 7941)) {
                        for (n7 = 2056 & 5190; n7 < (9836 & 6410); ++n7) {
                            class_22385.Method_22443(f26 + (float)n7 + 1.0f - 0.5777778f * 0.0016902043f, f8 + 0.0f, f27 + 0.6086956f * 13.142858f).Method_22433((f24 + (float)n7 + 0.4897959f * 1.0208334f) * (0.00546875f * 0.71428573f) + f19, (f25 + 0.7647059f * 10.461538f) * (1.0217391f * 0.0038231383f) + f20).Method_22427(f2, f3, f4, 0.66233766f * 1.2078432f).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
                            class_22385.Method_22443(f26 + (float)n7 + 1.0f - 8.375f * 1.16604475E-4f, f8 + 1.6875f * 2.3703704f, f27 + 0.68817204f * 11.625f).Method_22433((f24 + (float)n7 + 0.39423078f * 1.2682927f) * (0.62711865f * 0.006228885f) + f19, (f25 + 8.0f * 1.0f) * (0.85365856f * 0.004575893f) + f20).Method_22427(f2, f3, f4, 1.0f * 0.8f).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
                            class_22385.Method_22443(f26 + (float)n7 + 1.0f - 0.50980395f * 0.0019155648f, f8 + 5.2682924f * 0.7592593f, f27 + 0.0f).Method_22433((f24 + (float)n7 + 0.15555556f * 3.2142856f) * (5.142857f * 7.595486E-4f) + f19, (f25 + 0.0f) * (1.0277778f * 0.0038006757f) + f20).Method_22427(f2, f3, f4, 0.17297298f * 4.625f).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
                            class_22385.Method_22443(f26 + (float)n7 + 1.0f - 2.52f * 3.875248E-4f, f8 + 0.0f, f27 + 0.0f).Method_22433((f24 + (float)n7 + 12.333333f * 0.040540542f) * (0.017382812f * 0.2247191f) + f19, (f25 + 0.0f) * (0.014914772f * 0.26190478f) + f20).Method_22427(f2, f3, f4, 6.5555553f * 0.1220339f).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
                        }
                    }
                    if (i > (-1 & -1)) {
                        for (n7 = 1058 & -22519; n7 < (4232 & 3596); ++n7) {
                            class_22385.Method_22443(f26 + 0.0f, f8 + 0.3043478f * 13.142858f, f27 + (float)n7 + 0.0f).Method_22433((f24 + 0.0f) * (0.0068824403f * 0.5675676f) + f19, (f25 + (float)n7 + 0.05970149f * 8.375f) * (3.4705882f * 0.0011255296f) + f20).Method_22427(f15, f16, f17, 3.3090909f * 0.24175824f).Method_22446(0.0f, 0.0f, -0.76086956f * 1.3142858f).Method_22451();
                            class_22385.Method_22443(f26 + 0.98717946f * 8.103896f, f8 + 2.95f * 1.3559322f, f27 + (float)n7 + 0.0f).Method_22433((f24 + 5.6f * 1.4285715f) * (4.4f * 8.8778406E-4f) + f19, (f25 + (float)n7 + 0.5875f * 0.85106385f) * (0.0024038462f * 1.625f) + f20).Method_22427(f15, f16, f17, 2.9333334f * 0.27272728f).Method_22446(0.0f, 0.0f, 0.02247191f * -44.5f).Method_22451();
                            class_22385.Method_22443(f26 + 0.09090909f * 88.0f, f8 + 0.0f, f27 + (float)n7 + 0.0f).Method_22433((f24 + 2.2608697f * 3.5384614f) * (6.714286f * 5.817819E-4f) + f19, (f25 + (float)n7 + 3.0333333f * 0.16483517f) * (1.1066667f * 0.003529744f) + f20).Method_22427(f15, f16, f17, 2.317073f * 0.34526318f).Method_22446(0.0f, 0.0f, 4.7777777f * -0.20930234f).Method_22451();
                            class_22385.Method_22443(f26 + 0.0f, f8 + 0.0f, f27 + (float)n7 + 0.0f).Method_22433((f24 + 0.0f) * (0.048828125f * 0.08f) + f19, (f25 + (float)n7 + 4.090909f * 0.12222222f) * (0.0062662764f * 0.6233766f) + f20).Method_22427(f15, f16, f17, 2.4545455f * 0.32592592f).Method_22446(0.0f, 0.0f, -9.0f * 0.11111111f).Method_22451();
                        }
                    }
                    if (i <= (515 & -24555)) {
                        for (n7 = -21807 & 16388; n7 < (968 & 17422); ++n7) {
                            class_22385.Method_22443(f26 + 0.0f, f8 + 5.181818f * 0.77192986f, f27 + (float)n7 + 1.0f - 8.510045E-4f * 1.1475409f).Method_22433((f24 + 0.0f) * (0.013363486f * 0.2923077f) + f19, (f25 + (float)n7 + 0.04464286f * 11.2f) * (2.2977941E-4f * 17.0f) + f20).Method_22427(f15, f16, f17, 0.08089887f * 9.888889f).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
                            class_22385.Method_22443(f26 + 6.557377f * 1.22f, f8 + 0.9756098f * 4.1f, f27 + (float)n7 + 1.0f - 59.0f * 1.6551907E-5f).Method_22433((f24 + 13.5172415f * 0.59183675f) * (3.2552084E-4f * 12.0f) + f19, (f25 + (float)n7 + 0.8235294f * 0.60714287f) * (0.010298296f * 0.37931034f) + f20).Method_22427(f15, f16, f17, 1.7560976f * 0.45555556f).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
                            class_22385.Method_22443(f26 + 1.8431373f * 4.3404255f, f8 + 0.0f, f27 + (float)n7 + 1.0f - 6.0096156E-4f * 1.625f).Method_22433((f24 + 2.107143f * 3.79661f) * (0.016036185f * 0.24358974f) + f19, (f25 + (float)n7 + 0.09259259f * 5.4f) * (0.0052083335f * 0.75f) + f20).Method_22427(f15, f16, f17, 1.4370371f * 0.556701f).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
                            class_22385.Method_22443(f26 + 0.0f, f8 + 0.0f, f27 + (float)n7 + 1.0f - 9.38014E-4f * 1.0410959f).Method_22433((f24 + 0.0f) * (2.1701389E-4f * 18.0f) + f19, (f25 + (float)n7 + 0.484375f * 1.032258f) * (0.005859375f * 0.6666667f) + f20).Method_22427(f15, f16, f17, 9.166667f * 0.087272726f).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
                        }
                    }
                    class_7644.Method_7647();
                }
            }
            this.Field_25009.Method_19414();
        }
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16952();
        Class_16867.Method_16979();
    }

    private void Method_25102() {
        if (Class_19426.Method_19589()) {
            Class_16867.Method_16954();
            Class_16867.Method_16985();
            Class_16867.Method_16947();
            Class_16867.Method_16984(834 & -27766, 803 & 13187, 8449 & 4849, 12944 & 17475);
            Class_39477.Method_39484();
            Class_16867.Method_16930((585 & 22) != 0);
            this.Field_25035.Method_34707(Field_25051);
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            for (int i = 16674 & -24563; i < (2118 & 25110); ++i) {
                Class_16867.Method_16961();
                if (i == (4737 & 17411)) {
                    Class_16867.Method_16940(1440.0f * 0.0625f, 1.0f, 0.0f, 0.0f);
                }
                if (i == (29447 & -32694)) {
                    Class_16867.Method_16940(-6.352941f * 14.166667f, 1.0f, 0.0f, 0.0f);
                }
                if (i == (8195 & -14517)) {
                    Class_16867.Method_16940(1.1884058f * 151.46342f, 1.0f, 0.0f, 0.0f);
                }
                if (i == (24654 & 900)) {
                    Class_16867.Method_16940(167.14285f * 0.53846157f, 0.0f, 0.0f, 1.0f);
                }
                if (i == (-32627 & 597)) {
                    Class_16867.Method_16940(-64.47761f * 1.3958334f, 0.0f, 0.0f, 1.0f);
                }
                class_22385.Method_22417(-13305 & 8199, Class_29585.Field_29586);
                class_22385.Method_22443(-300.0 * 0.3333333333333333, -600.0 * 0.16666666666666666, -30.76923076923077 * 3.25).Method_22433(0.0, 0.0).Method_22424(1064 & -32450, 18984 & 12536, 25642 & 2348, -24833 & 8447).Method_22451();
                class_22385.Method_22443(-76.76767676767678 * 1.3026315789473684, 1.6140350877192982 * -61.95652173913044, 107.54716981132076 * 0.9298245614035088).Method_22433(0.0, 100.0 * 0.16).Method_22424(-24534 & 2728, 936 & 8255, -31186 & 16424, 9471 & -32001).Method_22451();
                class_22385.Method_22443(0.17857142857142858 * 560.0, -46.42857142857143 * 2.1538461538461537, 922.2222222222222 * 0.10843373493975904).Method_22433(8.216216216216216 * 1.9473684210526316, 1.28 * 12.5).Method_22424(24808 & -27860, 808 & 17594, 18106 & -18392, 255 & -21761).Method_22451();
                class_22385.Method_22443(0.13432835820895522 * 744.4444444444445, 1.3518518518518519 * -73.97260273972603, 0.02 * -5000.0).Method_22433(0.84375 * 18.962962962962962, 0.0).Method_22424(2473 & 1656, 8504 & 18536, 360 & 1064, 17151 & 9471).Method_22451();
                class_7644.Method_7647();
                Class_16867.Method_16945();
            }
            Class_16867.Method_16930((8771 & 3077) != 0);
            Class_16867.Method_16965();
            Class_16867.Method_16913();
        }
    }

    private void Method_25103(Iterator iterator) {
        while (iterator.hasNext()) {
            Class_7862 class_7862 = (Class_7862)iterator.next();
            int n = class_7862.Method_7871();
            if (this.Field_25068 - n <= (26000 & -30310)) continue;
            iterator.remove();
        }
    }

    public void Method_25104() {
        this.Field_25009.Method_19411();
    }

    public static void Method_25105(Class_10997 class_10997) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(-16357 & 4387, Class_29585.Field_29602);
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11003).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11003).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22451();
        class_7644.Method_7647();
        class_22385.Method_22417(-31997 & 13471, Class_29585.Field_29602);
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11003).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22451();
        class_7644.Method_7647();
        class_22385.Method_22417(519 & 10689, Class_29585.Field_29602);
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11001).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11003).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11003).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11003).Method_22451();
        class_7644.Method_7647();
    }

    public void Method_25106(Class_570 class_570) {
        if (this.Field_25052 != null) {
            this.Field_25052.\u0000, `((Class_2638)this);
        }
        this.Field_25007 = Double.MIN_VALUE * 1.4603174603174602;
        this.Field_25022 = Double.MIN_VALUE * 0.7435897435897436;
        this.Field_25012 = Double.MIN_VALUE * 0.8269230769230769;
        this.Field_25046 = -2109717152 & -1516240250;
        this.Field_25075 = -536827903 & -1865416664;
        this.Field_25010 = -2013264891 & -717055312;
        this.Field_25032.Method_8522(class_570);
        this.Field_25052 = class_570;
        if (class_570 != null) {
            class_570.\u0000strictfp((Class_2638)this);
            this.Method_25110();
        }
    }

    public void Method_25107(Class_7644 class_7644, Class_22385 class_22385, Class_1061 class_1061, float f) {
        double d = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        double d2 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        double d3 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
        if (!this.Field_25019.isEmpty()) {
            this.Field_25035.Method_34707(Class_24069.Field_24084);
            this.Method_25164();
            class_22385.Method_22417(-31905 & 1159, Class_29585.Field_29597);
            class_22385.Method_22444(-d, -d2, -d3);
            class_22385.Method_22423();
            Iterator iterator = this.Field_25019.values().iterator();
            while (iterator.hasNext()) {
                int n;
                Class_7862 class_7862 = (Class_7862)iterator.next();
                Class_4751 class_4751 = class_7862.Method_7867();
                double d4 = (double)class_4751.\u0000= final() - d;
                double d5 = (double)class_4751.\u0000, `() - d2;
                double d6 = (double)class_4751.\u0000strictfp() - d3;
                Class_3238 class_3238 = this.Field_25052.\u0000strictfp(class_4751).Method_3442();
                if (Class_14610.Field_14619.Method_13570()) {
                    Class_4879 class_4879;
                    int n2;
                    int n3 = n2 = class_3238 instanceof Class_4125 || class_3238 instanceof Class_8211 || class_3238 instanceof Class_14299 || class_3238 instanceof Class_11917 ? 16455 & 4105 : 6177 & 1172;
                    if (n2 == 0 && (class_4879 = this.Field_25052.\u0000strictfp(class_4751)) != null) {
                        n2 = Class_14610.Method_14674(class_4879, Class_14610.Field_14619, new Object[29222 & 2048]) ? 1 : 0;
                    }
                    n = n2 == 0 ? 4101 & -24575 : -28219 & 58;
                } else {
                    int n4 = n = !(class_3238 instanceof Class_4125) && !(class_3238 instanceof Class_8211) && !(class_3238 instanceof Class_14299) && !(class_3238 instanceof Class_11917) ? 257 & -32765 : 11538 & 4108;
                }
                if (n == 0) continue;
                if (d4 * d4 + d5 * d5 + d6 * d6 > 0.7936507936507936 * 1290.24) {
                    iterator.remove();
                    continue;
                }
                Class_3436 class_3436 = this.Field_25052.\u0000strictfp(class_4751);
                if (class_3436.Method_3442().Method_3373() == Class_3713.Field_3718) continue;
                int n5 = class_7862.Method_7870();
                Class_11372 class_11372 = this.Field_25085[n5];
                Class_36704 class_36704 = this.Field_25067.Method_214();
                class_36704.Method_36714(class_3436, class_4751, class_11372, this.Field_25052);
            }
            class_7644.Method_7647();
            class_22385.Method_22444(0.0, 0.0, 0.0);
            this.Method_25129();
        }
    }

    public void Method_25108(Class_4751 class_4751) {
        int n = class_4751.\u0000= final();
        int n2 = class_4751.\u0000, `();
        int n3 = class_4751.\u0000strictfp();
        this.Method_25118(n - (3483 & 16385), n2 - (21011 & 10561), n3 - (41 & 833), n + (8203 & 4229), n2 + (24609 & -27519), n3 + (3977 & 3));
    }

    public void Method_25109(Class_626 class_626, int n, Class_4751 class_4751, int n2) {
        Random random = this.Field_25052.\u0000strictfp;
        switch (n) {
            case 1000: {
                this.Field_25052.Method_608(class_4751, "random.click", 1.0f, 1.0f, (640 & 16393) != 0);
                break;
            }
            case 1001: {
                this.Field_25052.Method_608(class_4751, "random.click", 1.0f, 0.66315794f * 1.8095238f, (19472 & 448) != 0);
                break;
            }
            case 1002: {
                this.Field_25052.Method_608(class_4751, "random.bow", 1.0f, 0.6146342f * 1.9523809f, (9225 & 656) != 0);
                break;
            }
            case 1003: {
                this.Field_25052.Method_608(class_4751, "random.door_open", 1.0f, this.Field_25052.\u0000strictfp.nextFloat() * (0.072916664f * 1.3714286f) + 4.75f * 0.18947367f, (131 & 16744) != 0);
                break;
            }
            case 1004: {
                this.Field_25052.Method_608(class_4751, "random.fizz", 0.6666667f * 0.75f, 1.2297297f * 2.1142857f + (random.nextFloat() - random.nextFloat()) * (0.2139535f * 3.7391305f), (2058 & 2032) != 0);
                break;
            }
            case 1005: {
                if (Class_1956.Method_1978(n2) instanceof Class_32145) {
                    this.Field_25052.\u0000strictfp(class_4751, "records." + ((Class_32145)Class_1956.Method_1978((int)n2)).Field_32147);
                    break;
                }
                this.Field_25052.\u0000strictfp(class_4751, (String)null);
                break;
            }
            case 1006: {
                this.Field_25052.Method_608(class_4751, "random.door_close", 1.0f, this.Field_25052.\u0000strictfp.nextFloat() * (1.0206186f * 0.0979798f) + 1.881818f * 0.47826087f, (-28668 & 18570) != 0);
                break;
            }
            case 1007: {
                this.Field_25052.Method_608(class_4751, "mob.ghast.charge", 68.0f * 0.14705883f, (random.nextFloat() - random.nextFloat()) * (0.4631579f * 0.4318182f) + 1.0f, (576 & -28536) != 0);
                break;
            }
            case 1008: {
                this.Field_25052.Method_608(class_4751, "mob.ghast.fireball", 11.142857f * 0.8974359f, (random.nextFloat() - random.nextFloat()) * (6.3076925f * 0.031707317f) + 1.0f, (320 & 16387) != 0);
                break;
            }
            case 1009: {
                this.Field_25052.Method_608(class_4751, "mob.ghast.fireball", 2.0f, (random.nextFloat() - random.nextFloat()) * (0.4827586f * 0.41428572f) + 1.0f, (17728 & 12336) != 0);
                break;
            }
            case 1010: {
                this.Field_25052.Method_608(class_4751, "mob.zombie.wood", 2.0f, (random.nextFloat() - random.nextFloat()) * (0.18181819f * 1.1f) + 1.0f, (17928 & -20094) != 0);
                break;
            }
            case 1011: {
                this.Field_25052.Method_608(class_4751, "mob.zombie.metal", 2.0f, (random.nextFloat() - random.nextFloat()) * (1.88f * 0.10638298f) + 1.0f, (5144 & 17255) != 0);
                break;
            }
            case 1012: {
                this.Field_25052.Method_608(class_4751, "mob.zombie.woodbreak", 2.0f, (random.nextFloat() - random.nextFloat()) * (0.118918926f * 1.6818181f) + 1.0f, (4336 & -24054) != 0);
                break;
            }
            case 1014: {
                this.Field_25052.Method_608(class_4751, "mob.wither.shoot", 2.0f, (random.nextFloat() - random.nextFloat()) * (1.8780488f * 0.10649351f) + 1.0f, (-10400 & 8196) != 0);
                break;
            }
            case 1015: {
                this.Field_25052.Method_608(class_4751, "mob.bat.takeoff", 7.818182f * 0.006395349f, (random.nextFloat() - random.nextFloat()) * (1.0326087f * 0.1936842f) + 1.0f, (-16286 & 2176) != 0);
                break;
            }
            case 1016: {
                this.Field_25052.Method_608(class_4751, "mob.zombie.infect", 2.0f, (random.nextFloat() - random.nextFloat()) * (0.3794872f * 0.527027f) + 1.0f, (72 & 10660) != 0);
                break;
            }
            case 1017: {
                this.Field_25052.Method_608(class_4751, "mob.zombie.unfect", 2.0f, (random.nextFloat() - random.nextFloat()) * (0.2f * 1.0f) + 1.0f, (18661 & 1042) != 0);
                break;
            }
            case 1020: {
                this.Field_25052.Method_608(class_4751, "random.anvil_break", 1.0f, this.Field_25052.\u0000strictfp.nextFloat() * (2.4615386f * 0.040625f) + 1.3f * 0.6923077f, (673 & 21764) != 0);
                break;
            }
            case 1021: {
                this.Field_25052.Method_608(class_4751, "random.anvil_use", 1.0f, this.Field_25052.\u0000strictfp.nextFloat() * (3.8333333f * 0.026086958f) + 1.5106384f * 0.5957746f, (1664 & 10240) != 0);
                break;
            }
            case 1022: {
                this.Field_25052.Method_608(class_4751, "random.anvil_land", 0.22608696f * 1.3269231f, this.Field_25052.\u0000strictfp.nextFloat() * (0.74418604f * 0.134375f) + 0.49090907f * 1.8333334f, (2560 & 13654) != 0);
                break;
            }
            case 2000: {
                if (!Class_19426.Method_19488()) break;
                int n3 = n2 % (2139 & 1315) - (8193 & 22921);
                int n4 = n2 / (8459 & 6739) % (8195 & 167) - (67 & -28671);
                double d = (double)class_4751.\u0000= final() + (double)n3 * (0.6626506024096386 * 0.9054545454545454) + 0.6571428571428571 * 0.7608695652173914;
                double d2 = (double)class_4751.\u0000, `() + 2.428571428571429 * 0.20588235294117646;
                double d3 = (double)class_4751.\u0000strictfp() + (double)n4 * (0.18681318681318682 * 3.2117647058823526) + 0.5142857142857142 * 0.9722222222222223;
                for (int i = 580 & -8064; i < (-9830 & 523); ++i) {
                    double d4 = random.nextDouble() * (0.6842105263157895 * 0.2923076923076923) + 2.0202020202020202E-4 * 49.5;
                    double d5 = d + (double)n3 * (6.076923076923077 * 0.0016455696202531647) + (random.nextDouble() - 0.15555555555555556 * 3.2142857142857144) * (double)n4 * (1.1 * 0.45454545454545453);
                    double d6 = d2 + (random.nextDouble() - 0.3225806451612903 * 1.55) * (1.9722222222222223 * 0.2535211267605634);
                    double d7 = d3 + (double)n4 * (0.20689655172413793 * 0.04833333333333333) + (random.nextDouble() - 0.5 * 1.0) * (double)n3 * (3.928571428571429 * 0.12727272727272726);
                    double d8 = (double)n3 * d4 + random.nextGaussian() * (0.032105263157894734 * 0.3114754098360656);
                    double d9 = 0.5185185185185185 * -0.05785714285714286 + random.nextGaussian() * (0.0018965517241379313 * 5.2727272727272725);
                    double d10 = (double)n4 * d4 + random.nextGaussian() * (0.03038461538461539 * 0.3291139240506329);
                    this.Method_25089(Class_40274.Field_40283, d5, d6, d7, d8, d9, d10, new int[-29568 & 4130]);
                }
                return;
            }
            case 2001: {
                Class_3238 class_3238 = Class_3238.Method_3323(n2 & (12287 & -28673));
                if (class_3238.Method_3373() != Class_3713.Field_3718) {
                    this.Field_25067.Method_245().Method_29119(new Class_29471(new Class_2080(class_3238.Field_3276.Method_3616()), (class_3238.Field_3276.Method_3618() + 1.0f) / 2.0f, class_3238.Field_3276.Method_3615() * (1.6421053f * 0.4871795f), (float)class_4751.\u0000= final() + 0.9111111f * 0.5487805f, (float)class_4751.\u0000, `() + 0.89705884f * 0.55737704f, (float)class_4751.\u0000strictfp() + 0.20833333f * 2.4f));
                }
                if (!Class_19426.Method_19488()) break;
                this.Field_25067.Field_129.Method_27572(class_4751, class_3238.Method_3342(n2 >> (1454 & -26596) & (16639 & 3583)));
                break;
            }
            case 2002: {
                int n5;
                double d = class_4751.\u0000= final();
                double d11 = class_4751.\u0000, `();
                double d12 = class_4751.\u0000strictfp();
                for (n5 = -29231 & 16428; n5 < (-19444 & 2185); ++n5) {
                    int[] arrn = new int[-31390 & 2070];
                    arrn[22050 & 1] = Class_1956.Method_1986(Class_10527.Field_10687);
                    arrn[4523 & 8193] = n2;
                    this.Method_25089(Class_40274.Field_40290, d, d11, d12, random.nextGaussian() * (0.45 * 0.3333333333333333), random.nextDouble() * (0.5074626865671642 * 0.3941176470588235), random.nextGaussian() * (0.09749999999999999 * 1.5384615384615385), arrn);
                }
                n5 = Class_10527.Field_10687.Method_4119(n2);
                float f = (float)(n5 >> (4120 & 560) & (-20993 & 4351)) / (1.0652174f * 239.38776f);
                float f2 = (float)(n5 >> (-30680 & 16536) & (8447 & 21503)) / (1.882353f * 135.46875f);
                float f3 = (float)(n5 >> (48 & 193) & (-31489 & 16639)) / (205.2439f * 1.2424242f);
                Class_40274 class_40274 = Class_40274.Field_40314;
                if (Class_10527.Field_10687.Method_4113(n2)) {
                    class_40274 = Class_40274.Field_40310;
                }
                for (int i = -30679 & 8976; i < (7908 & 24677); ++i) {
                    double d13 = random.nextDouble() * (0.921875 * 4.338983050847458);
                    double d14 = random.nextDouble() * (2.7762911822421428 * 1.131578947368421) * (1.3243243243243243 * 1.510204081632653);
                    double d15 = Math.cos(d14) * d13;
                    double d16 = 0.010588235294117648 * 0.9444444444444444 + random.nextDouble() * (1.98 * 0.25252525252525254);
                    double d17 = Math.sin(d14) * d13;
                    Class_42218 class_42218 = this.Method_25133(class_40274.Method_40336(), class_40274.Method_40339(), d + d15 * (0.05816326530612245 * 1.719298245614035), d11 + 1.0799999999999998 * 0.2777777777777778, d12 + d17 * (1.0975609756097562 * 0.09111111111111111), d15, d16, d17, new int[2566 & 17616]);
                    if (class_42218 == null) continue;
                    float f4 = 2.264706f * 0.33116883f + random.nextFloat() * (1.7380953f * 0.14383562f);
                    class_42218.Method_42242(f * f4, f2 * f4, f3 * f4);
                    class_42218.Method_42240((float)d13);
                }
                this.Field_25052.Method_608(class_4751, "game.potion.smash", 1.0f, this.Field_25052.\u0000strictfp.nextFloat() * (0.11818182f * 0.84615386f) + 23.666666f * 0.03802817f, (-29999 & 21508) != 0);
                break;
            }
            case 2003: {
                double d = (double)class_4751.\u0000= final() + 1.0 * 0.5;
                double d18 = class_4751.\u0000, `();
                double d19 = (double)class_4751.\u0000strictfp() + 1.0963855421686748 * 0.45604395604395603;
                for (int i = 4388 & 2120; i < (3402 & -8152); ++i) {
                    int[] arrn = new int[-13579 & 12289];
                    arrn[-32768 & 5300] = Class_1956.Method_1986(Class_10527.Field_10660);
                    this.Method_25089(Class_40274.Field_40290, d, d18, d19, random.nextGaussian() * (0.007894736842105263 * 19.0), random.nextDouble() * (1.2586206896551724 * 0.1589041095890411), random.nextGaussian() * (1.7674418604651163 * 0.08486842105263158), arrn);
                }
                for (double d20 = 0.0; d20 < 0.8333333333333334 * 7.5398223686155035; d20 += 0.967741935483871 * 0.16231562043547265) {
                    this.Method_25089(Class_40274.Field_40307, d + Math.cos(d20) * (5.0 * 1.0), d18 - 9.9 * 0.04040404040404041, d19 + Math.sin(d20) * (3.5294117647058822 * 1.4166666666666667), Math.cos(d20) * (6.857142857142857 * -0.7291666666666667), 0.0, Math.sin(d20) * (0.6868686868686869 * -7.279411764705882), new int[2 & 10301]);
                    this.Method_25089(Class_40274.Field_40307, d + Math.cos(d20) * (0.627906976744186 * 7.962962962962963), d18 - 0.9285714285714286 * 0.4307692307692308, d19 + Math.sin(d20) * (0.9310344827586207 * 5.37037037037037), Math.cos(d20) * (0.5348837209302325 * -13.08695652173913), 0.0, Math.sin(d20) * (0.4270833333333333 * -16.390243902439025), new int[86 & -8024]);
                }
                return;
            }
            case 2004: {
                for (int i = 4162 & 1280; i < (2268 & 16437); ++i) {
                    double d = (double)class_4751.\u0000= final() + 0.10294117647058824 * 4.857142857142857 + ((double)this.Field_25052.\u0000strictfp.nextFloat() - 3.227272727272727 * 0.15492957746478875) * (8.0 * 0.25);
                    double d21 = (double)class_4751.\u0000, `() + 7.916666666666667 * 0.06315789473684211 + ((double)this.Field_25052.\u0000strictfp.nextFloat() - 3.142857142857143 * 0.1590909090909091) * (6.571428571428571 * 0.30434782608695654);
                    double d22 = (double)class_4751.\u0000strictfp() + 0.14285714285714285 * 3.5 + ((double)this.Field_25052.\u0000strictfp.nextFloat() - 1.1355932203389831 * 0.44029850746268656) * (2.9285714285714284 * 0.6829268292682927);
                    this.Field_25052.\u0000strictfp(Class_40274.Field_40283, d, d21, d22, 0.0, 0.0, 0.0, new int[6928 & -32702]);
                    this.Field_25052.\u0000strictfp(Class_40274.Field_40318, d, d21, d22, 0.0, 0.0, 0.0, new int[1028 & 8704]);
                }
                return;
            }
            case 2005: {
                Class_24451.Method_24457(this.Field_25052, class_4751, n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_25110() {
        if (this.Field_25052 != null) {
            this.Field_25066 = System.nanoTime();
            this.Field_25078 = 129 & 11365;
            Class_9265.Field_9421.Method_4729(Class_19426.Method_19483());
            Class_9265.Field_9440.Method_4729(Class_19426.Method_19483());
            Class_36539.Method_36551();
            this.Field_25058 = this.Field_25067.Field_84.Field_39801;
            this.Field_25063 = this.Field_25058 * (-23536 & 4245);
            this.Field_25050 = this.Field_25063 * this.Field_25063;
            boolean bl = this.Field_25072;
            this.Field_25072 = Class_32876.Method_32939();
            if (bl && !this.Field_25072) {
                this.Field_25054 = new Class_15400();
                this.Field_25029 = new Class_25883();
            } else if (!bl && this.Field_25072) {
                this.Field_25054 = new Class_18043();
                this.Field_25029 = new Class_23714();
            }
            if (bl != this.Field_25072) {
                this.Method_25141();
                this.Method_25096();
                this.Method_25148();
            }
            if (this.Field_25038 != null) {
                this.Field_25038.Method_13187();
            }
            this.Method_25098();
            HashSet hashSet = this.Field_25071;
            Object object = this.Field_25071;
            synchronized (object) {
                this.Field_25071.clear();
            }
            this.Field_25038 = new Class_13180(this.Field_25052, this.Field_25067.Field_84.Field_39801, this, this.Field_25029);
            if (this.Field_25052 != null && (object = this.Field_25067.Method_246()) != null) {
                this.Field_25038.Method_13193(((Class_1061)object).Field_1130, ((Class_1061)object).Field_1106);
            }
            this.Field_25021 = 258 & 16482;
            Class_6996.Method_7010();
        }
    }

    public void Method_25111(int n, Class_4751 class_4751, int n2) {
        switch (n) {
            case 1013: 
            case 1018: {
                if (this.Field_25067.Method_246() == null) break;
                double d = (double)class_4751.\u0000= final() - this.Field_25067.Method_246().Field_1130;
                double d2 = (double)class_4751.\u0000, `() - this.Field_25067.Method_246().Method_1324();
                double d3 = (double)class_4751.\u0000strictfp() - this.Field_25067.Method_246().Field_1106;
                double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
                double d5 = this.Field_25067.Method_246().Field_1130;
                double d6 = this.Field_25067.Method_246().Method_1324();
                double d7 = this.Field_25067.Method_246().Field_1106;
                if (d4 > 0.0) {
                    d5 += d / d4 * (0.782608695652174 * 2.5555555555555554);
                    d6 += d2 / d4 * (0.075 * 26.666666666666668);
                    d7 += d3 / d4 * (3.3333333333333335 * 0.6);
                }
                if (n == (-25609 & 17397)) {
                    this.Field_25052.Method_589(d5, d6, d7, "mob.wither.spawn", 1.0f, 1.0f, (8848 & 6404) != 0);
                    break;
                }
                this.Field_25052.Method_589(d5, d6, d7, "mob.enderdragon.end", 1.0571429f * 4.7297297f, 1.0f, (-16192 & 12832) != 0);
            }
        }
    }

    public void Method_25112(Class_1061 class_1061, Class_23708 class_23708, float f) {
        int n;
        this.Field_25043 = 5650 & 64;
        if (this.Field_25021 > 0) {
            if (this.Field_25043 > 0) {
                return;
            }
            this.Field_25021 -= 2307 & 29829;
            return;
        }
        this.Field_25011 = class_1061.Method_1255() + (class_1061.Field_1130 - class_1061.Method_1255()) * (double)f;
        this.Field_25006 = class_1061.Method_1170() + (class_1061.Method_1324() - class_1061.Method_1170()) * (double)f;
        this.Field_25076 = class_1061.Method_1271() + (class_1061.Field_1106 - class_1061.Method_1271()) * (double)f;
        this.Field_25052.\u0000strictfp.Method_2789("prepare");
        Class_26692.Field_26697.Method_26715(this.Field_25052, this.Field_25067.Method_253(), this.Field_25067.Field_27, this.Field_25067.Method_246(), f);
        this.Field_25032.Method_8533(this.Field_25052, this.Field_25067.Field_27, this.Field_25067.Method_246(), this.Field_25067.Field_50, this.Field_25067.Field_84, f);
        if (this.Field_25043 == 0) {
            this.Field_25080 = 26656 & -32636;
            this.Field_25001 = -28248 & 10256;
            this.Field_25024 = 19460 & -19750;
            this.Field_25008 = 24610 & 6208;
        }
        Class_1061 class_10612 = this.Field_25067.Method_246();
        double d = class_10612.Field_1126 + (class_10612.Field_1130 - class_10612.Field_1126) * (double)f;
        double d2 = class_10612.Field_1102 + (class_10612.Method_1324() - class_10612.Field_1102) * (double)f;
        double d3 = class_10612.Field_1125 + (class_10612.Field_1106 - class_10612.Field_1125) * (double)f;
        Class_26692.Field_26693 = d;
        Class_26692.Field_26705 = d2;
        Class_26692.Field_26699 = d3;
        this.Field_25032.Method_8523(d, d2, d3);
        this.Field_25067.Field_58.Method_22976();
        this.Field_25052.\u0000strictfp.Method_2783("global");
        List list = this.Field_25052.\u0000strictfp();
        if (this.Field_25043 == 0) {
            this.Field_25080 = list.size();
        }
        if (Class_19426.Method_19486() && this.Field_25067.Field_58.Field_22871) {
            Class_16867.Method_16954();
        }
        this.Field_25005 = Class_14610.Field_14634.Method_13570();
        this.Field_25016 = Class_14610.Field_14643.Method_13570();
        for (n = 337 & -15740; n < this.Field_25052.\u0000= final.size(); ++n) {
            Class_1061 class_10613 = (Class_1061)this.Field_25052.\u0000= final.get(n);
            if (this.Field_25005) {
                Object[] arrobject = new Object[277 & -25877];
                arrobject[1329 & 14414] = this.Field_25043;
                if (!Class_14610.Method_14674(class_10613, Class_14610.Field_14634, arrobject)) continue;
            }
            this.Field_25001 += 5 & 1057;
            if (!class_10613.Method_1209(this.Field_25011, this.Field_25006, this.Field_25076)) continue;
            this.Field_25032.Method_8528(class_10613, f);
        }
        this.Field_25047 = this.Field_25067.Method_246() instanceof Class_859 ? (int)(((Class_859)this.Field_25067.Method_246()).Method_1017() ? 1 : 0) : 6 & 769;
        int n2 = this.Field_25047 ? 1 : 0;
        if (this.Method_25166()) {
            this.Method_25100(class_1061, class_23708, f, list);
        }
        this.Field_25052.\u0000strictfp.Method_2783("entities");
        n = Class_19426.Method_19570() ? 1 : 0;
        if (n != 0) {
            Class_12440.Method_12766();
        }
        this.Method_25113(class_1061, class_23708, f);
        if (n != 0) {
            Class_12440.Method_12717();
            Class_12440.Method_12785();
        }
        this.Field_25052.\u0000strictfp.Method_2783("blockentities");
        this.Method_25160(class_1061, class_23708, f);
        this.Method_25164();
        this.Method_25144(class_1061, class_23708, f);
        this.Method_25129();
        this.Field_25067.Field_58.Method_22979();
        this.Field_25067.Field_25.Method_2790();
    }

    public void Method_25113(Class_1061 class_1061, Class_23708 class_23708, float f) {
        Iterator iterator = this.Field_25081.iterator();
        boolean bl = this.Field_25067.Field_84.Field_39788;
        this.Field_25067.Field_84.Field_39788 = Class_19426.Method_19604();
        boolean bl2 = Class_19426.Method_19570();
        while (iterator.hasNext()) {
            Class_16635 class_16635 = (Class_16635)iterator.next();
            Class_17665 class_17665 = this.Field_25052.Method_582(class_16635.Field_16639.Method_6226());
            Class_30043 class_30043 = class_17665.Method_17711()[class_16635.Field_16639.Method_6226().\u0000, `() / (-3440 & 53)];
            if (class_30043.isEmpty()) continue;
            Iterator iterator2 = class_30043.Method_30053();
            while (iterator2.hasNext()) {
                int n;
                Class_1061 class_10612 = (Class_1061)iterator2.next();
                if (this.Field_25005) {
                    Object[] arrobject = new Object[-28287 & 19985];
                    arrobject[11408 & 20492] = this.Field_25043;
                    if (!Class_14610.Method_14674(class_10612, Class_14610.Field_14634, arrobject)) continue;
                }
                int n2 = n = this.Field_25032.Method_8532(class_10612, class_23708, this.Field_25011, this.Field_25006, this.Field_25076) || class_10612.Field_1099 == this.Field_25067.Field_48 ? 8337 & -28413 : -32498 & 26752;
                if (n != 0) {
                    if (class_10612 == this.Field_25067.Method_246() && this.Field_25067.Field_84.Field_39802 == 0 && !this.Field_25067.Field_58.Field_22854 && !this.Field_25047 || !(class_10612.Method_1324() < 0.0) && !(class_10612.Method_1324() >= 0.5909090909090909 * 433.2307692307692) && !this.Field_25052.\u0000= final(class_10612)) continue;
                    this.Field_25001 += -31643 & 267;
                    if (class_10612.getClass() == Class_36512.class) {
                        class_10612.Field_1141 = 0.05904761904761904 * 1.0161290322580645;
                    }
                    this.Field_25084 = class_10612;
                    if (bl2) {
                        Class_12440.Method_12803(class_10612);
                    }
                    this.Field_25032.Method_8528(class_10612, f);
                    this.Field_25084 = null;
                }
                if (n != 0 || !(class_10612 instanceof Class_47728)) continue;
                if (bl2) {
                    Class_12440.Method_12803(class_10612);
                }
                this.Field_25067.Method_266().Method_8515(class_10612, f);
            }
        }
        this.Field_25067.Field_84.Field_39788 = bl;
    }

    private void Method_25114() {
        this.Field_24998 = 768 & 23578;
    }

    private boolean Method_25115(Class_6176 class_6176) {
        Class_17665 class_17665 = this.Field_25052.Method_587(class_6176.Field_6201, class_6176.Field_6187);
        if (this.Method_25116(class_6176.Field_6201, class_6176.Field_6187)) {
            return (26630 & 1328) != 0;
        }
        if (class_17665.Method_17728()) {
            return (-3967 & 2063) != 0;
        }
        Class_17665 class_176652 = this.Field_25052.Method_587(class_6176.Field_6201 + (109 & 10497), class_6176.Field_6187);
        if (class_176652.Method_17728()) {
            return (-16119 & 8769) != 0;
        }
        class_176652 = this.Field_25052.Method_587(class_6176.Field_6201 - (16435 & -23935), class_6176.Field_6187);
        if (class_176652.Method_17728()) {
            return (5 & 11569) != 0;
        }
        class_176652 = this.Field_25052.Method_587(class_6176.Field_6201, class_6176.Field_6187 + (24769 & 289));
        if (class_176652.Method_17728()) {
            return (16553 & 9477) != 0;
        }
        class_176652 = this.Field_25052.Method_587(class_6176.Field_6201, class_6176.Field_6187 - (6149 & 24577));
        if (class_176652.Method_17728()) {
            return (16803 & -17339) != 0;
        }
        return (14416 & -31700) != 0;
    }

    private boolean Method_25116(int n, int n2) {
        int n3;
        int n4 = n - this.Field_25060;
        if (n4 < 0) {
            n4 = -n4;
        }
        if ((n3 = n2 - this.Field_25000) < 0) {
            n3 = -n3;
        }
        return (n4 <= (22611 & 513) && n3 <= (7169 & 17001) ? 22057 & 17 : 3328 & 17026) != 0;
    }

    public void Method_25117(Class_1061 class_1061, double d, Class_34375 class_34375, int n, boolean bl, double d2, double d3, double d4) {
        Object object;
        Collection<Class_16635> collection;
        Object object2;
        Object object3;
        int n2;
        this.Field_25060 = (int)Math.floor(d2 * (0.051369863013698634 * 1.2166666666666666));
        this.Field_25000 = (int)Math.floor(d4 * (3.3333333333333335 * 0.01875));
        Class_4751 class_4751 = new Class_4751(d2, d3 + (double)class_1061.Method_1357(), d4);
        Class_6176 class_6176 = this.Field_25038.Method_13188(class_4751);
        Class_570 class_570 = this.Field_25052;
        this.Field_25078 = this.Field_25078 || this.Field_25041 > 0 || class_1061.Field_1130 != this.Field_25049 || class_1061.Method_1324() != this.Field_25083 || class_1061.Field_1106 != this.Field_25044 || (double)class_1061.Field_1093 != this.Field_25079 || (double)class_1061.Field_1079 != this.Field_25059 || this.Field_25067.Field_58.Field_22854 ? -30195 & 4113 : 1070 & -32304;
        this.Field_25049 = class_1061.Field_1130;
        this.Field_25083 = class_1061.Method_1324();
        this.Field_25044 = class_1061.Field_1106;
        this.Field_25079 = class_1061.Field_1093;
        this.Field_25059 = class_1061.Field_1079;
        int n3 = this.Field_25053 != null ? 2049 & 16791 : -32371 & 25616;
        Class_9967.Field_9996.Method_35684();
        if (Class_12440.Field_12441) {
            this.Field_25056 = this.Field_25033;
            this.Field_25081 = this.Field_25026;
            this.Field_25048 = this.Field_25074;
            if (n3 == 0 && this.Field_25078) {
                this.Field_25056.clear();
                this.Field_25081.clear();
                this.Field_25048.clear();
                this.Method_25114();
                object2 = new Class_15182();
                ArrayList arrayList = Class_18952.Method_18955(this.Field_25052, d, class_1061, this.Field_25058, this.Field_25038);
                ArrayList arrayList2 = this.Field_25056;
                object3 = this.Field_25081;
                collection = this.Field_25048;
                for (n2 = -32704 & 4096; n2 < arrayList.size(); ++n2) {
                    object = (Class_6176)arrayList.get(n2);
                    if (object == null) continue;
                    ((Class_15182)object2).Method_15187((Class_6176)object);
                    boolean bl2 = (Boolean)this.Field_25067.Field_84.Field_39732.Field_8887.\u0000strictfp();
                    int n4 = 6184 & 8705;
                    if (bl2) {
                        int n5 = n4 = !class_6176.Field_6203 ? 433 & 2053 : -28095 & 24584;
                    }
                    if (!((Class_6176)object).Field_6209.Method_26587() && n4 == 0) {
                        arrayList2.add(((Class_15182)object2).Method_15186());
                    }
                    ((ArrayList)object3).add(((Class_15182)object2).Method_15186());
                    if (((Class_6176)object).Method_6233().Method_26594().size() <= 0) continue;
                    ((ArrayList)collection).add(((Class_15182)object2).Method_15186());
                }
            }
        } else {
            this.Field_25056 = this.Field_25031;
            this.Field_25081 = this.Field_25040;
            this.Field_25048 = this.Field_25061;
        }
        if (n3 == 0 && this.Field_25078 && !Class_12440.Field_12441) {
            this.Field_25078 = 18562 & 8256;
            this.Field_25056.clear();
            this.Field_25081.clear();
            this.Field_25048.clear();
            this.Field_25004.Method_14420();
            this.Method_25114();
            object2 = this.Field_25004;
            int n6 = this.Field_25067.Field_99;
            if (class_6176 != null) {
                int n7 = -30936 & 4114;
                object3 = this.Method_25140(class_6176, null, 13384 & 16902);
                collection = Field_25034;
                if (collection.size() == (-32677 & 2053)) {
                    Vector3f vector3f = this.Method_25155(class_1061, d);
                    object = Class_4595.Method_4658(vector3f.x, vector3f.y, vector3f.z).Method_4660();
                    collection.remove(object);
                }
                if (collection.isEmpty()) {
                    n7 = -32367 & 9773;
                }
                if (n7 != 0 && !bl) {
                    this.Field_25056.add(object3);
                } else {
                    if (bl && class_570.Method_605(class_4751).Method_3688().Method_3375()) {
                        n6 = 21575 & 0;
                    }
                    n2 = ((Boolean)this.Field_25067.Field_84.Field_39732.Field_8887.\u0000strictfp()).booleanValue() ? 1 : 0;
                    int n8 = 17603 & 272;
                    if (n2 != 0) {
                        n8 = this.Method_25115(((Class_16635)object3).Field_16639) ? 1 : 0;
                    }
                    if (n8 == 0) {
                        class_6176.Method_6213(n);
                        ((Class_14415)object2).Method_14422((Class_16635)object3);
                    }
                }
            } else {
                this.Method_25162(class_1061, d, class_34375, n, class_4751);
            }
            this.Method_25119(class_1061, d, class_34375, n, bl, n6 != 0, class_4751, class_4751.\u0000= final(), class_4751.\u0000strictfp());
        }
        Class_9967.Field_9996.Method_35682();
    }

    private void Method_25118(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field_25038.Method_13189(n, n2, n3, n4, n5, n6);
    }

    public void Method_25119(Class_1061 class_1061, double d, Class_34375 class_34375, int n, boolean bl, boolean bl2, Class_4751 class_4751, int n2, int n3) {
        Class_14415 class_14415 = this.Field_25004;
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        ArrayList arrayList = this.Field_25056;
        ArrayList arrayList2 = this.Field_25081;
        ArrayList arrayList3 = this.Field_25048;
        boolean bl3 = Field_25055 = ((Boolean)this.Field_25067.Field_84.Field_39732.Field_8887.\u0000strictfp()).booleanValue();
        while (!class_14415.Method_14424()) {
            Class_16635 class_16635 = class_14415.Method_14425();
            Class_6176 class_6176 = class_16635.Field_16639;
            int n4 = 4098 & 19476;
            if (bl3 && !this.Method_25116(class_6176.Field_6201, class_6176.Field_6187) && !class_6176.Field_6203) continue;
            if ((!class_6176.Field_6209.Method_26587() || class_6176.Method_6215()) && n4 == 0) {
                arrayList.add(class_16635);
            }
            arrayList2.add(class_16635);
            if (class_6176.Method_6233().Method_26594().size() > 0) {
                arrayList3.add(class_16635);
            }
            this.Method_25152(class_16635, class_34375, arrclass_4595, bl2, n, class_4751);
        }
    }

    public void Method_25120(Class_4751 class_4751) {
        int n = class_4751.\u0000= final();
        int n2 = class_4751.\u0000, `();
        int n3 = class_4751.\u0000strictfp();
        this.Method_25118(n - (20737 & 585), n2 - (1285 & 8209), n3 - (12291 & 17929), n + (137 & -14303), n2 + (8465 & 617), n3 + (-32255 & 20609));
    }

    public Class_6176 Method_25121(Class_6176 class_6176, Class_4595 class_4595) {
        if (this.Field_25038 == null) {
            return null;
        }
        Class_4751 class_4751 = class_6176.Method_6236(class_4595);
        int n = class_4751.\u0000= final();
        int n2 = class_4751.\u0000, `();
        int n3 = class_4751.\u0000strictfp();
        if (n2 >= 0 && n2 < (256 & 26496)) {
            return this.Field_25038.Method_13194(n, n2, n3);
        }
        return null;
    }

    public void Method_25122(Class_1061 class_1061) {
        Class_626 class_626;
        if (class_1061 instanceof Class_626 && (class_626 = (Class_626)class_1061) != this.Field_25067.Field_48) {
            Class_47033.Method_47059(new Class_27533(class_626.\u0000, `(), class_626.\u0000strictfp()));
        }
    }

    public void Method_25123() {
    }

    private void Method_25124(double d, double d2, double d3) {
        this.Field_25053 = new Class_42892();
        ((Class_42892)this.Field_25053).Method_42900();
        Class_35322 class_35322 = new Class_35322(this.Field_25053.Field_13482);
        class_35322.transpose();
        Class_35322 class_353222 = new Class_35322(this.Field_25053.Field_13484);
        class_353222.transpose();
        Class_35322 class_353223 = new Class_35322();
        Class_35322.mul((Matrix4f)class_353222, (Matrix4f)class_35322, (Matrix4f)class_353223);
        class_353223.invert();
        this.Field_25036.Field_31174 = d;
        this.Field_25036.Field_31176 = d2;
        this.Field_25036.Field_31175 = d3;
        this.Field_25028[-13663 & 4110] = new Vector4f(-1.0151515f * 0.98507464f, -0.40845072f * 2.4482758f, -0.5416667f * 1.8461539f, 1.0f);
        this.Field_25028[-24447 & 869] = new Vector4f(1.0f, 0.880597f * -1.1355933f, -1.3125f * 0.7619048f, 1.0f);
        this.Field_25028[16451 & -30710] = new Vector4f(1.0f, 1.0f, -0.3580247f * 2.7931035f, 1.0f);
        this.Field_25028[-15865 & 10267] = new Vector4f(0.2857143f * -3.4999998f, 1.0f, -0.5f * 2.0f, 1.0f);
        this.Field_25028[16452 & 6150] = new Vector4f(-0.21428572f * 4.6666665f, -7.454545f * 0.13414635f, 1.0f, 1.0f);
        this.Field_25028[-15027 & 4229] = new Vector4f(1.0f, -18.25f * 0.05479452f, 1.0f, 1.0f);
        this.Field_25028[-27066 & 8198] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.Field_25028[7 & -15993] = new Vector4f(2.0238094f * -0.49411768f, 1.0f, 1.0f, 1.0f);
        for (int i = 1067 & 24580; i < (-32744 & 21646); ++i) {
            Class_35322.transform((Matrix4f)class_353223, (Vector4f)this.Field_25028[i], (Vector4f)this.Field_25028[i]);
            this.Field_25028[i].x /= this.Field_25028[i].w;
            this.Field_25028[i].y /= this.Field_25028[i].w;
            this.Field_25028[i].z /= this.Field_25028[i].w;
            this.Field_25028[i].w = 1.0f;
        }
    }

    public int Method_25125() {
        return this.Field_25008;
    }

    public int Method_25126() {
        return this.Field_25056.size();
    }

    public void Method_25127(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... arrn) {
        try {
            this.Method_25133(n, bl, d, d2, d3, d4, d5, d6, arrn);
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception while adding particle");
            Class_13220 class_13220 = class_13268.Method_13280("Particle being added");
            class_13220.Method_13231("ID", n);
            if (arrn != null) {
                class_13220.Method_13231("Parameters", arrn);
            }
            class_13220.Method_13232("Position", new Class_6105(this, d, d2, d3));
            throw new Class_1809(class_13268);
        }
    }

    public void Method_25128(Class_626 class_626, String string, double d, double d2, double d3, float f, float f2) {
    }

    private void Method_25129() {
        Class_16867.Method_16985();
        Class_16867.Method_16939(0.0f, 0.0f);
        Class_16867.Method_16971();
        Class_16867.Method_16913();
        Class_16867.Method_16930((-30463 & 1673) != 0);
        Class_16867.Method_16945();
        if (Class_19426.Method_19570()) {
            Class_25377.Method_25394();
        }
    }

    private static String Method_25130(String string) {
        int n = 14113;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24997.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_25131(float f, int n) {
        if (!Class_19426.Method_19582()) {
            Class_18343 class_18343;
            Object object;
            if (Class_14610.Field_14624.Method_13570() && (object = Class_14610.Method_14650(class_18343 = this.Field_25067.Field_72.\u0000strictfp, Class_14610.Field_14624, new Object[-32512 & 12449])) != null) {
                return;
            }
            if (this.Field_25067.Field_72.\u0000strictfp.Method_18372()) {
                if (Class_19426.Method_19570()) {
                    Class_12440.Method_12971();
                }
                if (Class_19426.Method_19480()) {
                    this.Method_25101(f, n);
                } else {
                    this.Field_25009.Method_19413((512 & 18434) != 0, this.Field_25068, f);
                    f = 0.0f;
                    Class_16867.Method_16969();
                    float f2 = (float)(this.Field_25067.Method_246().Field_1102 + (this.Field_25067.Method_246().Method_1324() - this.Field_25067.Method_246().Field_1102) * (double)f);
                    int n2 = -24511 & 16389;
                    int n3 = 449 & 1035;
                    Class_7644 class_7644 = Class_7644.Method_7649();
                    Class_22385 class_22385 = class_7644.Method_7648();
                    this.Field_25035.Method_34707(Field_25065);
                    Class_16867.Method_16947();
                    Class_16867.Method_16984(770 & 6050, 2019 & 15119, -14573 & 2049, 9704 & 18435);
                    if (this.Field_25009.Method_19417()) {
                        float f3;
                        this.Field_25009.Method_19415();
                        Vec3 vec3 = this.Field_25052.\u0000, `(f);
                        float f4 = (float)vec3.\u0000= final;
                        float f5 = (float)vec3.\u0000strictfp;
                        float f6 = (float)vec3.\u0000, `;
                        if (n != (24646 & -25310)) {
                            f3 = (f4 * (0.6451613f * 46.5f) + f5 * (1.2638888f * 46.68132f) + f6 * (517.0f * 0.021276595f)) / (719.99994f * 0.1388889f);
                            float f7 = (f4 * (0.9285714f * 32.307693f) + f5 * (0.3448276f * 203.0f)) / (3.2f * 31.25f);
                            float f8 = (f4 * (0.5222222f * 57.446808f) + f6 * (121.50944f * 0.57608694f)) / (11.111111f * 9.0f);
                            f4 = f3;
                            f5 = f7;
                            f6 = f8;
                        }
                        f3 = 2.3333333f * 2.092634E-4f;
                        double d = (float)this.Field_25068 + f;
                        double d2 = this.Field_25067.Method_246().Method_1255() + (this.Field_25067.Method_246().Field_1130 - this.Field_25067.Method_246().Method_1255()) * (double)f + d * (0.03222222150199943 * 0.9310344827586207);
                        double d3 = this.Field_25067.Method_246().Method_1271() + (this.Field_25067.Method_246().Field_1106 - this.Field_25067.Method_246().Method_1271()) * (double)f;
                        int n4 = Class_13337.Method_13371(d2 / (2.9615384615384617 * 691.5324675324675));
                        int n5 = Class_13337.Method_13371(d3 / (1.5333333333333334 * 1335.6521739130435));
                        float f9 = this.Field_25052.\u0000strictfp.Method_18367() - f2 + 2.8823528f * 0.1144898f;
                        f9 += this.Field_25067.Field_84.Field_39730 * (2.7f * 47.407406f);
                        float f10 = (float)((d2 -= (double)(n4 * (6358 & 2088))) * (3.1502016129032257E-4 * 1.55));
                        float f11 = (float)((d3 -= (double)(n5 * (-30171 & 26840))) * (3.700657894736842E-4 * 1.3194444444444444));
                        class_22385.Method_22417(1063 & -32249, Class_29585.Field_29586);
                        for (int i = -104 & -249; i < (1793 & -28382); i += 32) {
                            for (int j = -255 & -122; j < (17152 & -24142); j += 32) {
                                class_22385.Method_22443(i + (11016 & -15164), f9, j + (-5855 & 1760)).Method_22433((float)(i + (272 & 4685)) * (2.7598508E-4f * 1.7692307f) + f10, (float)(j + (1581 & -9872)) * (5.3037447E-4f * 0.9206349f) + f11).Method_22427(f4, f5, f6, 0.5247312f * 1.5245901f).Method_22451();
                                class_22385.Method_22443(i + (288 & 14498), f9, j + (9576 & 672)).Method_22433((float)(i + (-20432 & 1184)) * (0.0017438616f * 0.28f) + f10, (float)(j + (288 & 20648)) * (1.2982457f * 3.761085E-4f) + f11).Method_22427(f4, f5, f6, 0.53846157f * 1.4857142f).Method_22451();
                                class_22385.Method_22443(i + (6304 & -16346), f9, j + (4224 & 1288)).Method_22433((float)(i + (-16096 & 1073)) * (4.6666665f * 1.046317E-4f) + f10, (float)(j + (-28122 & 8337)) * (0.027343748f * 0.017857144f) + f11).Method_22427(f4, f5, f6, 1.8139535f * 0.44102564f).Method_22451();
                                class_22385.Method_22443(i + (-24494 & 2177), f9, j + (20531 & 8256)).Method_22433((float)(i + (132 & 817)) * (1.8780048E-4f * 2.6f) + f10, (float)(j + (1560 & 4417)) * (1.6756756f * 2.9139366E-4f) + f11).Method_22427(f4, f5, f6, 0.7111111f * 1.125f).Method_22451();
                            }
                        }
                        class_7644.Method_7647();
                        this.Field_25009.Method_19414();
                    }
                    this.Field_25009.Method_19416();
                    Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                    Class_16867.Method_16952();
                    Class_16867.Method_16979();
                }
                if (Class_19426.Method_19570()) {
                    Class_12440.Method_12969();
                }
            }
        }
    }

    private static String Method_25132(String string) {
        int n = 21653;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24997.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_42218 Method_25133(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... arrn) {
        if (this.Field_25067 != null && this.Field_25067.Method_246() != null && this.Field_25067.Field_129 != null) {
            int n2 = this.Field_25067.Field_84.Field_39779;
            if (n2 == (14565 & -14589) && this.Field_25052.\u0000strictfp.nextInt(18843 & -28669) == 0) {
                n2 = 13327 & 514;
            }
            double d7 = this.Field_25067.Method_246().Field_1130 - d;
            double d8 = this.Field_25067.Method_246().Method_1321() - d2;
            double d9 = this.Field_25067.Method_246().Field_1106 - d3;
            if (n == Class_40274.Field_40286.Method_40336() && !Class_19426.Method_19516()) {
                return null;
            }
            if (n == Class_40274.Field_40321.Method_40336() && !Class_19426.Method_19516()) {
                return null;
            }
            if (n == Class_40274.Field_40288.Method_40336() && !Class_19426.Method_19516()) {
                return null;
            }
            if (n == Class_40274.Field_40281.Method_40336() && !Class_19426.Method_19600()) {
                return null;
            }
            if (n == Class_40274.Field_40287.Method_40336() && !Class_19426.Method_19590()) {
                return null;
            }
            if (n == Class_40274.Field_40283.Method_40336() && !Class_19426.Method_19563()) {
                return null;
            }
            if (n == Class_40274.Field_40279.Method_40336() && !Class_19426.Method_19563()) {
                return null;
            }
            if (n == Class_40274.Field_40316.Method_40336() && !Class_19426.Method_19530()) {
                return null;
            }
            if (n == Class_40274.Field_40291.Method_40336() && !Class_19426.Method_19530()) {
                return null;
            }
            if (n == Class_40274.Field_40314.Method_40336() && !Class_19426.Method_19530()) {
                return null;
            }
            if (n == Class_40274.Field_40310.Method_40336() && !Class_19426.Method_19530()) {
                return null;
            }
            if (n == Class_40274.Field_40323.Method_40336() && !Class_19426.Method_19530()) {
                return null;
            }
            if (n == Class_40274.Field_40307.Method_40336() && !Class_19426.Method_19568()) {
                return null;
            }
            if (n == Class_40274.Field_40318.Method_40336() && !Class_19426.Method_19511()) {
                return null;
            }
            if (n == Class_40274.Field_40297.Method_40336() && !Class_19426.Method_19476()) {
                return null;
            }
            if (n == Class_40274.Field_40322.Method_40336() && !Class_19426.Method_19535()) {
                return null;
            }
            if (n == Class_40274.Field_40289.Method_40336() && !Class_19426.Method_19535()) {
                return null;
            }
            if (n == Class_40274.Field_40296.Method_40336() && !Class_19426.Method_19468()) {
                return null;
            }
            if (bl) {
                return this.Field_25067.Field_129.Method_27577(n, d, d2, d3, d4, d5, d6, arrn);
            }
            double d10 = 1472.0 * 0.010869565217391304;
            double d11 = 8.982456140350877 * 28.5;
            if (n == Class_40274.Field_40319.Method_40336()) {
                d11 = 42074.66666666667 * 0.9130434782608695;
            }
            if (d7 * d7 + d8 * d8 + d9 * d9 > d11) {
                return null;
            }
            if (n2 > (16529 & -30131)) {
                return null;
            }
            Class_42218 class_42218 = this.Field_25067.Field_129.Method_27577(n, d, d2, d3, d4, d5, d6, arrn);
            if (n == Class_40274.Field_40280.Method_40336()) {
                Class_10125.Method_10182(class_42218, this.Field_25052, d, d2, d3);
            }
            if (n == Class_40274.Field_40313.Method_40336()) {
                Class_10125.Method_10182(class_42218, this.Field_25052, d, d2, d3);
            }
            if (n == Class_40274.Field_40282.Method_40336()) {
                Class_10125.Method_10182(class_42218, this.Field_25052, d, d2, d3);
            }
            if (n == Class_40274.Field_40309.Method_40336()) {
                Class_10125.Method_10157(class_42218);
            }
            if (n == Class_40274.Field_40307.Method_40336()) {
                Class_10125.Method_10156(class_42218);
            }
            if (n == Class_40274.Field_40297.Method_40336()) {
                Class_10125.Method_10184(class_42218, this.Field_25052, d, d2, d3);
            }
            return class_42218;
        }
        return null;
    }

    public boolean Method_25134(double d, double d2, double d3, float f) {
        return (-32092 & 3080) != 0;
    }

    private Class_6176 Method_25135(Class_4751 class_4751, Class_6176 class_6176, Class_4595 class_4595) {
        Class_4751 class_47512 = class_6176.Method_6236(class_4595);
        int n = class_47512.\u0000= final();
        int n2 = class_47512.\u0000, `();
        int n3 = class_47512.\u0000strictfp();
        if (n2 >= 0 && n2 < (12674 & 2305)) {
            int n4;
            int n5 = Class_13337.Method_13382(class_4751.\u0000= final() - n);
            int n6 = Class_13337.Method_13382(class_4751.\u0000strictfp() - n3);
            if (Class_19426.Method_19486() ? n5 > this.Field_25063 || n6 > this.Field_25063 : (n4 = n5 * n5 + n6 * n6) > this.Field_25050) {
                return null;
            }
            return this.Field_25038.Method_13194(n, n2, n3);
        }
        return null;
    }

    public void Method_25136(Class_626 class_626, Class_37110 class_37110, int n, float f) {
        Class_17523.Method_17527(this, class_626, class_37110, n, f);
    }

    public void Method_25137(long l) {
        Class_6176 class_6176;
        Iterator iterator;
        Class_6176 class_61762;
        this.Field_25078 |= this.Field_25070.Method_22218(l);
        if (this.Field_25082.size() > 0) {
            iterator = this.Field_25082.iterator();
            while (iterator.hasNext() && this.Field_25070.Method_22217(class_6176 = (Class_6176)iterator.next())) {
                class_6176.Method_6221((11777 & -32352) != 0);
                iterator.remove();
                class_6176.Field_6198 = -24119 & 16912;
                this.Field_25037.remove(class_6176);
                this.Field_24999.remove(class_6176);
            }
        }
        if (this.Field_24999.size() > 0 && (iterator = this.Field_24999.iterator()).hasNext() && this.Field_25070.Method_22224(class_6176 = (Class_6176)iterator.next())) {
            iterator.remove();
        }
        int n = 8448 & 7384;
        int n2 = Class_19426.Method_19578();
        int n3 = n2 * (78 & 3);
        for (int i = 6268 & 8704; i < this.Field_25037.size() && this.Field_25070.Method_22217(class_61762 = (Class_6176)this.Field_25037.get(i)); ++i) {
            class_61762.Method_6221((-31744 & 4386) != 0);
            class_61762.Field_6198 = 576 & 9262;
            if (class_61762.Method_6233().Method_26587() && n2 < n3) {
                ++n2;
            }
            if (++n >= n2) break;
        }
    }

    private void Method_25138() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_25139(Class_10997 class_10997, int n, int n2, int n3, int n4) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(1043 & 16495, Class_29585.Field_29601);
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_7644.Method_7647();
        class_22385.Method_22417(1411 & -30717, Class_29585.Field_29601);
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_7644.Method_7647();
        class_22385.Method_22417(1 & -30667, Class_29585.Field_29601);
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11001).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11003).Method_22424(n, n2, n3, n4).Method_22451();
        class_7644.Method_7647();
    }

    private Class_16635 Method_25140(Class_6176 class_6176, Class_4595 class_4595, int n) {
        Class_16635 class_16635 = null;
        if (this.Field_24998 < this.Field_25027.size()) {
            class_16635 = (Class_16635)this.Field_25027.get(this.Field_24998);
            class_16635.Method_16643(class_6176, class_4595, n);
        } else {
            class_16635 = new Class_16635(class_6176, class_4595, n);
            this.Field_25027.add(class_16635);
        }
        this.Field_24998 += 10759 & 4489;
        return class_16635;
    }

    private void Method_25141() {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        if (this.Field_25039 != null) {
            this.Field_25039.Method_13579();
        }
        if (this.Field_25069 >= 0) {
            Class_11552.Method_11557(this.Field_25069);
            this.Field_25069 = -1 & -1;
        }
        if (this.Field_25072) {
            this.Field_25039 = new Class_13574(this.Field_25030);
            this.Method_25147(class_22385);
            class_22385.Method_22419();
            class_22385.Method_22434();
            this.Field_25039.Method_13583(class_22385.Method_22420());
        } else {
            this.Field_25069 = Class_11552.Method_11554(26753 & 523);
            Class_16867.Method_16961();
            GL11.glNewList((int)this.Field_25069, (int)(5001 & 6930));
            this.Method_25147(class_22385);
            class_7644.Method_7647();
            GL11.glEndList();
            Class_16867.Method_16945();
        }
    }

    public void Method_25142() {
        if (Class_19426.Method_19570() && Keyboard.isKeyDown((int)(511 & 4157)) && Keyboard.isKeyDown((int)(59 & 29587))) {
            Class_12440.Method_12961();
            Class_12440.Method_12986();
        }
        this.Field_25068 += -30121 & 4105;
        if (this.Field_25068 % (8308 & -32739) == 0) {
            this.Method_25103(this.Field_25019.values().iterator());
        }
    }

    public void Method_25143() {
        if (this.Method_25166()) {
            Class_16867.Method_16947();
            Class_16867.Method_16984(1990 & 8962, 14087 & 17195, 21512 & 9041, -29599 & 25225);
            this.Field_25013.Method_19151(this.Field_25067.Field_80, this.Field_25067.Field_44, (129 & 16704) != 0);
            Class_16867.Method_16952();
        }
    }

    void Method_25144(Class_1061 class_1061, Class_23708 class_23708, float f) {
        boolean bl = Class_19426.Method_19570();
        for (Object v : this.Field_25019.values()) {
            Object object;
            int n;
            Class_4751 class_4751 = ((Class_7862)v).Method_7867();
            Class_4879 class_4879 = this.Field_25052.\u0000strictfp(class_4751);
            if (class_4879 instanceof Class_36146) {
                object = (Class_36146)class_4879;
                if (((Class_36146)object).Field_36148 != null) {
                    class_4751 = class_4751.Method_4765(Class_4595.Field_4602);
                    class_4879 = this.Field_25052.\u0000strictfp(class_4751);
                } else if (((Class_36146)object).Field_36149 != null) {
                    class_4751 = class_4751.Method_4765(Class_4595.Field_4598);
                    class_4879 = this.Field_25052.\u0000strictfp(class_4751);
                }
            }
            object = this.Field_25052.\u0000strictfp(class_4751).Method_3442();
            if (this.Field_25016) {
                n = 26 & 2565;
                if (class_4879 != null) {
                    Class_10997 class_10997;
                    Object[] arrobject = new Object[17163 & 12321];
                    arrobject[584 & -32475] = this.Field_25043;
                    if (Class_14610.Method_14674(class_4879, Class_14610.Field_14643, arrobject) && Class_14610.Method_14674(class_4879, Class_14610.Field_14619, new Object[8752 & -32638]) && (class_10997 = (Class_10997)Class_14610.Method_14650(class_4879, Class_14610.Field_14625, new Object[14912 & -16382])) != null) {
                        n = class_23708.Method_23709(class_10997) ? 1 : 0;
                    }
                }
            } else {
                int n2 = n = class_4879 != null && (object instanceof Class_4125 || object instanceof Class_8211 || object instanceof Class_14299 || object instanceof Class_11917) ? 33 & 10305 : 8 & 0;
            }
            if (n == 0) continue;
            if (bl) {
                Class_12440.Method_12718(class_4879);
            }
            Class_26692.Field_26697.Method_26712(class_4879, f, ((Class_7862)v).Method_7870());
        }
    }

    public void Method_25145(Class_279 class_279) {
        this.Method_25161();
    }

    private static String Method_25146(String string) {
        int n = 18719;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24997.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_25147(Class_22385 class_22385) {
        Random random = new Random(612383450L & 6957659L);
        class_22385.Method_22417(55 & 4303, Class_29585.Field_29602);
        for (int i = -13136 & 781; i < (17916 & 13790); ++i) {
            double d = random.nextFloat() * 2.0f - 1.0f;
            double d2 = random.nextFloat() * 2.0f - 1.0f;
            double d3 = random.nextFloat() * 2.0f - 1.0f;
            double d4 = 0.110377364f * 1.3589743f + random.nextFloat() * (2.32f * 0.04310345f);
            double d5 = d * d + d2 * d2 + d3 * d3;
            if (!(d5 < 1.0) || !(d5 > 1.15 * 0.008695652173913044)) continue;
            d5 = 1.0 / Math.sqrt(d5);
            double d6 = (d *= d5) * (0.8351648351648352 * 119.73684210526315);
            double d7 = (d2 *= d5) * (1.3 * 76.92307692307692);
            double d8 = (d3 *= d5) * (0.1927710843373494 * 518.75);
            double d9 = Math.atan2(d, d3);
            double d10 = Math.sin(d9);
            double d11 = Math.cos(d9);
            double d12 = Math.atan2(Math.sqrt(d * d + d3 * d3), d2);
            double d13 = Math.sin(d12);
            double d14 = Math.cos(d12);
            double d15 = random.nextDouble() * (1.0461538461538462 * 3.0029929776961257) * (5.352941176470588 * 0.37362637362637363);
            double d16 = Math.sin(d15);
            double d17 = Math.cos(d15);
            for (int j = 2 & 6336; j < (15366 & 164); ++j) {
                double d18 = 0.0;
                double d19 = (double)((j & (134 & -24573)) - (-32767 & 17089)) * d4;
                double d20 = (double)((j + (8199 & 20833) & (818 & -16374)) - (5157 & -32493)) * d4;
                double d21 = 0.0;
                double d22 = d19 * d17 - d20 * d16;
                double d23 = d20 * d17 + d19 * d16;
                double d24 = d22 * d13 + 0.0 * d14;
                double d25 = 0.0 * d13 - d22 * d14;
                double d26 = d25 * d10 - d23 * d11;
                double d27 = d23 * d10 + d25 * d11;
                class_22385.Method_22443(d6 + d26, d7 + d24, d8 + d27).Method_22451();
            }
        }
    }

    private void Method_25148() {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        if (this.Field_25042 != null) {
            this.Field_25042.Method_13579();
        }
        if (this.Field_25015 >= 0) {
            Class_11552.Method_11557(this.Field_25015);
            this.Field_25015 = -1 & -1;
        }
        if (this.Field_25072) {
            this.Field_25042 = new Class_13574(this.Field_25030);
            this.Method_25086(class_22385, -14.702703f * 1.0882353f, (8491 & 2625) != 0);
            class_22385.Method_22419();
            class_22385.Method_22434();
            this.Field_25042.Method_13583(class_22385.Method_22420());
        } else {
            this.Field_25015 = Class_11552.Method_11554(-14311 & 8515);
            GL11.glNewList((int)this.Field_25015, (int)(4884 & 4864));
            this.Method_25086(class_22385, -49.454544f * 0.32352942f, (2245 & -31189) != 0);
            class_7644.Method_7647();
            GL11.glEndList();
        }
    }

    public void Method_25149(float f, int n) {
        if (this.Field_25067.Field_72.\u0000strictfp.Method_18379() == (1025 & 2441)) {
            this.Method_25102();
        } else if (this.Field_25067.Field_72.\u0000strictfp.Method_18372()) {
            float f2;
            int n2;
            float f3;
            int n3;
            float f4;
            float f5;
            float f6;
            float f7;
            Class_16867.Method_16922();
            boolean bl = Class_19426.Method_19570();
            if (bl) {
                Class_12440.Method_12865();
            }
            Vec3 vec3 = this.Field_25052.\u0000strictfp(this.Field_25067.Method_246(), f);
            vec3 = Class_10433.Method_10491(vec3, this.Field_25067.Field_72, this.Field_25067.Method_246().Field_1130, this.Field_25067.Method_246().Method_1324() + 1.0, this.Field_25067.Method_246().Field_1106);
            if (bl) {
                Class_12440.Method_12801(vec3);
            }
            float f8 = (float)vec3.\u0000= final;
            float f9 = (float)vec3.\u0000strictfp;
            float f10 = (float)vec3.\u0000, `;
            if (n != (16387 & -29630)) {
                float f11 = (f8 * (1.9230769f * 15.6f) + f9 * (0.42105263f * 140.125f) + f10 * (13.894736f * 0.7916667f)) / (38.271606f * 2.612903f);
                float f12 = (f8 * (23.647058f * 1.2686567f) + f9 * (0.8648649f * 80.9375f)) / (0.8888889f * 112.5f);
                float f13 = (f8 * (1.0465117f * 28.666666f) + f10 * (34.46154f * 2.03125f)) / (50.0f * 2.0f);
                f8 = f11;
                f9 = f12;
                f10 = f13;
            }
            Class_16867.Method_16919(f8, f9, f10);
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            Class_16867.Method_16930((-15744 & 9474) != 0);
            Class_16867.Method_16978();
            if (bl) {
                Class_12440.Method_12752();
            }
            Class_16867.Method_16919(f8, f9, f10);
            if (bl) {
                Class_12440.Method_12960();
            }
            if (Class_19426.Method_19589()) {
                if (this.Field_25072) {
                    this.Field_25003.Method_13582();
                    GL11.glEnableClientState((int)(805404788 & 202414198));
                    GL11.glVertexPointer((int)(16519 & 3683), (int)(5127 & 5174), (int)(461 & -28116), (long)(-3919553258428734331L & 3919553257044443218L));
                    this.Field_25003.Method_13584(25191 & 287);
                    this.Field_25003.Method_13578();
                    GL11.glDisableClientState((int)(-1001216394 & 8968564));
                } else {
                    Class_16867.Method_16929(this.Field_25057);
                }
            }
            Class_16867.Method_16954();
            if (bl) {
                Class_12440.Method_12845();
            }
            Class_16867.Method_16985();
            Class_16867.Method_16947();
            Class_16867.Method_16984(811 & -27774, -30845 & 2823, 33 & -28923, -29691 & 16418);
            Class_39477.Method_39484();
            float[] arrf = this.Field_25052.\u0000strictfp.Method_18368(this.Field_25052.\u0000
            (f), f);
            if (arrf != null && Class_19426.Method_19485()) {
                Class_16867.Method_16922();
                if (bl) {
                    Class_12440.Method_12865();
                }
                Class_16867.Method_16972(8073 & 32005);
                Class_16867.Method_16961();
                Class_16867.Method_16940(1.109375f * 81.12676f, 1.0f, 0.0f, 0.0f);
                Class_16867.Method_16940(Class_13337.Method_13370(this.Field_25052.\u0000%(f)) < 0.0f ? 28.5f * 6.3157897f : 0.0f, 0.0f, 0.0f, 1.0f);
                Class_16867.Method_16940(317.3684f * 0.2835821f, 0.0f, 0.0f, 1.0f);
                f5 = arrf[-28544 & 25120];
                f3 = arrf[-5981 & 4933];
                f7 = arrf[2259 & 24578];
                if (n != (2050 & -16110)) {
                    float f14 = (f5 * (0.5070422f * 59.166668f) + f3 * (29.5f * 2.0f) + f7 * (0.8181818f * 13.444445f)) / (1.8f * 55.555557f);
                    float f15 = (f5 * (2.0270271f * 14.799999f) + f3 * (303.33334f * 0.23076923f)) / (55.932205f * 1.7878788f);
                    f2 = (f5 * (11.25f * 2.6666667f) + f7 * (0.275f * 254.54546f)) / (1.8666667f * 53.57143f);
                    f5 = f14;
                    f3 = f15;
                    f7 = f2;
                }
                class_22385.Method_22417(1807 & -24538, Class_29585.Field_29601);
                class_22385.Method_22443(0.0, 0.2857142857142857 * 350.0, 0.0).Method_22427(f5, f3, f7, arrf[24903 & 5123]).Method_22451();
                n2 = 26217 & -26623;
                for (n3 = -27644 & 18816; n3 <= (-31632 & 411); ++n3) {
                    f2 = (float)n3 * (1.5062431f * 2.0857143f) * 2.0f / (11.169811f * 1.4324324f);
                    f6 = Class_13337.Method_13370(f2);
                    f4 = Class_13337.Method_13350(f2);
                    class_22385.Method_22443(f6 * (0.01754386f * 6840.0f), f4 * (224.61539f * 0.53424656f), -f4 * (480.0f * 0.083333336f) * arrf[16643 & -32697]).Method_22427(arrf[11306 & 385], arrf[-32635 & 4177], arrf[2527 & 1538], 0.0f).Method_22451();
                }
                class_7644.Method_7647();
                Class_16867.Method_16945();
                Class_16867.Method_16972(32642 & 7452);
            }
            Class_16867.Method_16965();
            if (bl) {
                Class_12440.Method_12727();
            }
            Class_16867.Method_16984(13187 & 3850, 897 & -8191, 515 & -24319, -32720 & 24320);
            Class_16867.Method_16961();
            f5 = 1.0f - this.Field_25052.\u0000, for(f);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, f5);
            Class_16867.Method_16940(0.4347826f * -207.0f, 0.0f, 1.0f, 0.0f);
            Class_18011.Method_18018(this.Field_25052, this.Field_25035, f);
            if (bl) {
                Class_12440.Method_12949();
            }
            Class_16867.Method_16940(this.Field_25052.\u0000
            (f) * (220.90909f * 1.6296296f), 1.0f, 0.0f, 0.0f);
            if (bl) {
                Class_12440.Method_12946();
            }
            f3 = 32.307693f * 0.9285714f;
            if (Class_19426.Method_19478()) {
                this.Field_25035.Method_34707(Field_25064);
                class_22385.Method_22417(-32457 & 4239, Class_29585.Field_29598);
                class_22385.Method_22443(-f3, 1.358974358974359 * 73.58490566037736, -f3).Method_22433(0.0, 0.0).Method_22451();
                class_22385.Method_22443(f3, 86.95652173913044 * 1.15, -f3).Method_22433(1.0, 0.0).Method_22451();
                class_22385.Method_22443(f3, 1.8695652173913044 * 53.48837209302325, f3).Method_22433(1.0, 1.0).Method_22451();
                class_22385.Method_22443(-f3, 0.7352941176470589 * 136.0, f3).Method_22433(0.0, 1.0).Method_22451();
                class_7644.Method_7647();
            }
            f3 = 0.9382716f * 21.31579f;
            if (Class_19426.Method_19580()) {
                this.Field_25035.Method_34707(Field_25025);
                int n4 = this.Field_25052.\u0000= final();
                n2 = n4 % (-24571 & 2404);
                n3 = n4 / (1548 & 484) % (8194 & -15566);
                f2 = (float)(n2 + (-26044 & 24842)) / (1.0f * 4.0f);
                f6 = (float)(n3 + (16384 & 4096)) / 2.0f;
                f4 = (float)(n2 + (-22239 & 1053)) / (0.3529412f * 11.333333f);
                float f16 = (float)(n3 + (641 & 69)) / 2.0f;
                class_22385.Method_22417(18439 & 1655, Class_29585.Field_29598);
                class_22385.Method_22443(-f3, 0.631578947368421 * -158.33333333333334, f3).Method_22433(f4, f16).Method_22451();
                class_22385.Method_22443(f3, -110.8108108108108 * 0.9024390243902439, f3).Method_22433(f2, f16).Method_22451();
                class_22385.Method_22443(f3, 0.4 * -250.0, -f3).Method_22433(f2, f6).Method_22451();
                class_22385.Method_22443(-f3, -5.47945205479452 * 18.25, -f3).Method_22433(f4, f6).Method_22451();
                class_7644.Method_7647();
            }
            Class_16867.Method_16922();
            if (bl) {
                Class_12440.Method_12865();
            }
            if ((f7 = this.Field_25052.\u0000, `(f) * f5) > 0.0f && Class_19426.Method_19591() && !Class_18011.Method_18014(this.Field_25052)) {
                Class_16867.Method_16924(f7, f7, f7, f7);
                if (this.Field_25072) {
                    this.Field_25039.Method_13582();
                    GL11.glEnableClientState((int)(52461820 & 1082426228));
                    GL11.glVertexPointer((int)(16419 & 4679), (int)(-11258 & 7750), (int)(5164 & -32500), (long)(573447L & 3601138977556404808L));
                    this.Field_25039.Method_13584(12295 & 103);
                    this.Field_25039.Method_13578();
                    GL11.glDisableClientState((int)(302025076 & 2139253));
                } else {
                    Class_16867.Method_16929(this.Field_25069);
                }
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16952();
            Class_16867.Method_16913();
            Class_16867.Method_16978();
            if (bl) {
                Class_12440.Method_12752();
            }
            Class_16867.Method_16945();
            Class_16867.Method_16922();
            if (bl) {
                Class_12440.Method_12865();
            }
            Class_16867.Method_16919(0.0f, 0.0f, 0.0f);
            double d = this.Field_25067.Field_48.\u0000, `((float)f).\u0000strictfp - this.Field_25052.\u0000strictfp();
            if (d < 0.0) {
                Class_16867.Method_16961();
                Class_16867.Method_16943(0.0f, 0.6181818f * 19.411764f, 0.0f);
                if (this.Field_25072) {
                    this.Field_25042.Method_13582();
                    GL11.glEnableClientState((int)(1418494068 & -2113741962));
                    GL11.glVertexPointer((int)(-23285 & 16387), (int)(5207 & 22150), (int)(4812 & 2061), (long)(546480128L & 6084285956885055744L));
                    this.Field_25042.Method_13584(-23977 & 7);
                    this.Field_25042.Method_13578();
                    GL11.glDisableClientState((int)(1074037108 & 537034869));
                } else {
                    Class_16867.Method_16929(this.Field_25015);
                }
                Class_16867.Method_16945();
                f2 = 1.0f;
                f6 = -((float)(d + 0.3793103448275862 * 171.36363636363637));
                f4 = -1.0909091f * 0.9166667f;
                class_22385.Method_22417(-7921 & 567, Class_29585.Field_29601);
                class_22385.Method_22443(1.6666666666666667 * -0.6, f6, 1.0).Method_22424(10368 & -28660, 1408 & 12372, 16479 & 2336, 8447 & 22015).Method_22451();
                class_22385.Method_22443(1.0, f6, 1.0).Method_22424(2629 & -28616, -32696 & 2338, -31742 & 309, 6399 & -31233).Method_22451();
                class_22385.Method_22443(1.0, -0.024390243902439025 * 41.0, 1.0).Method_22424(164 & 1105, 1026 & 18809, -17472 & 16384, 1279 & -5889).Method_22451();
                class_22385.Method_22443(-13.799999999999999 * 0.07246376811594203, 0.0625 * -16.0, 1.0).Method_22424(8787 & -15352, 2448 & 8192, 137 & 4934, 8447 & 4607).Method_22451();
                class_22385.Method_22443(0.4588235294117647 * -2.1794871794871797, -1.6111111111111112 * 0.6206896551724138, 1.3287671232876712 * -0.7525773195876289).Method_22424(2049 & -32076, 5792 & 16414, -31968 & 144, 12543 & 17151).Method_22451();
                class_22385.Method_22443(1.0, -0.978723404255319 * 1.0217391304347827, -0.08333333333333333 * 12.0).Method_22424(160 & -12264, 4256 & 19790, -24439 & 1056, 23295 & -24321).Method_22451();
                class_22385.Method_22443(1.0, f6, 0.34328358208955223 * -2.9130434782608696).Method_22424(-14335 & 9554, 1538 & 28672, 388 & 22569, 3583 & 12543).Method_22451();
                class_22385.Method_22443(-1.4516129032258065 * 0.6888888888888889, f6, 0.5567010309278351 * -1.7962962962962963).Method_22424(14466 & 73, -32256 & 16387, 146 & -9144, -32513 & 4863).Method_22451();
                class_22385.Method_22443(1.0, 1.1304347826086956 * -0.8846153846153847, 7.1 * -0.14084507042253522).Method_22424(4106 & -32736, 16388 & 3968, -26624 & 9960, -32513 & 1279).Method_22451();
                class_22385.Method_22443(1.0, 0.9714285714285714 * -1.0294117647058825, 1.0).Method_22424(5337 & 0, -28158 & 24588, 25608 & 128, 255 & -32257).Method_22451();
                class_22385.Method_22443(1.0, f6, 1.0).Method_22424(27651 & 4100, 25152 & -28664, 11854 & -12272, 19455 & -27393).Method_22451();
                class_22385.Method_22443(1.0, f6, 0.3484848484848485 * -2.869565217391304).Method_22424(129 & -12764, 23040 & 287, 3 & -10476, -24321 & 767).Method_22451();
                class_22385.Method_22443(-3.2222222222222223 * 0.3103448275862069, f6, 0.6923076923076923 * -1.4444444444444444).Method_22424(4096 & 16902, 25610 & 641, 16400 & 8228, 17663 & 12543).Method_22451();
                class_22385.Method_22443(0.21333333333333335 * -4.6875, f6, 1.0).Method_22424(1573 & 2434, 28672 & 80, -10174 & 517, 255 & -24321).Method_22451();
                class_22385.Method_22443(-0.32857142857142857 * 3.0434782608695654, 6.533333333333333 * -0.15306122448979592, 1.0).Method_22424(21401 & -30654, 2592 & 8470, -24442 & 3072, 255 & 1023).Method_22451();
                class_22385.Method_22443(-0.775 * 1.2903225806451613, 0.525 * -1.9047619047619047, 0.8333333333333334 * -1.2).Method_22424(-27632 & 137, 8704 & -16000, 260 & 6690, 1535 & 17151).Method_22451();
                class_22385.Method_22443(1.1081081081081081 * -0.9024390243902439, 1.3 * -0.7692307692307692, -2.764705882352941 * 0.3617021276595745).Method_22424(11650 & -28611, 20884 & -22526, 16416 & -28732, -24321 & 5631).Method_22451();
                class_22385.Method_22443(-0.7586206896551725 * 1.3181818181818181, -3.7142857142857144 * 0.2692307692307692, 1.0).Method_22424(25402 & -29628, 618 & 2068, 928 & 1092, 8447 & 20735).Method_22451();
                class_22385.Method_22443(1.0, -0.823529411764706 * 1.2142857142857142, 1.0).Method_22424(5 & 522, 4625 & 25664, -31103 & 2048, 767 & 255).Method_22451();
                class_22385.Method_22443(1.0, 0.651685393258427 * -1.5344827586206895, -1.4444444444444444 * 0.6923076923076923).Method_22424(18434 & -27136, -26607 & 18368, 2176 & 8816, 1279 & -30465).Method_22451();
                class_7644.Method_7647();
            }
            if (this.Field_25052.\u0000strictfp.Method_18365()) {
                Class_16867.Method_16919(f8 * (0.654321f * 0.30566037f) + 0.024f * 1.6666666f, f9 * (79.0f * 0.0025316456f) + 0.03265306f * 1.225f, f10 * (1.0117648f * 0.59302324f) + 0.46835443f * 0.21351351f);
            } else {
                Class_16867.Method_16919(f8, f9, f10);
            }
            if (this.Field_25067.Field_84.Field_39801 <= (7052 & 8246)) {
                Class_16867.Method_16919(this.Field_25067.Field_58.Field_22866, this.Field_25067.Field_58.Field_22853, this.Field_25067.Field_58.Field_22914);
            }
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, -((float)(d - 13.037037037037036 * 1.2272727272727273)), 0.0f);
            if (Class_19426.Method_19589()) {
                if (this.Field_25072) {
                    this.Field_25042.Method_13582();
                    GL11.glEnableClientState((int)(72384637 & -922704780));
                    GL11.glVertexPointer((int)(-30705 & 20515), (int)(-19410 & 7238), (int)(16396 & 5068), (long)(1080984825175481412L & -1080984826493795712L));
                    this.Field_25042.Method_13584(271 & -32745);
                    this.Field_25042.Method_13578();
                    GL11.glDisableClientState((int)(411993468 & 73498869));
                } else {
                    Class_16867.Method_16929(this.Field_25015);
                }
            }
            Class_16867.Method_16945();
            Class_16867.Method_16965();
            if (bl) {
                Class_12440.Method_12727();
            }
            Class_16867.Method_16930((8321 & -31487) != 0);
        }
    }

    private static String Method_25150(String string) {
        int n = 16504;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24997.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_25151() {
        return "E: " + this.Field_25001 + "/" + this.Field_25080 + ", B: " + this.Field_25024 + ", I: " + (this.Field_25080 - this.Field_25024 - this.Field_25001) + ", " + Class_19426.Method_19545();
    }

    public void Method_25152(Class_16635 class_16635, Class_34375 class_34375, Class_4595[] arrclass_4595, boolean bl, int n, Class_4751 class_4751) {
        Class_6176 class_6176 = class_16635.Field_16639;
        Class_4595 class_4595 = class_16635.Field_16638;
        Class_14415 class_14415 = this.Field_25004;
        for (int i = 56 & 12358; i < (-24050 & 1094); ++i) {
            Class_6176 class_61762;
            Class_4595 class_45952 = arrclass_4595[i];
            if (bl && class_16635.Method_16642(class_45952.Method_4660().Method_4648()) || bl && class_4595 != null && !class_6176.Method_6233().Method_26589(class_4595.Method_4660(), class_45952) || (class_61762 = this.Method_25135(class_4751, class_6176, class_45952)) == null || !class_61762.Method_6213(n)) continue;
            int n2 = 64 & -17152;
            n2 = Field_25055 ? (int)(class_34375.Method_34384(class_61762.Field_6208, class_61762.Field_6178, class_61762.Field_6195, class_61762.Field_6202, class_61762.Field_6182, class_61762.Field_6196, class_61762.Field_6200, class_61762.Field_6188, class_61762.Field_6197) ? 1 : 0) : (int)(class_34375.Method_34385(class_61762.Field_6194) ? 1 : 0);
            if (n2 == 0) continue;
            Class_16635 class_166352 = this.Method_25140(class_61762, class_45952, class_16635.Field_16637 + (5137 & 16905));
            class_166352.Method_16644(class_16635);
            class_166352.Method_16640(class_45952.Method_4648());
            class_14415.Method_14422(class_166352);
        }
    }

    private boolean Method_25153(Class_4751 class_4751, Class_6176 class_6176) {
        Class_4751 class_47512 = class_6176.Method_6226();
        return (Class_13337.Method_13382(class_4751.\u0000= final() - class_47512.\u0000= final()) > (3988 & -24488) ? -31744 & 21128 : (Class_13337.Method_13382(class_4751.\u0000, `() - class_47512.\u0000, `()) > (-32687 & 4112) ? 6148 & -32542 : (Class_13337.Method_13382(class_4751.\u0000strictfp() - class_47512.\u0000strictfp()) <= (-31599 & 27198) ? 18849 & 8727 : 2643 & 25888))) != 0;
    }

    public int Method_25154() {
        return this.Field_25001;
    }

    protected Vector3f Method_25155(Class_1061 class_1061, double d) {
        float f = (float)((double)class_1061.Field_1078 + (double)(class_1061.Field_1093 - class_1061.Field_1078) * d);
        float f2 = (float)((double)class_1061.Field_1145 + (double)(class_1061.Field_1079 - class_1061.Field_1145) * d);
        if (Class_18.Field_89.Field_84.Field_39802 == (8194 & -24990)) {
            f += 2.4411764f * 73.73494f;
        }
        float f3 = Class_13337.Method_13350(-f2 * (0.0010577753f * 16.5f) - 1.4285715f * 2.1991148f);
        float f4 = Class_13337.Method_13370(-f2 * (0.5119048f * 0.034094803f) - 1.3939394f * 2.2537513f);
        float f5 = -Class_13337.Method_13350(-f * (0.00959931f * 1.8181819f));
        float f6 = Class_13337.Method_13370(-f * (0.0035498224f * 4.9166665f));
        return new Vector3f(f4 * f5, f6, f3 * f5);
    }

    public void Method_25156(String string, Class_4751 class_4751) {
        Class_23763 class_23763 = (Class_23763)this.Field_25020.get(class_4751);
        if (class_23763 != null) {
            this.Field_25067.Method_245().Method_29115(class_23763);
            this.Field_25020.remove(class_4751);
        }
        if (string != null) {
            Class_32145 class_32145 = Class_32145.Method_32148(string);
            if (class_32145 != null) {
                this.Field_25067.Field_105.Method_45466(class_32145.Method_32150());
            }
            Class_2080 class_2080 = null;
            if (Class_14610.Field_14614.Method_13570() && class_32145 != null) {
                Object[] arrobject = new Object[4609 & -32511];
                arrobject[17176 & 1] = string;
                class_2080 = (Class_2080)Class_14610.Method_14650(class_32145, Class_14610.Field_14614, arrobject);
            }
            if (class_2080 == null) {
                class_2080 = new Class_2080(string);
            }
            Class_29471 class_29471 = Class_29471.Method_29475(class_2080, class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
            this.Field_25020.put(class_4751, class_29471);
            this.Field_25067.Method_245().Method_29119(class_29471);
        }
    }

    public void Method_25157(Class_1061 class_1061) {
        Class_626 class_626;
        Class_24158.Method_24177(class_1061);
        if (class_1061 instanceof Class_626 && (class_626 = (Class_626)class_1061) != this.Field_25067.Field_48) {
            Class_47033.Method_47059(new Class_24135(class_626.\u0000, `(), class_626.\u0000strictfp()));
        }
    }

    public void Method_25158(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Method_25118(n - (-32423 & 16385), n2 - (-22261 & 4165), n3 - (1603 & -18379), n4 + (241 & 4357), n5 + (-23915 & 65), n6 + (-29949 & 8209));
    }

    private static String Method_25159(String string) {
        int n = 18588;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24997.class, 2);
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
    void Method_25160(Class_1061 class_1061, Class_23708 class_23708, float f) {
        Object object;
        Object object2;
        Object object32;
        Class_28636 class_28636 = Class_26692.Field_26697.Method_26713();
        Class_39477.Method_39482();
        boolean bl = Class_19426.Method_19570();
        for (Object object32 : this.Field_25048) {
            Class_16635 class_16635 = (Class_16635)object32;
            ArrayList arrayList = class_16635.Field_16639.Method_6233().Method_26594();
            if (arrayList.isEmpty()) continue;
            object2 = arrayList.iterator();
            while (object2.hasNext()) {
                Object object4;
                double d;
                Class_1378 class_1378;
                object = (Class_4879)object2.next();
                if (this.Field_25016) {
                    Object[] arrobject = new Object[-29821 & 12389];
                    arrobject[11342 & 4096] = this.Field_25043;
                    if (!Class_14610.Method_14674(object, Class_14610.Field_14643, arrobject) || (object4 = (Class_10997)Class_14610.Method_14650(object, Class_14610.Field_14625, new Object[-12160 & 515])) != null && !class_23708.Method_23709((Class_10997)object4)) continue;
                }
                object4 = object.getClass();
                if (object4 == Class_33614.class && !Class_19426.Field_19432 && (d = ((Class_4879)object).Method_4897(class_1378.\u0000= package, (class_1378 = this.Field_25067.Field_48).\u0000, for(), class_1378.\u0000= switch)) > 336.0 * 0.7619047619047619) {
                    class_28636.Field_28664 = 1668 & -13981;
                }
                if (bl) {
                    Class_12440.Method_12718((Class_4879)object);
                }
                Class_26692.Field_26697.Method_26712((Class_4879)object, f, -1 & -1);
                this.Field_25008 += -15339 & 8841;
                class_28636.Field_28664 = -32763 & 2105;
            }
        }
        HashSet hashSet = this.Field_25071;
        object32 = this.Field_25071;
        synchronized (object32) {
            for (ArrayList arrayList : this.Field_25071) {
                double d;
                if (this.Field_25016) {
                    Object[] arrobject = new Object[1173 & 16641];
                    arrobject[-8157 & 3208] = this.Field_25043;
                    if (!Class_14610.Method_14674(arrayList, Class_14610.Field_14643, arrobject) || (object2 = (Class_10997)Class_14610.Method_14650(arrayList, Class_14610.Field_14625, new Object[10242 & 1296])) != null && !class_23708.Method_23709((Class_10997)object2)) continue;
                }
                if ((object2 = arrayList.getClass()) == Class_33614.class && !Class_19426.Field_19432 && (d = ((Class_4879)((Object)arrayList)).Method_4897(((Class_626)object).\u0000= package, (object = this.Field_25067.Field_48).\u0000, for(), ((Class_626)object).\u0000= switch)) > 37.925925925925924 * 6.75) {
                    class_28636.Field_28664 = 520 & 1287;
                }
                if (bl) {
                    Class_12440.Method_12718((Class_4879)((Object)arrayList));
                }
                Class_26692.Field_26697.Method_26712((Class_4879)((Object)arrayList), f, -1 & -1);
                class_28636.Field_28664 = 17233 & -22527;
            }
        }
    }

    private void Method_25161() {
        Class_24069 class_24069 = this.Field_25067.Method_189();
        for (int i = -32720 & 14281; i < this.Field_25085.length; ++i) {
            this.Field_25085[i] = class_24069.Method_24109("minecraft:blocks/destroy_stage_" + i);
        }
    }

    public void Method_25162(Class_1061 class_1061, double d, Class_23708 class_23708, int n, Class_4751 class_4751) {
        Class_14415 class_14415 = this.Field_25004;
        int n2 = class_4751.\u0000, `() > 0 ? -28163 & 3322 : -28148 & 16458;
        int n3 = this.Field_25058;
        for (int i = -n3; i <= n3; ++i) {
            for (int j = -n3; j <= n3; ++j) {
                Class_6176 class_6176 = this.Field_25038.Method_13188(new Class_4751((i << (-32764 & 21254)) + (2185 & 26380), n2, (j << (2758 & 260)) + (8 & 203)));
                if (class_6176 == null || !class_23708.Method_23709(class_6176.Field_6194)) continue;
                class_6176.Method_6213(n);
                class_14415.Method_14422(this.Method_25140(class_6176, null, -32728 & 28804));
            }
        }
    }

    public void Method_25163(String string, double d, double d2, double d3, float f, float f2) {
    }

    private void Method_25164() {
        Class_16867.Method_16984(17174 & -31994, 10116 & 19203, -20275 & 529, 2168 & 258);
        Class_16867.Method_16947();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 0.3206522f * 1.559322f);
        Class_16867.Method_16939(0.40789473f * -7.354839f, -3.3139534f * 0.9052632f);
        Class_16867.Method_16970();
        Class_16867.Method_16967(4684 & 3604, 1.0864197f * 0.09204546f);
        Class_16867.Method_16913();
        Class_16867.Method_16961();
        if (Class_19426.Method_19570()) {
            Class_25377.Method_25383();
        }
    }

    public void Method_25165() {
        if (Class_32876.Field_32906) {
            if (Class_7359.Method_7363() == null) {
                Class_7359.Method_7367();
            }
            Class_2080 class_2080 = new Class_2080("shaders/post/entity_outline.json");
            try {
                this.Field_25014 = new Class_26345(this.Field_25067.Method_253(), this.Field_25067.Method_208(), this.Field_25067.Method_164(), class_2080);
                this.Field_25014.Method_26368(this.Field_25067.Field_80, this.Field_25067.Field_44);
                this.Field_25013 = this.Field_25014.Method_26363("final");
            }
            catch (IOException iOException) {
                Field_25073.warn("Failed to load shader: " + class_2080, (Throwable)iOException);
                this.Field_25014 = null;
                this.Field_25013 = null;
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                Field_25073.warn("Failed to load shader: " + class_2080, (Throwable)jsonSyntaxException);
                this.Field_25014 = null;
                this.Field_25013 = null;
            }
        } else {
            this.Field_25014 = null;
            this.Field_25013 = null;
        }
    }

    protected boolean Method_25166() {
        return (this.Field_25013 != null && this.Field_25014 != null && this.Field_25067.Field_48 != null && this.Field_25067.Field_48.\u0000c_() && this.Field_25067.Field_84.Field_39798.Method_8279() ? 2057 & -22843 : -30630 & 1152) != 0;
    }
}

