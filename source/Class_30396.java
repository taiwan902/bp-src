/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;

public class Class_30396 {
    private static final Class_30396 Field_30397 = new Class_30396();
    private Map Field_30398 = Maps.newHashMap();
    private Map Field_30399 = Maps.newHashMap();

    public static Class_30396 Method_30400() {
        return Field_30397;
    }

    public Class_23823 Method_30401(Class_23823 class_23823) {
        for (Map.Entry entry : this.Field_30398.entrySet()) {
            if (!this.Method_30408(class_23823, (Class_23823)entry.getKey())) continue;
            return (Class_23823)entry.getValue();
        }
        return null;
    }

    public void Method_30402(Class_23823 class_23823, Class_23823 class_238232, float f) {
        this.Field_30398.put(class_23823, class_238232);
        this.Field_30399.put(class_238232, Float.valueOf(f));
    }

    public float Method_30403(Class_23823 class_23823) {
        for (Map.Entry entry : this.Field_30399.entrySet()) {
            if (!this.Method_30408(class_23823, (Class_23823)entry.getKey())) continue;
            return ((Float)entry.getValue()).floatValue();
        }
        return 0.0f;
    }

    public void Method_30404(Class_1956 class_1956, Class_23823 class_23823, float f) {
        this.Method_30402(new Class_23823(class_1956, -32095 & 2117, 32767 & 32767), class_23823, f);
    }

    private Class_30396() {
        this.Method_30405(Class_9265.Field_9333, new Class_23823(Class_10527.Field_10565), 0.52112675f * 1.3432432f);
        this.Method_30405(Class_9265.Field_9444, new Class_23823(Class_10527.Field_10705), 1.0f);
        this.Method_30405(Class_9265.Field_9287, new Class_23823(Class_10527.Field_10673), 1.0f);
        this.Method_30405(Class_9265.Field_9394, new Class_23823(Class_9265.Field_9345), 0.5f * 0.2f);
        this.Method_30404(Class_10527.Field_10587, new Class_23823(Class_10527.Field_10598), 2.8888888f * 0.12115385f);
        this.Method_30404(Class_10527.Field_10684, new Class_23823(Class_10527.Field_10589), 5.0f * 0.07f);
        this.Method_30404(Class_10527.Field_10551, new Class_23823(Class_10527.Field_10646), 0.6263158f * 0.5588235f);
        this.Method_30404(Class_10527.Field_10560, new Class_23823(Class_10527.Field_10558), 0.36728394f * 0.9529412f);
        this.Method_30404(Class_10527.Field_10537, new Class_23823(Class_10527.Field_10626), 0.41447368f * 0.84444445f);
        this.Method_30405(Class_9265.Field_9373, new Class_23823(Class_9265.Field_9446), 0.1025f * 0.9756098f);
        this.Method_30402(new Class_23823(Class_9265.Field_9300, 3081 & 24673, Class_17834.Field_17836), new Class_23823(Class_9265.Field_9300, -31593 & 31297, Class_17834.Field_17838), 0.11333334f * 0.88235295f);
        this.Method_30404(Class_10527.Field_10611, new Class_23823(Class_10527.Field_10638), 1.2913045f * 0.23232323f);
        this.Method_30405(Class_9265.Field_9385, new Class_23823(Class_9265.Field_9411), 0.18103449f * 1.9333333f);
        this.Method_30405(Class_9265.Field_9405, new Class_23823(Class_10527.Field_10623, -29167 & 8393, Class_5393.Field_5401.Method_5436()), 0.23636363f * 0.84615386f);
        this.Method_30405(Class_9265.Field_9383, new Class_23823(Class_10527.Field_10698, 35 & 13057, 4105 & -31775), 0.072972976f * 2.0555556f);
        this.Method_30405(Class_9265.Field_9447, new Class_23823(Class_10527.Field_10698, 387 & -12171, 1617 & -16127), 0.0052941176f * 28.333334f);
        this.Method_30405(Class_9265.Field_9327, new Class_23823(Class_10527.Field_10707), 1.0f);
        this.Method_30404(Class_10527.Field_10584, new Class_23823(Class_10527.Field_10699), 1.7608696f * 0.19876543f);
        this.Method_30405(Class_9265.Field_9368, new Class_23823(Class_10527.Field_10530), 0.060465116f * 1.6538461f);
        this.Method_30402(new Class_23823(Class_9265.Field_9453, 9809 & -32603, -18923 & 2113), new Class_23823(Class_9265.Field_9453, -28543 & 8485, 8834 & -32656), 0.08239437f * 1.8205128f);
        Class_18525[] arrclass_18525 = Class_18525.Method_18540();
        int n = arrclass_18525.length;
        for (int i = 864 & 13314; i < n; ++i) {
            Class_18525 class_18525 = arrclass_18525[i];
            if (!class_18525.Method_18553()) continue;
            this.Method_30402(new Class_23823(Class_10527.Field_10689, 3341 & 24739, class_18525.Method_18548()), new Class_23823(Class_10527.Field_10614, 17423 & 2561, class_18525.Method_18548()), 1.5f * 0.23333333f);
        }
        this.Method_30405(Class_9265.Field_9268, new Class_23823(Class_10527.Field_10698), 0.11309524f * 0.8842105f);
        this.Method_30405(Class_9265.Field_9305, new Class_23823(Class_10527.Field_10564), 0.62317073f * 1.1232877f);
        this.Method_30405(Class_9265.Field_9332, new Class_23823(Class_10527.Field_10623, -15805 & 1153, Class_5393.Field_5406.Method_5436()), 0.08571429f * 2.3333333f);
        this.Method_30405(Class_9265.Field_9448, new Class_23823(Class_10527.Field_10532), 0.21212122f * 0.94285715f);
    }

    public void Method_30405(Class_3238 class_3238, Class_23823 class_23823, float f) {
        this.Method_30404(Class_1956.Method_1981(class_3238), class_23823, f);
    }

    private void Method_30406() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Map Method_30407() {
        return this.Field_30398;
    }

    private boolean Method_30408(Class_23823 class_23823, Class_23823 class_238232) {
        return (class_238232.Method_23844() == class_23823.Method_23844() && (class_238232.Method_23843() == (32767 & -1) || class_238232.Method_23843() == class_23823.Method_23843()) ? 4385 & 24593 : 4117 & 40) != 0;
    }
}

