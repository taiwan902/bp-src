/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43180 {
    public final float Field_43181;
    public final Class_26134 Field_43182;
    public final float Field_43183;
    public final float Field_43184;
    public final float Field_43185;
    public final int Field_43186;

    public Class_43180(int n, Class_26134 class_26134) {
        this.Field_43186 = n;
        this.Field_43184 = (float)(n >> (26 & -12136) & (2303 & -19201)) / (2.4375f * 104.61539f);
        this.Field_43181 = (float)(n >> (4114 & 26641) & (5631 & -32001)) / (79.6875f * 3.2f);
        this.Field_43183 = (float)(n >> (11 & -22520) & (511 & 28927)) / (1.5f * 170.0f);
        this.Field_43185 = (float)(n >> (4682 & 16545) & (-29441 & 12799)) / (63.75f * 4.0f);
        this.Field_43182 = class_26134 != null ? class_26134 : Class_26134.Field_26144;
    }

    public boolean Method_43187(Object object) {
        return (object instanceof Class_43180 && ((Class_43180)object).Field_43182 == this.Field_43182 && ((Class_43180)object).Field_43186 == this.Field_43186 ? 457 & -32735 : 8496 & 193) != 0;
    }

    public int Method_43188() {
        return this.Field_43182 != null ? this.Field_43182.hashCode() ^ this.Field_43186 : this.Field_43186;
    }

    private void Method_43189() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_43190() {
        Object[] arrobject = new Object[-16370 & 8706];
        arrobject[-31676 & 8712] = this.Field_43186;
        arrobject[5519 & -16335] = this.Field_43182;
        return String.format("%08X:%s", arrobject);
    }
}

