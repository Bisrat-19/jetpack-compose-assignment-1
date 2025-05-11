package com.example.first.data

import com.example.first.model.Course

val sampleCourses = listOf(
    Course(
        title = "Introduction to Computer Science",
        code = "CS101",
        creditHours = 3,
        description = "Basic principles of computer science.",
        prerequisites = "None"
    ),
    Course(
        title = "Data Structures",
        code = "CS201",
        creditHours = 4,
        description = "Study of lists, trees, graphs, and algorithms.",
        prerequisites = "CS101"
    ),
    Course(
        title = "Operating Systems",
        code = "CS301",
        creditHours = 3,
        description = "Concepts of processes, memory, and file management.",
        prerequisites = "CS201"
    )
)
