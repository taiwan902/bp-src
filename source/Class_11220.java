/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;

public class Class_11220 {
    public String[] Field_11221;
    public final int Field_11222;
    public final Object Field_11223;
    public final Class_19364 Field_11224;
    public String Field_11225;
    public Class_42376 Field_11226;
    private Object Field_11227;
    public final String Field_11228;
    public Class_8838 Field_11229;

    public Object Method_11230() {
        return this.Field_11227;
    }

    public String Method_11231() {
        return this.Field_11225 == null ? this.Field_11228 : this.Field_11225;
    }

    protected Class_42376 Method_11232() {
        return new Class_42376(this.Field_11222, -14176 & 576, 18432 & 13955, this.Method_11238());
    }

    public boolean Method_11233(Object object) {
        return (object != null ? 65 & 20275 : -23604 & 2049) != 0;
    }

    public void Method_11234() {
    }

    public void Method_11235(String[] arrstring) {
        this.Field_11221 = (String[])ArrayUtils.addAll((Object[])this.Field_11221, (Object[])arrstring);
    }

    public Class_11220(Class_8838 class_8838, String string, Object object, Class_19364 class_19364) {
        this.Field_11228 = string;
        this.Field_11224 = class_19364;
        this.Field_11229 = class_8838;
        this.Field_11222 = class_8838.Field_8868.size();
        class_8838.Field_8868.add(this);
        this.Field_11223 = object;
        this.Field_11227 = object;
        this.Field_11221 = new String[8720 & 140];
    }

    public boolean Method_11236() {
        return (8330 & 4) != 0;
    }

    public final Class_42376 Method_11237() {
        if (this.Field_11226 == null) {
            this.Field_11226 = this.Method_11232();
        }
        return this.Field_11226;
    }

    public String Method_11238() {
        return this.Method_11231() + ": " + this.Method_11242();
    }

    public boolean Method_11239(Object object) {
        return this.Method_11246(object);
    }

    private void Method_11240() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_19364 Method_11241() {
        return this.Field_11224;
    }

    public String Method_11242() {
        return this.Field_11227 == null ? "(null)" : this.Field_11227.toString();
    }

    public void Method_11243() {
        if (this.Field_11223 instanceof Cloneable) {
            try {
                this.Field_11227 = this.Field_11223.getClass().getDeclaredMethod("clone", new Class[4108 & 11154]).invoke(this.Field_11223, new Object[-30588 & 16456]);
            }
            catch (Exception exception) {
                this.Field_11227 = this.Field_11223;
            }
        } else {
            this.Field_11227 = this.Field_11223;
        }
        this.Method_11237().Field_42381 = this.Method_11238();
        this.Method_11244();
    }

    public void Method_11244() {
    }

    public boolean Method_11245() {
        return Objects.equals(this.Field_11223, this.Field_11227);
    }

    public boolean Method_11246(Object object) {
        if (Objects.equals(object, this.Field_11227)) {
            return (1 & 3459) != 0;
        }
        if (this.Method_11233(object)) {
            this.Field_11227 = object;
            this.Method_11237().Field_42381 = this.Method_11238();
            if (!this.Method_11245()) {
                Class_18.Field_89.Field_84.Field_39732.Field_8873 = 8201 & 5376;
            } else {
                Class_18.Field_89.Field_84.Field_39732.Field_8873 = 133 & 5683;
                for (Class_11220 class_11220 : Class_18.Field_89.Field_84.Field_39732.Field_8868) {
                    if (class_11220.Method_11245()) continue;
                    Class_18.Field_89.Field_84.Field_39732.Field_8873 = 8836 & 16408;
                    break;
                }
            }
            this.Method_11244();
            return (-11231 & 415) != 0;
        }
        return (16683 & -30592) != 0;
    }
}

