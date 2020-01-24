/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.cache.Cache
 *  com.google.common.cache.CacheBuilder
 */
import com.google.common.base.Preconditions;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class Class_31008 {
    private static final Cache Field_31009 = CacheBuilder.newBuilder().expireAfterWrite(428378141L & 1042800682131858273L, TimeUnit.MINUTES).build();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void Method_31010(String var0, Class_38541 var1_1, Class_33149 var2_2) {
        Preconditions.checkNotNull((Object)var0, (Object)"url");
        Preconditions.checkNotNull((Object)var1_1, (Object)"eventLoop");
        Preconditions.checkNotNull((Object)var2_2, (Object)"contentPromise");
        var3_3 = URI.create(var0);
        Preconditions.checkNotNull((Object)var3_3.getScheme(), (Object)"scheme");
        Preconditions.checkNotNull((Object)var3_3.getHost(), (Object)"host");
        var4_4 = var3_3.getScheme().equals("https");
        var5_5 = var3_3.getPort();
        if (var5_5 == (-1 & -1)) {
            var6_6 = var3_3.getScheme();
            var7_7 = -1 & -1;
            switch (var6_6.hashCode()) {
                case 3213448: {
                    if (!var6_6.equals("http")) break;
                    var7_7 = 16 & -30687;
                    break;
                }
                case 99617003: {
                    if (!var6_6.equals("https")) break;
                    var7_7 = -31407 & 24581;
                }
            }
            switch (var7_7) {
                case 0: {
                    var5_5 = 6353 & 856;
                    ** break;
                }
                case 1: {
                    var5_5 = 8635 & 21503;
                    ** break;
                }
            }
            throw new IllegalArgumentException("Unknown scheme " + var3_3.getScheme());
        }
lbl33: // 4 sources:
        if ((var6_6 = (InetAddress)Class_31008.Field_31009.getIfPresent((Object)var3_3.getHost())) == null) {
            try {
                var6_6 = InetAddress.getByName(var3_3.getHost());
            }
            catch (UnknownHostException var7_8) {
                var2_2.Method_33152(var7_8);
                return;
            }
            Class_31008.Field_31009.put((Object)var3_3.getHost(), var6_6);
        }
        var7_9 = new Class_23651(var3_3, var2_2);
        ((Class_38936)((Class_38936)((Class_38936)((Class_38936)new Class_38936().channel(Class_47482.class)).group((Class_18163)var1_1)).handler((Class_31885)new Class_43109(var2_2, var4_4, var3_3.getHost(), var5_5))).option(Class_25272.Field_25281, (Object)(13192 & 5032))).Method_38952((InetAddress)var6_6, var5_5).Method_38955().Method_27583(var7_9);
    }

    private void Method_31011() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Cache Method_31012() {
        return Field_31009;
    }
}

