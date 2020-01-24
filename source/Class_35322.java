/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.Matrix4f
 */
import internal.org.lwjgl.util.vector.Matrix4f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35322
extends Matrix4f {
    public Class_35322() {
        this.m33 = 0.0f;
        this.m32 = 0.0f;
        this.m31 = 0.0f;
        this.m30 = 0.0f;
        this.m23 = 0.0f;
        this.m22 = 0.0f;
        this.m21 = 0.0f;
        this.m20 = 0.0f;
        this.m13 = 0.0f;
        this.m12 = 0.0f;
        this.m11 = 0.0f;
        this.m10 = 0.0f;
        this.m03 = 0.0f;
        this.m02 = 0.0f;
        this.m01 = 0.0f;
        this.m00 = 0.0f;
    }

    private void Method_35323() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_35322(float[] arrf) {
        this.m00 = arrf[2049 & -28380];
        this.m01 = arrf[5673 & 8211];
        this.m02 = arrf[-23414 & 34];
        this.m03 = arrf[24979 & 5219];
        this.m10 = arrf[-29692 & 260];
        this.m11 = arrf[-18299 & 7];
        this.m12 = arrf[-13177 & 806];
        this.m13 = arrf[19079 & 8247];
        this.m20 = arrf[9227 & 56];
        this.m21 = arrf[-16309 & 3753];
        this.m22 = arrf[8458 & 7739];
        this.m23 = arrf[683 & -24305];
        this.m30 = arrf[4366 & -22500];
        this.m31 = arrf[4461 & -30707];
        this.m32 = arrf[159 & 21326];
        this.m33 = arrf[16591 & 9743];
    }
}

