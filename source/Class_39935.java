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

public class Class_39935
extends Class_4879 {
    private String Field_39936;
    private List Field_39937;
    private int Field_39938;
    private Class_1758 Field_39939;
    private List Field_39940;
    private boolean Field_39941;

    public void Method_39942(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        Class_39935.Method_39956(class_1699, this.Field_39938, this.Field_39939);
    }

    public int Method_39943() {
        return this.Field_39938;
    }

    public static void Method_39944(Class_23823 class_23823) {
        Class_1758 class_1758;
        Class_1699 class_1699 = class_23823.Method_23854("BlockEntityTag", (-5888 & 5120) != 0);
        if (class_1699 != null && class_1699.Method_1715("Patterns", 73 & -14965) && (class_1758 = class_1699.Method_1735("Patterns", -22518 & 4362)).Method_1772() > 0) {
            class_1758.Method_1767(class_1758.Method_1772() - (24723 & 5641));
            if (class_1758.Method_1776()) {
                class_23823.Method_23845().Method_1740("BlockEntityTag");
                if (class_23823.Method_23845().Method_1736()) {
                    class_23823.Method_23869(null);
                }
            }
        }
    }

    public List Method_39945() {
        this.Method_39950();
        return this.Field_39940;
    }

    public void Method_39946(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        this.Field_39938 = class_1699.Method_1738("Base");
        this.Field_39939 = class_1699.Method_1735("Patterns", 1162 & 318);
        this.Field_39940 = null;
        this.Field_39937 = null;
        this.Field_39936 = null;
        this.Field_39941 = 5 & -32493;
    }

    private void Method_39947() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1758 Method_39948() {
        return this.Field_39939;
    }

    public String Method_39949() {
        this.Method_39950();
        return this.Field_39936;
    }

    private void Method_39950() {
        if (this.Field_39940 == null || this.Field_39937 == null || this.Field_39936 == null) {
            if (!this.Field_39941) {
                this.Field_39936 = "";
            } else {
                this.Field_39940 = Lists.newArrayList();
                this.Field_39937 = Lists.newArrayList();
                this.Field_39940.add(Class_29153.Field_29161);
                this.Field_39937.add(Class_5393.Method_5448(this.Field_39938));
                this.Field_39936 = "b" + this.Field_39938;
                if (this.Field_39939 != null) {
                    for (int i = -24320 & 38; i < this.Field_39939.Method_1772(); ++i) {
                        Class_1699 class_1699 = this.Field_39939.Method_1768(i);
                        Class_29153 class_29153 = Class_29153.Method_29293(class_1699.Method_1708("Pattern"));
                        if (class_29153 == null) continue;
                        this.Field_39940.add(class_29153);
                        int n = class_1699.Method_1738("Color");
                        this.Field_39937.add(Class_5393.Method_5448(n));
                        this.Field_39936 = this.Field_39936 + class_29153.Method_29275() + n;
                    }
                }
            }
        }
    }

    public Class_1486 Method_39951() {
        Class_1699 class_1699 = new Class_1699();
        this.Method_39942(class_1699);
        return new Class_24663(this.\u0000strictfp, -22426 & 16398, class_1699);
    }

    public static int Method_39952(Class_23823 class_23823) {
        Class_1699 class_1699 = class_23823.Method_23854("BlockEntityTag", (16968 & 10545) != 0);
        return class_1699 != null && class_1699.Method_1707("Base") ? class_1699.Method_1738("Base") : class_23823.Method_23843();
    }

    public static int Method_39953(Class_23823 class_23823) {
        Class_1699 class_1699 = class_23823.Method_23854("BlockEntityTag", (513 & 6560) != 0);
        return class_1699 != null && class_1699.Method_1707("Patterns") ? class_1699.Method_1735("Patterns", 90 & -26870).Method_1772() : 4128 & 1793;
    }

    public void Method_39954(Class_23823 class_23823) {
        this.Field_39939 = null;
        if (class_23823.Method_23842() && class_23823.Method_23845().Method_1715("BlockEntityTag", 16527 & -31414)) {
            Class_1699 class_1699 = class_23823.Method_23845().Method_1703("BlockEntityTag");
            if (class_1699.Method_1707("Patterns")) {
                this.Field_39939 = (Class_1758)class_1699.Method_1735("Patterns", 2667 & 25994).Method_1762();
            }
            this.Field_39938 = class_1699.Method_1715("Base", 115 & -6813) ? class_1699.Method_1738("Base") : class_23823.Method_23843() & (79 & -23537);
        } else {
            this.Field_39938 = class_23823.Method_23843() & (3135 & 16719);
        }
        this.Field_39940 = null;
        this.Field_39937 = null;
        this.Field_39936 = "";
        this.Field_39941 = 16469 & -19455;
    }

    public List Method_39955() {
        this.Method_39950();
        return this.Field_39937;
    }

    public static void Method_39956(Class_1699 class_1699, int n, Class_1758 class_1758) {
        class_1699.Method_1739("Base", n);
        if (class_1758 != null) {
            class_1699.Method_1744("Patterns", class_1758);
        }
    }
}

