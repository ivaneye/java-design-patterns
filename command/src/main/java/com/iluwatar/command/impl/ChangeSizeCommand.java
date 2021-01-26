package com.iluwatar.command.impl;

import com.iluwatar.command.real.Target;
import com.iluwatar.command.frame.Command;

/**
 * @author ivaneye
 * @since 2021-01-26 15:52:32
 */
public class ChangeSizeCommand implements Command {

    private Target target;

    public ChangeSizeCommand(Target target) {
        this.target = target;
    }

    @Override
    public void exec() {
        target.changeSize();
    }
}
