/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_21439
extends Class_20457 {
    final Class_25167 Field_21440;
    final String Field_21441 = "Pobieranie najnowszego klienta! %.1f%%\nETA: %02d:%02d:%02d\nSzybkosc: %.1f kB/s";
    long Field_21442;
    final Class_18 Field_21443;
    int Field_21444;
    final Class_23208 Field_21445;
    long Field_21446;
    long Field_21447;

    private void Method_21448() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21449(long l) {
        long l2 = System.currentTimeMillis();
        if (l2 - this.Field_21446 > (1099359802L & -1100320081812848461L)) {
            long l3 = l2 - this.Field_21447;
            double d = (double)l / ((double)l3 / (0.7843137254901961 * 1275.0));
            long l4 = this.Field_21442 - l;
            double d2 = (double)l4 / d;
            l3 = (long)d2;
            long l5 = l3 % (37750908L & -7986171214034223042L);
            long l6 = (l3 /= 134238782L & 8612501808322062396L) % (7564973169660930108L & -7564973169904777602L);
            Object[] arrobject = new Object[21 & -4089];
            arrobject[2085 & 4296] = (double)l * (90.32258064516128 * 1.1071428571428572) / (double)this.Field_21442;
            arrobject[-24575 & 2309] = l3 /= 538755388L & 339740796L;
            arrobject[4131 & 25354] = l6;
            arrobject[343 & -28541] = l5;
            arrobject[8756 & -16050] = d / (1005.0370370370371 * 1.0188679245283019);
            this.Field_21445.Method_23221(String.format("Pobieranie najnowszego klienta! %.1f%%\nETA: %02d:%02d:%02d\nSzybkosc: %.1f kB/s", arrobject));
            this.Field_21446 = l2;
        }
    }

    public void Method_21450() {
        this.Field_21446 = this.Field_21447 = System.currentTimeMillis();
    }

    public void Method_21451(Throwable throwable) {
        this.Field_21445.Method_23221("\u00a74B\u0142\u0105d przy automatycznej aktualizacji paczki! " + throwable);
        this.Field_21444 += 5 & 2569;
        if (this.Field_21444 > (16387 & 4947)) {
            throwable.printStackTrace();
            Class_41092.Method_41096(this.Field_21445, throwable + "");
        }
    }

    public void Method_21452() {
        if (this.Field_21444 < (-23932 & 16455)) {
            this.Field_21445.Method_23221("Rozpoczynam proces aktualizacji... 90%");
        }
    }

    public void Method_21453(Class_19123 class_19123) {
        new Class_6243(this, class_19123).start();
    }

    public void Method_21454(int n) {
        Class_41092.Method_41096(this.Field_21445, "http err " + n);
    }

    Class_21439(Class_25167 class_25167, Class_18 class_18, Class_23208 class_23208) {
        this.Field_21440 = class_25167;
        this.Field_21443 = class_18;
        this.Field_21445 = class_23208;
        this.Field_21441 = "Pobieranie najnowszego klienta! %.1f%%\nETA: %02d:%02d:%02d\nSzybkosc: %.1f kB/s";
        this.Field_21447 = -5356074893257284604L & 313262227L;
        this.Field_21446 = 5049938053901582432L & -5049938054747946998L;
        this.Field_21442 = this.Field_21440.Field_25172;
        this.Field_21444 = 528 & 2;
    }
}

