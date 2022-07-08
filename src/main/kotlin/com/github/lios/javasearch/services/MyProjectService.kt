package com.github.lios.javasearch.services

import com.intellij.openapi.project.Project
import com.github.lios.javasearch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
