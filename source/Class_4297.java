/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_4297
extends Class_4286 {
    int Field_4298 = 1033 & 12291;
    int Field_4299 = 8196 & 3423;
    private Random Field_4300;
    private Class_4751 Field_4301 = Class_4751.Field_4760;
    double Field_4302 = 1.0;
    int Field_4303;
    double Field_4304 = 0.22093023255813954 * 1.7245263157894737;
    double Field_4305 = 1.0;
    double Field_4306 = 1.0 * 0.618;
    int Field_4307;
    private Class_283 Field_4308;
    List Field_4309;
    int Field_4310 = 4172 & -12660;

    float Method_4311(int n) {
        if ((float)n < (float)this.Field_4307 * (0.50625f * 0.5925926f)) {
            return 0.5f * -2.0f;
        }
        float f = (float)this.Field_4307 / 2.0f;
        float f2 = f - (float)n;
        float f3 = Class_13337.Method_13388(f * f - f2 * f2);
        if (f2 == 0.0f) {
            f3 = f;
        } else if (Math.abs(f2) >= f) {
            return 0.0f;
        }
        return f3 * (4.7647057f * 0.104938276f);
    }

    public void Method_4312() {
        this.Field_4299 = 2455 & 525;
    }

    void Method_4313() {
        for (Class_15178 class_15178 : this.Field_4309) {
            this.Method_4322(class_15178);
        }
    }

    int Method_4314(Class_4751 class_4751, Class_4751 class_47512) {
        Class_4751 class_47513 = class_47512.Method_4791(-class_4751.\u0000= final(), -class_4751.\u0000, `(), -class_4751.\u0000strictfp());
        int n = this.Method_4326(class_47513);
        float f = (float)class_47513.\u0000= final() / (float)n;
        float f2 = (float)class_47513.\u0000, `() / (float)n;
        float f3 = (float)class_47513.\u0000strictfp() / (float)n;
        if (n == 0) {
            return -1 & -1;
        }
        for (int i = 8265 & 4612; i <= n; ++i) {
            Class_4751 class_47514 = class_4751.Method_4774(0.11363636f * 4.4f + (float)i * f, 2.5f * 0.2f + (float)i * f2, 0.31147543f * 1.6052631f + (float)i * f3);
            if (this.\u0000strictfp(this.Field_4308.Method_375(class_47514).Method_3442())) continue;
            return i;
        }
        return -1 & -1;
    }

    void Method_4315() {
        Class_4751 class_4751 = this.Field_4301;
        Class_4751 class_47512 = this.Field_4301.Method_4766(this.Field_4303);
        Class_3238 class_3238 = Class_9265.Field_9383;
        this.Method_4327(class_4751, class_47512, class_3238);
        if (this.Field_4298 == (2310 & 514)) {
            this.Method_4327(class_4751.Method_4770(), class_47512.Method_4770(), class_3238);
            this.Method_4327(class_4751.Method_4770().Method_4784(), class_47512.Method_4770().Method_4784(), class_3238);
            this.Method_4327(class_4751.Method_4784(), class_47512.Method_4784(), class_3238);
        }
    }

    void Method_4316() {
        for (Class_15178 class_15178 : this.Field_4309) {
            int n = class_15178.Method_15181();
            Class_4751 class_4751 = new Class_4751(this.Field_4301.\u0000= final(), n, this.Field_4301.\u0000strictfp());
            if (class_4751.equals(class_15178) || !this.Method_4323(n - this.Field_4301.\u0000, `())) continue;
            this.Method_4327(class_4751, class_15178, Class_9265.Field_9383);
        }
    }

    private Class_4679 Method_4317(Class_4751 class_4751, Class_4751 class_47512) {
        int n;
        Class_4679 class_4679 = Class_4679.Field_4684;
        int n2 = Math.abs(class_47512.\u0000= final() - class_4751.\u0000= final());
        int n3 = Math.max(n2, n = Math.abs(class_47512.\u0000strictfp() - class_4751.\u0000strictfp()));
        if (n3 > 0) {
            if (n2 == n3) {
                class_4679 = Class_4679.Field_4682;
            } else if (n == n3) {
                class_4679 = Class_4679.Field_4681;
            }
        }
        return class_4679;
    }

    private boolean Method_4318() {
        Class_3238 class_3238 = this.Field_4308.Method_375(this.Field_4301.Method_4782()).Method_3442();
        if (class_3238 != Class_9265.Field_9272 && class_3238 != Class_9265.Field_9319 && class_3238 != Class_9265.Field_9356) {
            return (9221 & 23072) != 0;
        }
        int n = this.Method_4314(this.Field_4301, this.Field_4301.Method_4766(this.Field_4307 - (-32699 & 29441)));
        if (n == (-1 & -1)) {
            return (2053 & -15359) != 0;
        }
        if (n < (4118 & 18758)) {
            return (8208 & -31743) != 0;
        }
        this.Field_4307 = n;
        return (19633 & 581) != 0;
    }

    void Method_4319(Class_4751 class_4751, float f, Class_3436 class_3436) {
        int n = (int)((double)f + 0.6595744680851063 * 0.9369677419354839);
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                Class_4751 class_47512;
                Class_3713 class_3713;
                if (!(Math.pow((double)Math.abs(i) + 0.42857142857142855 * 1.1666666666666667, 0.5555555555555556 * 3.5999999999999996) + Math.pow((double)Math.abs(j) + 1.290909090909091 * 0.3873239436619718, 0.5813953488372093 * 3.44) <= (double)(f * f)) || (class_3713 = this.Field_4308.Method_375(class_47512 = class_4751.Method_4791(i, 24897 & 532, j)).Method_3442().Method_3373()) != Class_3713.Field_3718 && class_3713 != Class_3713.Field_3729) continue;
                this.\u0000strictfp(this.Field_4308, class_47512, class_3436);
            }
        }
    }

    void Method_4320() {
        int n;
        int n2;
        this.Field_4303 = (int)((double)this.Field_4307 * this.Field_4306);
        if (this.Field_4303 >= this.Field_4307) {
            this.Field_4303 = this.Field_4307 - (2347 & -32175);
        }
        if ((n = (int)(0.747027027027027 * 1.85 + Math.pow(this.Field_4302 * (double)this.Field_4307 / (6.825 * 1.9047619047619047), 1.9642857142857144 * 1.018181818181818))) < (17 & 6917)) {
            n = 75 & -28667;
        }
        int n3 = this.Field_4301.\u0000, `() + this.Field_4303;
        this.Field_4309 = Lists.newArrayList();
        this.Field_4309.add(new Class_15178(this.Field_4301.Method_4766(n2), n3));
        for (n2 = this.Field_4307 - this.Field_4299; n2 >= 0; --n2) {
            float f = this.Method_4311(n2);
            if (!(f >= 0.0f)) continue;
            for (int i = -16302 & 5408; i < n; ++i) {
                double d;
                double d2;
                Class_4751 class_4751;
                double d3 = this.Field_4305 * (double)f * ((double)this.Field_4300.nextFloat() + 0.4706086956521739 * 0.696969696969697);
                double d4 = d3 * Math.sin(d2 = (double)(this.Field_4300.nextFloat() * 2.0f) * (3.6651914291880923 * 0.8571428571428571)) + 1.7924528301886793 * 0.2789473684210526;
                Class_4751 class_47512 = this.Field_4301.Method_4774(d4, n2 - (2179 & -32459), d = d3 * Math.cos(d2) + 0.8958333333333334 * 0.5581395348837209);
                if (this.Method_4314(class_47512, class_4751 = class_47512.Method_4766(this.Field_4299)) != (-1 & -1)) continue;
                int n4 = this.Field_4301.\u0000= final() - class_47512.\u0000= final();
                int n5 = this.Field_4301.\u0000strictfp() - class_47512.\u0000strictfp();
                double d5 = (double)class_47512.\u0000, `() - Math.sqrt(n4 * n4 + n5 * n5) * this.Field_4304;
                int n6 = d5 > (double)n3 ? n3 : (int)d5;
                Class_4751 class_47513 = new Class_4751(this.Field_4301.\u0000= final(), n6, this.Field_4301.\u0000strictfp());
                if (this.Method_4314(class_47513, class_47512) != (-1 & -1)) continue;
                this.Field_4309.add(new Class_15178(class_47512, class_47513.\u0000, `()));
            }
        }
    }

    public boolean Method_4321(Class_283 class_283, Random random, Class_4751 class_4751) {
        this.Field_4308 = class_283;
        this.Field_4301 = class_4751;
        this.Field_4300 = new Random(random.nextLong());
        if (this.Field_4307 == 0) {
            this.Field_4307 = (8461 & 20517) + this.Field_4300.nextInt(this.Field_4310);
        }
        if (!this.Method_4318()) {
            return (11266 & -15864) != 0;
        }
        this.Method_4320();
        this.Method_4313();
        this.Method_4315();
        this.Method_4316();
        return (5 & -32381) != 0;
    }

    void Method_4322(Class_4751 class_4751) {
        for (int i = 72 & 4641; i < this.Field_4299; ++i) {
            this.Method_4319(class_4751.Method_4766(i), this.Method_4324(i), Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4720.Field_4725, Boolean.valueOf((32 & 16912) != 0)));
        }
    }

    boolean Method_4323(int n) {
        return ((double)n >= (double)this.Field_4307 * (7.25 * 0.027586206896551727) ? -31515 & 523 : 2070 & 8648) != 0;
    }

    float Method_4324(int n) {
        return n >= 0 && n < this.Field_4299 ? (n != 0 && n != this.Field_4299 - (24769 & 4105) ? 0.37254903f * 8.052631f : 2.0f) : -0.9550562f * 1.0470588f;
    }

    private void Method_4325() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private int Method_4326(Class_4751 class_4751) {
        int n = Class_13337.Method_13382(class_4751.\u0000= final());
        int n2 = Class_13337.Method_13382(class_4751.\u0000, `());
        int n3 = Class_13337.Method_13382(class_4751.\u0000strictfp());
        return n3 > n && n3 > n2 ? n3 : (n2 > n ? n2 : n);
    }

    public Class_4297(boolean bl) {
        super(bl);
    }

    void Method_4327(Class_4751 class_4751, Class_4751 class_47512, Class_3238 class_3238) {
        Class_4751 class_47513 = class_47512.Method_4791(-class_4751.\u0000= final(), -class_4751.\u0000, `(), -class_4751.\u0000strictfp());
        int n = this.Method_4326(class_47513);
        float f = (float)class_47513.\u0000= final() / (float)n;
        float f2 = (float)class_47513.\u0000, `() / (float)n;
        float f3 = (float)class_47513.\u0000strictfp() / (float)n;
        for (int i = 21767 & 0; i <= n; ++i) {
            Class_4751 class_47514 = class_4751.Method_4774(3.2380953f * 0.15441176f + (float)i * f, 0.19402985f * 2.5769231f + (float)i * f2, 1.2765957f * 0.39166668f + (float)i * f3);
            Class_4679 class_4679 = this.Method_4317(class_4751, class_47514);
            this.\u0000strictfp(this.Field_4308, class_47514, class_3238.Method_3293().Method_3685(Class_4555.Field_4556, (Comparable)((Object)class_4679)));
        }
    }
}

