/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41925
extends Class_4850 {
    private final Class_5046 Field_41926 = new Class_5038();

    private void Method_41927() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_5046 Method_41928(Class_23823 class_23823) {
        return this.Field_41926;
    }

    protected void Method_41929(Class_283 class_283, Class_4751 class_4751) {
        Class_37324 class_37324 = new Class_37324(class_283, class_4751);
        Class_4933 class_4933 = (Class_4933)class_37324.Method_37331();
        if (class_4933 != null) {
            int n = class_4933.Method_4949();
            if (n < 0) {
                class_283.Method_502(5113 & 9193, class_4751, 12388 & 18193);
            } else {
                Class_23823 class_23823 = class_4933.Method_4939(n);
                if (class_23823 != null) {
                    Class_23823 class_238232;
                    Class_4595 class_4595 = (Class_4595)((Object)class_283.Method_375(class_4751).Method_3440(\u0000strictfp));
                    Class_4751 class_47512 = class_4751.Method_4765(class_4595);
                    Class_4961 class_4961 = Class_40635.Method_40670(class_283, class_47512.\u0000= final(), class_47512.\u0000, `(), class_47512.\u0000strictfp());
                    if (class_4961 == null) {
                        class_238232 = this.Field_41926.Method_5048(class_37324, class_23823);
                        if (class_238232 != null && class_238232.Field_23826 <= 0) {
                            class_238232 = null;
                        }
                    } else {
                        class_238232 = Class_40635.Method_40656(class_4961, class_23823.Method_23850().Method_23857(1409 & -24563), class_4595.Method_4660());
                        if (class_238232 == null) {
                            class_238232 = class_23823.Method_23850();
                            if ((class_238232.Field_23826 -= 121 & 12289) <= 0) {
                                class_238232 = null;
                            }
                        } else {
                            class_238232 = class_23823.Method_23850();
                        }
                    }
                    class_4933.Method_4956(n, class_238232);
                }
            }
        }
    }

    public Class_4879 Method_41930(Class_283 class_283, int n) {
        return new Class_23694();
    }
}

