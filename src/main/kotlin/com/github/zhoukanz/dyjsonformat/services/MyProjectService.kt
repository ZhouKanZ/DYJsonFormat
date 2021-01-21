package com.github.zhoukanz.dyjsonformat.services

import com.github.zhoukanz.dyjsonformat.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
