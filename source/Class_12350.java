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
import net.minecraft.client.renderer.block.model.ModelBlock;

public class Class_12350 {
    private final List Field_12351 = Lists.newArrayListWithCapacity((int)(7430 & 142));
    private boolean Field_12352;
    private Class_11372 Field_12353;
    private final List Field_12354 = Lists.newArrayList();
    private final boolean Field_12355;
    private Class_15852 Field_12356;

    private Class_12350(boolean bl, boolean bl2, Class_15852 class_15852) {
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n = arrclass_4595.length;
        for (int i = 7392 & 16900; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            this.Field_12351.add(Lists.newArrayList());
        }
        this.Field_12355 = bl;
        this.Field_12352 = bl2;
        this.Field_12356 = class_15852;
    }

    public Class_12350(ModelBlock modelBlock) {
        this(modelBlock.isAmbientOcclusion(), modelBlock.isGui3d(), modelBlock.func_181682_g());
    }

    private void Method_12357(Class_31211 class_31211, Class_11372 class_11372, Class_4595 class_4595) {
        for (Class_14461 class_14461 : class_31211.Method_31218(class_4595)) {
            this.Method_12362(class_4595, new Class_39435(class_14461, class_11372));
        }
    }

    private void Method_12358(Class_31211 class_31211, Class_11372 class_11372) {
        for (Class_14461 class_14461 : class_31211.Method_31214()) {
            this.Method_12359(new Class_39435(class_14461, class_11372));
        }
    }

    public Class_12350 Method_12359(Class_14461 class_14461) {
        this.Field_12354.add(class_14461);
        return this;
    }

    private void Method_12360() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31211 Method_12361() {
        if (this.Field_12353 == null) {
            throw new RuntimeException("Missing particle!");
        }
        return new Class_35790(this.Field_12354, this.Field_12351, this.Field_12355, this.Field_12352, this.Field_12353, this.Field_12356);
    }

    public Class_12350 Method_12362(Class_4595 class_4595, Class_14461 class_14461) {
        ((List)this.Field_12351.get(class_4595.ordinal())).add(class_14461);
        return this;
    }

    public Class_12350 Method_12363(Class_11372 class_11372) {
        this.Field_12353 = class_11372;
        return this;
    }

    public Class_12350(Class_31211 class_31211, Class_11372 class_11372) {
        this(class_31211.Method_31213(), class_31211.Method_31212(), class_31211.Method_31215());
        this.Field_12353 = class_31211.Method_31216();
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n = arrclass_4595.length;
        for (int i = -32443 & 13312; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            this.Method_12357(class_31211, class_11372, class_4595);
        }
        this.Method_12358(class_31211, class_11372);
    }
}

