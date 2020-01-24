/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.cef.browser.CefBrowser
 *  org.cef.browser.CefFrame
 *  org.cef.callback.CefQueryCallback
 *  org.cef.handler.CefMessageRouterHandlerAdapter
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.CefMessageRouterHandlerAdapter;

public class Class_42197
extends CefMessageRouterHandlerAdapter {
    public static HashMap Field_42198 = new HashMap();

    private void Method_42199() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_42200(CefBrowser cefBrowser, CefFrame cefFrame, long l, String string, boolean bl, CefQueryCallback cefQueryCallback) {
        Class_29900 class_29900 = Class_30724.Method_30746();
        class_29900.Method_29913(l);
        class_29900.Method_29980(bl);
        class_29900.Method_29960(string);
        HashMap hashMap = Field_42198;
        synchronized (hashMap) {
            Field_42198.put(l, cefQueryCallback);
        }
        Class_30724.Method_30742("q", class_29900);
        return (4141 & 25345) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_42201(CefBrowser cefBrowser, CefFrame cefFrame, long l) {
        Object object = Field_42198;
        synchronized (object) {
            Field_42198.remove(l);
        }
        object = Class_30724.Method_30746();
        ((Class_29900)object).Method_29913(l);
        Class_30724.Method_30742("x", (Class_29900)object);
    }
}

