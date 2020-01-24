/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_43683
extends Class_40196 {
    private Class_31877 Field_43684;
    private Class_35822 Field_43685;

    public void Method_43686(Class_39158 class_39158) {
        this.Field_43685.Method_35825(class_39158);
    }

    public void Method_43687(Class_39158 class_39158, Object object) {
        this.Field_43685.Method_35823(class_39158, object);
    }

    public void Method_43688(Class_39158 class_39158, Object object, Class_37748 class_37748) {
        this.Field_43684.Method_31881(class_39158, object, class_37748);
    }

    public void Method_43689(Class_39158 class_39158, Class_37748 class_37748) {
        this.Field_43684.Method_31879(class_39158, class_37748);
    }

    public void Method_43690(Class_39158 class_39158) {
        this.Field_43684.Method_31882(class_39158);
    }

    public void Method_43691(Class_39158 class_39158) {
        this.Field_43685.Method_35827(class_39158);
    }

    public void Method_43692(Class_39158 class_39158) {
        try {
            this.Field_43685.handlerRemoved(class_39158);
        }
        finally {
            this.Field_43684.handlerRemoved(class_39158);
        }
    }

    public void Method_43693(Class_39158 class_39158, SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        this.Field_43684.Method_31880(class_39158, socketAddress, socketAddress2, class_37748);
    }

    public void Method_43694(Class_39158 class_39158, SocketAddress socketAddress, Class_37748 class_37748) {
        this.Field_43684.Method_31883(class_39158, socketAddress, class_37748);
    }

    public void Method_43695(Class_39158 class_39158) {
        this.Field_43684.Method_31884(class_39158);
    }

    public void Method_43696(Class_39158 class_39158, Throwable throwable) {
        this.Field_43685.Method_35826(class_39158, throwable);
    }

    public void Method_43697(Class_39158 class_39158) {
        this.Field_43685.Method_35828(class_39158);
    }

    private void Method_43698(Class_35822 class_35822, Class_31877 class_31877) {
        if (this.Field_43685 != null) {
            throw new IllegalStateException("init() can not be invoked if " + Class_43683.class.getSimpleName() + " was constructed with non-default constructor.");
        }
        if (class_35822 == null) {
            throw new NullPointerException("inboundHandler");
        }
        if (class_31877 == null) {
            throw new NullPointerException("outboundHandler");
        }
        if (class_35822 instanceof Class_31877) {
            throw new IllegalArgumentException("inboundHandler must not implement " + Class_31877.class.getSimpleName() + " to get combined.");
        }
        if (class_31877 instanceof Class_35822) {
            throw new IllegalArgumentException("outboundHandler must not implement " + Class_35822.class.getSimpleName() + " to get combined.");
        }
    }

    protected final void Method_43699(Class_35822 class_35822, Class_31877 class_31877) {
        this.Method_43698(class_35822, class_31877);
        this.Field_43685 = class_35822;
        this.Field_43684 = class_31877;
    }

    public void Method_43700(Class_39158 class_39158) {
        this.Field_43685.Method_35824(class_39158);
    }

    public void Method_43701(Class_39158 class_39158) {
        this.Field_43685.Method_35830(class_39158);
    }

    public void Method_43702(Class_39158 class_39158, Object object) {
        this.Field_43685.Method_35831(class_39158, object);
    }

    protected Class_43683() {
    }

    public void Method_43703(Class_39158 class_39158) {
        this.Field_43685.Method_35829(class_39158);
    }

    public void Method_43704(Class_39158 class_39158) {
        if (this.Field_43685 == null) {
            throw new IllegalStateException("init() must be invoked before being added to a " + Class_6274.class.getSimpleName() + " if " + Class_43683.class.getSimpleName() + " was constructed with the default constructor.");
        }
        try {
            this.Field_43685.handlerAdded(class_39158);
        }
        finally {
            this.Field_43684.handlerAdded(class_39158);
        }
    }

    public void Method_43705(Class_39158 class_39158, Class_37748 class_37748) {
        this.Field_43684.Method_31878(class_39158, class_37748);
    }

    private void Method_43706() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

