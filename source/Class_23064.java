/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;

public class Class_23064
implements Class_1486 {
    private String Field_23065;
    private String Field_23066 = "";
    private Collection Field_23067;
    private String Field_23068 = "";
    private int Field_23069;
    private String Field_23070 = "";
    private int Field_23071;
    private int Field_23072;
    private String Field_23073 = "";

    public int Method_23074() {
        return this.Field_23071;
    }

    public String Method_23075() {
        return this.Field_23073;
    }

    public Class_23064(Class_22057 class_22057, Collection collection, int n) {
        this.Field_23065 = Class_31355.Field_31361.Field_31358;
        this.Field_23071 = -1 & -1;
        this.Field_23067 = Lists.newArrayList();
        if (n != (343 & 4611) && n != (196 & -29644)) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.Field_23069 = n;
        this.Field_23073 = class_22057.Method_22075();
        this.Field_23067.addAll(collection);
    }

    public void Method_23076(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_23073);
        class_29900.Method_29949(this.Field_23069);
        if (this.Field_23069 == 0 || this.Field_23069 == (-28666 & 8459)) {
            class_29900.Method_29960(this.Field_23070);
            class_29900.Method_29960(this.Field_23068);
            class_29900.Method_29960(this.Field_23066);
            class_29900.Method_29949(this.Field_23072);
            class_29900.Method_29960(this.Field_23065);
            class_29900.Method_29949(this.Field_23071);
        }
        if (this.Field_23069 == 0 || this.Field_23069 == (35 & 13123) || this.Field_23069 == (2061 & 1606)) {
            class_29900.Method_29982(this.Field_23067.size());
            for (String string : this.Field_23067) {
                class_29900.Method_29960(string);
            }
        }
    }

    public void Method_23077(Class_10954 class_10954) {
        this.Method_23084((Class_14856)class_10954);
    }

    public Class_23064(Class_22057 class_22057, int n) {
        this.Field_23065 = Class_31355.Field_31361.Field_31358;
        this.Field_23071 = -1 & -1;
        this.Field_23067 = Lists.newArrayList();
        this.Field_23073 = class_22057.Method_22075();
        this.Field_23069 = n;
        if (n == 0 || n == (8226 & 582)) {
            this.Field_23070 = class_22057.Method_22080();
            this.Field_23068 = class_22057.Method_22083();
            this.Field_23066 = class_22057.Method_22089();
            this.Field_23072 = class_22057.Method_22077();
            this.Field_23065 = class_22057.Method_22088().Field_31358;
            this.Field_23071 = class_22057.Method_22081().Method_5548();
        }
        if (n == 0) {
            this.Field_23067.addAll(class_22057.Method_22087());
        }
    }

    public String Method_23078() {
        return this.Field_23068;
    }

    public Class_23064() {
        this.Field_23065 = Class_31355.Field_31361.Field_31358;
        this.Field_23071 = -1 & -1;
        this.Field_23067 = Lists.newArrayList();
    }

    public String Method_23079() {
        return this.Field_23070;
    }

    public String Method_23080() {
        return this.Field_23065;
    }

    public Collection Method_23081() {
        return this.Field_23067;
    }

    private void Method_23082() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23083(Class_29900 class_29900) {
        this.Field_23073 = class_29900.Method_29991(-15852 & 1297);
        this.Field_23069 = class_29900.Method_29944();
        if (this.Field_23069 == 0 || this.Field_23069 == (-24526 & 17862)) {
            this.Field_23070 = class_29900.Method_29991(-32736 & 176);
            this.Field_23068 = class_29900.Method_29991(16404 & 304);
            this.Field_23066 = class_29900.Method_29991(-20172 & 2064);
            this.Field_23072 = class_29900.Method_29944();
            this.Field_23065 = class_29900.Method_29991(18017 & 428);
            this.Field_23071 = class_29900.Method_29944();
        }
        if (this.Field_23069 == 0 || this.Field_23069 == (11267 & 519) || this.Field_23069 == (4612 & -22162)) {
            int n = class_29900.Method_30004();
            for (int i = 26368 & 7; i < n; ++i) {
                this.Field_23067.add(class_29900.Method_29991(6188 & 1067));
            }
        }
    }

    public void Method_23084(Class_14856 class_14856) {
        class_14856.Method_14857(this);
    }

    public String Method_23085() {
        return this.Field_23066;
    }

    public int Method_23086() {
        return this.Field_23069;
    }

    public int Method_23087() {
        return this.Field_23072;
    }
}

