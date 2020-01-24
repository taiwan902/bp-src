/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class Class_32341
extends Random {
    private static final AtomicLong Field_32342;
    private static final Class_6113 Field_32343;
    private long Field_32344;
    boolean Field_32345 = 4379 & 9281;
    private static long Field_32346;

    public void Method_32347(long l) {
        if (this.Field_32345) {
            throw new UnsupportedOperationException();
        }
        this.Field_32344 = (l ^ -8119964255820712209L & 25768552061L) & (-1413285858064203777L & 0xFFFFFFFFFFFFL);
    }

    private void Method_32348() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_32341() {
        super(Class_32341.Method_32352());
    }

    static Class_6113 Method_32349() {
        return Field_32343;
    }

    public static Class_32341 Method_32350() {
        return Class_32728.Method_32743().Method_32748();
    }

    protected int Method_32351(int n) {
        this.Field_32344 = this.Field_32344 * (5730941704797480557L & -5730941680136427923L) + (-5833074354753093605L & 5833074353158751695L) & (0xFFFFFFFFFFFFL & 3028107799453237247L);
        return (int)(this.Field_32344 >>> (2229 & 21616) - n);
    }

    private static long Method_32352() {
        long l;
        long l2;
        long l3;
        long l4 = System.nanoTime();
        while (!Field_32342.compareAndSet(l3, l2 = (l = (l3 = Field_32342.get()) != (5144390253553255424L & 211882320L) ? l3 : Class_32341.Method_32353()) * (-5789944716540248139L & 181783497553477045L))) {
        }
        if (l3 == (-5825965962641241472L & 613684224L) && Field_32343.Method_6131()) {
            Object[] arrobject = new Object[4518 & 17426];
            arrobject[-32188 & 17666] = l;
            arrobject[16657 & 69] = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l4);
            Field_32343.Method_6130(String.format("-Dinternal.io.netty.initialSeedUniquifier: 0x%016x (took %d ms)", arrobject));
        }
        return l2 ^ System.nanoTime();
    }

    static {
        Field_32343 = Class_10201.Method_10203(Class_32341.class);
        Field_32342 = new AtomicLong();
    }

    /*
     * Exception decompiling
     */
    public static synchronized long Method_32353() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:427)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:479)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:696)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:797)
        // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:225)
        // org.benf.cfr.reader.Driver.doJar(Driver.java:109)
        // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
        // org.benf.cfr.reader.Main.main(Main.java:48)
        throw new IllegalStateException("Decompilation failed");
    }
}

