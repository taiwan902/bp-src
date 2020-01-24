/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 */
import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22266 {
    private final int Field_22267;
    private final int Field_22268;
    private final Predicate[][][] Field_22269;
    private final int Field_22270;

    public int Method_22271() {
        return this.Field_22267;
    }

    private Class_9702 Method_22272(Class_4751 class_4751, Class_4595 class_4595, Class_4595 class_45952, LoadingCache loadingCache) {
        for (int i = 12312 & -32508; i < this.Field_22268; ++i) {
            for (int j = 21024 & -32768; j < this.Field_22267; ++j) {
                for (int k = -16256 & 8200; k < this.Field_22270; ++k) {
                    if (this.Field_22269[k][j][i].apply(loadingCache.getUnchecked((Object)Class_22266.Method_22275(class_4751, class_4595, class_45952, i, j, k)))) continue;
                    return null;
                }
            }
        }
        return new Class_9702(class_4751, class_4595, class_45952, loadingCache, this.Field_22268, this.Field_22267, this.Field_22270);
    }

    public Class_9702 Method_22273(Class_283 class_283, Class_4751 class_4751) {
        LoadingCache loadingCache = Class_22266.Method_22276(class_283, (6144 & 1562) != 0);
        int n = Math.max(Math.max(this.Field_22268, this.Field_22267), this.Field_22270);
        for (Class_4751 class_47512 : Class_4751.Method_4779(class_4751, class_4751.Method_4791(n - (193 & 1297), n - (2311 & 4145), n - (-32567 & 3347)))) {
            Class_4595[] arrclass_4595 = Class_4595.Field_4600;
            int n2 = arrclass_4595.length;
            for (int i = 24577 & 1606; i < n2; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                Class_4595[] arrclass_45952 = Class_4595.Field_4600;
                int n3 = arrclass_45952.length;
                for (int j = 683 & -30700; j < n3; ++j) {
                    Class_9702 class_9702;
                    Class_4595 class_45952 = arrclass_45952[j];
                    if (class_45952 == class_4595 || class_45952 == class_4595.Method_4660() || (class_9702 = this.Method_22272(class_47512, class_4595, class_45952, loadingCache)) == null) continue;
                    return class_9702;
                }
            }
        }
        return null;
    }

    public int Method_22274() {
        return this.Field_22268;
    }

    protected static Class_4751 Method_22275(Class_4751 class_4751, Class_4595 class_4595, Class_4595 class_45952, int n, int n2, int n3) {
        if (class_4595 != class_45952 && class_4595 != class_45952.Method_4660()) {
            Class_4792 class_4792 = new Class_4792(class_4595.Method_4654(), class_4595.Method_4633(), class_4595.Method_4656());
            Class_4792 class_47922 = new Class_4792(class_45952.Method_4654(), class_45952.Method_4633(), class_45952.Method_4656());
            Class_4792 class_47923 = class_4792.Method_4801(class_47922);
            return class_4751.Method_4791(class_47922.Method_4807() * -n2 + class_47923.Method_4807() * n + class_4792.Method_4807() * n3, class_47922.Method_4806() * -n2 + class_47923.Method_4806() * n + class_4792.Method_4806() * n3, class_47922.Method_4809() * -n2 + class_47923.Method_4809() * n + class_4792.Method_4809() * n3);
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }

    public static LoadingCache Method_22276(Class_283 class_283, boolean bl) {
        return CacheBuilder.newBuilder().build((CacheLoader)new Class_21113(class_283, bl));
    }

    public Class_22266(Predicate[][][] arrpredicate) {
        this.Field_22269 = arrpredicate;
        this.Field_22270 = arrpredicate.length;
        if (this.Field_22270 > 0) {
            this.Field_22267 = arrpredicate[-32224 & 2320].length;
            this.Field_22268 = this.Field_22267 > 0 ? arrpredicate[2 & 309][8784 & 20520].length : 1060 & 6219;
        } else {
            this.Field_22267 = 19596 & 4352;
            this.Field_22268 = 8576 & 16900;
        }
    }

    private void Method_22277() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

