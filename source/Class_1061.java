/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.util.Vec3;

public abstract class Class_1061
implements Class_1367 {
    public int Field_1062;
    private static Class_43980 Field_1063;
    protected Class_4595 Field_1064;
    protected Class_4751 Field_1065;
    private static Random Field_1066;
    protected boolean Field_1067;
    public boolean Field_1068 = 18448 & 12608;
    private double Field_1069;
    protected Class_32695 Field_1070;
    public double Field_1071;
    public double Field_1072;
    private static Class_4452 Field_1073;
    private final Class_8719 Field_1074;
    private Class_3839 Field_1075;
    protected boolean Field_1076;
    public boolean Field_1077;
    public float Field_1078;
    public float Field_1079;
    public boolean Field_1080;
    private static Class_43980 Field_1081;
    private static Class_43980 Field_1082;
    private int Field_1083 = -28401 & 688;
    public int Field_1084;
    public Class_18399 Field_1085 = new Class_18399((10322 & -16000) != 0);
    private static Class_3839 Field_1086;
    private Class_3839 Field_1087;
    public int Field_1088;
    public Class_283 Field_1089;
    public int Field_1090;
    private double Field_1091;
    private static int Field_1092;
    public float Field_1093;
    public boolean Field_1094;
    public Class_1061 Field_1095;
    public int Field_1096;
    public float Field_1097;
    public float Field_1098;
    public Class_1061 Field_1099;
    private double Field_1100;
    private double Field_1101;
    public double Field_1102;
    private static int Field_1103;
    public boolean Field_1104;
    public int Field_1105;
    public double Field_1106;
    public Class_10997 Field_1107;
    protected UUID Field_1108;
    protected boolean Field_1109;
    public boolean Field_1110;
    public int Field_1111;
    public int Field_1112;
    private float Field_1113;
    public boolean Field_1114;
    private static Class_4452 Field_1115;
    protected Vec3 Field_1116;
    public static final Class_10997 Field_1117;
    private static Class_3839 Field_1118;
    private float Field_1119;
    public boolean Field_1120;
    private boolean Field_1121;
    protected Random Field_1122;
    public static double Field_1123;
    private int Field_1124;
    public double Field_1125;
    public double Field_1126;
    private double Field_1127;
    private int Field_1128;
    private static Class_43980 Field_1129;
    public double Field_1130;
    public int Field_1131;
    public int Field_1132;
    protected boolean Field_1133;
    private double Field_1134;
    protected boolean Field_1135;
    private float Field_1136;
    private Class_3839 Field_1137;
    protected int Field_1138;
    public boolean Field_1139;
    public boolean Field_1140;
    public double Field_1141;
    private static Class_4452 Field_1142;
    private int Field_1143;
    protected double Field_1144 = -Field_1092;
    public float Field_1145;
    private static Class_3839 Field_1146;
    public int Field_1147;
    public float Field_1148;
    private static Class_2190 Field_1149;
    public float Field_1150;
    private static Class_3839 Field_1151;
    public float Field_1152;
    private boolean Field_1153;
    public boolean Field_1154;
    public boolean Field_1155;

    public Class_10997 Method_1156(Class_1061 class_1061) {
        return null;
    }

    public boolean Method_1157() {
        return (this.Field_1070.Method_32708(-24300 & 16460) == (10241 & -28451) ? -32399 & 9 : 5418 & -24571) != 0;
    }

    public Class_3443 Method_1158(Class_1956 class_1956, int n) {
        return this.Method_1264(class_1956, n, 0.0f);
    }

    public void Method_1159(Class_1061 class_1061) {
        this.Method_1239(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, class_1061.Field_1079, class_1061.Field_1093);
    }

    public float Method_1160(float f) {
        if (Class_18.Field_89.Field_58.Field_22854) {
            return this.Field_1093 + Class_18.Field_89.Field_58.Field_22864;
        }
        return this.Field_1078 + (this.Field_1093 - this.Field_1078) * f;
    }

    public void Method_1161(double d) {
        this.Field_1134 = d + Field_1123;
    }

    public boolean Method_1162() {
        return this.Field_1089.Method_440(this.Method_1315().Method_11017(-0.056701031772746255 * 1.7636363636363637, -0.3416666717578968 * 1.170731707317073, 1.0 * -0.10000000149011612), Class_3713.Field_3750);
    }

    public void Method_1163(Class_1061 class_1061) {
        this.Field_1127 = 0.0;
        this.Field_1091 = 0.0;
        if (class_1061 == null) {
            if (this.Field_1095 != null) {
                this.Method_1239(this.Field_1095.Field_1130, this.Field_1095.Method_1315().Field_11000 + (double)this.Field_1095.Method_1287(), this.Field_1095.Field_1106, this.Field_1079, this.Field_1093);
                this.Field_1095.Field_1099 = null;
            }
            this.Field_1095 = null;
        } else {
            if (this.Field_1095 != null) {
                this.Field_1095.Field_1099 = null;
            }
            if (class_1061 != null) {
                Class_1061 class_10612 = class_1061.Field_1095;
                while (class_10612 != null) {
                    if (class_10612 == this) {
                        return;
                    }
                    class_10612 = class_10612.Field_1095;
                }
            }
            this.Field_1095 = class_1061;
            class_1061.Field_1099 = this;
        }
    }

    protected boolean Method_1164(int n) {
        return ((this.Field_1070.Method_32708(10259 & 1672) & (12817 & 18701) << n) != 0 ? 533 & -32543 : 24625 & 2636) != 0;
    }

    public Class_23823[] Method_1165() {
        return null;
    }

    public void Method_1166() {
        this.Field_1110 = -27391 & 595;
    }

    public void Method_1167(Class_4751 class_4751, float f, float f2) {
        this.Method_1239((double)class_4751.\u0000= final() + 0.64 * 0.78125, class_4751.\u0000, `(), (double)class_4751.\u0000strictfp() + 0.4727272727272727 * 1.0576923076923077, f, f2);
    }

    public boolean Method_1168() {
        return this.Field_1121;
    }

    public void Method_1169(Class_26261 class_26261, int n) {
        this.Field_1074.Method_8729(this, class_26261, n);
    }

    public final double Method_1170() {
        return this.Field_1069;
    }

    public void Method_1171(Class_10997 class_10997) {
        this.Field_1107 = class_10997;
    }

    public double Method_1172(Class_4751 class_4751) {
        return class_4751.\u0000, `(this.Field_1130, this.Method_1324(), this.Field_1106);
    }

    public void Method_1173(boolean bl) {
        this.Method_1364(16417 & 193, bl);
    }

    public boolean Method_1174() {
        return this.Method_1164(7 & 12876);
    }

    public Class_4751 Method_1175() {
        return new Class_4751(this.Field_1130, this.Method_1324() + 0.06451612903225806 * 7.75, this.Field_1106);
    }

    protected void Method_1176() {
        if (!this.Field_1109) {
            this.Method_1340(Class_32797.Field_32822, 2.9898992f * 1.3378378f);
            this.Method_1327(623 & 8207);
        }
    }

    public void Method_1177(double d) {
        this.Field_1134 = (this.Field_1134 - Field_1123) * d + Field_1123;
    }

    public Class_283 Method_1178() {
        return this.Field_1089;
    }

    public float Method_1179(float f) {
        if (Class_18.Field_89.Field_58.Field_22854) {
            return this.Field_1079 + Class_18.Field_89.Field_58.Field_22900;
        }
        return this.Field_1145 + (this.Field_1079 - this.Field_1145) * f;
    }

    public boolean Method_1180() {
        return (9733 & -32551) != 0;
    }

    public void Method_1181() {
        this.Method_1323();
    }

    protected final String Method_1182() {
        return Class_15516.Method_15540(this);
    }

    protected void Method_1183(int n) {
        if (!this.Field_1109) {
            this.Method_1340(Class_32797.Field_32812, n);
        }
    }

    public void Method_1184(double d, double d2, double d3) {
        this.Method_1239(d, d2, d3, this.Field_1079, this.Field_1093);
    }

    protected Class_1758 Method_1185(float ... arrf) {
        Class_1758 class_1758 = new Class_1758();
        float[] arrf2 = arrf;
        int n = arrf2.length;
        for (int i = -28412 & 24768; i < n; ++i) {
            float f = arrf2[i];
            class_1758.Method_1781(new Class_39580(f));
        }
        return class_1758;
    }

    public double Method_1186(double d, double d2, double d3) {
        double d4 = this.Field_1130 - d;
        double d5 = this.Method_1324() - d2;
        double d6 = this.Field_1106 - d3;
        return Class_13337.Method_13347(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public boolean Method_1187() {
        return this.Method_1164(263 & 6179);
    }

    public void Method_1188() {
        if (this.Method_1187() && !this.Method_1314()) {
            this.Method_1204();
        }
    }

    public void Method_1189(double d, double d2, double d3) {
        this.Field_1071 += d;
        this.Method_1161(this.Method_1224() + d2);
        this.Field_1072 += d3;
        this.Field_1139 = 5633 & 405;
    }

    public final void Method_1190(float f) {
        if (this.Field_1075 == null) {
            this.Field_1113 = f;
        } else {
            this.Field_1075.Method_3854(f);
        }
    }

    public Class_10997 Method_1191(Class_10997 class_10997) {
        Class_10997 class_109972 = this.Field_1107;
        class_10997.Method_11010(class_109972);
        return class_10997;
    }

    public Class_4595 Method_1192() {
        return Class_4595.Method_4628(Class_13337.Method_13371((double)(this.Field_1079 * (2.1666667f * 1.8461537f) / (4.1f * 87.80488f)) + 0.5306122448979592 * 0.9423076923076923) & (-32669 & 17035));
    }

    protected String Method_1193() {
        return "game.neutral.swim";
    }

    public UUID Method_1194() {
        return this.Field_1108;
    }

    public boolean Method_1195(Class_1061 class_1061) {
        return (this == class_1061 ? 2085 & -32295 : 2048 & 9552) != 0;
    }

    protected final Vec3 Method_1196(float f, float f2) {
        float f3 = Class_13337.Method_13350(-f2 * (8.428572f * 0.0020707296f) - 6.3579855f * 0.49411765f);
        float f4 = Class_13337.Method_13370(-f2 * (1.1445783f * 0.015248666f) - 3.2911925f * 0.95454544f);
        float f5 = -Class_13337.Method_13350(-f * (4.1363635f * 0.0042194775f));
        float f6 = Class_13337.Method_13370(-f * (3.1666667f * 0.005511566f));
        return new Vec3(f4 * f5, f6, f3 * f5);
    }

    public Class_10997 Method_1197() {
        return null;
    }

    public boolean Method_1198(Class_1699 class_1699) {
        String string = this.Method_1182();
        if (!this.Field_1110 && string != null) {
            class_1699.Method_1702("id", string);
            this.Method_1263(class_1699);
            return (-32761 & 817) != 0;
        }
        return (16394 & 2608) != 0;
    }

    public boolean Method_1199() {
        return (this.Field_1067 || this.Field_1089.Method_496(new Class_4751(this.Field_1130, this.Method_1324(), this.Field_1106)) || this.Field_1089.Method_496(new Class_4751(this.Field_1130, this.Method_1324() + (double)this.Method_1287(), this.Field_1106)) ? 1 & -10917 : 24 & 1858) != 0;
    }

    public void Method_1200(float f) {
    }

    public Class_8719 Method_1201() {
        return this.Field_1074;
    }

    public String Method_1202() {
        if (this.Method_1260()) {
            return this.Method_1238();
        }
        String string = Class_15516.Method_15540(this);
        if (string == null) {
            string = "generic";
        }
        return Class_7594.Method_7602("entity." + string + ".name");
    }

    static {
        Field_1117 = new Class_10997(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        Field_1151 = new Class_3839(Class_2263.Method_2309(), Class_2205.Field_2216);
        Field_1146 = new Class_3839(Class_2263.Method_2297(), Class_2205.Field_2216);
        Field_1118 = new Class_3839(Class_2263.Method_2393(), Class_2205.Field_2250);
        Field_1063 = new Class_43980();
        Field_1082 = new Class_43980();
        Field_1129 = new Class_43980();
        Field_1081 = new Class_43980();
        Field_1073 = new Class_4452();
        Field_1115 = new Class_4452();
        Field_1142 = new Class_4452();
        Field_1149 = new Class_2190(Class_2263.Method_2332(), Class_2205.Field_2250);
        Field_1086 = new Class_3839(Class_2263.Method_2409().floatValue(), Class_2205.Field_2241);
        Field_1066 = new Random();
        Field_1092 = 306 & 20553;
        Field_1123 = new Random().nextDouble();
    }

    public void Method_1203(boolean bl) {
        this.Field_1070.Method_32704(8324 & 2084, (byte)(bl ? -14675 & 8257 : 24128 & 387));
    }

    protected void Method_1204() {
        int n;
        int n2;
        int n3 = Class_13337.Method_13371(this.Field_1130);
        Class_4751 class_4751 = new Class_4751(n3, n2 = Class_13337.Method_13371(this.Method_1324() - 0.24528302252292633 * 0.8153846153846154), n = Class_13337.Method_13371(this.Field_1106));
        Class_3436 class_3436 = this.Field_1089.Method_375(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_3238.Method_3316() != (-1 & -1)) {
            int[] arrn = new int[-24463 & 1];
            arrn[4096 & -32448] = Class_3238.Method_3367(class_3436);
            this.Field_1089.Method_407(Class_40274.Field_40315, this.Field_1130 + ((double)this.Field_1122.nextFloat() - 18.25 * 0.0273972602739726) * (double)this.Method_1266(), this.Method_1315().Field_11000 + 1.1029411764705883 * 0.09066666666666666, this.Field_1106 + ((double)this.Field_1122.nextFloat() - 6.125000000000001 * 0.08163265306122448) * (double)this.Method_1266(), -this.Field_1071 * (2.8421052631578947 * 1.4074074074074074), 1.1 * 1.3636363636363635, -this.Field_1072 * (21.2 * 0.18867924528301888), arrn);
        }
    }

    public float Method_1205(Class_25529 class_25529, Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return class_3436.Method_3442().Method_3348(this);
    }

    protected void Method_1206() {
        if (this.Field_1089 != null) {
            while (this.Method_1324() > 0.0 && this.Method_1324() < 246.02597402597402 * 1.0405405405405406) {
                this.Method_1349(this.Field_1130, this.Method_1324(), this.Field_1106);
                if (this.Field_1089.Method_461(this, this.Method_1315()).isEmpty()) break;
                this.Method_1241(this.Method_1324() + 1.0);
            }
            this.Field_1072 = 0.0;
            this.Field_1071 = 0.0;
            this.Method_1161(0.0);
            this.Field_1093 = 0.0f;
        }
    }

    public double Method_1207(Class_4751 class_4751) {
        return class_4751.\u0000strictfp(this.Field_1130, this.Method_1324(), this.Field_1106);
    }

    protected void Method_1208() {
        float f;
        float f2;
        float f3 = Class_13337.Method_13347(this.Field_1071 * this.Field_1071 * (0.8125 * 0.24615384982182428) + this.Method_1224() * this.Method_1224() + this.Field_1072 * this.Field_1072 * (2.6333333725730577 * 0.0759493670886076)) * (0.21132076f * 0.9464286f);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.Method_1288(this.Method_1306(), f3, 1.0f + (this.Field_1122.nextFloat() - this.Field_1122.nextFloat()) * (60.0f * 0.006666667f));
        float f4 = Class_13337.Method_13371(this.Method_1315().Field_11000);
        int n = 514 & 129;
        while ((float)n < 1.0f + this.Method_1266() * (35.31915f * 0.56626505f)) {
            f = (this.Field_1122.nextFloat() * 2.0f - 1.0f) * this.Method_1266();
            f2 = (this.Field_1122.nextFloat() * 2.0f - 1.0f) * this.Method_1266();
            this.Field_1089.Method_407(Class_40274.Field_40280, this.Field_1130 + (double)f, f4 + 1.0f, this.Field_1106 + (double)f2, this.Field_1071, this.Method_1224() - (double)(this.Field_1122.nextFloat() * (1.0681819f * 0.18723403f)), this.Field_1072, new int[-7040 & 794]);
            ++n;
        }
        n = -32746 & 16416;
        while ((float)n < 1.0f + this.Method_1266() * (61.333332f * 0.32608697f)) {
            f = (this.Field_1122.nextFloat() * 2.0f - 1.0f) * this.Method_1266();
            f2 = (this.Field_1122.nextFloat() * 2.0f - 1.0f) * this.Method_1266();
            this.Field_1089.Method_407(Class_40274.Field_40313, this.Field_1130 + (double)f, f4 + 1.0f, this.Field_1106 + (double)f2, this.Field_1071, this.Method_1224(), this.Field_1072, new int[3 & -20720]);
            ++n;
        }
    }

    public boolean Method_1209(double d, double d2, double d3) {
        double d4 = this.Field_1130 - d;
        double d5 = this.Method_1324() - d2;
        double d6 = this.Field_1106 - d3;
        double d7 = d4 * d4 + d5 * d5 + d6 * d6;
        return this.Method_1270(d7);
    }

    public void Method_1210(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.Method_1349(d, d2, d3);
        this.Method_1236(f, f2);
        ArrayList arrayList = this.Field_1089.Method_461(this, this.Method_1315().Method_11012(0.03523936170212766 * 0.8867924528301887, 0.0, 1.2727272727272727 * 0.024553571428571428));
        if (!arrayList.isEmpty()) {
            double d4 = 0.0;
            for (Class_10997 class_10997 : arrayList) {
                if (!(class_10997.Field_10998 > d4)) continue;
                d4 = class_10997.Field_10998;
            }
            this.Method_1349(d, d2 += d4 - this.Method_1315().Field_11000, d3);
        }
    }

    public void Method_1211(Class_1699 class_1699) {
    }

    public float Method_1212(float f) {
        int n;
        int n2;
        int n3 = Class_13337.Method_13371(this.Field_1130);
        return this.Field_1089.Method_490(n3, n = Class_13337.Method_13371(this.Method_1324() + (double)this.Method_1357()), n2 = Class_13337.Method_13371(this.Field_1106)) ? this.Field_1089.Method_505(n3, n, n2) : 0.0f;
    }

    public void Method_1213(boolean bl) {
        this.Field_1085.Method_18406(bl);
    }

    public void Method_1214(byte by) {
    }

    public boolean Method_1215() {
        return (4096 & -16363) != 0;
    }

    protected abstract void Method_1216();

    public void Method_1217(double d, double d2, double d3, float f, float f2) {
        this.Field_1130 = d;
        this.Method_1360(this.Field_1130);
        this.Method_1254(d2);
        this.Method_1241(d2);
        this.Field_1106 = d3;
        this.Method_1339(this.Field_1106);
        this.Field_1145 = this.Field_1079 = f;
        this.Field_1078 = this.Field_1093 = f2;
        double d4 = this.Field_1145 - f;
        if (d4 < 0.968421052631579 * -185.8695652173913) {
            this.Field_1145 += 350.99997f * 1.0256411f;
        }
        if (d4 >= 1.1794871794871795 * 152.6086956521739) {
            this.Field_1145 -= 221.25002f * 1.6271186f;
        }
        this.Method_1349(this.Field_1130, this.Method_1324(), this.Field_1106);
        this.Method_1236(f, f2);
    }

    public void Method_1218(int n) {
        this.Field_1070.Method_32704(1025 & 7, (short)n);
    }

    public Vec3 Method_1219(float f) {
        if (f == 1.0f) {
            return new Vec3(this.Field_1130, this.Method_1324() + (double)this.Method_1357(), this.Field_1106);
        }
        double d = this.Method_1255() + (this.Field_1130 - this.Method_1255()) * (double)f;
        double d2 = this.Method_1170() + (this.Method_1324() - this.Method_1170()) * (double)f + (double)this.Method_1357();
        double d3 = this.Method_1271() + (this.Field_1106 - this.Method_1271()) * (double)f;
        return new Vec3(d, d2, d3);
    }

    public void Method_1220(Class_27363 class_27363) {
        this.Method_1340(Class_32797.Field_32821, 2.096774f * 2.3846154f);
        this.Field_1128 += -27647 & 8355;
        if (this.Field_1128 == 0) {
            this.Method_1327(266 & -21924);
        }
    }

    public boolean Method_1221(Class_626 class_626, Vec3 vec3) {
        return (12544 & -30606) != 0;
    }

    public void Method_1222(boolean bl) {
        this.Method_1364(11459 & 3, bl);
    }

    public boolean Method_1223() {
        return (this.Field_1070.Method_32708(17127 & 2051) == (17569 & 2561) ? 10145 & -30717 : 4203 & 11280) != 0;
    }

    public double Method_1224() {
        return this.Field_1134 - Field_1123;
    }

    public int Method_1225() {
        return this.Field_1124;
    }

    public Class_32695 Method_1226() {
        return this.Field_1070;
    }

    public final boolean Method_1227() {
        return this.Field_1109;
    }

    public Class_1782 Method_1228(boolean bl) {
        Class_2840 class_2840 = new Class_2840(this.Method_1202());
        class_2840.\u0000strictfp().Method_2936(this.Method_1307());
        class_2840.\u0000strictfp().Method_2926(this.Method_1194().toString());
        return class_2840;
    }

    protected Class_1758 Method_1229(double ... arrd) {
        Class_1758 class_1758 = new Class_1758();
        double[] arrd2 = arrd;
        int n = arrd2.length;
        for (int i = 8232 & -9855; i < n; ++i) {
            double d = arrd2[i];
            class_1758.Method_1781(new Class_44215(d));
        }
        return class_1758;
    }

    public void Method_1230(Class_1782 class_1782) {
    }

    public boolean Method_1231() {
        return (4739 & 27681) != 0;
    }

    public final Class_1782 Method_1232() {
        return this.Method_1228((925 & -16381) != 0);
    }

    public void Method_1233(Class_283 class_283) {
        this.Field_1089 = class_283;
    }

    public boolean Method_1234(Class_1061 class_1061) {
        return (2 & -32640) != 0;
    }

    public void Method_1235(boolean bl) {
        this.Method_1364(16997 & 4111, bl);
    }

    protected void Method_1236(float f, float f2) {
        this.Field_1079 = f % (5615.9995f * 0.06410257f);
        this.Field_1093 = f2 % (330.0f * 1.0909091f);
    }

    public void Method_1237(float f, float f2) {
        if (this.Field_1099 != null) {
            this.Field_1099.Method_1237(f, f2);
        }
    }

    public String Method_1238() {
        return this.Field_1070.Method_32711(-30710 & 595);
    }

    public void Method_1239(double d, double d2, double d3, float f, float f2) {
        this.Field_1126 = this.Field_1130 = d;
        this.Method_1360(this.Field_1130);
        this.Field_1102 = d2;
        this.Method_1254(this.Field_1102);
        this.Method_1241(d2);
        this.Field_1125 = this.Field_1106 = d3;
        this.Method_1339(this.Field_1106);
        this.Field_1079 = f;
        this.Field_1093 = f2;
        this.Method_1349(this.Field_1130, this.Method_1324(), this.Field_1106);
    }

    public void Method_1240(Class_1061 class_1061, int n) {
    }

    public double Method_1241(double d) {
        if (this.Field_1068) {
            return this.Method_1298(d);
        }
        this.Field_1144 = d;
        this.Field_1083 += -31999 & 16525;
        return d;
    }

    public boolean Method_1242(int n, String string) {
        return (6675 & 8521) != 0;
    }

    protected boolean Method_1243(double d, double d2, double d3) {
        Class_4751 class_4751 = new Class_4751(d, d2, d3);
        double d4 = d - (double)class_4751.\u0000= final();
        double d5 = d2 - (double)class_4751.\u0000, `();
        double d6 = d3 - (double)class_4751.\u0000strictfp();
        List list = this.Field_1089.Method_399(this.Method_1315());
        if (list.isEmpty() && !this.Field_1089.Method_544(class_4751)) {
            return (-28649 & 2624) != 0;
        }
        int n = -21565 & 19;
        double d7 = 3440.516129032258 * 2.90625;
        if (!this.Field_1089.Method_544(class_4751.Method_4771()) && d4 < d7) {
            d7 = d4;
            n = 48 & 12867;
        }
        if (!this.Field_1089.Method_544(class_4751.Method_4770()) && 1.0 - d4 < d7) {
            d7 = 1.0 - d4;
            n = 15875 & 49;
        }
        if (!this.Field_1089.Method_544(class_4751.Method_4769()) && 1.0 - d5 < d7) {
            d7 = 1.0 - d5;
            n = -28349 & 16899;
        }
        if (!this.Field_1089.Method_544(class_4751.Method_4778()) && d6 < d7) {
            d7 = d6;
            n = 774 & 31765;
        }
        if (!this.Field_1089.Method_544(class_4751.Method_4784()) && 1.0 - d6 < d7) {
            d7 = 1.0 - d6;
            n = 22557 & 1543;
        }
        float f = this.Field_1122.nextFloat() * (0.2101695f * 0.9516129f) + 0.88135594f * 0.11346154f;
        if (n == 0) {
            this.Field_1071 = -f;
        }
        if (n == (1667 & -26271)) {
            this.Field_1071 = f;
        }
        if (n == (15027 & 67)) {
            this.Method_1161(f);
        }
        if (n == (9013 & 17412)) {
            this.Field_1072 = -f;
        }
        if (n == (2703 & 8197)) {
            this.Field_1072 = f;
        }
        return (16389 & -27893) != 0;
    }

    public boolean Method_1244() {
        return this.Field_1085.Method_18404();
    }

    public int Method_1245() {
        return -32388 & 28461;
    }

    public Class_37110 Method_1246(double d, float f) {
        Vec3 vec3 = this.Method_1219(f);
        Vec3 vec32 = this.Method_1296(f);
        Vec3 vec33 = vec3.\u0000strictfp(vec32.\u0000= final * d, vec32.\u0000strictfp * d, vec32.\u0000, ` * d);
        return this.Field_1089.Method_405(vec3, vec33, (2562 & 1088) != 0, (2056 & 1056) != 0, (85 & -26335) != 0);
    }

    public boolean Method_1247(Class_626 class_626) {
        return (class_626.Method_752() ? 22850 & 9221 : this.Method_1358()) != 0;
    }

    public String Method_1248() {
        Object[] arrobject = new Object[4719 & -29289];
        arrobject[4416 & -29528] = this.getClass().getSimpleName();
        arrobject[1033 & -30223] = this.Method_1202();
        arrobject[66 & -24062] = this.Field_1124;
        arrobject[-31229 & 3] = this.Field_1089 == null ? "~NULL~" : this.Field_1089.Method_386().Method_31831();
        arrobject[-28026 & 25652] = this.Field_1130;
        arrobject[8199 & -9075] = this.Method_1324();
        arrobject[5766 & 10502] = this.Field_1106;
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", arrobject);
    }

    public Vec3 Method_1249() {
        return new Vec3(this.Field_1130, this.Method_1324(), this.Field_1106);
    }

    public boolean Method_1250(double d, double d2, double d3) {
        Class_10997 class_10997 = this.Method_1315().Method_11021(d, d2, d3);
        return this.Method_1259(class_10997);
    }

    protected void Method_1251(Class_859 class_859, Class_1061 class_1061) {
        if (class_1061 instanceof Class_859) {
            Class_29642.Method_29667((Class_859)class_1061, class_859);
        }
        Class_29642.Method_29656(class_859, class_1061);
    }

    public double Method_1252() {
        return 0.0;
    }

    public boolean Method_1253(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        return (137 & -3579) != 0;
    }

    public final void Method_1254(double d) {
        this.Field_1069 = d;
    }

    public final double Method_1255() {
        return this.Field_1101;
    }

    public void Method_1256(String string) {
        this.Field_1070.Method_32704(25603 & 2894, string);
    }

    protected boolean Method_1257() {
        return (1025 & 14345) != 0;
    }

    public boolean Method_1258() {
        if (this.Field_1094) {
            return (2569 & 12420) != 0;
        }
        Class_4810 class_4810 = new Class_4810(-1048311132 & -2109102768, -1073337851 & -1219391488, -2144598384 & -1212016372);
        double d = this.Field_1130;
        double d2 = this.Method_1324();
        double d3 = this.Field_1106;
        double d4 = this.Method_1266();
        double d5 = this.Method_1357();
        for (int i = 3110 & -24183; i < (-24500 & 4136); ++i) {
            int n = Class_13337.Method_13371(d2 + (double)(((float)(i >> (-32704 & 1539) & (707 & -32735)) - 1.275f * 0.39215687f) * (0.64285713f * 0.15555556f)) + d5);
            int n2 = Class_13337.Method_13371(d + (double)((float)(i >> (259 & 17545) & (-32639 & 11549)) - 0.07236842f * 6.909091f) * d4 * (0.662857152734484 * 1.206896551724138));
            int n3 = Class_13337.Method_13371(d3 + (double)((float)(i >> (-32506 & 1067) & (-30375 & 9859)) - 2.09375f * 0.23880596f) * d4 * (0.494949494949495 * 1.616326554697387));
            if (class_4810.\u0000= final() == n2 && class_4810.\u0000, `() == n && class_4810.\u0000strictfp() == n3) continue;
            class_4810.Method_4814(n2, n, n3);
            if (!this.Field_1089.\u0000strictfp((Class_4751)class_4810).Method_3688().Method_3421()) continue;
            return (4617 & -22287) != 0;
        }
        return (354 & 16388) != 0;
    }

    private boolean Method_1259(Class_10997 class_10997) {
        return (this.Field_1089.Method_461(this, class_10997).isEmpty() && !this.Field_1089.Method_509(class_10997) ? 5129 & 10753 : -30720 & 1656) != 0;
    }

    public boolean Method_1260() {
        return (this.Field_1070.Method_32711(-16317 & 10406).length() > 0 ? 22721 & 801 : 8464 & 18438) != 0;
    }

    public int Method_1261() {
        return this.Field_1070.Method_32723(-7919 & 225);
    }

    public float Method_1262() {
        return 0.0f;
    }

    public void Method_1263(Class_1699 class_1699) {
        try {
            Class_1699 class_16992;
            double[] arrd = new double[5123 & -23713];
            arrd[398 & 23040] = this.Field_1130;
            arrd[305 & 17925] = this.Method_1324();
            arrd[-29690 & 10] = this.Field_1106;
            class_1699.Method_1744("Pos", this.Method_1229(arrd));
            double[] arrd2 = new double[16419 & 907];
            arrd2[27668 & 64] = this.Field_1071;
            arrd2[17409 & 177] = this.Method_1224();
            arrd2[-29573 & 20486] = this.Field_1072;
            class_1699.Method_1744("Motion", this.Method_1229(arrd2));
            float[] arrf = new float[19 & -32562];
            arrf[1188 & -3559] = this.Field_1079;
            arrf[22533 & 8201] = this.Field_1093;
            class_1699.Method_1744("Rotation", this.Method_1185(arrf));
            class_1699.Method_1704("FallDistance", this.Field_1097);
            class_1699.Method_1731("Fire", (short)this.Field_1128);
            class_1699.Method_1731("Air", (short)this.Method_1261());
            class_1699.Method_1706("OnGround", this.Method_1244());
            class_1699.Method_1739("Dimension", this.Field_1132);
            class_1699.Method_1706("Invulnerable", this.Field_1153);
            class_1699.Method_1739("PortalCooldown", this.Field_1096);
            class_1699.Method_1718("UUIDMost", this.Method_1194().getMostSignificantBits());
            class_1699.Method_1718("UUIDLeast", this.Method_1194().getLeastSignificantBits());
            if (this.Method_1238() != null && this.Method_1238().length() > 0) {
                class_1699.Method_1702("CustomName", this.Method_1238());
                class_1699.Method_1706("CustomNameVisible", this.Method_1223());
            }
            this.Field_1074.Method_8725(class_1699);
            if (this.Method_1157()) {
                class_1699.Method_1706("Silent", this.Method_1157());
            }
            this.Method_1291(class_1699);
            if (this.Field_1095 != null && this.Field_1095.Method_1198(class_16992 = new Class_1699())) {
                class_1699.Method_1744("Riding", class_16992);
            }
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Saving entity NBT");
            Class_13220 class_13220 = class_13268.Method_13280("Entity being saved");
            this.Method_1284(class_13220);
            throw new Class_1809(class_13268);
        }
    }

    public Class_3443 Method_1264(Class_1956 class_1956, int n, float f) {
        return this.Method_1279(new Class_23823(class_1956, n, -16382 & 7877), f);
    }

    public float Method_1265() {
        return Field_1086.Method_3850();
    }

    public final float Method_1266() {
        if (this.Field_1087 == null) {
            return this.Field_1136;
        }
        return this.Field_1087.Method_3850();
    }

    public void Method_1267(boolean bl) {
        this.Field_1070.Method_32704(99 & 1935, (byte)(bl ? 17027 & 1317 : 114 & 17409));
    }

    public Class_1061 Method_1268() {
        return this;
    }

    public boolean Method_1269(int n, Class_23823 class_23823) {
        return (-31415 & 6) != 0;
    }

    public boolean Method_1270(double d) {
        double d2 = this.Method_1315().Method_11025();
        if (Double.isNaN(d2)) {
            d2 = 1.0;
        }
        return (d < (d2 = d2 * (0.13924050632911392 * 459.6363636363637) * this.Field_1141) * d2 ? -24447 & 3105 : 9538 & -32623) != 0;
    }

    public final double Method_1271() {
        return this.Field_1100;
    }

    public int Method_1272(float f) {
        int n;
        int n2;
        Class_570 class_570 = (Class_570)this.Field_1089;
        int n3 = Class_13337.Method_13371(this.Field_1130);
        return class_570.Method_619(n3, n = Class_13337.Method_13371(this.Method_1324() + (double)this.Method_1357()), n2 = Class_13337.Method_13371(this.Field_1106)) ? class_570.Method_592(n3, n, n2, 29192 & 0) : 24874 & 1108;
    }

    public void Method_1273(Class_626 class_626) {
    }

    public void Method_1274() {
        if (this.Field_1095.Field_1110) {
            this.Field_1095 = null;
        } else {
            this.Field_1071 = 0.0;
            this.Method_1161(0.0);
            this.Field_1072 = 0.0;
            this.Method_1181();
            if (this.Field_1095 != null) {
                this.Field_1095.Method_1295();
                this.Field_1091 += (double)(this.Field_1095.Field_1079 - this.Field_1095.Field_1145);
                this.Field_1127 += (double)(this.Field_1095.Field_1093 - this.Field_1095.Field_1078);
                while (this.Field_1091 >= 285.88235294117646 * 0.6296296296296297) {
                    this.Field_1091 -= 305.08474576271186 * 1.18;
                }
                while (this.Field_1091 < -504.0 * 0.35714285714285715) {
                    this.Field_1091 += 387.6923076923077 * 0.9285714285714286;
                }
                while (this.Field_1127 >= 241.27659574468083 * 0.746031746031746) {
                    this.Field_1127 -= 0.14457831325301204 * 2490.0;
                }
                while (this.Field_1127 < -176.3265306122449 * 1.0208333333333333) {
                    this.Field_1127 += 1091.25 * 0.32989690721649484;
                }
                double d = this.Field_1091 * (14.5 * 0.034482758620689655);
                double d2 = this.Field_1127 * (2.0 * 0.25);
                float f = 12.666666f * 0.7894737f;
                if (d > (double)f) {
                    d = f;
                }
                if (d < (double)(-f)) {
                    d = -f;
                }
                if (d2 > (double)f) {
                    d2 = f;
                }
                if (d2 < (double)(-f)) {
                    d2 = -f;
                }
                this.Field_1091 -= d;
                this.Field_1127 -= d2;
            }
        }
    }

    public Class_1061[] Method_1275() {
        return null;
    }

    public Class_1061(Class_283 class_283) {
        int n = Field_1103;
        Field_1103 = n + (4417 & 8195);
        this.Field_1124 = n;
        this.Field_1141 = 1.0;
        this.Field_1107 = Field_1117;
        if (this instanceof Class_626) {
            this.Method_1345(Field_1151.Method_3850());
            this.Method_1190(Field_1146.Method_3850());
            this.Field_1087 = new Class_3839(Field_1151.Method_3850(), Class_2205.Field_2216);
            this.Field_1075 = new Class_3839(Field_1146.Method_3850(), Class_2205.Field_2216);
            if (this instanceof Class_1378) {
                this.Field_1137 = new Class_3839(0.0f, Class_2205.Field_2245);
                ((Class_1378)this).Field_1401 = new Class_2190(0.0, Class_2205.Field_2209);
                ((Class_1378)this).Field_1401.Field_2193 = -4048 & 128;
            }
        } else {
            this.Method_1345(Field_1151.Method_3849());
            this.Method_1190(Field_1146.Method_3849());
        }
        this.Method_1241(0.0);
        this.Field_1143 = 1027 & -10075;
        this.Field_1122 = new Random(Class_18.Field_113 ^ (long)this.Field_1124);
        this.Field_1131 = 17025 & 8485;
        this.Field_1133 = 6849 & 35;
        this.Field_1108 = Class_13337.Method_13390(this.Field_1122);
        this.Field_1074 = new Class_8719();
        this.Field_1089 = class_283;
        this.Method_1349(0.0, 0.0, 0.0);
        if (class_283 != null) {
            this.Field_1132 = class_283.Field_284.Method_18379();
        }
        this.Field_1070 = new Class_32695(this);
        this.Field_1070.Method_32721(19280 & -32726, (byte)(5136 & 0));
        this.Field_1070.Method_32721(-32767 & 541, (short)(19262 & 300));
        this.Field_1070.Method_32721(8715 & 3107, (byte)(1952 & -30718));
        this.Field_1070.Method_32721(-8057 & 1818, "");
        this.Field_1070.Method_32721(20628 & 8228, (byte)(-24572 & 16744));
        this.Method_1216();
    }

    public boolean Method_1276() {
        return this.Method_1164(1313 & 18505);
    }

    public void Method_1277(float f, float f2) {
        float f3 = this.Field_1093;
        float f4 = this.Field_1079;
        this.Field_1079 = (float)((double)this.Field_1079 + (double)f * (2.5 * 0.06));
        this.Field_1093 = (float)((double)this.Field_1093 - (double)f2 * (4.7 * 0.031914893617021274));
        this.Field_1093 = Class_13337.Method_13360(this.Field_1093, -42.47191f * 2.1190476f, 1.2857143f * 70.0f);
        this.Field_1078 += this.Field_1093 - f3;
        this.Field_1145 += this.Field_1079 - f4;
    }

    public void Method_1278(int n) {
        if (!this.Field_1089.Field_306 && !this.Field_1110) {
            this.Field_1089.Field_310.Method_2789("changeDimension");
            Class_2457 class_2457 = Class_2457.Method_2530();
            int n2 = this.Field_1132;
            Class_2651 class_2651 = class_2457.Method_2550(n2);
            Class_2651 class_26512 = class_2457.Method_2550(n);
            this.Field_1132 = n;
            if (n2 == (-7159 & 21) && n == (24899 & 61)) {
                class_26512 = class_2457.Method_2550(16387 & -23520);
                this.Field_1132 = 16516 & -29088;
            }
            this.Field_1089.Method_474(this);
            this.Field_1110 = 2112 & 535;
            this.Field_1089.Field_310.Method_2789("reposition");
            class_2457.Method_2616().Method_3104(this, n2, class_2651, class_26512);
            this.Field_1089.Field_310.Method_2783("reloading");
            Class_1061 class_1061 = Class_15516.Method_15559(Class_15516.Method_15540(this), class_26512);
            if (class_1061 != null) {
                class_1061.Method_1316(this);
                if (n2 == (-31731 & 17121) && n == (-8095 & 5)) {
                    Class_4751 class_4751 = this.Field_1089.Method_406(class_26512.\u0000strictfp());
                    class_1061.Method_1167(class_4751, class_1061.Field_1079, class_1061.Field_1093);
                }
                class_26512.\u0000strictfp(class_1061);
            }
            this.Field_1110 = 2305 & -11605;
            this.Field_1089.Field_310.Method_2790();
            class_2651.Method_2677();
            class_26512.Method_2677();
            this.Field_1089.Field_310.Method_2790();
        }
    }

    public Class_3443 Method_1279(Class_23823 class_23823, float f) {
        if (class_23823.Field_23826 != 0 && class_23823.Method_23844() != null) {
            Class_3443 class_3443 = new Class_3443(this.Field_1089, this.Field_1130, this.Method_1324() + (double)f, this.Field_1106, class_23823);
            class_3443.Method_3455();
            this.Field_1089.Method_350(class_3443);
            return class_3443;
        }
        return null;
    }

    protected void Method_1280(float f, float f2) {
        if (f != this.Method_1266() || f2 != this.Method_1287()) {
            float f3 = this.Method_1266();
            this.Method_1345(f);
            this.Method_1190(f2);
            this.Method_1171(new Class_10997(this.Method_1315().Field_10999, this.Method_1315().Field_11000, this.Method_1315().Field_11001, this.Method_1315().Field_10999 + (double)this.Method_1266(), this.Method_1315().Field_11000 + (double)this.Method_1287(), this.Method_1315().Field_11001 + (double)this.Method_1266()));
            if (this.Method_1266() > f3 && !this.Field_1133 && !this.Field_1089.Field_306) {
                this.Method_1348(f3 - this.Method_1266(), 0.0, f3 - this.Method_1266());
            }
        }
    }

    public double Method_1281() {
        return 0.0;
    }

    public boolean Method_1282(Class_1699 class_1699) {
        String string = this.Method_1182();
        if (!this.Field_1110 && string != null && this.Field_1099 == null) {
            class_1699.Method_1702("id", string);
            this.Method_1263(class_1699);
            return (17 & -16249) != 0;
        }
        return (2064 & 20840) != 0;
    }

    public boolean Method_1283(Object object) {
        return (object instanceof Class_1061 ? (((Class_1061)object).Field_1124 == this.Field_1124 ? 18459 & 1697 : 6340 & 17409) : -19136 & 18596) != 0;
    }

    public void Method_1284(Class_13220 class_13220) {
        class_13220.Method_13232("Entity Type", new Class_7442(this));
        class_13220.Method_13231("Entity ID", this.Field_1124);
        class_13220.Method_13232("Entity Name", new Class_27613(this));
        Object[] arrobject = new Object[8779 & 1283];
        arrobject[8312 & -30204] = this.Field_1130;
        arrobject[-14133 & 1025] = this.Method_1324();
        arrobject[1090 & 562] = this.Field_1106;
        class_13220.Method_13231("Entity's Exact location", String.format("%.2f, %.2f, %.2f", arrobject));
        class_13220.Method_13231("Entity's Block location", Class_13220.Method_13236(Class_13337.Method_13371(this.Field_1130), Class_13337.Method_13371(this.Method_1324()), Class_13337.Method_13371(this.Field_1106)));
        Object[] arrobject2 = new Object[-30077 & 4147];
        arrobject2[4293 & -7928] = this.Field_1071;
        arrobject2[5233 & -30207] = this.Method_1224();
        arrobject2[18706 & -27569] = this.Field_1072;
        class_13220.Method_13231("Entity's Momentum", String.format("%.2f, %.2f, %.2f", arrobject2));
        class_13220.Method_13232("Entity's Rider", new Class_41237(this));
        class_13220.Method_13232("Entity's Vehicle", new Class_33473(this));
    }

    public boolean Method_1285() {
        return (!this.Field_1110 ? -32735 & 9217 : 8314 & 4229) != 0;
    }

    public void Method_1286(float f) {
        if (this.Field_1137 == null) {
            this.Field_1119 = f;
        } else {
            this.Field_1137.Method_3854(f);
        }
    }

    public final float Method_1287() {
        if (this.Field_1075 == null) {
            return this.Field_1113;
        }
        return this.Field_1075.Method_3850();
    }

    public void Method_1288(String string, float f, float f2) {
        if (!this.Method_1157()) {
            this.Field_1089.Method_519(this, string, f, f2);
        }
    }

    public float Method_1289(float f) {
        return this.Method_1357();
    }

    protected void Method_1290() {
        this.Field_1140 = -23423 & 18457;
    }

    protected abstract void Method_1291(Class_1699 var1);

    public void Method_1292(Class_1061 class_1061) {
        double d;
        double d2;
        double d3;
        if (class_1061.Field_1099 != this && class_1061.Field_1095 != this && !class_1061.Field_1094 && !this.Field_1094 && (d3 = Class_13337.Method_13358(d2 = class_1061.Field_1130 - this.Field_1130, d = class_1061.Field_1106 - this.Field_1106)) >= 2.9523809523809526 * 0.0033870966984860355) {
            d3 = Class_13337.Method_13347(d3);
            d2 /= d3;
            d /= d3;
            double d4 = 1.0 / d3;
            if (d4 > 1.0) {
                d4 = 1.0;
            }
            d2 *= d4;
            d *= d4;
            d2 *= 0.19117647343698668 * 0.26153846153846155;
            d *= 0.13437500200234354 * 0.37209302325581395;
            d2 *= (double)(1.0f - this.Field_1098);
            d *= (double)(1.0f - this.Field_1098);
            if (this.Field_1099 == null) {
                this.Method_1189(-d2, 0.0, -d);
            }
            if (class_1061.Field_1099 == null) {
                class_1061.Method_1189(d2, 0.0, d);
            }
        }
    }

    public void Method_1293() {
    }

    private void Method_1294() {
        this.Field_1130 = (this.Method_1315().Field_10999 + this.Method_1315().Field_11002) * (double)Field_1118.Method_3850();
        this.Method_1241(this.Method_1315().Field_11000);
        this.Field_1106 = (this.Method_1315().Field_11001 + this.Method_1315().Field_11003) * (double)Field_1118.Method_3850();
    }

    public void Method_1295() {
        if (this.Field_1099 != null) {
            this.Field_1099.Method_1349(this.Field_1130, this.Method_1324() + this.Method_1333() + this.Field_1099.Method_1319(), this.Field_1106);
        }
    }

    public Vec3 Method_1296(float f) {
        if (f == 1.0f) {
            return this.Method_1196(this.Field_1093, this.Field_1079);
        }
        float f2 = this.Field_1078 + (this.Field_1093 - this.Field_1078) * f;
        float f3 = this.Field_1145 + (this.Field_1079 - this.Field_1145) * f;
        return this.Method_1196(f2, f3);
    }

    public boolean Method_1297(Class_626 class_626) {
        return (8 & 9732) != 0;
    }

    public double Method_1298(double d) {
        return 0.0;
    }

    protected boolean Method_1299() {
        return (26929 & -31731) != 0;
    }

    public boolean Method_1300() {
        int n = this.Field_1089 != null && this.Field_1089.Field_306 ? 37 & -31343 : -31480 & 30790;
        return (!this.Field_1109 && (this.Field_1128 > 0 || n != 0 && this.Method_1164(6144 & -31541)) ? 5123 & -32639 : 979 & 4140) != 0;
    }

    public boolean Method_1301(Class_32797 class_32797) {
        return (this.Field_1153 && class_32797 != Class_32797.Field_32802 && !class_32797.Method_32867() ? 2083 & -31731 : 8 & 6784) != 0;
    }

    public Vec3 Method_1302() {
        return null;
    }

    public void Method_1303(Class_859 class_859) {
    }

    public float Method_1304(float f) {
        return 0.0f;
    }

    public void Method_1305(double d, double d2, double d3) {
        this.Field_1071 = d;
        this.Method_1161(d2);
        this.Field_1072 = d3;
    }

    protected String Method_1306() {
        return "game.neutral.swim.splash";
    }

    protected Class_44868 Method_1307() {
        Class_1699 class_1699 = new Class_1699();
        String string = Class_15516.Method_15540(this);
        class_1699.Method_1702("id", this.Method_1194().toString());
        if (string != null) {
            class_1699.Method_1702("type", string);
        }
        class_1699.Method_1702("name", this.Method_1202());
        return new Class_44868(Class_14202.Field_14207, new Class_2840(class_1699.Method_1729()));
    }

    public void Method_1308() {
        this.Field_1128 = 2592 & 17676;
    }

    public void Method_1309(boolean bl) {
        this.Method_1364(23309 & -32730, bl);
    }

    public boolean Method_1310() {
        return (66 & 16408) != 0;
    }

    public int Method_1311() {
        return this.Field_1124;
    }

    public boolean Method_1312() {
        double d = Field_1149.Method_2199();
        if (this.Field_1089.Method_382(this.Method_1315().Method_11017(0.0, 1.3214285714285714 * -0.3027027072133245, 0.0).Method_11012(d, d, d), Class_3713.Field_3734, this)) {
            if (!this.Field_1067 && !this.Field_1133) {
                this.Method_1208();
            }
            this.Field_1097 = 0.0f;
            this.Field_1067 = 7169 & 25409;
            this.Field_1128 = -24274 & 18945;
        } else {
            this.Field_1067 = 3587 & 172;
        }
        return this.Field_1067;
    }

    public boolean Method_1313() {
        return this.Method_1223();
    }

    public boolean Method_1314() {
        return this.Field_1067;
    }

    public Class_10997 Method_1315() {
        return this.Field_1107;
    }

    public void Method_1316(Class_1061 class_1061) {
        Class_1699 class_1699 = new Class_1699();
        class_1061.Method_1263(class_1699);
        this.Method_1318(class_1699);
        this.Field_1096 = class_1061.Field_1096;
        this.Field_1065 = class_1061.Field_1065;
        this.Field_1116 = class_1061.Field_1116;
        this.Field_1064 = class_1061.Field_1064;
    }

    public void Method_1317(float f) {
    }

    public void Method_1318(Class_1699 class_1699) {
        try {
            Class_1758 class_1758 = class_1699.Method_1735("Pos", -22522 & 4102);
            Class_1758 class_17582 = class_1699.Method_1735("Motion", 18967 & 8422);
            Class_1758 class_17583 = class_1699.Method_1735("Rotation", 1407 & 5);
            this.Field_1071 = class_17582.Method_1769(18439 & 8640);
            this.Method_1161(class_17582.Method_1769(4097 & 3563));
            this.Field_1072 = class_17582.Method_1769(16403 & 14466);
            if (Math.abs(this.Field_1071) > 8.81578947368421 * 1.1343283582089552) {
                this.Field_1071 = 0.0;
            }
            if (Math.abs(this.Method_1224()) > 13.548387096774192 * 0.7380952380952381) {
                this.Method_1161(0.0);
            }
            if (Math.abs(this.Field_1072) > 0.8085106382978723 * 12.36842105263158) {
                this.Field_1072 = 0.0;
            }
            this.Field_1126 = this.Field_1130 = class_1758.Method_1769(0 & 17472);
            this.Method_1360(this.Field_1130);
            this.Field_1102 = class_1758.Method_1769(8193 & 533);
            this.Method_1254(this.Field_1102);
            this.Method_1241(class_1758.Method_1769(16385 & 6243));
            this.Field_1125 = this.Field_1106 = class_1758.Method_1769(1202 & 14403);
            this.Method_1339(this.Field_1106);
            this.Field_1145 = this.Field_1079 = class_17583.Method_1770(516 & 8224);
            this.Field_1078 = this.Field_1093 = class_17583.Method_1770(11 & 8837);
            this.Method_1200(this.Field_1079);
            this.Method_1317(this.Field_1079);
            this.Field_1097 = class_1699.Method_1745("FallDistance");
            this.Field_1128 = class_1699.Method_1726("Fire");
            this.Method_1218(class_1699.Method_1726("Air"));
            this.Method_1213(class_1699.Method_1733("OnGround"));
            this.Field_1132 = class_1699.Method_1738("Dimension");
            this.Field_1153 = class_1699.Method_1733("Invulnerable");
            this.Field_1096 = class_1699.Method_1738("PortalCooldown");
            if (class_1699.Method_1715("UUIDMost", 1452 & 6230) && class_1699.Method_1715("UUIDLeast", 21 & 3948)) {
                this.Field_1108 = new UUID(class_1699.Method_1705("UUIDMost"), class_1699.Method_1705("UUIDLeast"));
            } else if (class_1699.Method_1715("UUID", 41 & -12280)) {
                this.Field_1108 = UUID.fromString(class_1699.Method_1708("UUID"));
            }
            this.Method_1349(this.Field_1130, this.Method_1324(), this.Field_1106);
            this.Method_1236(this.Field_1079, this.Field_1093);
            if (class_1699.Method_1715("CustomName", 17464 & 2252) && class_1699.Method_1708("CustomName").length() > 0) {
                this.Method_1256(class_1699.Method_1708("CustomName"));
            }
            this.Method_1267(class_1699.Method_1733("CustomNameVisible"));
            this.Field_1074.Method_8724(class_1699);
            this.Method_1203(class_1699.Method_1733("Silent"));
            this.Method_1351(class_1699);
            if (this.Method_1299()) {
                this.Method_1349(this.Field_1130, this.Method_1324(), this.Field_1106);
            }
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Loading entity NBT");
            Class_13220 class_13220 = class_13268.Method_13280("Entity being loaded");
            this.Method_1284(class_13220);
            throw new Class_1809(class_13268);
        }
    }

    public double Method_1319() {
        return 0.0;
    }

    public void Method_1320() {
    }

    public double Method_1321() {
        if (this.Field_1068) {
            return this.Method_1281();
        }
        return this.Field_1144;
    }

    public float Method_1322(Class_1061 class_1061) {
        float f = (float)(this.Field_1130 - class_1061.Field_1130);
        float f2 = (float)(this.Method_1324() - class_1061.Method_1324());
        float f3 = (float)(this.Field_1106 - class_1061.Field_1106);
        return Class_13337.Method_13388(f * f + f2 * f2 + f3 * f3);
    }

    public void Method_1323() {
        this.Field_1089.Field_310.Method_2789("entityBaseTick");
        if (this.Field_1095 != null && this.Field_1095.Field_1110) {
            this.Field_1095 = null;
        }
        this.Field_1148 = this.Field_1152;
        this.Method_1360(this.Field_1130);
        this.Method_1254(this.Method_1324());
        this.Method_1339(this.Field_1106);
        this.Field_1078 = this.Field_1093;
        this.Field_1145 = this.Field_1079;
        if (!this.Field_1089.Field_306 && this.Field_1089 instanceof Class_2651) {
            this.Field_1089.Field_310.Method_2789("portal");
            Class_2457 class_2457 = ((Class_2651)this.Field_1089).Method_2706();
            int n = this.Method_1342();
            if (this.Field_1135) {
                if (class_2457.Method_2523()) {
                    if (this.Field_1095 == null) {
                        int n2 = this.Field_1138;
                        this.Field_1138 = n2 + (385 & -31727);
                        if (n2 >= n) {
                            this.Field_1138 = n;
                            this.Field_1096 = this.Method_1245();
                            int n3 = this.Field_1089.Field_284.Method_18379() == (-1 & -1) ? 10624 & 4679 : -1 & -1;
                            this.Method_1278(n3);
                        }
                    }
                    this.Field_1135 = 4608 & -4864;
                }
            } else {
                if (this.Field_1138 > 0) {
                    this.Field_1138 -= 17484 & -23786;
                }
                if (this.Field_1138 < 0) {
                    this.Field_1138 = -32768 & 17378;
                }
            }
            if (this.Field_1096 > 0) {
                this.Field_1096 -= 2323 & 101;
            }
            this.Field_1089.Field_310.Method_2790();
        }
        this.Method_1188();
        this.Method_1312();
        if (this.Field_1089.Field_306) {
            this.Field_1128 = 16484 & -23549;
        } else if (this.Field_1128 > 0) {
            if (this.Field_1109) {
                this.Field_1128 -= 16645 & -32748;
                if (this.Field_1128 < 0) {
                    this.Field_1128 = 64 & 4627;
                }
            } else {
                if (this.Field_1128 % (16988 & -20332) == 0) {
                    this.Method_1340(Class_32797.Field_32815, 1.0f);
                }
                this.Field_1128 -= 2563 & -32627;
            }
        }
        if (this.Method_1162()) {
            this.Method_1176();
            this.Field_1097 *= 2.2162163f * 0.22560975f;
        }
        if (this.Method_1324() < -30.608695652173914 * 2.090909090909091) {
            this.Method_1347();
        }
        if (!this.Field_1089.Field_306) {
            this.Method_1364(128 & 34, (this.Field_1128 > 0 ? 17537 & 8563 : -30455 & 17616) != 0);
        }
        this.Field_1133 = -31224 & 18726;
        this.Field_1089.Field_310.Method_2790();
    }

    public double Method_1324() {
        if (this.Field_1068) {
            return this.Method_1252();
        }
        return this.Field_1144;
    }

    public void Method_1325(Class_1061 class_1061) {
        this.Field_1074.Method_8727(class_1061.Method_1201());
    }

    public boolean Method_1326() {
        return (this.Field_1095 != null ? 20641 & -32753 : -32060 & 5409) != 0;
    }

    public void Method_1327(int n) {
        int n2 = n * (1054 & 2324);
        if (this.Field_1128 < (n2 = Class_33196.Method_33206(this, n2))) {
            this.Field_1128 = n2;
        }
    }

    protected void Method_1328() {
        double d = 0.1276595744680851 * 0.007833333333333335;
        Class_4810 class_4810 = Field_1073.Method_4455(this.Method_1315().Field_10999 + d, this.Method_1315().Field_11000 + d, this.Method_1315().Field_11001 + d);
        Class_4810 class_48102 = Field_1115.Method_4455(this.Method_1315().Field_11002 - d, this.Method_1315().Field_10998 - d, this.Method_1315().Field_11003 - d);
        Class_4810 class_48103 = (Class_4810)Field_1142.get();
        if (this.Field_1089.Method_365(class_4810, class_48102)) {
            for (int i = class_4810.\u0000= final(); i <= class_48102.\u0000= final(); ++i) {
                for (int j = class_4810.\u0000, `(); j <= class_48102.\u0000, `(); ++j) {
                    for (int k = class_4810.\u0000strictfp(); k <= class_48102.\u0000strictfp(); ++k) {
                        class_48103.Method_4816(i, j, k);
                        Class_3677 class_3677 = this.Field_1089.\u0000strictfp((Class_4751)class_48103);
                        try {
                            class_3677.Method_3688().Method_3405(this.Field_1089, class_48103, class_3677, this);
                            continue;
                        }
                        catch (Throwable throwable) {
                            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Colliding entity with block");
                            Class_13220 class_13220 = class_13268.Method_13280("Block being collided with");
                            Class_13220.Method_13234(class_13220, class_48103, class_3677);
                            throw new Class_1809(class_13268);
                        }
                    }
                }
            }
        }
    }

    public void Method_1329(float f, float f2, float f3) {
        float f4 = f * f + f2 * f2;
        if (f4 >= 2.5555555E-4f * 0.39130434f) {
            if ((f4 = Class_13337.Method_13388(f4)) < 1.0f) {
                f4 = 1.0f;
            }
            f4 = f3 / f4;
            float f5 = Class_13337.Method_13370(this.Field_1079 * (34.03392f * 0.092307694f) / (227.8125f * 0.79012346f));
            float f6 = Class_13337.Method_13350(this.Field_1079 * (10.142858f * 0.3097345f) / (0.78723407f * 228.64864f));
            this.Field_1071 += (double)((f *= f4) * f6 - (f2 *= f4) * f5);
            this.Field_1072 += (double)(f2 * f6 + f * f5);
        }
    }

    protected void Method_1330(Class_4751 class_4751, Class_3238 class_3238) {
        Class_3610 class_3610 = class_3238.Field_3276;
        if (this.Field_1089.Method_375(class_4751.Method_4769()).Method_3442() == Class_9265.Field_9458) {
            class_3610 = Class_9265.Field_9458.Field_3276;
            this.Method_1288(class_3610.Method_3619(), class_3610.Method_3618() * (5.352941f * 0.02802198f), class_3610.Method_3615());
        } else if (!class_3238.Method_3373().Method_3758()) {
            this.Method_1288(class_3610.Method_3619(), class_3610.Method_3618() * (1.6818181f * 0.089189194f), class_3610.Method_3615());
        }
    }

    public void Method_1331() {
        this.Field_1076 = -11647 & 31;
        this.Field_1097 = 0.0f;
    }

    public Vec3 Method_1332() {
        return this.Field_1116;
    }

    public double Method_1333() {
        return (double)this.Method_1287() * (0.15463917525773196 * 4.85);
    }

    public boolean Method_1334() {
        return (1024 & 4880) != 0;
    }

    public float Method_1335() {
        if (this.Field_1137 == null) {
            return this.Field_1119;
        }
        return this.Field_1137.Method_3850();
    }

    public boolean Method_1336(Class_3713 class_3713) {
        int n;
        int n2;
        double d = this.Method_1324() + (double)this.Method_1357();
        int n3 = Class_13337.Method_13371(this.Field_1130);
        Class_3436 class_3436 = this.Field_1089.Method_413(n3, n2 = Class_13337.Method_13371(d), n = Class_13337.Method_13371(this.Field_1106));
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_3238.Method_3373() == class_3713) {
            float f = Class_4415.Method_4426(class_3436.Method_3442().Method_3434(class_3436)) - 0.07936508f * 1.4f;
            float f2 = (float)(n2 + (21 & 1569)) - f;
            int n4 = d < (double)f2 ? 16545 & -22695 : -32575 & 17676;
            return (n4 == 0 && this instanceof Class_626 ? 8704 & 5441 : n4) != 0;
        }
        return (608 & 12421) != 0;
    }

    public double Method_1337(double d, double d2, double d3) {
        double d4 = this.Field_1130 - d;
        double d5 = this.Method_1324() - d2;
        double d6 = this.Field_1106 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    protected void Method_1338(double d, boolean bl, Class_3238 class_3238, Class_4751 class_4751) {
        if (bl) {
            if (this.Field_1097 > 0.0f) {
                if (class_3238 != null) {
                    class_3238.Method_3299(this.Field_1089, class_4751, this, this.Field_1097);
                } else {
                    this.Method_1237(this.Field_1097, 1.0f);
                }
                this.Field_1097 = 0.0f;
            }
        } else if (d < 0.0) {
            this.Field_1097 = (float)((double)this.Field_1097 - d);
        }
    }

    public final void Method_1339(double d) {
        this.Field_1100 = d;
    }

    public boolean Method_1340(Class_32797 class_32797, float f) {
        if (this.Method_1301(class_32797)) {
            return (29256 & 2068) != 0;
        }
        this.Method_1290();
        return (4738 & 16644) != 0;
    }

    public void Method_1341(int n, Class_23823 class_23823) {
    }

    public int Method_1342() {
        return -12256 & 3088;
    }

    public boolean Method_1343() {
        return this.Method_1300();
    }

    public boolean Method_1344() {
        return (-8131 & 1408) != 0;
    }

    public final void Method_1345(float f) {
        if (this.Field_1087 == null) {
            this.Field_1136 = f;
        } else {
            this.Field_1087.Method_3854(f);
        }
    }

    private void Method_1346(Class_10997 class_10997) {
        this.Field_1107.Method_11010(class_10997);
    }

    protected void Method_1347() {
        this.Method_1166();
    }

    public void Method_1348(double d, double d2, double d3) {
        if (this.Field_1094) {
            this.Method_1171(this.Method_1315().Method_11021(d, d2, d3));
            this.Method_1294();
        } else {
            Object object;
            int n;
            int n2;
            Object object2;
            Class_3238 class_3238;
            int n3;
            this.Field_1089.Field_310.Method_2789("move");
            double d4 = this.Field_1130;
            double d5 = this.Method_1324();
            double d6 = this.Field_1106;
            if (this.Field_1076) {
                this.Field_1076 = -30206 & 13312;
                d *= 0.14285714285714285 * 1.75;
                d2 *= 0.012500000186264515 * 4.0;
                d3 *= 1.0 * 0.25;
                this.Field_1071 = 0.0;
                this.Method_1161(0.0);
                this.Field_1072 = 0.0;
            }
            double d7 = d;
            double d8 = d2;
            double d9 = d3;
            int n4 = this.Method_1244() && this.Method_1276() && this instanceof Class_626 ? 18473 & -27385 : -24384 & 1546;
            int n5 = this instanceof Class_42218 || this instanceof Class_5813 ? 19 & 169 : -26267 & 8344;
            int n6 = n3 = n5 == 0 ? -24255 & 1029 : 402 & 1036;
            if (n4 != 0) {
                double d10 = 0.013636363636363637 * 3.6666666666666665;
                while (d != 0.0 && this.Field_1089.Method_426(this, this.Method_1315().Method_11021(d, 0.9078947368421053 * -1.1014492753623188, 0.0), n3 != 0).isEmpty()) {
                    d = d < d10 && d >= -d10 ? 0.0 : (d > 0.0 ? (d -= d10) : (d += d10));
                    d7 = d;
                }
                while (d3 != 0.0 && this.Field_1089.Method_426(this, this.Method_1315().Method_11021(0.0, 1.5454545454545454 * -0.6470588235294118, d3), n3 != 0).isEmpty()) {
                    d3 = d3 < d10 && d3 >= -d10 ? 0.0 : (d3 > 0.0 ? (d3 -= d10) : (d3 += d10));
                    d9 = d3;
                }
                while (d != 0.0 && d3 != 0.0 && this.Field_1089.Method_426(this, this.Method_1315().Method_11021(d, 0.08928571428571429 * -11.2, d3), n3 != 0).isEmpty()) {
                    d = d < d10 && d >= -d10 ? 0.0 : (d > 0.0 ? (d -= d10) : (d += d10));
                    d7 = d;
                    d3 = d3 < d10 && d3 >= -d10 ? 0.0 : (d3 > 0.0 ? (d3 -= d10) : (d3 += d10));
                    d9 = d3;
                }
            }
            Class_10997 class_10997 = (Class_10997)Field_1063.get();
            ArrayList arrayList = this.Field_1089.Method_426(this, this.Method_1315().Method_11008(d, d2, d3, class_10997), n3 != 0);
            Class_10997 class_109972 = this.Method_1191((Class_10997)Field_1082.get());
            for (n = 28817 & 36; n < arrayList.size(); ++n) {
                d2 = ((Class_10997)arrayList.get(n)).Method_11009(this.Method_1315(), d2);
            }
            this.Field_1107.Method_11023(0.0, d2, 0.0);
            n = this.Method_1244() || d8 != d2 && d8 < 0.0 ? 8203 & 17925 : -30692 & 64;
            for (n2 = -32696 & 13968; n2 < arrayList.size(); ++n2) {
                d = ((Class_10997)arrayList.get(n2)).Method_11018(this.Method_1315(), d);
            }
            this.Field_1107.Method_11023(d, 0.0, 0.0);
            for (n2 = 16464 & 8616; n2 < arrayList.size(); ++n2) {
                d3 = ((Class_10997)arrayList.get(n2)).Method_11026(this.Method_1315(), d3);
            }
            this.Field_1107.Method_11023(0.0, 0.0, d3);
            if (this.Method_1335() > 0.0f && n != 0 && (d7 != d || d9 != d3)) {
                double d11 = d;
                double d12 = d2;
                double d13 = d3;
                object = this.Method_1191((Class_10997)Field_1129.get());
                this.Method_1346(class_109972);
                d2 = this.Method_1335();
                object2 = this.Field_1089.Method_461(this, this.Method_1315().Method_11005(d7, d2, d9));
                Class_10997 class_109973 = this.Method_1191((Class_10997)Field_1081.get());
                Class_10997 class_109974 = class_109973.Method_11005(d7, 0.0, d9);
                double d14 = d2;
                for (int i = 20 & -27647; i < object2.size(); ++i) {
                    d14 = ((Class_10997)object2.get(i)).Method_11009(class_109974, d14);
                }
                class_109973 = class_109973.Method_11021(0.0, d14, 0.0);
                double d15 = d7;
                for (int i = 18451 & 5376; i < object2.size(); ++i) {
                    d15 = ((Class_10997)object2.get(i)).Method_11018(class_109973, d15);
                }
                class_109973 = class_109973.Method_11021(d15, 0.0, 0.0);
                double d16 = d9;
                for (int i = -30686 & 16664; i < object2.size(); ++i) {
                    d16 = ((Class_10997)object2.get(i)).Method_11026(class_109973, d16);
                }
                class_109973 = class_109973.Method_11021(0.0, 0.0, d16);
                Class_10997 class_109975 = this.Method_1315();
                double d17 = d2;
                for (int i = 4616 & 1440; i < object2.size(); ++i) {
                    d17 = ((Class_10997)object2.get(i)).Method_11009(class_109975, d17);
                }
                class_109975 = class_109975.Method_11021(0.0, d17, 0.0);
                double d18 = d7;
                for (int i = -32502 & 10272; i < object2.size(); ++i) {
                    d18 = ((Class_10997)object2.get(i)).Method_11018(class_109975, d18);
                }
                class_109975 = class_109975.Method_11021(d18, 0.0, 0.0);
                double d19 = d9;
                for (int i = 10272 & 4627; i < object2.size(); ++i) {
                    d19 = ((Class_10997)object2.get(i)).Method_11026(class_109975, d19);
                }
                class_109975 = class_109975.Method_11021(0.0, 0.0, d19);
                double d20 = d15 * d15 + d16 * d16;
                double d21 = d18 * d18 + d19 * d19;
                if (d20 > d21) {
                    d = d15;
                    d3 = d16;
                    d2 = -d14;
                    this.Method_1346(class_109973);
                } else {
                    d = d18;
                    d3 = d19;
                    d2 = -d17;
                    this.Method_1346(class_109975);
                }
                for (int i = -30683 & 5440; i < object2.size(); ++i) {
                    d2 = ((Class_10997)object2.get(i)).Method_11009(this.Method_1315(), d2);
                }
                this.Method_1346(this.Method_1315().Method_11021(0.0, d2, 0.0));
                if (d11 * d11 + d13 * d13 >= d * d + d3 * d3) {
                    d = d11;
                    d2 = d12;
                    d3 = d13;
                    this.Method_1346((Class_10997)object);
                }
            }
            this.Field_1089.Field_310.Method_2790();
            this.Field_1089.Field_310.Method_2789("rest");
            this.Method_1294();
            this.Field_1080 = d7 != d || d9 != d3 ? 1637 & -5879 : -14784 & 8203;
            this.Field_1120 = d8 != d2 ? -29695 & 21011 : 10630 & -16384;
            this.Method_1213((this.Field_1120 && d8 < 0.0 ? 8723 & 2209 : 4129 & 27668) != 0);
            this.Field_1155 = this.Field_1080 || this.Field_1120 ? 897 & 5185 : -21725 & 4116;
            n2 = Class_13337.Method_13371(this.Field_1130);
            int n7 = Class_13337.Method_13371(this.Method_1324() - 0.2608695652173913 * 0.7666666780908903);
            int n8 = Class_13337.Method_13371(this.Field_1106);
            Class_4751 class_4751 = new Class_4751(n2, n7, n8);
            Class_3238 class_32382 = this.Field_1089.\u0000strictfp(class_4751).Method_3688();
            if (class_32382.Method_3373() == Class_3713.Field_3718 && ((class_3238 = this.Field_1089.\u0000strictfp(class_4751.Method_4782()).Method_3688()) instanceof Class_27820 || class_3238 instanceof Class_33671 || class_3238 instanceof Class_20919)) {
                class_32382 = class_3238;
                class_4751 = class_4751.Method_4782();
            }
            this.Method_1338(d2, this.Method_1244(), class_32382, class_4751);
            if (d7 != d) {
                this.Field_1071 = 0.0;
            }
            if (d9 != d3) {
                this.Field_1072 = 0.0;
            }
            if (d8 != d2) {
                class_32382.Method_3419(this.Field_1089, this);
            }
            if (this.Method_1257() && n4 == 0 && this.Field_1095 == null) {
                double d22 = this.Field_1130 - d4;
                double d23 = this.Method_1324() - d5;
                double d24 = this.Field_1106 - d6;
                if (class_32382 != Class_9265.Field_9350) {
                    d23 = 0.0;
                }
                if (class_32382 != null && this.Method_1244()) {
                    class_32382.Method_3387(this.Field_1089, class_4751, this);
                }
                this.Field_1152 = (float)((double)this.Field_1152 + (double)Class_13337.Method_13347(d22 * d22 + d24 * d24) * (1.3170731707317074 * 0.4555555555555555));
                this.Field_1150 = (float)((double)this.Field_1150 + (double)Class_13337.Method_13347(d22 * d22 + d23 * d23 + d24 * d24) * (0.38999999999999996 * 1.5384615384615385));
                if (this.Field_1150 > (float)this.Field_1143 && class_32382.Method_3373() != Class_3713.Field_3718) {
                    this.Field_1143 = (int)this.Field_1150 + (8705 & 2195);
                    if (this.Method_1314()) {
                        float f = Class_13337.Method_13347(this.Field_1071 * this.Field_1071 * (1.25 * 0.1600000023841858) + this.Method_1224() * this.Method_1224() + this.Field_1072 * this.Field_1072 * (0.46428572120411055 * 0.4307692307692308)) * (1.5217391f * 0.23f);
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        this.Method_1288(this.Method_1193(), f, 1.0f + (this.Field_1122.nextFloat() - this.Field_1122.nextFloat()) * (0.09795918f * 4.0833335f));
                    }
                    this.Method_1330(class_4751, class_32382);
                }
            }
            try {
                this.Method_1328();
            }
            catch (Throwable throwable) {
                object = Class_13268.Method_13285(throwable, "Checking entity block collision");
                object2 = ((Class_13268)object).Method_13280("Entity being checked for collision");
                this.Method_1284((Class_13220)object2);
                throw new Class_1809((Class_13268)object);
            }
            if (n3 != 0) {
                boolean bl = this.Method_1199();
                if (this.Field_1089.Method_415(this.Method_1315().Method_11012(8.857142857142857E-4 * 1.1290322580645162, 0.0010256410256410256 * 0.975, 3.3333333333333335 * 3.0E-4))) {
                    this.Method_1183(16899 & 1393);
                    if (!bl) {
                        this.Field_1128 += -12279 & 1;
                        if (this.Field_1128 == 0) {
                            this.Method_1327(7944 & 16491);
                        }
                    }
                } else if (this.Field_1128 <= 0) {
                    this.Field_1128 = -this.Field_1131;
                }
                if (bl && this.Field_1128 > 0) {
                    this.Method_1288("random.fizz", 0.8947368f * 0.7823529f, 1.972093f * 0.8113208f + (this.Field_1122.nextFloat() - this.Field_1122.nextFloat()) * (0.78620684f * 0.50877196f));
                    this.Field_1128 = -this.Field_1131;
                }
            }
            this.Field_1089.Field_310.Method_2790();
        }
    }

    public void Method_1349(double d, double d2, double d3) {
        this.Field_1130 = d;
        this.Method_1241(d2);
        this.Field_1106 = d3;
        float f = this.Method_1266() * Field_1118.Method_3850();
        float f2 = this.Method_1287();
        this.Method_1171(new Class_10997(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f));
    }

    private void Method_1350() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract void Method_1351(Class_1699 var1);

    public boolean Method_1352(Class_25529 class_25529, Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f) {
        return (27801 & -31929) != 0;
    }

    public void Method_1353(boolean bl) {
        this.Field_1121 = bl;
    }

    public Class_4595 Method_1354() {
        return this.Field_1064;
    }

    public void Method_1355(int n) {
    }

    public double Method_1356(Class_1061 class_1061) {
        double d = this.Field_1130 - class_1061.Field_1130;
        double d2 = this.Method_1324() - class_1061.Method_1324();
        double d3 = this.Field_1106 - class_1061.Field_1106;
        return d * d + d2 * d2 + d3 * d3;
    }

    public float Method_1357() {
        return this.Method_1287() * (0.25555557f * 3.3260868f);
    }

    public boolean Method_1358() {
        return this.Method_1164(8709 & -28665);
    }

    public Class_1699 Method_1359() {
        return null;
    }

    public final void Method_1360(double d) {
        this.Field_1101 = d;
    }

    public void Method_1361(Class_4751 class_4751) {
        if (this.Field_1096 > 0) {
            this.Field_1096 = this.Method_1245();
        } else {
            if (!this.Field_1089.Field_306 && !class_4751.equals(this.Field_1065)) {
                this.Field_1065 = class_4751;
                Class_9702 class_9702 = Class_9265.Field_9291.Method_14267(this.Field_1089, class_4751);
                double d = class_9702.Method_9712().Method_4640() == Class_4565.Field_4566 ? (double)class_9702.Method_9714().\u0000strictfp() : (double)class_9702.Method_9714().\u0000= final();
                double d2 = class_9702.Method_9712().Method_4640() == Class_4565.Field_4566 ? this.Field_1106 : this.Field_1130;
                d2 = Math.abs(Class_13337.Method_13387(d2 - (double)(class_9702.Method_9712().Method_4620().Method_4647() == Class_5016.Field_5020 ? 2819 & 8213 : 18625 & -31998), d, d - (double)class_9702.Method_9713()));
                double d3 = Class_13337.Method_13387(this.Method_1324() - 1.0, class_9702.Method_9714().\u0000, `(), class_9702.Method_9714().\u0000, `() - class_9702.Method_9711());
                this.Field_1116 = new Vec3(d2, d3, 0.0);
                this.Field_1064 = class_9702.Method_9712();
            }
            this.Field_1135 = -27357 & 8833;
        }
    }

    public int Method_1362() {
        return -31613 & 323;
    }

    public boolean Method_1363() {
        return (18436 & -32471) != 0;
    }

    protected void Method_1364(int n, boolean bl) {
        byte by = this.Field_1070.Method_32708(-8174 & 8);
        if (bl) {
            this.Field_1070.Method_32704(384 & 3593, (byte)(by | (33 & 8321) << n));
        } else {
            this.Field_1070.Method_32704(-16223 & 0, (byte)(by & ((1037 & 17105) << n ^ -1 & -1)));
        }
    }

    public void Method_1365() {
        this.Method_1166();
    }

    public void Method_1366(int n) {
        this.Field_1124 = n;
    }
}

