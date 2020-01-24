/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.cef.CefSettings
 *  org.cef.CefSettings$LogSeverity
 *  org.cef.browser.CefBrowser
 *  org.cef.browser.CefFrame
 *  org.cef.handler.CefDisplayHandler
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.cef.CefSettings;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefDisplayHandler;

public class Class_36669
implements CefDisplayHandler {
    public boolean Method_36670(CefBrowser cefBrowser, String string) {
        return (129 & 8518) != 0;
    }

    public void Method_36671(CefBrowser cefBrowser, CefFrame cefFrame, String string) {
        Class_29900 class_29900 = Class_30724.Method_30746();
        class_29900.Method_29960(string);
        Class_30724.Method_30742("u", class_29900);
    }

    public void Method_36672(CefBrowser cefBrowser, String string) {
    }

    public void Method_36673(CefBrowser cefBrowser, String string) {
    }

    public boolean Method_36674(CefBrowser cefBrowser, CefSettings.LogSeverity logSeverity, String string, String string2, int n) {
        return (-8439 & 129) != 0;
    }

    private void Method_36675() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

