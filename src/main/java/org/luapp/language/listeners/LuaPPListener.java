package org.luapp.language.listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.luapp.language.Luapp;
import org.luapp.language.Main;
import org.luapp.language.loader.ListenerManager;

public abstract class LuaPPListener {

    // The Target Event/Context.
    public int target;
    public boolean ignoreCheck = false;
    public ListenerManager listenerManager;

    public void setListenerManager(ListenerManager listenerManager) {
        this.listenerManager = listenerManager;
        this.onSetManager();
    }

    public void onSetManager(){}

    public void setTarget(int target) {
        this.target = target;
    }

    public int getTarget() {
        return target;
    }

    public boolean isCorrectContext(ParserRuleContext context){
        return context.getRuleIndex() == this.target;
    }

    public void handleEnterContext(ParserRuleContext context){
        if (this.ignoreCheck) {onEnterContext(context);return;}
        if (isCorrectContext(context)) onEnterContext(context);
    }

    public void handleExitContext(ParserRuleContext context){
        if (this.ignoreCheck) {onExitContext(context); return;}
        if (isCorrectContext(context)) onExitContext(context);
    }

    public Luapp getLuaPP(){
        return Main.luaPPInstance;
    }

    public void addToLuaPPResult(String result){

        this.getLuaPP().currentResult += "\n" + result;
    }

    /**
     * Handles the time it enters the context.
     * @param enterContext The actual context.
     */
    public abstract void onEnterContext(ParserRuleContext enterContext);

    /**
     * Handles the time it exists the context
     * @param exitContext The actual context.
     */
    public abstract void onExitContext(ParserRuleContext exitContext);
}
