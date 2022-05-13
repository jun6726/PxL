package com.pxl.todolist_spring.ToDoItem;

import lombok.*;

@Getter @Setter
@Builder
public class ToDoItemRequest {

    private String id;
    private String title;
    private boolean isDone;

}