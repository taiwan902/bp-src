/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.Vec3;

public class Class_8491 {
    public float Field_8492;
    private Class_32090 Field_8493;
    public Class_1061 Field_8494;
    public double Field_8495;
    public double Field_8496;
    public double Field_8497;
    public double Field_8498;
    public float Field_8499;
    private boolean Field_8500 = -15807 & 1041;
    public Class_39702 Field_8501;
    public Class_283 Field_8502;
    private Class_28636 Field_8503;
    private boolean Field_8504 = 17506 & 4380;
    public double Field_8505;
    public Class_34695 Field_8506;
    public double Field_8507;
    public Map Field_8508 = new HashMap();
    private boolean Field_8509 = -12286 & 1668;
    public Class_1061 Field_8510;
    public Map Field_8511 = new HashMap();

    public void Method_8512(float f) {
        this.Field_8492 = f;
    }

    public void Method_8513(boolean bl) {
        this.Field_8504 = bl;
    }

    public boolean Method_8514() {
        return this.Field_8504;
    }

    public void Method_8515(Class_1061 class_1061, float f) {
        double d = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        double d2 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        double d3 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
        Class_27380 class_27380 = this.Method_8516(class_1061);
        if (class_27380 != null && this.Field_8506 != null) {
            int n = class_1061.Method_1272(f);
            int n2 = n % (29988868 & 942105129);
            int n3 = n / (218193929 & 282266628);
            Class_32876.Method_32943(Class_32876.Field_32911, (float)n2 / 1.0f, (float)n3 / 1.0f);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            class_27380.Method_27396(class_1061, d - this.Field_8505, d2 - this.Field_8498, d3 - this.Field_8495);
        }
    }

    public Class_27380 Method_8516(Class_1061 class_1061) {
        if (class_1061 instanceof Class_1456) {
            String string = ((Class_1456)class_1061).Method_1473();
            Class_32090 class_32090 = (Class_32090)this.Field_8511.get(string);
            return class_32090 != null ? class_32090 : this.Field_8493;
        }
        return this.Method_8530(class_1061.getClass());
    }

