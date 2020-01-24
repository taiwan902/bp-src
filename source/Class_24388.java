/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class_24388
extends Class_1490 {
    private Class_42876 Field_24389;
    private Class_42876 Field_24390;
    private int Field_24391;
    private int Field_24392;
    private int Field_24393;
    private int Field_24394;
    private int Field_24395;
    private Class_42876 Field_24396;
    private int Field_24397;
    private int Field_24398;
    private ArrayList Field_24399 = new ArrayList();
    private static final String[] Field_24400;

    protected void Method_24401(char c, int n) {
        long l = System.currentTimeMillis();
        if (n == (10369 & 1345) || n == Class_34481.Field_34485.Method_34531() && l > Class_38196.Field_38285.Field_38258 + (7299714861282494053L & -7299714862810134426L)) {
            try {
                Class_38196.Field_38285.Field_38258 = l;
                super.Method_1525(c, 8329 & 19573);
            }
            catch (IOException iOException) {
                Logger.getLogger(Class_24388.class.getName()).log(Level.SEVERE, null, iOException);
            }
        }
    }

    static {
        String[] arrstring = new String[10567 & 21511];
        arrstring[29408 & 0] = Class_24388.Method_24405("\u8420\u8402\u8403\u8400\u8401\u8403\u8423\u8402\u8408\u840a\u840b\u840a\u840a\u840b") + Class_38196.Field_38361;
        arrstring[513 & -16285] = Class_24388.Method_24403("\ua424\ua401\ua407\ua403\ua404\ua409\ua41b\ua40a\ua424\ua418\ua41f\ua403\ua404\ua404\ua41a");
        arrstring[4134 & 1162] = Class_24388.Method_24411("\u1084\u10a1\u10a0\u10a5\u10a5\u10a0\u1085\u10a1\u10a0\u10a0\u1085\u10a0\u10a4\u10a1\u10a5\u10a4\u10a1");
        arrstring[291 & -23973] = Class_24388.Method_24402("\u29b2\u2991\u2992\u2983\u2980\u2983\u2980\u2981\u29a0\u2981\u2990\u2981\u29a2\u2991\u2990\u2981\u2982\u2983\u2992");
        arrstring[6 & -12308] = Class_24388.Method_24407("\u9410\u941a\u9402\u941a\u9404\u941c\u9416\u9404\u9410\u9402\u9412\u9412\u9414\u9406\u9416\u941c\u9400\u9400\u941a\u9418\u941e\u9406");
        arrstring[10839 & 293] = Class_24388.Method_24412("\u928a\u92a7\u92a4\u92ad\u92a2\u92a5\u92a6\u9289\u92ae\u92ab\u92a6\u92a1\u92a0\u92ad");
        arrstring[-32761 & 2838] = Class_24388.Method_24408("\u1103\u1101\u1105\u1106\u1102\u1107\u1104\u1102\u1103\u1104\u1101\u1103\u1103\u1106\u1100\u1106\u1117\u1112\u1112");
        Field_24400 = arrstring;
    }

    private static String Method_24402(String string) {
        int n = 10531;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24388.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24403(String string) {
        int n = 30352;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24388.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_24404() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_24405(String string) {
        int n = 19960;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24388.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24406() {
        Object object;
        int n;
        this.Field_24394 = this.\u0000= final / (643 & 1130);
        this.Field_24391 = this.\u0000, ` / (514 & -27642);
        this.\u0000strictfp.clear();
        this.Field_24399.clear();
        Class_13769[] arrclass_13769 = Class_13769.Method_13900();
        int n2 = arrclass_13769.length;
        for (n = 8 & -32768; n < n2; ++n) {
            object = arrclass_13769[n];
            if (object.Method_13956() != this.Field_24395 || object == Class_13769.Field_13827 && !Class_38196.Field_38285.Method_38400() || object == Class_13769.Field_13822 || object == Class_13769.Field_13799 || object == Class_13769.Field_13784 || object == Class_13769.Field_13782) continue;
            Class_46112 class_46112 = new Class_46112(this.\u0000strictfp.Field_27, (Class_13769)((Object)object));
            class_46112.Method_46119(Class_38196.Field_38285.Method_38398((Class_13769)((Object)object)));
            this.\u0000strictfp.add(class_46112);
            this.Field_24399.add(class_46112);
        }
        this.Field_24393 = this.\u0000= final - Class_46112.Method_46124() >> (257 & 16929);
        this.Field_24392 = this.\u0000, ` - this.Field_24399.size() * (-26742 & 8203) >> (1821 & 6179);
        this.Field_24398 = this.\u0000= final + Class_46112.Method_46124() >> (25025 & 51);
        this.Field_24397 = this.\u0000, ` + this.Field_24399.size() * (554 & 26634) >> (8225 & -13051);
        for (n = 448 & -30684; n < this.Field_24399.size(); ++n) {
            object = (Class_46112)this.Field_24399.get(n);
            ((Class_46112)object).\u0000= final = this.Field_24393;
            ((Class_46112)object).\u0000, for = this.Field_24392 + n * (10 & -20869);
        }
        if (this.Field_24395 == 0) {
            this.Field_24389 = new Class_42876(18964 & -24319, this.Field_24394 - (-32417 & 4703), this.Field_24397 + (-14601 & 4103), 4284 & -29122, -27969 & 18766, "Exit Menu");
            this.\u0000strictfp.add(this.Field_24389);
            this.Field_24390 = new Class_42876(24737 & -32237, this.Field_24394 - (94 & 4383), this.Field_24397 + (18263 & 15), -32708 & 4668, 4110 & 16398, "Waypoints");
            this.\u0000strictfp.add(this.Field_24390);
            this.Field_24396 = new Class_42876(9802 & 307, this.Field_24394 + (17323 & -23433), this.Field_24397 + (17735 & -32593), 17468 & 10684, -16241 & 14, "Keyconfig");
            this.\u0000strictfp.add(this.Field_24396);
        } else {
            this.Field_24389 = new Class_42876(36 & 5400, this.Field_24394 - (-32450 & 17566), this.Field_24397 + (12311 & 16783), 6718 & -16195, 110 & -19314, "Back");
            this.\u0000strictfp.add(this.Field_24389);
        }
    }

    protected Class_24388(int n) {
        this.Field_24395 = n;
    }

    private static String Method_24407(String string) {
        int n = 4517;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24388.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24408(String string) {
        int n = 13925;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24388.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_24388() {
    }

    public void Method_24409(int n, int n2, float f) {
        String string = Field_24400[this.Field_24395];
        int n3 = this.\u0000strictfp.Method_28715(string);
        int n4 = this.\u0000= final - n3 >> (-32447 & 20671);
        int n5 = this.\u0000= final + n3 >> (-15829 & 213);
        Class_24388.\u0000, `((int)(n4 - (-21246 & 4694)), (int)(this.Field_24392 - (-13161 & 8798)), (int)(n5 + (-30206 & 21642)), (int)(this.Field_24392 - (17976 & -30712)), (int)(-1457388523 & -1576515510));
        this.\u0000strictfp(this.\u0000strictfp, string, this.Field_24394, this.Field_24392 - (531 & 16819), -1 & -1);
        Class_24388.\u0000, `((int)(this.Field_24393 - (24754 & -32766)), (int)(this.Field_24392 - (5378 & -21933)), (int)(this.Field_24398 + (-23542 & 4467)), (int)(this.Field_24397 + (16417 & 3353)), (int)(-1543433600 & -1454897848));
        super.Method_1545(n, n2, f);
    }

    protected void Method_24410(Class_42376 class_42376) {
        if (class_42376 instanceof Class_46112) {
            Class_46112 class_46112 = (Class_46112)class_42376;
            Class_38196.Field_38285.Method_38384(class_46112.Method_46122(), class_46112.Method_46121());
        }
        if (class_42376 instanceof Class_42876) {
            if (class_42376 == this.Field_24389) {
                if (this.Field_24395 == 0) {
                    this.\u0000strictfp.Method_218(null);
                    Class_38196.Field_38285.Method_38427();
                } else {
                    this.\u0000strictfp.Method_218(new Class_24388(36 & -31864));
                }
            }
            if (class_42376 == this.Field_24390) {
                this.\u0000strictfp.Method_218(new Class_30445(this));
            }
            if (class_42376 == this.Field_24396) {
                this.\u0000strictfp.Method_218(new Class_28897());
            }
        }
    }

    private static String Method_24411(String string) {
        int n = 26043;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24388.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24412(String string) {
        int n = 5110;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24388.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

