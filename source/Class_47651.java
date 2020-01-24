/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_47651
extends Class_47591 {
    private static final Class_2080 Field_47652 = new Class_2080(Class_47651.Method_47669("\u4691\u4680\u4695\u4691\u4690\u4695\u4680\u4694\u4688\u4688\u4689\u4699\u468c\u4699\u469c\u4688\u4685\u4690\u4690\u4695\u4694\u4690\u4690\u4685\u4698\u4698\u469d\u469c\u4698\u4699\u468d\u4699\u4680"));
    private static final Class_2080 Field_47653 = new Class_2080(Class_47651.Method_47667("\u1522\u1533\u1522\u1523\u1522\u1521\u1532\u1521\u1578\u153b\u1538\u152b\u153a\u152b\u152a\u1579\u1530\u1521\u1522\u1521\u1522\u1523\u1560\u1531\u1528\u152b\u1528\u152b\u152a\u1519\u1538\u152b\u1532\u1533\u1532\u1531\u1532\u1521\u1570\u1523\u1538\u1539"));
    private final List Field_47654;
    private final Class_43558 Field_47655;
    private final Class_35973 Field_47656;
    private final List Field_47657;

    private void Method_47658() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_47659(Class_859 class_859, float f, float f2, float f3) {
        this.Method_47660((Class_43566)class_859, f, f2, f3);
    }

    protected void Method_47660(Class_43566 class_43566, float f, float f2, float f3) {
        if (class_43566.Method_43612()) {
            f2 += (float)(Math.cos((double)class_43566.\u0000= package * (1.6988636363636362 * 1.9130434782608696)) * (1.1842105263157894 * 2.652900463031381) * (0.2727272727272727 * 0.9166666666666667));
        }
        super.\u0000strictfp((Class_859)class_43566, f, f2, f3);
    }

    public Class_47651(Class_8491 class_8491) {
        super(class_8491, new Class_38131(), 2.027778f * 0.24657534f, 1.0f);
        Class_7380 class_7380 = (Class_7380)this.\u0000strictfp.get(2082 & 13140);
        this.Field_47656 = this.\u0000strictfp;
        this.Field_47655 = new Class_43558();
        this.\u0000strictfp((Class_7380)new Class_19353(this));
        Class_32456 class_32456 = new Class_32456(this, this);
        this.\u0000strictfp((Class_7380)class_32456);
        this.Field_47654 = Lists.newArrayList((Iterable)this.\u0000strictfp);
        if (class_7380 instanceof Class_23129) {
            this.\u0000, `(class_7380);
            this.\u0000strictfp((Class_7380)new Class_23129(this.Field_47655));
        }
        this.\u0000, `((Class_7380)class_32456);
        this.\u0000strictfp((Class_7380)new Class_45094(this));
        this.Field_47657 = Lists.newArrayList((Iterable)this.\u0000strictfp);
    }

    private void Method_47661(Class_43566 class_43566) {
        if (class_43566.Method_43594()) {
            this.\u0000strictfp = this.Field_47655;
            this.\u0000strictfp = this.Field_47657;
        } else {
            this.\u0000strictfp = this.Field_47656;
            this.\u0000strictfp = this.Field_47654;
        }
        this.\u0000strictfp = (Class_35973)this.\u0000strictfp;
    }

    public void Method_47662(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_47663((Class_43566)class_859, d, d2, d3, f, f2);
    }

    public void Method_47663(Class_43566 class_43566, double d, double d2, double d3, float f, float f2) {
        this.Method_47661(class_43566);
        super.\u0000strictfp((Class_34093)class_43566, d, d2, d3, f, f2);
    }

    protected Class_2080 Method_47664(Class_1061 class_1061) {
        return this.Method_47665((Class_43566)class_1061);
    }

    protected Class_2080 Method_47665(Class_43566 class_43566) {
        return class_43566.Method_43594() ? Field_47653 : Field_47652;
    }

    public void Method_47666(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_47663((Class_43566)class_34093, d, d2, d3, f, f2);
    }

    private static String Method_47667(String string) {
        int n = 26729;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47651.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47668(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_47663((Class_43566)class_1061, d, d2, d3, f, f2);
    }

    private static String Method_47669(String string) {
        int n = 11000;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47651.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_47670(Class_34093 class_34093) {
        return this.Method_47665((Class_43566)class_34093);
    }
}

