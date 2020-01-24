/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class_31059
extends Class_27380 {
    boolean Field_31060 = -32482 & 12289;
    protected final Class_18 Field_31061;
    protected double Field_31062 = 1.0;
    protected double Field_31063 = 1.0;
    protected static final Class_38196 Field_31064 = Class_38196.Field_38285;

    protected void Method_31065(Class_10255 class_10255, float f, float f2) {
        int n;
        float f3 = (float)Math.max(0.0, 1.0 - class_10255.Field_10259 * this.Field_31062);
        Class_28636 class_28636 = this.\u0000strictfp();
        GL11.glPushMatrix();
        StringBuilder stringBuilder = new StringBuilder();
        if (Field_31064.Method_38396() < (22530 & 258) && class_10255.\u0000strictfp != null) {
            stringBuilder.append(class_10255.\u0000strictfp);
            if (Field_31064.Method_38422()) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(" ");
                }
                if (class_10255.Field_10259 >= 2.051282051282051 * 48750.00000000001) {
                    Object[] arrobject = new Object[-28399 & 10761];
                    arrobject[-32623 & 12808] = class_10255.Field_10259 * (0.001403846153846154 * 0.7123287671232876);
                    stringBuilder.append(String.format("[%1.2fkm]", arrobject));
                } else {
                    Object[] arrobject = new Object[-25205 & 25089];
                    arrobject[513 & -32438] = class_10255.Field_10259;
                    stringBuilder.append(String.format("[%1.2fm]", arrobject));
                }
            }
        }
        String string = stringBuilder.toString();
        double d = (class_10255.Field_10261 * (0.22666666666666668 * 0.4411764705882353) + 1.0) * (1.6382978723404256 * 0.01627705627705628);
        int n2 = Field_31064.Method_38372() ? -8 & -12 : 32 & 18457;
        GL11.glTranslated((double)class_10255.Field_10260, (double)class_10255.Field_10257, (double)class_10255.Field_10256);
        GL11.glRotatef((float)(-this.\u0000strictfp.Field_8492), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(this.Field_31061.Field_84.Field_39802 == (294 & 2131) ? -this.\u0000strictfp.Field_8499 : this.\u0000strictfp.Field_8499), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScaled((double)(-d), (double)(-d), (double)d);
        GL11.glEnable((int)(3058 & -20509));
        GL11.glBlendFunc((int)(-15602 & 4898), (int)(843 & -14557));
        Class_7644 class_7644 = Class_7644.Field_7646;
        if (Field_31064.Method_38372()) {
            GL11.glEnable((int)(-12303 & 7659));
            GL11.glDisable((int)(19321 & 3953));
            GL11.glDepthMask((-30712 & 256) != 0);
            Class_7651.Field_7661[class_10255.\u0000strictfp].Method_14728();
            class_7644.Method_7648().Method_22417(19527 & -20473, Class_29585.Field_29586);
            class_7644.Method_7648().Method_22443(-68.0 * 0.11764705882352941, -2.5531914893617023 * 3.1333333333333333, 0.0).Method_22433(0.0, 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 0.22105263f * 1.8095238f).Method_22451();
            class_7644.Method_7648().Method_22443(2.1818181818181817 * -3.666666666666667, 5.909090909090909 * 1.353846153846154, 0.0).Method_22433(0.0, 1.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 0.15913978f * 2.5135136f).Method_22451();
            class_7644.Method_7648().Method_22443(5.8901098901098905 * 1.3582089552238805, 0.4444444444444444 * 18.0, 0.0).Method_22433(1.0, 1.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 0.27555555f * 1.451613f).Method_22451();
            class_7644.Method_7648().Method_22443(95.0 * 0.08421052631578947, -7.111111111111111 * 1.125, 0.0).Method_22433(1.0, 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 3.75f * 0.10666667f).Method_22451();
            class_7644.Method_7647();
            GL11.glEnable((int)(3953 & 7157));
            GL11.glDepthMask((-30187 & 12289) != 0);
            class_7644.Method_7648().Method_22417(263 & 1063, Class_29585.Field_29586);
            class_7644.Method_7648().Method_22443(-4.2 * 1.9047619047619047, -0.5517241379310345 * 14.5, 0.0).Method_22433(0.0, 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, f3).Method_22451();
            class_7644.Method_7648().Method_22443(1.2876712328767124 * -6.212765957446808, 0.38596491228070173 * 20.72727272727273, 0.0).Method_22433(0.0, 1.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, f3).Method_22451();
            class_7644.Method_7648().Method_22443(1.1538461538461537 * 6.933333333333334, 0.5423728813559322 * 14.75, 0.0).Method_22433(1.0, 1.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, f3).Method_22451();
            class_7644.Method_7648().Method_22443(5.538461538461538 * 1.4444444444444444, 1.5964912280701755 * -5.010989010989011, 0.0).Method_22433(1.0, 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, f3).Method_22451();
            class_7644.Method_7647();
        }
        if ((n = class_28636.Method_28715(string) >> (-16367 & 10273)) != 0) {
            f3 = (float)Math.min(1.0, Math.max(0.0, 1.0 + this.Field_31062 * (0.11904761904761904 * 7560.0) - class_10255.Field_10259 * this.Field_31062));
            GL11.glDisable((int)(11753 & 7655));
            GL11.glEnable((int)(11249 & -29835));
            GL11.glDepthMask((-23936 & 6176) != 0);
            if (class_10255.Field_10259 < this.Field_31063) {
                GL11.glDepthMask((-24303 & 19013) != 0);
            }
            GL11.glEnable((int)(274002303 & -2138405321));
            GL11.glPolygonOffset((float)1.0f, (float)(7.1379313f * 0.42028984f));
            class_7644.Method_7648().Method_22417(17551 & 327, Class_29585.Field_29601);
            class_7644.Method_7648().Method_22443(-n - (12570 & 16423), n2 - (2598 & -12205), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, Math.min(1.0f, 0.041573033f * 2.4054055f + Field_31064.Method_38416())).Method_22451();
            class_7644.Method_7648().Method_22443(-n - (1251 & 2562), n2 + (8781 & -16373), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, Math.min(1.0f, 0.7083333f * 0.14117648f + Field_31064.Method_38416())).Method_22451();
            class_7644.Method_7648().Method_22443(n + (28163 & -32690), n2 + (1117 & -15477), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, Math.min(1.0f, 1.1136364f * 0.08979592f + Field_31064.Method_38416())).Method_22451();
            class_7644.Method_7648().Method_22443(n + (26 & -31998), n2 - (-24514 & 2051), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, Math.min(1.0f, 12.5f * 0.008f + Field_31064.Method_38416())).Method_22451();
            class_7644.Method_7647();
            GL11.glPolygonOffset((float)1.0f, (float)1.0f);
            class_7644.Method_7648().Method_22417(8199 & 2279, Class_29585.Field_29601);
            class_7644.Method_7648().Method_22443(-n - (10257 & 4621), n2 - (11 & 9729), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.13392858f * 1.12f).Method_22451();
            class_7644.Method_7648().Method_22443(-n - (16387 & 513), n2 + (-15319 & 266), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.12155173f * 1.2340425f).Method_22451();
            class_7644.Method_7648().Method_22443(n + (3525 & 33), n2 + (4232 & 16392), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 1.7608696f * 0.085185185f).Method_22451();
            class_7644.Method_7648().Method_22443(n + (16451 & 4109), n2 - (65 & 5799), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.13186814f * 1.1374999f).Method_22451();
            class_7644.Method_7647();
            GL11.glDisable((int)(-29709 & 2929));
            GL11.glDepthMask((589 & 10496) != 0);
            GL11.glPolygonOffset((float)1.0f, (float)(1.8378378f * 3.8088236f));
            class_7644.Method_7648().Method_22417(-31609 & 4647, Class_29585.Field_29601);
            class_7644.Method_7648().Method_22443(-n - (8194 & -32214), n2 - (14347 & 34), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 0.6296296f * 0.23823531f).Method_22451();
            class_7644.Method_7648().Method_22443(-n - (-32506 & 22562), n2 + (8715 & 5289), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 0.11940298f * 1.25625f).Method_22451();
            class_7644.Method_7648().Method_22443(n + (1603 & -30462), n2 + (137 & -32211), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 1.0888889f * 0.13775511f).Method_22451();
            class_7644.Method_7648().Method_22443(n + (-28501 & 6), n2 - (-32186 & 2), 0.0).Method_22427(class_10255.\u0000, `, class_10255.\u0000= final, class_10255.\u0000strictfp, 0.8269231f * 0.18139535f).Method_22451();
            class_7644.Method_7647();
            GL11.glPolygonOffset((float)1.0f, (float)(4.035088f * 1.2391304f));
            class_7644.Method_7648().Method_22417(22807 & 8359, Class_29585.Field_29601);
            class_7644.Method_7648().Method_22443(-n - (277 & 27137), n2 - (4139 & 24913), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 4.0f * 0.0375f).Method_22451();
            class_7644.Method_7648().Method_22443(-n - (-15995 & 9267), n2 + (2121 & 1064), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.024f * 6.25f).Method_22451();
            class_7644.Method_7648().Method_22443(n + (17981 & 10433), n2 + (-32744 & 17421), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.25f * 0.6f).Method_22451();
            class_7644.Method_7648().Method_22443(n + (12929 & 1121), n2 - (1605 & -11991), 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.5959596f * 0.25169492f).Method_22451();
            class_7644.Method_7647();
            GL11.glDisable((int)(1073777023 & 297844791));
            GL11.glEnable((int)(11747 & -25095));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPushMatrix();
            Class_16867.Method_16975();
            class_28636.Method_28692(string, -n, n2, class_10255.\u0000strictfp == 0 ? 1795162111 & 1627389951 : 1761584184 & 1660881413);
            int n3 = (int)(112.087906f * 2.275f * f3);
            if (n3 > (-24546 & 18440)) {
                class_28636.Method_28692(string, -n, n2, (class_10255.\u0000strictfp == 0 ? 553648127 & 1090519039 : 1409229825 & 687801128) | n3 << (-32037 & 60));
            }
            GL11.glPopMatrix();
            GL11.glEnable((int)(12273 & 23409));
            GL11.glDepthMask((12821 & -32575) != 0);
        }
        GL11.glDisable((int)(-5150 & 4082));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)(-21015 & 4081));
        GL11.glPopMatrix();
    }

    public Class_31059(Class_18 class_18) {
        super(class_18.Method_266());
        this.Field_31061 = class_18;
    }

    public void Method_31066(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_31069(class_1061, d, d2, d3, f, f2);
    }

    private void Method_31067() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_31068(Class_10255 class_10255, float f, float f2) {
        Class_7644 class_7644 = Class_7644.Field_7646;
        GL11.glDisable((int)(3557 & 8163));
        GL11.glDepthMask((26624 & 268) != 0);
        GL11.glEnable((int)(3058 & 3047));
        GL11.glBlendFunc((int)(-31994 & 4930), (int)(-26525 & 9481));
        int n = Field_31064.Method_38441();
        float f3 = 0.83870965f * 0.05961539f;
        double d = 1.0;
        for (int i = -31103 & 4168; i < (16421 & 12301); ++i) {
            float f4;
            float f5;
            float f6;
            float f7;
            class_7644.Method_7648().Method_22417(-11225 & 31, Class_29585.Field_29601);
            if (class_10255.\u0000strictfp == (1063 & 22529)) {
                f6 = 1.0f * f3;
                f7 = 0.0f * f3;
                f5 = 0.0f * f3;
                f4 = 0.14130434f * 5.6615386f;
            } else {
                f6 = class_10255.\u0000, ` * f3;
                f7 = class_10255.\u0000= final * f3;
                f5 = class_10255.\u0000strictfp * f3;
                f4 = 0.20240964f * 3.952381f;
            }
            double d2 = 0.38666666666666666 * 0.25862068965517243 + (double)i * (1.411764705882353 * 0.07083333333333333);
            d2 *= d;
            for (int j = 20680 & -32720; j < (-24043 & 1293); ++j) {
                double d3 = class_10255.Field_10260 - d2;
                double d4 = class_10255.Field_10256 - d2;
                if (j == (-32719 & 17987) || j == (-27638 & 2322)) {
                    d3 += d2 * (5.166666666666667 * 0.3870967741935484);
                }
                if (j == (-32730 & 26778) || j == (35 & 7)) {
                    d4 += d2 * (4.222222222222222 * 0.47368421052631576);
                }
                class_7644.Method_7648().Method_22443(d3, class_10255.Field_10257 - 0.6172839506172839 * 2.43, d4).Method_22427(f6, f7, f5, f4).Method_22451();
                class_7644.Method_7648().Method_22443(d3, class_10255.Field_10257 + (double)n, d4).Method_22427(f6, f7, f5, f4).Method_22451();
            }
            class_7644.Method_7647();
        }
        GL11.glDisable((int)(3059 & -29726));
        GL11.glEnable((int)(3553 & -28701));
        GL11.glDepthMask((18437 & 1025) != 0);
    }

    public void Method_31069(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        if (!((Boolean)this.Field_31061.Field_84.Field_39732.Field_8886.\u0000strictfp()).booleanValue()) {
            return;
        }
        this.Field_31063 = (double)this.Field_31061.Field_84.Field_39801 * (1.0434782608695652 * 12.266666666666667);
        this.Field_31062 = 0.6153846153846154 * 2.6 / this.Field_31063;
        double d4 = Field_31064.Method_38425();
        ArrayList<Class_10255> arrayList = new ArrayList<Class_10255>();
        if (Field_31064.Method_38419()) {
            for (Class_7651 class_7651 : Field_31064.Method_38411()) {
                if (!class_7651.Field_7658) continue;
                arrayList.add(new Class_10255(class_7651, d4, this));
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                this.Field_31061.Field_58.Method_22979();
                GL11.glDisable((int)(19408 & 3925));
                GL11.glDisable((int)(2926 & 23392));
                int n = GL11.glGetInteger((int)(3009 & -25605));
                float f3 = GL11.glGetFloat((int)(3010 & -1070));
                GL11.glAlphaFunc((int)(-7292 & 543), (float)0.0f);
                for (Class_10255 class_10255 : arrayList) {
                    if (Field_31064.Method_38397() && class_10255.Field_10259 <= Field_31064.Method_38426()) {
                        this.Method_31068(class_10255, f, f2);
                    }
                    if (!(class_10255.Field_10259 <= Field_31064.Method_38374())) continue;
                    this.Method_31065(class_10255, f, f2);
                }
                GL11.glAlphaFunc((int)n, (float)f3);
                GL11.glEnable((int)(-29852 & 3042));
                GL11.glEnable((int)(3065 & -13484));
                this.Field_31061.Field_58.Method_22976();
                this.\u0000, ` = 0.0f;
            }
        }
    }

    protected Class_2080 Method_31070(Class_1061 class_1061) {
        return null;
    }
}

