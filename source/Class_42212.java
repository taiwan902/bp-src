/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class Class_42212
extends Class_36303 {
    private final Class_18956 Field_42213 = Class_18956.Method_18960(this, Class_42212.class, "I");

    protected Class_42212() {
    }

    public boolean Method_42214(Object object) {
        return this.Field_42213.Method_18962(object);
    }

    protected abstract void Method_42215(Class_39158 var1, Object var2, List var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void Method_42216(Class_39158 var1_1, Object var2_2, Class_37748 var3_3) {
        block14 : {
            var4_4 = null;
            try {
                if (this.Method_42214(var2_2)) {
                    var4_4 = Class_18236.Method_18239();
                    var5_5 = var2_2;
                    try {
                        this.Method_42215(var1_1, var5_5, var4_4);
                    }
                    finally {
                        Class_24761.Method_24765(var5_5);
                    }
                    if (var4_4.isEmpty()) {
                        var4_4.Method_18247();
                        var4_4 = null;
                        throw new Class_47970(Class_22304.Method_22312(this) + " must produce at least one message.");
                    }
                } else {
                    var1_1.Method_39163(var2_2, var3_3);
                }
                if (var4_4 == null) return;
            }
            catch (Class_47970 var5_7) {
                try {
                    throw var5_7;
                    catch (Throwable var5_8) {
                        throw new Class_47970(var5_8);
                    }
                }
                catch (Throwable var10_14) {
                    block16 : {
                        block17 : {
                            block15 : {
                                if (var4_4 == null) throw var10_14;
                                var11_15 = var4_4.size() - (8193 & -32565);
                                if (var11_15 != 0) break block15;
                                var1_1.Method_39163(var4_4.get(579 & -25584), var3_3);
                                break block16;
                            }
                            if (var11_15 <= 0) break block16;
                            var12_16 = var1_1.Method_39161();
                            var13_17 = var3_3 == var12_16 ? 27139 & 4373 : 0 & 4480;
                            break block17;
lbl50: // 2 sources:
                            for (var8_12 = -15209 & 11040; var8_12 < var5_6; ++var8_12) {
                                var9_13 = var7_11 != 0 ? var6_10 : var1_1.Method_39177();
                                var1_1.Method_39163(var4_4.get(var8_12), var9_13);
                            }
                            var1_1.Method_39163(var4_4.get(var5_6), var3_3);
lbl57: // 3 sources:
                            var4_4.Method_18247();
                            return;
                        }
                        for (var14_18 = 1 & 9840; var14_18 < var11_15; ++var14_18) {
                            var15_19 = var13_17 != 0 ? var12_16 : var1_1.Method_39177();
                            var1_1.Method_39163(var4_4.get(var14_18), var15_19);
                        }
                        var1_1.Method_39163(var4_4.get(var11_15), var3_3);
                    }
                    var4_4.Method_18247();
                    throw var10_14;
                }
            }
            var5_6 = var4_4.size() - (19 & 16457);
            if (var5_6 != 0) break block14;
            var1_1.Method_39163(var4_4.get(-31448 & 0), var3_3);
            ** GOTO lbl57
        }
        if (var5_6 <= 0) ** GOTO lbl57
        var6_10 = var1_1.Method_39161();
        var7_11 = var3_3 == var6_10 ? 24925 & -30717 : 20497 & 1920;
        ** GOTO lbl50
    }

    private void Method_42217() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

