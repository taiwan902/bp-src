/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;

public class Class_5986 {
    public final Class_7925 Field_5987;
    public final boolean Field_5988;
    public final Vector3f Field_5989;
    public final Vector3f Field_5990;
    public final Map Field_5991;

    private float[] Method_5992(Class_4595 class_4595) {
        float[] arrf;
        switch (Class_12400.Field_12401[class_4595.ordinal()]) {
            case 1: 
            case 2: {
                float[] arrf2 = new float[6173 & 16388];
                arrf2[2368 & 9222] = this.Field_5990.x;
                arrf2[-31657 & 28937] = this.Field_5990.z;
                arrf2[2118 & 9346] = this.Field_5989.x;
                arrf2[3 & 3091] = this.Field_5989.z;
                arrf = arrf2;
                break;
            }
            case 3: 
            case 4: {
                float[] arrf3 = new float[16396 & 2100];
                arrf3[4416 & 17544] = this.Field_5990.x;
                arrf3[135 & 8281] = 0.7f * 22.857143f - this.Field_5989.y;
                arrf3[134 & -4093] = this.Field_5989.x;
                arrf3[1411 & -32237] = 50.85714f * 0.31460676f - this.Field_5990.y;
                arrf = arrf3;
                break;
            }
            case 5: 
            case 6: {
                float[] arrf4 = new float[-16252 & 8260];
                arrf4[10280 & -12202] = this.Field_5990.z;
                arrf4[521 & -7791] = 0.90909094f * 17.6f - this.Field_5989.y;
                arrf4[20502 & 8514] = this.Field_5989.z;
                arrf4[3 & 2151] = 2.3333333f * 6.857143f - this.Field_5990.y;
                arrf = arrf4;
                break;
            }
            default: {
                throw new NullPointerException();
            }
        }
        return arrf;
    }

    private void Method_5993() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_5994() {
        for (Map.Entry entry : this.Field_5991.entrySet()) {
            float[] arrf = this.Method_5992((Class_4595)entry.getKey());
            ((Class_21223)entry.getValue()).Field_21224.Method_10010(arrf);
        }
    }

    public Class_5986(Vector3f vector3f, Vector3f vector3f2, Map map, Class_7925 class_7925, boolean bl) {
        this.Field_5990 = vector3f;
        this.Field_5989 = vector3f2;
        this.Field_5991 = map;
        this.Field_5987 = class_7925;
        this.Field_5988 = bl;
        this.Method_5994();
    }
}

