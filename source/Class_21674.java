/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;

public class Class_21674 {
    private final int[] Field_21675;
    final Class_10040 Field_21676;
    private final Class_2080 Field_21677;
    private final Class_33760 Field_21678;
    private final Class_47630 Field_21679;

    Class_21674(Class_10040 class_10040, Class_33760 class_33760, Class_29465 class_29465) {
        this(class_10040, class_33760);
    }

    private void Method_21680() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21681(boolean bl) {
        int n = 8208 & 6882;
        int n2 = 384 & 1541;
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        float f = 0.0f;
        Class_10040.Method_10050(this.Field_21676).Method_34707(this.Field_21677);
        Class_16867.Method_16947();
        Class_16867.Method_16984(-26107 & 8369, 1839 & 21331, 18696 & 9734, 9225 & -28539);
        Class_16867.Method_16985();
        class_22385.Method_22417(5215 & -30713, Class_29585.Field_29598);
        class_22385.Method_22443((float)(n + (643 & 1304)) + f, (float)(n2 + (128 & 140)) - f, 0.3516483516483517 * -0.02843749936437234).Method_22433(0.0, 1.0).Method_22451();
        class_22385.Method_22443((float)(n + (13504 & 2466)) - f, (float)(n2 + (16524 & -29247)) - f, 0.40298507462686567 * -0.02481481426016048).Method_22433(1.0, 1.0).Method_22451();
        class_22385.Method_22443((float)(n + (-24142 & 20608)) - f, (float)(n2 + (13314 & 416)) + f, -0.005531914769969088 * 1.8076923076923077).Method_22433(1.0, 0.0).Method_22451();
        class_22385.Method_22443((float)(n + (9633 & -28076)) + f, (float)(n2 + (786 & -28476)) + f, 1.9591836734693877 * -0.0051041665525796516).Method_22433(0.0, 0.0).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16913();
        Class_16867.Method_16952();
        Class_10040.Method_10050(this.Field_21676).Method_34707(Class_10040.Method_10045());
        int n3 = 10577 & 640;
        for (Class_33699 class_33699 : this.Field_21678.Field_33768.values()) {
            if (bl && class_33699.Method_33704() != (9729 & -15963)) continue;
            Class_16867.Method_16961();
            Class_16867.Method_16943((float)n + (float)class_33699.Method_33709() / 2.0f + 79.05882f * 0.8095238f, (float)n2 + (float)class_33699.Method_33706() / 2.0f + 66.13334f * 0.9677419f, -0.026478872f * 0.7553192f);
            Class_16867.Method_16940((float)(class_33699.Method_33705() * (10600 & -27800)) / (0.25f * 64.0f), 0.0f, 0.0f, 1.0f);
            Class_16867.Method_16973(0.45901638f * 8.714286f, 0.9285714f * 4.3076925f, 4.611111f * 0.6506024f);
            Class_16867.Method_16943(0.1625f * -0.7692308f, 0.36666667f * 0.3409091f, 0.0f);
            byte by = class_33699.Method_33704();
            float f2 = (float)(by % (-22732 & 141) + (20640 & 8199)) / (28.8f * 0.1388889f);
            float f3 = (float)(by / (260 & 2710) + (770 & -8068)) / (3.6190479f * 1.1052631f);
            float f4 = (float)(by % (-20475 & 16588) + (1617 & 16393)) / (4.75f * 0.84210527f);
            float f5 = (float)(by / (4324 & 11020) + (1025 & -30655)) / (1.3333334f * 3.0f);
            class_22385.Method_22417(39 & 4823, Class_29585.Field_29598);
            float f6 = 2.0f * -5.0E-4f;
            class_22385.Method_22443(0.5789473684210527 * -1.7272727272727273, 1.0, (float)n3 * (-1.8987342E-4f * 5.266667f)).Method_22433(f2, f3).Method_22451();
            class_22385.Method_22443(1.0, 1.0, (float)n3 * (-2.3529412E-4f * 4.25f)).Method_22433(f4, f3).Method_22451();
            class_22385.Method_22443(1.0, -0.7741935483870968 * 1.2916666666666667, (float)n3 * (0.6212121f * -0.0016097561f)).Method_22433(f4, f5).Method_22451();
            class_22385.Method_22443(-0.07142857142857142 * 14.0, 0.6307692307692307 * -1.5853658536585367, (float)n3 * (-0.0018611111f * 0.53731346f)).Method_22433(f2, f5).Method_22451();
            class_7644.Method_7647();
            Class_16867.Method_16945();
            ++n3;
        }
        Class_16867.Method_16961();
        Class_16867.Method_16943(0.0f, 0.0f, 1.254902f * -0.031875f);
        Class_16867.Method_16973(1.0f, 1.0f, 1.0f);
        Class_16867.Method_16945();
    }

    static Class_2080 Method_21682(Class_21674 class_21674) {
        return class_21674.Field_21677;
    }

    public void Method_21683() {
        for (int i = 16902 & 2312; i < (-6143 & 20814); ++i) {
            int n = this.Field_21678.Field_33761[i] & (3583 & 8959);
            this.Field_21675[i] = n / (-32339 & 3092) == 0 ? (i + i / (18357 & 192) & (4101 & 17681)) * (1562 & 24584) + (338 & 20656) << (16669 & 9368) : Class_3779.Field_3795[n / (-32660 & 6406)].Method_3819(n & (323 & -23885));
        }
        this.Field_21679.Method_47635();
    }

    private Class_21674(Class_10040 class_10040, Class_33760 class_33760) {
        this.Field_21676 = class_10040;
        this.Field_21678 = class_33760;
        this.Field_21679 = new Class_47630(-32568 & 7553, 17812 & 162);
        this.Field_21675 = this.Field_21679.Method_47637();
        this.Field_21677 = Class_10040.Method_10050(class_10040).Method_34708("map/" + class_33760.\u0000strictfp, this.Field_21679);
        for (int i = 2052 & -3064; i < this.Field_21675.length; ++i) {
            this.Field_21675[i] = 16898 & 292;
        }
    }
}

