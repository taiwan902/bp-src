/*
 * Decompiled with CFR 0.145.
 */
import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47630
extends Class_23424 {
    private final int Field_47631;
    private boolean Field_47632 = 2052 & 12435;
    private final int[] Field_47633;
    private final int Field_47634;

    public void Method_47635() {
        if (Class_19426.Method_19570()) {
            if (!this.Field_47632) {
                Class_8049.Method_8081(this.\u0000strictfp(), this.Field_47634, this.Field_47631, this);
                this.Field_47632 = -29115 & 185;
            }
            Class_8049.Method_8064(this.\u0000strictfp(), this.Field_47633, this.Field_47634, this.Field_47631, this);
        } else {
            Class_18695.Method_18704(this.\u0000strictfp(), this.Field_47633, this.Field_47634, this.Field_47631);
        }
    }

    public Class_47630(int n, int n2) {
        this.Field_47634 = n;
        this.Field_47631 = n2;
        this.Field_47633 = new int[n * n2 * (16387 & -20469)];
        if (Class_19426.Method_19570()) {
            Class_8049.Method_8081(this.\u0000strictfp(), n, n2, this);
            this.Field_47632 = 5897 & 16419;
        } else {
            Class_18695.Method_18715(this.\u0000strictfp(), n, n2);
        }
    }

    public void Method_47636(Class_279 class_279) {
    }

    public int[] Method_47637() {
        return this.Field_47633;
    }

    private void Method_47638() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_47630(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(-32365 & 12352, 1091 & 8720, bufferedImage.getWidth(), bufferedImage.getHeight(), this.Field_47633, 2577 & 16388, bufferedImage.getWidth());
        this.Method_47635();
    }
}

