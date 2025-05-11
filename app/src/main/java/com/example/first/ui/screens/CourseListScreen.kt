package com.example.first.ui.screens


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.first.model.Course
import com.example.first.ui.components.CourseCard

@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}
