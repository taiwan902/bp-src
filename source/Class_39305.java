/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Random;

public class Class_39305
extends Class_38640 {
    private Boolean Field_39306;
    private static final ByteBuffer Field_39307;
    private static final byte[] Field_39308;
    private static final byte[] Field_39309;
    private static final byte[] Field_39310;
    private boolean Field_39311;
    private static final byte[][] Field_39312;
    private static final byte[] Field_39313;
    private static final byte[] Field_39314;
    Class_22553 Field_39315 = Class_16620.Method_16627(-31101 & 30064);
    private int Field_39316;
    private Random Field_39317 = new Random();

    static {
        byte[] arrby = new byte[25035 & -28662];
        arrby[3353 & -32608] = 3151 & 77;
        arrby[4297 & -24063] = 2131 & 9323;
        arrby[10566 & 20659] = -22404 & 4988;
        arrby[17667 & 6171] = 1137 & 17217;
        arrby[29764 & -32124] = 2262 & -32655;
        arrby[16469 & 1327] = 29161 & -31645;
        arrby[2118 & 4110] = -30741 & 4215;
        arrby[-32313 & 16423] = 5355 & 123;
        arrby[-16358 & 8300] = -19 & -73;
        arrby[21519 & -32055] = -114 & -81;
        Field_39309 = arrby;
        byte[] arrby2 = new byte[2058 & 26];
        arrby2[10532 & 658] = 1119 & -17843;
        arrby2[1281 & 173] = 8523 & -11193;
        arrby2[16466 & -17401] = -28292 & 764;
        arrby2[-28097 & 1027] = 20427 & 12386;
        arrby2[276 & 25156] = -30350 & 729;
        arrby2[7 & 1629] = 4325 & 1121;
        arrby2[-16042 & 4102] = -22669 & 4199;
        arrby2[16903 & -28665] = 4459 & -8081;
        arrby2[361 & -24564] = -9 & -10;
        arrby2[9 & 8713] = -1 & -66;
        Field_39314 = arrby2;
        byte[] arrby3 = new byte[-28566 & 654];
        arrby3[20514 & 796] = 21071 & -24339;
        arrby3[-15869 & 2361] = 4167 & 24675;
        arrby3[4194 & 514] = 638 & 8316;
        arrby3[10339 & -32737] = 71 & 339;
        arrby3[-14267 & 5166] = 13012 & 16729;
        arrby3[5 & -23329] = 99 & -24479;
        arrby3[3078 & 14] = -27537 & 2403;
        arrby3[8871 & -15025] = 1791 & 16747;
        arrby3[-31736 & 16701] = -27 & -67;
        arrby3[9 & -31029] = -21 & -21;
        Field_39308 = arrby3;
        byte[] arrby4 = new byte[4682 & 24874];
        arrby4[4160 & 9489] = 1503 & -30611;
        arrby4[25101 & 433] = 1219 & 16475;
        arrby4[-21845 & 5190] = 1276 & -28292;
        arrby4[-12213 & 3123] = -16316 & 3269;
        arrby4[-32228 & 294] = 2263 & 16464;
        arrby4[-16169 & 8197] = 16481 & 10475;
        arrby4[6166 & -23417] = 17011 & 4195;
        arrby4[1063 & 583] = 2159 & -32645;
        arrby4[26188 & 2472] = -51 & -59;
        arrby4[-9463 & 8217] = -1 & -13;
        Field_39313 = arrby4;
        byte[][] arrarrby = new byte[12 & 8212][];
        arrarrby[6304 & 72] = Field_39309;
        arrarrby[3 & -24559] = Field_39314;
        arrarrby[90 & -6877] = Field_39308;
        arrarrby[21507 & 2119] = Field_39313;
        Field_39312 = arrarrby;
        Field_39307 = ByteBuffer.allocateDirect(10323 & 18720);
        Field_39310 = new byte[4790 & -32764];
    }

    public static int[] Method_39318(Class_22553 class_22553) {
        byte by;
        int n = 4400 & 192;
        int n2 = 5017 & 9248;
        do {
            by = class_22553.Method_22555();
            n |= (by & (8319 & 18047)) << n2++ * (17415 & 4247);
            if (n2 <= (16661 & -30011)) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by & (128 & -15656)) == (9856 & 18832));
        int[] arrn = new int[20647 & 10];
        arrn[-32719 & 0] = n;
        arrn[11681 & -32685] = n2;
        return arrn;
    }

    private void Method_39319() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_39320(Class_39158 class_39158, Object object, Class_22553 class_22553) {
        this.Method_39321(class_39158, (Class_22553)object, class_22553);
    }

    protected void Method_39321(Class_39158 class_39158, Class_22553 class_22553, Class_22553 class_225532) {
        int n = class_22553.Method_22564();
        int n2 = Class_29900.Method_29926(n);
        if (n2 > (-32765 & 31059)) {
            throw new IllegalArgumentException("unable to fit " + n + " into " + (175 & 9731));
        }
        try {
            Class_29900 class_29900 = new Class_29900(class_225532);
            class_29900.Method_29934(n2 + n);
            class_29900.Method_29982(n);
            class_29900.Method_29956(class_22553, class_22553.Method_22582(), n);
            if (this.Field_39311 || class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812() == Class_11271.Field_11274) {
                int n3;
                int n4;
                if (!this.Field_39311) {
                    this.Field_39311 = 14353 & 1547;
                    Field_39307.clear();
                    for (n3 = 1666 & 16384; n3 < Field_39310.length; ++n3) {
                        Class_39305.Field_39310[n3] = -32752 & 13067;
                    }
                }
                if (this.Field_39306 == null) {
                    Class_29733 class_29733 = (Class_29733)class_39158.Method_39175().attr(Class_10188.Field_10189).Method_34812();
                    this.Field_39306 = (class_29733 != null && class_29733.Field_29747 ? -32755 & 1537 : -14847 & 286) != 0;
                }
                n3 = class_22553.Method_22582();
                int[] arrn = Class_39305.Method_39318(class_22553);
                int n5 = n4 = arrn[-32623 & 1290] == 0 ? -32539 & 17171 : -24176 & 1634;
                if (n4 != 0) {
                    this.Field_39316 += 28951 & 585;
                    int n6 = arrn[521 & -29359];
                    class_22553.Method_22590(n3);
                    int n7 = n - n6;
                    if (n7 > (-32736 & 11297)) {
                        n7 = 568 & -4057;
                    }
                    if (this.Field_39306.booleanValue()) {
                        Field_39307.limit(Field_39307.position() + n7);
                        n3 = class_22553.Method_22582();
                        class_22553.Method_22617(class_22553.Method_22582() + n6, Field_39307);
                        class_22553.Method_22590(n3);
                        if ((this.Field_39316 & (-30657 & 5695)) == (21183 & -22401)) {
                            this.Field_39315.Method_22635();
                            Class_29900 class_299002 = new Class_29900(this.Field_39315);
                            Class_18.Field_89.Field_26.Method_2289(Field_39307.position(), Field_39310);
                            Class_28799 class_28799 = new Class_28799(Field_39312[this.Field_39317.nextInt(4132 & 2564)], Field_39310);
                            Field_39307.clear();
                            class_299002.Method_29982(-4073 & 1111);
                            class_28799.Method_28809(class_299002);
                            int n8 = this.Field_39315.Method_22564();
                            int n9 = Class_29900.Method_29926(n);
                            class_29900.Method_29934(n2 + n + n9 + n8);
                            class_29900.Method_29982(n8 + n6);
                            class_29900.Method_29982(arrn[-24426 & 17920]);
                            class_29900.Method_29956(this.Field_39315, this.Field_39315.Method_22582(), n8);
                            this.Field_39316 += 2561 & -15341;
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}

