/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class Class_43742
extends Class_42759 {
    private int Field_43743 = -1 & -1;
    static final Class_20861 Field_43744 = Class_20861.Method_20865(Class_43742.class.getName() + Class_43742.Method_43753("\u4026\u4002\u4004\u4000\u4000\u4004\u4004"));
    private Object Field_43745;
    private final Class_28373 Field_43746 = new Class_28373();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void Method_43747(Class_39158 class_39158) {
        Class_18236 class_18236 = Class_18236.Method_18239();
        this.Field_43746.Method_28388();
        this.Method_43752(class_39158, this.internalBuffer(), class_18236);
        this.decodeLast(class_39158, (Class_22553)this.Field_43746, (List)class_18236);
        try {
            if (this.cumulation != null) {
                this.cumulation.release();
                this.cumulation = null;
            }
            int n = class_18236.size();
            for (int i = 30784 & -31716; i < n; ++i) {
                class_39158.Method_39183(class_18236.get(i));
            }
            if (n > 0) {
                class_39158.Method_39174();
            }
            class_39158.Method_39169();
            return;
        }
        finally {
            class_18236.Method_18247();
        }
        catch (Class_20861 class_20861) {
            class_20861.Method_20869(Field_43744);
            try {
                if (this.cumulation != null) {
                    this.cumulation.release();
                    this.cumulation = null;
                }
                int n = class_18236.size();
                for (int i = 26817 & -32224; i < n; ++i) {
                    class_39158.Method_39183(class_18236.get(i));
                }
                if (n > 0) {
                    class_39158.Method_39174();
                }
                class_39158.Method_39169();
                return;
            }
            finally {
                class_18236.Method_18247();
            }
            catch (Class_32043 class_32043) {
                try {
                    throw class_32043;
                    catch (Exception exception) {
                        throw new Class_32043(exception);
                    }
                }
                catch (Throwable throwable) {
                    try {
                        if (this.cumulation != null) {
                            this.cumulation.release();
                            this.cumulation = null;
                        }
                        int n = class_18236.size();
                        for (int i = 28674 & -28984; i < n; ++i) {
                            class_39158.Method_39183(class_18236.get(i));
                        }
                        if (n > 0) {
                            class_39158.Method_39174();
                        }
                        class_39158.Method_39169();
                        throw throwable;
                    }
                    finally {
                        class_18236.Method_18247();
                    }
                }
            }
        }
    }

    protected void Method_43748(Object object) {
        this.Method_43750();
        this.Method_43749(object);
    }

    protected Class_43742(Object object) {
        this.Field_43745 = object;
    }

    protected Object Method_43749(Object object) {
        Object object2 = this.Field_43745;
        this.Field_43745 = object;
        return object2;
    }

    protected void Method_43750() {
        this.Field_43743 = this.internalBuffer().Method_22582();
    }

    protected Class_43742() {
        this(null);
    }

    private void Method_43751() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void Method_43752(Class_39158 var1_1, Class_22553 var2_2, List var3_3) {
        this.Field_43746.Method_28438(var2_2);
        try {
            do lbl-1000: // 3 sources:
            {
                block8 : {
                    if (var2_2.Method_22583() == false) return;
                    var4_4 = this.Field_43743 = var2_2.Method_22582();
                    var5_7 = var3_3.size();
                    var6_8 = this.Field_43745;
                    var7_9 = var2_2.Method_22564();
                    try {
                        this.decode(var1_1, (Class_22553)this.Field_43746, var3_3);
                        if (var1_1.Method_39164()) {
                            return;
                        }
                        if (var5_7 != var3_3.size()) break block8;
                        if (var7_9 != var2_2.Method_22564() || var6_8 != this.Field_43745) ** GOTO lbl-1000
                        throw new Class_32043(Class_22304.Method_22309(this.getClass()) + ".decode() must consume the inbound data or change its state if it did not decode anything.");
                    }
                    catch (Class_20861 var8_10) {
                        var8_10.Method_20869(Class_43742.Field_43744);
                        if (var1_1.Method_39164()) {
                            return;
                        }
                        var9_11 = this.Field_43743;
                        if (var9_11 < 0) return;
                        var2_2.Method_22590(var9_11);
                        return;
                    }
                }
                if (var4_4 != var2_2.Method_22582() || var6_8 != this.Field_43745) continue;
                throw new Class_32043(Class_22304.Method_22309(this.getClass()) + ".decode() method must consume the inbound data or change its state if it decoded something.");
            } while (!this.isSingleDecode());
            return;
        }
        catch (Class_32043 var4_5) {
            throw var4_5;
        }
        catch (Throwable var4_6) {
            throw new Class_32043(var4_6);
        }
    }

    private static String Method_43753(String string) {
        int n = 3634;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43742.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Object Method_43754() {
        return this.Field_43745;
    }
}

