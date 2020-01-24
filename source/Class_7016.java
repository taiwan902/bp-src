/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.util.vector.Matrix4f
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.util.vector.Matrix4f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_7016 {
    private final Class_17924 Field_7017;
    public final Class_19135 Field_7018;
    private final List Field_7019 = Lists.newArrayList();
    private final List Field_7020 = Lists.newArrayList();
    private final List Field_7021 = Lists.newArrayList();
    private Matrix4f Field_7022;
    public final Class_19135 Field_7023;
    private final List Field_7024 = Lists.newArrayList();

    public Class_7016(Class_279 class_279, String string, Class_19135 class_19135, Class_19135 class_191352) {
        this.Field_7017 = new Class_17924(class_279, string);
        this.Field_7023 = class_19135;
        this.Field_7018 = class_191352;
    }

    private void Method_7025() {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16952();
        Class_16867.Method_16944();
        Class_16867.Method_16985();
        Class_16867.Method_16954();
        Class_16867.Method_16931();
        Class_16867.Method_16938();
        Class_16867.Method_16965();
        Class_16867.Method_16963(16648 & 7872);
    }

    public void Method_7026(String string, Object object, int n, int n2) {
        this.Field_7024.add(this.Field_7024.size(), string);
        this.Field_7021.add(this.Field_7021.size(), object);
        this.Field_7019.add(this.Field_7019.size(), n);
        this.Field_7020.add(this.Field_7020.size(), n2);
    }

    public void Method_7027() {
        this.Field_7017.Method_17958();
    }

    public void Method_7028(Matrix4f matrix4f) {
        this.Field_7022 = matrix4f;
    }

    private void Method_7029() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_7030(float f) {
        this.Method_7025();
        this.Field_7023.Method_19155();
        float f2 = this.Field_7018.Field_19142;
        float f3 = this.Field_7018.Field_19141;
        Class_16867.Method_16910(7301 & -32504, 50 & 10308, (int)f2, (int)f3);
        this.Field_7017.Method_17955("DiffuseSampler", this.Field_7023);
        for (int i = 21525 & -24478; i < this.Field_7021.size(); ++i) {
            this.Field_7017.Method_17955((String)this.Field_7024.get(i), this.Field_7021.get(i));
            this.Field_7017.Method_17950("AuxSize" + i).Method_14326(((Integer)this.Field_7019.get(i)).intValue(), ((Integer)this.Field_7020.get(i)).intValue());
        }
        this.Field_7017.Method_17950("ProjMat").Method_14340(this.Field_7022);
        this.Field_7017.Method_17950("InSize").Method_14326(this.Field_7023.Field_19142, this.Field_7023.Field_19141);
        this.Field_7017.Method_17950("OutSize").Method_14326(f2, f3);
        this.Field_7017.Method_17950("Time").Method_14341(f);
        Class_18 class_18 = Class_18.Field_89;
        this.Field_7017.Method_17950("ScreenSize").Method_14326(class_18.Field_80, class_18.Field_44);
        this.Field_7017.Method_17954();
        this.Field_7018.Method_19150();
        this.Field_7018.Method_19152((6180 & 8705) != 0);
        Class_16867.Method_16930((2115 & 392) != 0);
        Class_16867.Method_16923((10385 & -31711) != 0, (-27473 & 257) != 0, (-26351 & 675) != 0, (-16217 & 257) != 0);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(4015 & -32681, Class_29585.Field_29601);
        class_22385.Method_22443(0.0, f3, 359.375 * 1.391304347826087).Method_22424(-32001 & 10751, 8447 & 6655, 4863 & 511, -22273 & 5375).Method_22451();
        class_22385.Method_22443(f2, f3, 0.09523809523809523 * 5250.0).Method_22424(5887 & 16639, 2303 & 255, 18687 & 767, -30977 & 20991).Method_22451();
        class_22385.Method_22443(f2, 0.0, 1.75 * 285.7142857142857).Method_22424(-16129 & 2303, -23297 & 5119, -30977 & 18687, -32513 & 16639).Method_22451();
        class_22385.Method_22443(0.0, 0.0, 5.25 * 95.23809523809524).Method_22424(2303 & 767, -27393 & 16639, 1791 & 511, -22273 & 17151).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16930((809 & -22395) != 0);
        Class_16867.Method_16923((18193 & -24505) != 0, (23681 & -32471) != 0, (16433 & 16133) != 0, (-16087 & 1) != 0);
        this.Field_7017.Method_17957();
        this.Field_7018.Method_19155();
        this.Field_7023.Method_19147();
        for (Object e : this.Field_7021) {
            if (!(e instanceof Class_19135)) continue;
            ((Class_19135)e).Method_19147();
        }
    }

    public Class_17924 Method_7031() {
        return this.Field_7017;
    }
}

