package com.comitialsign.note.repositories;

import com.comitialsign.note.domain.note.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
