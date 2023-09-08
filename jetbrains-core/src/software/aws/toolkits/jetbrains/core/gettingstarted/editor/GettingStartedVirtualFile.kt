// Copyright 2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

package software.aws.toolkits.jetbrains.core.gettingstarted.editor

import com.intellij.testFramework.LightVirtualFile
import software.aws.toolkits.resources.message

class GettingStartedVirtualFile : LightVirtualFile(message("gettingstarted.editor.title")) {
    override fun toString() = getName()
    override fun getPath() = getName()
    override fun isWritable() = false
    override fun isDirectory() = false
}