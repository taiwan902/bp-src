/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_16252
extends Class_1490 {
    private Class_1490 Field_16253;
    private Class_46074 Field_16254;
    public Class_8264 Field_16255 = null;
    private Class_39702 Field_16256;
    protected String Field_16257 = "Controls";
    private static final Class_6340[] Field_16258;
    public long Field_16259;
    private Class_42376 Field_16260;

    public Class_16252(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_16253 = class_1490;
        this.Field_16256 = class_39702;
    }

    protected void Method_16261(Class_42376 class_42376) {
        if (class_42376.Field_42392 == (13769 & -32550)) {
            this.\u0000strictfp.Method_218(this.Field_16253);
        } else if (class_42376.Field_42392 == (2249 & -32551)) {
            Class_8264[] arrclass_8264 = this.\u0000strictfp.Field_84.Field_39758;
            int n = arrclass_8264.length;
            for (int i = 1281 & 8716; i < n; ++i) {
                Class_8264 class_8264 = arrclass_8264[i];
                class_8264.Method_8284(class_8264.Method_8289());
            }
            Class_8264.Method_8281();
        } else if (class_42376.Field_42392 < (756 & -10139) && class_42376 instanceof Class_43202) {
            this.Field_16256.Method_39923(((Class_43202)class_42376).Method_43205(), -31895 & 4097);
            class_42376.Field_42381 = this.Field_16256.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
        }
    }

    static {
        Class_6340[] arrclass_6340 = new Class_6340[-29661 & 17039];
        arrclass_6340[580 & 20512] = Class_6340.Field_6356;
        arrclass_6340[8601 & -31227] = Class_6340.Field_6454;
        arrclass_6340[13510 & -30718] = Class_6340.Field_6350;
        Field_16258 = arrclass_6340;
    }

    private void Method_16262() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_16263() {
        this.Field_16254 = new Class_46074(this, this.\u0000strictfp);
        this.\u0000strictfp.add(new Class_42376(2248 & 731, this.\u0000= final / (-32242 & 19715) - (-32613 & 1499), this.\u0000, ` - (63 & 6749), -24682 & 16534, 10516 & 21751, Class_9802.Method_9806("gui.done", new Object[-28155 & 16466])));
        this.Field_16260 = new Class_42376(-32307 & 249, this.\u0000= final / (-24446 & 5202) - (9627 & 16635) + (31458 & 1441), this.\u0000, ` - (3037 & 4125), 158 & 2774, -32524 & 533, Class_9802.Method_9806("controls.resetAll", new Object[23572 & -24574]));
        this.\u0000strictfp.add(this.Field_16260);
        this.Field_16257 = Class_9802.Method_9806("controls.title", new Object[-6904 & 4129]);
        int n = 23603 & -32576;
        Class_6340[] arrclass_6340 = Field_16258;
        int n2 = arrclass_6340.length;
        for (int i = 13563 & 0; i < n2; ++i) {
            Class_6340 class_6340 = arrclass_6340[i];
            if (class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), this.\u0000= final / (-13749 & 4098) - (159 & 3483) + n % (-31478 & 8242) * (-2117 & 160), (1302 & 25170) + (314 & 24664) * (n >> (1281 & -12079)), class_6340));
            } else {
                this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), this.\u0000= final / (16450 & 8323) - (29339 & 1499) + n % (18706 & 623) * (-22880 & 4325), (274 & 659) + (888 & 2206) * (n >> (-31471 & 4685)), class_6340, this.Field_16256.Method_39885(class_6340)));
            }
            ++n;
        }
    }

    protected void Method_16264(char c, int n) {
        if (this.Field_16255 != null) {
            if (n == (10245 & 1043)) {
                this.Field_16256.Method_39921(this.Field_16255, 8209 & 1034);
            } else if (n != 0) {
                this.Field_16256.Method_39921(this.Field_16255, n);
            } else if (c > '\u0000') {
                this.Field_16256.Method_39921(this.Field_16255, c + (4866 & 9472));
            }
            this.Field_16255 = null;
            this.Field_16259 = Class_18.Method_207();
            Class_8264.Method_8281();
        } else {
            super.Method_1525(c, n);
        }
    }

    protected void Method_16265(int n, int n2, int n3) {
        if (n3 != 0 || !this.Field_16254.\u0000strictfp(n, n2, n3)) {
            super.Method_1518(n, n2, n3);
        }
    }

    public void Method_16266() {
        super.Method_1544();
        this.Field_16254.\u0000, for();
    }

    public void Method_16267(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_16254.\u0000strictfp(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_16257, this.\u0000= final / (2114 & 20870), 28972 & 27, 83886079 & 67108863);
        int n3 = 28717 & -30205;
        Class_8264[] arrclass_8264 = this.Field_16256.Field_39758;
        int n4 = arrclass_8264.length;
        for (int i = -23408 & 20782; i < n4; ++i) {
            Class_8264 class_8264 = arrclass_8264[i];
            if (class_8264.Method_8274() == class_8264.Method_8289()) continue;
            n3 = 4482 & -32760;
            break;
        }
        this.Field_16260.Field_42388 = n3 == 0 ? 10025 & 2177 : 854 & -27647;
        super.Method_1545(n, n2, f);
    }

    protected void Method_16268(int n, int n2, int n3) {
        if (this.Field_16255 != null) {
            this.Field_16256.Method_39921(this.Field_16255, (-100 & -100) + n3);
            this.Field_16255 = null;
            Class_8264.Method_8281();
        } else if (n3 != 0 || !this.Field_16254.\u0000, `(n, n2, n3)) {
            super.Method_1537(n, n2, n3);
        }
    }
}

