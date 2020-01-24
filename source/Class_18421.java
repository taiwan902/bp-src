/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;

public class Class_18421 {
    private int Field_18422 = 9471 & 2303;
    int Field_18423;
    private double Field_18424 = 1.0;
    private long Field_18425 = 571754504L & 1103204884L;
    private ArrayDeque Field_18426 = new ArrayDeque();
    int Field_18427;
    private final Class_18 Field_18428 = Class_18.Field_89;
    private final Class_8264 Field_18429;

    private int Method_18430() {
        long l;
        ArrayDeque arrayDeque = this.Field_18426;
        long l2 = System.currentTimeMillis();
        long l3 = l2 - (5303627719244923880L & 67386360L);
        long l4 = l2 + (5207118109428679676L & 537799656L);
        while (!(arrayDeque.isEmpty() || (l = ((Long)arrayDeque.peek()).longValue()) >= l3 && l <= l4)) {
            arrayDeque.poll();
        }
        return arrayDeque.size();
    }

    public void Method_18431() {
        this.Field_18425 = System.currentTimeMillis();
        this.Field_18426.add(this.Field_18425);
    }

    public void Method_18432(int n, int n2, int n3) {
        boolean bl = this.Field_18429.Method_8279();
        String string = Class_39702.Method_39914(this.Field_18429.Method_8274());
        long l = System.currentTimeMillis() - this.Field_18425;
        if (l > (5961035234539569851L & 301990020L)) {
            l = 67108992L & 1371742857L;
        }
        if (bl) {
            this.Field_18422 = Math.min(9471 & 16639, (int)((9133143767761695979L & 1423000342L) * l));
            this.Field_18424 = Math.max(0.0, 1.0 - (double)l / (0.41414141414141414 * 309.0731707317073));
        } else {
            this.Field_18422 = Math.max(-15999 & 4176, (4607 & 8447) - (int)((-6197136170979548862L & 6197136168968083474L) * l));
            this.Field_18424 = Math.min(1.0, (double)l / (5.533333333333333 * 23.132530120481928));
        }
        int n4 = (Boolean)this.Field_18428.Field_84.Field_39732.Field_8853.\u0000strictfp() != false ? 1878 & 4118 : 2319 & -28433;
        Class_1551.Method_1558(n + this.Field_18423, n2 + this.Field_18427, n + this.Field_18423 + (38 & 4906), n2 + this.Field_18427 + n4, (2015791736 & 2090336514) + (this.Field_18422 << (-24559 & 7730)) + (this.Field_18422 << (8 & 665)) + this.Field_18422);
        int n5 = n3 >> (-30640 & 51) & (-24321 & 3327);
        int n6 = n3 >> (2696 & -31733) & (5119 & -14081);
        int n7 = n3 & (6399 & 9215);
        this.Field_18428.Field_27.Method_28692(string, n + this.Field_18423 + (6312 & 1560), n2 + this.Field_18427 + (-25852 & 16525), (-8384496 & -14472061) + ((int)((double)n5 * this.Field_18424) << (147 & 19508)) + ((int)((double)n6 * this.Field_18424) << (-26850 & 233)) + (int)((double)n7 * this.Field_18424));
        if (((Boolean)this.Field_18428.Field_84.Field_39732.Field_8853.\u0000strictfp()).booleanValue()) {
            String string2 = "" + this.Method_18430() + " CPS";
            int n8 = this.Field_18428.Field_27.Method_28715(string2);
            GL11.glScalef((float)(0.06818182f * 7.3333335f), (float)(0.31707317f * 1.5769231f), (float)(0.7162162f * 0.6981132f));
            this.Field_18428.Field_27.Method_28692(string2, (n + this.Field_18423 + (-22891 & 307)) * (547 & 154) - n8 / (20490 & -24478), (n2 + this.Field_18427 + (4110 & -31634)) * (12450 & 538), (-14090200 & -12279807) + ((int)(206.42857142857142 * 1.2352941176470589 * this.Field_18424) << (5177 & -23850)) + ((int)(170.0 * 1.5 * this.Field_18424) << (16392 & -30691)) + (int)(0.7866666666666666 * 324.1525423728814 * this.Field_18424));
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        }
    }

    public Class_18421(Class_8264 class_8264, int n, int n2) {
        this.Field_18429 = class_8264;
        this.Field_18423 = n;
        this.Field_18427 = n2;
    }

    private void Method_18433() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

