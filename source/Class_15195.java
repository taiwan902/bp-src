/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_15195
implements Class_14246 {
    public Class_42376 Field_15196;
    public final Class_18 Field_15197;
    public final Class_31683 Field_15198;
    public Class_38813 Field_15199;
    public boolean Field_15200 = 17681 & 8230;
    public Class_42376 Field_15201;

    private static String Method_15202(String string) {
        int n = 21853;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15195.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15203(String string) {
        int n = 19680;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15195.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_15204(int n, int n2, int n3) {
    }

    private static String Method_15205(String string) {
        int n = 29389;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15195.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_15195(Class_18 class_18, Class_31683 class_31683, int n) {
        this.Field_15197 = class_18;
        this.Field_15198 = class_31683;
        this.Field_15199 = new Class_38813(4723 & -32768, class_18.Field_27, 20874 & 32, 6176 & 192, 4523 & 8371, 16596 & 2070);
        String string = (String)((ArrayList)class_31683.Field_31685.Field_17620.Field_39732.Field_8851.Method_11230()).get(n * (-26045 & 8194) + (-24543 & 4481));
        if (string.isEmpty()) {
            string = Class_15195.Method_15202("");
        }
        this.Field_15201 = new Class_42376(1345 & 2562, 10550 & -28663, 9353 & 16384, 107 & 10571, -31562 & 29, "");
        this.Method_15207(n, Integer.parseInt(string));
        this.Field_15196 = new Class_42376(24 & 20514, 24837 & 4282, 4192 & -30714, 26674 & 4146, 1108 & 8756, Class_15195.Method_15213("\u0114\u0150\u0116"));
        this.Field_15199.Method_38853((String)((ArrayList)class_31683.Field_31685.Field_17620.Field_39732.Field_8851.Method_11230()).get(n * (2051 & 4262)));
        this.Field_15199.Method_38859(14959 & 1124);
        if (this.Field_15199.Method_38848().isEmpty() || Class_14775.Field_14780.Method_14787(this.Field_15199.Method_38848())) {
            this.Field_15199.Method_38863(14940384 & 853860841);
        } else {
            this.Field_15199.Method_38863(553644666 & 1308588144);
        }
    }

    private String Method_15206(int n) {
        String string;
        if (n < 0) {
            n = this.Field_15198.Field_31684.indexOf(this);
        }
        if ((string = (String)((ArrayList)this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8851.Method_11230()).get(n * (16906 & 8290) + (-30661 & 16577))).isEmpty()) {
            string = Class_15195.Method_15209("\u1001");
        }
        return Class_39702.Method_39914(Integer.parseInt(string));
    }

    private void Method_15207(int n, int n2) {
        this.Field_15201.Field_42381 = (this.Method_15210(n) ? Class_15195.Method_15217("\u1020\u1024") : "") + Class_39702.Method_39914(n2);
    }

    private static String Method_15208(String string) {
        int n = 24979;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15195.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15209(String string) {
        int n = 13313;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15195.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private boolean Method_15210(int n) {
        Class_8264 class_8264 = (Class_8264)this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8865.Field_13733.get(n);
        if (class_8264.Method_8274() == 0) {
            return (256 & 12316) != 0;
        }
        int n2 = 3090 & 4325;
        for (Class_8264 class_82642 : Class_8264.Field_8269) {
            if (class_82642 == class_8264 || class_82642.Method_8274() != class_8264.Method_8274()) continue;
            n2 = 361 & 21123;
            break;
        }
        return n2 != 0;
    }

    public void Method_15211(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        this.Field_15196.Field_42391 = n2 + (22974 & 702) + (-28315 & 68);
        this.Field_15196.Field_42390 = n3;
        this.Field_15196.Method_42401(this.Field_15197, n6, n7);
        this.Field_15201.Field_42391 = n2 + (617 & 16621) + (-16187 & 4726);
        this.Field_15201.Field_42390 = n3;
        this.Field_15201.Method_42401(this.Field_15197, n6, n7);
        this.Field_15199.Field_38822 = n2;
        this.Field_15199.Field_38832 = n3;
        this.Field_15199.Method_38849();
    }

    public void Method_15212(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field_15196.Method_42393(n2, n3);
        this.Field_15201.Method_42393(n2, n3);
    }

    private static String Method_15213(String string) {
        int n = 8678;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15195.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_15214() {
        int n = this.Field_15198.Field_31684.indexOf(this);
        this.Field_15198.Field_31684.remove(n);
        ArrayList arrayList = (ArrayList)this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8851.Method_11230();
        arrayList.remove(n * (8963 & 20630));
        arrayList.remove(n * (18843 & 5122));
        this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8851.Method_11246(arrayList);
        if (this.Field_15198.Field_31685.Field_17619 == this.Field_15199) {
            this.Field_15198.Field_31685.Method_17634();
        }
    }

    private void Method_15215() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_15195.Method_15203("\u8486\u8480\u8497\u8481\u8483\u8486\u8495\u8486\u848d\u848c\u849b\u848a\u848c\u848c"));
    }

    public boolean Method_15216(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (n4 != 0) {
            return (18544 & -24437) != 0;
        }
        if (this.Field_15196.Method_42404(this.Field_15197, n2, n3)) {
            this.Field_15196.Method_42402(this.Field_15197.Method_245());
            this.Method_15214();
            this.Field_15198.Field_31685.Method_17634();
            return (5761 & -24315) != 0;
        }
        if (this.Field_15201.Method_42404(this.Field_15197, n2, n3)) {
            this.Field_15201.Field_42381 = (Object)((Object)Class_5478.Field_5491) + Class_15195.Method_15208("\u2200\u2212") + (Object)((Object)Class_5478.Field_5485) + this.Method_15206(-1 & -1) + (Object)((Object)Class_5478.Field_5491) + Class_15195.Method_15205("\u5601\u5604");
            this.Field_15198.Field_31685.Method_17634();
            this.Field_15198.Field_31685.Field_17617 = this;
            return (11077 & -32767) != 0;
        }
        int n8 = n7 = n2 >= this.Field_15199.Field_38822 && n2 < this.Field_15199.Field_38822 + this.Field_15199.Field_38826 && n3 >= this.Field_15199.Field_38832 && n3 < this.Field_15199.Field_38832 + this.Field_15199.Field_38827 ? 16401 & -31607 : 16 & 1160;
        if (n7 != 0) {
            if (this.Field_15198.Field_31685.Field_17619 == this.Field_15199) {
                this.Field_15199.Method_38855(n2, n3, n4);
            } else {
                this.Field_15198.Field_31685.Method_17634();
                this.Field_15199.Method_38855(n2, n3, n4);
                this.Field_15198.Field_31685.Field_17619 = this.Field_15199;
                Keyboard.enableRepeatEvents((1571 & 2133) != 0);
            }
        }
        return (1536 & -30708) != 0;
    }

    private static String Method_15217(String string) {
        int n = 4260;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15195.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_15218(int n) {
        int n2 = this.Field_15198.Field_31684.indexOf(this);
        String string = Integer.toString(n);
        ArrayList arrayList = (ArrayList)this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8851.Method_11230();
        arrayList.set(n2 * (10 & 5523) + (-32719 & 5897), string);
        this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8851.Method_11246(arrayList);
        this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8865.Method_13740();
        Class_8264.Method_8281();
        this.Method_15207(n2, n);
        for (int i = 579 & 7596; i < this.Field_15198.Field_31684.size(); ++i) {
            Class_15195 class_15195 = (Class_15195)this.Field_15198.Field_31684.get(i);
            class_15195.Method_15207(i, ((Class_8264)this.Field_15198.Field_31685.Field_17620.Field_39732.Field_8865.Field_13733.get(i)).Method_8274());
        }
    }
}

