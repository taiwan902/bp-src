/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_27952
extends Class_1906 {
    private static final Logger Field_27953 = LogManager.getLogger();
    private Class_7434 Field_27954;
    private static final Class_2080 Field_27955 = new Class_2080(Class_27952.Method_27962("\u8030\u8021\u803e\u8033\u8034\u8031\u8026\u8033\u8020\u8029\u803a\u8027\u8024\u8029\u8026\u8027\u8020\u8035\u803e\u803b\u8034\u8021\u803e\u8027\u8034\u8031\u8032\u803f\u803c\u803d\u802a\u8037\u8014\u8009\u8002"));
    private Class_1782 Field_27956;
    private Class_44864 Field_27957;
    private int Field_27958;
    private Class_44864 Field_27959;

    public Class_7434 Method_27960() {
        return this.Field_27954;
    }

    public void Method_27961() {
        super.Method_1942();
        Class_14517 class_14517 = this.Field_27954.Method_7438(this.\u0000strictfp.Field_48);
        if (class_14517 != null) {
            this.Field_27959.\u0000strictfp = this.Field_27958 < class_14517.size() - (2625 & -31591) ? 1601 & 10295 : 8 & 4710;
            this.Field_27957.\u0000strictfp = this.Field_27958 > 0 ? 577 & 3261 : -30192 & 394;
        }
    }

    private static String Method_27962(String string) {
        int n = 4195;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27952.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_27952(Class_37781 class_37781, Class_7434 class_7434, Class_283 class_283) {
        super(new Class_22508(class_37781, class_7434, class_283));
        this.Field_27954 = class_7434;
        this.Field_27956 = class_7434.Method_7437();
    }

    protected void Method_27963(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_27955);
        int n3 = (this.\u0000= final - this.\u0000, for) / (2818 & 16595);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (17446 & 4106);
        this.\u0000strictfp(n3, n4, 2274 & 1281, -32254 & 308, this.\u0000, for, this.\u0000= int);
        Class_14517 class_14517 = this.Field_27954.Method_7438(this.\u0000strictfp.Field_48);
        if (class_14517 != null && !class_14517.isEmpty()) {
            int n5 = this.Field_27958;
            if (n5 < 0 || n5 >= class_14517.size()) {
                return;
            }
            Class_6757 class_6757 = (Class_6757)class_14517.get(n5);
            if (class_6757.Method_6776()) {
                this.\u0000strictfp.Method_253().Method_34707(Field_27955);
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                Class_16867.Method_16931();
                this.\u0000strictfp(this.\u0000
                 + (17495 & 15187), this.\u0000% + (2071 & 17629), 252 & -32555, 1563 & -8000, 1630 & 26780, 10869 & -32363);
                this.\u0000strictfp(this.\u0000
                 + (10323 & 627), this.\u0000% + (51 & -12037), -30219 & 20702, 8581 & 2048, -25508 & 28, -24547 & 19095);
            }
        }
    }

    private void Method_27964() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_27965(Class_42376 class_42376) {
        Object object;
        int n = -32505 & 136;
        if (class_42376 == this.Field_27959) {
            this.Field_27958 += 8513 & -10583;
            object = this.Field_27954.Method_7438(this.\u0000strictfp.Field_48);
            if (object != null && this.Field_27958 >= ((ArrayList)object).size()) {
                this.Field_27958 = ((ArrayList)object).size() - (16545 & -20475);
            }
            n = -25507 & 545;
        } else if (class_42376 == this.Field_27957) {
            this.Field_27958 -= 24869 & 4611;
            if (this.Field_27958 < 0) {
                this.Field_27958 = 13569 & 560;
            }
            n = 9 & -12637;
        }
        if (n != 0) {
            ((Class_22508)this.\u0000strictfp).Method_22518(this.Field_27958);
            object = new Class_29900(Class_16620.Method_16633());
            ((Class_29900)object).Method_30010(this.Field_27958);
            this.\u0000strictfp.Method_271().Method_20245(new Class_28799("MC|TrSel", (Class_29900)object));
        }
    }

    public void Method_27966() {
        super.Method_1946();
        int n = (this.\u0000= final - this.\u0000, for) / (17478 & 2059);
        int n2 = (this.\u0000, ` - this.\u0000= int) / (4418 & -32757);
        this.Field_27959 = new Class_44864(17017 & 385, n + (10360 & -32390) + (635 & 16539), n2 + (2588 & -32680) - (41 & 13333), (12465 & 16387) != 0);
        this.\u0000strictfp.add(this.Field_27959);
        this.Field_27957 = new Class_44864(7058 & 9230, n + (5366 & -30684) - (-25829 & 16535), n2 + (3096 & -7972) - (3081 & 4391), (2 & 26737) != 0);
        this.\u0000strictfp.add(this.Field_27957);
        this.Field_27959.\u0000strictfp = 1164 & 26992;
        this.Field_27957.\u0000strictfp = -31296 & 2605;
    }

    static Class_2080 Method_27967() {
        return Field_27955;
    }

    protected void Method_27968(int n, int n2) {
        String string = this.Field_27956.Method_1788();
        this.\u0000strictfp.Method_28692(string, this.\u0000, for / (3138 & 4110) - this.\u0000strictfp.Method_28715(string) / (-31997 & 5138), -15354 & 38, -2142705182 & 901791816);
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("container.inventory", new Object[22256 & 2052]), -30167 & 332, this.\u0000= int - (-14237 & 1648) + (1347 & 25122), 292053573 & -531443512);
    }

    public void Method_27969(int n, int n2, float f) {
        super.Method_1948(n, n2, f);
        Class_14517 class_14517 = this.Field_27954.Method_7438(this.\u0000strictfp.Field_48);
        if (class_14517 != null && !class_14517.isEmpty()) {
            int n3 = (this.\u0000= final - this.\u0000, for) / (26674 & 130);
            int n4 = (this.\u0000, ` - this.\u0000= int) / (130 & 358);
            int n5 = this.Field_27958;
            Class_6757 class_6757 = (Class_6757)class_14517.get(n5);
            Class_23823 class_23823 = class_6757.Method_6770();
            Class_23823 class_238232 = class_6757.Method_6765();
            Class_23823 class_238233 = class_6757.Method_6767();
            Class_16867.Method_16961();
            Class_39477.Method_39485();
            Class_16867.Method_16931();
            Class_16867.Method_16957();
            Class_16867.Method_16950();
            Class_16867.Method_16918();
            this.\u0000strictfp.Field_44259 = 1533.3334f * 0.06521739f;
            this.\u0000strictfp.Method_44287(class_23823, n3 + (18596 & 4709), n4 + (10328 & 17562));
            this.\u0000strictfp.Method_44284(this.\u0000strictfp, class_23823, n3 + (8308 & -32721), n4 + (2078 & -15848));
            if (class_238232 != null) {
                this.\u0000strictfp.Method_44287(class_238232, n3 + (8318 & -32577), n4 + (-32680 & 21016));
                this.\u0000strictfp.Method_44284(this.\u0000strictfp, class_238232, n3 + (6206 & 24766), n4 + (-31688 & 2072));
            }
            this.\u0000strictfp.Method_44287(class_238233, n3 + (1276 & 2939), n4 + (-22472 & 16926));
            this.\u0000strictfp.Method_44284(this.\u0000strictfp, class_238233, n3 + (1785 & 30840), n4 + (28 & -10824));
            this.\u0000strictfp.Field_44259 = 0.0f;
            Class_16867.Method_16931();
            if (this.\u0000strictfp(-27604 & 230, 697 & -29414, 16 & 2640, -14544 & 8339, n, n2) && class_23823 != null) {
                this.\u0000strictfp(class_23823, n, n2);
            } else if (class_238232 != null && this.\u0000strictfp(2622 & -3969, 15384 & -32198, 16 & 2132, -28528 & 10836, n, n2) && class_238232 != null) {
                this.\u0000strictfp(class_238232, n, n2);
            } else if (class_238233 != null && this.\u0000strictfp(126 & -32520, 17180 & 13400, 2684 & 401, 1744 & 16404, n, n2) && class_238233 != null) {
                this.\u0000strictfp(class_238233, n, n2);
            } else if (class_6757.Method_6776() && (this.\u0000strictfp(-13101 & 4979, 701 & -14313, 29214 & 2140, 13341 & -32747, n, n2) || this.\u0000strictfp(-11689 & 9299, 2867 & 8379, 4126 & -23395, 125 & 27927, n, n2))) {
                this.\u0000strictfp(Class_9802.Method_9806("merchant.deprecated", new Object[-16122 & 1552]), n, n2);
            }
            Class_16867.Method_16945();
            Class_16867.Method_16918();
            Class_16867.Method_16927();
            Class_39477.Method_39482();
        }
    }
}

