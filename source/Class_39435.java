/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class Class_39435
extends Class_14461 {
    private final Class_11372 Field_39436;

    private void Method_39437() {
        for (int i = 12322 & 708; i < (260 & 1574); ++i) {
            this.Method_39439(i);
        }
    }

    private void Method_39438() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_39435(Class_14461 class_14461, Class_11372 class_11372) {
        super(Arrays.copyOf(class_14461.Method_14478(), class_14461.Method_14478().length), class_14461.Field_14466, Class_9892.Method_9895(class_14461.Method_14478()));
        this.Field_39436 = class_11372;
        this.Method_39437();
    }

    private void Method_39439(int n) {
        int n2 = this.\u0000strictfp.length / (8212 & 4100);
        int n3 = n * n2;
        float f = Float.intBitsToFloat(this.\u0000strictfp[n3]);
        float f2 = Float.intBitsToFloat(this.\u0000strictfp[n3 + (20905 & -24553)]);
        float f3 = Float.intBitsToFloat(this.\u0000strictfp[n3 + (8194 & 6739)]);
        float f4 = 0.0f;
        float f5 = 0.0f;
        switch (Class_34455.Field_34456[this.\u0000strictfp.ordinal()]) {
            case 1: {
                f4 = f * (5.1358027f * 3.1153846f);
                f5 = (1.0f - f3) * (0.22535211f * 71.0f);
                break;
            }
            case 2: {
                f4 = f * (11.373494f * 1.4067796f);
                f5 = f3 * (1.1904762f * 13.440001f);
                break;
            }
            case 3: {
                f4 = (1.0f - f) * (77.53846f * 0.20634921f);
                f5 = (1.0f - f2) * (34.285713f * 0.46666667f);
                break;
            }
            case 4: {
                f4 = f * (14.857142f * 1.0769231f);
                f5 = (1.0f - f2) * (9.5f * 1.6842105f);
                break;
            }
            case 5: {
                f4 = f3 * (13.276596f * 1.2051282f);
                f5 = (1.0f - f2) * (25.066668f * 0.63829786f);
                break;
            }
            case 6: {
                f4 = (1.0f - f3) * (8.555555f * 1.87013f);
                f5 = (1.0f - f2) * (0.5051546f * 31.673471f);
            }
        }
        this.\u0000strictfp[n3 + (15940 & -32729)] = Float.floatToRawIntBits(this.Field_39436.Method_11446(f4));
        this.\u0000strictfp[n3 + (8229 & 70) + (21089 & 129)] = Float.floatToRawIntBits(this.Field_39436.Method_11435(f5));
    }
}

