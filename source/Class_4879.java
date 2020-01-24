/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class_4879 {
    private static Map Field_4880;
    protected Class_3238 Field_4881;
    protected boolean Field_4882;
    private static final Logger Field_4883;
    protected Class_283 Field_4884;
    private int Field_4885 = -1 & -1;
    protected Class_4751 Field_4886 = Class_4751.Field_4760;
    private static Map Field_4887;

    public static Class_4879 Method_4888(Class_1699 class_1699) {
        Class_4879 class_4879 = null;
        try {
            Class class_ = (Class)Field_4887.get(class_1699.Method_1708("id"));
            if (class_ != null) {
                class_4879 = (Class_4879)class_.newInstance();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (class_4879 != null) {
            class_4879.Method_4911(class_1699);
        } else {
            Field_4883.warn("Skipping BlockEntity with id " + class_1699.Method_1708("id"));
        }
        return class_4879;
    }

    public Class_1486 Method_4889() {
        return null;
    }

    private static String Method_4890(String string) {
        int n = 18527;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4891(String string) {
        int n = 17359;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_4892() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_4893(String string) {
        int n = 30899;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4894(String string) {
        int n = 15202;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4895(String string) {
        int n = 20721;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_283 Method_4896() {
        return this.Field_4884;
    }

    public double Method_4897(double d, double d2, double d3) {
        double d4 = (double)this.Field_4886.\u0000= final() + 0.34375 * 1.4545454545454546 - d;
        double d5 = (double)this.Field_4886.\u0000, `() + 0.978021978021978 * 0.5112359550561798 - d2;
        double d6 = (double)this.Field_4886.\u0000strictfp() + 2.25 * 0.2222222222222222 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    private static String Method_4898(String string) {
        int n = 30784;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4899(String string) {
        int n = 18065;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4900(String string) {
        int n = 21676;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_4901(Class_4751 class_4751) {
        this.Field_4886 = class_4751;
    }

    static Map Method_4902() {
        return Field_4880;
    }

    public Class_4751 Method_4903() {
        return this.Field_4886;
    }

    public void Method_4904() {
        this.Field_4882 = -3704 & 0;
    }

    public boolean Method_4905() {
        return this.Field_4882;
    }

    private static String Method_4906(String string) {
        int n = 25808;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_4907() {
        if (this.Field_4885 == (-1 & -1)) {
            Class_3436 class_3436 = this.Field_4884.Method_375(this.Field_4886);
            this.Field_4885 = class_3436.Method_3442().Method_3434(class_3436);
        }
        return this.Field_4885;
    }

    public boolean Method_4908(int n, int n2) {
        return (8514 & -31736) != 0;
    }

    private static String Method_4909(String string) {
        int n = 27918;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_4910(Class_283 class_283) {
        this.Field_4884 = class_283;
    }

    static {
        Field_4883 = LogManager.getLogger();
        Field_4887 = Maps.newHashMap();
        Field_4880 = Maps.newHashMap();
        Class_4879.Method_4919(Class_44437.class, Class_4879.Method_4895("\u424a\u4249\u424e\u4243\u424c\u424f\u4248"));
        Class_4879.Method_4919(Class_36146.class, Class_4879.Method_4894("\uc085\uc08e\uc081\uc087\uc086"));
        Class_4879.Method_4919(Class_39196.class, Class_4879.Method_4925("\u0241\u026b\u0262\u0262\u0266\u0246\u026e\u0262\u026f\u0269"));
        Class_4879.Method_4919(Class_44146.class, Class_4879.Method_4909("\u0000\u0004\u0003\u0006\u0004\u0001\u0006\u0003\u0001\u0000\u0007\u0003"));
        Class_4879.Method_4919(Class_4933.class, Class_4879.Method_4924("\u5d11\u5d34\u5d26\u5d36"));
        Class_4879.Method_4919(Class_23694.class, Class_4879.Method_4928("\u8408\u8408\u8402\u840a\u8408\u8408\u840a"));
        Class_4879.Method_4919(Class_33614.class, Class_4879.Method_4931("\uc860\uc842\uc842\uc843"));
        Class_4879.Method_4919(Class_36325.class, Class_4879.Method_4898("\u0886\u08a4\u08a3\u0882\u08a7\u08a6\u08a2\u08a3\u08a6\u08a1"));
        Class_4879.Method_4919(Class_5100.class, Class_4879.Method_4917("\u0400\u0429\u042a\u0421\u042e"));
        Class_4879.Method_4919(Class_5568.class, Class_4879.Method_4906("\u0e02\u0e32\u0e20\u0e22\u0e34\u0e34"));
        Class_4879.Method_4919(Class_39639.class, Class_4879.Method_4913("\uc880\uc8a0\uc8a0\uc8a1\uc8a1\uc8a1\uc8a0\uc8a1"));
        Class_4879.Method_4919(Class_33962.class, Class_4879.Method_4916("\u088f\u0884\u0889\u0882\u088f\u0880\u088a\u088a\u088b\u0888\u0886\u088f"));
        Class_4879.Method_4919(Class_38552.class, Class_4879.Method_4914("\u8840\u8840\u8851\u8851\u8840\u8851\u8851\u8840\u8849"));
        Class_4879.Method_4919(Class_43621.class, Class_4879.Method_4930("\u8011\u801d\u801c\u8004\u8000\u801d\u801c"));
        Class_4879.Method_4919(Class_47216.class, Class_4879.Method_4890("\uc344\uc362\uc366\uc364\uc360\uc360"));
        Class_4879.Method_4919(Class_37700.class, Class_4879.Method_4891("kSMTT"));
        Class_4879.Method_4919(Class_46901.class, Class_4879.Method_4915("\u2400\u2401\u2400\u2401\u2410\u2401\u2402\u2411\u240a\u241b"));
        Class_4879.Method_4919(Class_40635.class, Class_4879.Method_4918("\u3010\u3014\u3008\u3008\u3018\u300c"));
        Class_4879.Method_4919(Class_47828.class, Class_4879.Method_4900("\u3506\u3503\u3500\u3504\u3500\u3502\u3500\u3504\u350a\u350e"));
        Class_4879.Method_4919(Class_34660.class, Class_4879.Method_4893("\u0a20\u0a00\u0a01\u0a01\u0a05\u0a04\u0a24\u0a05\u0a08"));
        Class_4879.Method_4919(Class_39935.class, Class_4879.Method_4899("\u8d80\u8d81\u8d82\u8d82\u8d85\u8d84"));
    }

    public void Method_4911(Class_1699 class_1699) {
        this.Field_4886 = new Class_4751(class_1699.Method_1738("x"), class_1699.Method_1738("y"), class_1699.Method_1738("z"));
    }

    public void Method_4912() {
        this.Field_4882 = 4355 & 581;
    }

    private static String Method_4913(String string) {
        int n = 1060;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4914(String string) {
        int n = 2806;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4915(String string) {
        int n = 29919;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4916(String string) {
        int n = 19274;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4917(String string) {
        int n = 12644;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4918(String string) {
        int n = 3466;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_4919(Class class_, String string) {
        if (Field_4887.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        Field_4887.put(string, class_);
        Field_4880.put(class_, string);
    }

    public boolean Method_4920() {
        return (this.Field_4884 != null ? 25473 & 6213 : -28672 & 10618) != 0;
    }

    public boolean Method_4921() {
        return (8200 & -15647) != 0;
    }

    public void Method_4922() {
        if (this.Field_4884 != null) {
            Class_3436 class_3436 = this.Field_4884.Method_375(this.Field_4886);
            this.Field_4885 = class_3436.Method_3442().Method_3434(class_3436);
            this.Field_4884.Method_345(this.Field_4886, this);
            if (this.Method_4923() != Class_9265.Field_9351) {
                this.Field_4884.Method_520(this.Field_4886, this.Method_4923());
            }
        }
    }

    public Class_3238 Method_4923() {
        if (this.Field_4881 == null) {
            this.Field_4881 = this.Field_4884.Method_375(this.Field_4886).Method_3442();
        }
        return this.Field_4881;
    }

    private static String Method_4924(String string) {
        int n = 1043;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4925(String string) {
        int n = 2185;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_4926() {
        this.Field_4881 = null;
        this.Field_4885 = -1 & -1;
    }

    public double Method_4927() {
        return 3.2857142857142856 * 1246.608695652174;
    }

    private static String Method_4928(String string) {
        int n = 12708;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_4929(Class_1699 class_1699) {
        String string = (String)Field_4880.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        class_1699.Method_1702("id", string);
        class_1699.Method_1739("x", this.Field_4886.\u0000= final());
        class_1699.Method_1739("y", this.Field_4886.\u0000, `());
        class_1699.Method_1739("z", this.Field_4886.\u0000strictfp());
    }

    private static String Method_4930(String string) {
        int n = 23902;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4931(String string) {
        int n = 31641;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4879.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_4932(Class_13220 class_13220) {
        class_13220.Method_13232("Name", new Class_7422(this));
        if (this.Field_4884 != null) {
            Class_13220.Method_13235(class_13220, this.Field_4886, this.Method_4923(), this.Method_4907());
            class_13220.Method_13232("Actual block type", new Class_36534(this));
            class_13220.Method_13232("Actual block data value", new Class_36985(this));
        }
    }
}

