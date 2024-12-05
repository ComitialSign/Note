package com.comitialsign.note.dtos;

import com.comitialsign.note.domain.note.Note;

import java.util.List;

public record UserDto(String username, String Password, String email, List<Note> notes) {
}
