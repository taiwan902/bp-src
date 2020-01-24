/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.gson.Gson
 *  internal.org.lwjgl.input.Keyboard
 *  internal.org.lwjgl.input.Mouse
 *  internal.org.lwjgl.opengl.Display
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import internal.org.lwjgl.input.Keyboard;
import internal.org.lwjgl.input.Mouse;
import internal.org.lwjgl.opengl.Display;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_39702 {
    public Class_8264 Field_39703;
    public int Field_39704;
    public Class_8264[] Field_39705;
    public boolean Field_39706;
    public int Field_39707;
    public boolean Field_39708;
    public boolean Field_39709;
    public Class_8264 Field_39710;
    public boolean Field_39711;
    public boolean Field_39712;
    protected Class_18 Field_39713;
    public boolean Field_39714;
    public Class_8264 Field_39715;
    public Class_8264 Field_39716;
    public boolean Field_39717;
    public int Field_39718;
    public boolean Field_39719;
    public boolean Field_39720;
    public double Field_39721;
    public Class_8264 Field_39722;
    public boolean Field_39723;
    public int Field_39724;
    public boolean Field_39725;
    public Class_8264 Field_39726;
    public int Field_39727;
    public Class_8264 Field_39728;
    public float Field_39729;
    public float Field_39730;
    public boolean Field_39731;
    public Class_8838 Field_39732;
    public boolean Field_39733;
    public boolean Field_39734;
    public boolean Field_39735;
    public Class_8264 Field_39736;
    public List Field_39737;
    public Class_8264 Field_39738;
    public boolean Field_39739;
    public boolean Field_39740;
    public int Field_39741;
    public float Field_39742;
    public boolean Field_39743;
    public Class_8264 Field_39744;
    public final int Field_39745 = 3;
    public int Field_39746;
    public boolean Field_39747;
    public boolean Field_39748;
    public boolean Field_39749;
    public int Field_39750;
    private static final Logger Field_39751 = LogManager.getLogger();
    public boolean Field_39752;
    public boolean Field_39753;
    public Class_8264 Field_39754;
    public boolean Field_39755;
    public boolean Field_39756;
    public Class_34249 Field_39757;
    public Class_8264[] Field_39758;
    public Class_8264 Field_39759;
    public int Field_39760;
    public boolean Field_39761;
    public int Field_39762;
    public Class_8264 Field_39763;
    private static final String[] Field_39764;
    public boolean Field_39765;
    public float Field_39766;
    public boolean Field_39767;
    public boolean Field_39768;
    private static final ParameterizedType Field_39769;
    public double Field_39770;
    private static final String[] Field_39771;
    public Class_8264 Field_39772;
    public boolean Field_39773;
    public int Field_39774;
    public Class_26801 Field_39775;
    public boolean Field_39776;
    public String Field_39777;
    public int Field_39778;
    public int Field_39779;
    public float Field_39780;
    public boolean Field_39781;
    public int Field_39782;
    public boolean Field_39783;
    public boolean Field_39784;
    public boolean Field_39785;
    private final Set Field_39786;
    private int Field_39787;
    public boolean Field_39788;
    public boolean Field_39789;
    public File Field_39790;
    public boolean Field_39791;
    public float Field_39792;
    public boolean Field_39793;
    public int Field_39794;
    public boolean Field_39795;
    public boolean Field_39796;
    public int Field_39797;
    public Class_8264 Field_39798;
    public int Field_39799;
    public Class_8264 Field_39800;
    public int Field_39801;
    public int Field_39802;
    public Class_8264 Field_39803;
    public double Field_39804;
    public float Field_39805;
    public boolean Field_39806;
    private static final String[] Field_39807;
    public float Field_39808;
    public int Field_39809;
    public boolean Field_39810;
    private static final String[] Field_39811;
    public int Field_39812;
    public boolean Field_39813;
    public float Field_39814;
    private static final String[] Field_39815;
    private static final String[] Field_39816;
    public int Field_39817;
    public Class_8264 Field_39818;
    public Class_8264 Field_39819;
    public boolean Field_39820;
    public int Field_39821;
    public boolean Field_39822;
    public float Field_39823;
    public float Field_39824;
    public boolean Field_39825;
    public String Field_39826;
    public String Field_39827;
    public boolean Field_39828;
    private static final String[] Field_39829;
    public boolean Field_39830;
    public Class_8264 Field_39831;
    public int Field_39832;
    public boolean Field_39833;
    public float Field_39834;
    public boolean Field_39835;
    public File Field_39836;
    public int Field_39837;
    public float Field_39838;
    public float Field_39839;
    public int Field_39840;
    public boolean Field_39841;
    public double Field_39842;
    public int Field_39843;
    public boolean Field_39844;
    public int Field_39845;
    public String Field_39846;
    public boolean Field_39847;
    private Map Field_39848;
    public boolean Field_39849;
    public boolean Field_39850;
    public boolean Field_39851;
    public int Field_39852;
    public int Field_39853;
    public float Field_39854;
    public Class_8264 Field_39855;
    public Class_8264 Field_39856;
    public boolean Field_39857;
    public boolean Field_39858;
    public Class_8264 Field_39859;
    private static final String[] Field_39860;
    public boolean Field_39861;
    public float Field_39862;
    public boolean Field_39863;
    public boolean Field_39864;
    public boolean Field_39865;
    private File Field_39866;
    public boolean Field_39867;
    private static final Gson Field_39868;
    public float Field_39869;
    public boolean Field_39870;
    public boolean Field_39871;
    public boolean Field_39872;
    public Class_8264 Field_39873;
    public Class_8264 Field_39874;
    public List Field_39875;
    public int Field_39876;
    public boolean Field_39877;
    public boolean Field_39878;
    public boolean Field_39879;

    private static String Method_39880(String string) {
        int n = 20225;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39881(Class_6340 class_6340, float f) {
        int n;
        if (class_6340 == Class_6340.Field_6390) {
            this.Field_39730 = f;
            this.Field_39713.Field_33.Method_25104();
        }
        if (class_6340 == Class_6340.Field_6367) {
            this.Field_39808 = f;
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6423) {
            n = (int)f;
            if (n > 0 && Class_19426.Method_19570()) {
                Class_19426.Method_19611(Class_14688.Method_14697("of.message.aa.shaders1"), Class_14688.Method_14697("of.message.aa.shaders2"));
                return;
            }
            int[] arrn = new int[1039 & -19817];
            arrn[-23552 & 2068] = 13552 & -16383;
            arrn[9473 & -13815] = 10371 & 17670;
            arrn[-32722 & 4163] = 84 & 12677;
            arrn[2323 & 1571] = 134 & 5471;
            arrn[-14236 & 260] = 233 & 16648;
            arrn[-24035 & 19495] = 348 & -7123;
            arrn[16390 & 14102] = 17053 & -21422;
            int[] arrn2 = arrn;
            this.Field_39746 = -15230 & 4440;
            for (int i = 23585 & 706; i < arrn2.length; ++i) {
                if (n < arrn2[i]) continue;
                this.Field_39746 = arrn2[i];
            }
            this.Field_39746 = Class_19426.Method_19606(this.Field_39746, 4132 & -24317, 4318 & 48);
        }
        if (class_6340 == Class_6340.Field_6426) {
            n = (int)f;
            this.Field_39750 = 22017 & 163;
            while (this.Field_39750 * (24586 & 4898) <= n) {
                this.Field_39750 *= 28822 & 1026;
            }
            this.Field_39750 = Class_19426.Method_19606(this.Field_39750, 3179 & 16657, -32430 & 26641);
            this.Field_39713.Method_225();
        }
        if (class_6340 == Class_6340.Field_6366) {
            n = (int)f;
            this.Field_39760 = Class_19426.Method_19606(n, 1120 & 384, 4675 & -24301);
            this.Field_39713.Method_225();
        }
    }

    private static String Method_39882(String string) {
        int n = 7992;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39883(String string) {
        int n = 21289;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39884(String string) {
        int n = 11991;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_39885(Class_6340 class_6340) {
        String string = this.Method_39905(class_6340);
        if (string != null) {
            return string;
        }
        String string2 = Class_9802.Method_9806(class_6340.Method_6533(), new Object[5184 & 16]) + ": ";
        if (class_6340.Method_6600()) {
            String string3;
            float f = this.Method_39920(class_6340);
            float f2 = class_6340.Method_6565(f);
            if (class_6340 == Class_6340.Field_6454) {
                string3 = f2 == 0.0f ? string2 + Class_9802.Method_9806("options.sensitivity.min", new Object[-24396 & 16715]) : (f2 == 1.0f ? string2 + Class_9802.Method_9806("options.sensitivity.max", new Object[-24572 & 3137]) : string2 + (int)(f2 * (1.125f * 177.77777f)) + "%");
            } else if (class_6340 == Class_6340.Field_6363) {
                string3 = f == 0.049382716f * 1417.5f ? string2 + Class_9802.Method_9806("options.fov.min", new Object[-24576 & 45]) : (f == 90.35715f * 1.2173913f ? string2 + Class_9802.Method_9806("options.fov.max", new Object[9217 & 290]) : string2 + (int)f);
            } else if (class_6340 == Class_6340.Field_6448) {
                string3 = f == Class_6340.Method_6632(class_6340) ? string2 + Class_9802.Method_9806("options.framerateLimit.max", new Object[608 & 129]) : string2 + (int)f + " fps";
            } else if (class_6340 == Class_6340.Field_6353) {
                string3 = f == Class_6340.Method_6485(class_6340) ? string2 + Class_9802.Method_9806("options.cloudHeight.min", new Object[1046 & 16393]) : string2 + ((int)f + (17304 & 7303));
            } else if (class_6340 == Class_6340.Field_6440) {
                string3 = f2 == 0.0f ? string2 + Class_9802.Method_9806("options.gamma.min", new Object[17 & 16516]) : (f2 == 1.0f ? string2 + Class_9802.Method_9806("options.gamma.max", new Object[1028 & 520]) : string2 + "+" + (int)(f2 * (57.575756f * 1.7368422f)) + "%");
            } else if (class_6340 == Class_6340.Field_6443) {
                string3 = string2 + (int)(f2 * (6.7272725f * 59.45946f)) + "%";
            } else if (class_6340 == Class_6340.Field_6355) {
                string3 = string2 + (int)(f2 * (1.4f * 64.28571f) + 0.3131313f * 31.935486f) + "%";
            } else if (class_6340 == Class_6340.Field_6414) {
                string3 = string2 + Class_41159.Method_41171(f2) + "px";
            } else if (class_6340 == Class_6340.Field_6370) {
                string3 = string2 + Class_41159.Method_41171(f2) + "px";
            } else if (class_6340 == Class_6340.Field_6402) {
                string3 = string2 + Class_41159.Method_41181(f2) + "px";
            } else if (class_6340 == Class_6340.Field_6359) {
                string3 = string2 + (int)f + " chunks";
            } else if (class_6340 == Class_6340.Field_6365) {
                string3 = f == 0.0f ? string2 + Class_9802.Method_9806("options.off", new Object[-32504 & 13856]) : string2 + (int)f;
            } else if (class_6340 == Class_6340.Field_6449) {
                string3 = string2 + Class_28018.Method_28075(f2) + " fps";
            } else if (class_6340 == Class_6340.Field_6400) {
                string3 = string2 + Class_28018.Method_28072(f2) + " Kbps";
            } else if (class_6340 == Class_6340.Field_6416) {
                Object[] arrobject = new Object[41 & 26629];
                arrobject[-30015 & 1050] = Float.valueOf(Class_28018.Method_28066(f2));
                string3 = string2 + String.format("%.3f bpp", arrobject);
            } else {
                string3 = f2 == 0.0f ? string2 + Class_9802.Method_9806("options.off", new Object[8401 & 800]) : string2 + (int)(f2 * (0.10714286f * 933.3333f)) + "%";
            }
            return string3;
        }
        if (class_6340.Method_6587()) {
            boolean bl = this.Method_39910(class_6340);
            if (class_6340 == Class_6340.Field_6346) {
                string2 = string2 + (bl ? "\u00a7a" : "\u00a7c");
            }
            return bl ? string2 + Class_9802.Method_9806("options.on", new Object[1921 & 4112]) : string2 + Class_9802.Method_9806("options.off", new Object[4550 & 17408]);
        }
        if (class_6340 == Class_6340.Field_6417) {
            return string2 + Class_39702.Method_39922(Field_39860, this.Field_39774);
        }
        if (class_6340 == Class_6340.Field_6407) {
            return string2 + Class_9802.Method_9806(this.Field_39757.Method_34265(), new Object[-18350 & 521]);
        }
        if (class_6340 == Class_6340.Field_6403) {
            return string2 + Class_39702.Method_39922(Field_39807, this.Field_39779);
        }
        if (class_6340 == Class_6340.Field_6437) {
            return string2 + Class_39702.Method_39922(Field_39815, this.Field_39741);
        }
        if (class_6340 == Class_6340.Field_6432) {
            return string2 + Class_39702.Method_39922(Field_39771, this.Field_39727);
        }
        if (class_6340 == Class_6340.Field_6382) {
            return string2 + Class_39702.Method_39922(Field_39764, this.Field_39812);
        }
        if (class_6340 == Class_6340.Field_6444) {
            return string2 + Class_39702.Method_39922(Field_39811, this.Field_39853);
        }
        if (class_6340 == Class_6340.Field_6362) {
            return string2 + Class_39702.Method_39922(Field_39816, this.Field_39809);
        }
        if (class_6340 == Class_6340.Field_6353) {
            return string2 + Class_39702.Method_39922(Field_39829, this.Field_39762);
        }
        if (class_6340 == Class_6340.Field_6345) {
            if (this.Field_39788) {
                return string2 + Class_9802.Method_9806("options.graphics.fancy", new Object[-28658 & 3232]);
            }
            String string4 = "options.graphics.fast";
            return string2 + Class_9802.Method_9806("options.graphics.fast", new Object[-16384 & 13]);
        }
        return string2;
    }

    private static String Method_39886(String string) {
        int n = 5102;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39887(String string) {
        int n = 29126;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39888(String string) {
        int n = 4568;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39889(Class_21361 class_21361) {
        if (!this.Method_39898().contains((Object)class_21361)) {
            this.Field_39786.add(class_21361);
        } else {
            this.Field_39786.remove((Object)class_21361);
        }
        this.Method_39900();
    }

    private static String Method_39890(String string) {
        int n = 24745;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39891() {
        try {
            if (!this.Field_39866.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.Field_39866));
            String string = "";
            this.Field_39848.clear();
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    int n;
                    Class_8264 class_8264;
                    String[] arrstring = string.split(":");
                    if (arrstring[16392 & -17503].equals("mouseSensitivity")) {
                        this.Field_39839 = this.Method_39897(arrstring[147 & -30203]);
                    }
                    if (arrstring[9234 & 512].equals("fov")) {
                        this.Field_39823 = this.Method_39897(arrstring[8583 & 97]) * (1.3958334f * 28.656715f) + 10.25f * 6.8292685f;
                    }
                    if (arrstring[4176 & 10382].equals("gamma")) {
                        this.Field_39869 = this.Method_39897(arrstring[1029 & 609]);
                    }
                    if (arrstring[6408 & 18145].equals("saturation")) {
                        this.Field_39780 = this.Method_39897(arrstring[10549 & 1547]);
                    }
                    if (arrstring[20810 & 9344].equals("invertYMouse")) {
                        this.Field_39748 = arrstring[2073 & 261].equals("true");
                    }
                    if (arrstring[-31680 & 16641].equals("renderDistance")) {
                        this.Field_39801 = Integer.parseInt(arrstring[13831 & 16393]);
                    }
                    if (arrstring[16392 & -32752].equals("bpGuiScale")) {
                        this.Field_39774 = Integer.parseInt(arrstring[9799 & 2313]);
                    }
                    if (arrstring[16387 & -32688].equals("guiScale")) {
                        this.Field_39787 = Integer.parseInt(arrstring[24897 & 43]);
                    }
                    if (arrstring[20498 & -32124].equals("particles")) {
                        this.Field_39779 = Integer.parseInt(arrstring[22537 & 549]);
                    }
                    if (arrstring[-32176 & 19491].equals("bobView")) {
                        this.Field_39756 = arrstring[17413 & 8289].equals("true");
                    }
                    if (arrstring[-32728 & 2].equals("anaglyph3d")) {
                        this.Field_39747 = arrstring[6405 & -6591].equals("true");
                    }
                    if (arrstring[18444 & 12736].equals("maxFps")) {
                        this.Field_39840 = Integer.parseInt(arrstring[-14323 & 12481]);
                        this.Field_39844 = 17446 & -32240;
                        if (this.Field_39840 <= 0) {
                            this.Field_39840 = (int)Class_6340.Field_6448.Method_6519();
                            this.Field_39844 = -31701 & 261;
                        }
                        this.Method_39893();
                    }
                    if (arrstring[4104 & 9218].equals("fboEnable")) {
                        this.Field_39708 = arrstring[17569 & 2317].equals("true");
                    }
                    if (arrstring[12868 & 2177].equals("difficulty")) {
                        this.Field_39775 = Class_26801.Method_26817(Integer.parseInt(arrstring[1 & -24229]));
                    }
                    if (arrstring[387 & -11760].equals("fancyGraphics")) {
                        this.Field_39788 = arrstring[16523 & 2405].equals("true");
                        this.Method_39902();
                    }
                    if (arrstring[-31935 & 10390].equals("ao")) {
                        this.Field_39741 = arrstring[297 & 18563].equals("true") ? 20866 & -31230 : (arrstring[-31735 & 16901].equals("false") ? -28155 & 8192 : Integer.parseInt(arrstring[515 & 29725]));
                    }
                    if (arrstring[3139 & 16912].equals("renderClouds")) {
                        if (arrstring[19 & 24621].equals("true")) {
                            this.Field_39762 = 4362 & 2275;
                        } else if (arrstring[-32509 & 20189].equals("false")) {
                            this.Field_39762 = 24984 & -31742;
                        } else if (arrstring[-28541 & 9261].equals("fast")) {
                            this.Field_39762 = -13821 & 297;
                        }
                    }
                    if (arrstring[16480 & 8720].equals("resourcePacks")) {
                        this.Field_39875 = (List)Field_39868.fromJson(string.substring(string.indexOf(-24518 & 23675) + (-8191 & 6209)), (Type)Field_39769);
                        if (this.Field_39875 == null) {
                            this.Field_39875 = new ArrayList();
                        }
                    }
                    if (arrstring[1154 & 8244].equals("incompatibleResourcePacks")) {
                        this.Field_39737 = (List)Field_39868.fromJson(string.substring(string.indexOf(-28614 & 17211) + (-25527 & 5)), (Type)Field_39769);
                        if (this.Field_39737 == null) {
                            this.Field_39737 = new ArrayList();
                        }
                    }
                    if (arrstring[-19448 & 18].equals("lastServer") && arrstring.length >= (-22422 & 16899)) {
                        this.Field_39827 = string.substring(string.indexOf(-11590 & 1086) + (7323 & -32187));
                    }
                    if (arrstring[384 & -27134].equals("lang") && arrstring.length >= (18 & 4134)) {
                        this.Field_39826 = arrstring[1045 & 8963];
                    }
                    if (arrstring[4258 & 0].equals("chatVisibility")) {
                        this.Field_39757 = Class_34249.Method_34268(Integer.parseInt(arrstring[2857 & -23551]));
                    }
                    if (arrstring[4849 & 16640].equals("chatColors")) {
                        this.Field_39719 = arrstring[-31231 & 2441].equals("true");
                    }
                    if (arrstring[-28660 & 11537].equals("chatLinks")) {
                        this.Field_39833 = arrstring[273 & 11841].equals("true");
                    }
                    if (arrstring[4234 & -16379].equals("chatLinksPrompt")) {
                        this.Field_39783 = arrstring[10501 & -31615].equals("true");
                    }
                    if (arrstring[524 & -31711].equals("chatOpacity")) {
                        this.Field_39792 = this.Method_39897(arrstring[26625 & -31735]);
                    }
                    if (arrstring[23338 & 9232].equals("snooperEnabled")) {
                        this.Field_39825 = arrstring[-7415 & 1043].equals("true");
                    }
                    if (arrstring[10928 & 2].equals("fullscreen")) {
                        this.Field_39743 = arrstring[451 & -23547].equals("true");
                    }
                    if (arrstring[16834 & -32736].equals("enableVsync")) {
                        this.Field_39844 = arrstring[681 & 4421].equals("true");
                        this.Method_39893();
                    }
                    if (arrstring[560 & -23168].equals("useVbo")) {
                        this.Field_39706 = arrstring[4419 & -30687].equals("true");
                    }
                    if (arrstring[11520 & 4096].equals("hideServerAddress")) {
                        this.Field_39768 = arrstring[33 & 3205].equals("true");
                    }
                    if (arrstring[18500 & 17].equals("advancedItemTooltips")) {
                        this.Field_39795 = arrstring[-32101 & 1029].equals("true");
                    }
                    if (arrstring[27696 & 4424].equals("pauseOnLostFocus")) {
                        this.Field_39734 = arrstring[6977 & 137].equals("true");
                    }
                    if (arrstring[-24309 & 6656].equals("touchscreen")) {
                        this.Field_39870 = arrstring[273 & 8807].equals("true");
                    }
                    if (arrstring[22545 & 2].equals("overrideHeight")) {
                        this.Field_39837 = Integer.parseInt(arrstring[449 & -3071]);
                    }
                    if (arrstring[308 & 8202].equals("overrideWidth")) {
                        this.Field_39876 = Integer.parseInt(arrstring[8265 & 385]);
                    }
                    if (arrstring[-10221 & 512].equals("heldItemTooltips")) {
                        this.Field_39717 = arrstring[5201 & -16373].equals("true");
                    }
                    if (arrstring[12289 & 18848].equals("chatHeightFocused")) {
                        this.Field_39814 = this.Method_39897(arrstring[31745 & 73]);
                    }
                    if (arrstring[2826 & -32700].equals("chatHeightUnfocused")) {
                        this.Field_39729 = this.Method_39897(arrstring[9 & -26367]);
                    }
                    if (arrstring[16706 & 3200].equals("chatScale")) {
                        this.Field_39854 = this.Method_39897(arrstring[-23825 & 7185]);
                    }
                    if (arrstring[1287 & 8704].equals("chatWidth")) {
                        this.Field_39824 = this.Method_39897(arrstring[20993 & 2405]);
                    }
                    if (arrstring[13363 & 0].equals("showInventoryAchievementHint")) {
                        this.Field_39820 = arrstring[22145 & 21].equals("true");
                    }
                    if (arrstring[17920 & -32634].equals("mipmapLevels")) {
                        this.Field_39794 = Integer.parseInt(arrstring[113 & -31355]);
                    }
                    if (arrstring[4420 & 538].equals("streamBytesPerPixel")) {
                        this.Field_39834 = this.Method_39897(arrstring[265 & 1121]);
                    }
                    if (arrstring[25632 & 0].equals("streamMicVolume")) {
                        this.Field_39862 = this.Method_39897(arrstring[369 & -27635]);
                    }
                    if (arrstring[17862 & -17896].equals("streamSystemVolume")) {
                        this.Field_39805 = this.Method_39897(arrstring[8427 & 22017]);
                    }
                    if (arrstring[-16384 & 42].equals("streamKbps")) {
                        this.Field_39838 = this.Method_39897(arrstring[20609 & 575]);
                    }
                    if (arrstring[-16320 & 8452].equals("streamFps")) {
                        this.Field_39742 = this.Method_39897(arrstring[1073 & 24577]);
                    }
                    if (arrstring[5192 & 256].equals("streamCompression")) {
                        this.Field_39727 = Integer.parseInt(arrstring[-23327 & 16401]);
                    }
                    if (arrstring[-32495 & 8290].equals("streamSendMetadata")) {
                        this.Field_39806 = arrstring[20485 & 10267].equals("true");
                    }
                    if (arrstring[18 & 2240].equals("streamPreferredServer") && arrstring.length >= (-14845 & 6)) {
                        this.Field_39777 = string.substring(string.indexOf(16763 & 9278) + (5029 & 3145));
                    }
                    if (arrstring[-30592 & 12352].equals("streamChatEnabled")) {
                        this.Field_39812 = Integer.parseInt(arrstring[-16365 & 2117]);
                    }
                    if (arrstring[12417 & -29152].equals("streamChatUserFilter")) {
                        this.Field_39853 = Integer.parseInt(arrstring[21585 & -24433]);
                    }
                    if (arrstring[-9659 & 256].equals("streamMicToggleBehavior")) {
                        this.Field_39809 = Integer.parseInt(arrstring[2561 & -24439]);
                    }
                    if (arrstring[24648 & 2055].equals("forceUnicodeFont")) {
                        this.Field_39851 = arrstring[-21463 & 775].equals("true");
                    }
                    if (arrstring[3106 & 644].equals("allowBlockAlternatives")) {
                        this.Field_39733 = arrstring[2069 & 17057].equals("true");
                    }
                    if (arrstring[9291 & 16384].equals("reducedDebugInfo")) {
                        this.Field_39879 = arrstring[24641 & 2435].equals("true");
                    }
                    if (arrstring[6754 & 1040].equals("useNativeTransport")) {
                        this.Field_39858 = arrstring[-7407 & 4289].equals("true");
                    }
                    if (arrstring[8504 & -32128].equals("entityShadows")) {
                        this.Field_39714 = arrstring[-32731 & 12355].equals("true");
                    }
                    Object[] arrobject = this.Field_39758;
                    int n2 = arrobject.length;
                    for (n = 30246 & 2113; n < n2; ++n) {
                        class_8264 = arrobject[n];
                        if (!arrstring[514 & 11381].equals("key_" + class_8264.Method_8286())) continue;
                        class_8264.Method_8284(Integer.parseInt(arrstring[-7949 & 6145]));
                    }
                    arrobject = Class_6295.Method_6332();
                    n2 = arrobject.length;
                    for (n = 38 & 80; n < n2; ++n) {
                        class_8264 = arrobject[n];
                        if (!arrstring[-8061 & 544].equals("soundCategory_" + ((Class_6295)((Object)class_8264)).Method_6334())) continue;
                        this.Field_39848.put(class_8264, Float.valueOf(this.Method_39897(arrstring[2849 & -24573])));
                    }
                    arrobject = Class_21361.Method_21388();
                    n2 = arrobject.length;
                    for (n = 1024 & 612; n < n2; ++n) {
                        class_8264 = arrobject[n];
                        if (!arrstring[-32764 & 2051].equals("modelPart_" + ((Class_21361)((Object)class_8264)).Method_21376())) continue;
                        this.Method_39894((Class_21361)((Object)class_8264), arrstring[2179 & 25153].equals("true"));
                    }
                }
                catch (Exception exception) {
                    Field_39751.warn("Skipping bad option: " + string);
                    exception.printStackTrace();
                }
            }
            Class_8264.Method_8281();
            bufferedReader.close();
        }
        catch (Exception exception) {
            Field_39751.error("Failed to load options", (Throwable)exception);
        }
        this.Method_39930();
    }

    private static String Method_39892(String string) {
        int n = 13037;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39893() {
        Display.setVSyncEnabled((boolean)this.Field_39844);
    }

    public void Method_39894(Class_21361 class_21361, boolean bl) {
        if (bl) {
            this.Field_39786.add(class_21361);
        } else {
            this.Field_39786.remove((Object)class_21361);
        }
        this.Method_39900();
    }

    public void Method_39895(Class_6295 class_6295, float f) {
        this.Field_39713.Method_245().Method_29118(class_6295, f);
        this.Field_39848.put(class_6295, Float.valueOf(f));
    }

    private static String Method_39896(String string) {
        int n = 24427;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private float Method_39897(String string) {
        return string.equals("true") ? 1.0f : (string.equals("false") ? 0.0f : Float.parseFloat(string));
    }

    public Set Method_39898() {
        return ImmutableSet.copyOf((Collection)this.Field_39786);
    }

    public boolean Method_39899() {
        return this.Field_39858;
    }

    public void Method_39900() {
        if (this.Field_39713.Field_48 != null) {
            int n = 2048 & 192;
            for (Object e : this.Field_39786) {
                n |= ((Class_21361)((Object)e)).Method_21381();
            }
            this.Field_39713.Field_48.Field_1390.Method_20245(new Class_28523(this.Field_39826, this.Field_39801, this.Field_39757, this.Field_39719, n));
        }
    }

    private static String Method_39901(String string) {
        int n = 5225;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39902() {
        switch (this.Field_39843) {
            case 1: {
                this.Field_39762 = 3521 & 521;
                break;
            }
            case 2: {
                this.Field_39762 = 24835 & -32118;
                break;
            }
            case 3: {
                this.Field_39762 = 96 & 4113;
                break;
            }
            default: {
                this.Field_39762 = this.Field_39788 ? 4386 & 19462 : 3081 & -12249;
            }
        }
    }

    public void Method_39903() {
        try {
            Class_8264 class_8264;
            int n;
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.Field_39866));
            printWriter.println("invertYMouse:" + this.Field_39748);
            printWriter.println("mouseSensitivity:" + this.Field_39839);
            printWriter.println("fov:" + (this.Field_39823 - 7.142857f * 9.8f) / (89.72973f * 0.44578314f));
            printWriter.println("gamma:" + this.Field_39869);
            printWriter.println("saturation:" + this.Field_39780);
            printWriter.println("renderDistance:" + this.Field_39801);
            printWriter.println("bpGuiScale:" + this.Field_39774);
            printWriter.println("guiScale:" + this.Field_39787);
            printWriter.println("particles:" + this.Field_39779);
            printWriter.println("bobView:" + this.Field_39756);
            printWriter.println("anaglyph3d:" + this.Field_39747);
            printWriter.println("maxFps:" + this.Field_39840);
            printWriter.println("fboEnable:" + this.Field_39708);
            printWriter.println("difficulty:" + this.Field_39775.Method_26822());
            printWriter.println("fancyGraphics:" + this.Field_39788);
            printWriter.println("ao:" + this.Field_39741);
            switch (this.Field_39762) {
                case 0: {
                    printWriter.println("renderClouds:false");
                    break;
                }
                case 1: {
                    printWriter.println("renderClouds:fast");
                    break;
                }
                case 2: {
                    printWriter.println("renderClouds:true");
                }
            }
            printWriter.println("resourcePacks:" + Field_39868.toJson((Object)this.Field_39875));
            printWriter.println("incompatibleResourcePacks:" + Field_39868.toJson((Object)this.Field_39737));
            printWriter.println("lastServer:" + this.Field_39827);
            printWriter.println("lang:" + this.Field_39826);
            printWriter.println("chatVisibility:" + this.Field_39757.Method_34257());
            printWriter.println("chatColors:" + this.Field_39719);
            printWriter.println("chatLinks:" + this.Field_39833);
            printWriter.println("chatLinksPrompt:" + this.Field_39783);
            printWriter.println("chatOpacity:" + this.Field_39792);
            printWriter.println("snooperEnabled:" + this.Field_39825);
            printWriter.println("fullscreen:" + this.Field_39743);
            printWriter.println("enableVsync:" + this.Field_39844);
            printWriter.println("useVbo:" + this.Field_39706);
            printWriter.println("hideServerAddress:" + this.Field_39768);
            printWriter.println("advancedItemTooltips:" + this.Field_39795);
            printWriter.println("pauseOnLostFocus:" + this.Field_39734);
            printWriter.println("touchscreen:" + this.Field_39870);
            printWriter.println("overrideWidth:" + this.Field_39876);
            printWriter.println("overrideHeight:" + this.Field_39837);
            printWriter.println("heldItemTooltips:" + this.Field_39717);
            printWriter.println("chatHeightFocused:" + this.Field_39814);
            printWriter.println("chatHeightUnfocused:" + this.Field_39729);
            printWriter.println("chatScale:" + this.Field_39854);
            printWriter.println("chatWidth:" + this.Field_39824);
            printWriter.println("showInventoryAchievementHint:" + this.Field_39820);
            printWriter.println("mipmapLevels:" + this.Field_39794);
            printWriter.println("streamBytesPerPixel:" + this.Field_39834);
            printWriter.println("streamMicVolume:" + this.Field_39862);
            printWriter.println("streamSystemVolume:" + this.Field_39805);
            printWriter.println("streamKbps:" + this.Field_39838);
            printWriter.println("streamFps:" + this.Field_39742);
            printWriter.println("streamCompression:" + this.Field_39727);
            printWriter.println("streamSendMetadata:" + this.Field_39806);
            printWriter.println("streamPreferredServer:" + this.Field_39777);
            printWriter.println("streamChatEnabled:" + this.Field_39812);
            printWriter.println("streamChatUserFilter:" + this.Field_39853);
            printWriter.println("streamMicToggleBehavior:" + this.Field_39809);
            printWriter.println("forceUnicodeFont:" + this.Field_39851);
            printWriter.println("allowBlockAlternatives:" + this.Field_39733);
            printWriter.println("reducedDebugInfo:" + this.Field_39879);
            printWriter.println("useNativeTransport:" + this.Field_39858);
            printWriter.println("entityShadows:" + this.Field_39714);
            Object[] arrobject = this.Field_39758;
            int n2 = arrobject.length;
            for (n = 4171 & -30076; n < n2; ++n) {
                class_8264 = arrobject[n];
                if (class_8264.Method_8286().startsWith("key.bp")) continue;
                printWriter.println("key_" + class_8264.Method_8286() + ":" + class_8264.Method_8274());
            }
            arrobject = Class_6295.Method_6332();
            n2 = arrobject.length;
            for (n = -10719 & 208; n < n2; ++n) {
                class_8264 = arrobject[n];
                printWriter.println("soundCategory_" + ((Class_6295)((Object)class_8264)).Method_6334() + ":" + this.Method_39932((Class_6295)((Object)class_8264)));
            }
            arrobject = Class_21361.Method_21388();
            n2 = arrobject.length;
            for (n = 8298 & 768; n < n2; ++n) {
                class_8264 = arrobject[n];
                printWriter.println("modelPart_" + ((Class_21361)((Object)class_8264)).Method_21376() + ":" + this.Field_39786.contains(class_8264));
            }
            printWriter.close();
        }
        catch (Exception exception) {
            Field_39751.error("Failed to save options", (Throwable)exception);
        }
        this.Method_39917();
        this.Method_39900();
    }

    private static String Method_39904(String string) {
        int n = 27263;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private String Method_39905(Class_6340 class_6340) {
        String string = Class_9802.Method_9806(class_6340.Method_6533(), new Object[17666 & 2673]) + ": ";
        if (string == null) {
            string = class_6340.Method_6533();
        }
        if (class_6340 == Class_6340.Field_6359) {
            int n = (int)this.Method_39920(class_6340);
            String string2 = "Tiny";
            int n2 = 16398 & 1218;
            if (n >= (10500 & -11740)) {
                string2 = "Short";
                n2 = 1564 & -7833;
            }
            if (n >= (-30708 & 1289)) {
                string2 = "Normal";
                n2 = 16462 & -30200;
            }
            if (n >= (48 & 8914)) {
                string2 = "Far";
                n2 = 2899 & 144;
            }
            if (n >= (112 & 935)) {
                string2 = "Extreme";
                n2 = 47 & 10976;
            }
            int n3 = this.Field_39801 - n2;
            String string3 = string2;
            if (n3 > 0) {
                string3 = string2 + "+";
            }
            return string + n + " " + string3 + "";
        }
        if (class_6340 == Class_6340.Field_6357) {
            switch (this.Field_39797) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
                case 3: {
                    return string + "OFF";
                }
            }
            return string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6419) {
            return string + this.Field_39766;
        }
        if (class_6340 == Class_6340.Field_6366) {
            switch (this.Field_39760) {
                case 0: {
                    return string + "Nearest";
                }
                case 1: {
                    return string + "Linear";
                }
                case 2: {
                    return string + "Bilinear";
                }
                case 3: {
                    return string + "Trilinear";
                }
            }
            return string + "Nearest";
        }
        if (class_6340 == Class_6340.Field_6388) {
            return this.Field_39725 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6347) {
            return this.Field_39752 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6381) {
            switch (this.Field_39843) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
                case 3: {
                    return string + "OFF";
                }
            }
            return string + "Default";
        }
        if (class_6340 == Class_6340.Field_6358) {
            switch (this.Field_39718) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + "Default";
        }
        if (class_6340 == Class_6340.Field_6372) {
            switch (this.Field_39782) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + "Default";
        }
        if (class_6340 == Class_6340.Field_6428) {
            switch (this.Field_39799) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
                case 3: {
                    return string + "OFF";
                }
            }
            return string + "Default";
        }
        if (class_6340 == Class_6340.Field_6379) {
            switch (this.Field_39817) {
                case 1: {
                    return string + "Dynamic";
                }
                case 2: {
                    return string + "OFF";
                }
            }
            return string + "ON";
        }
        if (class_6340 == Class_6340.Field_6434) {
            switch (this.Field_39704) {
                case 1: {
                    return string + "Dynamic";
                }
                case 2: {
                    return string + "OFF";
                }
            }
            return string + "ON";
        }
        if (class_6340 == Class_6340.Field_6431) {
            return this.Field_39712 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6374) {
            return this.Field_39872 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6397) {
            return this.Field_39785 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6351) {
            return this.Field_39761 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6420) {
            return this.Field_39867 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6447) {
            return this.Field_39784 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6442) {
            return this.Field_39723 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6375) {
            return this.Field_39813 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6409) {
            return this.Field_39720 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6384) {
            return this.Field_39877 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6399) {
            return this.Field_39740 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6451) {
            return (Boolean)this.Field_39732.Field_8894.\u0000strictfp() == false ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6386) {
            return this.Field_39861 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6342) {
            return this.Field_39791 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6404) {
            return this.Field_39849 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6446) {
            return this.Field_39796 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6435) {
            return this.Field_39773 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6344) {
            return this.Field_39709 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6429) {
            return this.Field_39852 <= (-27349 & 2728) ? string + "Default (2s)" : (this.Field_39852 <= (464 & 8592) ? string + "20s" : (this.Field_39852 <= (4008 & 8116) ? string + "3min" : string + "30min"));
        }
        if (class_6340 == Class_6340.Field_6395) {
            switch (this.Field_39821) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6412) {
            this.getClass();
            switch (5123 & 9027) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6441) {
            return this.Field_39841 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6405) {
            return this.Field_39749 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6418) {
            return this.Field_39767 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6408) {
            return this.Field_39753 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6354) {
            switch (this.Field_39832) {
                case 1: {
                    return string + "Fast";
                }
                case 2: {
                    return string + "Fancy";
                }
            }
            return string + "Default";
        }
        if (class_6340 == Class_6340.Field_6430) {
            return string + this.Field_39778;
        }
        if (class_6340 == Class_6340.Field_6413) {
            return this.Field_39845 == (18827 & 5729) ? string + "Smooth" : (this.Field_39845 == (12858 & 7) ? string + "Multi-Core" : string + "Default");
        }
        if (class_6340 == Class_6340.Field_6393) {
            return this.Field_39835 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6383) {
            return this.Field_39707 == (4353 & 10273) ? string + "Day Only" : (this.Field_39707 == (26627 & 523) ? string + "Night Only" : string + "Default");
        }
        if (class_6340 == Class_6340.Field_6385) {
            return this.Field_39793 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6423) {
            String string4 = "";
            if (this.Field_39746 != Class_19426.Method_19481()) {
                string4 = " (restart)";
            }
            return this.Field_39746 == 0 ? string + "OFF" + string4 : string + this.Field_39746 + string4;
        }
        if (class_6340 == Class_6340.Field_6426) {
            return this.Field_39750 == (-25375 & 8705) ? string + "OFF" : string + this.Field_39750;
        }
        if (class_6340 == Class_6340.Field_6394) {
            return this.Field_39865 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6380) {
            return this.Field_39739 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6389) {
            return this.Field_39850 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6415) {
            return this.Field_39765 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6436) {
            return this.Field_39810 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6425) {
            return this.Field_39871 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6391) {
            return this.Field_39776 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6396) {
            return this.Field_39828 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6378) {
            return this.Field_39755 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6392) {
            return this.Field_39735 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6376) {
            return this.Field_39863 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6368) {
            return this.Field_39789 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6452) {
            return this.Field_39724 == (131 & 4433) ? string + "Fast" : (this.Field_39724 == (-31414 & 546) ? string + "Fancy" : string + "Default");
        }
        if (class_6340 == Class_6340.Field_6377) {
            return this.Field_39857 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6438) {
            return this.Field_39847 ? string + Class_14688.Method_14691() : string + Class_14688.Method_14695();
        }
        if (class_6340 == Class_6340.Field_6411) {
            return string + this.Field_39846;
        }
        if (class_6340 == Class_6340.Field_6352) {
            return this.Field_39717 ? string + "ON" : string + "OFF";
        }
        if (class_6340 == Class_6340.Field_6448) {
            float f = this.Method_39920(class_6340);
            return f == 0.0f ? string + "VSync" : (f == Class_6340.Method_6632(class_6340) ? string + Class_9802.Method_9806("options.framerateLimit.max", new Object[16773 & -31198]) : string + (int)f + " fps");
        }
        return null;
    }

    public static boolean Method_39906(Class_8264 class_8264) {
        int n = class_8264.Method_8274();
        return (n >= (-100 & -35) && n <= (511 & 16639) ? (class_8264.Method_8274() == 0 ? -31904 & 14467 : (class_8264.Method_8274() < 0 ? (int)(Mouse.isButtonDown((int)(class_8264.Method_8274() + (5222 & 26740))) ? 1 : 0) : (int)(Keyboard.isKeyDown((int)class_8264.Method_8274()) ? 1 : 0))) : 4 & -11047) != 0;
    }

    public void Method_39907() {
        if (this.Field_39713.Field_33 != null) {
            this.Field_39713.Field_33.Method_25110();
        }
    }

    private static String Method_39908(String string) {
        int n = 30585;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39909(String string) {
        int n = 745;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_39910(Class_6340 class_6340) {
        switch (Class_16864.Field_16865[class_6340.ordinal()]) {
            case 1: {
                return this.Field_39748;
            }
            case 2: {
                return this.Field_39756;
            }
            case 3: {
                return this.Field_39747;
            }
            case 4: {
                return this.Field_39708;
            }
            case 5: {
                return this.Field_39719;
            }
            case 6: {
                return this.Field_39833;
            }
            case 7: {
                return this.Field_39783;
            }
            case 8: {
                return this.Field_39825;
            }
            case 9: {
                return this.Field_39743;
            }
            case 10: {
                return this.Field_39844;
            }
            case 11: {
                return this.Field_39706;
            }
            case 12: {
                return this.Field_39870;
            }
            case 13: {
                return this.Field_39806;
            }
            case 14: {
                return this.Field_39851;
            }
            case 15: {
                return this.Field_39733;
            }
            case 16: {
                return this.Field_39879;
            }
            case 17: {
                return this.Field_39714;
            }
        }
        return (128 & -7886) != 0;
    }

    public void Method_39911() {
        this.Field_39801 = 541 & -5848;
        this.Field_39756 = 257 & 767;
        this.Field_39747 = 28996 & -32751;
        this.Field_39840 = (int)Class_6340.Field_6448.Method_6519();
        this.Field_39844 = -9984 & 8834;
        this.Method_39893();
        this.Field_39794 = -26826 & 18501;
        this.Field_39788 = -11255 & 2115;
        this.Field_39741 = -31973 & 16418;
        this.Field_39762 = 518 & 9546;
        this.Field_39823 = 24.705883f * 2.8333333f;
        this.Field_39869 = 0.0f;
        this.Field_39774 = 2 & 18562;
        this.Field_39779 = -12288 & 8256;
        this.Field_39717 = 213 & -5599;
        this.Field_39706 = -15196 & 8963;
        this.Field_39733 = -32693 & 4257;
        this.Field_39851 = -26496 & 272;
        this.Field_39797 = -32767 & 9745;
        this.Field_39766 = 0.008247423f * 97.0f;
        this.Field_39760 = 66 & -26592;
        this.Field_39830 = 10308 & -32224;
        this.Field_39725 = -16382 & 5320;
        Class_19426.Method_19569();
        this.Field_39752 = Class_19426.Method_19510();
        this.Field_39857 = Class_19426.Method_19510();
        this.Field_39863 = -30072 & 5376;
        this.Field_39789 = 1027 & 6169;
        this.Field_39724 = -32639 & 20544;
        this.Field_39847 = 12311 & 16969;
        this.Field_39808 = 1.0f;
        this.Field_39746 = 2149 & 20488;
        this.Field_39750 = 641 & 4417;
        this.Field_39843 = -32767 & 17442;
        this.Field_39730 = 0.0f;
        this.Field_39718 = 20 & 7427;
        this.Field_39799 = 271 & -28672;
        this.Field_39821 = 16391 & 2691;
        this.Field_39852 = 4002 & -8263;
        this.Field_39773 = 24608 & 2064;
        this.Field_39709 = -23486 & 940;
        this.Field_39865 = 2132 & 33;
        this.Field_39841 = -22015 & 20545;
        this.Field_39749 = 13 & -19357;
        this.Field_39767 = 8229 & 7817;
        this.Field_39753 = 3075 & -32159;
        this.Field_39832 = 7245 & -32128;
        this.Field_39778 = 13337 & -32633;
        this.Field_39845 = 2061 & 0;
        this.Field_39835 = 177 & 6922;
        this.Field_39707 = 15890 & 16524;
        this.Field_39793 = 18498 & -31736;
        this.Field_39739 = 576 & 4375;
        this.Field_39846 = "Default";
        this.Field_39850 = 19505 & 12425;
        this.Field_39765 = 4391 & 1729;
        this.Field_39810 = 13 & -23359;
        this.Field_39871 = 8393 & -15343;
        this.Field_39776 = 20513 & 8209;
        this.Field_39828 = -32503 & 16913;
        this.Field_39755 = 16413 & 8705;
        this.Field_39735 = 5768 & 8465;
        this.Field_39817 = 23624 & -32254;
        this.Field_39704 = -21695 & 5132;
        this.Field_39712 = 1153 & 257;
        this.Field_39872 = 1251 & -16371;
        this.Field_39785 = 151 & -31135;
        this.Field_39761 = 25241 & 1349;
        this.Field_39867 = 4609 & -32495;
        this.Field_39784 = 153 & 5221;
        this.Field_39723 = 16387 & -22847;
        this.Field_39813 = -8065 & 1025;
        this.Field_39796 = -20477 & 18465;
        this.Field_39720 = -29431 & 4225;
        this.Field_39877 = 10529 & 201;
        this.Field_39740 = 8217 & 16897;
        this.Field_39861 = 2831 & 8337;
        this.Field_39791 = 259 & 5297;
        this.Field_39849 = -14971 & 2051;
        Class_12440.Method_12984(Class_12440.Field_12514);
        Class_12440.Field_12617 = 16460 & -32735;
        Class_12440.Method_12961();
        Class_12440.Method_12855();
        this.Method_39925();
        this.Field_39713.Method_225();
        this.Method_39903();
    }

    private void Method_39912() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_39913(String string) {
        int n = 6215;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_39914(int n) {
        String string;
        if (n < 0) {
            if (Class_9802.Method_9806("language.code", new Object[4652 & 19456]).equals("pl_PL")) {
                if (n + (25701 & -26507) == (28677 & 1587)) {
                    return "LPM";
                }
                if (n + (-13953 & 12389) == (-28630 & 26754)) {
                    return "PPM";
                }
            } else {
                if (n + (2677 & 109) == (-24571 & 6281)) {
                    return "LMB";
                }
                if (n + (4453 & 3309) == (6730 & 2)) {
                    return "RMB";
                }
                if (n + (5223 & -16155) == (963 & 10243)) {
                    return "MMB";
                }
            }
        }
        if (n < 0) {
            Object[] arrobject = new Object[1057 & 515];
            arrobject[2656 & 20871] = n + (-32539 & 1125);
            string = Class_9802.Method_9806("key.mouseButton", arrobject);
        } else if (n < (-7418 & 3400)) {
            string = Keyboard.getKeyName((int)n);
        } else {
            Object[] arrobject = new Object[-16167 & 10279];
            arrobject[-29374 & 20641] = Character.valueOf((char)(n - (2402 & 16645)));
            string = String.format("%c", arrobject).toUpperCase();
        }
        return string;
    }

    private static String Method_39915(String string) {
        int n = 31590;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_39702(Class_18 class_18, File file) {
        this.Field_39839 = 13.999999f * 0.035714287f;
        this.Field_39801 = -1 & -1;
        this.Field_39756 = -32757 & 20737;
        this.Field_39708 = 2819 & 24801;
        this.Field_39840 = 4220 & 16633;
        this.Field_39762 = 5326 & 26627;
        this.Field_39788 = -7095 & 17;
        this.Field_39741 = -30461 & 546;
        this.Field_39875 = new ArrayList();
        this.Field_39737 = new ArrayList();
        this.Field_39757 = Class_34249.Field_34254;
        this.Field_39719 = -32353 & 5153;
        this.Field_39833 = 6169 & 385;
        this.Field_39783 = 13329 & 16521;
        this.Field_39792 = 1.0f;
        this.Field_39825 = 721 & -24575;
        this.Field_39844 = -27871 & 25;
        this.Field_39706 = -6256 & 4168;
        this.Field_39733 = 577 & 1283;
        this.Field_39879 = 21000 & 149;
        this.Field_39732 = new Class_8838(this);
        this.Field_39804 = 0.0;
        this.Field_39721 = 1.8064516129032258 * 0.08303571428571428;
        this.Field_39842 = 1.0;
        this.Field_39770 = 0.9326923076923077 * 0.5360824742268041;
        this.Field_39734 = 20295 & 1;
        this.Field_39786 = Sets.newHashSet((Object[])Class_21361.Method_21388());
        this.Field_39717 = 16417 & -30579;
        this.Field_39854 = 1.0f;
        this.Field_39824 = 1.0f;
        this.Field_39729 = 3.7619047f * 0.11793546f;
        this.Field_39814 = 1.0f;
        this.Field_39820 = -30591 & 1045;
        this.Field_39794 = -7780 & 6663;
        this.Field_39848 = Maps.newEnumMap(Class_6295.class);
        this.Field_39834 = 0.87234044f * 0.5731707f;
        this.Field_39862 = 1.0f;
        this.Field_39805 = 1.0f;
        this.Field_39838 = 1.2647059f * 0.42799228f;
        this.Field_39742 = 0.23767605f * 1.3333334f;
        this.Field_39727 = 11273 & 21139;
        this.Field_39806 = 2049 & 8259;
        this.Field_39777 = "";
        this.Field_39812 = 25153 & 420;
        this.Field_39853 = 4506 & 16388;
        this.Field_39809 = 24842 & 1025;
        this.Field_39858 = 3089 & 20493;
        this.Field_39714 = -24317 & 18561;
        this.Field_39772 = new Class_8264("key.forward", -3823 & 2769, "key.categories.movement");
        this.Field_39726 = new Class_8264("key.left", -24514 & 31, "key.categories.movement");
        this.Field_39803 = new Class_8264("key.back", 31 & 17663, "key.categories.movement");
        this.Field_39759 = new Class_8264("key.right", -15816 & 1252, "key.categories.movement");
        this.Field_39703 = new Class_8264("key.jump", 1147 & 825, "key.categories.movement");
        this.Field_39855 = new Class_8264("key.sneak", -28562 & 11690, "key.categories.movement");
        this.Field_39738 = new Class_8264("key.sprint", -10179 & 29, "key.categories.movement");
        this.Field_39818 = new Class_8264("key.inventory", -32590 & 534, "key.categories.inventory");
        this.Field_39800 = new Class_8264("key.use", -99 & -99, "key.categories.gameplay");
        this.Field_39856 = new Class_8264("key.drop", 4627 & 1436, "key.categories.gameplay");
        this.Field_39859 = new Class_8264("key.attack", -1 & -100, "key.categories.gameplay");
        this.Field_39728 = new Class_8264("key.pickItem", -98 & -66, "key.categories.gameplay");
        this.Field_39722 = new Class_8264("key.chat", 3220 & 8468, "key.categories.multiplayer");
        this.Field_39736 = new Class_8264("key.playerlist", 1071 & 7071, "key.categories.multiplayer");
        this.Field_39754 = new Class_8264("key.command", 13365 & 2677, "key.categories.multiplayer");
        this.Field_39874 = new Class_8264("key.screenshot", 4223 & 27580, "key.categories.misc");
        this.Field_39744 = new Class_8264("key.togglePerspective", 447 & 19007, "key.categories.misc");
        this.Field_39819 = new Class_8264("key.smoothCamera", 14 & -30512, "key.categories.misc");
        this.Field_39715 = new Class_8264("key.fullscreen", -32393 & 215, "key.categories.misc");
        this.Field_39798 = new Class_8264("key.spectatorOutlines", 10313 & 132, "key.categories.misc");
        this.Field_39716 = new Class_8264("key.streamStartStop", 1126 & -13744, "key.categories.stream");
        this.Field_39831 = new Class_8264("key.streamPauseUnpause", 321 & 12897, "key.categories.stream");
        this.Field_39873 = new Class_8264("key.streamCommercial", 4752 & 11300, "key.categories.stream");
        this.Field_39763 = new Class_8264("key.streamToggleMic", 25730 & -26331, "key.categories.stream");
        Class_8264[] arrclass_8264 = new Class_8264[-18419 & 16905];
        arrclass_8264[2090 & -14768] = new Class_8264("key.hotbar.1", 20482 & -31545, "key.categories.inventory");
        arrclass_8264[261 & 1155] = new Class_8264("key.hotbar.2", 6279 & 3, "key.categories.inventory");
        arrclass_8264[-24430 & 555] = new Class_8264("key.hotbar.3", 3204 & 16388, "key.categories.inventory");
        arrclass_8264[-22261 & 1031] = new Class_8264("key.hotbar.4", 16909 & 14549, "key.categories.inventory");
        arrclass_8264[229 & 9740] = new Class_8264("key.hotbar.5", -30905 & 8214, "key.categories.inventory");
        arrclass_8264[1029 & 14343] = new Class_8264("key.hotbar.6", 16391 & 4271, "key.categories.inventory");
        arrclass_8264[8199 & 19766] = new Class_8264("key.hotbar.7", 14344 & 1242, "key.categories.inventory");
        arrclass_8264[-14329 & 8759] = new Class_8264("key.hotbar.8", -32739 & 5355, "key.categories.inventory");
        arrclass_8264[1160 & 2056] = new Class_8264("key.hotbar.9", 3418 & 12298, "key.categories.inventory");
        this.Field_39705 = arrclass_8264;
        this.Field_39774 = 834 & 130;
        this.Field_39797 = 12325 & 3457;
        this.Field_39766 = 1.7647059f * 0.45333335f;
        this.Field_39760 = -32639 & 16904;
        this.Field_39830 = -14070 & 33;
        this.Field_39725 = 368 & -8182;
        this.Field_39752 = Class_19426.Method_19510();
        this.Field_39857 = Class_19426.Method_19510();
        this.Field_39808 = 1.0f;
        this.Field_39746 = 3096 & 8960;
        this.Field_39750 = 17675 & -24559;
        this.Field_39843 = -30910 & 2096;
        this.Field_39730 = 0.0f;
        this.Field_39718 = 10017 & 20608;
        this.Field_39799 = -22071 & 1536;
        this.Field_39782 = 2576 & -16159;
        this.Field_39821 = 2435 & -20413;
        this.Field_39852 = 20397 & -28768;
        this.Field_39773 = 4840 & 9472;
        this.Field_39865 = 4226 & 18788;
        this.Field_39709 = 4864 & -29608;
        this.Field_39841 = 39 & 11929;
        this.Field_39749 = 8213 & 3073;
        this.Field_39767 = -32701 & 4629;
        this.Field_39753 = 2049 & 65;
        this.Field_39832 = -32184 & 12310;
        this.Field_39778 = -31731 & 19329;
        this.Field_39845 = -20464 & 1158;
        this.Field_39835 = -22524 & 67;
        this.Field_39707 = 6144 & -24222;
        this.Field_39793 = 1555 & -12032;
        this.Field_39739 = 4355 & 2048;
        this.Field_39846 = "Default";
        this.Field_39850 = 8781 & 16529;
        this.Field_39765 = 1289 & -8157;
        this.Field_39810 = 6657 & -32607;
        this.Field_39871 = 33 & -30139;
        this.Field_39776 = -24287 & 4109;
        this.Field_39828 = 3127 & 385;
        this.Field_39755 = -29679 & 739;
        this.Field_39745 = 2243 & 3;
        this.Field_39735 = -13772 & 321;
        this.Field_39863 = 2064 & -16382;
        this.Field_39789 = 8261 & 25;
        this.Field_39724 = 10912 & -32743;
        this.Field_39817 = -28604 & 16929;
        this.Field_39704 = -32726 & 23424;
        this.Field_39712 = 24591 & 545;
        this.Field_39872 = 289 & 7313;
        this.Field_39785 = -24317 & 5785;
        this.Field_39761 = -32381 & 21521;
        this.Field_39867 = 10243 & -10739;
        this.Field_39784 = 20625 & -24571;
        this.Field_39723 = 8201 & 7815;
        this.Field_39813 = 16579 & -19443;
        this.Field_39796 = -32439 & 2721;
        this.Field_39720 = 27587 & 1;
        this.Field_39877 = 2307 & 1117;
        this.Field_39740 = 12289 & 1297;
        this.Field_39861 = 17927 & 4137;
        this.Field_39791 = -32251 & 161;
        this.Field_39849 = 12437 & 3841;
        this.Field_39847 = 1735 & -26367;
        Object[] arrobject = new Class_8264[16632 & -31204];
        arrobject[17704 & 4736] = this.Field_39859;
        arrobject[-15287 & 1] = this.Field_39800;
        arrobject[-17397 & 16546] = this.Field_39772;
        arrobject[9251 & 151] = this.Field_39726;
        arrobject[8852 & 5196] = this.Field_39803;
        arrobject[519 & 25885] = this.Field_39759;
        arrobject[-28474 & 3079] = this.Field_39703;
        arrobject[407 & -14841] = this.Field_39855;
        arrobject[-32036 & 1288] = this.Field_39738;
        arrobject[14425 & -32723] = this.Field_39856;
        arrobject[-12278 & 8203] = this.Field_39818;
        arrobject[16459 & 27] = this.Field_39722;
        arrobject[-21732 & 16461] = this.Field_39736;
        arrobject[18445 & 8335] = this.Field_39728;
        arrobject[-32673 & 7694] = this.Field_39754;
        arrobject[11599 & 15] = this.Field_39874;
        arrobject[-15856 & 1078] = this.Field_39744;
        arrobject[16401 & 4627] = this.Field_39819;
        arrobject[19 & 16466] = this.Field_39716;
        arrobject[2203 & -32237] = this.Field_39831;
        arrobject[-28556 & 1053] = this.Field_39873;
        arrobject[541 & -25387] = this.Field_39763;
        arrobject[-31722 & 534] = this.Field_39715;
        arrobject[16031 & -16041] = this.Field_39798;
        this.Field_39758 = (Class_8264[])ArrayUtils.addAll((Object[])arrobject, (Object[])this.Field_39705);
        this.Field_39775 = Class_26801.Field_26802;
        this.Field_39827 = "";
        this.Field_39823 = 203.63637f * 0.34375f;
        this.Field_39826 = "en_US";
        this.Field_39851 = 16416 & 4822;
        this.Field_39713 = class_18;
        this.Field_39866 = new File(file, "options.txt");
        this.Field_39790 = new File(file, "optionsofbp.txt");
        this.Field_39836 = new File(file, "optionsbp.dat");
        this.Field_39840 = (int)Class_6340.Field_6448.Method_6519();
        this.Field_39710 = new Class_8264("Zoom", 4699 & 2298, "key.categories.misc");
        this.Field_39758 = (Class_8264[])ArrayUtils.add((Object[])this.Field_39758, (Object)this.Field_39710);
        Class_6340.Field_6359.Method_6695(0.73214287f * 43.707317f);
        this.Field_39801 = 17548 & -24008;
        this.Method_39891();
        Class_19426.Method_19574(this);
    }

    private static String Method_39916(String string) {
        int n = 20677;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39917() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.Field_39790));
            printWriter.println("ofRenderDistanceChunks:" + this.Field_39801);
            printWriter.println("ofFogType:" + this.Field_39797);
            printWriter.println("ofFogStart:" + this.Field_39766);
            printWriter.println("ofMipmapType:" + this.Field_39760);
            printWriter.println("ofOcclusionFancy:" + this.Field_39830);
            printWriter.println("ofSmoothFps:" + this.Field_39725);
            printWriter.println("ofSmoothWorld:" + this.Field_39752);
            printWriter.println("ofAoLevel:" + this.Field_39808);
            printWriter.println("ofClouds:" + this.Field_39843);
            printWriter.println("ofCloudsHeight:" + this.Field_39730);
            printWriter.println("ofTrees:" + this.Field_39718);
            printWriter.println("ofDroppedItems:" + this.Field_39782);
            printWriter.println("ofRain:" + this.Field_39799);
            printWriter.println("ofAnimatedWater:" + this.Field_39817);
            printWriter.println("ofAnimatedLava:" + this.Field_39704);
            printWriter.println("ofAnimatedFire:" + this.Field_39712);
            printWriter.println("ofAnimatedPortal:" + this.Field_39872);
            printWriter.println("ofAnimatedRedstone:" + this.Field_39785);
            printWriter.println("ofAnimatedExplosion:" + this.Field_39761);
            printWriter.println("ofAnimatedFlame:" + this.Field_39867);
            printWriter.println("ofAnimatedSmoke:" + this.Field_39784);
            printWriter.println("ofVoidParticles:" + this.Field_39723);
            printWriter.println("ofWaterParticles:" + this.Field_39813);
            printWriter.println("ofPortalParticles:" + this.Field_39720);
            printWriter.println("ofPotionParticles:" + this.Field_39877);
            printWriter.println("ofFireworkParticles:" + this.Field_39740);
            printWriter.println("ofDrippingWaterLava:" + this.Field_39861);
            printWriter.println("ofAnimatedTerrain:" + this.Field_39791);
            printWriter.println("ofAnimatedTextures:" + this.Field_39849);
            printWriter.println("ofRainSplash:" + this.Field_39796);
            printWriter.println("ofLagometer:" + this.Field_39773);
            printWriter.println("ofShowFps:" + this.Field_39709);
            printWriter.println("ofAutoSaveTicks:" + this.Field_39852);
            printWriter.println("ofBetterGrass:" + this.Field_39821);
            this.getClass();
            printWriter.println("ofConnectedTextures:" + (-7357 & 159));
            printWriter.println("ofWeather:" + this.Field_39841);
            printWriter.println("ofSky:" + this.Field_39749);
            printWriter.println("ofStars:" + this.Field_39767);
            printWriter.println("ofSunMoon:" + this.Field_39753);
            printWriter.println("ofVignette:" + this.Field_39832);
            printWriter.println("ofChunkUpdates:" + this.Field_39778);
            printWriter.println("ofChunkLoading:" + this.Field_39845);
            printWriter.println("ofChunkUpdatesDynamic:" + this.Field_39835);
            printWriter.println("ofTime:" + this.Field_39707);
            printWriter.println("ofClearWater:" + this.Field_39793);
            printWriter.println("ofAaLevel:" + this.Field_39746);
            printWriter.println("ofAfLevel:" + this.Field_39750);
            printWriter.println("ofProfiler:" + this.Field_39865);
            printWriter.println("ofBetterSnow:" + this.Field_39739);
            printWriter.println("ofSwampColors:" + this.Field_39850);
            printWriter.println("ofRandomMobs:" + this.Field_39765);
            printWriter.println("ofSmoothBiomes:" + this.Field_39810);
            printWriter.println("ofCustomFonts:" + this.Field_39871);
            printWriter.println("ofCustomColors:" + this.Field_39776);
            printWriter.println("ofCustomSky:" + this.Field_39828);
            printWriter.println("ofShowCapes:" + this.Field_39755);
            printWriter.println("ofNaturalTextures:" + this.Field_39735);
            printWriter.println("ofLazyChunkLoading:" + this.Field_39857);
            printWriter.println("ofDynamicFov:" + this.Field_39847);
            printWriter.println("ofFullscreenMode:" + this.Field_39846);
            printWriter.println("ofFastMath:" + this.Field_39863);
            printWriter.println("ofFastRender:" + this.Field_39789);
            printWriter.println("ofTranslucentBlocks:" + this.Field_39724);
            printWriter.println("key_" + this.Field_39710.Method_8286() + ":" + this.Field_39710.Method_8274());
            printWriter.close();
        }
        catch (Exception exception) {
            Class_19426.Method_19610("Failed to save options");
            exception.printStackTrace();
        }
    }

    public void Method_39918(Class_6340 class_6340, float f) {
        this.Method_39881(class_6340, f);
        if (class_6340 == Class_6340.Field_6454) {
            this.Field_39839 = f;
        }
        if (class_6340 == Class_6340.Field_6363) {
            this.Field_39823 = f;
        }
        if (class_6340 == Class_6340.Field_6440) {
            this.Field_39869 = f;
        }
        if (class_6340 == Class_6340.Field_6448) {
            this.Field_39840 = (int)f;
            this.Field_39844 = 27265 & 1354;
            if (this.Field_39840 <= 0) {
                this.Field_39840 = (int)Class_6340.Field_6448.Method_6519();
                this.Field_39844 = 5779 & 24585;
            }
            this.Method_39893();
        }
        if (class_6340 == Class_6340.Field_6355) {
            this.Field_39792 = f;
            this.Field_39713.Field_105.Method_45458().Method_41186();
        }
        if (class_6340 == Class_6340.Field_6370) {
            this.Field_39814 = f;
            this.Field_39713.Field_105.Method_45458().Method_41186();
        }
        if (class_6340 == Class_6340.Field_6414) {
            this.Field_39729 = f;
            this.Field_39713.Field_105.Method_45458().Method_41186();
        }
        if (class_6340 == Class_6340.Field_6402) {
            this.Field_39824 = f;
            this.Field_39713.Field_105.Method_45458().Method_41186();
        }
        if (class_6340 == Class_6340.Field_6349) {
            this.Field_39854 = f;
            this.Field_39713.Field_105.Method_45458().Method_41186();
        }
        if (class_6340 == Class_6340.Field_6365) {
            int n = this.Field_39794;
            this.Field_39794 = (int)f;
            if ((float)n != f) {
                this.Field_39713.Method_189().Method_24124(this.Field_39794);
                this.Field_39713.Method_253().Method_34707(Class_24069.Field_24084);
                this.Field_39713.Method_189().\u0000strictfp((8704 & 18) != 0, (this.Field_39794 > 0 ? -31223 & 21 : -32752 & 28804) != 0);
                this.Field_39713.Method_235();
            }
        }
        if (class_6340 == Class_6340.Field_6421) {
            this.Field_39733 = !this.Field_39733 ? 20481 & 35 : -10860 & 546;
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6359) {
            this.Field_39801 = (int)f;
            this.Field_39713.Field_33.Method_25091();
        }
        if (class_6340 == Class_6340.Field_6416) {
            this.Field_39834 = f;
        }
        if (class_6340 == Class_6340.Field_6433) {
            this.Field_39862 = f;
            this.Field_39713.Method_242().Method_1839();
        }
        if (class_6340 == Class_6340.Field_6422) {
            this.Field_39805 = f;
            this.Field_39713.Method_242().Method_1839();
        }
        if (class_6340 == Class_6340.Field_6400) {
            this.Field_39838 = f;
        }
        if (class_6340 == Class_6340.Field_6449) {
            this.Field_39742 = f;
        }
    }

    private static String Method_39919(String string) {
        int n = 20657;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_39702() {
        this.Field_39839 = 0.30952382f * 1.6153846f;
        this.Field_39801 = -1 & -1;
        this.Field_39756 = -30679 & 9491;
        this.Field_39708 = 17473 & 4611;
        this.Field_39840 = 6525 & 17144;
        this.Field_39762 = 4227 & 24866;
        this.Field_39788 = -31471 & 6155;
        this.Field_39741 = 25163 & 22;
        this.Field_39875 = new ArrayList();
        this.Field_39737 = new ArrayList();
        this.Field_39757 = Class_34249.Field_34254;
        this.Field_39719 = -24445 & 16385;
        this.Field_39833 = 16385 & 11025;
        this.Field_39783 = -11515 & 33;
        this.Field_39792 = 1.0f;
        this.Field_39825 = -32511 & 15489;
        this.Field_39844 = 5 & -28583;
        this.Field_39706 = -23808 & 5201;
        this.Field_39733 = 20609 & 853;
        this.Field_39879 = 12864 & 51;
        this.Field_39732 = new Class_8838(this);
        this.Field_39804 = 0.0;
        this.Field_39721 = 1.05 * 0.14285714285714285;
        this.Field_39842 = 1.0;
        this.Field_39770 = 0.006666666666666667 * 75.0;
        this.Field_39734 = -6143 & 4519;
        this.Field_39786 = Sets.newHashSet((Object[])Class_21361.Method_21388());
        this.Field_39717 = -32669 & 16529;
        this.Field_39854 = 1.0f;
        this.Field_39824 = 1.0f;
        this.Field_39729 = 1.3114754f * 0.33829224f;
        this.Field_39814 = 1.0f;
        this.Field_39820 = 12485 & 3841;
        this.Field_39794 = 8268 & -28284;
        this.Field_39848 = Maps.newEnumMap(Class_6295.class);
        this.Field_39834 = 0.15789473f * 3.1666667f;
        this.Field_39862 = 1.0f;
        this.Field_39805 = 1.0f;
        this.Field_39838 = 0.2706422f * 2.0f;
        this.Field_39742 = 0.886076f * 0.35764587f;
        this.Field_39727 = 4545 & 9217;
        this.Field_39806 = 4225 & 8727;
        this.Field_39777 = "";
        this.Field_39812 = 8195 & 140;
        this.Field_39853 = 17154 & 6197;
        this.Field_39809 = 16816 & 14855;
        this.Field_39858 = -19449 & 513;
        this.Field_39714 = 9221 & 2881;
        this.Field_39772 = new Class_8264("key.forward", -31463 & 723, "key.categories.movement");
        this.Field_39726 = new Class_8264("key.left", 542 & 2207, "key.categories.movement");
        this.Field_39803 = new Class_8264("key.back", -32737 & 18751, "key.categories.movement");
        this.Field_39759 = new Class_8264("key.right", 16490 & 32, "key.categories.movement");
        this.Field_39703 = new Class_8264("key.jump", 19193 & 5437, "key.categories.movement");
        this.Field_39855 = new Class_8264("key.sneak", 58 & 4142, "key.categories.movement");
        this.Field_39738 = new Class_8264("key.sprint", 12349 & -32355, "key.categories.movement");
        this.Field_39818 = new Class_8264("key.inventory", -27053 & 18, "key.categories.inventory");
        this.Field_39800 = new Class_8264("key.use", -35 & -97, "key.categories.gameplay");
        this.Field_39856 = new Class_8264("key.drop", -32228 & 16688, "key.categories.gameplay");
        this.Field_39859 = new Class_8264("key.attack", -100 & -66, "key.categories.gameplay");
        this.Field_39728 = new Class_8264("key.pickItem", -98 & -66, "key.categories.gameplay");
        this.Field_39722 = new Class_8264("key.chat", -16331 & 2518, "key.categories.multiplayer");
        this.Field_39736 = new Class_8264("key.playerlist", 29711 & -32641, "key.categories.multiplayer");
        this.Field_39754 = new Class_8264("key.command", 4149 & -31681, "key.categories.multiplayer");
        this.Field_39874 = new Class_8264("key.screenshot", 4541 & 8254, "key.categories.misc");
        this.Field_39744 = new Class_8264("key.togglePerspective", 1087 & -24513, "key.categories.misc");
        this.Field_39819 = new Class_8264("key.smoothCamera", 20 & 2368, "key.categories.misc");
        this.Field_39715 = new Class_8264("key.fullscreen", 599 & -16041, "key.categories.misc");
        this.Field_39798 = new Class_8264("key.spectatorOutlines", 12800 & 461, "key.categories.misc");
        this.Field_39716 = new Class_8264("key.streamStartStop", 29251 & -32552, "key.categories.stream");
        this.Field_39831 = new Class_8264("key.streamPauseUnpause", -31925 & 4289, "key.categories.stream");
        this.Field_39873 = new Class_8264("key.streamCommercial", 9284 & 522, "key.categories.stream");
        this.Field_39763 = new Class_8264("key.streamToggleMic", -8175 & 2468, "key.categories.stream");
        Class_8264[] arrclass_8264 = new Class_8264[1291 & 89];
        arrclass_8264[4130 & 1808] = new Class_8264("key.hotbar.1", 2114 & 17539, "key.categories.inventory");
        arrclass_8264[1557 & -11935] = new Class_8264("key.hotbar.2", 4747 & 16659, "key.categories.inventory");
        arrclass_8264[12362 & 16423] = new Class_8264("key.hotbar.3", 4644 & 17492, "key.categories.inventory");
        arrclass_8264[-32645 & 23171] = new Class_8264("key.hotbar.4", 16391 & 4237, "key.categories.inventory");
        arrclass_8264[-32244 & 6292] = new Class_8264("key.hotbar.5", 20550 & 3254, "key.categories.inventory");
        arrclass_8264[-18809 & 21] = new Class_8264("key.hotbar.6", -32505 & 24599, "key.categories.inventory");
        arrclass_8264[-22521 & 21366] = new Class_8264("key.hotbar.7", 28168 & 283, "key.categories.inventory");
        arrclass_8264[22607 & -24521] = new Class_8264("key.hotbar.8", 1291 & 2201, "key.categories.inventory");
        arrclass_8264[558 & 8] = new Class_8264("key.hotbar.9", 17182 & -32694, "key.categories.inventory");
        this.Field_39705 = arrclass_8264;
        this.Field_39774 = 8258 & -30330;
        this.Field_39797 = -16255 & 6209;
        this.Field_39766 = 5.866667f * 0.13636364f;
        this.Field_39760 = 386 & 16912;
        this.Field_39830 = 8965 & 3146;
        this.Field_39725 = 281 & -24382;
        this.Field_39752 = Class_19426.Method_19510();
        this.Field_39857 = Class_19426.Method_19510();
        this.Field_39808 = 1.0f;
        this.Field_39746 = -32719 & 128;
        this.Field_39750 = -31349 & 2065;
        this.Field_39843 = 8193 & 4512;
        this.Field_39730 = 0.0f;
        this.Field_39718 = 322 & 5785;
        this.Field_39799 = -15675 & 12560;
        this.Field_39782 = 24001 & -24028;
        this.Field_39821 = -27501 & 8527;
        this.Field_39852 = -94 & 4000;
        this.Field_39773 = 8584 & 22532;
        this.Field_39865 = -32735 & 320;
        this.Field_39709 = 72 & 2309;
        this.Field_39841 = -7225 & 4129;
        this.Field_39749 = 11337 & 273;
        this.Field_39767 = 4189 & 24577;
        this.Field_39753 = 7173 & 16971;
        this.Field_39832 = 2625 & 434;
        this.Field_39778 = 1349 & 12291;
        this.Field_39845 = 9217 & -28528;
        this.Field_39835 = 56 & 258;
        this.Field_39707 = -16354 & 4928;
        this.Field_39793 = 419 & 3672;
        this.Field_39739 = 12293 & 2048;
        this.Field_39846 = "Default";
        this.Field_39850 = -32763 & 11265;
        this.Field_39765 = 25617 & 11;
        this.Field_39810 = 23 & 16521;
        this.Field_39871 = 3109 & -24575;
        this.Field_39776 = -16233 & 5153;
        this.Field_39828 = -24415 & 23829;
        this.Field_39755 = 135 & -24047;
        this.Field_39745 = 115 & -23421;
        this.Field_39735 = 11352 & 517;
        this.Field_39863 = 128 & -20466;
        this.Field_39789 = 25601 & 4097;
        this.Field_39724 = 15496 & 512;
        this.Field_39817 = 3112 & 640;
        this.Field_39704 = -32640 & 541;
        this.Field_39712 = 8277 & 3073;
        this.Field_39872 = 425 & -31663;
        this.Field_39785 = -32767 & 26683;
        this.Field_39761 = -32729 & 7241;
        this.Field_39867 = 5403 & 33;
        this.Field_39784 = 9229 & -32639;
        this.Field_39723 = 4613 & -32511;
        this.Field_39813 = 4651 & 193;
        this.Field_39796 = 713 & 8211;
        this.Field_39720 = -29311 & 4161;
        this.Field_39877 = 2633 & 4483;
        this.Field_39740 = -24319 & 1;
        this.Field_39861 = -23479 & 917;
        this.Field_39791 = -16293 & 9221;
        this.Field_39849 = 73 & -20847;
        this.Field_39847 = 8401 & 16387;
        Object[] arrobject = new Class_8264[600 & -27624];
        arrobject[5193 & 18434] = this.Field_39859;
        arrobject[10017 & 16411] = this.Field_39800;
        arrobject[16938 & 2371] = this.Field_39772;
        arrobject[-32757 & 3331] = this.Field_39726;
        arrobject[17541 & -22204] = this.Field_39803;
        arrobject[21703 & 821] = this.Field_39759;
        arrobject[14462 & 134] = this.Field_39703;
        arrobject[71 & -17785] = this.Field_39855;
        arrobject[18778 & 9900] = this.Field_39738;
        arrobject[-24279 & 3151] = this.Field_39856;
        arrobject[10 & -4037] = this.Field_39818;
        arrobject[2203 & -16277] = this.Field_39722;
        arrobject[11276 & -16244] = this.Field_39736;
        arrobject[18957 & 4159] = this.Field_39728;
        arrobject[8926 & -28401] = this.Field_39754;
        arrobject[1055 & 431] = this.Field_39874;
        arrobject[18580 & -32752] = this.Field_39744;
        arrobject[2865 & -19247] = this.Field_39819;
        arrobject[10738 & -28141] = this.Field_39716;
        arrobject[667 & 16435] = this.Field_39831;
        arrobject[85 & -23788] = this.Field_39873;
        arrobject[16669 & -28139] = this.Field_39763;
        arrobject[4342 & -15594] = this.Field_39715;
        arrobject[10911 & 55] = this.Field_39798;
        this.Field_39758 = (Class_8264[])ArrayUtils.addAll((Object[])arrobject, (Object[])this.Field_39705);
        this.Field_39775 = Class_26801.Field_26802;
        this.Field_39827 = "";
        this.Field_39823 = 1.2f * 58.333332f;
        this.Field_39826 = "en_US";
        this.Field_39851 = 8360 & 1552;
    }

    public float Method_39920(Class_6340 class_6340) {
        return class_6340 == Class_6340.Field_6390 ? this.Field_39730 : (class_6340 == Class_6340.Field_6367 ? this.Field_39808 : (class_6340 == Class_6340.Field_6423 ? (float)this.Field_39746 : (class_6340 == Class_6340.Field_6426 ? (float)this.Field_39750 : (class_6340 == Class_6340.Field_6366 ? (float)this.Field_39760 : (class_6340 == Class_6340.Field_6448 ? ((float)this.Field_39840 == Class_6340.Field_6448.Method_6519() && this.Field_39844 ? 0.0f : (float)this.Field_39840) : (class_6340 == Class_6340.Field_6363 ? this.Field_39823 : (class_6340 == Class_6340.Field_6440 ? this.Field_39869 : (class_6340 == Class_6340.Field_6443 ? this.Field_39780 : (class_6340 == Class_6340.Field_6454 ? this.Field_39839 : (class_6340 == Class_6340.Field_6355 ? this.Field_39792 : (class_6340 == Class_6340.Field_6370 ? this.Field_39814 : (class_6340 == Class_6340.Field_6414 ? this.Field_39729 : (class_6340 == Class_6340.Field_6349 ? this.Field_39854 : (class_6340 == Class_6340.Field_6402 ? this.Field_39824 : (class_6340 == Class_6340.Field_6448 ? (float)this.Field_39840 : (class_6340 == Class_6340.Field_6365 ? (float)this.Field_39794 : (class_6340 == Class_6340.Field_6359 ? (float)this.Field_39801 : (class_6340 == Class_6340.Field_6416 ? this.Field_39834 : (class_6340 == Class_6340.Field_6433 ? this.Field_39862 : (class_6340 == Class_6340.Field_6422 ? this.Field_39805 : (class_6340 == Class_6340.Field_6400 ? this.Field_39838 : (class_6340 == Class_6340.Field_6449 ? this.Field_39742 : 0.0f))))))))))))))))))))));
    }

    public void Method_39921(Class_8264 class_8264, int n) {
        class_8264.Method_8284(n);
        this.Method_39903();
    }

    private static String Method_39922(String[] arrstring, int n) {
        if (n < 0 || n >= arrstring.length) {
            n = -32127 & 8224;
        }
        return Class_9802.Method_9806(arrstring[n], new Object[20992 & 1201]);
    }

    public void Method_39923(Class_6340 class_6340, int n) {
        this.Method_39927(class_6340, n);
        if (class_6340 == Class_6340.Field_6356) {
            this.Field_39748 = !this.Field_39748 ? -19959 & 53 : 8786 & -32767;
            int n2 = this.Field_39748 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6417) {
            this.Field_39774 = this.Field_39774 + n & (16387 & 1891);
        }
        if (class_6340 == Class_6340.Field_6403) {
            this.Field_39779 = (this.Field_39779 + n) % (12851 & 3);
        }
        if (class_6340 == Class_6340.Field_6439) {
            this.Field_39756 = !this.Field_39756 ? 17089 & 4355 : 256 & 168;
            int n3 = this.Field_39756 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6353) {
            this.Field_39762 = (this.Field_39762 + n) % (27791 & 259);
        }
        if (class_6340 == Class_6340.Field_6369) {
            this.Field_39851 = !this.Field_39851 ? 1057 & 24595 : 4774 & 8256;
            this.Field_39713.Field_27.Method_28689((this.Field_39713.Method_262().Method_44207() || this.Field_39851 ? -32735 & 18439 : -32768 & 18580) != 0);
        }
        if (class_6340 == Class_6340.Field_6361) {
            this.Field_39708 = !this.Field_39708 ? 16385 & 2129 : 10500 & -32640;
            int n4 = this.Field_39708 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6364) {
            if (!this.Field_39747 && Class_19426.Method_19570()) {
                Class_19426.Method_19611(Class_14688.Method_14697("of.message.an.shaders1"), Class_14688.Method_14697("of.message.an.shaders2"));
                return;
            }
            this.Field_39747 = !this.Field_39747 ? 8725 & 3 : -32636 & 546;
            this.Field_39713.Method_225();
        }
        if (class_6340 == Class_6340.Field_6345) {
            this.Field_39788 = !this.Field_39788 ? 8195 & 353 : 25603 & -30344;
            this.Method_39902();
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6437) {
            this.Field_39741 = (this.Field_39741 + n) % (1091 & 8195);
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6407) {
            this.Field_39757 = Class_34249.Method_34268((this.Field_39757.Method_34257() + n) % (2579 & 24839));
        }
        if (class_6340 == Class_6340.Field_6432) {
            this.Field_39727 = (this.Field_39727 + n) % (19 & 20999);
        }
        if (class_6340 == Class_6340.Field_6455) {
            this.Field_39806 = !this.Field_39806 ? 75 & 16673 : 1032 & 8209;
            int n5 = this.Field_39806 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6382) {
            this.Field_39812 = (this.Field_39812 + n) % (17923 & -30541);
        }
        if (class_6340 == Class_6340.Field_6444) {
            this.Field_39853 = (this.Field_39853 + n) % (21539 & -32185);
        }
        if (class_6340 == Class_6340.Field_6362) {
            this.Field_39809 = (this.Field_39809 + n) % (6423 & 25602);
        }
        if (class_6340 == Class_6340.Field_6450) {
            this.Field_39719 = !this.Field_39719 ? 20589 & -29677 : 4098 & 16641;
            int n6 = this.Field_39719 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6371) {
            this.Field_39833 = !this.Field_39833 ? 1025 & 10297 : 7748 & 0;
            int n7 = this.Field_39833 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6387) {
            this.Field_39783 = !this.Field_39783 ? 18587 & 769 : 10308 & -31103;
            int n8 = this.Field_39783 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6348) {
            this.Field_39825 = !this.Field_39825 ? 25 & -22047 : -28256 & 25101;
            int n9 = this.Field_39825 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6350) {
            this.Field_39870 = !this.Field_39870 ? 513 & 2083 : 17408 & 8518;
            int n10 = this.Field_39870 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6401) {
            this.Field_39743 = !this.Field_39743 ? 3073 & 4273 : 2 & 1145;
            int n11 = this.Field_39743 ? 1 : 0;
            if (this.Field_39713.Method_238() != this.Field_39743) {
                this.Field_39713.Method_196();
            }
        }
        if (class_6340 == Class_6340.Field_6406) {
            this.Field_39844 = !this.Field_39844 ? 8883 & 1033 : 2627 & 17440;
            Display.setVSyncEnabled((boolean)this.Field_39844);
        }
        if (class_6340 == Class_6340.Field_6346) {
            this.Field_39706 = !this.Field_39706 ? 16407 & 6849 : -32510 & 5188;
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6421) {
            this.Field_39733 = !this.Field_39733 ? -24171 & 20491 : 4100 & 2115;
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6410) {
            this.Field_39879 = !this.Field_39879 ? 5 & 7473 : 15674 & 516;
            int n12 = this.Field_39879 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6341) {
            this.Field_39714 = !this.Field_39714 ? 1811 & -32735 : -29568 & 4678;
        }
        this.Method_39903();
    }

    private static String Method_39924(String string) {
        int n = 4999;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39925() {
        if (this.Field_39713.Method_251() && this.Field_39713.Method_180() != null) {
            Class_19426.Field_19448 = 16385 & 6085;
        }
        Class_15715.Method_15717(this, this.Field_39713.Field_72);
    }

    private static String Method_39926(String string) {
        int n = 18704;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39927(Class_6340 class_6340, int n) {
        if (class_6340 == Class_6340.Field_6357) {
            switch (this.Field_39797) {
                case 1: {
                    this.Field_39797 = 4135 & 25154;
                    if (Class_19426.Method_19602()) break;
                    this.Field_39797 = 2947 & -31681;
                    break;
                }
                case 2: {
                    this.Field_39797 = 16451 & -22517;
                    break;
                }
                case 3: {
                    this.Field_39797 = -25823 & 8277;
                    break;
                }
                default: {
                    this.Field_39797 = 1041 & 30723;
                }
            }
        }
        if (class_6340 == Class_6340.Field_6419) {
            this.Field_39766 += 0.6363636f * 0.31428573f;
            if (this.Field_39766 > 0.55542856f * 1.4583334f) {
                this.Field_39766 = 0.8765432f * 0.22816901f;
            }
        }
        if (class_6340 == Class_6340.Field_6388) {
            this.Field_39725 = !this.Field_39725 ? -29439 & 17061 : 2118 & 4120;
            int n2 = this.Field_39725 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6347) {
            this.Field_39752 = !this.Field_39752 ? 3 & -30591 : 387 & 22584;
            Class_19426.Method_19601();
        }
        if (class_6340 == Class_6340.Field_6381) {
            this.Field_39843 += 389 & 14361;
            if (this.Field_39843 > (111 & 26883)) {
                this.Field_39843 = 3136 & -31959;
            }
            this.Method_39902();
            this.Field_39713.Field_33.Method_25104();
        }
        if (class_6340 == Class_6340.Field_6358) {
            this.Field_39718 += 15617 & 45;
            if (this.Field_39718 > (-24306 & 16482)) {
                this.Field_39718 = 208 & 23076;
            }
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6372) {
            this.Field_39782 += 30797 & 1025;
            if (this.Field_39782 > (-8054 & 6)) {
                this.Field_39782 = -29312 & 8243;
            }
        }
        if (class_6340 == Class_6340.Field_6428) {
            this.Field_39799 += 5189 & 17083;
            if (this.Field_39799 > (24811 & 1283)) {
                this.Field_39799 = 19201 & 8232;
            }
        }
        if (class_6340 == Class_6340.Field_6379) {
            this.Field_39817 += -32743 & 583;
            if (this.Field_39817 > (26 & -22778)) {
                this.Field_39817 = 8240 & 20547;
            }
        }
        if (class_6340 == Class_6340.Field_6434) {
            this.Field_39704 += 41 & 29527;
            if (this.Field_39704 > (9251 & 906)) {
                this.Field_39704 = 0 & -22522;
            }
        }
        if (class_6340 == Class_6340.Field_6431) {
            this.Field_39712 = !this.Field_39712 ? 641 & 2317 : -28022 & 37;
            int n3 = this.Field_39712 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6374) {
            this.Field_39872 = !this.Field_39872 ? 5443 & -8063 : 642 & -16311;
            int n4 = this.Field_39872 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6397) {
            this.Field_39785 = !this.Field_39785 ? 2369 & 53 : 4177 & 27784;
            int n5 = this.Field_39785 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6351) {
            this.Field_39761 = !this.Field_39761 ? 10509 & 689 : -14076 & 1536;
            int n6 = this.Field_39761 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6420) {
            this.Field_39867 = !this.Field_39867 ? 819 & -21495 : 18460 & 8832;
            int n7 = this.Field_39867 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6447) {
            this.Field_39784 = !this.Field_39784 ? 12307 & 1537 : 1091 & -24176;
            int n8 = this.Field_39784 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6442) {
            this.Field_39723 = !this.Field_39723 ? 2661 & 4241 : 4168 & -16096;
            int n9 = this.Field_39723 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6375) {
            this.Field_39813 = !this.Field_39813 ? 3137 & 145 : -16128 & 520;
            int n10 = this.Field_39813 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6409) {
            this.Field_39720 = !this.Field_39720 ? 18949 & 17 : 2880 & 16549;
            int n11 = this.Field_39720 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6384) {
            this.Field_39877 = !this.Field_39877 ? -32767 & 4097 : 792 & -26496;
            int n12 = this.Field_39877 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6399) {
            this.Field_39740 = !this.Field_39740 ? 261 & 14915 : 12320 & -13359;
            int n13 = this.Field_39740 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6451) {
            this.Field_39732.Field_8894.\u0000, `((Object)(((Boolean)this.Field_39732.Field_8894.\u0000strictfp() == false ? 4361 & -31551 : 4928 & -8159) != 0));
        }
        if (class_6340 == Class_6340.Field_6386) {
            this.Field_39861 = !this.Field_39861 ? 20625 & -32511 : -16355 & 10016;
            int n14 = this.Field_39861 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6342) {
            this.Field_39791 = !this.Field_39791 ? 16401 & 323 : 169 & 25600;
            int n15 = this.Field_39791 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6404) {
            this.Field_39849 = !this.Field_39849 ? -8045 & 5385 : 2130 & 9761;
            int n16 = this.Field_39849 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6446) {
            this.Field_39796 = !this.Field_39796 ? 16489 & -32745 : -32566 & 4645;
            int n17 = this.Field_39796 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6435) {
            this.Field_39773 = !this.Field_39773 ? 265 & 28739 : 8192 & -31984;
            int n18 = this.Field_39773 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6344) {
            this.Field_39709 = !this.Field_39709 ? 1863 & 1 : 27 & 16452;
            int n19 = this.Field_39709 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6429) {
            this.Field_39852 *= 25130 & 4554;
            if (this.Field_39852 > (67214688 & 2268358)) {
                this.Field_39852 = -27864 & 46;
            }
        }
        if (class_6340 == Class_6340.Field_6395) {
            this.Field_39821 += 24837 & 561;
            if (this.Field_39821 > (10259 & -28285)) {
                this.Field_39821 = -32741 & 30981;
            }
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6441) {
            this.Field_39841 = !this.Field_39841 ? 27203 & 137 : 24612 & -30975;
            int n20 = this.Field_39841 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6405) {
            this.Field_39749 = !this.Field_39749 ? 9249 & -15983 : 16482 & 256;
            int n21 = this.Field_39749 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6418) {
            this.Field_39767 = !this.Field_39767 ? -25783 & 131 : 16529 & -18176;
            int n22 = this.Field_39767 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6408) {
            this.Field_39753 = !this.Field_39753 ? 2489 & 8707 : -16384 & 2552;
            int n23 = this.Field_39753 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6354) {
            this.Field_39832 += -14247 & 293;
            if (this.Field_39832 > (19475 & 8966)) {
                this.Field_39832 = 4160 & 1565;
            }
        }
        if (class_6340 == Class_6340.Field_6430) {
            this.Field_39778 += 1321 & 24597;
            if (this.Field_39778 == (2214 & -24489)) {
                this.Field_39778 = 11274 & -32689;
            }
            if (this.Field_39778 == (1035 & 4619)) {
                this.Field_39778 = 3092 & -16170;
            }
            if (this.Field_39778 == (2647 & 8213)) {
                this.Field_39778 = 25650 & 50;
            }
            if (this.Field_39778 > (-27470 & 2103)) {
                this.Field_39778 = -30847 & 20497;
            }
        }
        if (class_6340 == Class_6340.Field_6413) {
            this.Field_39845 += -10553 & 265;
            if (this.Field_39845 > (466 & -31194)) {
                this.Field_39845 = -13300 & 4226;
            }
            this.Method_39907();
        }
        if (class_6340 == Class_6340.Field_6393) {
            this.Field_39835 = !this.Field_39835 ? 2181 & 1027 : 12064 & 64;
            int n24 = this.Field_39835 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6383) {
            this.Field_39707 += -29791 & 1089;
            if (this.Field_39707 > (-29565 & 25143)) {
                this.Field_39707 = 900 & 2058;
            }
        }
        if (class_6340 == Class_6340.Field_6385) {
            this.Field_39793 = !this.Field_39793 ? -30719 & 4451 : 8368 & 6465;
            this.Method_39925();
        }
        if (class_6340 == Class_6340.Field_6394) {
            this.Field_39865 = !this.Field_39865 ? 1605 & 2083 : 16520 & -31673;
            int n25 = this.Field_39865 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6380) {
            this.Field_39739 = !this.Field_39739 ? 21521 & 333 : -31742 & 40;
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6389) {
            this.Field_39850 = !this.Field_39850 ? 9 & -25661 : 4896 & 25603;
            Class_10125.Method_10180();
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6415) {
            this.Field_39765 = !this.Field_39765 ? 10497 & -32673 : 15012 & -32504;
            Class_24158.Method_24184();
        }
        if (class_6340 == Class_6340.Field_6436) {
            this.Field_39810 = !this.Field_39810 ? 1155 & 26925 : 17409 & 4104;
            Class_10125.Method_10180();
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6425) {
            this.Field_39871 = !this.Field_39871 ? 24643 & -25567 : 18509 & 4128;
            this.Field_39713.Field_27.Method_28705(Class_19426.Method_19564());
            this.Field_39713.Field_70.Method_28705(Class_19426.Method_19564());
        }
        if (class_6340 == Class_6340.Field_6391) {
            this.Field_39776 = !this.Field_39776 ? 535 & 8577 : -14848 & 67;
            Class_10125.Method_10175();
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6396) {
            this.Field_39828 = !this.Field_39828 ? 65 & -30041 : 8225 & -31540;
            Class_18011.Method_18017();
        }
        if (class_6340 == Class_6340.Field_6378) {
            this.Field_39755 = !this.Field_39755 ? 6177 & 329 : -15614 & 1092;
            int n26 = this.Field_39755 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6392) {
            this.Field_39735 = !this.Field_39735 ? -24307 & 5153 : 22546 & 8456;
            Class_15787.Method_15793();
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6376) {
            Class_13337.Field_13340 = this.Field_39863 = !this.Field_39863 ? -23517 & 2177 : 3137 & -32624;
        }
        if (class_6340 == Class_6340.Field_6368) {
            if (!this.Field_39789 && Class_19426.Method_19570()) {
                Class_19426.Method_19611(Class_14688.Method_14697("of.message.fr.shaders1"), Class_14688.Method_14697("of.message.fr.shaders2"));
                return;
            }
            this.Field_39789 = !this.Field_39789 ? 4113 & 9381 : -23536 & 4584;
            Class_19426.Method_19504();
        }
        if (class_6340 == Class_6340.Field_6452) {
            this.Field_39724 = this.Field_39724 == 0 ? 6305 & 17155 : (this.Field_39724 == (10543 & -15727) ? 16387 & 7170 : (this.Field_39724 == (-12473 & 34) ? -12204 & 10505 : -11578 & 8225));
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6377) {
            this.Field_39857 = !this.Field_39857 ? -27287 & 16387 : 20742 & 3721;
            Class_19426.Method_19569();
            if (!Class_19426.Method_19510()) {
                this.Field_39857 = 22528 & 281;
            }
            this.Field_39713.Field_33.Method_25110();
        }
        if (class_6340 == Class_6340.Field_6411) {
            int n27;
            List<String> list = Arrays.asList(Class_19426.Method_19598());
            this.Field_39846 = this.Field_39846.equals("Default") ? list.get(17410 & -24460) : ((n27 = list.indexOf(this.Field_39846)) < 0 ? "Default" : (++n27 >= list.size() ? "Default" : list.get(n27)));
        }
        if (class_6340 == Class_6340.Field_6438) {
            this.Field_39847 = !this.Field_39847 ? 8757 & 18435 : 68 & 26785;
            int n28 = this.Field_39847 ? 1 : 0;
        }
        if (class_6340 == Class_6340.Field_6352) {
            this.Field_39717 = !this.Field_39717 ? 585 & 177 : -28278 & 19969;
        }
    }

    private static String Method_39928(String string) {
        int n = 2058;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39929(String string) {
        int n = 18204;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39930() {
        try {
            File file = this.Field_39790;
            if (!file.exists()) {
                file = this.Field_39866;
            }
            if (!file.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String[] arrstring = string.split(":");
                    if (arrstring[-32105 & 30752].equals("ofRenderDistanceChunks") && arrstring.length >= (4106 & 1426)) {
                        this.Field_39801 = Integer.valueOf(arrstring[1069 & -12287]);
                        this.Field_39801 = Class_19426.Method_19606(this.Field_39801, 11590 & 643, 20513 & 3360);
                    }
                    if (arrstring[6568 & 8196].equals("ofFogType") && arrstring.length >= (22978 & 3)) {
                        this.Field_39797 = Integer.valueOf(arrstring[-32475 & 14859]);
                        this.Field_39797 = Class_19426.Method_19606(this.Field_39797, 20743 & -23855, 419 & -19957);
                    }
                    if (arrstring[1061 & -16366].equals("ofFogStart") && arrstring.length >= (-28666 & 10858)) {
                        this.Field_39766 = Float.valueOf(arrstring[10053 & -16335]).floatValue();
                        if (this.Field_39766 < 0.425f * 0.47058824f) {
                            this.Field_39766 = 0.013333334f * 15.0f;
                        }
                        if (this.Field_39766 > 1.1235484f * 0.7209302f) {
                            this.Field_39766 = 1.326087f * 0.6032787f;
                        }
                    }
                    if (arrstring[-24204 & 4616].equals("ofMipmapType") && arrstring.length >= (194 & -27633)) {
                        this.Field_39760 = Integer.valueOf(arrstring[1 & -839]);
                        this.Field_39760 = Class_19426.Method_19606(this.Field_39760, 11302 & 4816, -22297 & 4611);
                    }
                    if (arrstring[-32732 & 32329].equals("ofOcclusionFancy") && arrstring.length >= (11539 & 42)) {
                        this.Field_39830 = Boolean.valueOf(arrstring[-32221 & 8513]);
                    }
                    if (arrstring[8281 & 4646].equals("ofSmoothFps") && arrstring.length >= (-30718 & 1031)) {
                        this.Field_39725 = Boolean.valueOf(arrstring[73 & 24595]);
                    }
                    if (arrstring[20224 & 8368].equals("ofSmoothWorld") && arrstring.length >= (16398 & 5154)) {
                        this.Field_39752 = Boolean.valueOf(arrstring[-32439 & 22693]);
                    }
                    if (arrstring[3153 & -32758].equals("ofAoLevel") && arrstring.length >= (24730 & -30106)) {
                        this.Field_39808 = Float.valueOf(arrstring[2129 & 29837]).floatValue();
                        this.Field_39808 = Class_19426.Method_19565(this.Field_39808, 0.0f, 1.0f);
                    }
                    if (arrstring[26224 & 6400].equals("ofClouds") && arrstring.length >= (8194 & -30706)) {
                        this.Field_39843 = Integer.valueOf(arrstring[257 & 16403]);
                        this.Field_39843 = Class_19426.Method_19606(this.Field_39843, 17462 & 0, 5395 & -32733);
                        this.Method_39902();
                    }
                    if (arrstring[4178 & 19072].equals("ofCloudsHeight") && arrstring.length >= (-29790 & 6)) {
                        this.Field_39730 = Float.valueOf(arrstring[27041 & 577]).floatValue();
                        this.Field_39730 = Class_19426.Method_19565(this.Field_39730, 0.0f, 1.0f);
                    }
                    if (arrstring[16837 & 3120].equals("ofTrees") && arrstring.length >= (-13558 & 4227)) {
                        this.Field_39718 = Integer.valueOf(arrstring[16437 & 8963]);
                        this.Field_39718 = Class_19426.Method_19606(this.Field_39718, -24568 & 6326, -32762 & 16627);
                    }
                    if (arrstring[394 & 32272].equals("ofDroppedItems") && arrstring.length >= (6150 & 650)) {
                        this.Field_39782 = Integer.valueOf(arrstring[16389 & 4323]);
                        this.Field_39782 = Class_19426.Method_19606(this.Field_39782, 3 & 492, 1155 & 14442);
                    }
                    if (arrstring[-15264 & 6148].equals("ofRain") && arrstring.length >= (-24317 & 518)) {
                        this.Field_39799 = Integer.valueOf(arrstring[20649 & 1813]);
                        this.Field_39799 = Class_19426.Method_19606(this.Field_39799, 717 & 17440, 2067 & 16427);
                    }
                    if (arrstring[9731 & -32424].equals("ofAnimatedWater") && arrstring.length >= (18 & -31989)) {
                        this.Field_39817 = Integer.valueOf(arrstring[257 & 1035]);
                        this.Field_39817 = Class_19426.Method_19606(this.Field_39817, 30745 & -32510, -24510 & 7559);
                    }
                    if (arrstring[-2552 & 480].equals("ofAnimatedLava") && arrstring.length >= (22566 & 1538)) {
                        this.Field_39704 = Integer.valueOf(arrstring[14403 & -15739]);
                        this.Field_39704 = Class_19426.Method_19606(this.Field_39704, 9992 & -14236, 4107 & 16930);
                    }
                    if (arrstring[20550 & 400].equals("ofAnimatedFire") && arrstring.length >= (14754 & 16467)) {
                        this.Field_39712 = Boolean.valueOf(arrstring[-32415 & 9361]);
                    }
                    if (arrstring[13830 & -30720].equals("ofAnimatedPortal") && arrstring.length >= (1027 & -32718)) {
                        this.Field_39872 = Boolean.valueOf(arrstring[-32751 & 18433]);
                    }
                    if (arrstring[18208 & 8282].equals("ofAnimatedRedstone") && arrstring.length >= (-27646 & 10375)) {
                        this.Field_39785 = Boolean.valueOf(arrstring[-15347 & 385]);
                    }
                    if (arrstring[6400 & 68].equals("ofAnimatedExplosion") && arrstring.length >= (11 & 2482)) {
                        this.Field_39761 = Boolean.valueOf(arrstring[513 & 8289]);
                    }
                    if (arrstring[65 & 806].equals("ofAnimatedFlame") && arrstring.length >= (8771 & 20486)) {
                        this.Field_39867 = Boolean.valueOf(arrstring[11073 & 35]);
                    }
                    if (arrstring[2080 & 25216].equals("ofAnimatedSmoke") && arrstring.length >= (28951 & 130)) {
                        this.Field_39784 = Boolean.valueOf(arrstring[25 & -25849]);
                    }
                    if (arrstring[5152 & 898].equals("ofVoidParticles") && arrstring.length >= (2790 & 1034)) {
                        this.Field_39723 = Boolean.valueOf(arrstring[23681 & -32717]);
                    }
                    if (arrstring[8583 & 18472].equals("ofWaterParticles") && arrstring.length >= (1046 & -32374)) {
                        this.Field_39813 = Boolean.valueOf(arrstring[129 & 17251]);
                    }
                    if (arrstring[4710 & 18440].equals("ofPortalParticles") && arrstring.length >= (739 & -13306)) {
                        this.Field_39720 = Boolean.valueOf(arrstring[17713 & 8325]);
                    }
                    if (arrstring[27024 & 1024].equals("ofPotionParticles") && arrstring.length >= (-24557 & 5282)) {
                        this.Field_39877 = Boolean.valueOf(arrstring[16655 & 2049]);
                    }
                    if (arrstring[-29944 & 16547].equals("ofFireworkParticles") && arrstring.length >= (5378 & -6138)) {
                        this.Field_39740 = Boolean.valueOf(arrstring[18435 & 14081]);
                    }
                    if (arrstring[-31328 & 25096].equals("ofDrippingWaterLava") && arrstring.length >= (-28533 & 8258)) {
                        this.Field_39861 = Boolean.valueOf(arrstring[18721 & 12369]);
                    }
                    if (arrstring[-32504 & 513].equals("ofAnimatedTerrain") && arrstring.length >= (-15350 & 2082)) {
                        this.Field_39791 = Boolean.valueOf(arrstring[1293 & -16381]);
                    }
                    if (arrstring[-7168 & 2245].equals("ofAnimatedTextures") && arrstring.length >= (4867 & -7130)) {
                        this.Field_39849 = Boolean.valueOf(arrstring[1829 & -18303]);
                    }
                    if (arrstring[-30373 & 9344].equals("ofRainSplash") && arrstring.length >= (14 & -21261)) {
                        this.Field_39796 = Boolean.valueOf(arrstring[16897 & 8483]);
                    }
                    if (arrstring[10792 & -31727].equals("ofLagometer") && arrstring.length >= (16570 & -23290)) {
                        this.Field_39773 = Boolean.valueOf(arrstring[8581 & 19]);
                    }
                    if (arrstring[-32151 & 22786].equals("ofShowFps") && arrstring.length >= (-32438 & 21122)) {
                        this.Field_39709 = Boolean.valueOf(arrstring[16391 & -32247]);
                    }
                    if (arrstring[8705 & -29636].equals("ofAutoSaveTicks") && arrstring.length >= (25218 & -26334)) {
                        this.Field_39852 = Integer.valueOf(arrstring[6691 & 17677]);
                        this.Field_39852 = Class_19426.Method_19606(this.Field_39852, 40 & 8761, -1056383552 & 269851739);
                    }
                    if (arrstring[10368 & 258].equals("ofBetterGrass") && arrstring.length >= (18434 & -26718)) {
                        this.Field_39821 = Integer.valueOf(arrstring[18195 & -32607]);
                        this.Field_39821 = Class_19426.Method_19606(this.Field_39821, 13313 & 151, 11011 & 5135);
                    }
                    if (arrstring[16 & 10498].equals("ofWeather") && arrstring.length >= (16390 & -30158)) {
                        this.Field_39841 = Boolean.valueOf(arrstring[2345 & 1095]);
                    }
                    if (arrstring[465 & 14346].equals("ofSky") && arrstring.length >= (-32758 & 26887)) {
                        this.Field_39749 = Boolean.valueOf(arrstring[4353 & 16569]);
                    }
                    if (arrstring[20 & 8704].equals("ofStars") && arrstring.length >= (946 & -22526)) {
                        this.Field_39767 = Boolean.valueOf(arrstring[-509 & 9]);
                    }
                    if (arrstring[4101 & -13822].equals("ofSunMoon") && arrstring.length >= (4130 & 17107)) {
                        this.Field_39753 = Boolean.valueOf(arrstring[4737 & -32681]);
                    }
                    if (arrstring[22080 & -30336].equals("ofVignette") && arrstring.length >= (8194 & 18698)) {
                        this.Field_39832 = Integer.valueOf(arrstring[4893 & -32735]);
                        this.Field_39832 = Class_19426.Method_19606(this.Field_39832, -32624 & 22883, 16586 & -32734);
                    }
                    if (arrstring[4212 & 9480].equals("ofChunkUpdates") && arrstring.length >= (16642 & 107)) {
                        this.Field_39778 = Integer.valueOf(arrstring[20641 & 10245]);
                        this.Field_39778 = Class_19426.Method_19606(this.Field_39778, 16977 & 1283, -32731 & 9309);
                    }
                    if (arrstring[-19386 & 16424].equals("ofChunkLoading") && arrstring.length >= (8258 & 2178)) {
                        this.Field_39845 = Integer.valueOf(arrstring[321 & 24615]);
                        this.Field_39845 = Class_19426.Method_19606(this.Field_39845, 16794 & 0, 4107 & 3330);
                        this.Method_39907();
                    }
                    if (arrstring[29978 & 32].equals("ofChunkUpdatesDynamic") && arrstring.length >= (-24538 & 139)) {
                        this.Field_39835 = Boolean.valueOf(arrstring[-16367 & 1063]);
                    }
                    if (arrstring[-32621 & 96].equals("ofTime") && arrstring.length >= (-32605 & 27154)) {
                        this.Field_39707 = Integer.valueOf(arrstring[25699 & 2329]);
                        this.Field_39707 = Class_19426.Method_19606(this.Field_39707, 1060 & 8192, 18695 & 1123);
                    }
                    if (arrstring[0 & 12825].equals("ofClearWater") && arrstring.length >= (2850 & 17410)) {
                        this.Field_39793 = Boolean.valueOf(arrstring[2057 & 17493]);
                        this.Method_39925();
                    }
                    if (arrstring[20528 & 201].equals("ofAaLevel") && arrstring.length >= (8578 & 542)) {
                        this.Field_39746 = Integer.valueOf(arrstring[29219 & 1169]);
                        this.Field_39746 = Class_19426.Method_19606(this.Field_39746, 4572 & -24576, -32166 & 12593);
                    }
                    if (arrstring[336 & 16896].equals("ofAfLevel") && arrstring.length >= (10262 & 802)) {
                        this.Field_39750 = Integer.valueOf(arrstring[12019 & 261]);
                        this.Field_39750 = Class_19426.Method_19606(this.Field_39750, -32739 & 25089, 17236 & 14394);
                    }
                    if (arrstring[-32636 & 4192].equals("ofProfiler") && arrstring.length >= (-29690 & 28707)) {
                        this.Field_39865 = Boolean.valueOf(arrstring[8357 & 22017]);
                    }
                    if (arrstring[16408 & 3136].equals("ofBetterSnow") && arrstring.length >= (275 & 78)) {
                        this.Field_39739 = Boolean.valueOf(arrstring[8209 & 4365]);
                    }
                    if (arrstring[560 & 257].equals("ofSwampColors") && arrstring.length >= (2 & 13426)) {
                        this.Field_39850 = Boolean.valueOf(arrstring[-32615 & 11811]);
                    }
                    if (arrstring[4099 & 2056].equals("ofRandomMobs") && arrstring.length >= (2050 & -32694)) {
                        this.Field_39765 = Boolean.valueOf(arrstring[-7157 & 6341]);
                    }
                    if (arrstring[514 & 6353].equals("ofSmoothBiomes") && arrstring.length >= (21626 & -22393)) {
                        this.Field_39810 = Boolean.valueOf(arrstring[10049 & -16351]);
                    }
                    if (arrstring[2346 & -24512].equals("ofCustomFonts") && arrstring.length >= (9218 & 4122)) {
                        this.Field_39871 = Boolean.valueOf(arrstring[17473 & 11]);
                    }
                    if (arrstring[2312 & 8322].equals("ofCustomColors") && arrstring.length >= (16547 & 14338)) {
                        this.Field_39776 = Boolean.valueOf(arrstring[-30905 & 6177]);
                    }
                    if (arrstring[24672 & 5267].equals("ofCustomSky") && arrstring.length >= (8298 & -27646)) {
                        this.Field_39828 = Boolean.valueOf(arrstring[-24533 & 4737]);
                    }
                    if (arrstring[3201 & -24064].equals("ofShowCapes") && arrstring.length >= (4114 & 1998)) {
                        this.Field_39755 = Boolean.valueOf(arrstring[18441 & 5143]);
                    }
                    if (arrstring[-26472 & 8480].equals("ofNaturalTextures") && arrstring.length >= (-32766 & 5926)) {
                        this.Field_39735 = Boolean.valueOf(arrstring[2329 & 8259]);
                    }
                    if (arrstring[552 & 145].equals("ofLazyChunkLoading") && arrstring.length >= (1410 & -32690)) {
                        this.Field_39857 = Boolean.valueOf(arrstring[16641 & 8705]);
                    }
                    if (arrstring[-4560 & 270].equals("ofDynamicFov") && arrstring.length >= (10 & -25294)) {
                        this.Field_39847 = Boolean.valueOf(arrstring[16649 & 4097]);
                    }
                    if (arrstring[2133 & 5632].equals("ofFullscreenMode") && arrstring.length >= (17415 & 14378)) {
                        this.Field_39846 = arrstring[595 & 1313];
                    }
                    if (arrstring[8347 & 1280].equals("ofFastMath") && arrstring.length >= (-3902 & 1331)) {
                        Class_13337.Field_13340 = this.Field_39863 = Boolean.valueOf(arrstring[-28653 & 16873]).booleanValue();
                    }
                    if (arrstring[1028 & -13792].equals("ofFastRender") && arrstring.length >= (14626 & 198)) {
                        this.Field_39789 = Boolean.valueOf(arrstring[2177 & 13335]);
                    }
                    if (arrstring[12496 & -14304].equals("ofTranslucentBlocks") && arrstring.length >= (-15850 & 4363)) {
                        this.Field_39724 = Integer.valueOf(arrstring[-13303 & 385]);
                        this.Field_39724 = Class_19426.Method_19606(this.Field_39724, 12898 & 261, -27898 & 19602);
                    }
                    if (!arrstring[28803 & 3168].equals("key_" + this.Field_39710.Method_8286())) continue;
                    this.Field_39710.Method_8284(Integer.parseInt(arrstring[7 & -1711]));
                }
                catch (Exception exception) {
                    Class_19426.Method_19526("Skipping bad option: " + string);
                    exception.printStackTrace();
                }
            }
            Class_8264.Method_8281();
            bufferedReader.close();
        }
        catch (Exception exception) {
            Class_19426.Method_19610("Failed to load options");
            exception.printStackTrace();
        }
    }

    public void Method_39931(boolean bl) {
        int n;
        this.Field_39817 = n = bl ? -32347 & 4096 : 12290 & -31953;
        this.Field_39704 = n;
        this.Field_39712 = bl;
        this.Field_39872 = bl;
        this.Field_39785 = bl;
        this.Field_39761 = bl;
        this.Field_39867 = bl;
        this.Field_39784 = bl;
        this.Field_39723 = bl;
        this.Field_39813 = bl;
        this.Field_39796 = bl;
        this.Field_39720 = bl;
        this.Field_39877 = bl;
        this.Field_39740 = bl;
        this.Field_39779 = bl ? 28929 & -32242 : 8706 & -12122;
        this.Field_39861 = bl;
        this.Field_39791 = bl;
        this.Field_39849 = bl;
    }

    static {
        Field_39868 = new Gson();
        Field_39769 = new Class_16689();
        String[] arrstring = new String[70 & -15307];
        arrstring[51 & 716] = Class_39702.Method_39887("\u8000\u8012\u8011\u8001\u8000\u8000\u8012\u8002\u8008\u801b\u8008\u803b\u8008\u800b\u8009\u8009\u8011\u8013\u8000\u8000\u8010");
        arrstring[641 & -32755] = Class_39702.Method_39901("\u0996\u0981\u0984\u0991\u0992\u0993\u0986\u0993\u0996\u0985\u0990\u0983\u0996\u0995\u0990\u0991\u0996\u0983\u0994\u0991\u0990\u0991");
        arrstring[-24029 & 2114] = Class_39702.Method_39886("\u0361\u0365\u0362\u0366\u0361\u0361\u0367\u0323\u0361\u0360\u0367\u0346\u0365\u0364\u0362\u0362\u0330\u0371\u0373\u0377\u0371\u0374\u0372");
        arrstring[4135 & 11907] = Class_39702.Method_39880("\u0180\u0199\u019a\u0183\u0180\u0181\u019a\u01c3\u0180\u0191\u018a\u01b3\u0180\u0181\u018a\u0183\u01c0\u0181\u018a\u019b\u0188\u0189");
        Field_39860 = arrstring;
        String[] arrstring2 = new String[16411 & 3];
        arrstring2[16 & 28129] = Class_39702.Method_39888("\u0521\u0532\u0532\u0523\u0521\u0520\u0531\u0560\u053a\u052b\u0538\u053a\u052b\u0529\u052a\u052b\u0521\u0570\u0533\u0532\u0532");
        arrstring2[-31623 & 515] = Class_39702.Method_39916("\u4008\u4005\u4002\u400f\u4008\u4009\u4006\u400b\u400c\u400d\u400e\u400b\u4004\u400d\u4002\u400b\u4004\u4009\u4002\u4003\u4004\u4005\u4002\u4007\u400c\u4009\u400a");
        arrstring2[9571 & -28666] = Class_39702.Method_39924("\u0427\u0431\u0434\u0420\u0427\u0427\u0433\u0427\u0438\u0428\u043a\u043d\u0429\u042a\u042c\u042c\u0423\u0437\u0435\u0430\u0436\u0430\u0435\u0430\u043c");
        Field_39807 = arrstring2;
        String[] arrstring3 = new String[12551 & 1595];
        arrstring3[13907 & 136] = Class_39702.Method_39908("\u1048\u1043\u1043\u104a\u104c\u104d\u1044\u100d\u1042\u1048\u1009\u1048\u1045\u1045");
        arrstring3[18055 & 6401] = Class_39702.Method_39904("\u1c39\u1c21\u1c20\u1c38\u1c39\u1c39\u1c21\u1c39\u1c31\u1c38\u1c38\u1c38\u1c39\u1c39");
        arrstring3[74 & 10274] = Class_39702.Method_39915("\u4042\u4055\u4050\u4045\u4042\u4043\u4056\u4003\u404c\u404b\u400a\u4049\u404c\u405d");
        Field_39815 = arrstring3;
        String[] arrstring4 = new String[17411 & 523];
        arrstring4[18432 & -31932] = Class_39702.Method_39919("\u8014\u8003\u8004\u8011\u8010\u8011\u8006\u8053\u8000\u8007\u8002\u8015\u8016\u8013\u8052\u8017\u8004\u8007\u8010\u8013\u8002\u8015\u8016\u8005\u8004\u8005\u8046\u8005\u8000\u8011");
        arrstring4[-32221 & 15381] = Class_39702.Method_39926("\u0960\u0962\u0962\u0962\u0960\u0960\u0960\u0920\u0960\u0962\u0960\u0962\u0962\u0962\u0920\u0960\u0970\u0972\u0972\u0970\u0972\u0970\u0970\u0972\u0970\u0970\u0930\u0972\u0972\u0972\u0972\u0972\u0962");
        arrstring4[-4094 & 3990] = Class_39702.Method_39892("\u0110\u0100\u0102\u0112\u0110\u0110\u0102\u0152\u0108\u0108\u010a\u011a\u0118\u0118\u015a\u011a\u0100\u0100\u0112\u0112\u0100\u0110\u0112\u0102\u0108\u0108\u014a\u010a\u0108\u0108\u010a");
        Field_39771 = arrstring4;
        String[] arrstring5 = new String[16643 & 8331];
        arrstring5[-31736 & 32] = Class_39702.Method_39934("\u2040\u204a\u204a\u2042\u2040\u2040\u2048\u2000\u2040\u2042\u2040\u2042\u2042\u204a\u2008\u2040\u2042\u204a\u204a\u2000\u204a\u2040\u204a\u2048\u204a\u2042\u2042\u2008\u2040\u2042\u2040\u2042\u206a\u2062\u2062\u2060\u2068");
        arrstring5[1057 & 65] = Class_39702.Method_39933("\u9000\u9008\u9009\u9001\u9004\u9004\u900c\u9044\u9000\u9000\u9001\u9001\u9004\u900d\u904d\u9005\u9011\u9019\u9019\u9050\u901c\u9014\u901c\u901c\u9019\u9011\u9011\u9058\u9014\u901c\u9014\u9015\u9020\u9029");
        arrstring5[3770 & 2] = Class_39702.Method_39882("\u0198\u0183\u0182\u019b\u0198\u0199\u0180\u01d9\u0180\u0183\u0180\u0193\u0192\u019b\u01d8\u0191\u019a\u0193\u0182\u01d9\u0192\u0199\u0192\u0191\u019a\u0193\u0192\u01d9\u0198\u0193\u0180\u0193\u0180");
        Field_39764 = arrstring5;
        String[] arrstring6 = new String[13843 & 227];
        arrstring6[-19936 & 1045] = Class_39702.Method_39890("\u1820\u1838\u183a\u1822\u1820\u1820\u183a\u1862\u1838\u1838\u183a\u182a\u1828\u1820\u1862\u182a\u1820\u1828\u183a\u1862\u1838\u1838\u182a\u183a\u1808\u1820\u1822\u183a\u1828\u1838\u1862\u182a\u1820\u1820");
        arrstring6[10241 & 509] = Class_39702.Method_39896("\u0100\u0101\u0102\u0103\u0100\u0101\u0102\u0103\u0100\u0101\u0102\u0103\u0100\u0101\u0102\u0103\u0110\u0111\u0112\u0113\u0110\u0111\u0112\u0113\u0110\u0111\u0112\u0113\u0110\u0111\u0112\u0113\u0100\u0101\u0102");
        arrstring6[12938 & 18758] = Class_39702.Method_39909("\u450a\u4500\u4501\u4509\u450e\u450e\u4506\u454e\u4502\u4500\u4503\u4501\u4504\u450d\u454f\u4507\u4509\u4501\u4501\u454a\u4504\u4507\u4504\u4506\u4503\u4509\u4509\u4500\u4504\u4506\u454f\u450d\u450a\u4500\u4502");
        Field_39811 = arrstring6;
        String[] arrstring7 = new String[162 & -25597];
        arrstring7[128 & 7176] = Class_39702.Method_39929("\u34c0\u34d9\u34d8\u34c1\u34c0\u34c1\u34d8\u3481\u34d8\u34d9\u34d8\u34c9\u34c8\u34c1\u3480\u34c1\u34d0\u34d9\u34e0\u34c9\u34d0\u34d9\u34d8\u34d1\u34d8\u3491\u34d0\u34c9\u34c8\u34d9");
        arrstring7[269 & 67] = Class_39702.Method_39913("\u905e\u9040\u9046\u905a\u905a\u905a\u9044\u9018\u9042\u9044\u9040\u9056\u9054\u9058\u9018\u905a\u9058\u9052\u904c\u9046\u905a\u9052\u9050\u905a\u9054\u901e\u9046\u9052\u9058\u905e");
        Field_39816 = arrstring7;
        String[] arrstring8 = new String[19747 & -32753];
        arrstring8[306 & 4288] = Class_39702.Method_39883("\u602a\u6021\u6022\u602b\u602a\u602b\u6020\u6029\u6022\u602b\u6028");
        arrstring8[-13627 & 8195] = Class_39702.Method_39884("\u1830\u1828\u1829\u1831\u1830\u1830\u1828\u1830\u1838\u1828\u1838\u1828\u1831\u1831\u1838\u1829\u1831\u1838\u1838\u1829\u1829");
        arrstring8[20546 & -24574] = Class_39702.Method_39928("\u4910\u4900\u4902\u4912\u4910\u4910\u4902\u4952\u4918\u4908\u491a\u490a\u4918\u4918\u491a\u490a\u4950\u4910\u4912\u4912\u4910\u4900");
        Field_39829 = arrstring8;
    }

    public float Method_39932(Class_6295 class_6295) {
        return this.Field_39848.containsKey((Object)class_6295) ? ((Float)this.Field_39848.get((Object)class_6295)).floatValue() : 1.0f;
    }

    private static String Method_39933(String string) {
        int n = 19105;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39934(String string) {
        int n = 9057;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39702.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

