/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IngestServer
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import tv.twitch.broadcast.IngestServer;

public class Class_27180
extends Class_1490 {
    private static final Class_6340[] Field_27181;
    private String Field_27182;
    private int Field_27183;
    private boolean Field_27184 = 22080 & -32728;
    private String Field_27185;
    private static final Class_6340[] Field_27186;
    private final Class_39702 Field_27187;
    private final Class_1490 Field_27188;

    public void Method_27189(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_27182, this.\u0000= final / (25186 & 6538), 8564 & 17941, -1660944385 & 33554431);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_27185, this.\u0000= final / (58 & 12806), this.Field_27183, 1979711487 & 150994943);
        if (this.Field_27184) {
            this.\u0000strictfp(this.\u0000strictfp, (Object)((Object)Class_5478.Field_5505) + Class_9802.Method_9806("options.stream.changes", new Object[32 & 9364]), this.\u0000= final / (25858 & -30197), (3252 & 8981) + (9 & 30733), -1862270977 & 251658239);
        }
        super.Method_1545(n, n2, f);
    }

    static {
        Class_6340[] arrclass_6340 = new Class_6340[808 & 18447];
        arrclass_6340[-19229 & 260] = Class_6340.Field_6416;
        arrclass_6340[417 & 4113] = Class_6340.Field_6449;
        arrclass_6340[4323 & 2562] = Class_6340.Field_6400;
        arrclass_6340[16663 & -25461] = Class_6340.Field_6455;
        arrclass_6340[3340 & 4309] = Class_6340.Field_6433;
        arrclass_6340[-11259 & 519] = Class_6340.Field_6422;
        arrclass_6340[134 & 7543] = Class_6340.Field_6362;
        arrclass_6340[-28529 & 2311] = Class_6340.Field_6432;
        Field_27186 = arrclass_6340;
        Class_6340[] arrclass_63402 = new Class_6340[-32222 & 1166];
        arrclass_63402[386 & 9320] = Class_6340.Field_6382;
        arrclass_63402[-22303 & 5125] = Class_6340.Field_6444;
        Field_27181 = arrclass_63402;
    }

    public Class_27180(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_27188 = class_1490;
        this.Field_27187 = class_39702;
    }

    protected void Method_27190(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 < (2660 & 358) && class_42376 instanceof Class_43202) {
                Class_6340 class_6340 = ((Class_43202)class_42376).Method_43205();
                this.Field_27187.Method_39923(class_6340, -31675 & 2569);
                class_42376.Field_42381 = this.Field_27187.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
                if (this.\u0000strictfp.Method_242().Method_1827() && class_6340 != Class_6340.Field_6382 && class_6340 != Class_6340.Field_6444) {
                    this.Field_27184 = 20489 & 8741;
                }
            } else if (class_42376 instanceof Class_45706) {
                if (class_42376.Field_42392 == Class_6340.Field_6433.Method_6705()) {
                    this.\u0000strictfp.Method_242().Method_1839();
                } else if (class_42376.Field_42392 == Class_6340.Field_6422.Method_6705()) {
                    this.\u0000strictfp.Method_242().Method_1839();
                } else if (this.\u0000strictfp.Method_242().Method_1827()) {
                    this.Field_27184 = 11 & 1457;
                }
            }
            if (class_42376.Field_42392 == (2284 & 8409)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_27188);
            } else if (class_42376.Field_42392 == (505 & -3383)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(new Class_27103(this));
            }
        }
    }

    private void Method_27191() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27192() {
        Class_6340 class_6340;
        int n;
        int n2 = 17561 & 2594;
        this.Field_27182 = Class_9802.Method_9806("options.stream.title", new Object[674 & -21495]);
        this.Field_27185 = Class_9802.Method_9806("options.stream.chat.title", new Object[64 & 10275]);
        Object object = Field_27186;
        int n3 = ((Class_6340[])object).length;
        for (n = 1285 & 28712; n < n3; ++n) {
            class_6340 = object[n];
            if (class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), this.\u0000= final / (6314 & 1090) - (-10081 & 2011) + n2 % (-15486 & 50) * (-15128 & 181), this.\u0000, ` / (1558 & 10319) + (16188 & -32680) * (n2 >> (1 & 1943)), class_6340));
            } else {
                this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), this.\u0000= final / (9795 & -32374) - (16795 & 9375) + n2 % (2 & 307) * (12960 & -32543), this.\u0000, ` / (16614 & 12294) + (9272 & 6556) * (n2 >> (18565 & -31661)), class_6340, this.Field_27187.Method_39885(class_6340)));
            }
            ++n2;
        }
        if (n2 % (3075 & -8142) == (-10239 & 1113)) {
            ++n2;
        }
        this.Field_27183 = this.\u0000, ` / (24887 & -30714) + (12570 & 16413) * (n2 >> (-32159 & 8213)) + (1374 & 18471);
        n2 += 8706 & -16382;
        object = Field_27181;
        n3 = ((Class_6340[])object).length;
        for (n = 12 & 6594; n < n3; ++n) {
            class_6340 = object[n];
            if (class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), this.\u0000= final / (4178 & 11535) - (24735 & 667) + n2 % (8850 & 66) * (1450 & -18271), this.\u0000, ` / (9319 & -28410) + (16408 & 4253) * (n2 >> (2049 & -26975)), class_6340));
            } else {
                this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), this.\u0000= final / (-23741 & 17542) - (-12133 & 8603) + n2 % (66 & 12450) * (418 & 696), this.\u0000, ` / (-31130 & 16647) + (-23494 & 16477) * (n2 >> (26699 & 5249)), class_6340, this.Field_27187.Method_39885(class_6340)));
            }
            ++n2;
        }
        this.\u0000strictfp.add(new Class_42376(-17460 & 16602, this.\u0000= final / (1538 & -16254) - (-27493 & 10395), this.\u0000, ` / (711 & 23558) + (2281 & 4284), 4511 & 8854, 1172 & -32450, Class_9802.Method_9806("gui.done", new Object[5792 & 18496])));
        object = new Class_42376(18637 & 201, this.\u0000= final / (8707 & -28510) + (8717 & 7173), this.\u0000, ` / (12871 & 2198) + (29096 & 1708), 14743 & -31082, 1620 & -32714, Class_9802.Method_9806("options.stream.ingestSelection", new Object[6216 & 17296]));
        object.Field_42388 = this.\u0000strictfp.Method_242().Method_1847() && this.\u0000strictfp.Method_242().Method_1829().length > 0 || this.\u0000strictfp.Method_242().Method_1848() ? 30097 & 2149 : -15360 & 2591;
        this.\u0000strictfp.add(object);
    }
}

