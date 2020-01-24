/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_11885 {
    int Field_11886 = 9920 & -28416;
    public int Field_11887 = 10305 & -32238;
    private int Field_11888 = -1 & -1;
    public final ArrayList Field_11889 = new ArrayList();
    int Field_11890 = 14180 & 25;
    int[] Field_11891 = new int[792 & -32656];
    private static final Logger Field_11892 = LogManager.getLogger();
    Class_12423[] Field_11893 = new Class_12423[-31467 & 4144];
    private int Field_11894 = -1 & -1;
    private List Field_11895 = Lists.newArrayList();

    public String Method_11896() {
        String string = "format: " + this.Field_11890 + " elements: ";
        for (int i = 4422 & 17544; i < this.Field_11890; ++i) {
            string = string + this.Field_11893[i].Method_12432();
            if (i == this.Field_11890 - (4225 & -32443)) continue;
            string = string + " ";
        }
        return string;
    }

    public Class_11885 Method_11897(Class_12423 class_12423) {
        if (class_12423.Method_12429() && this.Method_11905()) {
            Field_11892.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.Method_11909(class_12423);
        this.Method_11899(this.Field_11887);
        switch (Class_33861.Field_33862[class_12423.Method_12434().ordinal()]) {
            case 1: {
                this.Field_11894 = this.Field_11887;
                break;
            }
            case 2: {
                this.Field_11888 = this.Field_11887;
                break;
            }
            case 3: {
                this.Field_11895.add(class_12423.Method_12438(), this.Field_11887);
            }
        }
        this.Field_11887 += class_12423.Method_12435();
        return this;
    }

    public boolean Method_11898(int n) {
        return (this.Field_11895.size() - (1185 & 8213) >= n ? 10537 & 579 : 1 & -31294) != 0;
    }

    private void Method_11899(int n) {
        this.Field_11891[this.Field_11886] = n;
        this.Field_11886 += 1035 & 18565;
    }

    public boolean Method_11900(Object object) {
        if (this == object) {
            return (1029 & -14245) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Class_11885 class_11885 = (Class_11885)object;
            return (this.Field_11887 != class_11885.Field_11887 ? -28664 & 2308 : (!this.Field_11893.equals(class_11885.Field_11893) ? 3664 & -32479 : (int)(this.Field_11891.equals(class_11885.Field_11891) ? 1 : 0))) != 0;
        }
        return (-29088 & 8202) != 0;
    }

    public Class_11885(Class_11885 class_11885) {
        this();
        for (int i = 4224 & 9515; i < class_11885.Method_11907(); ++i) {
            this.Method_11897(class_11885.Method_11904(i));
        }
        this.Field_11887 = class_11885.Method_11903();
    }

    public int Method_11901() {
        return this.Field_11894;
    }

    public int Method_11902() {
        int n = this.Field_11893.hashCode();
        n = (9631 & 20511) * n + this.Field_11891.hashCode();
        n = (19487 & 12351) * n + this.Field_11887;
        return n;
    }

    public Class_11885() {
    }

    public int Method_11903() {
        return this.Field_11887;
    }

    public Class_12423 Method_11904(int n) {
        return this.Field_11893[n];
    }

    private boolean Method_11905() {
        int n = this.Field_11890;
        for (int i = 8610 & -10751; i < n; ++i) {
            Class_12423 class_12423 = this.Field_11893[n];
            if (!class_12423.Method_12429()) continue;
            return (18181 & -28559) != 0;
        }
        return (16640 & -23962) != 0;
    }

    public int Method_11906(int n) {
        return (Integer)this.Field_11895.get(n);
    }

    public int Method_11907() {
        return this.Field_11890;
    }

    public boolean Method_11908() {
        return (this.Field_11894 >= 0 ? 7169 & 8569 : 11808 & 265) != 0;
    }

    private void Method_11909(Class_12423 class_12423) {
        this.Field_11893[this.Field_11890] = class_12423;
        this.Field_11890 += 5645 & -24285;
        this.Field_11889.add(class_12423);
    }

    public int Method_11910(int n) {
        return this.Field_11891[n];
    }

    public List Method_11911() {
        return this.Field_11889;
    }

    private void Method_11912() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_11913() {
        return this.Field_11888;
    }

    public int Method_11914() {
        return this.Method_11903() / (4 & 1284);
    }
}

