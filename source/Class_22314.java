/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_22314
extends Class_1490 {
    private static final Logger Field_22315 = LogManager.getLogger();
    private int Field_22316;
    private float Field_22317 = 0.08450705f * 5.9166665f;
    private static final Class_2080 Field_22318 = new Class_2080(Class_22314.Method_22325("\u6002\u6003\u600e\u6002\u6007\u6000\u6007\u6001\u6001\u6009\u600b\u6007\u6005\u600e\u6003\u600e\u601a\u6013\u6019\u601b\u601b\u601c\u6017\u6011\u601c\u601f\u6018\u601a\u6014\u601a\u6014\u601d"));
    private List Field_22319;
    private int Field_22320;
    private static final Class_2080 Field_22321 = new Class_2080(Class_22314.Method_22324("\u0316\u0306\u0312\u0316\u0316\u0310\u0306\u0310\u034c\u030e\u030a\u0318\u0308\u034c\u031c\u030a\u0314\u0314\u0316\u0306\u0306\u0316\u0354\u0302\u031c\u031c"));

    private void Method_22322(int n, int n2, float f) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        this.\u0000strictfp.Method_253().Method_34707(Class_1551.Field_1554);
        class_22385.Method_22417(7 & -15225, Class_29585.Field_29586);
        int n3 = this.\u0000= final;
        float f2 = 0.0f - ((float)this.Field_22320 + f) * (1.0208334f * 0.4897959f) * this.Field_22317;
        float f3 = (float)this.\u0000, ` - ((float)this.Field_22320 + f) * (1.1785715f * 0.4242424f) * this.Field_22317;
        float f4 = 0.3939394f * 0.03966346f;
        float f5 = ((float)this.Field_22320 + f - 0.0f) * (0.01547619f * 1.2923077f);
        float f6 = (float)(this.Field_22316 + this.\u0000, ` + this.\u0000, ` + (-30312 & 16476)) / this.Field_22317;
        float f7 = (f6 - 28.510637f * 0.70149255f - ((float)this.Field_22320 + f)) * (0.0035897433f * 1.3928572f);
        if (f7 < f5) {
            f5 = f7;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        f5 *= f5;
        f5 = f5 * (0.20634921f * 465.23077f) / (0.50549453f * 504.45648f);
        class_22385.Method_22443(0.0, this.\u0000, `, this.\u0000strictfp).Method_22433(0.0, f2 * f4).Method_22427(f5, f5, f5, 1.0f).Method_22451();
        class_22385.Method_22443(n3, this.\u0000, `, this.\u0000strictfp).Method_22433((float)n3 * f4, f2 * f4).Method_22427(f5, f5, f5, 1.0f).Method_22451();
        class_22385.Method_22443(n3, 0.0, this.\u0000strictfp).Method_22433((float)n3 * f4, f3 * f4).Method_22427(f5, f5, f5, 1.0f).Method_22451();
        class_22385.Method_22443(0.0, 0.0, this.\u0000strictfp).Method_22433(0.0, f3 * f4).Method_22427(f5, f5, f5, 1.0f).Method_22451();
        class_7644.Method_7647();
    }

    private void Method_22323() {
        this.\u0000strictfp.Field_48.Field_1390.Method_20245(new Class_25900(Class_8752.Field_8756));
        this.\u0000strictfp.Method_218(null);
    }

    private static String Method_22324(String string) {
        int n = 10585;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22314.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22325(String string) {
        int n = 3585;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22314.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22326() {
        if (this.Field_22319 == null) {
            this.Field_22319 = Lists.newArrayList();
            try {
                String string = "";
                String string2 = "" + (Object)((Object)Class_5478.Field_5491) + (Object)((Object)Class_5478.Field_5490) + (Object)((Object)Class_5478.Field_5497) + (Object)((Object)Class_5478.Field_5493);
                int n = -16105 & 14162;
                InputStream inputStream = this.\u0000strictfp.Method_208().Method_282(new Class_2080("texts/end.txt")).Method_9958();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                Random random = new Random(-1697237542396495909L & 1697237540626235351L);
                while ((string = bufferedReader.readLine()) != null) {
                    string = string.replaceAll("PLAYERNAME", this.\u0000strictfp.Method_265().Method_2116());
                    while (string.contains(string2)) {
                        int n2 = string.indexOf(string2);
                        String string3 = string.substring(540 & 18721, n2);
                        String string4 = string.substring(n2 + string2.length());
                        string = string3 + (Object)((Object)Class_5478.Field_5491) + (Object)((Object)Class_5478.Field_5490) + "XXXXXXXX".substring(8464 & 6690, random.nextInt(11284 & -31986) + (135 & 75)) + string4;
                    }
                    this.Field_22319.addAll(this.\u0000strictfp.Field_27.Method_28733(string, n));
                    this.Field_22319.add("");
                }
                inputStream.close();
                for (int i = 26769 & 1026; i < (8488 & 21196); ++i) {
                    this.Field_22319.add("");
                }
                inputStream = this.\u0000strictfp.Method_208().Method_282(new Class_2080("texts/credits.txt")).Method_9958();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                while ((string = bufferedReader.readLine()) != null) {
                    string = string.replaceAll("PLAYERNAME", this.\u0000strictfp.Method_265().Method_2116());
                    string = string.replaceAll("\t", "    ");
                    this.Field_22319.addAll(this.\u0000strictfp.Field_27.Method_28733(string, n));
                    this.Field_22319.add("");
                }
                inputStream.close();
                this.Field_22316 = this.Field_22319.size() * (17630 & -19924);
            }
            catch (Exception exception) {
                Field_22315.error("Couldn't load credits", (Throwable)exception);
            }
        }
    }

    public boolean Method_22327() {
        return (2821 & 8203) != 0;
    }

    private void Method_22328() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22329(int n, int n2, float f) {
        int n3;
        this.Method_22322(n, n2, f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        int n4 = 275 & 9114;
        int n5 = this.\u0000= final / (-16114 & 1250) - n4 / (2370 & 4226);
        int n6 = this.\u0000, ` + (-23245 & 16498);
        float f2 = -((float)this.Field_22320 + f) * this.Field_22317;
        Class_16867.Method_16961();
        Class_16867.Method_16943(0.0f, f2, 0.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_22318);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp(n5, n6, 542 & -22399, -25848 & 0, 2271 & 1435, 10284 & 16892);
        this.\u0000strictfp(n5 + (9627 & 4255), n6, 17 & 2894, 301 & -14803, 1467 & 16607, -31873 & 24748);
        int n7 = n6 + (-28472 & 2284);
        for (n3 = 3352 & -28668; n3 < this.Field_22319.size(); ++n3) {
            float f3;
            if (n3 == this.Field_22319.size() - (769 & -23321) && (f3 = (float)n7 + f2 - (float)(this.\u0000, ` / (-32698 & 1315) - (6150 & -32306))) < 0.0f) {
                Class_16867.Method_16943(0.0f, -f3, 0.0f);
            }
            if ((float)n7 + f2 + 110.0f * 0.10909091f + 6.5454545f * 1.2222222f > 0.0f && (float)n7 + f2 < (float)this.\u0000, `) {
                String string = (String)this.Field_22319.get(n3);
                if (string.startsWith("[C]")) {
                    this.\u0000strictfp.Method_28729(string.substring(-15613 & 10339), n5 + (n4 - this.\u0000strictfp.Method_28715(string.substring(267 & 1123))) / (6 & 2218), n7, 218103807 & 1677721599);
                } else {
                    this.\u0000strictfp.Field_28669.setSeed((long)n3 * (4238989175L & -2622356488089649861L) + (long)(this.Field_22320 / (-32636 & 2052)));
                    this.\u0000strictfp.Method_28729(string, n5, n7, -2113929217 & 218103807);
                }
            }
            n7 += 12;
        }
        Class_16867.Method_16945();
        this.\u0000strictfp.Method_253().Method_34707(Field_22321);
        Class_16867.Method_16947();
        Class_16867.Method_16951(1032 & 8322, -29947 & 25531);
        n3 = this.\u0000= final;
        int n8 = this.\u0000, `;
        class_22385.Method_22417(-28121 & 17631, Class_29585.Field_29586);
        class_22385.Method_22443(0.0, n8, this.\u0000strictfp).Method_22433(0.0, 1.0).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_22385.Method_22443(n3, n8, this.\u0000strictfp).Method_22433(1.0, 1.0).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_22385.Method_22443(n3, 0.0, this.\u0000strictfp).Method_22433(1.0, 0.0).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_22385.Method_22443(0.0, 0.0, this.\u0000strictfp).Method_22433(0.0, 0.0).Method_22427(1.0f, 1.0f, 1.0f, 1.0f).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16952();
        super.Method_1545(n, n2, f);
    }

    protected void Method_22330(char c, int n) {
        if (n == (-28607 & 9237)) {
            this.Method_22323();
        }
    }

    public void Method_22331() {
        float f;
        Class_18443 class_18443 = this.\u0000strictfp.Method_244();
        Class_29094 class_29094 = this.\u0000strictfp.Method_245();
        if (this.Field_22320 == 0) {
            class_18443.Method_18449();
            class_18443.Method_18450(Class_13603.Field_13608);
            class_29094.Method_29122();
        }
        class_29094.Method_29112();
        if (Class_18.Field_89.Field_127.Field_2178 > 0) {
            this.Field_22320 += 101 & 23059;
        }
        if ((float)this.Field_22320 > (f = (float)(this.Field_22316 + this.\u0000, ` + this.\u0000, ` + (-16008 & 158)) / this.Field_22317)) {
            this.Method_22323();
        }
    }
}

