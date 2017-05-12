/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.execution.dashboard.actions;

import com.intellij.execution.ExecutionBundle;
import com.intellij.execution.Executor;
import com.intellij.execution.executors.DefaultRunExecutor;
import com.intellij.icons.AllIcons;

import javax.swing.*;

/**
 * @author konstantin.aleev
 */
public class RunAction extends ExecutorAction {
  public RunAction() {
    super(ExecutionBundle.message("run.dashboard.run.action.name"),
          ExecutionBundle.message("run.dashboard.run.action.description"),
          AllIcons.Toolwindows.ToolWindowRun);
  }

  @Override
  protected Executor getExecutor() {
    return DefaultRunExecutor.getRunExecutorInstance();
  }

  @Override
  protected Icon getIcon(boolean running) {
    return running ? AllIcons.Actions.Restart : AllIcons.Toolwindows.ToolWindowRun;
  }
}
