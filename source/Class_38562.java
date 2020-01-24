/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_38562
implements Class_31554 {
    final long Field_38563;
    final String Field_38564 = "Instalowanie najnowszego klienta! %d%% [@]";
    long Field_38565;
    long Field_38566;
    final Class_23208 Field_38567;

    Class_38562(long l, Class_23208 class_23208) {
        this.Field_38563 = l;
        this.Field_38567 = class_23208;
        this.Field_38566 = 7372629976610505814L & -7372629977141346135L;
        this.Field_38565 = this.Field_38563;
        this.Field_38564 = "Instalowanie najnowszego klienta! %d%% [@]";
    }

    public void Method_38568(long l) {
        long l2 = System.currentTimeMillis();
        if (l2 - this.Field_38566 > (4516541291584308530L & 1278356022L)) {
            Object[] arrobject = new Object[1035 & -32639];
            arrobject[-14720 & 114] = l * (-8276171819824688513L & 202738916L) / this.Field_38565;
            this.Field_38567.Method_23221(String.format("Instalowanie najnowszego klienta! %d%% [@]", arrobject));
            this.Field_38566 = l2;
        }
    }

    private void Method_38569() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