    private void Method_8517() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public double Method_8518(double d, double d2, double d3) {
        double d4 = d - this.Field_8496;
        double d5 = d2 - this.Field_8507;
        double d6 = d3 - this.Field_8497;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    private void Method_8519(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16930((10282 & 516) != 0);
        Class_16867.Method_16922();
        Class_16867.Method_16931();
        Class_16867.Method_16969();
        Class_16867.Method_16952();
        float f3 = class_1061.Method_1266() / 2.0f;
        Class_10997 class_10997 = class_1061.Method_1315();
        Class_10997 class_109972 = new Class_10997(class_10997.Field_10999 - class_1061.Field_1130 + d, class_10997.Field_11000 - class_1061.Method_1324() + d2, class_10997.Field_11001 - class_1061.Field_1106 + d3, class_10997.Field_11002 - class_1061.Field_1130 + d, class_10997.Field_10998 - class_1061.Method_1324() + d2, class_10997.Field_11003 - class_1061.Field_1106 + d3);
        Class_24997.Method_25139(class_109972, -24321 & 4351, 255 & -31745, 2559 & 255, 255 & 3071);
        if (class_1061 instanceof Class_859) {
            float f4 = 0.014583332f * 0.6857143f;
            Class_24997.Method_25139(new Class_10997(d - (double)f3, d2 + (double)class_1061.Method_1357() - 1.5806451612903225 * 0.006326530470835919, d3 - (double)f3, d + (double)f3, d2 + (double)class_1061.Method_1357() + 0.56 * 0.01785714245800461, d3 + (double)f3), 767 & -13825, -32608 & 15384, -30524 & 8450, -28417 & 3583);
        }
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Vec3 vec3 = class_1061.Method_1296(f2);
        class_22385.Method_22417(403 & 1103, Class_29585.Field_29601);
        class_22385.Method_22443(d, d2 + (double)class_1061.Method_1357(), d3).Method_22424(2176 & 8193, -22528 & 465, 21759 & -30209, -30465 & 17663).Method_22451();
        class_22385.Method_22443(d + vec3.\u0000= final * (3.68421052631579 * 0.5428571428571428), d2 + (double)class_1061.Method_1357() + vec3.\u0000strictfp * (0.28888888888888886 * 6.923076923076923), d3 + vec3.\u0000, ` * (0.6382978723404256 * 3.1333333333333333)).Method_22424(2538 & 20497, 16428 & -20272, 2303 & 16895, 23295 & -24321).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16965();
        Class_16867.Method_16918();
        Class_16867.Method_16979();
        Class_16867.Method_16952();
        Class_16867.Method_16930((30213 & 2051) != 0);
    }

    public Map Method_8520() {
        return this.Field_8508;
    }

    public boolean Method_8521(Class_1061 class_1061, float f, boolean bl) {
        if (class_1061.Field_1084 == 0) {
            class_1061.Field_1126 = class_1061.Field_1130;
            class_1061.Field_1102 = class_1061.Method_1324();
            class_1061.Field_1125 = class_1061.Field_1106;
        }
        double d = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        double d2 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        double d3 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
        float f2 = class_1061.Field_1145 + (class_1061.Field_1079 - class_1061.Field_1145) * f;
        int n = class_1061.Method_1272(f);
        if (class_1061.Method_1300()) {
            n = 1090095344 & 32654320;
        }
        int n2 = n % (1209080640 & 67223552);
        int n3 = n / (598048 & -2055005099);
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n2 / 1.0f, (float)n3 / 1.0f);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        return this.Method_8531(class_1061, d - this.Field_8505, d2 - this.Field_8498, d3 - this.Field_8495, f2, f, bl);
    }

    public void Method_8522(Class_283 class_283) {
        this.Field_8502 = class_283;
    }

    public void Method_8523(double d, double d2, double d3) {
        this.Field_8505 = d;
        this.Field_8498 = d2;
        this.Field_8495 = d3;
    }

    public boolean Method_8524(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        return this.Method_8531(class_1061, d, d2, d3, f, f2, (9344 & 44) != 0);
    }

    public void Method_8525(boolean bl) {
        this.Field_8500 = bl;
    }

    public Class_28636 Method_8526() {
        return this.Field_8503;
    }

    public void Method_8527(boolean bl) {
        this.Field_8509 = bl;
    }

    public boolean Method_8528(Class_1061 class_1061, float f) {
        return this.Method_8521(class_1061, f, (3204 & 4466) != 0);
    }

    public boolean Method_8529() {
        return this.Field_8500;
    }

    public Class_27380 Method_8530(Class class_) {
        Class_27380 class_27380 = (Class_27380)this.Field_8508.get(class_);
        if (class_27380 == null && class_ != Class_1061.class) {
            class_27380 = this.Method_8530(class_.getSuperclass());
            this.Field_8508.put(class_, class_27380);
        }
        return class_27380;
    }

    public boolean Method_8531(Class_1061 class_1061, double d, double d2, double d3, float f, float f2, boolean bl) {
        Class_27380 class_27380 = null;
        try {
            class_27380 = this.Method_8516(class_1061);
            if (class_27380 != null && this.Field_8506 != null) {
                try {
                    if (class_27380 instanceof Class_28538) {
                        ((Class_28538)class_27380).Method_28554(this.Field_8509);
                    }
                    class_27380.Method_27403(class_1061, d, d2, d3, f, f2);
                }
                catch (Throwable throwable) {
                    throw new Class_1809(Class_13268.Method_13285(throwable, "Rendering entity in world"));
                }
                try {
                    if (!this.Field_8509) {
                        class_27380.Method_27390(class_1061, d, d2, d3, f, f2);
                    }
                }
                catch (Throwable throwable) {
                    throw new Class_1809(Class_13268.Method_13285(throwable, "Post-rendering entity in world"));
                }
                if (this.Field_8504 && !class_1061.Method_1358() && !bl) {
                    try {
                        this.Method_8519(class_1061, d, d2, d3, f, f2);
                    }
                    catch (Throwable throwable) {
                        throw new Class_1809(Class_13268.Method_13285(throwable, "Rendering entity hitbox in world"));
                    }
                }
            } else if (this.Field_8506 != null) {
                return (9288 & -12030) != 0;
            }
            return (20993 & -24567) != 0;
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Rendering entity in world");
            Class_13220 class_13220 = class_13268.Method_13280("Entity being rendered");
            class_1061.Method_1284(class_13220);
            Class_13220 class_132202 = class_13268.Method_13280("Renderer details");
            class_132202.Method_13231("Assigned renderer", class_27380);
            class_132202.Method_13231("Location", Class_13220.Method_13236(d, d2, d3));
            class_132202.Method_13231("Rotation", Float.valueOf(f));
            class_132202.Method_13231("Delta", Float.valueOf(f2));
            throw new Class_1809(class_13268);
        }
    }

    public Class_8491(Class_34695 class_34695, Class_44252 class_44252) {
        this.Field_8506 = class_34695;
        this.Field_8508.put(Class_45324.class, new Class_45965(this));
        this.Field_8508.put(Class_44290.class, new Class_41379(this));
        this.Field_8508.put(Class_47600.class, new Class_45185(this, new Class_45963(), 0.809375f * 0.8648649f));
        this.Field_8508.put(Class_46658.class, new Class_41699(this, new Class_44706(), 0.81632656f * 0.85749996f));
        this.Field_8508.put(Class_43539.class, new Class_46965(this, new Class_45539(), 0.38783786f * 1.804878f));
        this.Field_8508.put(Class_46942.class, new Class_41545(this, new Class_45539(), 0.26101694f * 2.6818182f));
        this.Field_8508.put(Class_47526.class, new Class_42319(this, new Class_36481(), 3.0833333f * 0.16216217f));
        this.Field_8508.put(Class_46796.class, new Class_41279(this, new Class_39500(), 3.590909f * 0.08354431f));
        this.Field_8508.put(Class_47883.class, new Class_41448(this, new Class_40137(), 1.5749999f * 0.25396827f));
        this.Field_8508.put(Class_44525.class, new Class_41971(this, new Class_42739(), 0.9230769f * 0.32500002f));
        this.Field_8508.put(Class_45373.class, new Class_42293(this));
        this.Field_8508.put(Class_45994.class, new Class_46158(this));
        this.Field_8508.put(Class_43073.class, new Class_45521(this));
        this.Field_8508.put(Class_46025.class, new Class_42962(this));
        this.Field_8508.put(Class_45531.class, new Class_47754(this));
        this.Field_8508.put(Class_43151.class, new Class_47639(this));
        this.Field_8508.put(Class_44826.class, new Class_47513(this));
        this.Field_8508.put(Class_42260.class, new Class_41608(this));
        this.Field_8508.put(Class_46429.class, new Class_47687(this));
        this.Field_8508.put(Class_43566.class, new Class_47651(this));
        this.Field_8508.put(Class_35570.class, new Class_43961(this, new Class_36646(8336 & -10221), 0.16129032f * 1.5500001f));
        this.Field_8508.put(Class_36060.class, new Class_43252(this));
        this.Field_8508.put(Class_43146.class, new Class_40854(this, new Class_38131(), 0.35f * 1.4285715f, 3.1818182f * 1.8857143f));
        this.Field_8508.put(Class_46703.class, new Class_41328(this));
        this.Field_8508.put(Class_38719.class, new Class_47343(this, new Class_35327(), 1.3461539f * 0.52f));
        this.Field_8508.put(Class_43334.class, new Class_40529(this));
        this.Field_8508.put(Class_45624.class, new Class_40774(this));
        this.Field_8508.put(Class_47097.class, new Class_40113(this));
        this.Field_8508.put(Class_44640.class, new Class_41614(this));
        this.Field_8508.put(Class_34590.class, new Class_42177(this));
        this.Field_8508.put(Class_14845.class, new Class_30840(this));
        this.Field_8508.put(Class_42901.class, new Class_42347(this));
        this.Field_8508.put(Class_1061.class, new Class_38932(this));
        this.Field_8508.put(Class_30799.class, new Class_30849(this));
        this.Field_8508.put(Class_36512.class, new Class_31158(this, class_44252));
        this.Field_8508.put(Class_32225.class, new Class_29887(this));
        this.Field_8508.put(Class_41498.class, new Class_30088(this));
        this.Field_8508.put(Class_34918.class, new Class_46399(this, Class_10527.Field_10561, class_44252));
        this.Field_8508.put(Class_34203.class, new Class_46399(this, Class_10527.Field_10644, class_44252));
        this.Field_8508.put(Class_25548.class, new Class_46399(this, Class_10527.Field_10660, class_44252));
        this.Field_8508.put(Class_47588.class, new Class_46399(this, Class_10527.Field_10545, class_44252));
        this.Field_8508.put(Class_43663.class, new Class_46792(this, class_44252));
        this.Field_8508.put(Class_35722.class, new Class_46399(this, Class_10527.Field_10643, class_44252));
        this.Field_8508.put(Class_41709.class, new Class_46399(this, Class_10527.Field_10583, class_44252));
        this.Field_8508.put(Class_34950.class, new Class_30220(this, 2.0f));
        this.Field_8508.put(Class_36739.class, new Class_30220(this, 4.388889f * 0.11392405f));
        this.Field_8508.put(Class_47728.class, new Class_33714(this));
        this.Field_8508.put(Class_3443.class, new Class_35690(this, class_44252));
        this.Field_8508.put(Class_3481.class, new Class_36261(this));
        this.Field_8508.put(Class_5813.class, new Class_33001(this));
        this.Field_8508.put(Class_4486.class, new Class_38794(this));
        this.Field_8508.put(Class_27288.class, new Class_32132(this));
        this.Field_8508.put(Class_19785.class, new Class_42408(this));
        this.Field_8508.put(Class_33348.class, new Class_35786(this));
        this.Field_8508.put(Class_15933.class, new Class_33730(this));
        this.Field_8508.put(Class_25683.class, new Class_32512(this));
        this.Field_8508.put(Class_32050.class, new Class_38084(this));
        this.Field_8508.put(Class_46199.class, new Class_42301(this, new Class_40710(), 0.42857143f * 1.75f));
        this.Field_8508.put(Class_27363.class, new Class_42623(this));
        this.Field_8493 = new Class_32090(this);
        this.Field_8511.put("default", this.Field_8493);
        this.Field_8511.put("slim", new Class_32090(this, (16389 & 3649) != 0));
    }

    public boolean Method_8532(Class_1061 class_1061, Class_23708 class_23708, double d, double d2, double d3) {
        Class_27380 class_27380 = this.Method_8516(class_1061);
        return (class_27380 != null && class_27380.Method_27388(class_1061, class_23708, d, d2, d3) ? -32205 & 19461 : 11010 & 17417) != 0;
    }

    public void Method_8533(Class_283 class_283, Class_28636 class_28636, Class_1061 class_1061, Class_1061 class_10612, Class_39702 class_39702, float f) {
        this.Field_8502 = class_283;
        this.Field_8501 = class_39702;
        this.Field_8510 = class_1061;
        this.Field_8494 = class_10612;
        this.Field_8503 = class_28636;
        if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1017()) {
            Class_3436 class_3436 = class_283.Method_375(new Class_4751(class_1061));
            Class_3238 class_3238 = class_3436.Method_3442();
            if (class_3238 == Class_9265.Field_9441) {
                int n = ((Class_4595)((Object)class_3436.Method_3440(Class_5108.\u0000strictfp))).Method_4619();
                this.Field_8492 = n * (5214 & 25466) + (-29451 & 28854);
                this.Field_8499 = 0.0f;
            }
        } else {
            this.Field_8492 = class_1061.Method_1179(f);
            this.Field_8499 = class_1061.Method_1160(f);
        }
        if (class_39702.Field_39802 == (-14334 & 5591)) {
            this.Field_8492 += 772.94116f * 0.23287672f;
        }
        this.Field_8496 = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        this.Field_8507 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        this.Field_8497 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
    }
}

