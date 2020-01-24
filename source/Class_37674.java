/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class Class_37674
extends Class_1551 {
    private static final Class_2080 Field_37675 = new Class_2080(Class_37674.Method_37685("\u6501\u6501\u6503\u6502\u6504\u6504\u6506\u6507\u6508\u6509\u650a\u650b\u650c\u650c\u650e\u650e\u6500\u6500\u6503\u6502\u6504"));
    private final Map Field_37676 = new LinkedHashMap();
    private final Class_18 Field_37677;

    private void Method_37678() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_37674.Method_37680("\ue140\ue141\ue162\ue143\ue160\ue161\ue162\ue163\ue160\ue161\ue142\ue163\ue160\ue161"));
    }

    private void Method_37679(int n, int n2, Class_17793 class_17793) {
        int n3;
        this.\u0000strictfp(n, n2, 6432 & 9756, class_17793.Method_17808().ordinal() * (165 & 27655) * (17290 & 11271), 14526 & -32585, 2727 & 21589);
        if (class_17793.Method_17807() != Class_10099.Field_10102) {
            this.\u0000strictfp(n, n2, 4184 & 16545, (2000 & 30803) + (class_17793.Method_17807().ordinal() - (-32251 & 4225)) * (7 & 13205) * (6410 & 25254), 1718 & -12106, 5253 & 261);
        }
        if ((n3 = (int)(class_17793.Method_17805() * (9.555555f * 19.151163f))) > 0) {
            this.\u0000strictfp(n, n2, 25730 & 65, class_17793.Method_17808().ordinal() * (-24265 & 5) * (4102 & 755) + (-32699 & 20245), n3, -22395 & 16911);
            if (class_17793.Method_17807() != Class_10099.Field_10102) {
                this.\u0000strictfp(n, n2, 40 & 528, (721 & 8272) + (class_17793.Method_17807().ordinal() - (8707 & 5137)) * (16391 & 53) * (16402 & 8483) + (23 & -21979), n3, 1029 & 16517);
            }
        }
    }

    public Class_37674(Class_18 class_18) {
        this.Field_37677 = class_18;
    }

    private static String Method_37680(String string) {
        int n = 7406;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37674.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_37681() {
        if (!this.Field_37676.isEmpty()) {
            Class_31566 class_31566 = new Class_31566(this.Field_37677);
            int n = class_31566.Method_31574();
            int n2 = 9262 & -28147;
            for (Class_18154 class_18154 : this.Field_37676.values()) {
                int n3;
                int n4 = n / (-15294 & 818) - (4187 & 859);
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                this.Field_37677.Method_253().Method_34707(Field_37675);
                int n5 = class_18154.\u0000strictfp != Class_12001.Field_12004 ? 2069 & 25857 : 2066 & 16389;
                String[] arrstring = class_18154.\u0000strictfp().Method_1783().split(Class_37674.Method_37684("\u0282"));
                if (n5 != 0) {
                    this.Method_37679(n4, n2 + (arrstring.length - (22257 & 10503)) * (13 & -32471), class_18154);
                }
                for (n3 = 68 & -6126; n3 < arrstring.length; ++n3) {
                    this.Field_37677.Field_27.Method_28729(arrstring[n3], n / (1050 & 10887) - this.Field_37677.Field_27.Method_28715(arrstring[n3]) / (14338 & 530), n2 - (-19413 & 16653) + n3 * (11 & -15859), 50331647 & 1090519039);
                }
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                n3 = n5 != 0 ? 6218 & -14693 : 4 & 20537;
                if ((n2 += n3 + (4361 & 95) * arrstring.length) < class_31566.Method_31575() / (9251 & 4695)) continue;
                break;
            }
            this.Field_37677.Method_253().Method_34707(\u0000= final);
            return (-30715 & 8481) != 0;
        }
        return (3364 & -20280) != 0;
    }

    public void Method_37682() {
        this.Field_37676.clear();
    }

    public void Method_37683(Class_30157 class_30157) {
        if (class_30157.Method_30167() == Class_10268.Field_10273) {
            this.Field_37676.put(class_30157.Method_30173(), new Class_18154(class_30157));
        } else if (class_30157.Method_30167() == Class_10268.Field_10269) {
            this.Field_37676.remove(class_30157.Method_30173());
        } else {
            ((Class_18154)this.Field_37676.get(class_30157.Method_30173())).Method_18158(class_30157);
        }
    }

    private static String Method_37684(String string) {
        int n = 24105;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37674.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_37685(String string) {
        int n = 18781;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37674.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

