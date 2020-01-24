/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_21303 {
    public static Class_1782 Method_21304(Class_1367 class_1367, Class_1782 class_1782, Class_1061 class_1061) {
        Object object;
        Object object22;
        Class_1782 class_17822 = null;
        if (class_1782 instanceof Class_2871) {
            object = (Class_2871)class_1782;
            Object object3 = ((Class_2871)object).Method_2883();
            if (Class_16350.Method_16388((String)object3)) {
                object22 = Class_16350.Method_16386(class_1367, (String)object3, Class_1061.class);
                if (object22.size() != (-32253 & 17541)) {
                    throw new \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized();
                }
                object3 = ((Class_1061)object22.get(30726 & 225)).Method_1202();
            }
            class_17822 = class_1061 != null && ((String)object3).equals("*") ? new Class_2871(class_1061.Method_1202(), ((Class_2871)object).Method_2878()) : new Class_2871((String)object3, ((Class_2871)object).Method_2878());
            ((Class_2871)class_17822).Method_2881(((Class_2871)object).Method_2876());
        } else if (class_1782 instanceof Class_2884) {
            object = ((Class_2884)class_1782).Method_2886();
            class_17822 = Class_16350.Method_16387(class_1367, (String)object);
            if (class_17822 == null) {
                class_17822 = new Class_2840("");
            }
        } else if (class_1782 instanceof Class_2840) {
            class_17822 = new Class_2840(((Class_2840)class_1782).Method_2848());
        } else {
            if (!(class_1782 instanceof Class_2849)) {
                return class_1782;
            }
            object = ((Class_2849)class_1782).Method_2864();
            for (int i = 20480 & 2080; i < ((Object[])object).length; ++i) {
                object22 = object[i];
                if (!(object22 instanceof Class_1782)) continue;
                object[i] = Class_21303.Method_21304(class_1367, (Class_1782)object22, class_1061);
            }
            class_17822 = new Class_2849(((Class_2849)class_1782).Method_2866(), (Object[])object);
        }
        object = class_1782.Method_1789();
        if (object != null) {
            class_17822.Method_1786(((Class_2893)object).Method_2947());
        }
        for (Object object22 : class_1782.Method_1791()) {
            class_17822.Method_1787(Class_21303.Method_21304(class_1367, (Class_1782)object22, class_1061));
        }
        return class_17822;
    }

    private void Method_21305() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

