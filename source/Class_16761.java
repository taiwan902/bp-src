/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Class_16761 {
    private Class_42854 Field_16762 = null;
    private boolean Field_16763 = 18968 & -24480;
    private float Field_16764 = 1.0f;
    private float Field_16765 = 1.0f;
    private int Field_16766 = -1 & -1;
    public String Field_16767 = null;
    public Class_27481 Field_16768 = null;
    private int Field_16769 = -1 & -1;
    private boolean Field_16770 = 5137 & 2153;
    private int Field_16771 = 1416 & 2138;
    private Class_27481 Field_16772 = null;
    private float[] Field_16773 = Field_16778;
    private int Field_16774 = 1027 & -18175;
    private int Field_16775 = -1 & -1;
    public int Field_16776 = -1 & -1;
    private boolean Field_16777 = -27770 & 16392;
    public static final float[] Field_16778;
    private Class_283 Field_16779 = null;
    private boolean Field_16780 = -32768 & 13098;
    private int Field_16781 = -1 & -1;
    public Class_17281[] Field_16782 = null;

    private float Method_16783(Class_283 class_283) {
        Class_1061 class_1061 = Class_18.Field_89.Method_246();
        if (class_1061 == null) {
            return 0.0f;
        }
        Class_4751 class_4751 = class_1061.Method_1175();
        if (this.Field_16782 != null) {
            Class_17281 class_17281 = class_283.Method_547(class_4751);
            if (class_17281 == null) {
                return 0.0f;
            }
            if (!Class_20912.Method_20917(class_17281, this.Field_16782)) {
                return 0.0f;
            }
        }
        return this.Field_16768 != null && !this.Field_16768.Method_27485(class_4751.\u0000, `()) ? 0.0f : 1.0f;
    }

    public boolean Method_16784(String string) {
        if (this.Field_16767 == null) {
            Class_19426.Method_19610("No source texture: " + string);
            return (-6636 & 6208) != 0;
        }
        this.Field_16767 = Class_21583.Method_21606(this.Field_16767, Class_21583.Method_21608(string));
        if (this.Field_16766 >= 0 && this.Field_16775 >= 0 && this.Field_16781 >= 0) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5 = this.Method_16799(this.Field_16775 - this.Field_16766);
            if (this.Field_16769 < 0) {
                this.Field_16769 = this.Method_16799(this.Field_16781 - n5);
                if (this.Method_16791(this.Field_16769, this.Field_16766, this.Field_16775)) {
                    this.Field_16769 = this.Field_16775;
                }
            }
            if ((n3 = n5 + (n2 = this.Method_16799(this.Field_16769 - this.Field_16775)) + (n4 = this.Method_16799(this.Field_16781 - this.Field_16769)) + (n = this.Method_16799(this.Field_16766 - this.Field_16781))) != (-8738 & 24032)) {
                Class_19426.Method_19610("Invalid fadeIn/fadeOut times, sum is not 24h: " + n3);
                return (10574 & -32256) != 0;
            }
            if (this.Field_16765 < 0.0f) {
                Class_19426.Method_19610("Invalid speed: " + this.Field_16765);
                return (-15837 & 8344) != 0;
            }
            if (this.Field_16771 <= 0) {
                Class_19426.Method_19610("Invalid daysLoop: " + this.Field_16771);
                return (-8152 & 149) != 0;
            }
            return (-32747 & 23841) != 0;
        }
        Class_19426.Method_19610("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
        return (2186 & 1061) != 0;
    }

    public void Method_16785(Class_283 class_283, int n, float f, float f2, float f3) {
        float f4 = this.Method_16786(class_283);
        float f5 = this.Method_16795(f2, f3);
        float f6 = this.Method_16798(n);
        float f7 = f4 * f5 * f6;
        if ((f7 = Class_19426.Method_19565(f7, 0.0f, 1.0f)) >= 7.294118E-5f * 1.3709677f) {
            Class_16867.Method_16963(this.Field_16776);
            Class_7229.Method_7233(this.Field_16774, f7);
            Class_16867.Method_16961();
            if (this.Field_16763) {
                float f8 = 0.0f;
                if (this.Field_16765 != (float)Math.round(this.Field_16765)) {
                    long l = (class_283.Method_511() + (874270296L & 1207977684L)) / (-3146143138573156928L & 1242324421L);
                    double d = this.Field_16765 % 1.0f;
                    double d2 = (double)l * d;
                    f8 = (float)(d2 % 1.0);
                }
                Class_16867.Method_16940(215.21739f * 1.6727272f * (f8 + f * this.Field_16765), this.Field_16773[-6900 & 512], this.Field_16773[-9207 & 8625], this.Field_16773[66 & -11214]);
            }
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_16867.Method_16940(24.79592f * 3.6296296f, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16940(0.29166666f * -308.57144f, 0.0f, 0.0f, 1.0f);
            this.Method_16787(class_7644, 4231 & -23276);
            Class_16867.Method_16961();
            Class_16867.Method_16940(0.25f * 360.0f, 1.0f, 0.0f, 0.0f);
            this.Method_16787(class_7644, 4755 & 257);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            Class_16867.Method_16940(-126.29032f * 0.7126437f, 1.0f, 0.0f, 0.0f);
            this.Method_16787(class_7644, -16336 & 1098);
            Class_16867.Method_16945();
            Class_16867.Method_16940(0.53932583f * 166.875f, 0.0f, 0.0f, 1.0f);
            this.Method_16787(class_7644, 8725 & -27505);
            Class_16867.Method_16940(933.75006f * 0.09638554f, 0.0f, 0.0f, 1.0f);
            this.Method_16787(class_7644, 10370 & -32494);
            Class_16867.Method_16940(342.0f * 0.2631579f, 0.0f, 0.0f, 1.0f);
            this.Method_16787(class_7644, 3 & 16679);
            Class_16867.Method_16945();
        }
    }

    private float Method_16786(Class_283 class_283) {
        if (this.Field_16782 == null && this.Field_16768 == null) {
            return 1.0f;
        }
        float f = this.Method_16783(class_283);
        if (this.Field_16762 == null) {
            this.Field_16762 = new Class_42854(f, this.Field_16764);
        }
        f = this.Field_16762.Method_42859(f);
        return f;
    }

    private void Method_16787(Class_7644 class_7644, int n) {
        Class_22385 class_22385 = class_7644.Method_7648();
        double d = (double)(n % (1411 & -26621)) / (1.9615384615384617 * 1.5294117647058822);
        double d2 = (double)(n / (4131 & 16651)) / (3.75 * 0.5333333333333333);
        class_22385.Method_22417(2711 & 4455, Class_29585.Field_29598);
        class_22385.Method_22443(12.4 * -8.064516129032258, -150.0 * 0.6666666666666666, 1.0875 * -91.95402298850576).Method_22433(d, d2).Method_22451();
        class_22385.Method_22443(-100.0 * 1.0, 0.48314606741573035 * -206.97674418604652, 61.904761904761905 * 1.6153846153846154).Method_22433(d, d2 + 0.20114942528735633 * 2.4857142857142858).Method_22451();
        class_22385.Method_22443(0.5384615384615384 * 185.71428571428572, 0.5151515151515151 * -194.11764705882354, 80.55555555555556 * 1.2413793103448276).Method_22433(d + 0.16666666666666666 * 2.0, d2 + 4.090909090909091 * 0.12222222222222222).Method_22451();
        class_22385.Method_22443(0.48936170212765956 * 204.34782608695653, 0.7450980392156863 * -134.21052631578948, 1.7 * -58.82352941176471).Method_22433(d + 0.0730593607305936 * 4.5625, d2).Method_22451();
        class_7644.Method_7647();
    }

    private List Method_16788(String string) {
        String[] arrstring = new String[4115 & 19723];
        arrstring[-15984 & 5226] = "clear";
        arrstring[4265 & 8193] = "rain";
        arrstring[20810 & -23934] = "thunder";
        List<String> list = Arrays.asList(arrstring);
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] arrstring2 = Class_19426.Method_19561(string, " ");
        for (int i = 564 & -16312; i < arrstring2.length; ++i) {
            String string2 = arrstring2[i];
            if (!list.contains(string2)) {
                Class_19426.Method_19610("Unknown weather: " + string2);
                continue;
            }
            arrayList.add(string2);
        }
        return arrayList;
    }

    private float[] Method_16789(String string, float[] arrf) {
        if (string == null) {
            return arrf;
        }
        String[] arrstring = Class_19426.Method_19561(string, " ");
        if (arrstring.length != (6523 & 16391)) {
            Class_19426.Method_19610("Invalid axis: " + string);
            return arrf;
        }
        float[] arrf2 = new float[28739 & 2835];
        for (int i = -2558 & 2136; i < arrstring.length; ++i) {
            arrf2[i] = Class_19426.Method_19595(arrstring[i], 0.17021276f * 8.4E-45f);
            if (arrf2[i] == 0.73770493f * Float.MIN_VALUE) {
                Class_19426.Method_19610("Invalid axis: " + string);
                return arrf;
            }
            if (!(arrf2[i] < -0.5714286f * 1.75f) && !(arrf2[i] > 1.0f)) continue;
            Class_19426.Method_19610("Invalid axis values: " + string);
            return arrf;
        }
        float f = arrf2[16448 & 264];
        float f2 = arrf2[18565 & 1659];
        float f3 = arrf2[4230 & 67];
        if (f * f + f2 * f2 + f3 * f3 < 1.2142857E-5f * 0.8235294f) {
            Class_19426.Method_19610("Invalid axis values: " + string);
            return arrf;
        }
        float[] arrf3 = new float[8355 & 2575];
        arrf3[3096 & -19898] = f3;
        arrf3[641 & 3125] = f2;
        arrf3[-28406 & 515] = -f;
        float[] arrf4 = arrf3;
        return arrf4;
    }

    private float Method_16790(String string, float f) {
        if (string == null) {
            return f;
        }
        float f2 = Class_19426.Method_19595(string, Float.MIN_VALUE * 0.70731705f);
        if (f2 == 0.013157895f * 1.06E-43f) {
            Class_19426.Method_19610("Invalid value: " + string);
            return f;
        }
        return f2;
    }

    private boolean Method_16791(int n, int n2, int n3) {
        return (n2 <= n3 ? (n >= n2 && n <= n3 ? 7429 & -16359 : 8704 & 18470) : (n >= n2 || n <= n3 ? -14335 & 5825 : 24600 & 358)) != 0;
    }

    private int Method_16792(String string) {
        if (string == null) {
            return -1 & -1;
        }
        String[] arrstring = Class_19426.Method_19561(string, ":");
        if (arrstring.length != (346 & -17401)) {
            Class_19426.Method_19610("Invalid time: " + string);
            return -1 & -1;
        }
        String string2 = arrstring[16897 & -20344];
        String string3 = arrstring[21157 & 1033];
        int n = Class_19426.Method_19502(string2, -1 & -1);
        int n2 = Class_19426.Method_19502(string3, -1 & -1);
        if (n >= 0 && n <= (16663 & -18761) && n2 >= 0 && n2 <= (-11141 & 10427)) {
            if ((n -= 20567 & 10670) < 0) {
                n += 24;
            }
            int n3 = n * (8172 & 25576) + (int)((double)n2 / (16.333333333333332 * 3.673469387755102) * (0.14285714285714285 * 7000.0));
            return n3;
        }
        Class_19426.Method_19610("Invalid time: " + string);
        return -1 & -1;
    }

    private boolean Method_16793(String string, boolean bl) {
        if (string == null) {
            return bl;
        }
        if (string.toLowerCase().equals("true")) {
            return (-22007 & 1025) != 0;
        }
        if (string.toLowerCase().equals("false")) {
            return (-32768 & 238) != 0;
        }
        Class_19426.Method_19610("Unknown boolean: " + string);
        return bl;
    }

    private void Method_16794() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_16761(Properties properties, String string) {
        Class_25611 class_25611 = new Class_25611("CustomSky");
        this.Field_16767 = properties.getProperty("source", string);
        this.Field_16766 = this.Method_16792(properties.getProperty("startFadeIn"));
        this.Field_16775 = this.Method_16792(properties.getProperty("endFadeIn"));
        this.Field_16769 = this.Method_16792(properties.getProperty("startFadeOut"));
        this.Field_16781 = this.Method_16792(properties.getProperty("endFadeOut"));
        this.Field_16774 = Class_7229.Method_7230(properties.getProperty("blend"));
        this.Field_16763 = this.Method_16793(properties.getProperty("rotate"), (10081 & 16389) != 0);
        this.Field_16765 = this.Method_16790(properties.getProperty("speed"), 1.0f);
        this.Field_16773 = this.Method_16789(properties.getProperty("axis"), Field_16778);
        this.Field_16772 = class_25611.Method_25627(properties.getProperty("days"));
        this.Field_16771 = class_25611.Method_25623(properties.getProperty("daysLoop"), 185 & 8);
        List list = this.Method_16788(properties.getProperty("weather", "clear"));
        this.Field_16770 = list.contains("clear");
        this.Field_16780 = list.contains("rain");
        this.Field_16777 = list.contains("thunder");
        this.Field_16782 = class_25611.Method_25622(properties.getProperty("biomes"));
        this.Field_16768 = class_25611.Method_25627(properties.getProperty("heights"));
        this.Field_16764 = this.Method_16790(properties.getProperty("transition"), 1.0f);
    }

    private float Method_16795(float f, float f2) {
        float f3 = 1.0f - f;
        float f4 = f - f2;
        float f5 = 0.0f;
        if (this.Field_16770) {
            f5 += f3;
        }
        if (this.Field_16780) {
            f5 += f4;
        }
        if (this.Field_16777) {
            f5 += f2;
        }
        f5 = Class_30029.Method_30031(f5, 0.0f, 1.0f);
        return f5;
    }

    public boolean Method_16796(Class_283 class_283, int n) {
        if (class_283 != this.Field_16779) {
            this.Field_16779 = class_283;
            this.Field_16762 = null;
        }
        if (this.Method_16791(n, this.Field_16781, this.Field_16766)) {
            return (1920 & -30596) != 0;
        }
        if (this.Field_16772 != null) {
            long l;
            long l2 = class_283.Method_511();
            for (l = l2 - (long)this.Field_16766; l < (522849764166469664L & 9519130L); l += (long)((24004 & -38) * this.Field_16771)) {
            }
            int n2 = (int)(l / (5095037418986627012L & 154164672L));
            int n3 = n2 % this.Field_16771;
            if (!this.Field_16772.Method_27485(n3)) {
                return (1090 & 8973) != 0;
            }
        }
        return (-24467 & 129) != 0;
    }

    public String Method_16797() {
        return "" + this.Field_16767 + ", " + this.Field_16766 + "-" + this.Field_16775 + " " + this.Field_16769 + "-" + this.Field_16781;
    }

    private float Method_16798(int n) {
        if (this.Method_16791(n, this.Field_16766, this.Field_16775)) {
            int n2 = this.Method_16799(this.Field_16775 - this.Field_16766);
            int n3 = this.Method_16799(n - this.Field_16766);
            return (float)n3 / (float)n2;
        }
        if (this.Method_16791(n, this.Field_16775, this.Field_16769)) {
            return 1.0f;
        }
        if (this.Method_16791(n, this.Field_16769, this.Field_16781)) {
            int n4 = this.Method_16799(this.Field_16781 - this.Field_16769);
            int n5 = this.Method_16799(n - this.Field_16769);
            return 1.0f - (float)n5 / (float)n4;
        }
        return 0.0f;
    }

    static {
        float[] arrf = new float[2471 & 539];
        arrf[8324 & 22889] = 1.0f;
        arrf[643 & 4101] = 0.0f;
        arrf[6 & 3] = 0.0f;
        Field_16778 = arrf;
    }

    private int Method_16799(int n) {
        while (n >= (32206 & -8752)) {
            n -= 24000;
        }
        while (n < 0) {
            n += 24000;
        }
        return n;
    }
}

