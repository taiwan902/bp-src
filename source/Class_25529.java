/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_25529 {
    private final Random Field_25530 = new Random();
    private final double Field_25531;
    private final Class_1061 Field_25532;
    private final boolean Field_25533;
    private final Map Field_25534 = Maps.newHashMap();
    private final ArrayList Field_25535 = Lists.newArrayList();
    private final double Field_25536;
    private final float Field_25537;
    private final Class_283 Field_25538;
    private final boolean Field_25539;
    private final double Field_25540;

    public void Method_25541() {
        this.Field_25535.clear();
    }

    public List Method_25542() {
        return this.Field_25535;
    }

    public Class_25529(Class_283 class_283, Class_1061 class_1061, double d, double d2, double d3, float f, List list) {
        this(class_283, class_1061, d, d2, d3, f, (-31872 & 24612) != 0, (3601 & 4395) != 0, list);
    }

    public Class_25529(Class_283 class_283, Class_1061 class_1061, double d, double d2, double d3, float f, boolean bl, boolean bl2, List list) {
        this(class_283, class_1061, d, d2, d3, f, bl, bl2);
        this.Field_25535.addAll(list);
    }

    public Map Method_25543() {
        return this.Field_25534;
    }

    public void Method_25544(boolean bl) {
        this.Field_25538.Method_475(this.Field_25536, this.Field_25540, this.Field_25531, "random.explode", 5.87234f * 0.68115944f, (1.0f + (this.Field_25538.Field_307.nextFloat() - this.Field_25538.Field_307.nextFloat()) * (0.125f * 1.6f)) * (2.0f * 0.35f));
        if (this.Field_25537 >= 2.0f && this.Field_25539) {
            this.Field_25538.Method_407(Class_40274.Field_40286, this.Field_25536, this.Field_25540, this.Field_25531, 1.0, 0.0, 0.0, new int[-29552 & 8224]);
        } else {
            this.Field_25538.Method_407(Class_40274.Field_40321, this.Field_25536, this.Field_25540, this.Field_25531, 1.0, 0.0, 0.0, new int[5 & -12038]);
        }
        if (this.Field_25539) {
            for (Class_4751 class_4751 : this.Field_25535) {
                Class_3238 class_3238 = this.Field_25538.\u0000strictfp(class_4751).Method_3688();
                if (bl) {
                    double d = (float)class_4751.\u0000= final() + this.Field_25538.Field_307.nextFloat();
                    double d2 = (float)class_4751.\u0000, `() + this.Field_25538.Field_307.nextFloat();
                    double d3 = (float)class_4751.\u0000strictfp() + this.Field_25538.Field_307.nextFloat();
                    double d4 = d - this.Field_25536;
                    double d5 = d2 - this.Field_25540;
                    double d6 = d3 - this.Field_25531;
                    double d7 = Class_13337.Method_13347(d4 * d4 + d5 * d5 + d6 * d6);
                    d4 /= d7;
                    d5 /= d7;
                    d6 /= d7;
                    double d8 = 9.333333333333334 * 0.05357142857142857 / (d7 / (double)this.Field_25537 + 2.0454545454545454 * 0.04888888888888889);
                    this.Field_25538.Method_407(Class_40274.Field_40288, (d + this.Field_25536 * 1.0) / (1.59375 * 1.2549019607843137), (d2 + this.Field_25540 * 1.0) / (1.596774193548387 * 1.2525252525252526), (d3 + this.Field_25531 * 1.0) / (15.833333333333334 * 0.12631578947368421), d4 *= (d8 *= (double)(this.Field_25538.Field_307.nextFloat() * this.Field_25538.Field_307.nextFloat() + 0.6666667f * 0.45f)), d5 *= d8, d6 *= d8, new int[-7944 & 2055]);
                    this.Field_25538.Method_407(Class_40274.Field_40283, d, d2, d3, d4, d5, d6, new int[644 & 8195]);
                }
                if (class_3238.Method_3373() == Class_3713.Field_3718) continue;
                if (class_3238.Method_3295(this)) {
                    class_3238.Method_3361(this.Field_25538, class_4751, this.Field_25538.Method_375(class_4751), 1.0f / this.Field_25537, 256 & 6668);
                }
                this.Field_25538.Method_462(class_4751, Class_9265.Field_9351.Method_3293(), 2319 & 9219);
                class_3238.Method_3414(this.Field_25538, class_4751, this);
            }
        }
        if (this.Field_25533) {
            for (Class_4751 class_4751 : this.Field_25535) {
                if (this.Field_25538.Method_375(class_4751).Method_3442().Method_3373() != Class_3713.Field_3718 || !this.Field_25538.Method_375(class_4751.Method_4782()).Method_3442().Method_3381() || this.Field_25530.nextInt(-24253 & 21523) != 0) continue;
                this.Field_25538.Method_435(class_4751, Class_9265.Field_9342.\u0000strictfp());
            }
        }
    }

    private void Method_25545() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_25546() {
        float f;
        Object object;
        int n;
        Class_44898 class_44898 = new Class_44898();
        int n2 = 22 & -9640;
        for (int i = 960 & -26620; i < (184 & -13548); ++i) {
            for (int j = 8380 & 17474; j < (17104 & 5136); ++j) {
                for (n = -1022 & 280; n < (4368 & 20182); ++n) {
                    if (i != 0 && i != (10351 & -16113) && j != 0 && j != (671 & 17423) && n != 0 && n != (2063 & -32193)) continue;
                    double d = (float)i / (1.9772727f * 7.586207f) * 2.0f - 1.0f;
                    double d2 = (float)j / (0.5952381f * 25.2f) * 2.0f - 1.0f;
                    double d3 = (float)n / (0.25773194f * 58.200005f) * 2.0f - 1.0f;
                    double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
                    d /= d4;
                    d2 /= d4;
                    d3 /= d4;
                    double d5 = this.Field_25536;
                    double d6 = this.Field_25540;
                    double d7 = this.Field_25531;
                    float f2 = 1.5714285f * 0.1909091f;
                    for (float f3 = this.Field_25537 * (0.14285715f * 4.8999996f + this.Field_25538.Field_307.nextFloat() * (0.3906977f * 1.5357143f)); f3 > 0.0f; f3 -= 2.1363637f * 0.10531915f) {
                        object = new Class_4751(d5, d6, d7);
                        Class_3677 class_3677 = this.Field_25538.\u0000strictfp(object);
                        if (class_3677.Method_3688().Method_3373() != Class_3713.Field_3718) {
                            f = this.Field_25532 != null ? this.Field_25532.Method_1205(this, this.Field_25538, (Class_4751)object, class_3677) : class_3677.Method_3688().Method_3348(null);
                            f3 -= (f + 0.72352946f * 0.41463414f) * (0.4489796f * 0.66818184f);
                        }
                        if (f3 > 0.0f && (this.Field_25532 == null || this.Field_25532.Method_1352(this, this.Field_25538, (Class_4751)object, class_3677, f3))) {
                            class_44898.Method_44925(object);
                        }
                        d5 += d * (0.726027397260274 * 0.413207563589204);
                        d6 += d2 * (0.251162800677987 * 1.1944444444444444);
                        d7 += d3 * (0.043373495699411416 * 6.916666666666667);
                    }
                }
            }
        }
        Class_20759 class_20759 = class_44898.Method_44923();
        while (class_20759.hasNext()) {
            Class_4751 class_4751 = (Class_4751)class_20759.next();
            this.Field_25535.add(class_4751);
        }
        float f4 = this.Field_25537 * 2.0f;
        int n3 = Class_13337.Method_13371(this.Field_25536 - (double)f4 - 1.0);
        n = Class_13337.Method_13371(this.Field_25536 + (double)f4 + 1.0);
        int n4 = Class_13337.Method_13371(this.Field_25540 - (double)f4 - 1.0);
        int n5 = Class_13337.Method_13371(this.Field_25540 + (double)f4 + 1.0);
        int n6 = Class_13337.Method_13371(this.Field_25531 - (double)f4 - 1.0);
        int n7 = Class_13337.Method_13371(this.Field_25531 + (double)f4 + 1.0);
        ArrayList arrayList = this.Field_25538.Method_473(this.Field_25532, new Class_10997(n3, n4, n6, n, n5, n7));
        Vec3 vec3 = new Vec3(this.Field_25536, this.Field_25540, this.Field_25531);
        for (int i = -32720 & 256; i < arrayList.size(); ++i) {
            double d;
            double d8;
            double d9;
            double d10;
            Class_1061 class_1061 = (Class_1061)arrayList.get(i);
            if (class_1061.Method_1334() || !((d9 = class_1061.Method_1186(this.Field_25536, this.Field_25540, this.Field_25531) / (double)f4) <= 1.0) || (object = (Object)Class_13337.Method_13347((d = class_1061.Field_1130 - this.Field_25536) * d + (d10 = class_1061.Method_1324() + (double)class_1061.Method_1357() - this.Field_25540) * d10 + (d8 = class_1061.Field_1106 - this.Field_25531) * d8)) == 0.0) continue;
            f = this.Field_25538.Method_419(vec3, class_1061.Method_1315());
            double d11 = (1.0 - d9) * f;
            class_1061.Method_1340(Class_32797.Method_32838(this), (int)((d11 * d11 + d11) / (1.1948051948051948 * 1.673913043478261) * (1.2954545454545454 * 6.175438596491229) * (double)f4 + 1.0));
            double d12 = Class_33196.Method_33214(class_1061, d11);
            class_1061.Field_1071 += (d /= object) * d12;
            class_1061.Method_1161(class_1061.Method_1224() + (d10 /= object) * d12);
            class_1061.Field_1072 += (d8 /= object) * d12;
            if (!(class_1061 instanceof Class_626) || ((Class_626)class_1061).Field_694.Field_18085) continue;
            this.Field_25534.put((Class_626)class_1061, new Vec3(d * d11, d10 * d11, d8 * d11));
        }
    }

    public Class_859 Method_25547() {
        return this.Field_25532 == null ? null : (this.Field_25532 instanceof Class_5813 ? ((Class_5813)this.Field_25532).Method_5819() : (this.Field_25532 instanceof Class_859 ? (Class_859)this.Field_25532 : null));
    }

    public Class_25529(Class_283 class_283, Class_1061 class_1061, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        this.Field_25538 = class_283;
        this.Field_25532 = class_1061;
        this.Field_25537 = f;
        this.Field_25536 = d;
        this.Field_25540 = d2;
        this.Field_25531 = d3;
        this.Field_25533 = bl;
        this.Field_25539 = bl2;
    }
}

