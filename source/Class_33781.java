/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Class_33781 {
    public boolean Field_33782;
    public float Field_33783;
    private Map Field_33784 = Maps.newHashMap();
    public boolean Field_33785 = 16389 & 7041;
    public int Field_33786 = 32 & 18604;
    public int Field_33787 = 19268 & 8280;
    public List Field_33788 = Lists.newArrayList();

    protected void Method_33789(String string, int n, int n2) {
        this.Field_33784.put(string, new Class_28853(n, n2));
    }

    public void Method_33790(Class_859 class_859, float f, float f2, float f3) {
    }

    private void Method_33791() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33792(Class_33781 class_33781) {
        this.Field_33783 = class_33781.Field_33783;
        this.Field_33782 = class_33781.Field_33782;
        this.Field_33785 = class_33781.Field_33785;
    }

    public static void Method_33793(Class_31961 class_31961, Class_31961 class_319612) {
        class_319612.Field_31984 = class_31961.Field_31984;
        class_319612.Field_31968 = class_31961.Field_31968;
        class_319612.Field_31969 = class_31961.Field_31969;
        class_319612.Field_31976 = class_31961.Field_31976;
        class_319612.Field_31971 = class_31961.Field_31971;
        class_319612.Field_31972 = class_31961.Field_31972;
    }

    public void Method_33794(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public Class_31961 Method_33795(Random random) {
        return (Class_31961)this.Field_33788.get(random.nextInt(this.Field_33788.size()));
    }

    public Class_28853 Method_33796(String string) {
        return (Class_28853)this.Field_33784.get(string);
    }

    public void Method_33797(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
    }
}

